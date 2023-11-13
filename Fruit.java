class Fruits{  
void eat(){System.out.println("eating...");}  
}  
class Apple extends Fruits{  
void red(){System.out.println("I am a Apple...");}  
}  
class Mango extends Fruits{  
void yellow(){System.out.println("I am a Mango...");}  
}  
class Fruit{  
public static void main(String args[]){  
Mango c=new Mango();  
c.yellow(); 
c.eat(); 
}}  