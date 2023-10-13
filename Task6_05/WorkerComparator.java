package Task6_05;

import java.util.Comparator;

public class WorkerComparator implements Comparator<Worker> {

    @Override
    public int compare(Worker o1, Worker o2) {
        if(o1.getFullName().compareTo(o2.getFullName()) == 0) {
            return 0;
        }
        else if(o1.getFullName().compareTo(o2.getFullName()) > 0){
            return 1;
        }
        else{
            return -1;
        }

    }
}
