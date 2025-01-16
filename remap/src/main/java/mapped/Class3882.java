// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;

public class Class3882 extends Class3874
{
    private static String[] field17519;
    public static final VoxelShape field17537;
    private final Class5328 field17538;
    private final int field17539;
    
    public Class3882(final Class5328 field17538, final int field17539, final Class9288 class9288) {
        super(class9288);
        this.field17538 = field17538;
        if (!field17538.method16453()) {
            this.field17539 = field17539 * 20;
        }
        else {
            this.field17539 = field17539;
        }
    }
    
    @Override
    public VoxelShape method11808(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098, final ISelectionContext class7099) {
        final Vec3d method21732 = class7096.method21732(class7097, class7098);
        return Class3882.field17537.withOffset(method21732.x, method21732.y, method21732.z);
    }
    
    @Override
    public Class2180 method11879() {
        return Class2180.field12914;
    }
    
    public Class5328 method11961() {
        return this.field17538;
    }
    
    public int method11962() {
        return this.field17539;
    }
    
    static {
        field17537 = Block.method11778(5.0, 0.0, 5.0, 11.0, 10.0, 11.0);
    }
}
