**Simple URL Reader project satisfies the following requirements:**

This assignment is designed to give you experience with object reuse by employing inheritance to extend and modify the behavior of Java classes and will help you to deepen your knowledge of version control systems. You will use the SimpleURLReader class from the cs1 package. Create your lab02 project, then download this cs1 package (right-click and save it) to a convenient location on your local machine (e.g. the folder you are using for this lab assignment.) You now need to add this to your project's classpath so Java can find and use it. If you are using Visual Studio Code, you can check this video for adding the jar files.

Note that, to complete the assignment, you do not need to know how the SimpleURLReader class works, just treat it like you have been doing with other Java classes. One of the key points of this lab is to demonstrate that you can add to and modify the behavior of an existing class, even without having its source code. Now that is neat!

Before starting the lab, go to GitHub by using your account and open a private repository called CS102_lab02. Whenever you are done with one of the following parts of the lab you will need to add all of your changes, commit them, and push them to your private and remote repository. Make sure that your repository is indeed private because if it is not then anyone on the web will be able to copy your homework, which will get you into trouble. For every part of the lab, you should have at least one commit that has a clear message of what was implemented in that commit and for which part.

a) Write a test program that will read the contents of "http://www.cs.bilkent.edu.tr/~ozturk/cs102/housman.txt" and print it and the number of lines it contains, on the console. To read the contents of a url you can use the SimpleURLReader class (see above!) Its constructor takes the desired url as a String, for example "http://www.cs.bilkent.edu.tr/~ozturk/cs102/housman.txt". The class has only two methods: getPageContents() that returns the contents of the url (the webpage) as a String, and getLineCount() that returns an int corresponding to the number of lines read from the url.

b) Design, implement and test a new class, MySimpleURLReader, that extends the SimpleURLReader class, adding two methods to it: getURL() that returns the url String used to create the SimpleURLReader object, and getName() that returns the filename part of the url, that is, the part of the url following the last '/' character ("housman.txt" in the previous example).

c) In HTML, developers can easily add css files to the pages, so that the page looks good. You can read about css files here. We are not interested in inline styling in this homework, only the external ones. External css files are like libraries in java, you also need to import them somewhere in html so that whatever styles that are written there can be applied to the current html page. External css files are included the following way:
<link rel="stylesheet" href="some_file.css"> You need to implement a function in MySimpleURLReader that is called getNumberOfCSSLinks(), that will go to the link that was passed to MySimpleURLReader when it was created and count all the file names that represent .css files. This function needs to return the number of CSS files found on the website. To implement this method you first need to get the content of the url, then get all the <link> tags from the html, and then count the .css files in them.

d) A customer wants to be able to print the contents of (an html version of the original plain text) and have it appear as in the part (b) without any of the html code in it! Clearly, it is necessary to read the contents of the url and then filter out the html code so that only the visible text is left. Rather than writing an entirely new class from scratch, you realise that the MySimpleURLReader class does most of what you want and so decide to use it. Design, implement & test a new class, HTMLFilteredReader, that extends MySimpleURLReader. Its getPageContents() method should return only the text, without the html. A new method, getUnfilteredPageContents() can be called to return the original page complete with html codes. Assume that anything between "<" and ">" is html code and should be omitted from the filtered output.

e) You are asked to design and implement a class for the wordSearch program. (You should decide how to design class hierarchy and how to use previous classes). WordSearch program takes the text and search for a set of given words in this text. In this problem, your job is to take html link, filter the html tags and get the text. Don't forget to remove the HTML Punctuation entities from the filtered text. Then search the set of given words and display the found word and place of the word in the text. For ease, you are asked to search only forward, no diagonal, up, or down search is required.

f) Create a class called Test with a main method in it. Here you are going to test parts a, b, c and d of this lab. Before starting to test any part of the homework make sure to comment in this format: // PART A. Testing MySimpleURLReader
For part b:

Instantiate MySimpleURLReader with link: http://www.cs.bilkent.edu.tr/~ozturk/cs102/scrapethissite.html (or https://scrape-website.web.app or https://scrapethissite.com/pages/simple/)
Print the result to the call of the getURL() method from the instance
For part c:
Use the instance of MySimpleURLReader for part a and call getNumberOfCSSLinks() method for the link that you used for part b.
Print the count of CSS files in the link provided in part a
For part d:
Instantiate HTMLFilteredReader with the link: http://www.cs.bilkent.edu.tr/~ozturk/cs102/scrapethissite.html (or https://scrape-website.web.app or https://scrapethissite.com/pages/simple/) ;
Print the result to the call of the getPageContents() method. You should get names of countries.
For part e:
Instantiate your WordSearch class with http://www.cs.bilkent.edu.tr/~ozturk/cs102/scrapethissite.html (or https://scrape-website.web.app or https://scrapethissite.com/pages/simple/)
Print locations of words: Turkey and Ankara.
For Git and GitHub part of the lab:
Go to your GitHub CS102_lab02 account
Take a screenshot of the page where it shows all of your commits to the repository
Rename the screenshot to my_commits.jpeg and upload them in the zip with your project files
g) (Optional) This part of the assignment is very simple, optional and is assigned to make your lives' as developers easier in the future. Most of you have been probably using Doctor Java until now, which is very outdated as most of you have probably noticed. Therefore, for those of you who are interested should install an IDE to increase their productivity as a programmer. IDEs are good because they let write your code, run your code, debug your code, and build executables very easily. One of the best IDE providers in the world is JetBrains. They have an IDE for java development called Intellij. You can find everything you need about it here. Since you are a student you can use this IDE for free. You can use your GitHub Student developer packs to prove that you are a student.
