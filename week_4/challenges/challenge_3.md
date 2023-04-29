# Challenge 3: naming collisions

Create a small command line tool again. This tool is very simple, it only has 2 commands: `hello` and `time`. But
this time, you need to write the program with maven and spring. You will write an interface called `Command` which
has 1 method: `execute()`. In case of the hello command, on execution, it will print out: "Hello world". In case 
of the `time` command, it will print out: "Current time is: <the current time>". Now here is the challenge:
Spring allows for polymorphism, so in your spring context, you can create a bean from an interface. In this
challenge, you need to have a bean for both the commands so that when you run the program and type both commands
one after another, they both work.