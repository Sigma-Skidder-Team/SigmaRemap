// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.util2.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class Class7075
{
    private static String[] field27550;
    public final PlayerEntity field27551;
    public final Class316 field27552;
    public final BlockRayTraceResult field27553;
    public final World field27554;
    public final ItemStack field27555;
    
    public Class7075(final PlayerEntity playerEntity, final Class316 class513, final BlockRayTraceResult class514) {
        this(playerEntity.world, playerEntity, class513, playerEntity.method2715(class513), class514);
    }
    
    public Class7075(final World field27554, final PlayerEntity field27555, final Class316 field27556, final ItemStack field27557, final BlockRayTraceResult field27558) {
        this.field27551 = field27555;
        this.field27552 = field27556;
        this.field27553 = field27558;
        this.field27555 = field27557;
        this.field27554 = field27554;
    }
    
    public BlockPos method21639() {
        return this.field27553.getPos();
    }
    
    public Direction method21648() {
        return this.field27553.getFace();
    }
    
    public Vec3d method21649() {
        return this.field27553.getHitVec();
    }
    
    public boolean method21650() {
        return this.field27553.isInside();
    }
    
    public ItemStack method21651() {
        return this.field27555;
    }
    
    @Nullable
    public PlayerEntity method21652() {
        return this.field27551;
    }
    
    public Class316 method21653() {
        return this.field27552;
    }
    
    public World method21654() {
        return this.field27554;
    }
    
    public Direction method21644() {
        return (this.field27551 != null) ? this.field27551.method1882() : Direction.NORTH;
    }
    
    public boolean method21645() {
        return this.field27551 != null && this.field27551.method2804();
    }
    
    public float method21646() {
        return (this.field27551 != null) ? this.field27551.rotationYaw : 0.0f;
    }
}
