// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableMap;

public class Class7100 extends StateHolder<Fluid, IFluidState> implements IFluidState
{
    private static String[] field27628;
    
    public Class7100(final Fluid class7255, final ImmutableMap<IProperty<?>, Comparable<?>> immutableMap) {
        super(class7255, immutableMap);
    }
    
    @Override
    public Fluid getFluid() {
        return this.object;
    }
}
