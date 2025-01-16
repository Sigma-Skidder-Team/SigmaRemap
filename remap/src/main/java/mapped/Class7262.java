// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class7262 extends Class7261
{
    private static String[] field28138;
    
    @Override
    public void method22145(final Class9500<Fluid, IFluidState> class9500) {
        super.method22145(class9500);
        class9500.method35378(Class7262.field28133);
    }
    
    @Override
    public int method22164(final IFluidState IFluidState) {
        return IFluidState.get((IProperty<Integer>)Class7262.field28133);
    }
    
    @Override
    public boolean method22163(final IFluidState IFluidState) {
        return false;
    }
}
