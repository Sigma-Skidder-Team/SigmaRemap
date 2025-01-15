// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public abstract class Class6810<T, C extends Class8183<T>>
{
    private final Class1932 field26748;
    private final Class<?> field26749;
    
    public Class6810(final Class1932 field26748, final Class<?> field26749) {
        this.field26748 = field26748;
        this.field26749 = field26749;
    }
    
    public Class1932 method20844() {
        return this.field26748;
    }
    
    public Class<?> method20845() {
        return this.field26749;
    }
    
    public abstract void method20843(final Class51 p0, final C p1);
    
    public abstract C method20842(final Class51 p0);
}
