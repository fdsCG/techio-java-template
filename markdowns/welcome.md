
# About this Template

This template lets you get started quickly with a simple working example using Java, Maven and JUnit. If it is your first contribution then you should have a look at the [Getting Started]() document.


Sources are on [GitHub](https://github.com/fdsCG/techio-java-template), please don't hesitate to come up with proposals for improving it, pull requests are very welcomed.

# Java Exercise Demo

This example shows how a user interacts with your programming content.

@[Can you return the sum of elements in an array of integers?]({"stubs": ["src/main/java/com/yourself/Sum.java"], "command": "com.yourself.SumTest#test"})

To get more information about how to inject programming exercices please refer to the [documentation]().  

# Template Resources

`markdowns/welcome.md`  
The content you are reading right here is in this file. Tech.io is based on the [Markdown syntax](https://github.com/adam-p/markdown-here/wiki/Markdown-Cheatsheet) to render text, medias and to inject programming exercices.


`java-project`  
A simple Java + Maven + JUnit project dedicated to run the programming exercise upper. A project relies on a Docker image to be run according to the project requirements. You can use an official Docker image or build your own.


`techio.yml`  
This file is mandatory and its path must not be changed, it describes both the table of content and the programming projects.

# Visual and Interactive Content

Tech.io provides all the tools to embed dynamic and interactive content like a Web app or a Unix terminal. Please refer to the [documentation]() to go more in-depth about viewers integration.