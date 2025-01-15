// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;

import java.util.Arrays;

public final class Class8063
{
    private static String[] field33207;
    private static final Direction[] field33208;
    private final boolean field33209;
    private final boolean field33210;
    private final boolean field33211;
    private final int field33212;
    private final VoxelShape[] field33213;
    private final VoxelShape field33214;
    private final boolean field33215;
    private final boolean[] field33216;
    private final boolean field33217;
    
    private Class8063(final BlockState class7096) {
        final Class3833 method21696 = class7096.method21696();
        this.field33209 = method21696.method11806(class7096);
        this.field33210 = method21696.method11817(class7096, Class1859.field10138, BlockPos.ZERO);
        this.field33211 = method21696.method11818(class7096, Class1859.field10138, BlockPos.ZERO);
        this.field33212 = method21696.method11819(class7096, Class1859.field10138, BlockPos.ZERO);
        if (class7096.method21723()) {
            this.field33213 = new VoxelShape[Class8063.field33208.length];
            final VoxelShape method21697 = method21696.method11810(class7096, Class1859.field10138, BlockPos.ZERO);
            for (final Direction class7097 : Class8063.field33208) {
                this.field33213[class7097.ordinal()] = Class7698.method24503(method21697, class7097);
            }
        }
        else {
            this.field33213 = null;
        }
        this.field33214 = method21696.method11809(class7096, Class1859.field10138, BlockPos.ZERO, ISelectionContext.dummy());
        this.field33215 = Arrays.stream(Axis.values()).anyMatch(class7099 -> this.field33214.method24535(class7099) < 0.0 || this.field33214.method24536(class7099) > 1.0);
        this.field33216 = new boolean[6];
        for (final Direction class7098 : Class8063.field33208) {
            this.field33216[class7098.ordinal()] = Class3833.method11814(class7096, Class1859.field10138, BlockPos.ZERO, class7098);
        }
        this.field33217 = Class3833.method11816(class7096.method21727(Class1859.field10138, BlockPos.ZERO));
    }
    
    static {
        field33208 = Direction.values();
    }
}
