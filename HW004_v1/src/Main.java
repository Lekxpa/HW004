import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Persona> noDeptPerson = new ArrayList<>();
        List<Department> departmentList = new ArrayList<>();
        Group depAcc = new Group("Accounts department");
        Group depIt = new Group("IT department");
        departmentList.add(depAcc);
        departmentList.add(depIt);

        System.out.println("*".repeat(25));
        Main m = new Main();
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder()
                .append("Menu: ")
                .append("\n1 - Show Departments\n")
                .append("2 - Add Worker\n")
                .append("3 - Change Department\n")
                .append("0 - Exit\n")
                .append("Write your choice (number - 0 - 3):  ");
        System.out.println(sb);
        int input = in.nextInt();
        switch (input){
            case 1:
                System.out.println("Departments: \n" + departmentList);
                break;
            case 2:
                m.setPersona(noDeptPerson);
                m.addPersonaToDept(noDeptPerson.get(0), depAcc);
                break;
            case 3:
                m.changeDep();
                break;
            case 0:
                System.out.println("Done! Exit!");
                break;
            default:
                System.out.println("Ah! Check your choice, please!");
                break;
        }
    }
    public void setPersona(ArrayList<Persona> noDeptPerson){
        Scanner in = new Scanner(System.in);
        String FIO;
        String gender;
        int Age;
        System.out.println("Firstname and Lastname of applicant: ");
        FIO = in.nextLine();
        System.out.println("Gender of applicant: ");
        gender = in.nextLine();
        System.out.println("Age of applicant: ");
        Age = in.nextInt();
        Persona persona = new Persona(FIO, gender, Age);
        noDeptPerson.add(new Persona(FIO, gender, Age)); // добавили персону без отдела
        System.out.println("*".repeat(25));
        System.out.println("Applicant: " + persona.printPersona());
        System.out.println("*".repeat(25));
    }
    public void addPersonaToDept(Persona persona, Group group){
        Scanner in = new Scanner(System.in);
        System.out.println("Have you made a decision to apply for a job in " + group.depName + "?\n" +
                "Write your choice: \n" +
                "0 - Yes\n1 - No");
        int check = in.nextInt();
        switch (check) {
            case 0:
                group.addPeople(persona);
                View.depView(group);
                System.out.println("*".repeat(25));
                changeDep();
                break;
            case 1:
                System.out.println("Refusal");
                break;
            default:
                System.out.println("Check your choice, please!");
                break;
        }
    }
    public void changeDep() {
        Scanner in = new Scanner(System.in);
        System.out.println("Would you like to change your department?\n" +
                "Write your choice: \n" +
                "0 - No\n1 - Yes");
        int decision = in.nextInt();
        switch (decision) {
            case 0:
                System.out.println("OK! Good luck!");
                break;
            case 1:
                System.out.println("Would yoy like to go to work in IT department?");
                System.out.println("Write your choice: \n" +
                        "0 - No\n1 - Yes");
                Group depIt = new Group("IT department");
                int decision1 = in.nextInt();
                switch (decision1) {
                    case 0:
                        System.out.println("OK! Good luck!");
                        break;
                    case 1: ;
                        View.depView(depIt);
                        break;
                    default:
                        System.out.println("Check your choice, please!");
                        break;
                }
                break;
                default:
                    System.out.println("Check your choice, please!");
                    break;
                }
    }
}