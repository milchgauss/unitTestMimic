 class additionCheck{

//Class to mimic a unit test

private int addNumbers(int p1, int p2){
return p1+p2;
}
private int subtractNumbers(int p1, int p2){
return p1-p2;
}
private int multiplyNumbers(int p1,int p2){
return p1*p2;
}
private int divideNumbers(int p1,int p2){
return p1/p2;
}


public boolean checkAdd(int i,int a){

int d=addNumbers(i,a);

if(i+a==d){
System.out.println(d); 
return true;
}
return false;
}

public boolean checkSubtract(int i,int a){

int d=subtractNumbers(i,a);

if(i-a==d){
System.out.println(d); 
return true;
}
return false;
}
 
public boolean checkMultiply(int i,int a){

int d=multiplyNumbers(i,a);

if(i*a==d){
System.out.println(d); 
return true;
}
return false;
}
 public boolean checkDivide(int i,int a){

int d=divideNumbers(i,a);

if(i/a==d){
System.out.println(d); 
return true;
}
return false;
}
 
 

public static void main (String[]args){

additionCheck d= new additionCheck();
 System.out.println(d.addNumbers(1,3));
 System.out.println(d.checkAdd(3,4));

}
}