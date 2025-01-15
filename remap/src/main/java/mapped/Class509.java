// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;
import com.google.common.collect.Lists;
import net.minecraft.entity.Entity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

import java.util.UUID;

public class Class509 extends Entity
{
    private Class511 field2904;
    private Entity field2905;
    private Direction field2906;
    private int field2907;
    private double field2908;
    private double field2909;
    private double field2910;
    private UUID field2911;
    private BlockPos field2912;
    private UUID field2913;
    private BlockPos field2914;
    
    public Class509(final Class7499<? extends Class509> class7499, final Class1847 class7500) {
        super(class7499, class7500);
        this.field2421 = true;
    }
    
    public Class509(final Class1847 class1847, final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
        this(Class7499.field29021, class1847);
        this.method1730(n, n2, n3, this.field2399, this.field2400);
        this.method1937(n4, n5, n6);
    }
    
    public Class509(final Class1847 class1847, final Class511 field2904, final Entity field2905, final Axis class1848) {
        this(Class7499.field29021, class1847);
        this.field2904 = field2904;
        final BlockPos class1849 = new BlockPos(field2904);
        this.method1730(class1849.getX() + 0.5, class1849.getY() + 0.5, class1849.getZ() + 0.5, this.field2399, this.field2400);
        this.field2905 = field2905;
        this.field2906 = Direction.UP;
        this.method2611(class1848);
    }
    
    @Override
    public Class286 method1922() {
        return Class286.field1583;
    }
    
    @Override
    public void method1761(final Class51 class51) {
        if (this.field2904 != null) {
            final BlockPos class52 = new BlockPos(this.field2904);
            final Class51 method34643 = Class9346.method34643(this.field2904.method1865());
            method34643.method298("X", class52.getX());
            method34643.method298("Y", class52.getY());
            method34643.method298("Z", class52.getZ());
            class51.method295("Owner", method34643);
        }
        if (this.field2905 != null) {
            final BlockPos class53 = new BlockPos(this.field2905);
            final Class51 method34644 = Class9346.method34643(this.field2905.method1865());
            method34644.method298("X", class53.getX());
            method34644.method298("Y", class53.getY());
            method34644.method298("Z", class53.getZ());
            class51.method295("Target", method34644);
        }
        if (this.field2906 != null) {
            class51.method298("Dir", this.field2906.getIndex());
        }
        class51.method298("Steps", this.field2907);
        class51.method305("TXD", this.field2908);
        class51.method305("TYD", this.field2909);
        class51.method305("TZD", this.field2910);
    }
    
    @Override
    public void method1760(final Class51 class51) {
        this.field2907 = class51.method319("Steps");
        this.field2908 = class51.method322("TXD");
        this.field2909 = class51.method322("TYD");
        this.field2910 = class51.method322("TZD");
        if (class51.method316("Dir", 99)) {
            this.field2906 = Direction.byIndex(class51.method319("Dir"));
        }
        if (class51.method316("Owner", 10)) {
            final Class51 method327 = class51.method327("Owner");
            this.field2911 = Class9346.method34644(method327);
            this.field2912 = new BlockPos(method327.method319("X"), method327.method319("Y"), method327.method319("Z"));
        }
        if (class51.method316("Target", 10)) {
            final Class51 method328 = class51.method327("Target");
            this.field2913 = Class9346.method34644(method328);
            this.field2914 = new BlockPos(method328.method319("X"), method328.method319("Y"), method328.method319("Z"));
        }
    }
    
    @Override
    public void method1649() {
    }
    
    private void method2610(final Direction field2906) {
        this.field2906 = field2906;
    }
    
