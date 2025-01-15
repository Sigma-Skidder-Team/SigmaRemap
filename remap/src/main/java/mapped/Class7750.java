// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class Class7750 extends Class7746
{
    private static String[] field31681;
    
    public Class7750(final Class759 class759, final World class760) {
        super(class759, class760);
    }
    
    @Override
    public Class7914 method24715(final int n) {
        (this.field31672 = new Class4652()).method13922(true);
        return new Class7914(this.field31672, n);
    }
    
    @Override
    public boolean method24735() {
        return (this.method24742() && this.method24736()) || !this.field31657.isPassenger();
    }
    
    @Override
    public Vec3d method24734() {
        return this.field31657.method1934();
    }
    
    @Override
    public Class9468 method24722(final Entity class399, final int n) {
        return this.method24721(new BlockPos(class399), n);
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
    public boolean method24738(final Vec3d class5487, final Vec3d class5488, final int n, final int n2, final int n3) {
        int method35644 = MathHelper.floor(class5487.x);
        int method35645 = MathHelper.floor(class5487.y);
        int method35646 = MathHelper.floor(class5487.z);
        final double n4 = class5488.x - class5487.x;
        final double n5 = class5488.y - class5487.y;
        final double n6 = class5488.z - class5487.z;
        final double a = n4 * n4 + n5 * n5 + n6 * n6;
        if (a >= 1.0E-8) {
            final double n7 = 1.0 / Math.sqrt(a);
            final double a2 = n4 * n7;
            final double a3 = n5 * n7;
            final double a4 = n6 * n7;
            final double n8 = 1.0 / Math.abs(a2);
            final double n9 = 1.0 / Math.abs(a3);
            final double n10 = 1.0 / Math.abs(a4);
            double n11 = method35644 - class5487.x;
            double n12 = method35645 - class5487.y;
            double n13 = method35646 - class5487.z;
            if (a2 >= 0.0) {
                ++n11;
            }
            if (a3 >= 0.0) {
                ++n12;
            }
            if (a4 >= 0.0) {
                ++n13;
            }
            double n14 = n11 / a2;
            double n15 = n12 / a3;
            double n16 = n13 / a4;
            final int n17 = (a2 >= 0.0) ? 1 : -1;
            final int n18 = (a3 >= 0.0) ? 1 : -1;
            final int n19 = (a4 >= 0.0) ? 1 : -1;
            final int method35647 = MathHelper.floor(class5488.x);
            final int method35648 = MathHelper.floor(class5488.y);
            final int method35649 = MathHelper.floor(class5488.z);
            int n20 = method35647 - method35644;
            int n21 = method35648 - method35645;
            int n22 = method35649 - method35646;
            while (true) {
                if (n20 * n17 <= 0) {
                    if (n21 * n18 <= 0) {
                        if (n22 * n19 <= 0) {
                            break;
                        }
                    }
                }
                if (n14 < n16 && n14 <= n15) {
                    n14 += n8;
                    method35644 += n17;
                    n20 = method35647 - method35644;
                }
                else if (n15 < n14 && n15 <= n16) {
                    n15 += n9;
                    method35645 += n18;
                    n21 = method35648 - method35645;
                }
                else {
                    n16 += n10;
                    method35646 += n19;
                    n22 = method35649 - method35646;
                }
            }
            return true;
        }
        return false;
    }
    
    public void method24750(final boolean b) {
        this.field31672.method13923(b);
    }
    
    public void method24751(final boolean b) {
        this.field31672.method13922(b);
    }
    
    @Override
    public boolean method24739(final BlockPos class354) {
        return this.field31658.method6701(class354).method21731(this.field31658, class354, this.field31657);
    }
}
