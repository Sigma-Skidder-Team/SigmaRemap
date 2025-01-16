// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.Map;

public class Class6618 extends Class6601
{
    private static String[] field26171;
    public final /* synthetic */ Class7318 field26195;
    public final /* synthetic */ Class3440 field26196;
    
    public Class6618(final Class3440 field26196, final IInventory class446, final int n, final int n2, final int n3, final Class7318 field26197) {
        this.field26196 = field26196;
        this.field26195 = field26197;
        super(class446, n, n2, n3);
    }
    
    @Override
    public boolean method20046(final ItemStack class8321) {
        return false;
    }
    
    @Override
    public ItemStack method20047(final PlayerEntity playerEntity, final ItemStack class513) {
        this.field26195.method22437((class514, class515) -> {
            this.method20067(class514);
            final int i;
            while (i > 0) {
                Class508.method2609(i);
                final int n;
                class514.method6886(new Class508(class514, class515.getX(), class515.getY() + 0.5, class515.getZ() + 0.5, n));
            }
            class514.method6955(1042, class515, 0);
            return;
        });
        Class3440.method10994(this.field26196).method2160(0, ItemStack.EMPTY);
        Class3440.method10994(this.field26196).method2160(1, ItemStack.EMPTY);
        return class513;
    }
    
    private int method20067(final World class1847) {
        final int n = 0 + this.method20068(Class3440.method10994(this.field26196).method2157(0)) + this.method20068(Class3440.method10994(this.field26196).method2157(1));
        if (n <= 0) {
            return 0;
        }
        final int bound = (int)Math.ceil(n / 2.0);
        return bound + class1847.rand.nextInt(bound);
    }
    
    private int method20068(final ItemStack class8321) {
        int n = 0;
        for (final Map.Entry<Class6257, V> entry : Class8742.method30196(class8321).entrySet()) {
            final Class6257 class8322 = entry.getKey();
            final Integer n2 = (Integer)entry.getValue();
            if (class8322.method18604()) {
                continue;
            }
            n += class8322.method18586(n2);
        }
        return n;
    }
}
