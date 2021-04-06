public class AssembleurInst {
    String inst;
    String op1;
    String op2;

    public AssembleurInst(String inst, String op1, String op2) {
        this.inst = inst;
        this.op1 = op1;
        this.op2 = op2;
    }

    @Override
    public String toString()
    { return inst + " " + op1 + " " + op2; }
}
