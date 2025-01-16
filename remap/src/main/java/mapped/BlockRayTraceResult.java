// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util2.Direction;
import net.minecraft.util.math.Vec3d;

public class BlockRayTraceResult extends Class7006
{
    private static String[] field27318;
    private final Direction field27319;
    private final BlockPos field27320;
    private final boolean field27321;
    private final boolean field27322;
    
    public static BlockRayTraceResult method21445(final Vec3d class5487, final Direction class5488, final BlockPos class5489) {
        return new BlockRayTraceResult(true, class5487, class5488, class5489, false);
    }
    
    public BlockRayTraceResult(final Vec3d class5487, final Direction class5488, final BlockPos class5489, final boolean b) {
        this(false, class5487, class5488, class5489, b);
    }
    
    private BlockRayTraceResult(final boolean field27321, final Vec3d class5487, final Direction field27322, final BlockPos field27323, final boolean field27324) {
        super(class5487);
        this.field27321 = field27321;
        this.field27319 = field27322;
        this.field27320 = field27323;
        this.field27322 = field27324;
    }
    
    public BlockRayTraceResult method21446(final Direction class179) {
        return new BlockRayTraceResult(this.field27321, this.field27323, class179, this.field27320, this.field27322);
    }
    
    public BlockPos method21447() {
        return this.field27320;
    }
    
    public Direction method21448() {
        return this.field27319;
    }
    
    @Override
    public Class2165 method21449() {
        return this.field27321 ? Class2165.field12880 : Class2165.field12881;
    }
    
    public boolean method21450() {
        return this.field27322;
    }
}
