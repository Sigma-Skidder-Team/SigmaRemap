// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.text.ITextComponent;

import java.util.Collection;

public abstract class Team
{
    public boolean method20565(final Team class6750) {
        return class6750 != null && this == class6750;
    }
    
    public abstract String method20539();
    
    public abstract ITextComponent method20548(final ITextComponent p0);
    
    public abstract boolean method20552();
    
    public abstract boolean method20550();
    
    public abstract Class2097 method20554();
    
    public abstract TextFormatting getColor();
    
    public abstract Collection<String> method20547();
    
    public abstract Class2097 method20555();
    
    public abstract Class343 method20558();
}
