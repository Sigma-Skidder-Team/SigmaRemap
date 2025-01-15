// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public abstract class Class6546
{
    private int field26016;
    
    public static Class6546 method19834(final Class7604 class7604, final int n) {
        return new Class6545(class7604, n);
    }
    
    public static Class6546 method19835(final int[] array, final int n) {
        return new Class6547(array, n);
    }
    
    public static Class6546 method19836() {
        return new Class6548();
    }
    
    public abstract int method19832();
    
    public abstract void method19833(final int p0);
    
    public boolean method19837() {
        final int method19832 = this.method19832();
        final boolean b = method19832 != this.field26016;
        this.field26016 = method19832;
        return b;
    }
}
