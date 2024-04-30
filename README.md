# Dynamic PDF Generation ft. SpringBoot 

 A Spring Boot Application with REST API to generate PDF using Thymleaf template.\
Thymeleaf is a modern server-side Java template engine for web and standalone environments. 
In the context of Spring Boot, Thymeleaf is commonly used as the default template engine for generating dynamic HTML content in web applicationsand manipulate PDF documents.

### Features 
REST API to accept data and generate PDF documents.
Storage of generated PDFs on local storage for future retrieval.
### Requirements
Java Development Kit (JDK) version 8 or higher
Maven
Postman or Swagger for testing


### Request

`POST /generate/document`

 `POST` 'http://localhost:8080//generate/document' \
`Content-Type:` application/json' 
`template:` invoice_template'

### Body
```--data-raw 
{
"seller": "XYZ Pvt. Ltd.",
"sellerGstin": "29AABBCCDD121ZD", 
"sellerAddress": "New Delhi, India", 
"buyer": "Vedant Computers",
"buyerGstin": "29AABBCCDD131ZD",
"buyerAddress": "New Delhi, India", 
"items": [
{
"name": "Product 1", 
"quantity": "12 Nos", 
"rate": 123.00,
"amount": 1476.00
}
```
### Response

![image](https://github.com/Palchetan07/weatherinformation/assets/52150317/f93c6a69-27e6-44e8-9512-b708bf09f25b)

![image](https://github.com/Palchetan07/weatherinformation/assets/52150317/9a0a7e6f-fa31-4570-a8dd-b1aa133506d0)

###  PDF Content  

![image](https://github.com/Palchetan07/weatherinformation/assets/52150317/498550d4-b5d1-4fb3-b2ff-79a623fae003)
