import java.util.LinkedList;

public class CodeGenerator {

    Quads quads;
    LinkedList<AssembleurInst> insts = new LinkedList<>();
    String ACC ="";

    public LinkedList<AssembleurInst> generateCode(Quads quads){
        for(int i=0;i<quads.size();i++)
        {

        }
        return insts;
    }

    public void getInAcc(QuadElement quad,String op1,String op2)
    {   String temp;
        if(ACC.equals("")) {
            insts.add(new AssembleurInst("LOAD",op1,""));
            ACC =op1;
        }else{
                if(ACC.equals(op2)){
                    temp= quad.getVal(1);
                    quad.setQuad(1,quad.getVal(2));
                    quad.setQuad(2,temp);
                }else{
                    if(!ACC.equals(op1)){
                        insts.add(new AssembleurInst("STORE","Z",""));
                        insts.add(new AssembleurInst("LOAD",op1,""));
                        ACC =op1;
                    }
                }
        }
    }







}
