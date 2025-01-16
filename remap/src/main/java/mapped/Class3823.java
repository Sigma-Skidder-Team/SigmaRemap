// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import org.apache.logging.log4j.LogManager;
import java.util.Optional;
import java.util.ArrayList;

import com.google.common.collect.Lists;
import org.apache.logging.log4j.Logger;

public class Class3823 extends Item
{
    private static final Logger field17375;
    
    public Class3823(final Class8959 class8959) {
        super(class8959);
    }
    
    @Override
    public Class9355<ItemStack> method11695(final World class1847, final PlayerEntity class1848, final Class316 class1849) {
        final ItemStack method2715 = class1848.method2715(class1849);
        final Class51 method2716 = method2715.method27657();
        if (!class1848.field3025.field27304) {
            class1848.method2716(class1849, ItemStack.field34174);
        }
        if (method2716 != null && method2716.method316("Recipes", 9)) {
            if (!class1847.isRemote) {
                final Class52 method2717 = method2716.method328("Recipes", 8);
                final ArrayList arrayList = Lists.newArrayList();
                final Class1780 method2718 = class1847.getServer().method1577();
                for (int i = 0; i < method2717.size(); ++i) {
                    final String method2719 = method2717.method353(i);
                    final Optional<? extends Class3662<?>> method2720 = method2718.method6382(new ResourceLocation(method2719));
                    if (!method2720.isPresent()) {
                        Class3823.field17375.error("Invalid recipe: {}", (Object)method2719);
                        return Class9355.method34677(method2715);
                    }
                    arrayList.add(method2720.get());
                }
                class1848.method2862(arrayList);
                class1848.method2859(Class8276.field33981.method8449(this));
            }
            return Class9355.method34674(method2715);
        }
        Class3823.field17375.error("Tag not valid: {}", (Object)method2716);
        return Class9355.method34677(method2715);
    }
    
    static {
        field17375 = LogManager.getLogger();
    }
}
