// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class Class7752 extends Class7746
{
    private static String[] field31684;
    private boolean field31685;
    
    public Class7752(final Class759 class759, final World class760) {
        super(class759, class760);
    }
    
    @Override
    public Class7914 method24715(final int n) {
        this.field31685 = (this.field31657 instanceof Class840);
        this.field31672 = new Class4655(this.field31685);
        return new Class7914(this.field31672, n);
    }
    
    @Override
    public boolean method24735() {
        return this.field31685 || this.method24736();
    }
    
    @Override
    public Vec3d method24734() {
        return new Vec3d(this.field31657.getPosX(), this.field31657.method1942(0.5), this.field31657.getPosZ());
    }
    
    @Override
    public void method24728() {
        ++this.field31662;
        if (this.field31670) {
            this.method24718();
        }
        if (!this.method24731()) {
            if (!this.method24735()) {
                if (this.field31659 != null) {
                    if (this.field31659.method35222() < this.field31659.method35221()) {
                        final Vec3d method35224 = this.field31659.method35224(this.field31657, this.field31659.method35222());
                        if (MathHelper.floor(this.field31657.getPosX()) == MathHelper.floor(method35224.x)) {
                            if (MathHelper.floor(this.field31657.getPosY()) == MathHelper.floor(method35224.y)) {
                                if (MathHelper.floor(this.field31657.getPosZ()) == MathHelper.floor(method35224.z)) {
                                    this.field31659.method35223(this.field31659.method35222() + 1);
                                }
                            }
                        }
                    }
                }
            }
            else {
                this.method24729();
            }
            Class9324.method34535(this.field31658, this.field31657, this.field31659, this.field31669);
            if (!this.method24731()) {
                final Vec3d method35225 = this.field31659.method35225(this.field31657);
                this.field31657.method4148().method19907(method35225.x, method35225.y, method35225.z, this.field31660);
            }
        }
    }
    
    @Override
    public void method24729() {
        if (this.field31659 != null) {
            final Vec3d method24734 = this.method24734();
            final float method24735 = this.field31657.method1930();
            float n = (method24735 <= 0.75f) ? (0.75f - method24735 / 2.0f) : (method24735 / 2.0f);
            final Vec3d method24736 = this.field31657.getMotion();
            if (Math.abs(method24736.x) > 0.2 || Math.abs(method24736.z) > 0.2) {
                n = (float)(n * method24736.length() * 6.0);
            }
            final Vec3d method24737 = this.field31659.method35226();
            if (Math.abs(this.field31657.getPosX() - (method24737.x + 0.5)) < n) {
                if (Math.abs(this.field31657.getPosZ() - (method24737.z + 0.5)) < n) {
                    if (Math.abs(this.field31657.getPosY() - method24737.y) < n * 2.0f) {
                        this.field31659.method35214();
                    }
                }
            }
            for (int i = Math.min(this.field31659.method35222() + 6, this.field31659.method35221() - 1); i > this.field31659.method35222(); --i) {
                final Vec3d method24738 = this.field31659.method35224(this.field31657, i);
                if (method24738.squareDistanceTo(method24734) <= 36.0 && this.method24738(method24734, method24738, 0, 0, 0)) {
                    this.field31659.method35223(i);
                    break;
                }
            }
            this.method24730(method24734);
        }
    }
    
    @Override
    public void method24730(final Vec3d field31664) {
        if (this.field31662 - this.field31663 > 100) {
            if (field31664.squareDistanceTo(this.field31664) < 2.25) {
                this.method24733();
            }
            this.field31663 = this.field31662;
            this.field31664 = field31664;
        }
        if (this.field31659 != null) {
            if (!this.field31659.method35215()) {
                final Vec3d method35226 = this.field31659.method35226();
                if (!method35226.equals(this.field31665)) {
                    this.field31665 = method35226;
                    final double method35227 = field31664.distanceTo(this.field31665);
                    this.field31668 = ((this.field31657.method2732() <= 0.0f) ? 0.0 : (method35227 / this.field31657.method2732() * 100.0));
                }
                else {
                    this.field31666 += Class8349.method27837() - this.field31667;
                }
                if (this.field31668 > 0.0) {
                    if (this.field31666 > this.field31668 * 2.0) {
                        this.field31665 = Vec3d.ZERO;
                        this.field31666 = 0L;
                        this.field31668 = 0.0;
                        this.method24733();
                    }
                }
                this.field31667 = Class8349.method27837();
            }
        }
    }
    
    @Override
    public boolean method24738(final Vec3d class5487, final Vec3d class5488, final int n, final int n2, final int n3) {
        return this.field31658.method6987(new Class8478(class5487, new Vec3d(class5488.x, class5488.y + this.field31657.method1931() * 0.5, class5488.z), Class2040.field11632, Class2191.field13325, this.field31657)).method21449() == Class2165.field12880;
    }
    
    @Override
    public boolean method24739(final BlockPos class354) {
        return !this.field31658.method6701(class354).method21722(this.field31658, class354);
    }
    
    @Override
    public void method24741(final boolean b) {
    }
}
