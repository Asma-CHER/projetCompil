public class QuadElement {

        String quad[] = new String[4]; // (Opérateur, Opérande gauche, Opérande droite, resultat)

    public QuadElement(String[] vals) {
            this.quad = vals;
        }

        //constructeur du quad
        public QuadElement(String val1, String val2, String val3, String val4)
        {   quad[0] = val1;
            quad[1] = val2;
            quad[2] = val3;
            quad[3] = val4;
        }

        //recuperer un champ i du quad
        public String getVal(int i) { return quad[i];}
        //put value dans champ i du quad

        public void setQuad(int i, String val) { quad[i] = val;}

        //permutation entre quad[2] et quad[3]
        public void swapOperands(){
            String temp = quad[2];
            quad[2]=quad[3];
            quad[3]=temp;
        }

        //affichage du quad
        @Override
        public String toString()
        { return "("+quad[0]+","+quad[1]+","+quad[2]+","+quad[3]+")";}

}
