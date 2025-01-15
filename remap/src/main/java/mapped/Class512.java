// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableMap;
import java.util.function.Predicate;
import java.nio.charset.StandardCharsets;
import java.util.UUID;
import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.Optional;
import com.mojang.datafixers.util.Either;

import java.util.OptionalInt;
import javax.annotation.Nullable;
import java.util.List;
import com.mojang.authlib.GameProfile;
import net.minecraft.entity.Entity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.MathHelper;

import java.util.Map;

public abstract class Class512 extends Class511
{
    public static final Class8295 field2997;
    private static final Map<Class290, Class8295> field2998;
    private static final Class8810<Float> field2999;
    private static final Class8810<Integer> field3000;
    public static final Class8810<Byte> field3001;
    public static final Class8810<Byte> field3002;
    public static final Class8810<Class51> field3003;
    public static final Class8810<Class51> field3004;
    private long field3005;
    public Class464 field3006;
    public Class485 field3007;
    public final Class3427 field3008;
    public Class3418 field3009;
    public Class9173 field3010;
    public int field3011;
    public float field3012;
    public float field3013;
    public int field3014;
    public double field3015;
    public double field3016;
    public double field3017;
    public double field3018;
    public double field3019;
    public double field3020;
    private int field3021;
    public boolean field3022;
    private BlockPos field3023;
    private boolean field3024;
    public final Class6999 field3025;
    public int field3026;
    public int field3027;
    public float field3028;
    public int field3029;
    public final float field3030 = 0.02f;
    private int field3031;
    private final GameProfile field3032;
    private boolean field3033;
    private Class8321 field3034;
    private final Class7948 field3035;
    public Class425 field3036;
    
    public Class512(final Class1847 class1847, final GameProfile field3032) {
        super(Class7499.field29058, class1847);
        this.field3006 = new Class464(this);
        this.field3007 = new Class485();
        this.field3010 = new Class9173();
        this.field3025 = new Class6999();
        this.field3034 = Class8321.field34174;
        this.field3035 = this.method2809();
        this.method1864(method2893(field3032));
        this.field3032 = field3032;
        this.field3008 = new Class3427(this.field3006, !class1847.field10067, this);
        this.field3009 = this.field3008;
        final BlockPos method6758 = class1847.method6758();
        this.method1730(method6758.getX() + 0.5, method6758.getY() + 1, method6758.getZ() + 0.5, 0.0f, 0.0f);
        this.field2964 = 180.0f;
    }
    
    public boolean method2803(final Class1847 class1847, final BlockPos class1848, final Class101 class1849) {
        if (!class1849.method589()) {
            return false;
        }
        if (class1849 == Class101.field301) {
            return true;
        }
        if (!this.method2880()) {
            final Class8321 method2713 = this.method2713();
            return method2713.method27620() || !method2713.method27686(class1847.method6793(), new Class7990(class1847, class1848, false));
        }
        return false;
    }
    
    @Override
    public void method2621() {
        super.method2621();
        this.method2711().method20873(Class8107.field33410).method23941(1.0);
        this.method2710(Class8107.field33408).method23941(0.10000000149011612);
        this.method2711().method20873(Class8107.field33412);
        this.method2711().method20873(Class8107.field33415);
    }
    
    @Override
    public void method1649() {
        super.method1649();
        this.field2432.method33565(Class512.field2999, 0.0f);
        this.field2432.method33565(Class512.field3000, 0);
        this.field2432.method33565(Class512.field3001, (Byte)0);
        this.field2432.method33565(Class512.field3002, (Byte)1);
        this.field2432.method33565(Class512.field3003, new Class51());
        this.field2432.method33565(Class512.field3004, new Class51());
    }
    
    @Override
    public void method1659() {
        this.field2421 = this.method1639();
        if (this.method1639()) {
            this.field2404 = false;
        }
        if (this.field3014 > 0) {
            --this.field3014;
        }
        if (!this.method2783()) {
            if (this.field3021 > 0) {
                ++this.field3021;
                if (this.field3021 >= 110) {
                    this.field3021 = 0;
                }
            }
        }
        else {
            ++this.field3021;
            if (this.field3021 > 100) {
                this.field3021 = 100;
            }
            if (!this.field2391.field10067) {
                if (this.field2391.method6703()) {
                    this.method2849(false, true);
                }
            }
        }
        this.method2807();
        super.method1659();
        if (!this.field2391.field10067) {
            if (this.field3009 != null) {
                if (!this.field3009.method10854(this)) {
                    this.method2814();
                    this.field3009 = this.field3008;
                }
            }
        }
        if (this.method1804()) {
            if (this.field3025.field27301) {
                this.method1667();
            }
        }
        this.method2810();
        if (!this.field2391.field10067) {
            this.field3010.method33488(this);
            this.method2857(Class8276.field33989);
            if (this.method1768()) {
                this.method2857(Class8276.field33990);
            }
            if (this.method1812()) {
                this.method2857(Class8276.field33992);
            }
            if (!this.method2783()) {
                this.method2857(Class8276.field33991);
            }
        }
        final double method35654 = MathHelper.method35654(this.method1938(), -2.9999999E7, 2.9999999E7);
        final double method35655 = MathHelper.method35654(this.method1945(), -2.9999999E7, 2.9999999E7);
        if (method35654 != this.method1938() || method35655 != this.method1945()) {
            this.method1656(method35654, this.method1941(), method35655);
        }
        ++this.field2944;
        final Class8321 method35656 = this.method2713();
        if (!Class8321.method27643(this.field3034, method35656)) {
            if (!Class8321.method27646(this.field3034, method35656)) {
                this.method2905();
            }
            this.field3034 = method35656.method27641();
        }
        this.method2808();
        this.field3035.method25771();
        this.method2811();
    }
    
    public boolean method2804() {
        return this.method1809();
    }
    
    public boolean method2805() {
        return this.method1809();
    }
    
    public boolean method2806() {
        return this.method1809();
    }
    
    public boolean method2807() {
        return this.field3022 = this.method1721(Class7324.field28319, true);
    }
    
    private void method2808() {
        if (this.method2718(Class2215.field13605).method27622() == Class7739.field31272) {
            if (!this.method1720(Class7324.field28319)) {
                this.method2655(new Class1948(Class9439.field40486, 200, 0, false, false, true));
            }
        }
    }
    
    public Class7948 method2809() {
        return new Class7948();
    }
    
    private void method2810() {
        this.field3015 = this.field3018;
        this.field3016 = this.field3019;
        this.field3017 = this.field3020;
        final double n = this.method1938() - this.field3018;
        final double n2 = this.method1941() - this.field3019;
        final double n3 = this.method1945() - this.field3020;
        if (n > 10.0) {
            this.field3018 = this.method1938();
            this.field3015 = this.field3018;
        }
        if (n3 > 10.0) {
            this.field3020 = this.method1945();
            this.field3017 = this.field3020;
        }
        if (n2 > 10.0) {
            this.field3019 = this.method1941();
            this.field3016 = this.field3019;
        }
        if (n < -10.0) {
            this.field3018 = this.method1938();
            this.field3015 = this.field3018;
        }
        if (n3 < -10.0) {
            this.field3020 = this.method1945();
            this.field3017 = this.field3020;
        }
        if (n2 < -10.0) {
            this.field3019 = this.method1941();
            this.field3016 = this.field3019;
        }
        this.field3018 += n * 0.25;
        this.field3020 += n3 * 0.25;
        this.field3019 += n2 * 0.25;
    }
    
    public void method2811() {
        if (this.method1782(Class290.field1666)) {
            Class290 class290;
            if (!this.method2773()) {
                if (!this.method2783()) {
                    if (!this.method1817()) {
                        if (!this.method2744()) {
                            if (this.method1809() && !this.field3025.field27302) {
                                class290 = Class290.field1668;
                            }
                            else {
                                class290 = Class290.field1663;
                            }
                        }
                        else {
                            class290 = Class290.field1667;
                        }
                    }
                    else {
                        class290 = Class290.field1666;
                    }
                }
                else {
                    class290 = Class290.field1665;
                }
            }
            else {
                class290 = Class290.field1664;
            }
            Class290 class291 = null;
            Label_0166: {
                if (!this.method1639()) {
                    if (!this.method1805()) {
                        if (!this.method1782(class290)) {
                            if (!this.method1782(Class290.field1668)) {
                                class291 = Class290.field1666;
                                break Label_0166;
                            }
                            class291 = Class290.field1668;
                            break Label_0166;
                        }
                    }
                }
                class291 = class290;
            }
            this.method1653(class291);
        }
    }
    
