package com.java8.lambdaexpressions;

@FunctionalInterface
interface InterfaceModal
{
    public void paramMethod(String arg1, int arg2);
}
public class FunctInterfcWithParams
{
    public static void main(String args[])
    {
        InterfaceModal modal = (arg1, arg2)->
        {
            System.out.println("Hello "+arg1+" "+arg2+" is ur age");
        };
        modal.paramMethod("Surya", 24);
    }
}
