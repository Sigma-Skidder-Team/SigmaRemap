// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.World;

import java.util.Random;

public class Class4026 extends Block
{
    private static String[] field18117;
    public static final VoxelShape field18118;
    
    public Class4026(final Class9288 class9288) {
        super(class9288);
    }
    
    @Override
    public VoxelShape method11809(final Class7096 class7096, final IBlockReader class7097, final BlockPos class7098, final ISelectionContext class7099) {
        return Class4026.field18118;
    }
    
    @Override
    public void method11822(final Class7096 class7096, final Class1849 class7097, final BlockPos class7098, final Random random) {
        Class3858.method11923(class7097, class7098.method1137(), false);
    }
    
    @Override
    public void method11825(final Class7096 class7096, final World class7097, final BlockPos class7098, final Block class7099, final BlockPos class7100, final boolean b) {
        class7097.method6833().method21345(class7098, this, this.method11826(class7097));
    }
    
    @Override
    public boolean method11793(final Class7096 class7096, final IBlockReader class7097, final BlockPos class7098) {
        return true;
    }
    
    @Override
    public int method11826(final Class1852 class1852) {
        return 20;
    }
    
    @Override
    public void method11828(final Class7096 class7096, final World class7097, final BlockPos class7098, final Class7096 class7099, final boolean b) {
        class7097.method6833().method21345(class7098, this, this.method11826(class7097));
    }
    
    @Override
    public boolean method11796(final Class7096 class7096, final IBlockReader class7097, final BlockPos class7098, final Class2084 class7099) {
        return false;
    }
    
    @Override
    public boolean method11779(final Class7096 class7096, final IBlockReader class7097, final BlockPos class7098, final EntityType<?> class7099) {
        return true;
    }
    
    @Override
    public boolean method11795(final Class7096 class7096, final IBlockReader class7097, final BlockPos class7098) {
        return true;
    }
    
    static {
        field18118 = Block.method11778(0.0, 0.0, 0.0, 16.0, 14.0, 16.0);
    }
}
