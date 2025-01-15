// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5226 extends Class5207
{
    private static String[] field22247;
    private static final Class2449<Float, Short> field22248;
    
    @Override
    public void method16306() {
        Class7602.method23901(this);
        this.method16316(Class2044.field11648, 0, 0, new Class2789(this));
        this.method16316(Class2044.field11648, 3, 3, new Class2921(this));
        this.method16316(Class2044.field11648, 70, 70, new Class2896(this));
        this.method16316(Class2044.field11648, 72, 72, new Class3022(this));
        this.method16316(Class2044.field11648, 57, 57, new Class2991(this));
        this.method16316(Class2044.field11648, 73, 73, new Class2917(this));
        this.method16316(Class2044.field11648, 48, 48, new Class3010(this));
        this.method16316(Class2044.field11648, 69, 69, new Class3059(this));
        this.method16316(Class2044.field11648, 10, 10, new Class2971(this));
        this.method16316(Class2044.field11648, 9, 9, new Class3088(this));
        this.method16316(Class2044.field11648, 32, 32, new Class2888(this));
        this.method16316(Class2044.field11648, 35, 35, new Class2853(this));
        this.method16316(Class2044.field11648, 51, 51, new Class2969(this));
        this.method16313(Class2044.field11648, 28, 28, new Class2908(this));
        this.method16313(Class2044.field11648, 2, 2, new Class2801(this));
    }
    
    private int method16344(int n) {
        if (n != 196) {
            if (n >= 85) {
                n += 2;
            }
            if (n >= 176) {
                ++n;
            }
            if (n >= 197) {
                n += 8;
            }
            if (n >= 196) {
                --n;
            }
            if (n >= 279) {
                n += 9;
            }
            if (n >= 296) {
                ++n;
            }
            if (n >= 390) {
                n += 4;
            }
            if (n >= 400) {
                n += 3;
            }
            if (n >= 450) {
                ++n;
            }
            if (n >= 455) {
                ++n;
            }
            if (n >= 470) {
                ++n;
            }
            return n;
        }
        return -1;
    }
    
    @Override
    public void method16307(final Class6108 class6108) {
        class6108.method18209(new Class6642(class6108));
        if (!class6108.method18208(Class6637.class)) {
            class6108.method18209(new Class6637(class6108));
        }
    }
    
    static {
        field22248 = new Class2453(Class5260.field22292);
    }
}
