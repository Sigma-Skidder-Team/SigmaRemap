// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

import java.util.stream.Stream;
import java.util.Random;

public abstract class Class6173
{
    private static final AxisAlignedBB field24931;
    public final Class1847 field24932;
    public double field24933;
    public double field24934;
    public double field24935;
    public double field24936;
    public double field24937;
    public double field24938;
    public double field24939;
    public double field24940;
    public double field24941;
    private AxisAlignedBB field24942;
    public boolean field24943;
    public boolean field24944;
    private boolean field24945;
    public boolean field24946;
    public float field24947;
    public float field24948;
    public final Random field24949;
    public int field24950;
    public int field24951;
    public float field24952;
    public float field24953;
    public float field24954;
    public float field24955;
    public float field24956;
    public float field24957;
    public float field24958;
    private Class384 field24959;
    
    public Class6173(final Class1847 field24932, final double field24933, final double field24934, final double field24935) {
        this.field24942 = Class6173.field24931;
        this.field24944 = true;
        this.field24947 = 0.6f;
        this.field24948 = 1.8f;
        this.field24949 = new Random();
        this.field24953 = 1.0f;
        this.field24954 = 1.0f;
        this.field24955 = 1.0f;
        this.field24956 = 1.0f;
        this.field24959 = new Class384();
        this.field24932 = field24932;
        this.method18440(0.2f, 0.2f);
        this.method18441(field24933, field24934, field24935);
        this.field24933 = field24933;
        this.field24934 = field24934;
        this.field24935 = field24935;
        this.field24951 = (int)(4.0f / (this.field24949.nextFloat() * 0.9f + 0.1f));
    }
    
    public Class6173(final Class1847 class1847, final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
        this(class1847, n, n2, n3);
        this.field24939 = n4 + (Math.random() * 2.0 - 1.0) * 0.4000000059604645;
        this.field24940 = n5 + (Math.random() * 2.0 - 1.0) * 0.4000000059604645;
        this.field24941 = n6 + (Math.random() * 2.0 - 1.0) * 0.4000000059604645;
        final float n7 = (float)(Math.random() + Math.random() + 1.0) * 0.15f;
        final float method35641 = MathHelper.sqrt(this.field24939 * this.field24939 + this.field24940 * this.field24940 + this.field24941 * this.field24941);
        this.field24939 = this.field24939 / method35641 * n7 * 0.4000000059604645;
        this.field24940 = this.field24940 / method35641 * n7 * 0.4000000059604645 + 0.10000000149011612;
        this.field24941 = this.field24941 / method35641 * n7 * 0.4000000059604645;
    }
    
    public Class6173 method18434(final float n) {
        this.field24939 *= n;
        this.field24940 = (this.field24940 - 0.10000000149011612) * n + 0.10000000149011612;
        this.field24941 *= n;
        return this;
    }
    
    public Class6173 method18433(final float n) {
        this.method18440(0.2f * n, 0.2f * n);
        return this;
    }
    
    public void method18435(final float field24953, final float field24954, final float field24955) {
        this.field24953 = field24953;
        this.field24954 = field24954;
        this.field24955 = field24955;
    }
    
    public void method18436(final float field24956) {
        this.field24956 = field24956;
    }
    
    public void method18437(final int field24951) {
        this.field24951 = field24951;
    }
    
    public int method18438() {
        return this.field24951;
    }
    
    public void method18420() {
        this.field24933 = this.field24936;
        this.field24934 = this.field24937;
        this.field24935 = this.field24938;
        if (this.field24950++ < this.field24951) {
            this.field24940 -= 0.04 * this.field24952;
            this.method18431(this.field24939, this.field24940, this.field24941);
            this.field24939 *= 0.9800000190734863;
            this.field24940 *= 0.9800000190734863;
            this.field24941 *= 0.9800000190734863;
            if (this.field24943) {
                this.field24939 *= 0.699999988079071;
                this.field24941 *= 0.699999988079071;
            }
        }
        else {
            this.method18439();
        }
    }
    
    public abstract void method18432(final Class4150 p0, final Class6092 p1, final float p2);
    
