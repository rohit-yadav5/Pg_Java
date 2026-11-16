# Module 5 - Java Server Technologies (Servlet Web Application)

This folder contains the complete implementation for **Module 5** (Practical Home Assignment) of the MCA Core Java class: a full Java Servlet web application named **FeedbackApp** using HTML, Java Servlet, and the `web.xml` deployment descriptor.

---

## 📂 Directory Structure

```text
Module-5/
├── README.md
└── FeedbackApp/
    ├── build.bat                 # One-click compilation and WAR packaging script
    ├── web/
    │   ├── feedback.html         # User feedback form
    │   └── WEB-INF/
    │       └── web.xml           # Servlet mapping configuration
    ├── src/
    │   └── com/
    │       └── example/
    │           └── FeedbackServlet.java  # HTTP POST request processor
    └── lib/
        └── javax.servlet-api.jar # Servlet API dependency library
```

---

## 📋 Component Index & Implementation Details

| S.No. | Component / File | Key Identifiers | Description | Concepts Covered |
| :--- | :--- | :--- | :--- | :--- |
| 1 | [feedback.html](FeedbackApp/web/feedback.html) | `<form action="submitFeedback" method="POST">` | Web form capturing user Name, Email, Feedback Type (Complaint, Suggestion, Compliment), and Comments. | HTML5 form validation, input elements, HTTP POST transmission. |
| 2 | [FeedbackServlet.java](FeedbackApp/src/com/example/FeedbackServlet.java) | [FeedbackServlet](FeedbackApp/src/com/example/FeedbackServlet.java#L12) | Processes feedback submission via `doPost()`, extracts parameters via `request.getParameter()`, and generates dynamic HTML acknowledgment with timestamp. | Java Servlets, `HttpServlet`, `HttpServletRequest`, `HttpServletResponse`, `PrintWriter`, `LocalDateTime`. |
| 3 | [web.xml](FeedbackApp/web/WEB-INF/web.xml) | `<servlet-name>FeedbackServlet</servlet-name>` | Deployment descriptor configuring servlet registration and URL pattern mapping to `/submitFeedback`. | Web application deployment descriptor, URL routing, servlet configuration. |

---

## 🛠️ How to Compile, Package & Run

### Method 1: Using the Automated Build Script (Windows)
1. Double-click [build.bat](FeedbackApp/build.bat) inside the `FeedbackApp` directory.
2. It compiles the servlet and packages `FeedbackApp.war` automatically.

### Method 2: Manual Terminal Commands
```bash
cd FeedbackApp

# 1. Compile Servlet against the bundled library
javac -cp "lib/javax.servlet-api.jar" -d "web/WEB-INF/classes" src/com/example/FeedbackServlet.java

# 2. Package into a Web Application Archive (WAR)
cd web
jar -cvf ..\FeedbackApp.war *
cd ..
```

### Deploying to Apache Tomcat
1. Copy the generated `FeedbackApp.war` (or the `FeedbackApp` folder) into Tomcat's `webapps/` directory.
2. Start Tomcat (`bin\startup.bat` on Windows or `bin/startup.sh` on macOS/Linux).
3. Open your browser and navigate to:
   ```
   http://localhost:8080/FeedbackApp/feedback.html
   ```

---
*For repository-wide overview and guides, refer to the root [README.md](../README.md).*
