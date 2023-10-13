//Потрібно: Описати клас з ім'ям Worker, що містить такі поля:
//прізвище та ініціали працівника;
//назва посади;
//рік надходження на роботу.
//Написати програму, яка виконує такі дії:
//введення з клавіатури даних до масиву, що складається з п'яти елементів типу Worker (записи мають бути впорядковані за абеткою);
//якщо значення року введено не у відповідному форматі, видає виняток.
//виведення на екран прізвища працівника, стаж роботи якого перевищує введене значення.
package Task6_05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int currentYear=2023;
        Scanner scanner=new Scanner(System.in);
        String name, job;
        int year;

        ArrayList<Worker> workers=new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            try{
                System.out.println("Please input worker's name: ");
                name=scanner.nextLine();
                System.out.println("Please input worker's job: ");
                job=scanner.nextLine();
                System.out.println("Please input worker's starting year at work: ");
                year=scanner.nextInt();
                scanner.nextLine();
                if ((year < currentYear-100) || (year > currentYear)) {
                    throw new Exception("Wrong year input! Worker couldn't have started job at that year!");
                }

                workers.add(new Worker(name, job, year));
            } catch (Exception e) {
                if(e.getMessage()==null){
                    System.out.println("Wrong data input!");
                }
                else{
                    System.out.println(e.getMessage());
                }
                break;
            }
        }
        if(workers.size()>1) {
            Collections.sort(workers, new WorkerComparator());
            System.out.println("Sorted workers: \n" + workers);
        }
    }
}
