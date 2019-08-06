package com.tieto.geekoff.warmup;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Servlet")
public class HelloWorld extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userInputValue=getParameterValueFromRequest(Config.URL_PARAMETER_USER_NAME,request);
        writeDataToFile(userInputValue);
        this.doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String dataFromFile=readDataFromFile();
        request.setAttribute(Config.URL_PARAMETER_USER_NAME,dataFromFile);
        serveHelloWorldJspPage(request,response);
    }

    private static void serveHelloWorldJspPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getServletContext().getRequestDispatcher(Config.JSP_PAGE_HELLOWORLD).forward(request, response);
    }

    private static String getParameterValueFromRequest(String parameterName,HttpServletRequest request){
        String parameterValue=(String) request.getParameter(parameterName);
        if (parameterValue == null){
            parameterValue= Config.ERROR_MESSAGE_PARAMETER_NOT_FOUND;
        }
        return parameterValue;
    }

    private static String readDataFromFile() throws IOException {
        String dataFromFile = FileDriver.readFromFile(Config.TEXT_FILE_PATH);
        if (dataFromFile.isEmpty()){
            dataFromFile= Config.ERROR_MESSAGE_FILE_CONTENT_IS_EMPTY;
        }
        return dataFromFile;
    }

    private static void writeDataToFile(String userInput) throws IOException {
        FileDriver.writeToFile(userInput,Config.TEXT_FILE_PATH,true);
    }
}
