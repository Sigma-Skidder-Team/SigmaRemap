// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.logging.Level;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public abstract class Class5207
{
    private final Map<Class7803<Class2044, Integer>, Class5104> field22221;
    private final Map<Class7803<Class2044, Integer>, Class5104> field22222;
    
    public Class5207() {
        this.field22221 = new HashMap<Class7803<Class2044, Integer>, Class5104>();
        this.field22222 = new HashMap<Class7803<Class2044, Integer>, Class5104>();
        this.method16306();
    }
    
    public boolean method16308(final Class clazz) {
        return false;
    }
    
    public void method16309(final Class6108 class6108, final Object o, final List list) throws Exception {
        list.add(o);
    }
    
    @Deprecated
    public void method16310() {
    }
    
    public void method16311(final Class8720 class8720) {
    }
    
    public abstract void method16306();
    
    public abstract void method16307(final Class6108 p0);
    
    public void method16312(final Class2044 class2044, final int n, final int n2) {
        this.method16313(class2044, n, n2, null);
    }
    
    public void method16313(final Class2044 class2044, final int n, final int n2, final Class2780 class2045) {
        this.method16314(class2044, n, n2, class2045, false);
    }
    
    public void method16314(final Class2044 class2044, final int n, final int i, final Class2780 class2045, final boolean b) {
        final Class5104 class2046 = new Class5104(this, class2044, n, i, class2045);
        final Class7803 obj = new Class7803(class2044, i);
        if (!b) {
            if (this.field22221.containsKey(obj)) {
                Class8563.method28793().method34742().log(Level.WARNING, obj + " already registered! If this override is intentional, set override to true. Stacktrace: ", new Exception());
            }
        }
        this.field22221.put(obj, class2046);
    }
    
    public void method16315(final Class2044 class2044, final int n, final int n2) {
        this.method16316(class2044, n, n2, null);
    }
    
    public void method16316(final Class2044 class2044, final int n, final int n2, final Class2780 class2045) {
        this.method16317(class2044, n, n2, class2045, false);
    }
    
    public void method16317(final Class2044 class2044, final int i, final int n, final Class2780 class2045, final boolean b) {
        final Class5104 class2046 = new Class5104(this, class2044, i, n, class2045);
        final Class7803 obj = new Class7803(class2044, i);
        if (!b) {
            if (this.field22222.containsKey(obj)) {
                Class8563.method28793().method34742().log(Level.WARNING, obj + " already registered! If override is intentional, set override to true. Stacktrace: ", new Exception());
            }
        }
        this.field22222.put(obj, class2046);
    }
    
    public void method16318(final Class2128 class2128, final Class2044 class2129, final Class8699 class2130) throws Exception {
        final Class5104 class2131 = ((class2128 != Class2128.field12427) ? this.field22221 : this.field22222).get(new Class7803(class2129, class2130.method29848()));
        if (class2131 != null) {
            class2130.method29847((class2128 != Class2128.field12427) ? class2131.method15998() : class2131.method15999());
            if (class2131.method16000() != null) {
                class2131.method16000().method9833(class2130);
                if (class2130.method29840()) {
                    throw Class8563.method28794().method33559() ? new Class2334() : Class2334.field14077;
                }
            }
        }
    }
    
    @Override
    public String toString() {
        return "Protocol:" + this.getClass().getSimpleName();
    }
}
