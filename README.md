Jersey Tutorial
===============
What you need
-------------
Windows machine, Eclipse, Jersey 2.6, Embedded Tomcat 8

Where to get
------------
Jersey

- Download Tomcat 8 embedded apache-tomcat-8.0.8-embed.zip from https://tomcat.apache.org/download-80.cgi

Jersey 2.6
Downloading jersey jars using maven. Open command prompt
- mvn archetype:generate "-DarchetypeGroupId=org.glassfish.jersey.archetypes"  "-DarchetypeArtifactId=jersey-quickstart-webapp" "-DarchetypeVersion=2.6" "-DgroupId=com.example" "-Dpackage=com.example" "-Dversion=1.0" "-DinteractiveMode=false" "-DartifactId=jersey-basic-2.6"
- Get into the created folder and issue mvn dependency:copy-dependencies
- All the jars can be found in target\dependency

Set up Eclipse
--------------
Start new Java project
Add all the jar from previous step to the build path
Import all source code from src/
Create web.xml in WebContent/WEB-INF

Verify output
-------------
Open browser and hit http://localhost:8080/tomcatembedded/resourceloader/helloworld