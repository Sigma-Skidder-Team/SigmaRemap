// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.text.ITextComponent;

public class Class8545
{
    private static String[] field35887;
    public static final Class5093 field35888;
    private final ITextComponent field35889;
    private final int field35890;
    
    public Class8545(final ITextComponent field35889, final int field35890) {
        this.field35889 = field35889;
        this.field35890 = field35890;
    }
    
    public ITextComponent method28688() {
        return this.field35889;
    }
    
    public int method28689() {
        return this.field35890;
    }
    
    static {
        field35888 = new Class5093();
    }
}
