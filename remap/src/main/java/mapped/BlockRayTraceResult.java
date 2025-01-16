// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util2.Direction;
import net.minecraft.util.math.Vec3d;

public class BlockRayTraceResult extends RayTraceResult
{
    private final Direction face;
    private final BlockPos pos;
    private final boolean isMiss;
    private final boolean inside;
    
    public static BlockRayTraceResult createMiss(final Vec3d class5487, final Direction class5488, final BlockPos class5489) {
        return new BlockRayTraceResult(true, class5487, class5488, class5489, false);
    }
    
    public BlockRayTraceResult(final Vec3d class5487, final Direction class5488, final BlockPos class5489, final boolean b) {
        this(false, class5487, class5488, class5489, b);
    }
    
    private BlockRayTraceResult(final boolean isMiss, final Vec3d class5487, final Direction inside, final BlockPos field27323, final boolean field27324) {
        super(class5487);
        this.isMiss = isMiss;
        this.face = inside;
        this.pos = field27323;
        this.inside = field27324;
    }
    
    public BlockRayTraceResult withFace(final Direction class179) {
        return new BlockRayTraceResult(this.isMiss, this.hitResult, class179, this.pos, this.inside);
    }
    
    public BlockPos getPos() {
        return this.pos;
    }
    
    public Direction getFace() {
        return this.face;
    }
    
    @Override
    public Type getType() {
        return this.isMiss ? Type.MISS : Type.BLOCK;
    }
    
    public boolean isInside() {
        return this.inside;
    }
}
