// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6061<T> implements Class6058<T>
{
    private static String[] field24638;
    private final Class94<T> field24639;
    private final T field24640;
    
    public Class6061(final Class94<T> field24639, final T field24640) {
        this.field24639 = field24639;
        this.field24640 = field24640;
    }
    
    @Override
    public int method18026(final T t) {
        final boolean method563 = this.field24639.method563(t) != 0;
        return (((method563 ? 1 : 0) != -1) ? method563 : false) ? 1 : 0;
    }
    
    @Override
    public boolean method18027(final T t) {
        return true;
    }
    
    @Override
    public T method18028(final int n) {
        final T method499 = this.field24639.method499(n);
        return (method499 != null) ? method499 : this.field24640;
    }
    
    @Override
    public void method18029(final Class8654 class8654) {
    }
    
    @Override
    public void method18030(final Class8654 class8654) {
    }
    
    @Override
    public int method18031() {
        return Class8654.method29484(0);
    }
    
    @Override
    public void method18032(final Class52 class52) {
    }
}
