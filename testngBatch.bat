set projectLocation=C:\Users\user\IdeaProjects\FFMAutomationFramework
cd %projectLocation%
set classpath=%projectLocation%\out;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml
pause