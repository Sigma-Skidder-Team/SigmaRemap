// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;

import java.util.function.Predicate;

public class Class176 implements Predicate<ItemStack>
{
    private static String[] field504;
    private final Class7909<Item> field505;
    private final Class51 field506;
    
    public Class176(final Class7909<Item> field505, final Class51 field506) {
        this.field505 = field505;
        this.field506 = field506;
    }
    
    @Override
    public boolean test(final ItemStack class8321) {
        return this.field505.method25618(class8321.getItem()) && Class9346.method34642(this.field506, class8321.method27657(), true);
    }
}