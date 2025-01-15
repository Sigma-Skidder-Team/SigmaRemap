// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3i;

public class Class385 extends BlockPos
{
    private static String[] field2238;
    public int field2239;
    public int field2240;
    public int field2241;
    
    public Class385() {
        this(0, 0, 0);
    }
    
    public Class385(final BlockPos class354) {
        this(class354.getX(), class354.getY(), class354.getZ());
    }
    
    public Class385(final int field2239, final int field2240, final int field2241) {
        super(0, 0, 0);
        this.field2239 = field2239;
        this.field2240 = field2240;
        this.field2241 = field2241;
    }
    
    public Class385(final double n, final double n2, final double n3) {
        this(MathHelper.floor(n), MathHelper.floor(n2), MathHelper.floor(n3));
    }
    
    public Class385(final Entity class399) {
        this(class399.method1938(), class399.method1941(), class399.method1945());
    }
    
    @Override
    public BlockPos method1133(final double n, final double n2, final double n3) {
        return super.method1133(n, n2, n3).method1153();
    }
    
    @Override
    public BlockPos method1134(final int n, final int n2, final int n3) {
        return super.method1134(n, n2, n3).method1153();
    }
    
    @Override
    public BlockPos method1150(final Direction class179, final int n) {
        return super.method1150(class179, n).method1153();
    }
    
    @Override
    public BlockPos method1151(final Class2052 class2052) {
        return super.method1151(class2052).method1153();
    }
    
    @Override
    public int getX() {
        return this.field2239;
    }
    
    @Override
    public int getY() {
        return this.field2240;
    }
    
    @Override
    public int getZ() {
        return this.field2241;
    }
    
    public Class385 method1284(final int field2239, final int field2240, final int field2241) {
        this.field2239 = field2239;
        this.field2240 = field2240;
        this.field2241 = field2241;
        return this;
    }
    
    public Class385 method1285(final Entity class399) {
        return this.method1286(class399.method1938(), class399.method1941(), class399.method1945());
    }
    
    public Class385 method1286(final double n, final double n2, final double n3) {
        return this.method1284(MathHelper.floor(n), MathHelper.floor(n2), MathHelper.floor(n3));
    }
    
    public Class385 method1287(final Vec3i class352) {
        return this.method1284(class352.getX(), class352.getY(), class352.getZ());
    }
    
    public Class385 method1288(final long n) {
        return this.method1284(BlockPos.method1126(n), BlockPos.method1127(n), BlockPos.method1128(n));
    }
    
    public Class385 method1289(final Class309 class309, final int n, final int n2, final int n3) {
        return this.method1284(class309.method982(n, n2, n3, Axis.X), class309.method982(n, n2, n3, Axis.Y), class309.method982(n, n2, n3, Axis.Z));
    }
    
    public Class385 method1290(final Direction class179) {
        return this.method1291(class179, 1);
    }
    
    public Class385 method1291(final Direction class179, final int n) {
        return this.method1284(this.field2239 + class179.getXOffset() * n, this.field2240 + class179.getYOffset() * n, this.field2241 + class179.getZOffset() * n);
    }
    
    public Class385 method1292(final int n, final int n2, final int n3) {
        return this.method1284(this.field2239 + n, this.field2240 + n2, this.field2241 + n3);
    }
    
    public void method1293(final int field2239) {
        this.field2239 = field2239;
    }
    
    public void method1294(final int field2240) {
        this.field2240 = field2240;
    }
    
    public void method1295(final int field2241) {
        this.field2241 = field2241;
    }
    
    @Override
    public BlockPos method1153() {
        return new BlockPos(this);
    }
}
