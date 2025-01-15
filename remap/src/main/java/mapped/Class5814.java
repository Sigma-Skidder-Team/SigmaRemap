// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.Vec3d;
import org.apache.logging.log4j.LogManager;
import org.apache.commons.lang3.StringUtils;

import java.util.Set;
import java.util.Collections;
import com.mojang.brigadier.StringReader;
import com.google.common.primitives.Floats;
import com.google.common.primitives.Doubles;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import it.unimi.dsi.fastutil.ints.Int2ShortOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ShortMap;
import org.apache.logging.log4j.Logger;

public class Class5814 implements Class5813
{
    private static final Logger field23854;
    public final Class3641 field23855;
    private final Class394 field23856;
    public Class513 field23857;
    private int field23858;
    private long field23859;
    private boolean field23860;
    private long field23861;
    private int field23862;
    private int field23863;
    private final Int2ShortMap field23864;
    private double field23865;
    private double field23866;
    private double field23867;
    private double field23868;
    private double field23869;
    private double field23870;
    private Entity field23871;
    private double field23872;
    private double field23873;
    private double field23874;
    private double field23875;
    private double field23876;
    private double field23877;
    private Vec3d field23878;
    private int field23879;
    private int field23880;
    private boolean field23881;
    private int field23882;
    private boolean field23883;
    private int field23884;
    private int field23885;
    private int field23886;
    
    public Class5814(final Class394 field23856, final Class3641 field23857, final Class513 field23858) {
        this.field23864 = (Int2ShortMap)new Int2ShortOpenHashMap();
        this.field23856 = field23856;
        (this.field23855 = field23857).method11173(this);
        this.field23857 = field23858;
        field23858.field3039 = this;
    }
    
    public void method17460() {
        this.method17461();
        this.field23857.field2392 = this.field23857.getPosX();
        this.field23857.field2393 = this.field23857.getPosY();
        this.field23857.field2394 = this.field23857.getPosZ();
        this.field23857.method2920();
        this.field23857.method1728(this.field23865, this.field23866, this.field23867, this.field23857.field2399, this.field23857.field2400);
        ++this.field23858;
        this.field23886 = this.field23885;
        if (!this.field23881) {
            this.field23881 = false;
            this.field23882 = 0;
        }
        else if (++this.field23882 > 80) {
            Class5814.field23854.warn("{} was kicked for floating too long!", (Object)this.field23857.method1841().getString());
            this.method17463(new Class2259("multiplayer.disconnect.flying", new Object[0]));
            return;
        }
        this.field23871 = this.field23857.method1915();
        if (this.field23871 != this.field23857 && this.field23871.method1907() == this.field23857) {
            this.field23872 = this.field23871.getPosX();
            this.field23873 = this.field23871.getPosY();
            this.field23874 = this.field23871.getPosZ();
            this.field23875 = this.field23871.getPosX();
            this.field23876 = this.field23871.getPosY();
            this.field23877 = this.field23871.getPosZ();
            if (this.field23883 && this.field23857.method1915().method1907() == this.field23857) {
                if (++this.field23884 > 80) {
                    Class5814.field23854.warn("{} was kicked for floating a vehicle too long!", (Object)this.field23857.method1841().getString());
                    this.method17463(new Class2259("multiplayer.disconnect.flying", new Object[0]));
                    return;
                }
            }
            else {
                this.field23883 = false;
                this.field23884 = 0;
            }
        }
        else {
            this.field23871 = null;
            this.field23883 = false;
            this.field23884 = 0;
        }
        this.field23856.method1590().method15297("keepAlive");
        final long method27837 = Class8349.method27837();
        if (method27837 - this.field23859 >= 15000L) {
            if (!this.field23860) {
                this.field23860 = true;
                this.field23859 = method27837;
                this.field23861 = method27837;
                this.method17469(new Class4396(this.field23861));
            }
            else {
                this.method17463(new Class2259("disconnect.timeout", new Object[0]));
            }
        }
        this.field23856.method1590().method15299();
        if (this.field23862 > 0) {
            --this.field23862;
        }
        if (this.field23863 > 0) {
            --this.field23863;
        }
        if (this.field23857.method2953() > 0L) {
            if (this.field23856.method1552() > 0) {
                if (Class8349.method27837() - this.field23857.method2953() > this.field23856.method1552() * 1000 * 60) {
                    this.method17463(new Class2259("multiplayer.disconnect.idling", new Object[0]));
                }
            }
        }
    }
    
    public void method17461() {
        this.field23865 = this.field23857.getPosX();
        this.field23866 = this.field23857.getPosY();
        this.field23867 = this.field23857.getPosZ();
        this.field23868 = this.field23857.getPosX();
        this.field23869 = this.field23857.getPosY();
        this.field23870 = this.field23857.getPosZ();
    }
    
    @Override
    public Class3641 method17369() {
        return this.field23855;
    }
    
    private boolean method17462() {
        return this.field23856.method1592(this.field23857.method2844());
    }
    
    public void method17463(final Class2250 class2250) {
        this.field23855.method11175(new Class4262(class2250), (GenericFutureListener<? extends Future<? super Void>>)(future -> this.field23855.method11181(class2250)));
        this.field23855.method11191();
        this.field23856.method5380(this.field23855::method11193);
    }
    
    @Override
    public void method17433(final Class4254 class4254) {
        Class8663.method29631((Class4252<Class5814>)class4254, this, this.field23857.method2940());
        this.field23857.method2934(class4254.method12767(), class4254.method12768(), class4254.method12769(), class4254.method12770());
    }
    
