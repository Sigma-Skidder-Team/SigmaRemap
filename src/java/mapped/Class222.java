// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.HashMap;
import java.util.Map;

public enum Class222
{
    field771(0, 0, -1, Class2149.field12775), 
    field772(0, 0, 1, Class2149.field12775), 
    field773(1, 0, 0, Class2149.field12773), 
    field774(-1, 0, 0, Class2149.field12773), 
    field775(0, 1, 0, Class2149.field12774), 
    field776(0, -1, 0, Class2149.field12774);
    
    private static Map<Class222, Class222> field777;
    private int field778;
    private int field779;
    private int field780;
    private Class2149 field781;
    
    public Class222 method851() {
        return Class222.field777.get(this);
    }
    
    public int method852() {
        return this.field778;
    }
    
    public int method853() {
        return this.field779;
    }
    
    public int method854() {
        return this.field780;
    }
    
    public Class2149 method855() {
        return this.field781;
    }
    
    private Class222(final int field778, final int field779, final int field780, final Class2149 field781) {
        this.field778 = field778;
        this.field779 = field779;
        this.field780 = field780;
        this.field781 = field781;
    }
    
    static {
        (Class222.field777 = new HashMap<Class222, Class222>()).put(Class222.field771, Class222.field772);
        Class222.field777.put(Class222.field772, Class222.field771);
        Class222.field777.put(Class222.field773, Class222.field774);
        Class222.field777.put(Class222.field774, Class222.field773);
        Class222.field777.put(Class222.field775, Class222.field776);
        Class222.field777.put(Class222.field776, Class222.field775);
    }
}
