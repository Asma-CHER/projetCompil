import java.util.ArrayList;

public class TS
{
    static public class Element {

        String name;
        boolean declared;
        String type;
        String value;
        boolean initialise;

        public Element(String name, boolean declared, String type, String value, boolean initialise) {
            this.name = name;
            this.declared = declared;
            this.type = type;
            this.value = value;
            this.initialise = initialise;

        }
        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public boolean isInitialise() {
            return initialise;
        }

        public void setInitialise(boolean initialise) {
            this.initialise = initialise;
        }

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
                    ", value='" + value + '\'' +
                    ", initialise=" + initialise +
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
    { return getElement(name) != null; }

    public void addElement(Element e)
    {
        L.add(e);
    }

    public void deleteElement(String name)
    { for (int i = 0; i < L.size(); i++) {
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
    { return L.size(); }

    public Element getElement(int i)
    {
        return L.get(i);
    }

}
