
# Welcome!

This Java template helps you at starting smoothly with a very basic working example. This template is also available on [GitHub](), feedback and pull requests are very welcome, please don't hesitate to contribute to make it better.

If it is your first contribution then you probably should have a look on the [Getting Started](https://gettingstarted) document.

## Template Resources
[techio.yml](https://github.com): this template configuration file
```markdown
title : My First Playground
plan:
  - title: Welcome
    statement: markdowns/welcome.md
#  - title: Another Page
#    statement: markdowns/another-page.md
projects:
  java:
    root: java-project
    runner: techio/java-maven3-junit4-runner:1.1.3-java-8
```

[java-project](https://github.com): a simple Java + Maven + JUnit project dedicated to the programming task below

[markdowns/welcome.md](https://github.com): the markdown file which displays the content you are reading right here

# A Java Programming Example

The puropose of the example below is to show how users can interact with your content. Here the solution is validated against a test case when the user runs the program. Try it!

@[Returns the sum of elements in an array of integers.]({"stubs": ["src/main/java/com/yourself/Sum.java"], "command": "com.yourself.SumTest#test"})

# Visual and Interactive Content

Tech.io provides all the tools to embed dynamic and interactive content like a Web apps or a Unix terminal. Please refer to the [official documentation]() or git clone public projects!