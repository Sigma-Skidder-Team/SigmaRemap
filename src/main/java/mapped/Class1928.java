// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1928 implements Comparable
{
    private int field10521;
    private int field10522;
    private float field10523;
    private Class1928 field10524;
    private float field10525;
    private int field10526;
    private boolean field10527;
    private boolean field10528;
    public final /* synthetic */ Class7290 field10529;
    
    public Class1928(final Class7290 field10529, final int field10530, final int field10531) {
        this.field10529 = field10529;
        this.field10521 = field10530;
        this.field10522 = field10531;
    }
    
    public int method7723(final Class1928 field10524) {
        this.field10526 = field10524.field10526 + 1;
        this.field10524 = field10524;
        return this.field10526;
    }
    
    @Override
    public int compareTo(final Object o) {
        final Class1928 class1928 = (Class1928)o;
        final float n = this.field10525 + this.field10523;
        final float n2 = class1928.field10525 + class1928.field10523;
        if (n < n2) {
            return -1;
        }
        if (n <= n2) {
            return 0;
        }
        return 1;
    }
    
    public void method7724(final boolean field10527) {
        this.field10527 = field10527;
    }
    
    public boolean method7725() {
        return this.field10527;
    }
    
    public void method7726(final boolean field10528) {
        this.field10528 = field10528;
    }
    
    public boolean method7727() {
        return this.field10528;
    }
    
    public void method7728() {
        this.field10528 = false;
        this.field10527 = false;
        this.field10523 = 0.0f;
        this.field10526 = 0;
    }
    
    @Override
    public String toString() {
        return "[Node " + this.field10521 + "," + this.field10522 + "]";
    }
}
