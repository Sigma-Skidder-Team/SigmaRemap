// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.text.ITextComponent;

import javax.annotation.Nullable;

public enum Class2048
{
    field11668, 
    field11669((ITextComponent)new Class2259("block.minecraft.bed.no_sleep", new Object[0])),
    field11670((ITextComponent)new Class2259("block.minecraft.bed.too_far_away", new Object[0])),
    field11671((ITextComponent)new Class2259("block.minecraft.bed.obstructed", new Object[0])),
    field11672, 
    field11673((ITextComponent)new Class2259("block.minecraft.bed.not_safe", new Object[0]));
    
    private final ITextComponent field11674;
    
    private Class2048() {
        this.field11674 = null;
    }
    
    private Class2048(final ITextComponent field11674) {
        this.field11674 = field11674;
    }
    
    @Nullable
    public ITextComponent method8136() {
        return this.field11674;
    }
}
