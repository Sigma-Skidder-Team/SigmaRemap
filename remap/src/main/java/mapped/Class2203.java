// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.text.ITextComponent;

public enum Class2203
{
    field13412("enabled"), 
    field13413("disabled"), 
    field13414("prompt");
    
    private final ITextComponent field13415;
    
    Class2203(final String str) {
        this.field13415 = new Class2259("addServer.resourcePack." + str);
    }
    
    public ITextComponent method8380() {
        return this.field13415;
    }
}
