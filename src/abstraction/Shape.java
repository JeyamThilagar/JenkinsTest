package abstraction;

    abstract class TestShape{  
    abstract void draw();  
    }  
    //In real scenario, implementation is provided by others i.e. unknown by end user  
    class Rectangle extends TestShape{  
    void draw(){System.out.println("drawing rectangle");}  
    }  
    class Circle1 extends TestShape{  
    void draw(){System.out.println("drawing circle");}  
    }  
    //In real scenario, method is called by programmer or user  
    class Shape{  
    public static void main(String args[]){  
    Circle1 s=new Circle1();//In a real scenario, object is provided through method, e.g., getShape() method  
    s.draw();  
    }  
    }  