    @Override
    public int method1662() {
        return this.field3025.field27301 ? 1 : 80;
    }
    
    @Override
    public Class7795 method1686() {
        return Class8520.field35489;
    }
    
    @Override
    public Class7795 method1687() {
        return Class8520.field35487;
    }
    
    @Override
    public Class7795 method1688() {
        return Class8520.field35488;
    }
    
    @Override
    public int method1796() {
        return 10;
    }
    
    @Override
    public void method1695(final Class7795 class7795, final float n, final float n2) {
        this.field2391.method6706(this, this.method1938(), this.method1941(), this.method1945(), class7795, this.method1922(), n, n2);
    }
    
    public void method2812(final Class7795 class7795, final Class286 class7796, final float n, final float n2) {
    }
    
    @Override
    public Class286 method1922() {
        return Class286.field1585;
    }
    
    @Override
    public int method1923() {
        return 20;
    }
    
    @Override
    public void method1798(final byte b) {
        if (b != 9) {
            if (b != 23) {
                if (b != 22) {
                    if (b != 43) {
                        super.method1798(b);
                    }
                    else {
                        this.method2813(Class8432.field34602);
                    }
                }
                else {
                    this.field3033 = true;
                }
            }
            else {
                this.field3033 = false;
            }
        }
        else {
            this.method2765();
        }
    }
    
    private void method2813(final Class6909 class6909) {
        for (int i = 0; i < 5; ++i) {
            this.field2391.method6709(class6909, this.method1940(1.0), this.method1943() + 1.0, this.method1947(1.0), this.field2423.nextGaussian() * 0.02, this.field2423.nextGaussian() * 0.02, this.field2423.nextGaussian() * 0.02);
        }
    }
    
    public void method2814() {
        this.field3009 = this.field3008;
    }
    
    @Override
    public void method1772() {
        if (!this.field2391.field10067) {
            if (this.method2805()) {
                if (this.method1805()) {
                    this.method1784();
                    this.method1808(false);
                    return;
                }
            }
        }
        final double method1938 = this.method1938();
        final double method1939 = this.method1941();
        final double method1940 = this.method1945();
        final float field2399 = this.field2399;
        final float field2400 = this.field2400;
        super.method1772();
        this.field3012 = this.field3013;
        this.field3013 = 0.0f;
        this.method2867(this.method1938() - method1938, this.method1941() - method1939, this.method1945() - method1940);
        if (this.method1920() instanceof Class801) {
            this.field2400 = field2400;
            this.field2399 = field2399;
            this.field2951 = ((Class801)this.method1920()).field2951;
        }
    }
    
    @Override
    public void method1651() {
        this.method1653(Class290.field1663);
        super.method1651();
        this.method2665(this.method2701());
        this.field2941 = 0;
    }
    
    @Override
    public void method2738() {
        super.method2738();
        this.method2709();
        this.field2953 = this.field2399;
    }
    
    @Override
    public void method2736() {
        if (this.field3011 > 0) {
            --this.field3011;
        }
        if (this.field2391.method6954() == Class2113.field12290) {
            if (this.field2391.method6765().method31216(Class8878.field37323)) {
                if (this.method2664() < this.method2701()) {
                    if (this.field2424 % 20 == 0) {
                        this.method2663(1.0f);
                    }
                }
                if (this.field3010.method33492()) {
                    if (this.field2424 % 10 == 0) {
                        this.field3010.method33495(this.field3010.method33491() + 1);
                    }
                }
            }
        }
        this.field3006.method2361();
        this.field3012 = this.field3013;
        super.method2736();
        final Class7619 method2710 = this.method2710(Class8107.field33408);
        if (!this.field2391.field10067) {
            method2710.method23941(this.field3025.method21427());
        }
        this.field2955 = 0.02f;
        if (this.method1815()) {
            this.field2955 += (float)0.005999999865889549;
        }
        this.method2733((float)method2710.method23950());
        float min = 0.0f;
        Label_0290: {
            if (this.field2404) {
                if (this.method2664() > 0.0f) {
                    if (!this.method1817()) {
                        min = Math.min(0.1f, MathHelper.method35641(Entity.method1680(this.method1935())));
                        break Label_0290;
                    }
                }
            }
            min = 0.0f;
        }
        this.field3013 += (min - this.field3013) * 0.4f;
        if (this.method2664() > 0.0f) {
            if (!this.method1639()) {
                Class6221 class6221;
                if (this.method1805() && !this.method1920().field2410) {
                    class6221 = this.method1886().method18498(this.method1920().method1886()).method18495(1.0, 0.0, 1.0);
                }
                else {
                    class6221 = this.method1886().method18495(1.0, 0.5, 1.0);
                }
                final List<Entity> method2711 = this.field2391.method7127(this, class6221);
                for (int i = 0; i < method2711.size(); ++i) {
                    final Entity class6222 = method2711.get(i);
                    if (!class6222.field2410) {
                        this.method2816(class6222);
                    }
                }
            }
        }
        this.method2815(this.method2899());
        this.method2815(this.method2901());
        Label_0355: {
            if (!this.field2391.field10067) {
                if (this.field2414 > 0.5f) {
                    break Label_0355;
                }
                if (this.method1706()) {
                    break Label_0355;
                }
            }
            if (!this.field3025.field27302) {
                if (!this.method2783()) {
                    return;
                }
            }
        }
        this.method2887();
    }
    
    private void method2815(final Class51 class51) {
        if ((class51 != null && !class51.method315("Silent")) || !class51.method329("Silent")) {
            Class7499.method23355(class51.method323("id")).filter(class52 -> class52 == Class7499.field29011).ifPresent(p0 -> Class796.method4498(this.field2391, this));
        }
    }
    
    private void method2816(final Entity class399) {
        class399.method1736(this);
    }
    
    public int method2817() {
        return this.field2432.method33568(Class512.field3000);
    }
    
    public void method2818(final int i) {
        this.field2432.method33569(Class512.field3000, i);
    }
    
    public void method2819(final int n) {
        this.field2432.method33569(Class512.field3000, this.method2817() + n);
    }
    
    @Override
    public void method2673(final Class7929 class7929) {
        super.method2673(class7929);
        this.method1657();
        if (!this.method1639()) {
            this.method2675(class7929);
        }
        if (class7929 == null) {
            this.method1937(0.0, 0.1, 0.0);
        }
        else {
            this.method1937(-MathHelper.cos((this.field2940 + this.field2399) * 0.017453292f) * 0.1f, 0.10000000149011612, -MathHelper.sin((this.field2940 + this.field2399) * 0.017453292f) * 0.1f);
        }
        this.method2857(Class8276.field34016);
        this.method2861(Class8276.field33987.method8449(Class8276.field33990));
        this.method2861(Class8276.field33987.method8449(Class8276.field33991));
        this.method1667();
        this.method1830(0, false);
    }
    
    @Override
    public void method2676() {
        super.method2676();
        if (!this.field2391.method6765().method31216(Class8878.field37317)) {
            this.method2820();
            this.field3006.method2372();
        }
    }
    
    public void method2820() {
        for (int i = 0; i < this.field3006.method2239(); ++i) {
            final Class8321 method2157 = this.field3006.method2157(i);
            if (!method2157.method27620()) {
                if (Class8742.method30218(method2157)) {
                    this.field3006.method2159(i);
                }
            }
        }
    }
    
    @Override
    public Class7795 method2683(final Class7929 class7929) {
        if (class7929 == Class7929.field32564) {
            return Class8520.field35483;
        }
        if (class7929 != Class7929.field32569) {
            return (class7929 != Class7929.field32583) ? Class8520.field35481 : Class8520.field35484;
        }
        return Class8520.field35482;
    }
    
