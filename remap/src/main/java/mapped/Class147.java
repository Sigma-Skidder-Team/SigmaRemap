// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Supplier;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.StringReader;
import java.util.Collection;
import com.google.common.collect.ImmutableList;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.INBT;

import java.util.function.Function;
import java.util.List;

public class Class147 extends Class126
{
    private final Class2053 field432;
    private final List<Class9254> field433;
    private static final Function<Entity, INBT> field434;
    private static final Function<Class436, INBT> field435;
    
    private Class147(final Class122[] array, final Class2053 field432, final List<Class9254> list) {
        super(array);
        this.field432 = field432;
        this.field433 = (List<Class9254>)ImmutableList.copyOf((Collection)list);
    }
    
    private static Class8570 method711(final String str) {
        try {
            return new Class8258().parse(new StringReader(str));
        }
        catch (final CommandSyntaxException cause) {
            throw new IllegalArgumentException("Failed to parse path " + str, (Throwable)cause);
        }
    }
    
    @Override
    public Set<Class7915<?>> method635() {
        return (Set<Class7915<?>>)ImmutableSet.of((Object)this.field432.field11717);
    }
    
    @Override
    public ItemStack method639(final ItemStack class8321, final Class7529 class8322) {
        if (this.field432.field11718.apply(class8322) != null) {
            this.field433.forEach(class8325 -> class8325.method34144((Supplier<INBT>)class8323::method27658, class8324));
        }
        return class8321;
    }
    
    public static Class4954 method712(final Class2053 class2053) {
        return new Class4954(class2053, null);
    }
    
    static {
        field434 = Class7103::method21808;
        field435 = (class436 -> class436.method2180(new Class51()));
    }
}
