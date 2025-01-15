// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6269 extends Class6257
{
    private static String[] field25131;
    public final Class2119 field25132;
    
    public Class6269(final Class2233 class2233, final Class2119 field25132, final Class2215... array) {
        super(class2233, Class242.field1191, array);
        this.field25132 = field25132;
        if (field25132 == Class2119.field12352) {
            this.field25118 = Class242.field1192;
        }
    }
    
    @Override
    public int method18586(final int n) {
        return this.field25132.method8266() + (n - 1) * this.field25132.method8267();
    }
    
    @Override
    public int method18587(final int n) {
        return this.method18586(n) + this.field25132.method8267();
    }
    
    @Override
    public int method18588() {
        return 4;
    }
    
    @Override
    public int method18594(final int n, final Class7929 class7929) {
        if (class7929.method25711()) {
            return 0;
        }
        if (this.field25132 == Class2119.field12350) {
            return n;
        }
        if (this.field25132 == Class2119.field12351 && class7929.method25719()) {
            return n * 2;
        }
        if (this.field25132 == Class2119.field12352 && class7929 == Class7929.field32572) {
            return n * 3;
        }
        if (this.field25132 == Class2119.field12353 && class7929.method25707()) {
            return n * 2;
        }
        return (this.field25132 == Class2119.field12354 && class7929.method25705()) ? (n * 2) : 0;
    }
    
    @Override
    public boolean method18589(final Class6257 class6257) {
        if (!(class6257 instanceof Class6269)) {
            return super.method18589(class6257);
        }
        final Class6269 class6258 = (Class6269)class6257;
        return this.field25132 != class6258.field25132 && (this.field25132 == Class2119.field12352 || class6258.field25132 == Class2119.field12352);
    }
    
    public static int method18607(final Class511 class511, int n) {
        final int method30206 = Class8742.method30206(Class7882.field32348, class511);
        if (method30206 > 0) {
            n -= Class9546.method35642(n * (float)method30206 * 0.15f);
        }
        return n;
    }
    
    public static double method18608(final Class511 class511, double n) {
        final int method30206 = Class8742.method30206(Class7882.field32350, class511);
        if (method30206 > 0) {
            n -= Class9546.method35644(n * (method30206 * 0.15f));
        }
        return n;
    }
}
