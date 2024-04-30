package com.assignments.pdfgenerator.generator;


import java.util.Arrays;
import java.util.List;

import com.assignments.pdfgenerator.mapper.DataMap;
import com.assignments.pdfgenerator.model.Invoice;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.thymeleaf.context.Context;
import org.thymeleaf.spring6.SpringTemplateEngine;
import com.assignments.pdfgenerator.Doc.DocGenerator;


@RestController
public class DemoDoc {

    @Autowired
    private DocGenerator documentGenerator;

    @Autowired
    private SpringTemplateEngine springTemplateEngine;

    @Autowired
    private DataMap dataMapper;

    @PostMapping(value = "/generate/document")
    public String generateDocument(@RequestBody String jsonData) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        Invoice[] invoiceArray = objectMapper.readValue(jsonData, Invoice[].class);
        List<Invoice> invoiceList = Arrays.asList(invoiceArray);

        String finalHtml = null;

        Context dataContext = dataMapper.setData(invoiceList);

        finalHtml = springTemplateEngine.process("invoice_template", dataContext);

        documentGenerator.htmlToPdf(finalHtml);

        return "Success";
    }
}