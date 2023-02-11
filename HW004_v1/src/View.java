public class View {
    public static void depView(Group root){
        System.out.println("Done!\n" +
                "Hired in Department: " + root.depName);
        for (var item: root.personaInDept) {
            System.out.println(item.pFIO + " " + item.pGender+ " " + item.pAge);
        }
    }
}