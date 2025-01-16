// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.text.ITextComponent;

public final class Class504 implements Class434
{
    private static String[] field2882;
    private final ITextComponent field2883;
    private final Class502 field2884;
    
    public Class504(final Class502 field2884, final ITextComponent field2885) {
        this.field2884 = field2884;
        this.field2883 = field2885;
    }
    
    @Override
    public ITextComponent method1871() {
        return this.field2883;
    }
    
    @Override
    public Class3418 method2166(final int n, final Class464 class464, final PlayerEntity class465) {
        return this.field2884.method2166(n, class464, class465);
    }
}
