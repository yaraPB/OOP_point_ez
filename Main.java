/** Creating a code to calculate the distance between a point (user input) & the origin
 * !imp (only accepting doubles)
 * Author: Yara
 * Last updated on: 16 September 2023
 */

import java.lang.Math;

public class Main{

    public static void main(String[] args){
        point p1 = new point(1, 2);
        System.out.println(p1.toString());
        p1.setA(5);
        System.out.println(p1.toString());
        System.out.println(p1.getB());

    }
}

class point{
    //initializing the points
    private double a;
    private double b;

    //getter and setter for a:
    public void setA(double a){
        this.a = a;
    }
    public double getA(){
        return a;
    }
    
    //getter and setter for b:
    public void setB(double b){
        this.b = b;
    }
    public double getB(){
        return b;
    }

    //method calculating the distance:
    public double distance(){
        return Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
    }
    
    //the constructor:
    public point(double a, double b){
        this.a = a;
        this.b = b;
    }
    
    public String toString(){
        String seperator = System.getProperty("line.separator"); 
        return String.format("The distance between: " +"("+ a + "," + b + ")" + " and the origin is: " + seperator + this.distance());
    }
    
}
