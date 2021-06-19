# Apple_Appium
All the codes of the Ios Appium testing  that is did in MAC OS Mojave

IOS Apps Automation Testing with Appium

Step 1: Download Appium Server (Client Server Architecture - Port 4723)

Step 2: Install Xcode to compile App on suitable iPhone/iPad - it compiles Th.e app differently for every iOS version
Iphone 12 -14.3
UiCatalog app - for Appium practice - download zip file
In that Zip file > Folder UIKitCatalog > File UIKitCtalog.xcodeproj > Compile in Xcode for different devices I.e. Open it in Xcode by double clicking it. > File UIKitCatalog.app inside in Product Folder > Run it on iPhone 11 pro max, it will automatically Compile it for iPhone 11 pro max. >Install Appium java clients dependencies (both repository and dependency and enter version in dependency) >Save the project (It’ll build itself) > Create a class > Enter the desired capabilities Appium Java Client and Selenium Java (so that it will send the code to Port 4723- where Appium is running and then Appium will take care of everything else)>Install Carthage in Terminal > “instruments -s devices”. Enter this command in terminal to get information about the devices that that your system support/have OR user Xcode to get those information > After the app file has been compiled (compilation is mandatory), open it in finder > And copy it at any place

https://appium.github.io/java-client/io/appium/java_client/ios/IOSDriver.html
