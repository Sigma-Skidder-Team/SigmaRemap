// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;

public class Class6628 extends Class6601
{
    private static String[] field26171;
    public final /* synthetic */ Class7318 field26212;
    public final /* synthetic */ Class3417 field26213;
    
    public Class6628(final Class3417 field26213, final IInventory class446, final int n, final int n2, final int n3, final Class7318 field26214) {
        this.field26213 = field26213;
        this.field26212 = field26214;
        super(class446, n, n2, n3);
    }
    
    @Override
    public boolean method20046(final ItemStack class8321) {
        return false;
    }
    
    @Override
    public ItemStack method20060(final int n) {
        final ItemStack class8321 = this.field26212.method22435((class8325, p2) -> {
            if (!Class3417.method10865(this.field26213)) {
                if (this.field26213.field16148.getStackInSlot(1).getItem() == Items.field30967) {
                    Class4094.method12337(class8325, this.field26213.field16148.getStackInSlot(0));
                    final ItemStack class8326;
                    if (class8326 != null) {
                        class8326.method27691(1);
                        return class8326;
                    }
                }
            }
            return class8323;
        }).orElse(super.method20060(n));
        this.field26213.field16148.method2158(0, 1);
        this.field26213.field16148.method2158(1, 1);
        return class8321;
    }
    
    @Override
    public void method20050(final ItemStack class8321, final int n) {
        this.method20060(n);
        super.method20050(class8321, n);
    }
    
    @Override
    public ItemStack method20047(final PlayerEntity playerEntity, final ItemStack class513) {
        class513.getItem().method11723(class513, playerEntity.world, playerEntity);
        this.field26212.method22437((class514, class515) -> {
            class514.method6754();
            final long n;
            if (Class3417.method10863(this.field26213) != n) {
                class514.method6705(null, class515, Class8520.field35665, Class286.field1582, 1.0f, 1.0f);
                Class3417.method10864(this.field26213, n);
            }
            return;
        });
        return super.method20047(playerEntity, class513);
    }
}
