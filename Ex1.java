package Dz2;

public class Ex1 
{
    public static void main(String[] args) 
    {         
        Human tom = new Human("Tom", 19);
        tom.Show();
    }
}
class Human{
     
    String name;    // имя
    int age;        // возраст
    Human(String n, int a)
    {
        name = n;
        age = a;
    }
    void Show()
    {
        System.out.printf("Name: %s \tAge: %d\n", name, age);
    }
}