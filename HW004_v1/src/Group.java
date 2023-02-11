public class Group extends Department{
    public Group(String GroupName){
        setDepName(GroupName);
    }
    public void addPeople(Persona persona){
        personaInDept.add(persona);
    }
}
