import java.util.ArrayList;

public class TS
{
    static public class Element {


        public Element(String name, boolean declared, String type) {
            this.name = name;
            this.declared = declared;
            this.type = type;

        }

        String name;
        boolean declared;
        String type;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }



        public boolean isDeclared() {
            return declared;
        }

        public void setDeclared(boolean declared) {
            this.declared = declared;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        @Override
        public String toString() {
            return "Element{" +
                    "name='" + name + '\'' +
                    ", declared=" + declared +
                    ", type='" + type + '\'' +
                    '}';
        }
    }


    public ArrayList<Element> L = new ArrayList<Element>();


    public Element getElement(String name)
    {
        for (int i = 0; i < L.size(); i++) {
            if(L.get(i).name.compareTo(name)==0)
                return L.get(i);
        }
        return null;
    }

    public boolean containsElement(String name)
    {
        return getElement(name) != null;
    }

    public void addElement(Element e)
    {
        L.add(e);
    }

    public void deleteElement(String name)
    {
        for (int i = 0; i < L.size(); i++) {
            if(L.get(i).name.compareTo(name)==0)
            {
                deleteElement(L.get(i));
                return;
            }
        }
    }

    public void deleteElement(Element e)
    {
        L.remove(e);
    }

    public int getSize()
    {
        return L.size();
    }

    public Element getElement(int i)
    {
        return L.get(i);
    }

}
