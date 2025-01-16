// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;

public class Class6622 extends Class6601
{
    private static String[] field26171;
    public final /* synthetic */ Class7318 field26202;
    public final /* synthetic */ Class3439 field26203;
    
    public Class6622(final Class3439 field26203, final IInventory class446, final int n, final int n2, final int n3, final Class7318 field26204) {
        this.field26203 = field26203;
        this.field26202 = field26204;
        super(class446, n, n2, n3);
    }
    
    @Override
    public boolean method20046(final ItemStack class8321) {
        return false;
    }
    
    @Override
    public ItemStack method20047(final PlayerEntity playerEntity, final ItemStack class513) {
        Class3439.method10984(this.field26203).method20060(1);
        Class3439.method10985(this.field26203).method20060(1);
        if (!Class3439.method10984(this.field26203).method20054() || !Class3439.method10985(this.field26203).method20054()) {
            Class3439.method10986(this.field26203).method19833(0);
        }
        this.field26202.method22437((class514, class515) -> {
            class514.method6754();
            final long n;
            if (Class3439.method10987(this.field26203) != n) {
                class514.method6705(null, class515, Class8520.field35664, Class286.field1582, 1.0f, 1.0f);
                Class3439.method10988(this.field26203, n);
            }
            return;
        });
        return super.method20047(playerEntity, class513);
    }
}
