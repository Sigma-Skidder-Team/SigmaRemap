// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public abstract class Class6810<T, C extends Class8183<T>>
{
    private final ResourceLocation field26748;
    private final Class<?> field26749;
    
    public Class6810(final ResourceLocation field26748, final Class<?> field26749) {
        this.field26748 = field26748;
        this.field26749 = field26749;
    }
    
    public ResourceLocation method20844() {
        return this.field26748;
    }
    
    public Class<?> method20845() {
        return this.field26749;
    }
    
    public abstract void method20843(final CompoundNBT p0, final C p1);
    
    public abstract C method20842(final CompoundNBT p0);
}
