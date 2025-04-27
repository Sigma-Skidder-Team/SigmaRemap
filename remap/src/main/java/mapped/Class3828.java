// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Maps;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;

public class Class3828 extends Item
{
    private static final Map<Class7795, Class3828> field17379;
    private final int field17380;
    private final Class7795 field17381;
    
    public Class3828(final int field17380, final Class7795 field17381, final Properties properties) {
        super(properties);
        this.field17380 = field17380;
        this.field17381 = field17381;
        Class3828.field17379.put(this.field17381, this);
    }
    
    @Override
    public Class2201 method11694(final Class7075 class7075) {
        final World method21654 = class7075.method21654();
        final BlockPos method21655 = class7075.method21639();
        final BlockState method21656 = method21654.getBlockState(method21655);
        if (method21656.getBlock() == Blocks.field29335 && !method21656.get(Class3931.field17811)) {
            final ItemStack method21657 = class7075.method21651();
            if (!method21654.isRemote) {
                ((Class3931) Blocks.field29335).method12048(method21654, method21655, method21656, method21657);
                method21654.method6839(null, 1010, method21655, Item.method11696(this));
                method21657.method27693(1);
                final PlayerEntity method21658 = class7075.method21652();
                if (method21658 != null) {
                    method21658.method2857(Class8276.field34040);
                }
            }
            return Class2201.field13400;
        }
        return Class2201.field13402;
    }
    
    public int method11763() {
        return this.field17380;
    }
    
    @Override
    public void addInformation(final ItemStack class8321, final World class8322, final List<ITextComponent> list, final ITooltipFlag class8323) {
        list.add(this.method11764().applyTextStyle(TextFormatting.GRAY));
    }
    
    public ITextComponent method11764() {
        return new Class2259(this.getTranslationKey() + ".desc");
    }
    
    @Nullable
    public static Class3828 method11765(final Class7795 class7795) {
        return Class3828.field17379.get(class7795);
    }
    
    public Class7795 method11766() {
        return this.field17381;
    }
    
    static {
        field17379 = Maps.newHashMap();
    }
}
