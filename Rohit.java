/*
import java.util.*;
public class Rohit{
public static int fact(int n){
if(n == 0){
return 1;
}
int fnm = fact(n-1);
int fn = n*fact(n-1);
return fn;
}
public static void main(String args[]){
int n = 5;
System.out.println(fact(n));
}
}
*/
import java.util.*;
public class Rohit{
public static int power(int x, int n){
if(n==0){
return 1;
}
int xnm = power(x, n-1);
int xn = x * xnm;
return xn;
}
public static void main(String args[]){
System.out.println(power(2, 2));
}
}
