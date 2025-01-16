// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class Class7747 extends Class7746
{
    private static String[] field31677;
    private boolean field31678;
    
    public Class7747(final Class759 class759, final World class760) {
        super(class759, class760);
    }
    
    @Override
    public Class7914 method24715(final int n) {
        (this.field31672 = new Class4651()).method13922(true);
        return new Class7914(this.field31672, n);
    }
    
    @Override
    public boolean method24735() {
        if (!this.field31657.onGround) {
            if (!this.method24736()) {
                if (!this.field31657.isPassenger()) {
                    return false;
                }
            }
        }
        return true;
    }
    
    @Override
    public Vec3d method24734() {
        return new Vec3d(this.field31657.getPosX(), this.method24744(), this.field31657.getPosZ());
    }
    
    @Override
    public Class9468 method24721(BlockPos class354, final int n) {
        if (this.field31658.getBlockState(class354).method21706()) {
            BlockPos class355;
            for (class355 = class354.method1139(); class355.getY() > 0 && this.field31658.getBlockState(class355).method21706(); class355 = class355.method1139()) {}
            if (class355.getY() > 0) {
                return super.method24721(class355.method1137(), n);
            }
            while (class355.getY() < this.field31658.getHeight() && this.field31658.getBlockState(class355).method21706()) {
                class355 = class355.method1137();
            }
            class354 = class355;
        }
        if (this.field31658.getBlockState(class354).method21697().method26439()) {
            BlockPos class356;
            for (class356 = class354.method1137(); class356.getY() < this.field31658.getHeight() && this.field31658.getBlockState(class356).method21697().method26439(); class356 = class356.method1137()) {}
            return super.method24721(class356, n);
        }
        return super.method24721(class354, n);
    }
    
    @Override
    public Class9468 method24722(final Entity class399, final int n) {
        return this.method24721(new BlockPos(class399), n);
    }
    
    private int method24744() {
        if (this.field31657.method1706() && this.method24742()) {
            int method35644 = MathHelper.floor(this.field31657.getPosY());
            Block class3833 = this.field31658.getBlockState(new BlockPos(this.field31657.getPosX(), method35644, this.field31657.getPosZ())).method21696();
            int n = 0;
            while (class3833 == Class7521.field29173) {
                ++method35644;
                class3833 = this.field31658.getBlockState(new BlockPos(this.field31657.getPosX(), method35644, this.field31657.getPosZ())).method21696();
                if (++n <= 16) {
                    continue;
                }
                return MathHelper.floor(this.field31657.getPosY());
            }
            return method35644;
        }
        return MathHelper.floor(this.field31657.getPosY() + 0.5);
    }
    
    @Override
    public void method24737() {
        super.method24737();
        if (this.field31678) {
            if (this.field31658.method6994(new BlockPos(this.field31657.getPosX(), this.field31657.getPosY() + 0.5, this.field31657.getPosZ()))) {
                return;
            }
            for (int i = 0; i < this.field31659.method35221(); ++i) {
                final Class6772 method35217 = this.field31659.method35217(i);
                if (this.field31658.method6994(new BlockPos(method35217.field26589, method35217.field26590, method35217.field26591))) {
                    this.field31659.method35219(i);
                    return;
                }
            }
        }
    }
    
    @Override
    public boolean method24738(final Vec3d class5487, final Vec3d class5488, int n, final int n2, int n3) {
        int method35644 = MathHelper.floor(class5487.x);
        int method35645 = MathHelper.floor(class5487.z);
        final double n4 = class5488.x - class5487.x;
        final double n5 = class5488.z - class5487.z;
        final double a = n4 * n4 + n5 * n5;
        if (a < 1.0E-8) {
            return false;
        }
        final double n6 = 1.0 / Math.sqrt(a);
        final double a2 = n4 * n6;
        final double a3 = n5 * n6;
        n += 2;
        n3 += 2;
        if (this.method24745(method35644, MathHelper.floor(class5487.y), method35645, n, n2, n3, class5487, a2, a3)) {
            n -= 2;
            n3 -= 2;
            final double n7 = 1.0 / Math.abs(a2);
            final double n8 = 1.0 / Math.abs(a3);
            double n9 = method35644 - class5487.x;
            double n10 = method35645 - class5487.z;
            if (a2 >= 0.0) {
                ++n9;
            }
            if (a3 >= 0.0) {
                ++n10;
            }
            double n11 = n9 / a2;
            double n12 = n10 / a3;
            final int n13 = (a2 >= 0.0) ? 1 : -1;
            final int n14 = (a3 >= 0.0) ? 1 : -1;
            final int method35646 = MathHelper.floor(class5488.x);
            final int method35647 = MathHelper.floor(class5488.z);
            int n15 = method35646 - method35644;
            int n16 = method35647 - method35645;
            while (n15 * n13 > 0 || n16 * n14 > 0) {
                if (n11 >= n12) {
                    n12 += n8;
                    method35645 += n14;
                    n16 = method35647 - method35645;
                }
                else {
                    n11 += n7;
                    method35644 += n13;
                    n15 = method35646 - method35644;
                }
                if (this.method24745(method35644, MathHelper.floor(class5487.y), method35645, n, n2, n3, class5487, a2, a3)) {
                    continue;
                }
                return false;
            }
            return true;
        }
        return false;
    }
    
    private boolean method24745(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final Vec3d class5487, final double n7, final double n8) {
        final int n9 = n - n4 / 2;
        final int n10 = n3 - n6 / 2;
        if (this.method24746(n9, n2, n10, n4, n5, n6, class5487, n7, n8)) {
            for (int i = n9; i < n9 + n4; ++i) {
                for (int j = n10; j < n10 + n6; ++j) {
                    if ((i + 0.5 - class5487.x) * n7 + (j + 0.5 - class5487.z) * n8 >= 0.0) {
                        final Class257 method13908 = this.field31672.method13908(this.field31658, i, n2 - 1, j, this.field31657, n4, n5, n6, true, true);
                        if (method13908 == Class257.field1211) {
                            return false;
                        }
                        if (method13908 == Class257.field1210) {
                            return false;
                        }
                        if (method13908 == Class257.field1206) {
                            return false;
                        }
                        final Class257 method13909 = this.field31672.method13908(this.field31658, i, n2, j, this.field31657, n4, n5, n6, true, true);
                        final float method13910 = this.field31657.method4144(method13909);
                        if (method13910 >= 0.0f && method13910 < 8.0f) {
                            if (method13909 != Class257.field1215) {
                                if (method13909 != Class257.field1214) {
                                    if (method13909 != Class257.field1219) {
                                        continue;
                                    }
                                }
                            }
                            return false;
                        }
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }
    
    private boolean method24746(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final Vec3d class5487, final double n7, final double n8) {
        for (final BlockPos class5488 : BlockPos.getAllInBoxMutable(new BlockPos(n, n2, n3), new BlockPos(n + n4 - 1, n2 + n5 - 1, n3 + n6 - 1))) {
            if ((class5488.getX() + 0.5 - class5487.x) * n7 + (class5488.getZ() + 0.5 - class5487.z) * n8 >= 0.0 && !this.field31658.getBlockState(class5488).method21749(this.field31658, class5488, Class2084.field12051)) {
                return false;
            }
        }
        return true;
    }
    
    public void method24747(final boolean b) {
        this.field31672.method13923(b);
    }
    
    public boolean method24748() {
        return this.field31672.method13925();
    }
    
    public void method24749(final boolean field31678) {
        this.field31678 = field31678;
    }
}
