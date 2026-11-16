@echo off
setlocal
cd /d "%~dp0"

echo ============================================================
echo   Employee Management System (Module 6 - Swing + JDBC)
echo ============================================================
echo.

:: Auto-detect JDK if not on PATH
where javac >nul 2>nul
if %errorlevel% neq 0 (
    if exist "C:\Program Files\Microsoft\jdk-17.0.21.21-hotspot\bin\javac.exe" (
        set "PATH=C:\Program Files\Microsoft\jdk-17.0.21.21-hotspot\bin;%PATH%"
    )
)

if not exist "bin" mkdir bin

echo Compiling Java source files...
javac -cp "lib/mysql-connector-java.jar" -d bin src/com/example/*.java

if %errorlevel% neq 0 (
    echo.
    echo [ERROR] Compilation failed! Ensure JDK 8+ or 17+ is installed.
    pause
    exit /b %errorlevel%
)

echo Compilation successful!
echo.
echo Launching Swing GUI...
echo (Note: Ensure MySQL server is running on localhost:3306 with database 'company_db')
echo.

java -cp "bin;lib/mysql-connector-java.jar" com.example.EmployeeForm
pause
