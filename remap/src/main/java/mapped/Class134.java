// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.util.math.MathHelper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class134 extends Class126
{
    private static final Logger field406;
    private final Class5772 field407;
    
    private Class134(final Class122[] array, final Class5772 field407) {
        super(array);
        this.field407 = field407;
    }
    
    @Override
    public ItemStack method639(final ItemStack class8321, final Class7529 class8322) {
        if (!class8321.method27630()) {
            Class134.field406.warn("Couldn't set damage of loot item {}", (Object)class8321);
        }
        else {
            class8321.method27633(MathHelper.method35642((1.0f - this.field407.method17169(class8322.method23586())) * class8321.method27634()));
        }
        return class8321;
    }
    
    public static Class4943<?> method669(final Class5772 class5772) {
        return Class126.method640(array2 -> new Class134(array2, class5773));
    }
    
    static {
        field406 = LogManager.getLogger();
    }
}
