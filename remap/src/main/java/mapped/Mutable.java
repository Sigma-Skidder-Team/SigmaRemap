// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util2.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3i;

public class Mutable extends BlockPos
{
    public int x;
    public int y;
    public int z;
    
    public Mutable() {
        this(0, 0, 0);
    }
    
    public Mutable(final BlockPos p_i2137_1_) {
        this(p_i2137_1_.getX(), p_i2137_1_.getY(), p_i2137_1_.getZ());
    }
    
    public Mutable(final int x, final int y, final int z) {
        super(0, 0, 0);
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public Mutable(final double n, final double n2, final double n3) {
        this(MathHelper.floor(n), MathHelper.floor(n2), MathHelper.floor(n3));
    }
    
    public Mutable(final Entity class399) {
        this(class399.getPosX(), class399.getPosY(), class399.getPosZ());
    }
    
    @Override
    public BlockPos add(final double n, final double n2, final double n3) {
        return super.add(n, n2, n3).toImmutable();
    }
    
    @Override
    public BlockPos add(final int n, final int n2, final int n3) {
        return super.add(n, n2, n3).toImmutable();
    }
    
    @Override
    public BlockPos method1150(final Direction class179, final int n) {
        return super.method1150(class179, n).toImmutable();
    }
    
    @Override
    public BlockPos method1151(final Class2052 class2052) {
        return super.method1151(class2052).toImmutable();
    }
    
    @Override
    public int getX() {
        return this.x;
    }
    
    @Override
    public int getY() {
        return this.y;
    }
    
    @Override
    public int getZ() {
        return this.z;
    }
    
    public Mutable setPos(final int field2239, final int field2240, final int field2241) {
        this.x = field2239;
        this.y = field2240;
        this.z = field2241;
        return this;
    }
    
    public Mutable method1285(final Entity class399) {
        return this.method1286(class399.getPosX(), class399.getPosY(), class399.getPosZ());
    }
    
    public Mutable method1286(final double n, final double n2, final double n3) {
        return this.setPos(MathHelper.floor(n), MathHelper.floor(n2), MathHelper.floor(n3));
    }
    
    public Mutable method1287(final Vec3i class352) {
        return this.setPos(class352.getX(), class352.getY(), class352.getZ());
    }
    
    public Mutable method1288(final long n) {
        return this.setPos(BlockPos.unpackX(n), BlockPos.unpackY(n), BlockPos.unpackZ(n));
    }
    
    public Mutable method1289(final AxisRotation axisRotation, final int n, final int n2, final int n3) {
        return this.setPos(axisRotation.getCoordinate(n, n2, n3, Direction.Axis.X), axisRotation.getCoordinate(n, n2, n3, Direction.Axis.Y), axisRotation.getCoordinate(n, n2, n3, Direction.Axis.Z));
    }
    
    public Mutable method1290(final Direction class179) {
        return this.method1291(class179, 1);
    }
    
    public Mutable method1291(final Direction class179, final int n) {
        return this.setPos(this.x + class179.getXOffset() * n, this.y + class179.getYOffset() * n, this.z + class179.getZOffset() * n);
    }
    
    public Mutable method1292(final int n, final int n2, final int n3) {
        return this.setPos(this.x + n, this.y + n2, this.z + n3);
    }
    
    public void method1293(final int field2239) {
        this.x = field2239;
    }
    
    public void method1294(final int field2240) {
        this.y = field2240;
    }
    
    public void method1295(final int field2241) {
        this.z = field2241;
    }
    
    @Override
    public BlockPos toImmutable() {
        return new BlockPos(this);
    }
}
