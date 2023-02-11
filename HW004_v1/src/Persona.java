public class Persona {
    String pFIO;
    String pGender;
    int pAge;
    public Persona(String PFIO, String PGender, int PAge){
        this.pFIO = PFIO;
        this.pGender = PGender;
        this.pAge = PAge;
    }
    public String getpFIO() {
        return pFIO;
    }
    public String getpGender() {
        return pGender;
    }
    public int getpAge() {
        return pAge;
    }
    public String printPersona(){
        return String.format(pFIO + ", " + pGender + ", " + pAge);
    }
}
