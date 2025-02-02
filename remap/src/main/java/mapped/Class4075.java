// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableMap$Builder;
import com.google.common.collect.Sets;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Map;
import java.util.Set;

public class Class4075 extends Class4072
{
    private static String[] field18176;
    private static final Set<Block> field18177;
    public static final Map<Block, Block> field18178;
    
    public Class4075(final Class2038 class2038, final float n, final float n2, final Properties class2039) {
        super(n, n2, class2038, Class4075.field18177, class2039);
    }
    
    @Override
    public float method11706(final ItemStack class8321, final Class7096 class8322) {
        final Material method21697 = class8322.method21697();
        if (method21697 != Material.WOOD) {
            if (method21697 != Material.PLANTS) {
                if (method21697 != Material.TALL_PLANTS) {
                    if (method21697 != Material.BAMBOO) {
                        return super.method11706(class8321, class8322);
                    }
                }
            }
        }
        return this.field18168;
    }
    
    @Override
    public Class2201 method11694(final Class7075 class7075) {
        final World method21654 = class7075.method21654();
        final BlockPos method21655 = class7075.method21639();
        final Class7096 method21656 = method21654.getBlockState(method21655);
        final Block class7076 = Class4075.field18178.get(method21656.method21696());
        if (class7076 == null) {
            return Class2201.field13402;
        }
        final PlayerEntity method21657 = class7075.method21652();
        method21654.method6705(method21657, method21655, Class8520.field34994, Class286.field1582, 1.0f, 1.0f);
        if (!method21654.isRemote) {
            method21654.setBlockState(method21655, (Class7096)((StateHolder<Object, Object>)class7076.getDefaultState()).with(Class4027.field18120, (Comparable)method21656.method21772((IProperty<V>)Class4027.field18120)), 11);
            if (method21657 != null) {
                class7075.method21651().method27636(1, method21657, class7078 -> class7078.method2795(class7077.method21653()));
            }
        }
        return Class2201.field13400;
    }
    
    static {
        field18177 = Sets.newHashSet((Object[])new Block[] { Blocks.OAK_PLANKS, Blocks.SPRUCE_PLANKS, Blocks.BIRCH_PLANKS, Blocks.JUNGLE_PLANKS, Blocks.ACACIA_PLANKS, Blocks.DARK_OAK_PLANKS, Blocks.BOOKSHELF, Blocks.field29193, Blocks.field29194, Blocks.field29195, Blocks.field29196, Blocks.field29197, Blocks.field29198, Blocks.field29181, Blocks.field29182, Blocks.field29183, Blocks.field29184, Blocks.field29185, Blocks.field29186, Blocks.CHEST, Blocks.field29337, Blocks.field29342, Blocks.field29343, Blocks.field29383, Blocks.field29307, Blocks.SCAFFOLDING, Blocks.field29447, Blocks.field29448, Blocks.field29449, Blocks.field29450, Blocks.field29452, Blocks.field29451, Blocks.field29319, Blocks.field29320, Blocks.field29321, Blocks.field29322, Blocks.field29324, Blocks.field29323 });
        field18178 = (Map)new ImmutableMap$Builder().put((Object) Blocks.field29193, (Object) Blocks.field29199).put((Object) Blocks.field29181, (Object) Blocks.field29192).put((Object) Blocks.field29198, (Object) Blocks.field29204).put((Object) Blocks.field29186, (Object) Blocks.field29191).put((Object) Blocks.field29197, (Object) Blocks.field29203).put((Object) Blocks.field29185, (Object) Blocks.field29190).put((Object) Blocks.field29195, (Object) Blocks.field29201).put((Object) Blocks.field29183, (Object) Blocks.field29188).put((Object) Blocks.field29196, (Object) Blocks.field29202).put((Object) Blocks.field29184, (Object) Blocks.field29189).put((Object) Blocks.field29194, (Object) Blocks.field29200).put((Object) Blocks.field29182, (Object) Blocks.field29187).build();
    }
}
