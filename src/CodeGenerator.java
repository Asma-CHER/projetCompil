import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;

public class CodeGenerator {

    Quads quads;
    LinkedList<AssembleurInst> insts = new LinkedList<>();
    HashMap<String,String> typeMap = new HashMap<>();
    String ACC ="";

    public CodeGenerator(Quads quads) {
        typeMap.put("=","AFF");
        typeMap.put("*","OPERATION");
        typeMap.put("/","OPERATION");
        typeMap.put("+","OPERATION");
        typeMap.put("-","OPERATION");
        typeMap.put("BR","BRANCH_DIRECT");
        typeMap.put("BLE","BRANCH");
        typeMap.put("BGE","BRANCH");
        typeMap.put("BG","BRANCH");
        typeMap.put("BL","BRANCH");
        typeMap.put("BE","BRANCH");
        typeMap.put("BNE","BRANCH");
        typeMap.put("END","BRANCH");
        typeMap.put("READ","INPUT");
        typeMap.put("WRITE","OUTPUT");
        typeMap.put("END","END");
        this.quads = quads;
    }

    public LinkedList<AssembleurInst> generateCode(Quads quads){
        for(int i=0;i<quads.size();i++)
        {
            instCode(quads.getQuad(i),i);
        }
        return insts;
    }

    private void instCode(QuadElement quad,int index) {
        LinkedList<AssembleurInst> instGen = new LinkedList<>();
        String type = typeMap.get(quad.getVal(0));
        switch (type){
            case "AFF": affGen(quad,index); break;
            case "OPERATION":operationGen(quad,index);break;
            case "BRANCH_DIRECT": branchBRGen(quad,index);break;
            case "BRANCH": branchGen(quad,index);break;
            case "INPUT": inputGen(quad,index);break;
            case "OUTPUT": outputGen(quad,index);break;
            case "END":endGen(quad,index); break;
        }
    }

    private void endGen(QuadElement quad, int index) {
        insts.add(new AssembleurInst(String.valueOf(index),"END","",""));
    }

    private void branchBRGen(QuadElement quad, int index) {
            insts.add(new AssembleurInst(" ","JUMP",quad.getVal(1),""));
    }

    private void outputGen(QuadElement quad,int index) {
        insts.add(new AssembleurInst(String.valueOf(index),"OUTPUT",quad.getVal(1),""));
    }

    private void inputGen(QuadElement quad,int index) {
        insts.add(new AssembleurInst(String.valueOf(index),"INPUT",quad.getVal(1),""));
    }

    private void branchGen(QuadElement quad,int index) {
        String b =quad.getVal(0);
        insts.add(new AssembleurInst(String.valueOf(index),"MOV","AX",quad.getVal(2)));
        insts.add(new AssembleurInst(" ","CMP","AX",quad.getVal(3)));
        switch (b){
            case "BE": insts.add(new AssembleurInst(" ","JE",quad.getVal(1),"")); break;
            case "BNE":  insts.add(new AssembleurInst(" ","JNE",quad.getVal(1),"")); break;
            case "BLE": insts.add(new AssembleurInst(" ","JLE",quad.getVal(1),"")); break;
            case "BL": insts.add(new AssembleurInst(" ","JL",quad.getVal(1),""));break;
            case "BGE": insts.add(new AssembleurInst(" ","JGE",quad.getVal(1),""));break;
            case "BG": insts.add(new AssembleurInst(" ","JG",quad.getVal(1),""));break;
        }
    }

    private void operationGen(QuadElement quad,int index) {
        if(quad.getVal(0).equals("+")){
            String etiqt = getInAcc(quad,quad.getVal(1),quad.getVal(2),index);
            insts.add(new AssembleurInst(etiqt,"ADD",quad.getVal(2),""));
        }
        if(quad.getVal(0).equals("*")){
            String etiqt = getInAcc(quad,quad.getVal(1),quad.getVal(2),index);
            insts.add(new AssembleurInst(etiqt,"MUL",quad.getVal(2),""));
        }
        if(quad.getVal(0).equals("-")){
            String etiqt = getInAcc(quad,quad.getVal(1),"",index);
            insts.add(new AssembleurInst(etiqt,"SUB",quad.getVal(2),""));
        }
        if(quad.getVal(0).equals("/")){
            String etiqt = getInAcc(quad,quad.getVal(1),"",index);
            insts.add(new AssembleurInst(etiqt,"DIV",quad.getVal(2),""));
        }
    }

    private void affGen(QuadElement quad,int index) {
      insts.add(new AssembleurInst(String.valueOf(index),"MOV","AX",quad.getVal(2)));
      insts.add(new AssembleurInst(" ","MOV",quad.getVal(3),"AX"));
    }


    public String getInAcc(QuadElement quad,String op1,String op2,int index)
    {   String temp;
        String etiqt = " ";
        if(ACC.equals("")) {
            insts.add(new AssembleurInst(String.valueOf(index),"LOAD",op1,""));
            ACC =op1;
        }else{
                if(ACC.equals(op2)){
                    temp= quad.getVal(1);
                    quad.setQuad(1,quad.getVal(2));
                    quad.setQuad(2,temp);
                    etiqt =String.valueOf(index);
                }else{
                    if(!ACC.equals(op1)){
                        insts.add(new AssembleurInst(String.valueOf(index),"STORE","Z",""));
                        insts.add(new AssembleurInst("","LOAD",op1,""));
                        ACC =op1;
                    }
                }
        }
        return etiqt;
    }







}
