// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Multimap;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.world.World;

import java.util.Map;

public class Class4076 extends Class4071
{
    private final float field18179;
    public static final Map<Block, Class7096> field18180;
    
    public Class4076(final Class2038 class2038, final float field18179, final Properties class2039) {
        super(class2038, class2039);
        this.field18179 = field18179;
    }
    
    @Override
    public Class2201 method11694(final Class7075 class7075) {
        final World method21654 = class7075.method21654();
        final BlockPos method21655 = class7075.method21639();
        if (class7075.method21648() != Direction.DOWN) {
            if (method21654.getBlockState(method21655.method1137()).method21706()) {
                final Class7096 class7076 = Class4076.field18180.get(method21654.getBlockState(method21655).method21696());
                if (class7076 != null) {
                    final PlayerEntity method21656 = class7075.method21652();
                    method21654.method6705(method21656, method21655, Class8520.field35264, Class286.field1582, 1.0f, 1.0f);
                    if (!method21654.isRemote) {
                        method21654.setBlockState(method21655, class7076, 11);
                        if (method21656 != null) {
                            class7075.method21651().method27636(1, method21656, class7078 -> class7078.method2795(class7077.method21653()));
                        }
                    }
                    return Class2201.field13400;
                }
            }
        }
        return Class2201.field13402;
    }
    
    @Override
    public boolean method11711(final ItemStack class8321, final LivingEntity class8322, final LivingEntity class8323) {
        class8321.method27636(1, class8323, class8324 -> class8324.method2794(Class2215.field13600));
        return true;
    }
    
    @Override
    public Multimap<String, Class7919> method11739(final Class2215 class2215) {
        final Multimap<String, Class7919> method11739 = super.method11739(class2215);
        if (class2215 == Class2215.field13600) {
            method11739.put((Object)Class8107.field33410.method29978(), (Object)new Class7919(Class4076.field17361, "Weapon modifier", 0.0, Class2157.field12809));
            method11739.put((Object)Class8107.field33412.method29978(), (Object)new Class7919(Class4076.field17362, "Weapon modifier", this.field18179, Class2157.field12809));
        }
        return method11739;
    }
    
    static {
        field18180 = Maps.newHashMap((Map)ImmutableMap.of(Blocks.GRASS_BLOCK, Blocks.field29298.getDefaultState(), Blocks.GRASS_PATH, Blocks.field29298.getDefaultState(), Blocks.DIRT, Blocks.field29298.getDefaultState(), (Object) Blocks.COARSE_DIRT, (Object) Blocks.DIRT.getDefaultState()));
    }
}
