// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;

public class Class6606 extends Class6601
{
    private static String[] field26171;
    public final /* synthetic */ Class7318 field26183;
    public final /* synthetic */ Class3441 field26184;
    
    public Class6606(final Class3441 field26184, final Class446 class446, final int n, final int n2, final int n3, final Class7318 field26185) {
        this.field26184 = field26184;
        this.field26183 = field26185;
        super(class446, n, n2, n3);
    }
    
    @Override
    public boolean method20046(final ItemStack class8321) {
        return false;
    }
    
    @Override
    public boolean method20061(final PlayerEntity playerEntity) {
        if (playerEntity.field3025.field27304 || playerEntity.field3026 >= Class3441.method11001(this.field26184).method19832()) {
            if (Class3441.method11001(this.field26184).method19832() > 0) {
                if (this.method20054()) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public ItemStack method20047(final PlayerEntity playerEntity, final ItemStack class513) {
        if (!playerEntity.field3025.field27304) {
            playerEntity.method2874(-Class3441.method11001(this.field26184).method19832());
        }
        Class3441.method11002(this.field26184).method2160(0, ItemStack.field34174);
        if (Class3441.method11003(this.field26184) <= 0) {
            Class3441.method11002(this.field26184).method2160(1, ItemStack.field34174);
        }
        else {
            final ItemStack method2157 = Class3441.method11002(this.field26184).method2157(1);
            if (!method2157.method27620() && method2157.method27690() > Class3441.method11003(this.field26184)) {
                method2157.method27693(Class3441.method11003(this.field26184));
                Class3441.method11002(this.field26184).method2160(1, method2157);
            }
            else {
                Class3441.method11002(this.field26184).method2160(1, ItemStack.field34174);
            }
        }
        Class3441.method11001(this.field26184).method19833(0);
        this.field26183.method22437((class515, class516) -> {
            class515.getBlockState(class516);
            if (!class514.field3025.field27304) {
                final BlockState class517;
                if (!(!class517.method21755(Class7188.field27905))) {
                    if (class514.method2633().nextFloat() < 0.12f) {
                        Class3990.method12139(class517);
                        final BlockState class518;
                        if (class518 != null) {
                            class515.setBlockState(class516, class518, 2);
                            class515.method6955(1030, class516, 0);
                            return;
                        }
                        else {
                            class515.method6690(class516, false);
                            class515.method6955(1029, class516, 0);
                            return;
                        }
                    }
                }
            }
            class515.method6955(1030, class516, 0);
            return;
        });
        return class513;
    }
}
