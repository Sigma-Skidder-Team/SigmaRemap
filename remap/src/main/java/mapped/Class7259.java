// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class7259 extends Class7258
{
    private static String[] field28136;
    
    @Override
    public void method22145(final Class9500<Fluid, IFluidState> class9500) {
        super.method22145(class9500);
        class9500.method35378(Class7259.field28133);
    }
    
    @Override
    public int getLevel(final IFluidState IFluidState) {
        return IFluidState.get(Class7259.field28133);
    }
    
    @Override
    public boolean isSource(final IFluidState IFluidState) {
        return false;
    }
}
