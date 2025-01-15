// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

import javax.annotation.Nullable;
import java.util.Objects;
import java.util.UUID;

public class Class427 extends Entity
{
    private static final Class8810<Class8321> field2613;
    private int field2614;
    private int field2615;
    private int field2616;
    private UUID field2617;
    private UUID field2618;
    public final float field2619;
    
    public Class427(final Class7499<? extends Class427> class7499, final Class1847 class7500) {
        super(class7499, class7500);
        this.field2616 = 5;
        this.field2619 = (float)(Math.random() * 3.141592653589793 * 2.0);
    }
    
    public Class427(final Class1847 class1847, final double n, final double n2, final double n3) {
        this(Class7499.field28992, class1847);
        this.method1656(n, n2, n3);
        this.field2399 = this.field2423.nextFloat() * 360.0f;
        this.method1937(this.field2423.nextDouble() * 0.2 - 0.1, 0.2, this.field2423.nextDouble() * 0.2 - 0.1);
    }
    
    public Class427(final Class1847 class1847, final double n, final double n2, final double n3, final Class8321 class1848) {
        this(class1847, n, n2, n3);
        this.method2108(class1848);
    }
    
    @Override
    public boolean method1700() {
        return false;
    }
    
    @Override
    public void method1649() {
        this.method1650().method33565(Class427.field2613, Class8321.field34174);
    }
    
    @Override
    public void method1659() {
        if (!this.method2107().method27620()) {
            super.method1659();
            if (this.field2615 > 0) {
                if (this.field2615 != 32767) {
                    --this.field2615;
                }
            }
            this.field2392 = this.getPosX();
            this.field2393 = this.getPosY();
            this.field2394 = this.getPosZ();
            final Vec3d method1935 = this.method1935();
            if (!this.method1720(Class7324.field28319)) {
                if (!this.method1698()) {
                    this.method1936(this.method1935().add(0.0, -0.04, 0.0));
                }
            }
            else {
                this.method2099();
            }
            if (!this.field2391.field10067) {
                if (this.field2421 = !this.field2391.method6977(this)) {
                    this.method1838(this.getPosX(), (this.method1886().field25074 + this.method1886().field25077) / 2.0, this.getPosZ());
                }
            }
            else {
                this.field2421 = false;
            }
            Label_0234: {
                if (this.field2404) {
                    if (Entity.method1680(this.method1935()) <= 9.999999747378752E-6) {
                        if ((this.field2424 + this.method1643()) % 4 != 0) {
                            break Label_0234;
                        }
                    }
                }
                this.method1671(Class2160.field12826, this.method1935());
                float n = 0.98f;
                if (this.field2404) {
                    n = this.field2391.method6701(new BlockPos(this.getPosX(), this.getPosY() - 1.0, this.getPosZ())).method21696().method11865() * 0.98f;
                }
                this.method1936(this.method1935().mul(n, 0.98, n));
                if (this.field2404) {
                    this.method1936(this.method1935().mul(1.0, -0.5, 1.0));
                }
            }
            boolean b = false;
            Label_0441: {
                if (MathHelper.floor(this.field2392) == MathHelper.floor(this.getPosX())) {
                    if (MathHelper.floor(this.field2393) == MathHelper.floor(this.getPosY())) {
                        if (MathHelper.floor(this.field2394) == MathHelper.floor(this.getPosZ())) {
                            b = false;
                            break Label_0441;
                        }
                    }
                }
                b = true;
            }
            if (this.field2424 % (b ? 2 : 40) == 0) {
                if (this.field2391.method6702(new BlockPos(this)).method21793(Class7324.field28320)) {
                    this.method1937((this.field2423.nextFloat() - this.field2423.nextFloat()) * 0.2f, 0.20000000298023224, (this.field2423.nextFloat() - this.field2423.nextFloat()) * 0.2f);
                    this.method1695(Class8520.field35214, 0.4f, 2.0f + this.field2423.nextFloat() * 0.4f);
                }
                if (!this.field2391.field10067) {
                    if (this.method2101()) {
                        this.method2100();
                    }
                }
            }
            if (this.field2614 != -32768) {
                ++this.field2614;
            }
            this.field2448 |= this.method1715();
            if (!this.field2391.field10067) {
                if (this.method1935().subtract(method1935).lengthSquared() > 0.01) {
                    this.field2448 = true;
                }
            }
            if (!this.field2391.field10067) {
                if (this.field2614 >= 6000) {
                    this.method1652();
                }
            }
        }
        else {
            this.method1652();
        }
    }
    
