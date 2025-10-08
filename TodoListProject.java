import java.util.*;
public class TodoListProject {

    public static void main(String[] args) {
        ArrayList<String> task=new ArrayList<>();//isme agar hume array list banani h to ye line likhne padti h jaise scanner sc vaali
        Scanner sc=new Scanner(System.in);
        System.out.println("------------Welcome to TODO List---------------");
        while (true) {//while true humne islye likha takki ye ek choice complete hone k baand saare TODO list options vapees dekhe ye likhne se loop chelta reheta h jab tak hum isse band na karde
            System.out.println("please select an option:");
            System.out.println("1.To add new task");
            System.out.println("2.To view all tasks");
            System.out.println("3.To remove task");
            System.out.println("4.To Exit");
            System.out.println("Enter your choice:");
            int choice=sc.nextInt();//ye input vali line dekhne k baad complier rum jata h taki user apna input de seke kyki chalte hue loop mai user apna input kaise dega ye java ka ek feature h pheer input dene k baad mai task pura hone k baad mai ye loop vapes chelta h phher vapees voi he proces reapt hota h jo maine phele bataya aur is band karne k lieye option 4 choose karenge jiss se switch case 4 chal jyega aur pura program baand ho jyega kyu case 4 mai return; ye lekha hua h jis se main method band ho jata h aur main method baand ho gaya to program band ho jata h
            sc.nextLine();
            switch (choice) {
                case 1:System.out.println("Enter your task name:");
                String newtask=sc.nextLine();
                task.add(newtask);// ye vali line se "array list" jis ka name "task" h usme ye jo bhe hum "newtask" mai lekhnege vo add ho jyega arraylist mai
                System.out.println("Your task get added Sir!");
                    
                    break;
                    case 2:System.out.println("Your taks:");
                    if (task.isEmpty()) {
                        System.out.println("your TODO List is empty Sir!");
                    } else {
                        for (int i = 0; i < task.size(); i++) {//ye tasksize se arraylist ki size ka pata lagta h jaise kitni size ka 1,2,ya 3 jo bhee ho
                            System.out.println(task.get(i));
                        }
                    }
                    break;
                    case 3:System.out.println("please enter the task number which you want to remove:");
                    int tasknumber=sc.nextInt();
                    if (tasknumber>0 && tasknumber<=task.size()) {
                        System.out.println(task.remove(tasknumber-1));
                        System.out.println("Your task get removed sir");
                    } else {
                        System.out.println("Please enter a valid task number to remove!");
                    }
                    break;
                    case 4:System.out.println("have a good day!");
                    return;
            
                default:System.out.println("Invalid choice please enter a valid choice.");
                    break;
            }
        }
    }
}

