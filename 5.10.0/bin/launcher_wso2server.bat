@echo off
if "%JAVA_HOME%"=="" set JAVA_HOME="%~sdp0..\jdk\jdk-11.0.5"
"%~sdp0wso2server.bat"
