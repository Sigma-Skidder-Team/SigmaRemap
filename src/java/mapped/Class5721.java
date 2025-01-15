// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;
import java.util.List;

public class Class5721 extends Class5714
{
    private static String[] field23268;
    private Class4252 field23269;
    private List<Class4252> field23270;
    
    public Class5721(final Class4252 field23269) {
        this.field23270 = new ArrayList<Class4252>();
        this.field23269 = field23269;
        this.field23270.add(field23269);
    }
    
    public Class4252 method16990() {
        return this.field23269;
    }
    
    public List<Class4252> method16991() {
        return this.field23270;
    }
    
    public void method16992(final Class4252 field23269) {
        this.field23269 = field23269;
    }
}