    private void method2611(final Axis class111) {
        double n = 0.5;
        BlockPos method1139;
        if (this.field2905 != null) {
            n = this.field2905.method1931() * 0.5;
            method1139 = new BlockPos(this.field2905.getPosX(), this.field2905.getPosY() + n, this.field2905.getPosZ());
        }
        else {
            method1139 = new BlockPos(this).method1139();
        }
        double n2 = method1139.getX() + 0.5;
        double n3 = method1139.getY() + n;
        double n4 = method1139.getZ() + 0.5;
        Direction class112 = null;
        if (!method1139.withinDistance(this.method1934(), 2.0)) {
            final BlockPos class113 = new BlockPos(this);
            final ArrayList arrayList = Lists.newArrayList();
            if (class111 != Axis.X) {
                if (class113.getX() < method1139.getX() && this.field2391.method6961(class113.method1147())) {
                    arrayList.add(Direction.EAST);
                }
                else if (class113.getX() > method1139.getX()) {
                    if (this.field2391.method6961(class113.method1145())) {
                        arrayList.add(Direction.WEST);
                    }
                }
            }
            if (class111 != Axis.Y) {
                if (class113.getY() < method1139.getY() && this.field2391.method6961(class113.method1137())) {
                    arrayList.add(Direction.UP);
                }
                else if (class113.getY() > method1139.getY()) {
                    if (this.field2391.method6961(class113.method1139())) {
                        arrayList.add(Direction.DOWN);
                    }
                }
            }
            if (class111 != Axis.Z) {
                if (class113.getZ() < method1139.getZ() && this.field2391.method6961(class113.method1143())) {
                    arrayList.add(Direction.SOUTH);
                }
                else if (class113.getZ() > method1139.getZ()) {
                    if (this.field2391.method6961(class113.method1141())) {
                        arrayList.add(Direction.NORTH);
                    }
                }
            }
            class112 = Direction.random(this.field2423);
            if (!arrayList.isEmpty()) {
                class112 = (Direction)arrayList.get(this.field2423.nextInt(arrayList.size()));
            }
            else {
                for (int n5 = 5; !this.field2391.method6961(class113.method1149(class112)) && n5 > 0; class112 = Direction.random(this.field2423), --n5) {}
            }
            n2 = this.getPosX() + class112.getXOffset();
            n3 = this.getPosY() + class112.getYOffset();
            n4 = this.getPosZ() + class112.getZOffset();
        }
        this.method2610(class112);
        final double n6 = n2 - this.getPosX();
        final double n7 = n3 - this.getPosY();
        final double n8 = n4 - this.getPosZ();
        final double n9 = MathHelper.sqrt(n6 * n6 + n7 * n7 + n8 * n8);
        if (n9 != 0.0) {
            this.field2908 = n6 / n9 * 0.15;
            this.field2909 = n7 / n9 * 0.15;
            this.field2910 = n8 / n9 * 0.15;
        }
        else {
            this.field2908 = 0.0;
            this.field2909 = 0.0;
            this.field2910 = 0.0;
        }
        this.field2448 = true;
        this.field2907 = 10 + this.field2423.nextInt(5) * 10;
    }
    
    @Override
    public void method1949() {
        if (this.field2391.method6954() == Class2113.field12290) {
            this.method1652();
        }
    }
    
