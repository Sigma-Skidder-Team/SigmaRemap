// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class Class3987 extends Class3986
{
    private static String[] field17995;
    public static final VoxelShape field17996;
    
    public Class3987(final Class9288 class9288) {
        super(class9288);
    }
    
    @Override
    public VoxelShape method11808(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098, final ISelectionContext class7099) {
        return Class3987.field17996;
    }
    
    @Override
    public Class2201 method11844(final BlockState class7096, final World class7097, final BlockPos class7098, final PlayerEntity class7099, final Class316 class7100, final BlockRayTraceResult class7101) {
        this.method12135(class7096, class7097, class7098);
        return Class2201.field13400;
    }
    
    @Override
    public void method11847(final BlockState class7096, final World class7097, final BlockPos class7098, final PlayerEntity class7099) {
        this.method12135(class7096, class7097, class7098);
    }
    
    private void method12135(final BlockState class7096, final World class7097, final BlockPos class7098) {
        for (int i = 0; i < 1000; ++i) {
            final BlockPos method1134 = class7098.add(class7097.rand.nextInt(16) - class7097.rand.nextInt(16), class7097.rand.nextInt(8) - class7097.rand.nextInt(8), class7097.rand.nextInt(16) - class7097.rand.nextInt(16));
            if (class7097.getBlockState(method1134).method21706()) {
                if (!class7097.isRemote) {
                    class7097.setBlockState(method1134, class7096, 2);
                    class7097.method6690(class7098, false);
                }
                else {
                    for (int j = 0; j < 128; ++j) {
                        final double nextDouble = class7097.rand.nextDouble();
                        class7097.method6709(Class8432.field34637, MathHelper.lerp(nextDouble, method1134.getX(), class7098.getX()) + (class7097.rand.nextDouble() - 0.5) + 0.5, MathHelper.lerp(nextDouble, method1134.getY(), class7098.getY()) + class7097.rand.nextDouble() - 0.5, MathHelper.lerp(nextDouble, method1134.getZ(), class7098.getZ()) + (class7097.rand.nextDouble() - 0.5) + 0.5, (class7097.rand.nextFloat() - 0.5f) * 0.2f, (class7097.rand.nextFloat() - 0.5f) * 0.2f, (class7097.rand.nextFloat() - 0.5f) * 0.2f);
                    }
                }
                return;
            }
        }
    }
    
    @Override
    public int method11826(final Class1852 class1852) {
        return 5;
    }
    
    @Override
    public boolean method11796(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098, final Class2084 class7099) {
        return false;
    }
    
    static {
        field17996 = Block.method11778(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
    }
}
