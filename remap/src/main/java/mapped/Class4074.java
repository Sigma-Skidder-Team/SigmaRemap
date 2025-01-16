// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.world.World;

import java.util.Map;
import java.util.Set;

public class Class4074 extends Class4072
{
    private static String[] field18173;
    private static final Set<Block> field18174;
    public static final Map<Block, BlockState> field18175;
    
    public Class4074(final Class2038 class2038, final float n, final float n2, final Class8959 class2039) {
        super(n, n2, class2038, Class4074.field18174, class2039);
    }
    
    @Override
    public boolean method11713(final BlockState class7096) {
        final Block method21696 = class7096.getBlock();
        return method21696 == Blocks.field29329 || method21696 == Blocks.field29331;
    }
    
    @Override
    public Class2201 method11694(final Class7075 class7075) {
        final World method21654 = class7075.method21654();
        final BlockPos method21655 = class7075.method21639();
        final BlockState method21656 = method21654.getBlockState(method21655);
        if (class7075.method21648() == Direction.DOWN) {
            return Class2201.field13402;
        }
        final PlayerEntity method21657 = class7075.method21652();
        final BlockState class7076 = Class4074.field18175.get(method21656.getBlock());
        BlockState class7077 = null;
        if (class7076 != null && method21654.getBlockState(method21655.method1137()).method21706()) {
            method21654.method6705(method21657, method21655, Class8520.field35547, Class286.field1582, 1.0f, 1.0f);
            class7077 = class7076;
        }
        else if (method21656.getBlock() instanceof Class3918) {
            if (((StateHolder<Object, BlockState>)method21656).get((IProperty<Boolean>)Class3918.field17760)) {
                method21654.method6839(null, 1009, method21655, 0);
                class7077 = ((StateHolder<Object, BlockState>)method21656).with((IProperty<Comparable>)Class3918.field17760, false);
            }
        }
        if (class7077 == null) {
            return Class2201.field13402;
        }
        if (!method21654.isRemote) {
            method21654.setBlockState(method21655, class7077, 11);
            if (method21657 != null) {
                class7075.method21651().method27636(1, method21657, class7079 -> class7079.method2795(class7078.method21653()));
            }
        }
        return Class2201.field13400;
    }
    
    static {
        field18174 = Sets.newHashSet((Object[])new Block[] { Blocks.field29333, Blocks.DIRT, Blocks.COARSE_DIRT, Blocks.PODZOL, Blocks.field29298, Blocks.GRASS_BLOCK, Blocks.field29177, Blocks.field29392, Blocks.field29175, Blocks.field29176, Blocks.field29331, Blocks.field29329, Blocks.field29339, Blocks.GRASS_PATH, Blocks.WHITE_CONCRETE_POWDER, Blocks.ORANGE_CONCRETE_POWDER, Blocks.MAGENTA_CONCRETE_POWDER, Blocks.LIGHT_BLUE_CONCRETE_POWDER, Blocks.YELLOW_CONCRETE_POWDER, Blocks.LIME_CONCRETE_POWDER, Blocks.PINK_CONCRETE_POWDER, Blocks.GRAY_CONCRETE_POWDER, Blocks.LIGHT_GRAY_CONCRETE_POWDER, Blocks.CYAN_CONCRETE_POWDER, Blocks.PURPLE_CONCRETE_POWDER, Blocks.BLUE_CONCRETE_POWDER, Blocks.BROWN_CONCRETE_POWDER, Blocks.GREEN_CONCRETE_POWDER, Blocks.RED_CONCRETE_POWDER, Blocks.BLACK_CONCRETE_POWDER});
        field18175 = Maps.newHashMap((Map)ImmutableMap.of((Object) Blocks.GRASS_BLOCK, (Object) Blocks.GRASS_PATH.getDefaultState()));
    }
}
