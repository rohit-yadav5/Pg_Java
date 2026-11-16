@echo off
setlocal
cd /d "%~dp0"

echo ============================================================
echo   FeedbackApp Packaging (Module 5 - Java Servlet)
echo ============================================================
echo.

:: Auto-detect JDK if not on PATH
where javac >nul 2>nul
if %errorlevel% neq 0 (
    if exist "C:\Program Files\Microsoft\jdk-17.0.21.21-hotspot\bin\javac.exe" (
        set "PATH=C:\Program Files\Microsoft\jdk-17.0.21.21-hotspot\bin;%PATH%"
    )
)

if not exist "web\WEB-INF\classes" mkdir "web\WEB-INF\classes"

echo Compiling FeedbackServlet.java...
javac -cp "lib/javax.servlet-api.jar" -d "web/WEB-INF/classes" src/com/example/FeedbackServlet.java

if %errorlevel% neq 0 (
    echo.
    echo [ERROR] Compilation failed!
    pause
    exit /b %errorlevel%
)

echo Packaging FeedbackApp.war...
cd web
jar -cvf ..\FeedbackApp.war *
cd ..

echo.
echo ============================================================
echo [SUCCESS] FeedbackApp.war created successfully!
echo.
echo Deployment Steps:
echo   1. Copy FeedbackApp.war into your Tomcat 'webapps\' directory.
echo   2. Start Tomcat by running 'bin\startup.bat'.
echo   3. In your web browser, open:
echo      http://localhost:8080/FeedbackApp/feedback.html
echo ============================================================
pause