    @Override
    public Class7795 method2684() {
        return Class8520.field35480;
    }
    
    public boolean method2821(final boolean b) {
        return this.method2823(this.field3006.method2158(this.field3006.field2743, (b && !this.field3006.method2345().method27620()) ? this.field3006.method2345().method27690() : 1), false, true) != null;
    }
    
    @Nullable
    public Class427 method2822(final Class8321 class8321, final boolean b) {
        return this.method2823(class8321, false, b);
    }
    
    @Nullable
    public Class427 method2823(final Class8321 class8321, final boolean b, final boolean b2) {
        if (!class8321.method27620()) {
            final Class427 class8322 = new Class427(this.field2391, this.method1938(), this.method1944() - 0.30000001192092896, this.method1945(), class8321);
            class8322.method2117(40);
            if (b2) {
                class8322.method2112(this.method1865());
            }
            if (!b) {
                final float method35638 = MathHelper.sin(this.field2400 * 0.017453292f);
                final float method35639 = MathHelper.cos(this.field2400 * 0.017453292f);
                final float method35640 = MathHelper.sin(this.field2399 * 0.017453292f);
                final float method35641 = MathHelper.cos(this.field2399 * 0.017453292f);
                final float n = this.field2423.nextFloat() * 6.2831855f;
                final float n2 = 0.02f * this.field2423.nextFloat();
                class8322.method1937(-method35640 * method35639 * 0.3f + Math.cos(n) * n2, -method35638 * 0.3f + 0.1f + (this.field2423.nextFloat() - this.field2423.nextFloat()) * 0.1f, method35641 * method35639 * 0.3f + Math.sin(n) * n2);
            }
            else {
                final float n3 = this.field2423.nextFloat() * 0.5f;
                final float n4 = this.field2423.nextFloat() * 6.2831855f;
                class8322.method1937(-MathHelper.sin(n4) * n3, 0.20000000298023224, MathHelper.cos(n4) * n3);
            }
            return class8322;
        }
        return null;
    }
    
    public float method2824(final Class7096 class7096) {
        float method2366 = this.field3006.method2366(class7096);
        if (method2366 > 1.0f) {
            final int method2367 = Class8742.method30211(this);
            final Class8321 method2368 = this.method2713();
            if (method2367 > 0 && !method2368.method27620()) {
                method2366 += method2367 * method2367 + 1;
            }
        }
        if (Class9434.method35058(this)) {
            method2366 *= 1.0f + (Class9434.method35059(this) + 1) * 0.2f;
        }
        if (this.method2653(Class9439.field40477)) {
            float n = 0.0f;
            switch (this.method2654(Class9439.field40477).method7908()) {
                case 0: {
                    n = 0.3f;
                    break;
                }
                case 1: {
                    n = 0.09f;
                    break;
                }
                case 2: {
                    n = 0.0027f;
                    break;
                }
                default: {
                    n = 8.1E-4f;
                    break;
                }
            }
            method2366 *= n;
        }
        if (this.method1720(Class7324.field28319) && !Class8742.method30215(this)) {
            method2366 /= 5.0f;
        }
        if (!this.field2404) {
            method2366 /= 5.0f;
        }
        return method2366;
    }
    
    public boolean method2825(final Class7096 class7096) {
        return class7096.method21697().method26444() || this.field3006.method2369(class7096);
    }
    
    @Override
    public void method1760(final Class51 class51) {
        super.method1760(class51);
        this.method1864(method2893(this.field3032));
        this.field3006.method2368(class51.method328("Inventory", 10));
        this.field3006.field2743 = class51.method319("SelectedItemSlot");
        this.field3021 = class51.method318("SleepTimer");
        this.field3028 = class51.method321("XpP");
        this.field3026 = class51.method319("XpLevel");
        this.field3027 = class51.method319("XpTotal");
        this.field3029 = class51.method319("XpSeed");
        if (this.field3029 == 0) {
            this.field3029 = this.field2423.nextInt();
        }
        this.method2818(class51.method319("Score"));
        if (class51.method316("SpawnX", 99)) {
            if (class51.method316("SpawnY", 99)) {
                if (class51.method316("SpawnZ", 99)) {
                    this.field3023 = new BlockPos(class51.method319("SpawnX"), class51.method319("SpawnY"), class51.method319("SpawnZ"));
                    this.field3024 = class51.method329("SpawnForced");
                }
            }
        }
        this.field3010.method33489(class51);
        this.field3025.method21424(class51);
        if (class51.method316("EnderItems", 9)) {
            this.field3007.method2430(class51.method328("EnderItems", 10));
        }
        if (class51.method316("ShoulderEntityLeft", 10)) {
            this.method2900(class51.method327("ShoulderEntityLeft"));
        }
        if (class51.method316("ShoulderEntityRight", 10)) {
            this.method2902(class51.method327("ShoulderEntityRight"));
        }
    }
    
    @Override
    public void method1761(final Class51 class51) {
        super.method1761(class51);
        class51.method298("DataVersion", Class9528.method35579().getWorldVersion());
        class51.method295("Inventory", this.field3006.method2367(new Class52()));
        class51.method298("SelectedItemSlot", this.field3006.field2743);
        class51.method297("SleepTimer", (short)this.field3021);
        class51.method304("XpP", this.field3028);
        class51.method298("XpLevel", this.field3026);
        class51.method298("XpTotal", this.field3027);
        class51.method298("XpSeed", this.field3029);
        class51.method298("Score", this.method2817());
        if (this.field3023 != null) {
            class51.method298("SpawnX", this.field3023.getX());
            class51.method298("SpawnY", this.field3023.getY());
            class51.method298("SpawnZ", this.field3023.getZ());
            class51.method312("SpawnForced", this.field3024);
        }
        this.field3010.method33490(class51);
        this.field3025.method21423(class51);
        class51.method295("EnderItems", this.field3007.method2431());
        if (!this.method2899().method331()) {
            class51.method295("ShoulderEntityLeft", this.method2899());
        }
        if (!this.method2901().method331()) {
            class51.method295("ShoulderEntityRight", this.method2901());
        }
    }
    
    @Override
    public boolean method1849(final Class7929 class7929) {
        if (super.method1849(class7929)) {
            return true;
        }
        if (class7929 == Class7929.field32569) {
            return !this.field2391.method6765().method31216(Class8878.field37341);
        }
        if (class7929 != Class7929.field32572) {
            return class7929.method25719() && !this.field2391.method6765().method31216(Class8878.field37343);
        }
        return !this.field2391.method6765().method31216(Class8878.field37342);
    }
    
    @Override
    public boolean method1740(final Class7929 class7929, float min) {
        if (this.method1849(class7929)) {
            return false;
        }
        if (this.field3025.field27301 && !class7929.method25711()) {
            return false;
        }
        this.field2959 = 0;
        if (this.method2664() > 0.0f) {
            this.method2887();
            if (class7929.method25722()) {
                if (this.field2391.method6954() == Class2113.field12290) {
                    min = 0.0f;
                }
                if (this.field2391.method6954() == Class2113.field12291) {
                    min = Math.min(min / 2.0f + 1.0f, min);
                }
                if (this.field2391.method6954() == Class2113.field12293) {
                    min = min * 3.0f / 2.0f;
                }
            }
            return min != 0.0f && super.method1740(class7929, min);
        }
        return false;
    }
    
    @Override
    public void method2666(final Class511 class511) {
        super.method2666(class511);
        if (class511.method2713().method27622() instanceof Class4075) {
            this.method2838(true);
        }
    }
    
    public boolean method2826(final Class512 class512) {
        final Class6750 method1825 = this.method1825();
        final Class6750 method1826 = class512.method1825();
        return method1825 == null || !method1825.method20565(method1826) || method1825.method20550();
    }
    
    @Override
    public void method2694(final float n) {
        this.field3006.method2371(n);
    }
    
