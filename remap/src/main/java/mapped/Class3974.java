// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Maps;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import java.util.Map;

public class Class3974 extends Block
{
    private static String[] field17948;
    private static final Map<Block, Block> field17949;
    public static final VoxelShape field17950;
    private final Block field17951;
    
    public Class3974(final Block field17951, final Class9288 class9288) {
        super(class9288);
        this.field17951 = field17951;
        Class3974.field17949.put(field17951, this);
    }
    
    @Override
    public VoxelShape method11808(final Class7096 class7096, final IBlockReader class7097, final BlockPos class7098, final ISelectionContext class7099) {
        return Class3974.field17950;
    }
    
    @Override
    public Class2115 method11797(final Class7096 class7096) {
        return Class2115.field12307;
    }
    
    @Override
    public Class2201 method11844(final Class7096 class7096, final World class7097, final BlockPos class7098, final PlayerEntity class7099, final Class316 class7100, final BlockRayTraceResult class7101) {
        final ItemStack method2715 = class7099.method2715(class7100);
        final Item method2716 = method2715.getItem();
        final Block class7102 = (method2716 instanceof Class4036) ? Class3974.field17949.getOrDefault(((Class4036)method2716).method12240(), Blocks.AIR) : Blocks.AIR;
        final boolean b = class7102 == Blocks.AIR;
        final boolean b2 = this.field17951 == Blocks.AIR;
        if (b == b2) {
            return Class2201.field13401;
        }
        if (!b2) {
            final ItemStack class7103 = new ItemStack(this.field17951);
            if (!method2715.method27620()) {
                if (!class7099.method2885(class7103)) {
                    class7099.method2822(class7103, false);
                }
            }
            else {
                class7099.method2716(class7100, class7103);
            }
            class7097.setBlockState(class7098, Blocks.field29420.getDefaultState(), 3);
        }
        else {
            class7097.setBlockState(class7098, class7102.getDefaultState(), 3);
            class7099.method2857(Class8276.field34036);
            if (!class7099.field3025.field27304) {
                method2715.method27693(1);
            }
        }
        return Class2201.field13400;
    }
    
    @Override
    public ItemStack method11862(final IBlockReader class1855, final BlockPos class1856, final Class7096 class1857) {
        return (this.field17951 != Blocks.AIR) ? new ItemStack(this.field17951) : super.method11862(class1855, class1856, class1857);
    }
    
    @Override
    public Class7096 method11789(final Class7096 class7096, final Direction class7097, final Class7096 class7098, final Class1851 class7099, final BlockPos class7100, final BlockPos class7101) {
        return (class7097 == Direction.DOWN && !class7096.method21752(class7099, class7100)) ? Blocks.AIR.getDefaultState() : super.method11789(class7096, class7097, class7098, class7099, class7100, class7101);
    }
    
    public Block method12114() {
        return this.field17951;
    }
    
    static {
        field17949 = Maps.newHashMap();
        field17950 = Block.method11778(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
    }
}
