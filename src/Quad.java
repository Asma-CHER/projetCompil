public class Quad {

        String quad[];

        public Quad(String[] vals) {
            this.quad = vals;
        }

        public Quad(String val1,String val2,String val3,String val4)
        {   quad = new String[4];
            quad[0] = val1;
            quad[1] = val2;
            quad[2] = val3;
            quad[3] = val4;
        }

        public String get(int i) { return quad[i];}
        public void set(int i, String val) { quad[i] = val;}

        @Override
        public String toString()
        { return "("+quad[0]+","+quad[1]+","+quad[2]+","+quad[3]+")";}

}
