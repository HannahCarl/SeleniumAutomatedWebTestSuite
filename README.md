**Wolfram SDET Challenge - Hannah Carl**

## Browser Platform

1. Currently the driver supports the Chrome browser, but includes code for Firefox as well.
2.  Open the driver. java file (src/com/wolfram/sdetchallenge/main)
3. Uncomment the lines marked by "//firefox", as well as, commenting the lines marked by "//chrome".

---

## To run automated tests

1. Import project into Java IDE.
2. Link required libraries (Testng) and download/install them if necessary.
3. Locate the directory of chromeDriver if using Chrome, or download if necessary.
4. Replace Line 17 of Driver.java with the correct directory of the chromeDriver.

---

## To add test cases

1. Open testng.xml file (src/com/wolfram/sdetchallenge/main)
2. Add test cases to the bottom of the file, following the same format as the others.
3. You can also just add additional cases to a specific test by adding new parameters to a test and specifying the value.

---

## To view test results

1. Locate the 'test-output' folder in the directory.
2. Open the emailable-report.html to view results from test.
3. Additional testing reports will be located in this directory.

---

