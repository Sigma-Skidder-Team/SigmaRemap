// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.LinkedList;
import com.google.common.collect.Lists;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.world.World;

public class Class4015 extends Block
{
    private static String[] field18089;
    
    public Class4015(final Properties class9288) {
        super(class9288);
    }
    
    @Override
    public void onBlockAdded(final BlockState class7096, final World class7097, final BlockPos class7098, final BlockState class7099, final boolean b) {
        if (class7099.getBlock() != class7096.getBlock()) {
            this.method12197(class7097, class7098);
        }
    }
    
    @Override
    public void method11825(final BlockState class7096, final World class7097, final BlockPos class7098, final Block class7099, final BlockPos class7100, final boolean b) {
        this.method12197(class7097, class7098);
        super.method11825(class7096, class7097, class7098, class7099, class7100, b);
    }
    
    public void method12197(final World class1847, final BlockPos class1848) {
        if (this.method12198(class1847, class1848)) {
            class1847.setBlockState(class1848, Blocks.field29212.getDefaultState(), 2);
            class1847.method6955(2001, class1848, Block.method11774(Blocks.field29173.getDefaultState()));
        }
    }
    
    private boolean method12198(final World class1847, final BlockPos class1848) {
        final LinkedList linkedList = Lists.newLinkedList();
        linkedList.add(new Class8554(class1848, 0));
        int n = 0;
        while (!linkedList.isEmpty()) {
            final Class8554 class1849 = (Class8554)linkedList.poll();
            final BlockPos class1850 = class1849.method28745();
            final int intValue = class1849.method28746();
            final Direction[] values = Direction.values();
            for (int length = values.length, i = 0; i < length; ++i) {
                final BlockPos method1149 = class1850.method1149(values[i]);
                final BlockState method1150 = class1847.getBlockState(method1149);
                final IFluidState method1151 = class1847.getFluidState(method1149);
                final Material method1152 = method1150.getMaterial();
                if (method1151.isTagged(Class7324.field28319)) {
                    if (method1150.getBlock() instanceof Class3857 && ((Class3857)method1150.getBlock()).method11922(class1847, method1149, method1150) != Class7558.field29974) {
                        ++n;
                        if (intValue < 6) {
                            linkedList.add(new Class8554(method1149, intValue + 1));
                        }
                    }
                    else if (!(method1150.getBlock() instanceof Class3859)) {
                        if (method1152 == Material.OCEAN_PLANT || method1152 == Material.SEA_GRASS) {
                            Block.spawnDrops(method1150, class1847, method1149, method1150.getBlock().method11802() ? class1847.getTileEntity(method1149) : null);
                            class1847.setBlockState(method1149, Blocks.AIR.getDefaultState(), 3);
                            ++n;
                            if (intValue < 6) {
                                linkedList.add(new Class8554(method1149, intValue + 1));
                            }
                        }
                    }
                    else {
                        class1847.setBlockState(method1149, Blocks.AIR.getDefaultState(), 3);
                        ++n;
                        if (intValue < 6) {
                            linkedList.add(new Class8554(method1149, intValue + 1));
                        }
                    }
                }
            }
            if (n <= 64) {
                continue;
            }
            break;
        }
        return n > 0;
    }
}
