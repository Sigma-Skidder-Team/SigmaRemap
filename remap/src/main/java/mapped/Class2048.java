// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;

public enum Class2048
{
    field11668, 
    field11669((Class2250)new Class2259("block.minecraft.bed.no_sleep", new Object[0])), 
    field11670((Class2250)new Class2259("block.minecraft.bed.too_far_away", new Object[0])), 
    field11671((Class2250)new Class2259("block.minecraft.bed.obstructed", new Object[0])), 
    field11672, 
    field11673((Class2250)new Class2259("block.minecraft.bed.not_safe", new Object[0]));
    
    private final Class2250 field11674;
    
    private Class2048() {
        this.field11674 = null;
    }
    
    private Class2048(final Class2250 field11674) {
        this.field11674 = field11674;
    }
    
    @Nullable
    public Class2250 method8136() {
        return this.field11674;
    }
}
