// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class7070
{
    private static String[] field27529;
    private final Class7363 field27530;
    private final Class field27531;
    private int field27532;
    private Class7364[] field27533;
    
    public Class7070(final Class7363 field27530, final Class field27531, final int n) {
        this.field27530 = field27530;
        this.field27531 = field27531;
        if (field27530.method22623()) {
            if (field27531 != null) {
                this.field27533 = new Class7364[n];
                for (int i = 0; i < this.field27533.length; ++i) {
                    this.field27533[i] = new Class7364(field27530, field27531, i);
                }
            }
        }
    }
    
    public Class7363 method21621() {
        return this.field27530;
    }
    
    public Class method21622() {
        return this.field27531;
    }
    
    public int method21623() {
        return this.field27532;
    }
    
    public Class7364 method21624(final int n) {
        return (n >= 0 && n < this.field27533.length) ? this.field27533[n] : null;
    }
    
    public Object method21625(final Object o, final int n) {
        return Class9570.method35831(o, this, n);
    }
}
