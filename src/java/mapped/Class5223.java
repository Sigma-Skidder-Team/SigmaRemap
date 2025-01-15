// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.List;

public class Class5223 extends Class5207
{
    private static String[] field22240;
    @Deprecated
    public static final Class5260<List<Class7276>> field22241;
    @Deprecated
    public static final Class5260<Class7276> field22242;
    public static final Class2449<Short, Float> field22243;
    public static final Class2449<List<Class7276>, List<Class7276>> field22244;
    
    @Override
    public void method16306() {
        this.method16316(Class2044.field11648, 25, 25, new Class2902(this));
        this.method16316(Class2044.field11648, 70, 70, new Class2935(this));
        this.method16316(Class2044.field11648, 57, 57, new Class2844(this));
        this.method16316(Class2044.field11648, 3, 3, new Class2978(this));
        this.method16316(Class2044.field11648, 5, 5, new Class3028(this));
        this.method16316(Class2044.field11648, 50, 50, new Class3060(this));
        this.method16313(Class2044.field11648, 22, 22, new Class2815(this));
    }
    
    public int method16339(final int n) {
        int n2 = n;
        if (n >= 24) {
            ++n2;
        }
        if (n >= 248) {
            n2 += 4;
        }
        if (n >= 296) {
            n2 += 6;
        }
        if (n >= 354) {
            n2 += 4;
        }
        if (n >= 372) {
            n2 += 4;
        }
        return n2;
    }
    
    @Override
    public void method16307(final Class6108 class6108) {
        class6108.method18209(new Class6649(class6108));
    }
    
    static {
        field22241 = new Class5324();
        field22242 = new Class5296();
        field22243 = new Class2458(Class5260.field22302);
        field22244 = new Class2457(Class8794.field36974);
    }
}
