package Task6_05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    final static int currentYear=2023;
    public static void showWorker(ArrayList<Worker> someWorkers, int workYears){
        for (Worker w: someWorkers) {
            if(currentYear - w.getStartingYear() > workYears){
                System.out.println(w.getFullName() + " has worked more than "+workYears +" years.");
            }
        }
    }

    public static void main(String[] args) {

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
        if(workers.size()>0) {
            Collections.sort(workers, new WorkerComparator());
            System.out.println("Sorted workers: \n" + workers+"\n");
            showWorker(workers, 5);
        }
    }
}