    @Override
    public void method2695(final float n) {
        if (n >= 3.0f) {
            if (this.field2987.method27622() == Class7739.field31583) {
                final int n2 = 1 + MathHelper.method35642(n);
                final Class316 method2757 = this.method2757();
                this.field2987.method27636(n2, this, class317 -> class317.method2795(class316));
                if (this.field2987.method27620()) {
                    if (method2757 != Class316.field1877) {
                        this.method1803(Class2215.field13601, Class8321.field34174);
                    }
                    else {
                        this.method1803(Class2215.field13600, Class8321.field34174);
                    }
                    this.field2987 = Class8321.field34174;
                    this.method1695(Class8520.field35546, 0.8f, 0.8f + this.field2391.field10062.nextFloat() * 0.4f);
                }
            }
        }
    }
    
    @Override
    public void method2698(final Class7929 class7929, float n) {
        if (!this.method1849(class7929)) {
            n = this.method2696(class7929, n);
            n = this.method2697(class7929, n);
            final float max = Math.max(n - this.method2750(), 0.0f);
            this.method2751(this.method2750() - (n - max));
            final float n2 = n - max;
            if (n2 > 0.0f) {
                if (n2 < 3.4028235E37f) {
                    this.method2858(Class8276.field34014, Math.round(n2 * 10.0f));
                }
            }
            if (max != 0.0f) {
                this.method2876(class7929.method25710());
                final float method2664 = this.method2664();
                this.method2665(this.method2664() - max);
                this.method2699().method35594(class7929, method2664, max);
                if (max < 3.4028235E37f) {
                    this.method2858(Class8276.field34012, Math.round(max * 10.0f));
                }
            }
        }
    }
    
    public void method2827(final Class497 class497) {
    }
    
    public void method2828(final Class865 class865) {
    }
    
    public void method2829(final Class500 class500) {
    }
    
    public void method2830(final Class501 class501) {
    }
    
    public void method2831(final Class498 class498) {
    }
    
    public void method2832(final Class806 class806, final Class446 class807) {
    }
    
    public OptionalInt method2833(final Class434 class434) {
        return OptionalInt.empty();
    }
    
    public void method2834(final int n, final Class57 class57, final int n2, final int n3, final boolean b, final boolean b2) {
    }
    
    public void method2835(final Class8321 class8321, final Class316 class8322) {
    }
    
    public Class2201 method2836(final Entity class399, final Class316 class400) {
        if (this.method1639()) {
            if (class399 instanceof Class434) {
                this.method2833((Class434)class399);
            }
            return Class2201.field13402;
        }
        Class8321 method2715 = this.method2715(class400);
        final Class8321 method2716 = method2715.method27641();
        if (!class399.method1770(this, class400)) {
            if (!method2715.method27620()) {
                if (class399 instanceof Class511) {
                    if (this.field3025.field27304) {
                        method2715 = method2716;
                    }
                    if (method2715.method27640(this, (Class511)class399, class400)) {
                        if (method2715.method27620()) {
                            if (!this.field3025.field27304) {
                                this.method2716(class400, Class8321.field34174);
                            }
                        }
                        return Class2201.field13400;
                    }
                }
            }
            return Class2201.field13402;
        }
        if (this.field3025.field27304) {
            if (method2715 == this.method2715(class400)) {
                if (method2715.method27690() < method2716.method27690()) {
                    method2715.method27691(method2716.method27690());
                }
            }
        }
        return Class2201.field13400;
    }
    
    @Override
    public double method1776() {
        return -0.35;
    }
    
    @Override
    public void method1784() {
        super.method1784();
        this.field2388 = 0;
    }
    
    @Override
    public boolean method2722() {
        return super.method2722() || this.method2783();
    }
    
    @Override
    public Vec3d method1676(Vec3d class5487, final Class2160 class5488) {
        final Class5738 class5489 = new Class5738(true);
        Class9463.method35173().method35188().method21097(class5489);
        Label_0074: {
            if ((class5488 != Class2160.field12826 && class5488 != Class2160.field12827) || class5489.method17025() != Class2228.field13706) {
                if (!this.field2404) {
                    break Label_0074;
                }
                if (!this.method2806()) {
                    break Label_0074;
                }
            }
            double field22770 = class5487.field22770;
            double field22771 = class5487.field22772;
            while (field22770 != 0.0) {
                if (!this.field2391.method6978(this, this.method1886().method18499(field22770, -this.field2420, 0.0))) {
                    break;
                }
                if (field22770 < 0.05 && field22770 >= -0.05) {
                    field22770 = 0.0;
                }
                else if (field22770 <= 0.0) {
                    field22770 += 0.05;
                }
                else {
                    field22770 -= 0.05;
                }
            }
            while (field22771 != 0.0) {
                if (!this.field2391.method6978(this, this.method1886().method18499(0.0, -this.field2420, field22771))) {
                    break;
                }
                if (field22771 < 0.05 && field22771 >= -0.05) {
                    field22771 = 0.0;
                }
                else if (field22771 <= 0.0) {
                    field22771 += 0.05;
                }
                else {
                    field22771 -= 0.05;
                }
            }
            while (field22770 != 0.0) {
                if (field22771 == 0.0) {
                    break;
                }
                if (!this.field2391.method6978(this, this.method1886().method18499(field22770, -this.field2420, field22771))) {
                    break;
                }
                if (field22770 < 0.05 && field22770 >= -0.05) {
                    field22770 = 0.0;
                }
                else if (field22770 <= 0.0) {
                    field22770 += 0.05;
                }
                else {
                    field22770 -= 0.05;
                }
                if (field22771 < 0.05 && field22771 >= -0.05) {
                    field22771 = 0.0;
                }
                else if (field22771 <= 0.0) {
                    field22771 += 0.05;
                }
                else {
                    field22771 -= 0.05;
                }
            }
            class5487 = new Vec3d(field22770, class5487.field22771, field22771);
        }
        Class9463.method35173().method35188().method21097(new Class5738(false));
        return class5487;
    }
    
