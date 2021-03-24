# factorial
This is the repository to storage the factorial automation cucumber frramework

## About the project
This Project was created to test Equivalence and limits of the Factorial App locted in PythonAnywhere

## Build with:
The Project was created in Eclipse
Is a Java based framework using Cucumber and Selenium

## instalation

* First we need Install Java

```Version Used 1.8.0_231```

Java Version To Use: JDK 8u231

https://www.oracle.com/technetwork/es/java/javase/downloads/jdk8-downloads-2133151.html?printOnly=1


![image](https://user-images.githubusercontent.com/81269394/112241527-c95ba280-8c20-11eb-8f86-70d1c8882925.png)

* Set Env Variables

Here is a Tutorial for the installation of the System Environmental Variables:

https://www.mkyong.com/java/how-to-set-java_home-on-windows-10/

* Get Eclipse 
 
```I Used Version: Oxygen.3a Release (4.7.3a)```

Eclipse Version to be used is the Oxygen: Version: Oxygen.3a Release (4.7.3a)

Source: https://www.eclipse.org/downloads/packages/release/oxygen/3a


Steps:

	• Download The File
	• Extract the Zip in a location easy to access ( I Used Desktop)
	• Open the Folder 
	• Right Click over the file Eclipse.Exe
	• Select Sent to > Desktop ( New Shortcut will be created)

With this we can access easy to the Program from the desktop 
![image](https://user-images.githubusercontent.com/81269394/112241713-150e4c00-8c21-11eb-8947-5a2d64826c0c.png)

Install Cucumber and NAtura From Eclipse Marketplace you go to Help>Eclipse MarketPlace
Search Cucumber and install the 2 components displayed:

![image](https://user-images.githubusercontent.com/81269394/112243342-c7dfa980-8c23-11eb-8823-caf1d4083448.png)

 
 * Then Import the project through GIT
 * Then go to Project> Clean
 * Then Click on the Project, Right Click> Maven> Update Project 
 * ![image](https://user-images.githubusercontent.com/81269394/112242366-18ee9e00-8c22-11eb-8a4a-0ae0128dec20.png)
 * Mark Checkbox Force Update of Snapshots

## Description

The Cucumber Framework is based in 4 main file

FactorialEquivalence.Feature that contain the feauture tests, include  Equivalence partition and boundary scenarios that would be tested in the Step Definition file

The Step Definition PAckage contains the FactorialEquivalence.java it contains all the definitions and call the location fo the selenium Elements from the page object

The Page Object Package Contains the locator elements in Factorial_HomePage for easy mantainance 

Main Runner that contains the configuration

## Linter to check the code

Using Eclipse Market place download  SonarLint

Then Execute the Analyze

![image](https://user-images.githubusercontent.com/81269394/112243512-14c38000-8c24-11eb-8576-c43779e33483.png)

## Run The Cucumber Tests
Go to The MainRunner.java file
Right Click and Run as a JUnit test

![image](https://user-images.githubusercontent.com/81269394/112252509-9969ca80-8c33-11eb-91d7-492c788b7672.png)


## Check Reports
Go to Target File in the Package Explorer and Open he location
You will find the latest HTML Report

![image](https://user-images.githubusercontent.com/81269394/112252531-a25a9c00-8c33-11eb-830d-928a409fbb98.png)


## Contact Info
Any Sugestion: Pedrosorto.91@gmail.com


