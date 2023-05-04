package Dz2;

public class Ex5 
{
    public static void main(String[] args) 
    {         
        Book Brugge = new Book("Hello", "A.N.Ivanov",2021,"Rasvet","Roman",300);
        Brugge.Show();
    }
}

class Book{
     
    String name;    // имя
    String FIO;        
    int data;
    String publisher;
    String janr;
    int pages;
    Book(String n,String f,int d,String p,String j,int pag)
    {
        name = n;
        FIO = f;        
        data = d;
        publisher = p;
        janr = j;
        pages = pag;
    }
    void Show()
    {
        System.out.printf("Name: %s \tFIO: %s \tData: %d \tPublisher: %s \tJanr: %s \tPages: %d", name, FIO, data, publisher,janr,pages);
    }
}