// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipeType;
import org.apache.logging.log4j.LogManager;
import java.util.function.Function;
import java.util.Optional;
import org.apache.logging.log4j.Logger;

public class Class135 extends Class126
{
    private static final Logger field408;
    
    private Class135(final Class122[] array) {
        super(array);
    }
    
    @Override
    public ItemStack method639(final ItemStack class8321, final Class7529 class8322) {
        if (!class8321.method27620()) {
            final Optional<Class3684> method6378 = class8322.method23588().method6792().method6378(IRecipeType.field37844, new Class443(class8321), class8322.method23588());
            if (method6378.isPresent()) {
                final ItemStack method6379 = method6378.get().getRecipeOutput();
                if (!method6379.method27620()) {
                    final ItemStack method6380 = method6379.method27641();
                    method6380.method27691(class8321.method27690());
                    return method6380;
                }
            }
            Class135.field408.warn("Couldn't smelt {} because there is no smelting recipe", class8321);
            return class8321;
        }
        return class8321;
    }
    
    public static Class4943<?> method672() {
        return Class126.method640(Class135::new);
    }
    
    static {
        field408 = LogManager.getLogger();
    }
}
