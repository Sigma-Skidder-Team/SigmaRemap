// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import org.apache.logging.log4j.LogManager;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.function.UnaryOperator;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import org.apache.logging.log4j.Logger;

public class Class146 extends Class126
{
    private static final Logger field429;
    private final ITextComponent field430;
    private final Class2065 field431;
    
    private Class146(final Class122[] array, final ITextComponent field430, final Class2065 field431) {
        super(array);
        this.field430 = field430;
        this.field431 = field431;
    }
    
    @Override
    public Set<Class7915<?>> method635() {
        return (Set<Class7915<?>>)((this.field431 == null) ? ImmutableSet.of() : ImmutableSet.of((Object)this.field431.method8153()));
    }
    
    public static UnaryOperator<ITextComponent> method706(final Class7529 class7529, final Class2065 class7530) {
        if (class7530 != null && class7529.method23579(class7530.method8153()) != null) {
            return (UnaryOperator<ITextComponent>)(class7534 -> {
                final Entity class7535;
                class7535.method1924().method23241(2);
                try {
                    return Class9479.method35294(class7531, class7534, class7533, 0);
                }
                catch (final CommandSyntaxException ex) {
                    Class146.field429.warn("Failed to resolve text component", (Throwable)ex);
                    return class7534;
                }
            });
        }
        return (UnaryOperator<ITextComponent>)(class7536 -> class7536);
    }
    
    @Override
    public ItemStack method639(final ItemStack class8321, final Class7529 class8322) {
        if (this.field430 != null) {
            class8321.method27665(method706(class8322, this.field431).apply(this.field430));
        }
        return class8321;
    }
    
    static {
        field429 = LogManager.getLogger();
    }
}
