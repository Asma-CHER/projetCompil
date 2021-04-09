public class AssembleurInst {
    String etiq;
    String inst;
    String op1;
    String op2;

    public AssembleurInst(String etiq,String inst, String op1, String op2) {
        this.etiq=etiq;
        this.inst = inst;
        this.op1 = op1;
        this.op2 = op2;
    }

    @Override
    public String toString()
    { return " "+etiq+" "+inst + " " + op1 + "," + op2; }
}
