// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;

public class Class6600 extends Class6601
{
    private static String[] field26168;
    public final /* synthetic */ Class7318 field26169;
    public final /* synthetic */ Class3422 field26170;
    
    public Class6600(final Class3422 field26170, final Class446 class446, final int n, final int n2, final int n3, final Class7318 field26171) {
        this.field26170 = field26170;
        this.field26169 = field26171;
        super(class446, n, n2, n3);
    }
    
    @Override
    public boolean method20046(final ItemStack class8321) {
        return false;
    }
    
    @Override
    public ItemStack method20047(final Class512 class512, final ItemStack class513) {
        if (!this.field26170.field16176.method20060(1).method27620()) {
            Class3422.method10914(this.field26170);
        }
        class513.method27622().method11723(class513, class512.world, class512);
        this.field26169.method22437((class514, class515) -> {
            class514.method6754();
            final long n;
            if (Class3422.method10915(this.field26170) != n) {
                class514.method6705(null, class515, Class8520.field35666, Class286.field1582, 1.0f, 1.0f);
                Class3422.method10916(this.field26170, n);
            }
            return;
        });
        return super.method20047(class512, class513);
    }
}
