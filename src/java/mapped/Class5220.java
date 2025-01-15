// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5220 extends Class5207
{
    private static String[] field22236;
    
    @Override
    public void method16306() {
        Class6436.method19201(this);
        Class9553.method35738(this);
        Class9530.method35583(this);
        this.method16313(Class2044.field11648, 5, 5, new Class2828(this));
        this.method16313(Class2044.field11648, 11, 11, new Class3075(this));
        this.method16316(Class2044.field11648, 16, 16, new Class3073(this));
        this.method16316(Class2044.field11648, 24, 24, new Class2832(this));
        this.method16316(Class2044.field11648, 12, 12, new Class2818(this));
        this.method16316(Class2044.field11648, 81, 81, new Class2820(this));
        this.method16316(Class2044.field11648, 85, 85, new Class2836(this));
    }
    
    @Override
    public void method16307(final Class6108 class6108) {
        class6108.method18209(new Class6641(class6108));
        if (!class6108.method18208(Class6637.class)) {
            class6108.method18209(new Class6637(class6108));
        }
    }
    
    public static int method16332(int n) {
        if (n <= 8573) {
            if (n <= 8463) {
                if (n <= 8458) {
                    if (n > 1126) {
                        ++n;
                    }
                }
                else {
                    n = 8470 + (n - 8459) * 2;
                }
            }
            else {
                n += 16;
            }
        }
        else {
            n += 17;
        }
        return n;
    }
    
    public static int method16333(final int n) {
        int n2 = n;
        if (n >= 561) {
            n2 += 5;
        }
        return n2;
    }
}
