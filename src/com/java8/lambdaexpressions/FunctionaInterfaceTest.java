package com.java8.lambdaexpressions;

interface SampleInterface
{
    void demoMethod();
}
public class FunctionaInterfaceTest
{
    public static void main(String[] args)
    {
        System.out.println("Calling the interface...");
        SampleInterface sampleInterface = ()->
                System.out.println("Hello user...");
        sampleInterface.demoMethod();
    }
}
