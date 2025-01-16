// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.VoxelShape;

public class Class5753 extends Class5714
{
    private static String[] field23349;
    private BlockPos field23350;
    private VoxelShape field23351;
    public static boolean field23352;
    
    public Class5753(final BlockPos field23350, final VoxelShape field23351) {
        this.field23350 = field23350;
        this.field23351 = field23351;
    }
    
    public BlockPos method17064() {
        return this.field23350;
    }
    
    public VoxelShape method17065() {
        return this.field23351;
    }
    
    public void method17066(final BlockPos field23350) {
        this.field23350 = field23350;
    }
    
    public void method17067(VoxelShape method24488) {
        if (method24488 == null) {
            method24488 = VoxelShapes.method24488(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
        }
        this.field23351 = method24488;
    }
    
    static {
        Class5753.field23352 = false;
    }
}
