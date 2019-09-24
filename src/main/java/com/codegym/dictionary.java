package com.codegym;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class dictionary extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Map<String, String> dic = new HashMap<>();
        dic.put("cat", "con meo");
        dic.put("dog", "con cho");
        dic.put("dragon", "con rong");
        dic.put("cow", "con bo");
        dic.put("chicken", "con ga con");
        dic.put("pig", "con lon");
        dic.put("snake", "con ran");

        String search = req.getParameter("textInput");
        String result = dic.get(search);

        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        if (result != null) {
            writer.println("Word: " + search);
            writer.println("Result: " + result);
        } else {
            writer.println("Not found");
        }
        writer.println("</html>");
    }
}