    private void method2099() {
        final Vec3d method1935 = this.method1935();
        this.method1937(method1935.x * 0.9900000095367432, method1935.y + ((method1935.y >= 0.05999999865889549) ? 0.0f : 5.0E-4f), method1935.z * 0.9900000095367432);
    }
    
    private void method2100() {
        if (this.method2101()) {
            for (final Class427 class427 : this.field2391.method6739((Class<? extends Class427>)Class427.class, this.method1886().method18495(0.5, 0.0, 0.5), class428 -> class428 != this && class428.method2101())) {
                if (!class427.method2101()) {
                    continue;
                }
                this.method2102(class427);
                if (!this.field2410) {
                    continue;
                }
                break;
            }
        }
    }
    
    private boolean method2101() {
        final Class8321 method2107 = this.method2107();
        if (this.method1768()) {
            if (this.field2615 != 32767) {
                if (this.field2614 != -32768) {
                    if (this.field2614 < 6000) {
                        if (method2107.method27690() < method2107.method27628()) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
    
    private void method2102(final Class427 class427) {
        final Class8321 method2107 = this.method2107();
        final Class8321 method2108 = class427.method2107();
        if (Objects.equals(this.method2109(), class427.method2109())) {
            if (method2103(method2107, method2108)) {
                if (method2108.method27690() >= method2107.method27690()) {
                    method2106(class427, method2108, this, method2107);
                }
                else {
                    method2106(this, method2107, class427, method2108);
                }
            }
        }
    }
    
    public static boolean method2103(final Class8321 class8321, final Class8321 class8322) {
        return class8322.method27622() == class8321.method27622() && class8322.method27690() + class8321.method27690() <= class8322.method27628() && !(class8322.method27656() ^ class8321.method27656()) && (!class8322.method27656() || class8322.method27657().equals(class8321.method27657()));
    }
    
    public static Class8321 method2104(final Class8321 class8321, final Class8321 class8322, final int b) {
        final int min = Math.min(Math.min(class8321.method27628(), b) - class8321.method27690(), class8322.method27690());
        final Class8321 method27641 = class8321.method27641();
        method27641.method27692(min);
        class8322.method27693(min);
        return method27641;
    }
    
    private static void method2105(final Class427 class427, final Class8321 class428, final Class8321 class429) {
        class427.method2108(method2104(class428, class429, 64));
    }
    
    private static void method2106(final Class427 class427, final Class8321 class428, final Class427 class429, final Class8321 class430) {
        method2105(class427, class428, class430);
        class427.field2615 = Math.max(class427.field2615, class429.field2615);
        class427.field2614 = Math.min(class427.field2614, class429.field2614);
        if (class430.method27620()) {
            class429.method1652();
        }
    }
    
    @Override
    public void method1703(final int n) {
        this.method1740(Class7929.field32562, (float)n);
    }
    
    @Override
    public boolean method1740(final Class7929 class7929, final float n) {
        if (!this.method1849(class7929)) {
            if (!this.method2107().method27620()) {
                if (this.method2107().method27622() == Class7739.field31530) {
                    if (class7929.method25707()) {
                        return false;
                    }
                }
            }
            this.method1739();
            this.field2616 -= (int)n;
            if (this.field2616 <= 0) {
                this.method1652();
            }
            return false;
        }
        return false;
    }
    
    @Override
    public void method1761(final Class51 class51) {
        class51.method297("Health", (short)this.field2616);
        class51.method297("Age", (short)this.field2614);
        class51.method297("PickupDelay", (short)this.field2615);
        if (this.method2111() != null) {
            class51.method295("Thrower", Class9346.method34643(this.method2111()));
        }
        if (this.method2109() != null) {
            class51.method295("Owner", Class9346.method34643(this.method2109()));
        }
        if (!this.method2107().method27620()) {
            class51.method295("Item", this.method2107().method27627(new Class51()));
        }
    }
    
    @Override
    public void method1760(final Class51 class51) {
        this.field2616 = class51.method318("Health");
        this.field2614 = class51.method318("Age");
        if (class51.method315("PickupDelay")) {
            this.field2615 = class51.method318("PickupDelay");
        }
        if (class51.method316("Owner", 10)) {
            this.field2618 = Class9346.method34644(class51.method327("Owner"));
        }
        if (class51.method316("Thrower", 10)) {
            this.field2617 = Class9346.method34644(class51.method327("Thrower"));
        }
        this.method2108(Class8321.method27619(class51.method327("Item")));
        if (this.method2107().method27620()) {
            this.method1652();
        }
    }
    
    @Override
    public void method1736(final Class512 class512) {
        if (!this.field2391.field10067) {
            final Class8321 method2107 = this.method2107();
            final Class3820 method2108 = method2107.method27622();
            final int method2109 = method2107.method27690();
            if (this.field2615 == 0) {
                if (this.field2618 == null || this.field2618.equals(class512.method1865())) {
                    if (class512.field3006.method2362(method2107)) {
                        class512.method2746(this, method2109);
                        if (method2107.method27620()) {
                            this.method1652();
                            method2107.method27691(method2109);
                        }
                        class512.method2860(Class8276.field33983.method8449(method2108), method2109);
                    }
                }
            }
        }
    }
    
    @Override
    public Class2250 method1841() {
        final Class2250 method1873 = this.method1873();
        return (method1873 == null) ? new Class2259(this.method2107().method27649(), new Object[0]) : method1873;
    }
    
    @Override
    public boolean method1847() {
        return false;
    }
    
    @Nullable
    @Override
    public Entity method1854(final Class383 class383) {
        final Entity method1854 = super.method1854(class383);
        if (!this.field2391.field10067) {
            if (method1854 instanceof Class427) {
                ((Class427)method1854).method2100();
            }
        }
        return method1854;
    }
    
    public Class8321 method2107() {
        return this.method1650().method33568(Class427.field2613);
    }
    
    public void method2108(final Class8321 class8321) {
        this.method1650().method33569(Class427.field2613, class8321);
    }
    
    @Nullable
    public UUID method2109() {
        return this.field2618;
    }
    
    public void method2110(final UUID field2618) {
        this.field2618 = field2618;
    }
    
    @Nullable
    public UUID method2111() {
        return this.field2617;
    }
    
    public void method2112(final UUID field2617) {
        this.field2617 = field2617;
    }
    
    public int method2113() {
        return this.field2614;
    }
    
    public void method2114() {
        this.field2615 = 10;
    }
    
    public void method2115() {
        this.field2615 = 0;
    }
    
    public void method2116() {
        this.field2615 = 32767;
    }
    
    public void method2117(final int field2615) {
        this.field2615 = field2615;
    }
    
    public boolean method2118() {
        return this.field2615 > 0;
    }
    
    public void method2119() {
        this.field2614 = -6000;
    }
    
    public void method2120() {
        this.method2116();
        this.field2614 = 5999;
    }
    
    @Override
    public Class4252<?> method1932() {
        return new Class4339(this);
    }
    
    static {
        field2613 = Class9184.method33564(Class427.class, Class7709.field30659);
    }
}
