# CompanyFootprint3
App prototype for HackDuke 2018
Created with team members from NC State and Duke University

Inspiration

When we go to the grocery store, we often don't think about the actions of companies that we are 
implicitly supporting by buying their products. With our app, we strive to make it easier to learn 
about the environmental and social impacts of corporations and make informed purchasing decisions.

What it does

With our app you simply upload a picture of a product's barcode, and we'll tell you how the manufacturer 
meets different environmental standards, like whether they test on animals, their total emissions, 
efforts to manage their carbon footprint, their philanthropic efforts, and more. Click on the back button, 
and you can see previous searches with ease! Click on the camera icon at the bottom right to upload another 
picture.

How it works

The app accesses photos and media from the phone. When a photo is selected, the app takes in the UPC 
code input from the barcode and connects the 12-number code to the manufacturer brand using the UPCitemdb 
API online. Information about the manufacturer, collected mostly using R, is then the output.

