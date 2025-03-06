
/*
 * Write a program to print your name.
 * 
 * 
 * Memory Areas in JVM
Method Area (MetaSpace in Java 8+)

Stores class metadata (class names, method names, field names).
Bytecode of the HelloWorld class is loaded here.
Stores static variables.
Heap Memory

Stores objects created at runtime.
In this case, no objects are created explicitly in HelloWorld, but the String object "Hello, World!" is stored in the String Pool (part of Heap).
Stack Memory

Stores method call frames (local variables, method parameters).
When main() is executed, a stack frame is created in the Stack memory.
The reference to the args array (String[] args) is stored here.
PC Register (Program Counter Register)

Holds the address of the currently executing instruction.
As the JVM executes each instruction, the PC register updates accordingly.
Native Method Stack

Stores native method calls (methods that interact with the OS, written in C/C++).
Not used in the "Hello, World!" program.
Step-by-Step Memory Allocation in "Hello, World!"
Class Loading

HelloWorld.class is loaded into the Method Area.
Metadata (like method and variable details) is stored.
Heap Memory

The string "Hello, World!" is stored in the String Pool.
Stack Memory

A stack frame is created for main().
The reference to the args array is stored in the stack.
Execution

System.out.println("Hello, World!");
System.out is a reference to PrintStream (pre-existing object in Heap).
println() prints the string stored in the Heap (String Pool).
Visual Representation
markdown
Copy
Edit
JVM Memory:
-------------------------------------------------
| Method Area  |   Heap Memory    |  Stack      |
|------------- |-----------------|------------ |
| HelloWorld   | "Hello, World!"  | main()      |
| .class info  | String Pool      | args array  |
-------------------------------------------------

 */

 public class HelloWorld {
 
    public static void main(String[] args) {
        System.out.println("Hello World ");
    }
 }