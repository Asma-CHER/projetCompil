import java.util.LinkedList;

public class Quads {
    LinkedList<QuadElement> quadElements = new LinkedList<>();
    public int addQuad(String val1,String val2,String val3,String val4)
    { return addQuad(new QuadElement(val1,val2,val3,val4));}

    public int addQuad(QuadElement quadElement)
    {   quadElements.add(quadElement);
        return quadElements.size()-1;
    }

    public QuadElement getQuad(int index)
    { return quadElements.get(index);}

    public int size()
    { return quadElements.size();}
}
