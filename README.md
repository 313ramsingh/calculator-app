## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

ON RUNNING THIS APPLICATION UNDER TEST CASES:

INPUT
System.out.println(calculator.add(""));  
System.out.println(calculator.add("1")); 
System.out.println(calculator.add("1,5,3,7,9,0,1"));  
System.out.println(calculator.add("1\n2,3")); 
System.out.println(calculator.add("//;\n1;2"));
System.out.println(calculator.add("1,-2,3"));

OUTPUT
0
1
26
6
3
Exception in thread "main" java.lang.IllegalArgumentException: Negative numbers not allowed: [-2]
at DefaultSumCalculator.sum(DefaultSumCalculator.java:19)
at StringCalculator.add(StringCalculator.java:20)
at Main.main(Main.java:9)
