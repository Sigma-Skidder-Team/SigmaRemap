// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.text.ITextComponent;

public enum Class2226
{
    field13697(new Class2259("options.mainHand.left", new Object[0])),
    field13698(new Class2259("options.mainHand.right", new Object[0]));
    
    private final ITextComponent field13699;
    
    Class2226(final ITextComponent field13699) {
        this.field13699 = field13699;
    }
    
    public Class2226 method8419() {
        return (this != Class2226.field13697) ? Class2226.field13697 : Class2226.field13698;
    }
    
    @Override
    public String toString() {
        return this.field13699.getString();
    }
}
