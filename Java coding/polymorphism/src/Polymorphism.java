//polymorphism first checking code
class Polymorphism1{
    public void display(){
        System.out.println("in base class");
    }
}
    class donkey extends Polymorphism1{
        public void display(){
            System.out.println("in donkey class");
        }
    }
    class monkey extends Polymorphism1{
        public void display(){
            System.out.println("in monkey class");
        }
    }
public class Polymorphism{
    public static void main( String[] args){
        Polymorphism1 tree;
        donkey o1=new donkey();
        monkey o2=new monkey();
        tree=o1;
        tree.display();
        tree=o2;
        tree.display();
    }
}