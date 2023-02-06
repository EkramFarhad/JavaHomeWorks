package Class17HW_Constractor;

public class Task1Tester {

    public static void main(String[] args) {
        Task1 province = new Task1("kabul","24",2000);
        province.printInfo();
        Task1 provence2 = new Task1("london","40ID",2560);
        provence2.printInfo();

    }


}

/////////////////don by asghar////////////////
/*
*  public static void main(String[] args) {
        //not possible as constructor is private
        // Task1 task1=new Task1();
        Task1 task2=new Task1("Java");
        Task1 task3=new Task1(1000);
        Task1 task4=new Task1('G');
    }*/
