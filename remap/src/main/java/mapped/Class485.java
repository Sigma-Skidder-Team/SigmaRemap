// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.AbstractList;

public class Class485 extends Class443
{
    private Class477 field2794;
    
    public Class485() {
        super(27);
    }
    
    public void method2429(final Class477 field2794) {
        this.field2794 = field2794;
    }
    
    public void method2430(final Class52 class52) {
        for (int i = 0; i < this.method2239(); ++i) {
            this.method2160(i, Class8321.field34174);
        }
        for (int j = 0; j < class52.size(); ++j) {
            final Class51 method346 = class52.method346(j);
            final int n = method346.method317("Slot") & 0xFF;
            if (n >= 0) {
                if (n < this.method2239()) {
                    this.method2160(n, Class8321.method27619(method346));
                }
            }
        }
    }
    
    public Class52 method2431() {
        final Class52 class52 = new Class52();
        for (int i = 0; i < this.method2239(); ++i) {
            final Class8321 method2157 = this.method2157(i);
            if (!method2157.method27620()) {
                final Class51 e = new Class51();
                e.method296("Slot", (byte)i);
                method2157.method27627(e);
                ((AbstractList<Class51>)class52).add(e);
            }
        }
        return class52;
    }
    
    @Override
    public boolean method2162(final Class512 class512) {
        return (this.field2794 == null || this.field2794.method2428(class512)) && super.method2162(class512);
    }
    
    @Override
    public void method2241(final Class512 class512) {
        if (this.field2794 != null) {
            this.field2794.method2426();
        }
        super.method2241(class512);
    }
    
    @Override
    public void method2242(final Class512 class512) {
        if (this.field2794 != null) {
            this.field2794.method2427();
        }
        super.method2242(class512);
        this.field2794 = null;
    }
}
