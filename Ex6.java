package Dz2;


public class Ex6 
{
    public static void main(String[] args) 
    {         
        Auto Aut = new Auto("Auto", "Mersedec",2021,200);
        Aut.Show();
    }
}

class Auto{
     
    String name;    // имя
    String maker;        
    int data;
    int volume;

    Auto(String n, String m,int d,int v)
    {
        name = n;
        maker = m;
        data = d;
        volume = v;
    }
    void Show()
    {
        System.out.printf("Name: %s \tmaker: %s \tdata: %d \tvolume: %d", name, maker, data, volume);
    }
}