    public abstract Class6451 method18418();
    
    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ", Pos (" + this.field24936 + "," + this.field24937 + "," + this.field24938 + "), RGBA (" + this.field24953 + "," + this.field24954 + "," + this.field24955 + "," + this.field24956 + "), Age " + this.field24950;
    }
    
    public void method18439() {
        this.field24946 = true;
    }
    
    public void method18440(final float field24947, final float field24948) {
        if (field24947 != this.field24947 || field24948 != this.field24948) {
            this.field24947 = field24947;
            this.field24948 = field24948;
            final AxisAlignedBB method18444 = this.method18444();
            final double n = (method18444.field25073 + method18444.field25076 - field24947) / 2.0;
            final double n2 = (method18444.field25075 + method18444.field25078 - field24947) / 2.0;
            this.method18445(new AxisAlignedBB(n, method18444.field25074, n2, n + this.field24947, method18444.field25074 + this.field24948, n2 + this.field24947));
        }
    }
    
    public void method18441(final double field24936, final double field24937, final double field24938) {
        this.field24936 = field24936;
        this.field24937 = field24937;
        this.field24938 = field24938;
        final float n = this.field24947 / 2.0f;
        this.method18445(new AxisAlignedBB(field24936 - n, field24937, field24938 - n, field24936 + n, field24937 + this.field24948, field24938 + n));
    }
    
    public void method18431(double field22770, double field22771, double field22772) {
        if (!this.field24945) {
            final double n = field22770;
            final double n2 = field22771;
            Label_0022: {
                if (this.field24944) {
                    if (field22770 == 0.0) {
                        if (field22771 == 0.0) {
                            if (field22772 == 0.0) {
                                break Label_0022;
                            }
                        }
                    }
                    if (this.method18446(field22770, field22771, field22772)) {
                        final Vec3d method1681 = Entity.method1681(null, new Vec3d(field22770, field22771, field22772), this.method18444(), this.field24932, Class7543.method23629(), new Class8120<Class7702>(Stream.empty()));
                        field22770 = method1681.x;
                        field22771 = method1681.y;
                        field22772 = method1681.z;
                    }
                }
            }
            Label_0178: {
                if (field22770 == 0.0) {
                    if (field22771 == 0.0) {
                        if (field22772 == 0.0) {
                            break Label_0178;
                        }
                    }
                }
                this.method18445(this.method18444().method18499(field22770, field22771, field22772));
                this.method18442();
            }
            if (Math.abs(field22771) >= 9.999999747378752E-6) {
                if (Math.abs(field22771) < 9.999999747378752E-6) {
                    this.field24945 = true;
                }
            }
            this.field24943 = (field22771 != field22771 && n2 < 0.0);
            if (n != field22770) {
                this.field24939 = 0.0;
            }
            if (field22772 != field22772) {
                this.field24941 = 0.0;
            }
        }
    }
    
    public void method18442() {
        final AxisAlignedBB method18444 = this.method18444();
        this.field24936 = (method18444.field25073 + method18444.field25076) / 2.0;
        this.field24937 = method18444.field25074;
        this.field24938 = (method18444.field25075 + method18444.field25078) / 2.0;
    }
    
    public int method18419(final float n) {
        final BlockPos class354 = new BlockPos(this.field24936, this.field24937, this.field24938);
        return this.field24932.method6971(class354) ? Class1656.method5776(this.field24932, class354) : 0;
    }
    
    public boolean method18443() {
        return !this.field24946;
    }
    
    public AxisAlignedBB method18444() {
        return this.field24942;
    }
    
    public void method18445(final AxisAlignedBB field24942) {
        this.field24942 = field24942;
    }
    
    private boolean method18446(final double n, final double n2, final double n3) {
        if (this.field24947 > 1.0f || this.field24948 > 1.0f) {
            return true;
        }
        final int method35644 = MathHelper.floor(this.field24936);
        final int method35645 = MathHelper.floor(this.field24937);
        final int method35646 = MathHelper.floor(this.field24938);
        this.field24959.method1279(method35644, method35645, method35646);
        if (this.field24932.method6701(this.field24959).method21706()) {
            final double n4 = (n <= 0.0) ? ((n >= 0.0) ? this.field24936 : this.field24942.field25073) : this.field24942.field25076;
            final double n5 = (n2 <= 0.0) ? ((n2 >= 0.0) ? this.field24937 : this.field24942.field25074) : this.field24942.field25077;
            final double n6 = (n3 <= 0.0) ? ((n3 >= 0.0) ? this.field24938 : this.field24942.field25075) : this.field24942.field25078;
            final int method35647 = MathHelper.floor(n4 + n);
            final int method35648 = MathHelper.floor(n5 + n2);
            final int method35649 = MathHelper.floor(n6 + n3);
            if (method35647 == method35644) {
                if (method35648 == method35645) {
                    if (method35649 == method35646) {
                        return false;
                    }
                }
            }
            this.field24959.method1279(method35647, method35648, method35649);
            if (!this.field24932.method6701(this.field24959).method21706()) {
                return true;
            }
            return false;
        }
        return true;
    }
    
    static {
        field24931 = new AxisAlignedBB(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
    }
}
