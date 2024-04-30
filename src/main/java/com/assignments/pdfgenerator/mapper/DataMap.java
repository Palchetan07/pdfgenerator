package com.assignments.pdfgenerator.mapper;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.assignments.pdfgenerator.model.Invoice;
import org.springframework.stereotype.Service;
import org.thymeleaf.context.Context;


@Service
public class DataMap {

    public Context setData(List<Invoice> invoiceList) {

        Context context = new Context();

        Map<String, Object> data = new HashMap<>();

        data.put("invoices", invoiceList);

        context.setVariables(data);

        return context;
    }
}