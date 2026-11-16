package com.example;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FeedbackServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Read form input parameters
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String feedbackType = request.getParameter("feedbackType");
        String comments = request.getParameter("comments");

        // Format current timestamp
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy - hh:mm:ss a");
        String currentDateTime = now.format(formatter);

        // Set response content type
        response.setContentType("text/html;charset=UTF-8");

        // Write HTML response
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html lang=\"en\">");
        out.println("<head>");
        out.println("    <meta charset=\"UTF-8\">");
        out.println("    <title>Feedback Submission Acknowledgment</title>");
        out.println("    <style>");
        out.println("        body { font-family: Arial, sans-serif; background: #f4f6f9; padding: 40px 20px; display: flex; justify-content: center; }");
        out.println("        .card { background: white; border-radius: 8px; box-shadow: 0 4px 12px rgba(0,0,0,0.1); padding: 30px; max-width: 520px; width: 100%; }");
        out.println("        h2 { color: #27ae60; margin-top: 0; border-bottom: 2px solid #27ae60; padding-bottom: 10px; }");
        out.println("        .info-row { margin: 14px 0; font-size: 15px; color: #333; }");
        out.println("        .label { font-weight: bold; color: #555; }");
        out.println("        .comments-box { background: #f8f9fa; border-left: 4px solid #3498db; padding: 12px; margin-top: 8px; border-radius: 4px; font-style: italic; }");
        out.println("        .timestamp { font-size: 13px; color: #7f8c8d; margin-top: 20px; text-align: right; border-top: 1px solid #ecf0f1; padding-top: 10px; }");
        out.println("        .back-link { display: inline-block; margin-top: 15px; text-decoration: none; color: #3498db; font-weight: bold; }");
        out.println("        .back-link:hover { text-decoration: underline; }");
        out.println("    </style>");
        out.println("</head>");
        out.println("<body>");
        out.println("    <div class=\"card\">");
        out.println("        <h2>Feedback Received!</h2>");
        out.println("        <p style=\"font-size: 18px; color: #2c3e50; font-weight: bold;\">Thank you, " + (name != null ? name : "User") + " for your feedback!</p>");
        out.println("        <div class=\"info-row\"><span class=\"label\">Email:</span> " + (email != null ? email : "N/A") + "</div>");
        out.println("        <div class=\"info-row\"><span class=\"label\">Feedback Type:</span> " + (feedbackType != null ? feedbackType : "N/A") + "</div>");
        out.println("        <div class=\"info-row\"><span class=\"label\">Comments:</span>");
        out.println("            <div class=\"comments-box\">" + (comments != null ? comments.replace("\n", "<br>") : "") + "</div>");
        out.println("        </div>");
        out.println("        <div class=\"timestamp\">Submitted on: " + currentDateTime + "</div>");
        out.println("        <a href=\"feedback.html\" class=\"back-link\">&larr; Submit Another Feedback</a>");
        out.println("    </div>");
        out.println("</body>");
        out.println("</html>");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("feedback.html");
    }
}
