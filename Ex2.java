package Dz2;

public class Ex2 
{
    public static void main(String[] args) 
    {         
        City Brugge = new City("Brugge", 800000);
        Brugge.Show();
    }
}

class City{
     
    String name;    // имя
    int population;        // население
    City(String n, int a)
    {
        name = n;
        population = a;
    }
    void Show()
    {
        System.out.printf("Name: %s \tpopulation: %d\n", name, population);
    }
}