    public void method2837(final Entity class399) {
        if (class399.method1847()) {
            if (!class399.method1848(this)) {
                final float n = (float)this.method2710(Class8107.field33410).method23950();
                float n2;
                if (!(class399 instanceof Class511)) {
                    n2 = Class8742.method30202(this.method2713(), Class6363.field25460);
                }
                else {
                    n2 = Class8742.method30202(this.method2713(), ((Class511)class399).method2712());
                }
                final float method2904 = this.method2904(0.5f);
                float n3 = n * (0.2f + method2904 * method2904 * 0.8f);
                final float n4 = n2 * method2904;
                this.method2905();
                if (n3 > 0.0f || n4 > 0.0f) {
                    final boolean b = method2904 > 0.9f;
                    boolean b2 = false;
                    int n5 = 0 + Class8742.method30207(this);
                    if (this.method1815()) {
                        if (b) {
                            this.field2391.method6706(null, this.method1938(), this.method1941(), this.method1945(), Class8520.field35472, this.method1922(), 1.0f, 1.0f);
                            ++n5;
                            b2 = true;
                        }
                    }
                    boolean b3 = false;
                    Label_0318: {
                        if (b) {
                            if (this.field2414 > 0.0f) {
                                if (!this.field2404) {
                                    if (!this.method2688()) {
                                        if (!this.method1706()) {
                                            if (!this.method2653(Class9439.field40488)) {
                                                if (!this.method1805()) {
                                                    if (class399 instanceof Class511) {
                                                        b3 = true;
                                                        break Label_0318;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        b3 = false;
                    }
                    final boolean b4 = b3 && !this.method1815();
                    if (b4) {
                        n3 *= 1.5f;
                    }
                    final float n6 = n3 + n4;
                    boolean b5 = false;
                    final double n7 = this.field2412 - this.field2411;
                    if (b) {
                        if (!b4) {
                            if (!b2) {
                                if (this.field2404) {
                                    if (n7 < this.method2732()) {
                                        if (this.method2715(Class316.field1877).method27622() instanceof Class4077) {
                                            b5 = true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    float method2905 = 0.0f;
                    int n8 = 0;
                    final int method2906 = Class8742.method30208(this);
                    if (class399 instanceof Class511) {
                        method2905 = ((Class511)class399).method2664();
                        if (method2906 > 0) {
                            if (!class399.method1804()) {
                                n8 = 1;
                                class399.method1664(1);
                            }
                        }
                    }
                    final Vec3d method2907 = class399.method1935();
                    if (!class399.method1740(Class7929.method25695(this), n6)) {
                        this.field2391.method6706(null, this.method1938(), this.method1941(), this.method1945(), Class8520.field35473, this.method1922(), 1.0f, 1.0f);
                        if (n8 != 0) {
                            class399.method1667();
                        }
                    }
                    else {
                        if (n5 > 0) {
                            if (!(class399 instanceof Class511)) {
                                class399.method1738(-MathHelper.sin(this.field2399 * 0.017453292f) * n5 * 0.5f, 0.1, MathHelper.cos(this.field2399 * 0.017453292f) * n5 * 0.5f);
                            }
                            else {
                                ((Class511)class399).method2682(this, n5 * 0.5f, MathHelper.sin(this.field2399 * 0.017453292f), -MathHelper.cos(this.field2399 * 0.017453292f));
                            }
                            this.method1936(this.method1935().method16751(0.6, 1.0, 0.6));
                            this.method1816(false);
                        }
                        if (b5) {
                            final float n9 = 1.0f + Class8742.method30203(this) * n6;
                            for (final Class511 class400 : this.field2391.method7128((Class<? extends Class511>)Class511.class, class399.method1886().method18495(1.0, 0.25, 1.0))) {
                                if (class400 == this) {
                                    continue;
                                }
                                if (class400 == class399) {
                                    continue;
                                }
                                if (this.method1826(class400)) {
                                    continue;
                                }
                                if (class400 instanceof Class857 && ((Class857)class400).method5166()) {
                                    continue;
                                }
                                if (this.method1734(class400) >= 9.0) {
                                    continue;
                                }
                                class400.method2682(this, 0.4f, MathHelper.sin(this.field2399 * 0.017453292f), -MathHelper.cos(this.field2399 * 0.017453292f));
                                class400.method1740(Class7929.method25695(this), n9);
                            }
                            this.field2391.method6706(null, this.method1938(), this.method1941(), this.method1945(), Class8520.field35475, this.method1922(), 1.0f, 1.0f);
                            this.method2841();
                        }
                        if (class399 instanceof Class513) {
                            if (class399.field2408) {
                                ((Class513)class399).field3039.method17469(new Class4273(class399));
                                class399.field2408 = false;
                                class399.method1936(method2907);
                            }
                        }
                        if (b4) {
                            this.field2391.method6706(null, this.method1938(), this.method1941(), this.method1945(), Class8520.field35471, this.method1922(), 1.0f, 1.0f);
                            this.method2839(class399);
                        }
                        if (!b4) {
                            if (!b5) {
                                if (!b) {
                                    this.field2391.method6706(null, this.method1938(), this.method1941(), this.method1945(), Class8520.field35476, this.method1922(), 1.0f, 1.0f);
                                }
                                else {
                                    this.field2391.method6706(null, this.method1938(), this.method1941(), this.method1945(), Class8520.field35474, this.method1922(), 1.0f, 1.0f);
                                }
                            }
                        }
                        if (n4 > 0.0f) {
                            this.method2840(class399);
                        }
                        this.method2639(class399);
                        if (class399 instanceof Class511) {
                            Class8742.method30204((Class511)class399, this);
                        }
                        Class8742.method30205(this, class399);
                        final Class8321 method2908 = this.method2713();
                        Entity field4594 = class399;
                        if (class399 instanceof Class859) {
                            field4594 = ((Class859)class399).field4594;
                        }
                        if (!this.field2391.field10067) {
                            if (!method2908.method27620()) {
                                if (field4594 instanceof Class511) {
                                    method2908.method27637((Class511)field4594, this);
                                    if (method2908.method27620()) {
                                        this.method2716(Class316.field1877, Class8321.field34174);
                                    }
                                }
                            }
                        }
                        if (class399 instanceof Class511) {
                            final float n10 = method2905 - ((Class511)class399).method2664();
                            this.method2858(Class8276.field34009, Math.round(n10 * 10.0f));
                            if (method2906 > 0) {
                                class399.method1664(method2906 * 4);
                            }
                            if (this.field2391 instanceof Class1849) {
                                if (n10 > 2.0f) {
                                    ((Class1849)this.field2391).method6911(Class8432.field34604, class399.method1938(), class399.method1942(0.5), class399.method1945(), (int)(n10 * 0.5), 0.1, 0.0, 0.1, 0.2);
                                }
                            }
                        }
                        this.method2876(0.1f);
                    }
                }
            }
        }
    }
    
    @Override
    public void method2742(final Class511 class511) {
        this.method2837(class511);
    }
    
    public void method2838(final boolean b) {
        float n = 0.25f + Class8742.method30211(this) * 0.05f;
        if (b) {
            n += 0.75f;
        }
        if (this.field2423.nextFloat() < n) {
            this.method2906().method25772(Class7739.field31583, 100);
            this.method2770();
            this.field2391.method6761(this, (byte)30);
        }
    }
    
    public void method2839(final Entity class399) {
    }
    
    public void method2840(final Entity class399) {
    }
    
    public void method2841() {
        final double n = -MathHelper.sin(this.field2399 * 0.017453292f);
        final double n2 = MathHelper.cos(this.field2399 * 0.017453292f);
        if (this.field2391 instanceof Class1849) {
            ((Class1849)this.field2391).method6911(Class8432.field34643, this.method1938() + n, this.method1942(0.5), this.method1945() + n2, 0, n, 0.0, n2, 0.0);
        }
    }
    
    public void method2842() {
    }
    
    @Override
    public void method1652() {
        super.method1652();
        this.field3008.method10859(this);
        if (this.field3009 != null) {
            this.field3009.method10859(this);
        }
    }
    
    public boolean method2843() {
        return false;
    }
    
    public GameProfile method2844() {
        return this.field3032;
    }
    
    public Either<Class2048, Class315> method2845(final BlockPos class354) {
        final Direction class355 = this.field2391.method6701(class354).method21772((Class7111<Direction>)Class3892.field17564);
        if (!this.field2391.field10067) {
            if (this.method2783() || !this.method1768()) {
                return (Either<Class2048, Class315>)Either.left((Object)Class2048.field11672);
            }
            if (!this.field2391.field10063.method20492()) {
                return (Either<Class2048, Class315>)Either.left((Object)Class2048.field11668);
            }
            if (this.field2391.method6703()) {
                this.method2856(class354, false, true);
                return (Either<Class2048, Class315>)Either.left((Object)Class2048.field11669);
            }
            if (!this.method2846(class354, class355)) {
                return (Either<Class2048, Class315>)Either.left((Object)Class2048.field11670);
            }
            if (this.method2848(class354, class355)) {
                return (Either<Class2048, Class315>)Either.left((Object)Class2048.field11671);
            }
            if (!this.method2889()) {
                final Vec3d class356 = new Vec3d(class354.getX() + 0.5, class354.getY(), class354.getZ() + 0.5);
                if (!this.field2391.method6739((Class<? extends Entity>)Class763.class, new Class6221(class356.method16760() - 8.0, class356.method16761() - 5.0, class356.method16762() - 8.0, class356.method16760() + 8.0, class356.method16761() + 5.0, class356.method16762() + 8.0), class357 -> class357.method4232(this)).isEmpty()) {
                    return (Either<Class2048, Class315>)Either.left((Object)Class2048.field11673);
                }
            }
        }
        this.method2784(class354);
        this.field3021 = 0;
        if (this.field2391 instanceof Class1849) {
            ((Class1849)this.field2391).method6867();
        }
        return (Either<Class2048, Class315>)Either.right((Object)Class315.field1875);
    }
    
    @Override
    public void method2784(final BlockPos class354) {
        this.method2861(Class8276.field33987.method8449(Class8276.field33991));
        this.method2856(class354, false, true);
        super.method2784(class354);
    }
    
    private boolean method2846(final BlockPos class354, final Direction class355) {
        return this.method2847(class354) || this.method2847(class354.method1149(class355.getOpposite()));
    }
    
    private boolean method2847(final BlockPos class354) {
        final Vec3d class355 = new Vec3d(class354.getX() + 0.5, class354.getY(), class354.getZ() + 0.5);
        if (Math.abs(this.method1938() - class355.method16760()) <= 3.0) {
            if (Math.abs(this.method1941() - class355.method16761()) <= 2.0) {
                if (Math.abs(this.method1945() - class355.method16762()) <= 3.0) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private boolean method2848(final BlockPos class354, final Direction class355) {
        final BlockPos method1137 = class354.method1137();
        return !this.method2865(method1137) || !this.method2865(method1137.method1149(class355.getOpposite()));
    }
    
    public void method2849(final boolean b, final boolean b2) {
        super.method2787();
        if (this.field2391 instanceof Class1849) {
            if (b2) {
                ((Class1849)this.field2391).method6867();
            }
        }
        this.field3021 = (b ? 0 : 100);
    }
    
    @Override
    public void method2787() {
        this.method2849(true, true);
    }
    
    public static Optional<Vec3d> method2850(final Class1852 class1852, final BlockPos class1853, final boolean b) {
        final Class3833 method21696 = class1852.method6701(class1853).method21696();
        if (method21696 instanceof Class3900) {
            return Class3900.method11991(Class7499.field29058, class1852, class1853, 0);
        }
        if (b) {
            final boolean method21697 = method21696.method11854();
            final boolean method21698 = class1852.method6701(class1853.method1137()).method21696().method11854();
            return (method21697 && method21698) ? Optional.of(new Vec3d(class1853.getX() + 0.5, class1853.getY() + 0.1, class1853.getZ() + 0.5)) : Optional.empty();
        }
        return Optional.empty();
    }
    
    public boolean method2851() {
        return this.method2783() && this.field3021 >= 100;
    }
    
    public int method2852() {
        return this.field3021;
    }
    
    public void method2853(final Class2250 class2250, final boolean b) {
    }
    
    public BlockPos method2854() {
        return this.field3023;
    }
    
    public boolean method2855() {
        return this.field3024;
    }
    
    public void method2856(final BlockPos field3023, final boolean field3024, final boolean b) {
        if (field3023 == null) {
            this.field3023 = null;
            this.field3024 = false;
        }
        else {
            if (b) {
                if (!field3023.equals(this.field3023)) {
                    this.method1494(new Class2259("block.minecraft.bed.set_spawn", new Object[0]));
                }
            }
            this.field3023 = field3023;
            this.field3024 = field3024;
        }
    }
    
    public void method2857(final Class1932 class1932) {
        this.method2859(Class8276.field33987.method8449(class1932));
    }
    
    public void method2858(final Class1932 class1932, final int n) {
        this.method2860(Class8276.field33987.method8449(class1932), n);
    }
    
    public void method2859(final Class9455<?> class9455) {
        this.method2860(class9455, 1);
    }
    
    public void method2860(final Class9455<?> class9455, final int n) {
    }
    
    public void method2861(final Class9455<?> class9455) {
    }
    
    public int method2862(final Collection<Class3662<?>> collection) {
        return 0;
    }
    
    public void method2863(final Class1932[] array) {
    }
    
    public int method2864(final Collection<Class3662<?>> collection) {
        return 0;
    }
    
    @Override
    public void method2725() {
        super.method2725();
        this.method2857(Class8276.field34007);
        if (!this.method1815()) {
            this.method2876(0.05f);
        }
        else {
            this.method2876(0.2f);
        }
    }
    
    @Override
    public void method2729(final Vec3d class5487) {
        final double method1938 = this.method1938();
        final double method1939 = this.method1941();
        final double method1940 = this.method1945();
        Label_0025: {
            if (this.method1817()) {
                if (!this.method1805()) {
                    final double field22771 = this.method1791().field22771;
                    final double n = (field22771 >= -0.2) ? 0.06 : 0.085;
                    if (field22771 > 0.0) {
                        if (!this.field2967) {
                            if (this.field2391.method6701(new BlockPos(this.method1938(), this.method1941() + 1.0 - 0.1, this.method1945())).method21756().method21781()) {
                                break Label_0025;
                            }
                        }
                    }
                    final Vec3d method1941 = this.method1935();
                    this.method1936(method1941.method16744(0.0, (field22771 - method1941.field22771) * n, 0.0));
                }
            }
        }
        if (this.field3025.field27302 && !this.method1805()) {
            final double field22772 = this.method1935().field22771;
            final float field22773 = this.field2955;
            this.field2955 = this.field3025.method21425() * (this.method1815() ? 2 : 1);
            super.method2729(class5487);
            final Vec3d method1942 = this.method1935();
            this.method1937(method1942.field22770, field22772 * 0.6, method1942.field22772);
            this.field2955 = field22773;
            this.field2414 = 0.0f;
            this.method1830(7, false);
        }
        else {
            super.method2729(class5487);
        }
        this.method2866(this.method1938() - method1938, this.method1941() - method1939, this.method1945() - method1940);
    }
    
    @Override
    public void method1714() {
        if (!this.field3025.field27302) {
            super.method1714();
        }
        else {
            this.method1820(false);
        }
    }
    
    public boolean method2865(final BlockPos class354) {
        return !this.field2391.method6701(class354).method21746(this.field2391, class354);
    }
    
    @Override
    public float method2732() {
        return (float)this.method2710(Class8107.field33408).method23950();
    }
    
    public void method2866(final double n, final double n2, final double n3) {
        if (!this.method1805()) {
            if (!this.method1817()) {
                if (!this.method1721(Class7324.field28319, true)) {
                    if (!this.method1706()) {
                        if (!this.method2688()) {
                            if (!this.field2404) {
                                if (!this.method2773()) {
                                    final int round = Math.round(MathHelper.method35641(n * n + n3 * n3) * 100.0f);
                                    if (round > 25) {
                                        this.method2858(Class8276.field33999, round);
                                    }
                                }
                                else {
                                    this.method2858(Class8276.field34005, Math.round(MathHelper.method35641(n * n + n2 * n2 + n3 * n3) * 100.0f));
                                }
                            }
                            else {
                                final int round2 = Math.round(MathHelper.method35641(n * n + n3 * n3) * 100.0f);
                                if (round2 > 0) {
                                    if (!this.method1815()) {
                                        if (!this.method1814()) {
                                            this.method2858(Class8276.field33993, round2);
                                            this.method2876(0.0f * round2 * 0.01f);
                                        }
                                        else {
                                            this.method2858(Class8276.field33994, round2);
                                            this.method2876(0.0f * round2 * 0.01f);
                                        }
                                    }
                                    else {
                                        this.method2858(Class8276.field33995, round2);
                                        this.method2876(0.1f * round2 * 0.01f);
                                    }
                                }
                            }
                        }
                        else if (n2 > 0.0) {
                            this.method2858(Class8276.field33998, (int)Math.round(n2 * 100.0));
                        }
                    }
                    else {
                        final int round3 = Math.round(MathHelper.method35641(n * n + n3 * n3) * 100.0f);
                        if (round3 > 0) {
                            this.method2858(Class8276.field33996, round3);
                            this.method2876(0.01f * round3 * 0.01f);
                        }
                    }
                }
                else {
                    final int round4 = Math.round(MathHelper.method35641(n * n + n2 * n2 + n3 * n3) * 100.0f);
                    if (round4 > 0) {
                        this.method2858(Class8276.field34000, round4);
                        this.method2876(0.01f * round4 * 0.01f);
                    }
                }
            }
            else {
                final int round5 = Math.round(MathHelper.method35641(n * n + n2 * n2 + n3 * n3) * 100.0f);
                if (round5 > 0) {
                    this.method2858(Class8276.field34006, round5);
                    this.method2876(0.01f * round5 * 0.01f);
                }
            }
        }
    }
    
    private void method2867(final double n, final double n2, final double n3) {
        if (this.method1805()) {
            final int round = Math.round(MathHelper.method35641(n * n + n2 * n2 + n3 * n3) * 100.0f);
            if (round > 0) {
                if (!(this.method1920() instanceof Class428)) {
                    if (!(this.method1920() instanceof Class423)) {
                        if (!(this.method1920() instanceof Class801)) {
                            if (this.method1920() instanceof Class806) {
                                this.method2858(Class8276.field34004, round);
                            }
                        }
                        else {
                            this.method2858(Class8276.field34003, round);
                        }
                    }
                    else {
                        this.method2858(Class8276.field34002, round);
                    }
                }
                else {
                    this.method2858(Class8276.field34001, round);
                }
            }
        }
    }
    
    @Override
    public boolean method1705(final float n, final float n2) {
        if (!this.field3025.field27303) {
            if (n >= 2.0f) {
                this.method2858(Class8276.field33997, (int)Math.round(n * 100.0));
            }
            return super.method1705(n, n2);
        }
        return false;
    }
    
    public boolean method2868() {
        if (!this.field2404) {
            if (!this.method2773()) {
                if (!this.method1706()) {
                    final Class8321 method2718 = this.method2718(Class2215.field13604);
                    if (method2718.method27622() == Class7739.field31584) {
                        if (Class4080.method12285(method2718)) {
                            this.method2869();
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
    
    public void method2869() {
        this.method1830(7, true);
    }
    
    public void method2870() {
        this.method1830(7, true);
        this.method1830(7, false);
    }
    
    @Override
    public void method1717() {
        if (!this.method1639()) {
            super.method1717();
        }
    }
    
    @Override
    public Class7795 method2685(final int n) {
        return (n <= 4) ? Class8520.field35486 : Class8520.field35477;
    }
    
    @Override
    public void method1837(final Class511 class511) {
        this.method2859(Class8276.field33985.method8449(class511.method1642()));
    }
    
    @Override
    public void method1839(final Class7096 class7096, final Vec3d class7097) {
        if (!this.field3025.field27302) {
            super.method1839(class7096, class7097);
        }
    }
    
    public void method2871(final int n) {
        this.method2819(n);
        this.field3028 += n / (float)this.method2875();
        this.field3027 = MathHelper.method35651(this.field3027 + n, 0, Integer.MAX_VALUE);
        while (this.field3028 < 0.0f) {
            final float n2 = this.field3028 * this.method2875();
            if (this.field3026 <= 0) {
                this.method2874(-1);
                this.field3028 = 0.0f;
            }
            else {
                this.method2874(-1);
                this.field3028 = 1.0f + n2 / this.method2875();
            }
        }
        while (this.field3028 >= 1.0f) {
            this.field3028 = (this.field3028 - 1.0f) * this.method2875();
            this.method2874(1);
            this.field3028 /= this.method2875();
        }
    }
    
    public int method2872() {
        return this.field3029;
    }
    
    public void method2873(final Class8321 class8321, final int n) {
        this.field3026 -= n;
        if (this.field3026 < 0) {
            this.field3026 = 0;
            this.field3028 = 0.0f;
            this.field3027 = 0;
        }
        this.field3029 = this.field2423.nextInt();
    }
    
    public void method2874(final int n) {
        this.field3026 += n;
        if (this.field3026 < 0) {
            this.field3026 = 0;
            this.field3028 = 0.0f;
            this.field3027 = 0;
        }
        if (n > 0) {
            if (this.field3026 % 5 == 0) {
                if (this.field3031 < this.field2424 - 100.0f) {
                    this.field2391.method6706(null, this.method1938(), this.method1941(), this.method1945(), Class8520.field35485, this.method1922(), ((this.field3026 <= 30) ? (this.field3026 / 30.0f) : 1.0f) * 0.75f, 1.0f);
                    this.field3031 = this.field2424;
                }
            }
        }
    }
    
    public int method2875() {
        if (this.field3026 < 30) {
            return (this.field3026 < 15) ? (7 + this.field3026 * 2) : (37 + (this.field3026 - 15) * 5);
        }
        return 112 + (this.field3026 - 30) * 9;
    }
    
    public void method2876(final float n) {
        if (!this.field3025.field27301) {
            if (!this.field2391.field10067) {
                this.field3010.method33493(n);
            }
        }
    }
    
    public Class9173 method2877() {
        return this.field3010;
    }
    
    public boolean method2878(final boolean b) {
        if (!this.field3025.field27301) {
            if (!b) {
                if (!this.field3010.method33492()) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public boolean method2879() {
        return this.method2664() > 0.0f && this.method2664() < this.method2701();
    }
    
    public boolean method2880() {
        return this.field3025.field27305;
    }
    
    public boolean method2881(final BlockPos class354, final Direction class355, final Class8321 class356) {
        return this.field3025.field27305 || class356.method27687(this.field2391.method6793(), new Class7990(this.field2391, class354.method1149(class355.getOpposite()), false));
    }
    
    @Override
    public int method2631(final Class512 class512) {
        if (!this.field2391.method6765().method31216(Class8878.field37317) && !this.method1639()) {
            final int n = this.field3026 * 7;
            return (n <= 100) ? n : 100;
        }
        return 0;
    }
    
    @Override
    public boolean method2632() {
        return true;
    }
    
    @Override
    public boolean method1879() {
        return true;
    }
    
    @Override
    public boolean method1700() {
        return !this.field3025.field27302 && (!this.field2404 || !this.method1812());
    }
    
    public void method2882() {
    }
    
    public void method2883(final Class101 class101) {
    }
    
    @Override
    public Class2250 method1841() {
        return new Class2260(this.field3032.getName());
    }
    
    public Class485 method2884() {
        return this.field3007;
    }
    
    @Override
    public Class8321 method2718(final Class2215 class2215) {
        if (class2215 == Class2215.field13600) {
            return this.field3006.method2345();
        }
        if (class2215 != Class2215.field13601) {
            return (class2215.method8401() != Class295.field1682) ? Class8321.field34174 : this.field3006.field2740.get(class2215.method8402());
        }
        return this.field3006.field2741.get(0);
    }
    
    @Override
    public void method1803(final Class2215 class2215, final Class8321 class2216) {
        if (class2215 != Class2215.field13600) {
            if (class2215 != Class2215.field13601) {
                if (class2215.method8401() == Class295.field1682) {
                    this.method2642(class2216);
                    this.field3006.field2740.set(class2215.method8402(), class2216);
                }
            }
            else {
                this.method2642(class2216);
                this.field3006.field2741.set(0, class2216);
            }
        }
        else {
            this.method2642(class2216);
            this.field3006.field2739.set(this.field3006.field2743, class2216);
        }
    }
    
    public boolean method2885(final Class8321 class8321) {
        this.method2642(class8321);
        return this.field3006.method2362(class8321);
    }
    
    @Override
    public Iterable<Class8321> method1800() {
        return Lists.newArrayList((Object[])new Class8321[] { this.method2713(), this.method2714() });
    }
    
    @Override
    public Iterable<Class8321> method1801() {
        return this.field3006.field2740;
    }
    
    public boolean method2886(final Class51 class51) {
        if (!this.method1805()) {
            if (this.field2404) {
                if (!this.method1706()) {
                    if (this.method2899().method331()) {
                        this.method2900(class51);
                        this.field3005 = this.field2391.method6754();
                        return true;
                    }
                    if (!this.method2901().method331()) {
                        return false;
                    }
                    this.method2902(class51);
                    this.field3005 = this.field2391.method6754();
                    return true;
                }
            }
        }
        return false;
    }
    
    public void method2887() {
        if (this.field3005 + 20L < this.field2391.method6754()) {
            this.method2888(this.method2899());
            this.method2900(new Class51());
            this.method2888(this.method2901());
            this.method2902(new Class51());
        }
    }
    
    private void method2888(final Class51 class51) {
        if (!this.field2391.field10067) {
            if (!class51.method331()) {
                Class7499.method23373(class51, this.field2391).ifPresent(class52 -> {
                    if (!(!(class52 instanceof Class794))) {
                        ((Class794)class52).method4486(this.field2457);
                    }
                    class52.method1656(this.method1938(), this.method1941() + 0.699999988079071, this.method1945());
                    ((Class1849)this.field2391).method6887(class52);
                });
            }
        }
    }
    
    @Override
    public abstract boolean method1639();
    
    @Override
    public boolean method1817() {
        if (!this.field3025.field27302) {
            if (!this.method1639()) {
                if (super.method1817()) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public abstract boolean method2889();
    
    @Override
    public boolean method1868() {
        return !this.field3025.field27302;
    }
    
    public Class6516 method2890() {
        return this.field2391.method6782();
    }
    
    @Override
    public Class2250 method1871() {
        return this.method2892(Class6749.method20549(this.method1825(), this.method1841()));
    }
    
    public Class2250 method2891() {
        return new Class2260("").method8458(this.method1841()).method8457(" (").method8457(this.field3032.getId().toString()).method8457(")");
    }
    
    private Class2250 method2892(final Class2250 class2250) {
        return class2250.method8467(class2251 -> {
            this.method2844().getName();
            new Class9485(Class2075.field11974, "/tell " + str + " ");
            final Class9485 class2252;
            class2251.method30419(class2252).method30420(this.method1884()).method30421(str);
        });
    }
    
    @Override
    public String method1867() {
        return this.method2844().getName();
    }
    
    @Override
    public float method2789(final Class290 class290, final Class8295 class291) {
        switch (Class9396.field40304[class290.ordinal()]) {
            case 1:
            case 2:
            case 3: {
                return 0.4f;
            }
            case 4: {
                return 1.27f;
            }
            default: {
                return 1.62f;
            }
        }
    }
    
    @Override
    public void method2751(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        this.method1650().method33569(Class512.field2999, f);
    }
    
    @Override
    public float method2750() {
        return this.method1650().method33568(Class512.field2999);
    }
    
    public static UUID method2893(final GameProfile gameProfile) {
        UUID uuid = gameProfile.getId();
        if (uuid == null) {
            uuid = method2894(gameProfile.getName());
        }
        return uuid;
    }
    
    public static UUID method2894(final String str) {
        return UUID.nameUUIDFromBytes(("OfflinePlayer:" + str).getBytes(StandardCharsets.UTF_8));
    }
    
    public boolean method2895(final Class189 class189) {
        return (this.method1650().method33568(Class512.field3001) & class189.method828()) == class189.method828();
    }
    
    @Override
    public boolean method1893(final int n, final Class8321 class8321) {
        if (n >= 0 && n < this.field3006.field2739.size()) {
            this.field3006.method2160(n, class8321);
            return true;
        }
        Class2215 class8322;
        if (n != 100 + Class2215.field13605.method8402()) {
            if (n != 100 + Class2215.field13604.method8402()) {
                if (n != 100 + Class2215.field13603.method8402()) {
                    if (n != 100 + Class2215.field13602.method8402()) {
                        class8322 = null;
                    }
                    else {
                        class8322 = Class2215.field13602;
                    }
                }
                else {
                    class8322 = Class2215.field13603;
                }
            }
            else {
                class8322 = Class2215.field13604;
            }
        }
        else {
            class8322 = Class2215.field13605;
        }
        if (n == 98) {
            this.method1803(Class2215.field13600, class8321);
            return true;
        }
        if (n == 99) {
            this.method1803(Class2215.field13601, class8321);
            return true;
        }
        if (class8322 != null) {
            if (!class8321.method27620()) {
                if (!(class8321.method27622() instanceof Class4055) && !(class8321.method27622() instanceof Class4080)) {
                    if (class8322 != Class2215.field13605) {
                        return false;
                    }
                }
                else if (Class759.method4185(class8321) != class8322) {
                    return false;
                }
            }
            this.field3006.method2160(class8322.method8402() + this.field3006.field2739.size(), class8321);
            return true;
        }
        final int n2 = n - 200;
        if (n2 >= 0 && n2 < this.field3007.method2239()) {
            this.field3007.method2160(n2, class8321);
            return true;
        }
        return false;
    }
    
    public boolean method2896() {
        return this.field3033;
    }
    
    public void method2897(final boolean field3033) {
        this.field3033 = field3033;
    }
    
    @Override
    public Class2226 method2755() {
        return (this.field2432.method33568(Class512.field3002) != 0) ? Class2226.field13698 : Class2226.field13697;
    }
    
    public void method2898(final Class2226 class2226) {
        this.field2432.method33569(Class512.field3002, (byte)((class2226 != Class2226.field13697) ? 1 : 0));
    }
    
    public Class51 method2899() {
        return this.field2432.method33568(Class512.field3003);
    }
    
    public void method2900(final Class51 class51) {
        this.field2432.method33569(Class512.field3003, class51);
    }
    
    public Class51 method2901() {
        return this.field2432.method33568(Class512.field3004);
    }
    
    public void method2902(final Class51 class51) {
        this.field2432.method33569(Class512.field3004, class51);
    }
    
    public float method2903() {
        return (float)(1.0 / this.method2710(Class8107.field33412).method23950() * 20.0);
    }
    
    public float method2904(final float n) {
        return MathHelper.method35653((this.field2944 + n) / this.method2903(), 0.0f, 1.0f);
    }
    
    public void method2905() {
        this.field2944 = 0;
    }
    
    public Class7948 method2906() {
        return this.field3035;
    }
    
    @Override
    public float method1674() {
        return (!this.field3025.field27302 && !this.method2773()) ? super.method1674() : 1.0f;
    }
    
    public float method2907() {
        return (float)this.method2710(Class8107.field33415).method23950();
    }
    
    public boolean method2908() {
        return this.field3025.field27304 && this.method1925() >= 2;
    }
    
    @Override
    public boolean method2779(final Class8321 class8321) {
        return this.method2718(Class759.method4185(class8321)).method27620();
    }
    
    @Override
    public Class8295 method1933(final Class290 key) {
        return Class512.field2998.getOrDefault(key, Class512.field2997);
    }
    
    @Override
    public Class8321 method2790(final Class8321 class8321) {
        if (!(class8321.method27622() instanceof Class4085)) {
            return Class8321.field34174;
        }
        final Class8321 method12291 = Class4085.method12291(this, ((Class4085)class8321.method27622()).method12289());
        if (method12291.method27620()) {
            final Predicate<Class8321> method12292 = ((Class4085)class8321.method27622()).method12290();
            for (int i = 0; i < this.field3006.method2239(); ++i) {
                final Class8321 method12293 = this.field3006.method2157(i);
                if (method12292.test(method12293)) {
                    return method12293;
                }
            }
            return this.field3025.field27304 ? new Class8321(Class7739.field31280) : Class8321.field34174;
        }
        return method12291;
    }
    
    @Override
    public Class8321 method2791(final Class1847 class1847, final Class8321 class1848) {
        this.method2877().method33487(class1848.method27622(), class1848);
        this.method2859(Class8276.field33981.method8449(class1848.method27622()));
        class1847.method6706(null, this.method1938(), this.method1941(), this.method1945(), Class8520.field35479, Class286.field1585, 0.5f, class1847.field10062.nextFloat() * 0.1f + 0.9f);
        if (this instanceof Class513) {
            Class7770.field31800.method13819((Class513)this, class1848);
        }
        return super.method2791(class1847, class1848);
    }
    
    static {
        field2997 = Class8295.method27563(0.6f, 1.8f);
        field2998 = (Map)ImmutableMap.builder().put((Object)Class290.field1663, (Object)Class512.field2997).put((Object)Class290.field1665, (Object)Class512.field2927).put((Object)Class290.field1664, (Object)Class8295.method27563(0.6f, 0.6f)).put((Object)Class290.field1666, (Object)Class8295.method27563(0.6f, 0.6f)).put((Object)Class290.field1667, (Object)Class8295.method27563(0.6f, 0.6f)).put((Object)Class290.field1668, (Object)Class8295.method27563(0.6f, 1.5f)).put((Object)Class290.field1669, (Object)Class8295.method27564(0.2f, 0.2f)).build();
        field2999 = Class9184.method33564(Class512.class, Class7709.field30655);
        field3000 = Class9184.method33564(Class512.class, Class7709.field30654);
        field3001 = Class9184.method33564(Class512.class, Class7709.field30653);
        field3002 = Class9184.method33564(Class512.class, Class7709.field30653);
        field3003 = Class9184.method33564(Class512.class, Class7709.field30668);
        field3004 = Class9184.method33564(Class512.class, Class7709.field30668);
    }
}
