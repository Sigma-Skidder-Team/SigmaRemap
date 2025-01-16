// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.shapes.VoxelShape;

public class Class7256 extends Class7255
{
    private static String[] field28131;
    
    @Override
    public Item method22149() {
        return Items.AIR;
    }
    
    @Override
    public boolean method22154(final Class7099 class7099, final Class1855 class7100, final BlockPos class7101, final Class7255 class7102, final Direction class7103) {
        return true;
    }
    
    @Override
    public Vec3d method22155(final Class1855 class1855, final BlockPos class1856, final Class7099 class1857) {
        return Vec3d.ZERO;
    }
    
    @Override
    public int method22156(final Class1852 class1852) {
        return 0;
    }
    
    @Override
    public boolean method22158() {
        return true;
    }
    
    @Override
    public float method22159() {
        return 0.0f;
    }
    
    @Override
    public float method22160(final Class7099 class7099, final Class1855 class7100, final BlockPos class7101) {
        return 0.0f;
    }
    
    @Override
    public float method22161(final Class7099 class7099) {
        return 0.0f;
    }
    
    @Override
    public BlockState method22162(final Class7099 class7099) {
        return Class7521.field29147.getDefaultState();
    }
    
    @Override
    public boolean method22163(final Class7099 class7099) {
        return false;
    }
    
    @Override
    public int method22164(final Class7099 class7099) {
        return 0;
    }
    
    @Override
    public VoxelShape method22167(final Class7099 class7099, final Class1855 class7100, final BlockPos class7101) {
        return VoxelShapes.method24486();
    }
}
