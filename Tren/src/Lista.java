import java.util.LinkedList;
import java.util.Scanner;

public class Lista
{
    //int pentru a memoriza cate trenuri introducem
    static int n;
    //Introducere tren nou
    public static void NewTrain()
    {
        //Pentru a citi de la keyboard
        Scanner read = new Scanner(System.in);
        //Stringuri care preiau datele
        System.out.println("Introduceti destinatia trenului: ");
        String Destinatia = read.next();
        System.out.println("Introduceti numarul trenului: ");
        String Numar = read.next();
        System.out.println("Introduceti ora plecarii a trenului: ");
        String Ora = read.next();
        System.out.println("Introduceti tipul trenului(general/compartiment/salon/apartament): ");
        String Tip = read.next();

        //Obiect tren
      Train train = new Train(Destinatia,Numar,Ora,Tip);
      trainList.add(train);

    }
    //Introducerea a mai multor trenuri
    public static void trenuri()
    {
        System.out.println("Cate trenuri veti introduce: ");
        Scanner read = new Scanner(System.in);
        n = read.nextInt();
        for(int i =0 ; i<n;i++)
        {
            NewTrain();
        }
    }

    //Lista de trenuri
     static LinkedList<Train> trainList = new LinkedList<>();
    //Afisare a toate trenuri
     public static void showlist()
     {
         for (Train train : trainList)
         {
          System.out.println(train.toString());
         }
     }
    //Afisare dupa destinatie
    public static void showlistdestination(){
         Scanner read = new Scanner(System.in);
         System.out.println("Afisare tren dupa destinatie: ");
         String destinatia = read.next();
         for (Train train : trainList)
         {
             if (train.getDestinatia().equalsIgnoreCase(destinatia))
             {
                 System.out.println(train.toString());
             }
        }
    }
    //Afisare dupa destinatie si ora plecarii
    public static void showlistdestinationtime(){
        Scanner read = new Scanner(System.in);
        System.out.println("Afisare tren dupa destinatie si ora: ");
        String destinatia = read.next();
        String ora = read.next();
        for (Train train : trainList)
        {
            if (train.getDestinatia().equalsIgnoreCase(destinatia) && train.getOra().equals(ora))
            {
                System.out.println(train.toString());
            }
        }
    }
    //Afisare dupa destinatie si tip de locuri
    public static void showlistdestinationtype(){
        Scanner read = new Scanner(System.in);
        System.out.println("Afisare tren dupa destinatie si tip: ");
        String destinatia = read.next();
        String tip = read.next();
        for (Train train : trainList)
        {
            if (train.getDestinatia().equalsIgnoreCase(destinatia) && train.getLocuri().equals(tip))
            {
                System.out.println(train.toString());
            }
        }
    }
}