    private static boolean method17464(final Class4353 class4353) {
        if (Doubles.isFinite(class4353.method13078(0.0))) {
            if (Doubles.isFinite(class4353.method13079(0.0))) {
                if (Doubles.isFinite(class4353.method13080(0.0))) {
                    if (Floats.isFinite(class4353.method13082(0.0f))) {
                        if (Floats.isFinite(class4353.method13081(0.0f))) {
                            if (Math.abs(class4353.method13078(0.0)) <= 3.0E7) {
                                if (Math.abs(class4353.method13079(0.0)) <= 3.0E7) {
                                    if (Math.abs(class4353.method13080(0.0)) <= 3.0E7) {
                                        return false;
                                    }
                                }
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return true;
    }
    
    private static boolean method17465(final Class4251 class4251) {
        if (Doubles.isFinite(class4251.method12757())) {
            if (Doubles.isFinite(class4251.method12758())) {
                if (Doubles.isFinite(class4251.method12759())) {
                    if (Floats.isFinite(class4251.method12761())) {
                        if (Floats.isFinite(class4251.method12760())) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
    
    @Override
    public void method17442(final Class4251 class4251) {
        Class8663.method29631((Class4252<Class5814>)class4251, this, this.field23857.method2940());
        if (!method17465(class4251)) {
            final Entity method1915 = this.field23857.method1915();
            if (method1915 != this.field23857) {
                if (method1915.method1907() == this.field23857) {
                    if (method1915 == this.field23871) {
                        final Class1849 method1916 = this.field23857.method2940();
                        final double method1917 = method1915.getPosX();
                        final double method1918 = method1915.getPosY();
                        final double method1919 = method1915.getPosZ();
                        final double method1920 = class4251.method12757();
                        final double method1921 = class4251.method12758();
                        final double method1922 = class4251.method12759();
                        final float method1923 = class4251.method12760();
                        final float method1924 = class4251.method12761();
                        final double d = method1920 - this.field23872;
                        final double d2 = method1921 - this.field23873;
                        final double d3 = method1922 - this.field23874;
                        if (d * d + d2 * d2 + d3 * d3 - method1915.method1935().lengthSquared() > 100.0 && !this.method17462()) {
                            Class5814.field23854.warn("{} (vehicle of {}) moved too quickly! {},{},{}", (Object)method1915.method1841().getString(), (Object)this.field23857.method1841().getString(), (Object)d, (Object)d2, (Object)d3);
                            this.field23855.method11174(new Class4263(method1915));
                            return;
                        }
                        final boolean method1925 = method1916.method6978(method1915, method1915.method1886().method18511(0.0625));
                        method1915.method1671(Class2160.field12827, new Vec3d(method1920 - this.field23875, method1921 - this.field23876 - 1.0E-6, method1922 - this.field23877));
                        final double n = method1920 - method1915.getPosX();
                        double n2 = method1921 - method1915.getPosY();
                        if (n2 > -0.5 || n2 < 0.5) {
                            n2 = 0.0;
                        }
                        final double n3 = method1922 - method1915.getPosZ();
                        final double n4 = n * n + n2 * n2 + n3 * n3;
                        boolean b = false;
                        if (n4 > 0.0625) {
                            b = true;
                            Class5814.field23854.warn("{} moved wrongly!", (Object)method1915.method1841().getString());
                        }
                        method1915.method1728(method1920, method1921, method1922, method1923, method1924);
                        final boolean method1926 = method1916.method6978(method1915, method1915.method1886().method18511(0.0625));
                        if (method1925 && (b || !method1926)) {
                            method1915.method1728(method1917, method1918, method1919, method1923, method1924);
                            this.field23855.method11174(new Class4263(method1915));
                            return;
                        }
                        this.field23857.method2940().method6904().method7443(this.field23857);
                        this.field23857.method2866(this.field23857.getPosX() - method1917, this.field23857.getPosY() - method1918, this.field23857.getPosZ() - method1919);
                        boolean field23883 = false;
                        Label_0691: {
                            if (n2 >= -0.03125) {
                                if (!this.field23856.method1529()) {
                                    if (!method1916.method6718(method1915.method1886().method18496(0.0625).method18494(0.0, -0.55, 0.0))) {
                                        field23883 = true;
                                        break Label_0691;
                                    }
                                }
                            }
                            field23883 = false;
                        }
                        this.field23883 = field23883;
                        this.field23875 = method1915.getPosX();
                        this.field23876 = method1915.getPosY();
                        this.field23877 = method1915.getPosZ();
                    }
                }
            }
        }
        else {
            this.method17463(new Class2259("multiplayer.disconnect.invalid_vehicle_movement", new Object[0]));
        }
    }
    
    @Override
    public void method17443(final Class4348 class4348) {
        Class8663.method29631((Class4252<Class5814>)class4348, this, this.field23857.method2940());
        if (class4348.method13058() == this.field23879) {
            this.field23857.method1728(this.field23878.x, this.field23878.y, this.field23878.z, this.field23857.field2399, this.field23857.field2400);
            this.field23868 = this.field23878.x;
            this.field23869 = this.field23878.y;
            this.field23870 = this.field23878.z;
            if (this.field23857.method2955()) {
                this.field23857.method2956();
            }
            this.field23878 = null;
        }
    }
    
    @Override
    public void method17444(final Class4397 class4397) {
        Class8663.method29631((Class4252<Class5814>)class4397, this, this.field23857.method2940());
        if (class4397.method13224() != Class2125.field12397) {
            if (class4397.method13224() == Class2125.field12398) {
                this.field23857.method2948().method19704(class4397.method13226());
                this.field23857.method2948().method19707(class4397.method13227());
                this.field23857.method2948().method19709(class4397.method13228());
                this.field23857.method2948().method19711(class4397.method13229());
                this.field23857.method2948().method19713(class4397.method13230());
                this.field23857.method2948().method19715(class4397.method13231());
                this.field23857.method2948().method19717(class4397.method13232());
                this.field23857.method2948().method19719(class4397.method13233());
            }
        }
        else {
            this.field23856.method1577().method6382(class4397.method13225()).ifPresent(this.field23857.method2948()::method19700);
        }
    }
    
    @Override
    public void method17445(final Class4334 class4334) {
        Class8663.method29631((Class4252<Class5814>)class4334, this, this.field23857.method2940());
        if (class4334.method13015() == Class313.field1843) {
            final Class8863 method6398 = this.field23856.method1566().method6398(class4334.method13016());
            if (method6398 != null) {
                this.field23857.method2957().method21469(method6398);
            }
        }
    }
    
    @Override
    public void method17446(final Class4265 class4265) {
        Class8663.method29631((Class4252<Class5814>)class4265, this, this.field23857.method2940());
        final StringReader stringReader = new StringReader(class4265.method12802());
        if (stringReader.canRead()) {
            if (stringReader.peek() == '/') {
                stringReader.skip();
            }
        }
        this.field23856.method1573().method25004().getCompletionSuggestions(this.field23856.method1573().method25004().parse(stringReader, (Object)this.field23857.method1924())).thenAccept(suggestions -> this.field23855.method11174(new Class4337(class4266.method12801(), suggestions)));
    }
    
    @Override
    public void method17447(final Class4266 class4266) {
        Class8663.method29631((Class4252<Class5814>)class4266, this, this.field23857.method2940());
        if (!this.field23856.method1531()) {
            this.field23857.method1494(new Class2259("advMode.notEnabled", new Object[0]));
        }
        else if (!this.field23857.method2908()) {
            this.field23857.method1494(new Class2259("advMode.notAllowed", new Object[0]));
        }
        else {
            Class865 method2539 = null;
            Class500 class4267 = null;
            final BlockPos method2540 = class4266.method12803();
            final Class436 method2541 = this.field23857.field2391.method6727(method2540);
            if (method2541 instanceof Class500) {
                class4267 = (Class500)method2541;
                method2539 = class4267.method2539();
            }
            final String method2542 = class4266.method12804();
            final boolean method2543 = class4266.method12805();
            if (method2539 != null) {
                final Class2182 method2544 = class4267.method2550();
                final Direction class4268 = this.field23857.field2391.method6701(method2540).method21772((Class7111<Direction>)Class3953.field17853);
                switch (Class8365.field34305[class4266.method12808().ordinal()]) {
                    case 1: {
                        this.field23857.field2391.method6688(method2540, (Class7096)((Class7097<Object, Object>)((Class7097<Object, Object>)Class7521.field29640.method11878()).method21773((Class7111<Comparable>)Class3953.field17853, class4268)).method21773((Class7111<Comparable>)Class3953.field17854, class4266.method12806()), 2);
                        break;
                    }
                    case 2: {
                        this.field23857.field2391.method6688(method2540, (Class7096)((Class7097<Object, Object>)((Class7097<Object, Object>)Class7521.field29639.method11878()).method21773((Class7111<Comparable>)Class3953.field17853, class4268)).method21773((Class7111<Comparable>)Class3953.field17854, class4266.method12806()), 2);
                        break;
                    }
                    default: {
                        this.field23857.field2391.method6688(method2540, (Class7096)((Class7097<Object, Object>)((Class7097<Object, Object>)Class7521.field29416.method11878()).method21773((Class7111<Comparable>)Class3953.field17853, class4268)).method21773((Class7111<Comparable>)Class3953.field17854, class4266.method12806()), 2);
                        break;
                    }
                }
                method2541.method2199();
                this.field23857.field2391.method6729(method2540, method2541);
                method2539.method5211(method2542);
                method2539.method5219(method2543);
                if (!method2543) {
                    method2539.method5218(null);
                }
                class4267.method2543(class4266.method12807());
                if (method2544 != class4266.method12808()) {
                    class4267.method2544();
                }
                method2539.method5217();
                if (!Class8272.method27500(method2542)) {
                    this.field23857.method1494(new Class2259("advMode.setCommand.success", new Object[] { method2542 }));
                }
            }
        }
    }
    
    @Override
    public void method17448(final Class4401 class4401) {
        Class8663.method29631((Class4252<Class5814>)class4401, this, this.field23857.method2940());
        if (this.field23856.method1531()) {
            if (this.field23857.method2908()) {
                final Class865 method13244 = class4401.method13244(this.field23857.field2391);
                if (method13244 != null) {
                    method13244.method5211(class4401.method13245());
                    method13244.method5219(class4401.method13246());
                    if (!class4401.method13246()) {
                        method13244.method5218(null);
                    }
                    method13244.method5217();
                    this.field23857.method1494(new Class2259("advMode.setCommand.success", new Object[] { class4401.method13245() }));
                }
            }
            else {
                this.field23857.method1494(new Class2259("advMode.notAllowed", new Object[0]));
            }
        }
        else {
            this.field23857.method1494(new Class2259("advMode.notEnabled", new Object[0]));
        }
    }
    
    @Override
    public void method17449(final Class4267 class4267) {
        Class8663.method29631((Class4252<Class5814>)class4267, this, this.field23857.method2940());
        this.field23857.field3006.method2351(class4267.method12809());
        this.field23857.field3039.method17469(new Class4272(-2, this.field23857.field3006.field2743, this.field23857.field3006.method2157(this.field23857.field3006.field2743)));
        this.field23857.field3039.method17469(new Class4272(-2, class4267.method12809(), this.field23857.field3006.method2157(class4267.method12809())));
        this.field23857.field3039.method17469(new Class4388(this.field23857.field3006.field2743));
    }
    
    @Override
    public void method17450(final Class4362 class4362) {
        Class8663.method29631((Class4252<Class5814>)class4362, this, this.field23857.method2940());
        if (this.field23857.field3009 instanceof Class3441) {
            final Class3441 class4363 = (Class3441)this.field23857.field3009;
            final String method35577 = Class9528.method35577(class4362.method13122());
            if (method35577.length() <= 35) {
                class4363.method10997(method35577);
            }
        }
    }
    
    @Override
    public void method17451(final Class4368 class4368) {
        Class8663.method29631((Class4252<Class5814>)class4368, this, this.field23857.method2940());
        if (this.field23857.field3009 instanceof Class3436) {
            ((Class3436)this.field23857.field3009).method10962(class4368.method13134(), class4368.method13135());
        }
    }
    
    @Override
    public void method17452(final Class4360 class4360) {
        Class8663.method29631((Class4252<Class5814>)class4360, this, this.field23857.method2940());
        if (this.field23857.method2908()) {
            final BlockPos method13101 = class4360.method13101();
            final Class7096 method13102 = this.field23857.field2391.method6701(method13101);
            final Class436 method13103 = this.field23857.field2391.method6727(method13101);
            if (method13103 instanceof Class501) {
                final Class501 class4361 = (Class501)method13103;
                class4361.method2571(class4360.method13103());
                class4361.method2557(class4360.method13104());
                class4361.method2561(class4360.method13105());
                class4361.method2563(class4360.method13106());
                class4361.method2565(class4360.method13107());
                class4361.method2567(class4360.method13108());
                class4361.method2569(class4360.method13109());
                class4361.method2574(class4360.method13110());
                class4361.method2594(class4360.method13111());
                class4361.method2596(class4360.method13112());
                class4361.method2576(class4360.method13113());
                class4361.method2578(class4360.method13114());
                if (!class4361.method2556()) {
                    this.field23857.method2853(new Class2259("structure_block.invalid_structure_name", new Object[] { class4360.method13104() }), false);
                }
                else {
                    final String method13104 = class4361.method2554();
                    if (class4360.method13102() != Class2146.field12635) {
                        if (class4360.method13102() != Class2146.field12636) {
                            if (class4360.method13102() == Class2146.field12637) {
                                if (!class4361.method2579()) {
                                    this.field23857.method2853(new Class2259("structure_block.size_failure", new Object[0]), false);
                                }
                                else {
                                    this.field23857.method2853(new Class2259("structure_block.size_success", new Object[] { method13104 }), false);
                                }
                            }
                        }
                        else if (class4361.method2590()) {
                            if (!class4361.method2585()) {
                                this.field23857.method2853(new Class2259("structure_block.load_prepare", new Object[] { method13104 }), false);
                            }
                            else {
                                this.field23857.method2853(new Class2259("structure_block.load_success", new Object[] { method13104 }), false);
                            }
                        }
                        else {
                            this.field23857.method2853(new Class2259("structure_block.load_not_found", new Object[] { method13104 }), false);
                        }
                    }
                    else if (!class4361.method2583()) {
                        this.field23857.method2853(new Class2259("structure_block.save_failure", new Object[] { method13104 }), false);
                    }
                    else {
                        this.field23857.method2853(new Class2259("structure_block.save_success", new Object[] { method13104 }), false);
                    }
                }
                class4361.method2161();
                this.field23857.field2391.method6693(method13101, method13102, method13102, 3);
            }
        }
    }
    
    @Override
    public void method17457(final Class4270 class4270) {
        Class8663.method29631((Class4252<Class5814>)class4270, this, this.field23857.method2940());
        if (this.field23857.method2908()) {
            final BlockPos method12813 = class4270.method12813();
            final Class7096 method12814 = this.field23857.field2391.method6701(method12813);
            final Class436 method12815 = this.field23857.field2391.method6727(method12813);
            if (method12815 instanceof Class498) {
                final Class498 class4271 = (Class498)method12815;
                class4271.method2534(class4270.method12815());
                class4271.method2535(class4270.method12814());
                class4271.method2536(class4270.method12816());
                class4271.method2161();
                this.field23857.field2391.method6693(method12813, method12814, method12814, 3);
            }
        }
    }
    
    @Override
    public void method17453(final Class4324 class4324) {
        Class8663.method29631((Class4252<Class5814>)class4324, this, this.field23857.method2940());
        final int method12988 = class4324.method12988();
        final Class3418 field3009 = this.field23857.field3009;
        if (field3009 instanceof Class3423) {
            final Class3423 class4325 = (Class3423)field3009;
            class4325.method10918(method12988);
            class4325.method10927(method12988);
        }
    }
    
    @Override
    public void method17454(final Class4314 class4314) {
        Class8663.method29631((Class4252<Class5814>)class4314, this, this.field23857.method2940());
        final Class8321 method12967 = class4314.method12967();
        if (!method12967.method27620()) {
            if (Class4049.method12247(method12967.method27657())) {
                final Class8321 method12968 = this.field23857.method2715(class4314.method12969());
                if (method12967.method27622() == Class7739.field31512) {
                    if (method12968.method27622() == Class7739.field31512) {
                        if (!class4314.method12968()) {
                            method12968.method27676("pages", method12967.method27657().method328("pages", 8));
                        }
                        else {
                            final Class8321 class4315 = new Class8321(Class7739.field31513);
                            final Class51 method12969 = method12968.method27657();
                            if (method12969 != null) {
                                class4315.method27663(method12969.method333());
                            }
                            class4315.method27676("author", Class50.method290(this.field23857.method1841().getString()));
                            class4315.method27676("title", Class50.method290(method12967.method27657().method323("title")));
                            final Class52 method12970 = method12967.method27657().method328("pages", 8);
                            for (int i = 0; i < method12970.size(); ++i) {
                                method12970.set(i, Class50.method290(Class5953.method17869(new Class2260(method12970.method353(i)))));
                            }
                            class4315.method27676("pages", method12970);
                            this.field23857.method2716(class4314.method12969(), class4315);
                        }
                    }
                }
            }
        }
    }
    
    @Override
    public void method17455(final Class4261 class4261) {
        Class8663.method29631((Class4252<Class5814>)class4261, this, this.field23857.method2940());
        if (this.field23857.method1926(2)) {
            final Entity method6741 = this.field23857.method2940().method6741(class4261.method12792());
            if (method6741 != null) {
                this.field23857.field3039.method17469(new Class4296(class4261.method12791(), method6741.method1756(new Class51())));
            }
        }
    }
    
    @Override
    public void method17456(final Class4275 class4275) {
        Class8663.method29631((Class4252<Class5814>)class4275, this, this.field23857.method2940());
        if (this.field23857.method1926(2)) {
            final Class436 method6727 = this.field23857.method2940().method6727(class4275.method12828());
            this.field23857.field3039.method17469(new Class4296(class4275.method12827(), (method6727 == null) ? null : method6727.method2180(new Class51())));
        }
    }
    
    @Override
    public void method17429(final Class4353 class4353) {
        Class8663.method29631((Class4252<Class5814>)class4353, this, this.field23857.method2940());
        if (!method17464(class4353)) {
            final Class1849 method1481 = this.field23856.method1481(this.field23857.field2452);
            if (!this.field23857.field3071) {
                if (this.field23858 == 0) {
                    this.method17461();
                }
                if (this.field23878 == null) {
                    this.field23880 = this.field23858;
                    if (!this.field23857.method1805()) {
                        final double method1482 = this.field23857.getPosX();
                        final double method1483 = this.field23857.getPosY();
                        final double method1484 = this.field23857.getPosZ();
                        final double method1485 = this.field23857.getPosY();
                        final double method1486 = class4353.method13078(this.field23857.getPosX());
                        final double method1487 = class4353.method13079(this.field23857.getPosY());
                        final double method1488 = class4353.method13080(this.field23857.getPosZ());
                        final float method1489 = class4353.method13081(this.field23857.field2399);
                        final float method1490 = class4353.method13082(this.field23857.field2400);
                        final double d = method1486 - this.field23865;
                        final double d2 = method1487 - this.field23866;
                        final double d3 = method1488 - this.field23867;
                        final double method1491 = this.field23857.method1935().lengthSquared();
                        final double n = d * d + d2 * d2 + d3 * d3;
                        if (!this.field23857.method2783()) {
                            ++this.field23885;
                            int i = this.field23885 - this.field23886;
                            if (i > 5) {
                                Class5814.field23854.debug("{} is sending move packets too frequently ({} packets since last tick)", (Object)this.field23857.method1841().getString(), (Object)i);
                                i = 1;
                            }
                            if (!this.field23857.method2955()) {
                                if (!this.field23857.method2940().method6765().method31216(Class8878.field37332) || !this.field23857.method2773()) {
                                    if (n - method1491 > (this.field23857.method2773() ? 300.0f : 100.0f) * i) {
                                        if (!this.method17462()) {
                                            Class5814.field23854.warn("{} moved too quickly! {},{},{}", (Object)this.field23857.method1841().getString(), (Object)d, (Object)d2, (Object)d3);
                                            this.method17467(this.field23857.getPosX(), this.field23857.getPosY(), this.field23857.getPosZ(), this.field23857.field2399, this.field23857.field2400);
                                            return;
                                        }
                                    }
                                }
                            }
                            final boolean method1492 = this.method17466(method1481);
                            final double n2 = method1486 - this.field23868;
                            final double n3 = method1487 - this.field23869;
                            final double n4 = method1488 - this.field23870;
                            if (n3 > 0.0) {
                                this.field23857.field2414 = 0.0f;
                            }
                            if (this.field23857.field2404) {
                                if (!class4353.method13083()) {
                                    if (n3 > 0.0) {
                                        this.field23857.method2725();
                                    }
                                }
                            }
                            this.field23857.method1671(Class2160.field12827, new Vec3d(n2, n3, n4));
                            this.field23857.field2404 = class4353.method13083();
                            final double n5 = method1486 - this.field23857.getPosX();
                            double n6 = method1487 - this.field23857.getPosY();
                            if (n6 > -0.5 || n6 < 0.5) {
                                n6 = 0.0;
                            }
                            final double n7 = method1488 - this.field23857.getPosZ();
                            final double n8 = n5 * n5 + n6 * n6 + n7 * n7;
                            boolean b = false;
                            if (!this.field23857.method2955()) {
                                if (n8 > 0.0625) {
                                    if (!this.field23857.method2783()) {
                                        if (!this.field23857.field3041.method26484()) {
                                            if (this.field23857.field3041.method26482() != Class101.field301) {
                                                b = true;
                                                Class5814.field23854.warn("{} moved wrongly!", (Object)this.field23857.method1841().getString());
                                            }
                                        }
                                    }
                                }
                            }
                            this.field23857.method1728(method1486, method1487, method1488, method1489, method1490);
                            this.field23857.method2866(this.field23857.getPosX() - method1482, this.field23857.getPosY() - method1483, this.field23857.getPosZ() - method1484);
                            if (!this.field23857.field2421) {
                                if (!this.field23857.method2783()) {
                                    final boolean method1493 = this.method17466(method1481);
                                    if (method1492) {
                                        if (b || !method1493) {
                                            this.method17467(method1482, method1483, method1484, method1489, method1490);
                                            return;
                                        }
                                    }
                                }
                            }
                            boolean field23881 = false;
                            Label_1303: {
                                if (n6 >= -0.03125) {
                                    if (this.field23857.field3041.method26482() != Class101.field301) {
                                        if (!this.field23856.method1529()) {
                                            if (!this.field23857.field3025.field27303) {
                                                if (!this.field23857.method2653(Class9439.field40498)) {
                                                    if (!this.field23857.method2773()) {
                                                        if (!method1481.method6718(this.field23857.method1886().method18496(0.0625).method18494(0.0, -0.55, 0.0))) {
                                                            field23881 = true;
                                                            break Label_1303;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                field23881 = false;
                            }
                            this.field23881 = field23881;
                            this.field23857.field2404 = class4353.method13083();
                            this.field23857.method2940().method6904().method7443(this.field23857);
                            this.field23857.method2926(this.field23857.getPosY() - method1485, class4353.method13083());
                            this.field23868 = this.field23857.getPosX();
                            this.field23869 = this.field23857.getPosY();
                            this.field23870 = this.field23857.getPosZ();
                        }
                        else if (n > 1.0) {
                            this.method17467(this.field23857.getPosX(), this.field23857.getPosY(), this.field23857.getPosZ(), class4353.method13081(this.field23857.field2399), class4353.method13082(this.field23857.field2400));
                        }
                    }
                    else {
                        this.field23857.method1728(this.field23857.getPosX(), this.field23857.getPosY(), this.field23857.getPosZ(), class4353.method13081(this.field23857.field2399), class4353.method13082(this.field23857.field2400));
                        this.field23857.method2940().method6904().method7443(this.field23857);
                    }
                }
                else if (this.field23858 - this.field23880 > 20) {
                    this.field23880 = this.field23858;
                    this.method17467(this.field23878.x, this.field23878.y, this.field23878.z, this.field23857.field2399, this.field23857.field2400);
                }
            }
        }
        else {
            this.method17463(new Class2259("multiplayer.disconnect.invalid_player_movement", new Object[0]));
        }
    }
    
    private boolean method17466(final Class1852 class1852) {
        return class1852.method6978(this.field23857, this.field23857.method1886().method18511(9.999999747378752E-6));
    }
    
    public void method17467(final double n, final double n2, final double n3, final float n4, final float n5) {
        this.method17468(n, n2, n3, n4, n5, Collections.emptySet());
    }
    
    public void method17468(final double n, final double n2, final double n3, final float n4, final float n5, final Set<Class2143> set) {
        final double n6 = set.contains(Class2143.field12617) ? this.field23857.getPosX() : 0.0;
        final double n7 = set.contains(Class2143.field12618) ? this.field23857.getPosY() : 0.0;
        final double n8 = set.contains(Class2143.field12619) ? this.field23857.getPosZ() : 0.0;
        final float n9 = set.contains(Class2143.field12620) ? this.field23857.field2399 : 0.0f;
        final float n10 = set.contains(Class2143.field12621) ? this.field23857.field2400 : 0.0f;
        this.field23878 = new Vec3d(n, n2, n3);
        if (++this.field23879 == Integer.MAX_VALUE) {
            this.field23879 = 0;
        }
        this.field23880 = this.field23858;
        this.field23857.method1728(n, n2, n3, n4, n5);
        this.field23857.field3039.method17469(new Class4328(n - n6, n2 - n7, n3 - n8, n4 - n9, n5 - n10, set, this.field23879));
    }
    
    @Override
    public void method17431(final Class4399 class4399) {
        Class8663.method29631((Class4252<Class5814>)class4399, this, this.field23857.method2940());
        final BlockPos method13237 = class4399.method13237();
        this.field23857.method2946();
        final Class2003 method13238 = class4399.method13239();
        switch (Class8365.field34306[method13238.ordinal()]) {
            case 1: {
                if (!this.field23857.method1639()) {
                    final Class8321 method13239 = this.field23857.method2715(Class316.field1878);
                    this.field23857.method2716(Class316.field1878, this.field23857.method2715(Class316.field1877));
                    this.field23857.method2716(Class316.field1877, method13239);
                }
                return;
            }
            case 2: {
                if (!this.field23857.method1639()) {
                    this.field23857.method2821(false);
                }
                return;
            }
            case 3: {
                if (!this.field23857.method1639()) {
                    this.field23857.method2821(true);
                }
                return;
            }
            case 4: {
                this.field23857.method2769();
                return;
            }
            case 5:
            case 6:
            case 7: {
                this.field23857.field3041.method26478(method13237, method13238, class4399.method13238(), this.field23856.method1534());
                return;
            }
            default: {
                throw new IllegalArgumentException("Invalid player action");
            }
        }
    }
    
    @Override
    public void method17437(final Class4329 class4329) {
        Class8663.method29631((Class4252<Class5814>)class4329, this, this.field23857.method2940());
        final Class1849 method1481 = this.field23856.method1481(this.field23857.field2452);
        final Class316 method1482 = class4329.method12999();
        final Class8321 method1483 = this.field23857.method2715(method1482);
        final Class7005 method1484 = class4329.method13000();
        final BlockPos method1485 = method1484.method21447();
        final Direction method1486 = method1484.method21448();
        this.field23857.method2946();
        if (method1485.getY() >= this.field23856.method1534() - 1 && (method1486 == Direction.UP || method1485.getY() >= this.field23856.method1534())) {
            this.field23857.field3039.method17469(new Class4378(new Class2259("build.tooHigh", new Object[] { this.field23856.method1534() }).method8469(Class2116.field12321), Class285.field1574));
        }
        else if (this.field23878 == null) {
            if (this.field23857.method1733(method1485.getX() + 0.5, method1485.getY() + 0.5, method1485.getZ() + 0.5) < 64.0) {
                if (method1481.method6760(this.field23857, method1485)) {
                    if (this.field23857.field3041.method26480(this.field23857, method1481, method1483, method1482, method1484).method8375()) {
                        this.field23857.method2708(method1482, true);
                    }
                }
            }
        }
        this.field23857.field3039.method17469(new Class4271(method1481, method1485));
        this.field23857.field3039.method17469(new Class4271(method1481, method1485.method1149(method1486)));
    }
    
    @Override
    public void method17438(final Class4307 class4307) {
        Class8663.method29631((Class4252<Class5814>)class4307, this, this.field23857.method2940());
        final Class1849 method1481 = this.field23856.method1481(this.field23857.field2452);
        final Class316 method1482 = class4307.method12950();
        final Class8321 method1483 = this.field23857.method2715(method1482);
        this.field23857.method2946();
        if (!method1483.method27620()) {
            this.field23857.field3041.method26479(this.field23857, method1481, method1483, method1482);
        }
    }
    
    @Override
    public void method17439(final Class4294 class4294) {
        Class8663.method29631((Class4252<Class5814>)class4294, this, this.field23857.method2940());
        if (this.field23857.method1639()) {
            for (final Class1849 class4295 : this.field23856.method1482()) {
                final Entity method12899 = class4294.method12899(class4295);
                if (method12899 == null) {
                    continue;
                }
                this.field23857.method2958(class4295, method12899.getPosX(), method12899.getPosY(), method12899.getPosZ(), method12899.field2399, method12899.field2400);
            }
        }
    }
    
    @Override
    public void method17440(final Class4285 class4285) {
    }
    
    @Override
    public void method17441(final Class4302 class4302) {
        Class8663.method29631((Class4252<Class5814>)class4302, this, this.field23857.method2940());
        final Entity method1920 = this.field23857.method1920();
        if (method1920 instanceof Class423) {
            ((Class423)method1920).method2044(class4302.method12940(), class4302.method12941());
        }
    }
    
    @Override
    public void method17291(final Class2250 class2250) {
        Class5814.field23854.info("{} lost connection: {}", (Object)this.field23857.method1841().getString(), (Object)class2250.getString());
        this.field23856.method1558();
        this.field23856.method1537().method20619(new Class2259("multiplayer.player.left", new Object[] { this.field23857.method1871() }).method8469(Class2116.field12323));
        this.field23857.method2935();
        this.field23856.method1537().method20581(this.field23857);
        if (this.method17462()) {
            Class5814.field23854.info("Stopping singleplayer server as player logged out");
            this.field23856.method1456(false);
        }
    }
    
    public void method17469(final Class4252<?> class4252) {
        this.method17470(class4252, null);
    }
    
    public void method17470(final Class4252<?> class4252, final GenericFutureListener<? extends Future<? super Void>> genericFutureListener) {
        if (class4252 instanceof Class4378) {
            final Class4378 class4253 = (Class4378)class4252;
            final Class2047 method2944 = this.field23857.method2944();
            if (method2944 == Class2047.field11663 && class4253.method13166() != Class285.field1574) {
                return;
            }
            if (method2944 == Class2047.field11662 && !class4253.method13165()) {
                return;
            }
        }
        try {
            this.field23855.method11175(class4252, genericFutureListener);
        }
        catch (final Throwable t) {
            final Class7689 method2945 = Class7689.method24421(t, "Sending packet");
            method2945.method24418("Packet being sent").method16296("Packet class", () -> class4254.getClass().getCanonicalName());
            throw new Class2365(method2945);
        }
    }
    
    @Override
    public void method17434(final Class4321 class4321) {
        Class8663.method29631((Class4252<Class5814>)class4321, this, this.field23857.method2940());
        if (class4321.method12985() >= 0 && class4321.method12985() < Class464.method2346()) {
            this.field23857.field3006.field2743 = class4321.method12985();
            this.field23857.method2946();
        }
        else {
            Class5814.field23854.warn("{} tried to set an invalid carried item", (Object)this.field23857.method1841().getString());
        }
    }
    
    @Override
    public void method17418(final Class4317 class4317) {
        Class8663.method29631((Class4252<Class5814>)class4317, this, this.field23857.method2940());
        if (this.field23857.method2944() != Class2047.field11663) {
            this.field23857.method2946();
            final String normalizeSpace = StringUtils.normalizeSpace(class4317.method12973());
            for (int i = 0; i < normalizeSpace.length(); ++i) {
                if (!Class9528.method35576(normalizeSpace.charAt(i))) {
                    this.method17463(new Class2259("multiplayer.disconnect.illegal_characters", new Object[0]));
                    return;
                }
            }
            if (!normalizeSpace.startsWith("/")) {
                this.field23856.method1537().method20618(new Class2259("chat.type.text", new Object[] { this.field23857.method1871(), normalizeSpace }), false);
            }
            else {
                this.method17471(normalizeSpace);
            }
            this.field23862 += 20;
            if (this.field23862 > 200) {
                if (!this.field23856.method1537().method20597(this.field23857.method2844())) {
                    this.method17463(new Class2259("disconnect.spam", new Object[0]));
                }
            }
        }
        else {
            this.method17469(new Class4378(new Class2259("chat.cannotSend", new Object[0]).method8469(Class2116.field12321)));
        }
    }
    
    private void method17471(final String s) {
        this.field23856.method1573().method24998(this.field23857.method1924(), s);
    }
    
    @Override
    public void method17417(final Class4380 class4380) {
        Class8663.method29631((Class4252<Class5814>)class4380, this, this.field23857.method2940());
        this.field23857.method2946();
        this.field23857.method2707(class4380.method13169());
    }
    
    @Override
    public void method17432(final Class4336 class4336) {
        Class8663.method29631((Class4252<Class5814>)class4336, this, this.field23857.method2940());
        this.field23857.method2946();
        switch (Class8365.field34307[class4336.method13018().ordinal()]) {
            case 1: {
                this.field23857.method1808(true);
                break;
            }
            case 2: {
                this.field23857.method1808(false);
                break;
            }
            case 3: {
                this.field23857.method1816(true);
                break;
            }
            case 4: {
                this.field23857.method1816(false);
                break;
            }
            case 5: {
                if (this.field23857.method2783()) {
                    this.field23857.method2849(false, true);
                    this.field23878 = this.field23857.method1934();
                    break;
                }
                break;
            }
            case 6: {
                if (this.field23857.method1920() instanceof Class810) {
                    final Class810 class4337 = (Class810)this.field23857.method1920();
                    final int method13019 = class4336.method13019();
                    if (class4337.method4759() && method13019 > 0) {
                        class4337.method4760(method13019);
                    }
                    break;
                }
                break;
            }
            case 7: {
                if (this.field23857.method1920() instanceof Class810) {
                    ((Class810)this.field23857.method1920()).method4761();
                    break;
                }
                break;
            }
            case 8: {
                if (this.field23857.method1920() instanceof Class806) {
                    ((Class806)this.field23857.method1920()).method4740(this.field23857);
                    break;
                }
                break;
            }
            case 9: {
                if (!this.field23857.method2868()) {
                    this.field23857.method2870();
                    break;
                }
                break;
            }
            default: {
                throw new IllegalArgumentException("Invalid client command!");
            }
        }
    }
    
    @Override
    public void method17427(final Class4381 class4381) {
        Class8663.method29631((Class4252<Class5814>)class4381, this, this.field23857.method2940());
        final Entity method13170 = class4381.method13170(this.field23856.method1481(this.field23857.field2452));
        this.field23857.method2946();
        if (method13170 != null) {
            final boolean method13171 = this.field23857.method2747(method13170);
            double n = 36.0;
            if (!method13171) {
                n = 9.0;
            }
            if (this.field23857.method1734(method13170) < n) {
                if (class4381.method13171() != Class2029.field11564) {
                    if (class4381.method13171() != Class2029.field11566) {
                        if (class4381.method13171() == Class2029.field11565) {
                            if (!(method13170 instanceof Class427)) {
                                if (!(method13170 instanceof Class508)) {
                                    if (!(method13170 instanceof Class402)) {
                                        if (method13170 != this.field23857) {
                                            this.field23857.method2837(method13170);
                                            return;
                                        }
                                    }
                                }
                            }
                            this.method17463(new Class2259("multiplayer.disconnect.invalid_entity_attacked", new Object[0]));
                            this.field23856.method1480("Player " + this.field23857.method1841().getString() + " tried to attack an invalid entity");
                        }
                    }
                    else {
                        final Class316 method13172 = class4381.method13172();
                        if (method13170.method1898(this.field23857, class4381.method13173(), method13172).method8375()) {
                            this.field23857.method2708(method13172, true);
                        }
                    }
                }
                else {
                    this.field23857.method2836(method13170, class4381.method13172());
                }
            }
        }
    }
    
    @Override
    public void method17419(final Class4323 class4323) {
        Class8663.method29631((Class4252<Class5814>)class4323, this, this.field23857.method2940());
        this.field23857.method2946();
        switch (Class8365.field34308[class4323.method12987().ordinal()]) {
            case 1: {
                if (this.field23857.field3071) {
                    this.field23857.field3071 = false;
                    this.field23857 = this.field23856.method1537().method20583(this.field23857, Class383.field2223, true);
                    Class7770.field31796.method13796(this.field23857, Class383.field2225, Class383.field2223);
                    break;
                }
                if (this.field23857.method2664() > 0.0f) {
                    return;
                }
                this.field23857 = this.field23856.method1537().method20583(this.field23857, Class383.field2223, false);
                if (this.field23856.method1447()) {
                    this.field23857.method2883(Class101.field301);
                    this.field23857.method2940().method6765().method31211(Class8878.field37330).method26724(false, this.field23856);
                    break;
                }
                break;
            }
            case 2: {
                this.field23857.method2947().method23083(this.field23857);
                break;
            }
        }
    }
    
    @Override
    public void method17425(final Class4389 class4389) {
        Class8663.method29631((Class4252<Class5814>)class4389, this, this.field23857.method2940());
        this.field23857.method2933();
    }
    
    @Override
    public void method17423(final Class4256 class4256) {
        Class8663.method29631((Class4252<Class5814>)class4256, this, this.field23857.method2940());
        this.field23857.method2946();
        if (this.field23857.field3009.field16154 == class4256.method12773()) {
            if (this.field23857.field3009.method10886(this.field23857)) {
                if (!this.field23857.method1639()) {
                    if (!Class8321.method27643(class4256.method12777(), this.field23857.field3009.method10879(class4256.method12774(), class4256.method12775(), class4256.method12778(), this.field23857))) {
                        this.field23864.put(this.field23857.field3009.field16154, class4256.method12776());
                        this.field23857.field3039.method17469(new Class4393(class4256.method12773(), class4256.method12776(), false));
                        this.field23857.field3009.method10887(this.field23857, false);
                        final Class2265<Object> method8506 = (Class2265<Object>)Class2265.method8506();
                        for (int i = 0; i < this.field23857.field3009.field16151.size(); ++i) {
                            final Class8321 method8507 = this.field23857.field3009.field16151.get(i).method20053();
                            method8506.add(method8507.method27620() ? Class8321.field34174 : method8507);
                        }
                        this.field23857.method2930(this.field23857.field3009, (Class2265<Class8321>)method8506);
                    }
                    else {
                        this.field23857.field3039.method17469(new Class4393(class4256.method12773(), class4256.method12776(), true));
                        this.field23857.field3069 = true;
                        this.field23857.field3009.method10876();
                        this.field23857.method2932();
                        this.field23857.field3069 = false;
                    }
                }
                else {
                    final Class2265<Object> method8508 = (Class2265<Object>)Class2265.method8506();
                    for (int j = 0; j < this.field23857.field3009.field16151.size(); ++j) {
                        method8508.add(this.field23857.field3009.field16151.get(j).method20053());
                    }
                    this.field23857.method2930(this.field23857.field3009, (Class2265<Class8321>)method8508);
                }
            }
        }
    }
    
    @Override
    public void method17424(final Class4387 class4387) {
        Class8663.method29631((Class4252<Class5814>)class4387, this, this.field23857.method2940());
        this.field23857.method2946();
        if (!this.field23857.method1639()) {
            if (this.field23857.field3009.field16154 == class4387.method13202()) {
                if (this.field23857.field3009.method10886(this.field23857)) {
                    if (this.field23857.field3009 instanceof Class3426) {
                        this.field23856.method1577().method6382(class4387.method13203()).ifPresent(class4389 -> ((Class3426)this.field23857.field3009).method10933(class4388.method13204(), class4389, this.field23857));
                    }
                }
            }
        }
    }
    
    @Override
    public void method17422(final Class4366 class4366) {
        Class8663.method29631((Class4252<Class5814>)class4366, this, this.field23857.method2940());
        this.field23857.method2946();
        if (this.field23857.field3009.field16154 == class4366.method13131()) {
            if (this.field23857.field3009.method10886(this.field23857)) {
                if (!this.field23857.method1639()) {
                    this.field23857.field3009.method10877(this.field23857, class4366.method13132());
                    this.field23857.field3009.method10876();
                }
            }
        }
    }
    
    @Override
    public void method17435(final Class4287 class4287) {
        Class8663.method29631((Class4252<Class5814>)class4287, this, this.field23857.method2940());
        if (this.field23857.field3041.method26484()) {
            final boolean b = class4287.method12874() < 0;
            final Class8321 method12875 = class4287.method12875();
            final Class51 method12876 = method12875.method27660("BlockEntityTag");
            if (!method12875.method27620()) {
                if (method12876 != null) {
                    if (method12876.method315("x")) {
                        if (method12876.method315("y")) {
                            if (method12876.method315("z")) {
                                final Class436 method12877 = this.field23857.field2391.method6727(new BlockPos(method12876.method319("x"), method12876.method319("y"), method12876.method319("z")));
                                if (method12877 != null) {
                                    final Class51 method12878 = method12877.method2180(new Class51());
                                    method12878.method330("x");
                                    method12878.method330("y");
                                    method12878.method330("z");
                                    method12875.method27676("BlockEntityTag", method12878);
                                }
                            }
                        }
                    }
                }
            }
            final boolean b2 = class4287.method12874() >= 1 && class4287.method12874() <= 45;
            boolean b3 = false;
            Label_0313: {
                Label_0265: {
                    if (!method12875.method27620()) {
                        if (method12875.method27632() >= 0) {
                            if (method12875.method27690() <= 64) {
                                if (!method12875.method27620()) {
                                    break Label_0265;
                                }
                            }
                        }
                        b3 = false;
                        break Label_0313;
                    }
                }
                b3 = true;
            }
            final boolean b4 = b3;
            if (b2 && b4) {
                if (!method12875.method27620()) {
                    this.field23857.field3008.method10882(class4287.method12874(), method12875);
                }
                else {
                    this.field23857.field3008.method10882(class4287.method12874(), Class8321.field34174);
                }
                this.field23857.field3008.method10887(this.field23857, true);
                this.field23857.field3008.method10876();
            }
            else if (b) {
                if (b4) {
                    if (this.field23863 < 200) {
                        this.field23863 += 20;
                        this.field23857.method2822(method12875, true);
                    }
                }
            }
        }
    }
    
    @Override
    public void method17421(final Class4255 class4255) {
        Class8663.method29631((Class4252<Class5814>)class4255, this, this.field23857.method2940());
        final int field16154 = this.field23857.field3009.field16154;
        if (field16154 == class4255.method12771()) {
            if (this.field23864.getOrDefault(field16154, (short)(class4255.method12772() + 1)) == class4255.method12772()) {
                if (!this.field23857.field3009.method10886(this.field23857)) {
                    if (!this.field23857.method1639()) {
                        this.field23857.field3009.method10887(this.field23857, true);
                    }
                }
            }
        }
    }
    
    @Override
    public void method17436(final Class4344 class4344) {
        Class8663.method29631((Class4252<Class5814>)class4344, this, this.field23857.method2940());
        this.field23857.method2946();
        final Class1849 method1481 = this.field23856.method1481(this.field23857.field2452);
        final BlockPos method1482 = class4344.method13046();
        if (method1481.method6971(method1482)) {
            final Class7096 method1483 = method1481.method6701(method1482);
            final Class436 method1484 = method1481.method6727(method1482);
            if (!(method1484 instanceof Class497)) {
                return;
            }
            final Class497 class4345 = (Class497)method1484;
            if (!class4345.method2523() || class4345.method2526() != this.field23857) {
                this.field23856.method1480("Player " + this.field23857.method1841().getString() + " just tried to change non-editable sign");
                return;
            }
            final String[] method1485 = class4344.method13047();
            for (int i = 0; i < method1485.length; ++i) {
                class4345.method2521(i, new Class2260(Class2116.method8259(method1485[i])));
            }
            class4345.method2161();
            method1481.method6693(method1482, method1483, method1483, 3);
        }
    }
    
    @Override
    public void method17428(final Class4303 class4303) {
        if (this.field23860 && class4303.method12942() == this.field23861) {
            this.field23857.field3070 = (this.field23857.field3070 * 3 + (int)(Class8349.method27837() - this.field23859)) / 4;
            this.field23860 = false;
        }
        else if (!this.method17462()) {
            this.method17463(new Class2259("disconnect.timeout", new Object[0]));
        }
    }
    
    @Override
    public void method17430(final Class4358 class4358) {
        Class8663.method29631((Class4252<Class5814>)class4358, this, this.field23857.method2940());
        this.field23857.field3025.field27302 = (class4358.method13089() && this.field23857.field3025.field27303);
    }
    
    @Override
    public void method17420(final Class4386 class4386) {
        Class8663.method29631((Class4252<Class5814>)class4386, this, this.field23857.method2940());
        this.field23857.method2943(class4386);
    }
    
    @Override
    public void method17426(final Class4326 class4326) {
    }
    
    @Override
    public void method17458(final Class4338 class4338) {
        Class8663.method29631((Class4252<Class5814>)class4338, this, this.field23857.method2940());
        if (this.field23857.method1926(2) || this.method17462()) {
            this.field23856.method1505(class4338.method13022(), false);
        }
    }
    
    @Override
    public void method17459(final Class4291 class4291) {
        Class8663.method29631((Class4252<Class5814>)class4291, this, this.field23857.method2940());
        if (this.field23857.method1926(2) || this.method17462()) {
            this.field23856.method1506(class4291.method12890());
        }
    }
    
    static {
        field23854 = LogManager.getLogger();
    }
}
