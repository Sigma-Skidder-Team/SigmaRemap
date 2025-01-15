// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6602 extends Class6601
{
    private static String[] field26177;
    private final Class450 field26178;
    private final Class512 field26179;
    private int field26180;
    private final Class822 field26181;
    
    public Class6602(final Class512 field26179, final Class822 field26180, final Class450 field26181, final int n, final int n2, final int n3) {
        super(field26181, n, n2, n3);
        this.field26179 = field26179;
        this.field26181 = field26180;
        this.field26178 = field26181;
    }
    
    @Override
    public boolean method20046(final Class8321 class8321) {
        return false;
    }
    
    @Override
    public Class8321 method20060(final int a) {
        if (this.method20054()) {
            this.field26180 += Math.min(a, this.method20053().method27690());
        }
        return super.method20060(a);
    }
    
    @Override
    public void method20050(final Class8321 class8321, final int n) {
        this.field26180 += n;
        this.method20052(class8321);
    }
    
    @Override
    public void method20052(final Class8321 class8321) {
        class8321.method27651(this.field26179.field2391, this.field26179, this.field26180);
        this.field26180 = 0;
    }
    
    @Override
    public Class8321 method20047(final Class512 class512, final Class8321 class513) {
        this.method20052(class513);
        final Class9017 method2281 = this.field26178.method2281();
        if (method2281 != null) {
            final Class8321 method2282 = this.field26178.method2157(0);
            final Class8321 method2283 = this.field26178.method2157(1);
            if (method2281.method32304(method2282, method2283) || method2281.method32304(method2283, method2282)) {
                this.field26181.method4828(method2281);
                class512.method2857(Class8276.field34022);
                this.field26178.method2160(0, method2282);
                this.field26178.method2160(1, method2283);
            }
            this.field26181.method4827(this.field26181.method4821() + method2281.method32296());
        }
        return class513;
    }
}
