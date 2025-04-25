// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Collection;
import java.util.List;

import com.mentalfrostbyte.Client;
import it.unimi.dsi.fastutil.longs.Long2ByteLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.world.IBlockReader;

public class BlockUtils
{
    private static String[] field26582;
    private static final ThreadLocal<Class9554> field26583;
    private static final ThreadLocal<Object2ByteLinkedOpenHashMap<Class9554>> field26584;
    
    public static boolean shouldSideBeRendered(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098, final Direction class7099, final Class9145 class7100) {
        final EventRenderBlocks event = new EventRenderBlocks(class7096);
        Client.getInstance().getEventBus().post(event);
        if (event.method16987()) {
            return true;
        }
        if (!event.isCancelled()) {
            final BlockPos method1149 = class7098.method1149(class7099);
            final BlockState method1150 = class7097.getBlockState(method1149);
            return !class7096.method21724(method1150, class7099) && (!method1150.isSolid() || shouldSideBeRenderedCached(class7096, class7097, class7098, class7099, class7100, method1150, method1149));
        }
        return false;
    }
    
    public static boolean shouldSideBeRenderedCached(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098, final Direction class7099, final Class9145 class7100, final BlockState class7101, final BlockPos class7102) {
        final long n = (long)class7096.getBlockStateId() << 36 | (long)class7101.getBlockStateId() << 4 | (long)class7099.ordinal();
        final Long2ByteLinkedOpenHashMap method33401 = class7100.method33401();
        final byte andMoveToFirst = method33401.getAndMoveToFirst(n);
        if (andMoveToFirst == 0) {
            final boolean method33402 = VoxelShapes.method24496(class7096.getFaceOcclusionShape(class7097, class7098, class7099), class7101.getFaceOcclusionShape(class7097, class7102, class7099.getOpposite()), IBooleanFunction.ONLY_FIRST);
            if (method33401.size() > 400) {
                method33401.removeLastByte();
            }
            method33401.putAndMoveToFirst(n, (byte)(method33402 ? 1 : -1));
            return method33402;
        }
        return andMoveToFirst > 0;
    }
    
    public static int method20649(final Block class3833) {
        return Registry.BLOCK.getId(class3833);
    }
    
    public static Block method20650(final ResourceLocation class1932) {
        return Registry.BLOCK.method510(class1932) ? Registry.BLOCK.getOrDefault(class1932) : null;
    }
    
    public static int getMetadata(final BlockState class7096) {
        return ((List)class7096.getBlock().getStateContainer().method32902()).indexOf(class7096);
    }
    
    public static int method20652(final Block class3833) {
        return ((List)class3833.getStateContainer().method32902()).size();
    }
    
    public static BlockState method20653(final Block class3833, final int n) {
        final com.google.common.collect.ImmutableList<BlockState> method32902 = class3833.getStateContainer().method32902();
        if (n >= 0 && n < ((List)method32902).size()) {
            return (BlockState)((List)method32902).get(n);
        }
        return null;
    }
    
    public static List<BlockState> method20654(final Block class3833) {
        return (List<BlockState>)class3833.getStateContainer().method32902();
    }
    
    public static boolean method20655(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098) {
        return Block.isOpaque(class7096.getCollisionShape(class7097, class7098));
    }
    
    public static Collection<IProperty<?>> method20656(final BlockState class7096) {
        return class7096.method21770();
    }
    
    static {
        field26583 = ThreadLocal.withInitial(() -> new Class9554(null, null, null, null));
        field26584 = ThreadLocal.withInitial(() -> {
            final Class2268 class2268 = new Class2268(200);
            class2268.defaultReturnValue((byte)127);
            return class2268;
        });
    }
}
