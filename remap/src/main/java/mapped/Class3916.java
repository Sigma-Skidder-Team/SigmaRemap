// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import java.util.Random;
import java.util.stream.IntStream;

public class Class3916 extends Block implements Class3856
{
    private static String[] field17731;
    public static final Class7115 field17732;
    public static final Class7114<Class109> field17733;
    public static final Class7114<Class183> field17734;
    public static final Class7113 field17735;
    public static final VoxelShape field17736;
    public static final VoxelShape field17737;
    public static final VoxelShape field17738;
    public static final VoxelShape field17739;
    public static final VoxelShape field17740;
    public static final VoxelShape field17741;
    public static final VoxelShape field17742;
    public static final VoxelShape field17743;
    public static final VoxelShape field17744;
    public static final VoxelShape field17745;
    public static final VoxelShape[] field17746;
    public static final VoxelShape[] field17747;
    private static final int[] field17748;
    private final Block field17749;
    private final BlockState field17750;
    
    private static VoxelShape[] method12021(final VoxelShape class7702, final VoxelShape class7703, final VoxelShape class7704, final VoxelShape class7705, final VoxelShape class7706) {
        return null;
    }
    
    private static VoxelShape method12022(final int n, final VoxelShape class7702, final VoxelShape class7703, final VoxelShape class7704, final VoxelShape class7705, final VoxelShape class7706) {
        return class7702;
    }
    
    public Class3916(final BlockState field17750, final Properties class9288) {
        super(class9288);
        this.field17750 = field17750;
        field17749 = null;
    }
    
    @Override
    public VoxelShape method11808(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098, final ISelectionContext class7099) {
        return null;
    }
    
    @Override
    public void method11823(final BlockState class7096, final World class7097, final BlockPos class7098, final Random random) {
        this.field17749.method11823(class7096, class7097, class7098, random);
    }
    
    @Override
    public void method11847(final BlockState class7096, final World class7097, final BlockPos class7098, final PlayerEntity class7099) {
        this.field17750.method21745(class7097, class7098, class7099);
    }
    
    @Override
    public void method11824(final Class1851 class1851, final BlockPos class1852, final BlockState class1853) {
        this.field17749.method11824(class1851, class1852, class1853);
    }
    
    @Override
    public float method11841() {
        return this.field17749.method11841();
    }
    
    @Override
    public int tickRate(final Class1852 class1852) {
        return this.field17749.tickRate(class1852);
    }
    
    @Override
    public void onBlockAdded(final BlockState class7096, final World class7097, final BlockPos class7098, final BlockState class7099, final boolean b) {

    }
    
    @Override
    public void onReplaced(final BlockState class7096, final World class7097, final BlockPos class7098, final BlockState class7099, final boolean b) {

    }
    
    @Override
    public void method11845(final World class1847, final BlockPos class1848, final Entity class1849) {
        this.field17749.method11845(class1847, class1848, class1849);
    }
    
    @Override
    public void method11822(final BlockState class7096, final Class1849 class7097, final BlockPos class7098, final Random random) {
        this.field17749.method11822(class7096, class7097, class7098, random);
    }
    
    @Override
    public Class2201 method11844(final BlockState class7096, final World class7097, final BlockPos class7098, final PlayerEntity class7099, final Class316 class7100, final BlockRayTraceResult class7101) {
        return this.field17750.method21744(class7097, class7099, class7100, class7101);
    }
    
    @Override
    public void method11842(final World class1847, final BlockPos class1848, final Explosion class1849) {
        this.field17749.method11842(class1847, class1848, class1849);
    }
    
    @Override
    public BlockState method11846(final Class7074 class7074) {
        return null;
    }
    
    @Override
    public BlockState method11789(final BlockState class7096, final Direction class7097, final BlockState class7098, final Class1851 class7099, final BlockPos class7100, final BlockPos class7101) {
        return class7097.getAxis().isHorizontal() ? class7096.with(Class3916.field17734, method12024(class7096, class7099, class7100)) : super.method11789(class7096, class7097, class7098, class7099, class7100, class7101);
    }
    
    public static Class183 method12024(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098) {
        return Class183.field567;
    }
    
    @Override
    public BlockState method11791(final BlockState class7096, final Class2181 class7097) {
        return super.method11791(class7096, class7097);
    }
    
    @Override
    public void method11875(final Class9500<Block, BlockState> class9500) {
        class9500.method35378(Class3916.field17732, Class3916.field17733, Class3916.field17734, Class3916.field17735);
    }
    
    @Override
    public boolean method11796(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098, final Class2084 class7099) {
        return false;
    }
    
    static {
        field17732 = Class3892.field17564;
        field17733 = Class8970.field37766;
        field17734 = Class8970.field37801;
        field17735 = Class8970.field37747;
        field17736 = SlabBlock.field17780;
        field17737 = SlabBlock.field17779;
        field17738 = Block.method11778(0.0, 0.0, 0.0, 8.0, 8.0, 8.0);
        field17739 = Block.method11778(0.0, 0.0, 8.0, 8.0, 8.0, 16.0);
        field17740 = Block.method11778(0.0, 8.0, 0.0, 8.0, 16.0, 8.0);
        field17741 = Block.method11778(0.0, 8.0, 8.0, 8.0, 16.0, 16.0);
        field17742 = Block.method11778(8.0, 0.0, 0.0, 16.0, 8.0, 8.0);
        field17743 = Block.method11778(8.0, 0.0, 8.0, 16.0, 8.0, 16.0);
        field17744 = Block.method11778(8.0, 8.0, 0.0, 16.0, 16.0, 8.0);
        field17745 = Block.method11778(8.0, 8.0, 8.0, 16.0, 16.0, 16.0);
        field17746 = method12021(Class3916.field17736, Class3916.field17738, Class3916.field17742, Class3916.field17739, Class3916.field17743);
        field17747 = method12021(Class3916.field17737, Class3916.field17740, Class3916.field17744, Class3916.field17741, Class3916.field17745);
        field17748 = new int[] { 12, 5, 3, 10, 14, 13, 7, 11, 13, 7, 11, 14, 8, 4, 1, 2, 4, 1, 2, 8 };
    }
}