    @Override
    public void method1659() {
        super.method1659();
        if (!this.field2391.field10067) {
            if (this.field2905 == null) {
                if (this.field2913 != null) {
                    for (final Class511 field2905 : this.field2391.method7128((Class<? extends Class511>)Class511.class, new AxisAlignedBB(this.field2914.method1134(-2, -2, -2), this.field2914.method1134(2, 2, 2)))) {
                        if (!field2905.method1865().equals(this.field2913)) {
                            continue;
                        }
                        this.field2905 = field2905;
                        break;
                    }
                    this.field2913 = null;
                }
            }
            if (this.field2904 == null) {
                if (this.field2911 != null) {
                    for (final Class511 field2906 : this.field2391.method7128((Class<? extends Class511>)Class511.class, new AxisAlignedBB(this.field2912.method1134(-2, -2, -2), this.field2912.method1134(2, 2, 2)))) {
                        if (!field2906.method1865().equals(this.field2911)) {
                            continue;
                        }
                        this.field2904 = field2906;
                        break;
                    }
                    this.field2911 = null;
                }
            }
            Label_0104: {
                if (this.field2905 != null) {
                    if (this.field2905.method1768()) {
                        if (!(this.field2905 instanceof Class512) || !((Class512)this.field2905).method1639()) {
                            this.field2908 = MathHelper.method35654(this.field2908 * 1.025, -1.0, 1.0);
                            this.field2909 = MathHelper.method35654(this.field2909 * 1.025, -1.0, 1.0);
                            this.field2910 = MathHelper.method35654(this.field2910 * 1.025, -1.0, 1.0);
                            final Vec3d method1935 = this.method1935();
                            this.method1936(method1935.add((this.field2908 - method1935.x) * 0.2, (this.field2909 - method1935.y) * 0.2, (this.field2910 - method1935.z) * 0.2));
                            break Label_0104;
                        }
                    }
                }
                if (!this.method1698()) {
                    this.method1936(this.method1935().add(0.0, -0.04, 0.0));
                }
            }
            final Class7006 method1936 = Class7476.method23092(this, true, false, this.field2904, Class2040.field11632);
            if (method1936.method21449() != Class2165.field12880) {
                this.method2612(method1936);
            }
        }
        final Vec3d method1937 = this.method1935();
        this.method1656(this.getPosX() + method1937.x, this.getPosY() + method1937.y, this.getPosZ() + method1937.z);
        Class7476.method23099(this, 0.5f);
        if (!this.field2391.field10067) {
            if (this.field2905 != null) {
                if (!this.field2905.field2410) {
                    if (this.field2907 > 0) {
                        --this.field2907;
                        if (this.field2907 == 0) {
                            this.method2611((this.field2906 != null) ? this.field2906.getAxis() : null);
                        }
                    }
                    if (this.field2906 != null) {
                        final BlockPos class354 = new BlockPos(this);
                        final Axis method1938 = this.field2906.getAxis();
                        if (!this.field2391.method6732(class354.method1149(this.field2906), this)) {
                            final BlockPos class355 = new BlockPos(this.field2905);
                            if (method1938 != Axis.X || class354.getX() != class355.getX()) {
                                if (method1938 != Axis.Z || class354.getZ() != class355.getZ()) {
                                    if (method1938 != Axis.Y) {
                                        return;
                                    }
                                    if (class354.getY() != class355.getY()) {
                                        return;
                                    }
                                }
                            }
                            this.method2611(method1938);
                        }
                        else {
                            this.method2611(method1938);
                        }
                    }
                }
            }
        }
        else {
            this.field2391.method6709(Class8432.field34616, this.getPosX() - method1937.x, this.getPosY() - method1937.y + 0.15, this.getPosZ() - method1937.z, 0.0, 0.0, 0.0);
        }
    }
    
    @Override
    public boolean method1804() {
        return false;
    }
    
    @Override
    public boolean method1753(final double n) {
        return n < 16384.0;
    }
    
    @Override
    public float method1726() {
        return 1.0f;
    }
    
    public void method2612(final Class7006 class7006) {
        if (class7006.method21449() != Class2165.field12882) {
            ((Class1849)this.field2391).method6911(Class8432.field34619, this.getPosX(), this.getPosY(), this.getPosZ(), 2, 0.2, 0.2, 0.2, 0.0);
            this.method1695(Class8520.field35551, 1.0f, 1.0f);
        }
        else {
            final Entity method21452 = ((Class7007)class7006).method21452();
            if (method21452.method1740(Class7929.method25694(this, this.field2904).method25706(), 4.0f)) {
                this.method1900(this.field2904, method21452);
                if (method21452 instanceof Class511) {
                    ((Class511)method21452).method2655(new Class1948(Class9439.field40498, 200));
                }
            }
        }
        this.method1652();
    }
    
    @Override
    public boolean method1749() {
        return true;
    }
    
    @Override
    public boolean method1740(final Class7929 class7929, final float n) {
        if (!this.field2391.field10067) {
            this.method1695(Class8520.field35552, 1.0f, 1.0f);
            ((Class1849)this.field2391).method6911(Class8432.field34603, this.getPosX(), this.getPosY(), this.getPosZ(), 15, 0.2, 0.2, 0.2, 0.0);
            this.method1652();
        }
        return true;
    }
    
    @Override
    public Class4252<?> method1932() {
        return new Class4339(this);
    }
}
