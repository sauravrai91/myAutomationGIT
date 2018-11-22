set projectLocation=D:\Tech\GITRepository\MyAutomation
cd %projectLocation%
set classpath=%projectLocation%\target\classes\myAutomationFramework;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml
pause