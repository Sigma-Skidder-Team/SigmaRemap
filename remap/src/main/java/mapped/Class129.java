// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import org.apache.logging.log4j.LogManager;
import java.util.Locale;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import org.apache.logging.log4j.Logger;

public class Class129 extends Class126
{
    private static final Logger field388;
    public static final Class2095 field389;
    private final String field390;
    private final Class2095 field391;
    private final byte field392;
    private final int field393;
    private final boolean field394;
    
    private Class129(final Class122[] array, final String field390, final Class2095 field391, final byte field392, final int field393, final boolean field394) {
        super(array);
        this.field390 = field390;
        this.field391 = field391;
        this.field392 = field392;
        this.field393 = field393;
        this.field394 = field394;
    }
    
    @Override
    public Set<Class7915<?>> method635() {
        return (Set<Class7915<?>>)ImmutableSet.of((Object)Class6683.field26367);
    }
    
    @Override
    public ItemStack method639(final ItemStack class8321, final Class7529 class8322) {
        if (class8321.getItem() == Items.field31521) {
            final BlockPos class8323 = class8322.method23579(Class6683.field26367);
            if (class8323 != null) {
                final Class1849 method23588 = class8322.method23588();
                final BlockPos method23589 = method23588.method6915(this.field390, class8323, this.field393, this.field394);
                if (method23589 != null) {
                    final ItemStack method23590 = Class4094.method12326(method23588, method23589.getX(), method23589.getZ(), this.field392, true, true);
                    Class4094.method12335(method23588, method23590);
                    Class6356.method18917(method23590, method23589, "+", this.field391);
                    method23590.method27665(new Class2259("filled_map." + this.field390.toLowerCase(Locale.ROOT), new Object[0]));
                    return method23590;
                }
            }
            return class8321;
        }
        return class8321;
    }
    
    public static Class4956 method643() {
        return new Class4956();
    }
    
    static {
        field388 = LogManager.getLogger();
        field389 = Class2095.field12119;
    }
}
