// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.cache.CacheLoader;
import com.google.common.cache.CacheBuilder;
import net.minecraft.entity.Entity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.ITextComponent;
import org.apache.logging.log4j.LogManager;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import java.util.Random;
import java.util.stream.Stream;
import it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap;
import com.google.common.cache.LoadingCache;
import org.apache.logging.log4j.Logger;

public class Class3833 implements Class3832
{
    public static final Logger field17390;
    public static final Class94<Class7096> field17391;
    private static final Direction[] field17392;
    private static final LoadingCache<Class7702, Boolean> field17393;
    private static final Class7702 field17394;
    private static final Class7702 field17395;
    public final int field17396;
    public final float field17397;
    public final float field17398;
    public final boolean field17399;
    public final Class7696 field17400;
    public final Class8059 field17401;
    public final Class8819 field17402;
    private final float field17403;
    private final float field17404;
    private final float field17405;
    public final Class9104<Class3833, Class7096> field17406;
    private Class7096 field17407;
    public final boolean field17408;
    private final boolean field17409;
    private final boolean field17410;
    private Class1932 field17411;
    private String field17412;
    private Class3820 field17413;
    private static final ThreadLocal<Object2ByteLinkedOpenHashMap<Class8266>> field17414;
    
    public static int method11774(final Class7096 class7096) {
        if (class7096 != null) {
            final boolean method563 = Class3833.field17391.method563(class7096) != 0;
            return (((method563 ? 1 : 0) != -1) ? method563 : false) ? 1 : 0;
        }
        return 0;
    }
    
    public static Class7096 method11775(final int n) {
        final Class7096 class7096 = Class3833.field17391.method499(n);
        return (class7096 != null) ? class7096 : Class7521.field29147.method11878();
    }
    
    public static Class3833 method11776(final Class3820 class3820) {
        return (class3820 instanceof Class4036) ? ((Class4036)class3820).method12240() : Class7521.field29147;
    }
    
    public static Class7096 method11777(final Class7096 class7096, final Class7096 class7097, final Class1847 class7098, final BlockPos class7099) {
        final Class7702 method24541 = Class7698.method24495(class7096.method21727(class7098, class7099), class7097.method21727(class7098, class7099), Class9306.field39918).method24541(class7099.getX(), class7099.getY(), class7099.getZ());
        for (final Entity class7100 : class7098.method7127(null, method24541.method24537())) {
            class7100.method1878(class7100.getPosX(), class7100.getPosY() + 1.0 + Class7698.method24498(Axis.Y, class7100.method1886().method18499(0.0, 1.0, 0.0), Stream.of(method24541), -1.0), class7100.getPosZ());
        }
        return class7097;
    }
    
    public static Class7702 method11778(final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
        return Class7698.method24488(n / 16.0, n2 / 16.0, n3 / 16.0, n4 / 16.0, n5 / 16.0, n6 / 16.0);
    }
    
    @Deprecated
    public boolean method11779(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098, final EntityType<?> class7099) {
        return class7096.method21761(class7097, class7098, Direction.UP) && this.field17396 < 14;
    }
    
    @Deprecated
    public boolean method11780(final Class7096 class7096) {
        return false;
    }
    
    @Deprecated
    public int method11781(final Class7096 class7096) {
        return this.field17396;
    }
    
    @Deprecated
    public Class8059 method11782(final Class7096 class7096) {
        return this.field17401;
    }
    
    @Deprecated
    public Class8819 method11783(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098) {
        return this.field17402;
    }
    
    @Deprecated
    public void method11784(final Class7096 class7096, final Class1851 class7097, final BlockPos class7098, final int n) {
        try (final Class386 method1296 = Class386.method1296()) {
            for (final Direction class7099 : Class3833.field17392) {
                method1296.method1303(class7098).method1304(class7099);
                final Class7096 method1297 = class7097.method6701(method1296);
                method11787(method1297, method1297.method21748(class7099.getOpposite(), class7096, class7097, method1296, class7098), class7097, method1296, n);
            }
        }
    }
    
    public boolean method11785(final Class7909<Class3833> class7909) {
        return class7909.method25618(this);
    }
    
    public static Class7096 method11786(final Class7096 class7096, final Class1851 class7097, final BlockPos class7098) {
        Class7096 method21748 = class7096;
        final Class385 class7099 = new Class385();
        for (final Direction class7100 : Class3833.field17392) {
            class7099.method1287(class7098).method1290(class7100);
            method21748 = method21748.method21748(class7100, class7097.method6701(class7099), class7097, class7098, class7099);
        }
        return method21748;
    }
    
    public static void method11787(final Class7096 class7096, final Class7096 class7097, final Class1851 class7098, final BlockPos class7099, final int n) {
        if (class7097 != class7096) {
            if (!class7097.method21706()) {
                class7098.method6688(class7099, class7097, n & 0xFFFFFFDF);
            }
            else if (!class7098.method6678()) {
                class7098.method7149(class7099, (n & 0x20) == 0x0);
            }
        }
    }
    
    @Deprecated
    public void method11788(final Class7096 class7096, final Class1851 class7097, final BlockPos class7098, final int n) {
    }
    
    @Deprecated
    public Class7096 method11789(final Class7096 class7096, final Direction class7097, final Class7096 class7098, final Class1851 class7099, final BlockPos class7100, final BlockPos class7101) {
        return class7096;
    }
    
    @Deprecated
    public Class7096 method11790(final Class7096 class7096, final Class2052 class7097) {
        return class7096;
    }
    
    @Deprecated
    public Class7096 method11791(final Class7096 class7096, final Class2181 class7097) {
        return class7096;
    }
    
    public Class3833(final Class9288 class9288) {
        final Class9500 class9289 = new Class9500((O)this);
        this.method11875(class9289);
        this.field17401 = Class9288.method34297(class9288);
        this.field17402 = Class9288.method34298(class9288);
        this.field17408 = Class9288.method34299(class9288);
        this.field17400 = Class9288.method34300(class9288);
        this.field17396 = Class9288.method34301(class9288);
        this.field17398 = Class9288.method34302(class9288);
        this.field17397 = Class9288.method34303(class9288);
        this.field17399 = Class9288.method34304(class9288);
        this.field17403 = Class9288.method34305(class9288);
        this.field17404 = Class9288.method34306(class9288);
        this.field17405 = Class9288.method34307(class9288);
        this.field17409 = Class9288.method34308(class9288);
        this.field17411 = Class9288.method34309(class9288);
        this.field17410 = Class9288.method34310(class9288);
        this.field17406 = class9289.method35380(Class7096::new);
        this.method11877(this.field17406.method32903());
    }
    
    public static boolean method11792(final Class3833 class3833) {
        if (!(class3833 instanceof Class3972)) {
            if (class3833 != Class7521.field29517) {
                if (class3833 != Class7521.field29342) {
                    if (class3833 != Class7521.field29343) {
                        if (class3833 != Class7521.field29383) {
                            if (class3833 != Class7521.field29337) {
                                if (!class3833.method11785(Class7188.field27914)) {
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
    
    @Deprecated
    public boolean method11793(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098) {
        if (class7096.method21697().method26443()) {
            if (class7096.method21762(class7097, class7098)) {
                if (!class7096.method21714()) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Deprecated
    public boolean method11794(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098) {
        return this.field17401.method26440() && class7096.method21762(class7097, class7098);
    }
    
    @Deprecated
    public boolean method11795(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098) {
        return class7096.method21746(class7097, class7098);
    }
    
    @Deprecated
    public boolean method11796(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098, final Class2084 class7099) {
        switch (Class9511.field40924[class7099.ordinal()]) {
            case 1: {
                return !class7096.method21762(class7097, class7098);
            }
            case 2: {
                return class7097.method6702(class7098).method21793(Class7324.field28319);
            }
            case 3: {
                return !class7096.method21762(class7097, class7098);
            }
            default: {
                return false;
            }
        }
    }
    
    @Deprecated
    public Class2115 method11797(final Class7096 class7096) {
        return Class2115.field12307;
    }
    
    @Deprecated
    public boolean method11798(final Class7096 class7096, final Class7074 class7097) {
        return this.field17401.method26442() && (class7097.method21651().method27620() || class7097.method21651().method27622() != this.method11704());
    }
    
    @Deprecated
    public boolean method11799(final Class7096 class7096, final Class7255 class7097) {
        return this.field17401.method26442() || !this.field17401.method26439();
    }
    
    @Deprecated
    public float method11800(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098) {
        return this.field17397;
    }
    
    public boolean method11801(final Class7096 class7096) {
        return this.field17399;
    }
    
    public boolean method11802() {
        return this instanceof Class3840;
    }
    
    @Deprecated
    public boolean method11803(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098) {
        return false;
    }
    
    @Deprecated
    public boolean method11804(final Class7096 class7096) {
        return false;
    }
    
    public static boolean method11805(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098, final Direction class7099) {
        final BlockPos method1149 = class7098.method1149(class7099);
        final Class7096 method1150 = class7097.method6701(method1149);
        if (class7096.method21724(method1150, class7099)) {
            return false;
        }
        if (!method1150.method21723()) {
            return true;
        }
        final Class8266 class7100 = new Class8266(class7096, method1150, class7099);
        final Object2ByteLinkedOpenHashMap object2ByteLinkedOpenHashMap = Class3833.field17414.get();
        final byte andMoveToFirst = object2ByteLinkedOpenHashMap.getAndMoveToFirst((Object)class7100);
        if (andMoveToFirst == 127) {
            final boolean method1151 = Class7698.method24496(class7096.method21701(class7097, class7098, class7099), method1150.method21701(class7097, method1149, class7099.getOpposite()), Class9306.field39920);
            if (object2ByteLinkedOpenHashMap.size() == 2048) {
                object2ByteLinkedOpenHashMap.removeLastByte();
            }
            object2ByteLinkedOpenHashMap.putAndMoveToFirst((Object)class7100, (byte)(byte)(method1151 ? 1 : 0));
            return method1151;
        }
        return andMoveToFirst != 0;
    }
    
    @Deprecated
    public final boolean method11806(final Class7096 class7096) {
        return this.field17410;
    }
    
    @Deprecated
    public boolean method11807(final Class7096 class7096, final Class7096 class7097, final Direction class7098) {
        return false;
    }
    
    @Deprecated
    public Class7702 method11808(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098, final Class7543 class7099) {
        return Class7698.method24487();
    }
    
    @Deprecated
    public Class7702 method11809(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098, final Class7543 class7099) {
        return this.field17408 ? class7096.method21725(class7097, class7098) : Class7698.method24486();
    }
    
    @Deprecated
    public Class7702 method11810(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098) {
        return class7096.method21725(class7097, class7098);
    }
    
    @Deprecated
    public Class7702 method11811(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098) {
        return Class7698.method24486();
    }
    
    public static boolean method11812(final Class1855 class1855, final BlockPos class1856) {
        final Class7096 method6701 = class1855.method6701(class1856);
        return !method6701.method21755(Class7188.field27907) && !Class7698.method24496(method6701.method21727(class1855, class1856).method24551(Direction.UP), Class3833.field17394, Class9306.field39918);
    }
    
    public static boolean method11813(final Class1852 class1852, final BlockPos class1853, final Direction class1854) {
        final Class7096 method6701 = class1852.method6701(class1853);
        return !method6701.method21755(Class7188.field27907) && !Class7698.method24496(method6701.method21727(class1852, class1853).method24551(class1854), Class3833.field17395, Class9306.field39918);
    }
    
    public static boolean method11814(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098, final Direction class7099) {
        return !class7096.method21755(Class7188.field27907) && method11815(class7096.method21727(class7097, class7098), class7099);
    }
    
    public static boolean method11815(final Class7702 class7702, final Direction class7703) {
        return method11816(class7702.method24551(class7703));
    }
    
    public static boolean method11816(final Class7702 class7702) {
        return (boolean)Class3833.field17393.getUnchecked((Object)class7702);
    }
    
    @Deprecated
    public final boolean method11817(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098) {
        return class7096.method21723() && method11816(class7096.method21729(class7097, class7098));
    }
    
    public boolean method11818(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098) {
        return !method11816(class7096.method21725(class7097, class7098)) && class7096.method21756().method21781();
    }
    
    @Deprecated
    public int method11819(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098) {
        if (!class7096.method21722(class7097, class7098)) {
            return class7096.method21699(class7097, class7098) ? 0 : 1;
        }
        return class7097.method6985();
    }
    
    @Deprecated
    public boolean method11820(final Class7096 class7096) {
        return false;
    }
    
    @Deprecated
    public void method11821(final Class7096 class7096, final Class1849 class7097, final BlockPos class7098, final Random random) {
        this.method11822(class7096, class7097, class7098, random);
    }
    
    @Deprecated
    public void method11822(final Class7096 class7096, final Class1849 class7097, final BlockPos class7098, final Random random) {
    }
    
    public void method11823(final Class7096 class7096, final Class1847 class7097, final BlockPos class7098, final Random random) {
    }
    
    public void method11824(final Class1851 class1851, final BlockPos class1852, final Class7096 class1853) {
    }
    
    @Deprecated
    public void method11825(final Class7096 class7096, final Class1847 class7097, final BlockPos class7098, final Class3833 class7099, final BlockPos class7100, final boolean b) {
        Class9324.method34536(class7097, class7098);
    }
    
    public int method11826(final Class1852 class1852) {
        return 10;
    }
    
    @Nullable
    @Deprecated
    public Class434 method11827(final Class7096 class7096, final Class1847 class7097, final BlockPos class7098) {
        return null;
    }
    
    @Deprecated
    public void method11828(final Class7096 class7096, final Class1847 class7097, final BlockPos class7098, final Class7096 class7099, final boolean b) {
    }
    
    @Deprecated
    public void method11829(final Class7096 class7096, final Class1847 class7097, final BlockPos class7098, final Class7096 class7099, final boolean b) {
        if (this.method11802()) {
            if (class7096.method21696() != class7099.method21696()) {
                class7097.method6730(class7098);
            }
        }
    }
    
    @Deprecated
    public float method11830(final Class7096 class7096, final Class512 class7097, final Class1855 class7098, final BlockPos class7099) {
        final float method21718 = class7096.method21718(class7098, class7099);
        if (method21718 != -1.0f) {
            return class7097.method2824(class7096) / method21718 / (class7097.method2825(class7096) ? 30 : 100);
        }
        return 0.0f;
    }
    
    @Deprecated
    public void method11831(final Class7096 class7096, final Class1847 class7097, final BlockPos class7098, final ItemStack class7099) {
    }
    
    public Class1932 method11832() {
        if (this.field17411 == null) {
            final Class1932 method503 = Class90.field208.method503(this);
            this.field17411 = new Class1932(method503.method7798(), "blocks/" + method503.method7797());
        }
        return this.field17411;
    }
    
    @Deprecated
    public List<ItemStack> method11833(final Class7096 class7096, final Class9098 class7097) {
        final Class1932 method11832 = this.method11832();
        if (method11832 != Class9020.field38063) {
            final Class7529 method11833 = class7097.method32877(Class6683.field26368, class7096).method32883(Class7104.field27719);
            return method11833.method23588().method6679().method1581().method6402(method11832).method34485(method11833);
        }
        return Collections.emptyList();
    }
    
    public static List<ItemStack> method11834(final Class7096 class7096, final Class1849 class7097, final BlockPos class7098, final Class436 class7099) {
        return class7096.method21743(new Class9098(class7097).method32873(class7097.field10062).method32877(Class6683.field26367, class7098).method32877(Class6683.field26370, ItemStack.field34174).method32878(Class6683.field26369, class7099));
    }
    
    public static List<ItemStack> method11835(final Class7096 class7096, final Class1849 class7097, final BlockPos class7098, final Class436 class7099, final Entity class7100, final ItemStack class7101) {
        return class7096.method21743(new Class9098(class7097).method32873(class7097.field10062).method32877(Class6683.field26367, class7098).method32877(Class6683.field26370, class7101).method32878(Class6683.field26362, class7100).method32878(Class6683.field26369, class7099));
    }
    
    public static void method11836(final Class7096 class7096, final Class1847 class7097, final BlockPos class7098) {
        if (class7097 instanceof Class1849) {
            method11834(class7096, (Class1849)class7097, class7098, null).forEach(class7101 -> method11839(class7099, class7100, class7101));
        }
        class7096.method21742(class7097, class7098, ItemStack.field34174);
    }
    
    public static void method11837(final Class7096 class7096, final Class1847 class7097, final BlockPos class7098, final Class436 class7099) {
        if (class7097 instanceof Class1849) {
            method11834(class7096, (Class1849)class7097, class7098, class7099).forEach(class7102 -> method11839(class7100, class7101, class7102));
        }
        class7096.method21742(class7097, class7098, ItemStack.field34174);
    }
    
    public static void method11838(final Class7096 class7096, final Class1847 class7097, final BlockPos class7098, final Class436 class7099, final Entity class7100, final ItemStack class7101) {
        if (class7097 instanceof Class1849) {
            method11835(class7096, (Class1849)class7097, class7098, class7099, class7100, class7101).forEach(class7104 -> method11839(class7102, class7103, class7104));
        }
        class7096.method21742(class7097, class7098, class7101);
    }
    
    public static void method11839(final Class1847 class1847, final BlockPos class1848, final ItemStack class1849) {
        if (!class1847.field10067) {
            if (!class1849.method27620()) {
                if (class1847.method6765().method31216(Class8878.field37320)) {
                    final Class427 class1850 = new Class427(class1847, class1848.getX() + (class1847.field10062.nextFloat() * 0.5f + 0.25), class1848.getY() + (class1847.field10062.nextFloat() * 0.5f + 0.25), class1848.getZ() + (class1847.field10062.nextFloat() * 0.5f + 0.25), class1849);
                    class1850.method2114();
                    class1847.method6886(class1850);
                }
            }
        }
    }
    
    public void method11840(final Class1847 class1847, final BlockPos class1848, int i) {
        if (!class1847.field10067) {
            if (class1847.method6765().method31216(Class8878.field37320)) {
                while (i > 0) {
                    final int method2609 = Class508.method2609(i);
                    i -= method2609;
                    class1847.method6886(new Class508(class1847, class1848.getX() + 0.5, class1848.getY() + 0.5, class1848.getZ() + 0.5, method2609));
                }
            }
        }
    }
    
    public float method11841() {
        return this.field17398;
    }
    
    public void method11842(final Class1847 class1847, final BlockPos class1848, final Class6154 class1849) {
    }
    
    @Deprecated
    public boolean method11843(final Class7096 class7096, final Class1852 class7097, final BlockPos class7098) {
        return true;
    }
    
    @Deprecated
    public Class2201 method11844(final Class7096 class7096, final Class1847 class7097, final BlockPos class7098, final Class512 class7099, final Class316 class7100, final Class7005 class7101) {
        return Class2201.field13402;
    }
    
    public void method11845(final Class1847 class1847, final BlockPos class1848, final Entity class1849) {
    }
    
    @Nullable
    public Class7096 method11846(final Class7074 class7074) {
        return this.method11878();
    }
    
    @Deprecated
    public void method11847(final Class7096 class7096, final Class1847 class7097, final BlockPos class7098, final Class512 class7099) {
    }
    
    @Deprecated
    public int method11848(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098, final Direction class7099) {
        return 0;
    }
    
    @Deprecated
    public boolean method11849(final Class7096 class7096) {
        return false;
    }
    
    @Deprecated
    public void method11850(final Class7096 class7096, final Class1847 class7097, final BlockPos class7098, final Entity class7099) {
    }
    
    @Deprecated
    public int method11851(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098, final Direction class7099) {
        return 0;
    }
    
    public void method11852(final Class1847 class1847, final Class512 class1848, final BlockPos class1849, final Class7096 class1850, final Class436 class1851, final ItemStack class1852) {
        class1848.method2859(Class8276.field33979.method8449(this));
        class1848.method2876(0.005f);
        method11838(class1850, class1847, class1849, class1851, class1848, class1852);
    }
    
    public void method11853(final Class1847 class1847, final BlockPos class1848, final Class7096 class1849, final Class511 class1850, final ItemStack class1851) {
    }
    
    public boolean method11854() {
        return !this.field17401.method26439() && !this.field17401.method26438();
    }
    
    public ITextComponent method11855() {
        return new Class2259(this.method11856(), new Object[0]);
    }
    
    public String method11856() {
        if (this.field17412 == null) {
            this.field17412 = Class8349.method27836("block", Class90.field208.method503(this));
        }
        return this.field17412;
    }
    
    @Deprecated
    public boolean method11857(final Class7096 class7096, final Class1847 class7097, final BlockPos class7098, final int n, final int n2) {
        return false;
    }
    
    @Deprecated
    public Class2117 method11858(final Class7096 class7096) {
        return this.field17401.method26445();
    }
    
    @Deprecated
    public float method11859(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098) {
        return class7096.method21762(class7097, class7098) ? 0.2f : 1.0f;
    }
    
    public void method11860(final Class1847 class1847, final BlockPos class1848, final Entity class1849, final float n) {
        class1849.method1705(n, 1.0f);
    }
    
    public void method11861(final Class1855 class1855, final Entity class1856) {
        class1856.method1936(class1856.method1935().mul(1.0, 0.0, 1.0));
    }
    
    public ItemStack method11862(final Class1855 class1855, final BlockPos class1856, final Class7096 class1857) {
        return new ItemStack(this);
    }
    
    public void method11863(final Class7207 class7207, final Class2265<ItemStack> class7208) {
        class7208.add(new ItemStack(this));
    }
    
    @Deprecated
    public Class7099 method11864(final Class7096 class7096) {
        return Class7558.field29974.method22148();
    }
    
    public float method11865() {
        return this.field17403;
    }
    
    public float method11866() {
        return this.field17404;
    }
    
    public float method11867() {
        return this.field17405;
    }
    
    @Deprecated
    public long method11868(final Class7096 class7096, final BlockPos class7097) {
        return MathHelper.method35688(class7097);
    }
    
    public void method11869(final Class1847 class1847, final Class7096 class1848, final Class7005 class1849, final Entity class1850) {
    }
    
    public void method11870(final Class1847 class1847, final BlockPos class1848, final Class7096 class1849, final Class512 class1850) {
        class1847.method6839(class1850, 2001, class1848, method11774(class1849));
    }
    
    public void method11871(final Class1847 class1847, final BlockPos class1848) {
    }
    
    public boolean method11872(final Class6154 class6154) {
        return true;
    }
    
    @Deprecated
    public boolean method11873(final Class7096 class7096) {
        return false;
    }
    
    @Deprecated
    public int method11874(final Class7096 class7096, final Class1847 class7097, final BlockPos class7098) {
        return 0;
    }
    
    public void method11875(final Class9500<Class3833, Class7096> class9500) {
    }
    
    public Class9104<Class3833, Class7096> method11876() {
        return this.field17406;
    }
    
    public final void method11877(final Class7096 field17407) {
        this.field17407 = field17407;
    }
    
    public final Class7096 method11878() {
        return this.field17407;
    }
    
    public Class2180 method11879() {
        return Class2180.field12913;
    }
    
    @Deprecated
    public Vec3d method11880(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098) {
        final Class2180 method11879 = this.method11879();
        if (method11879 != Class2180.field12913) {
            final long method11880 = MathHelper.method35689(class7098.getX(), 0, class7098.getZ());
            return new Vec3d(((method11880 & 0xFL) / 15.0f - 0.5) * 0.5, (method11879 != Class2180.field12915) ? 0.0 : (((method11880 >> 4 & 0xFL) / 15.0f - 1.0) * 0.2), ((method11880 >> 8 & 0xFL) / 15.0f - 0.5) * 0.5);
        }
        return Vec3d.ZERO;
    }
    
    public Class7696 method11881(final Class7096 class7096) {
        return this.field17400;
    }
    
    @Override
    public Class3820 method11704() {
        if (this.field17413 == null) {
            this.field17413 = Class3820.method11698(this);
        }
        return this.field17413;
    }
    
    public boolean method11882() {
        return this.field17409;
    }
    
    @Override
    public String toString() {
        return "Block{" + Class90.field208.method503(this) + "}";
    }
    
    public void method11883(final ItemStack class8321, final Class1855 class8322, final List<ITextComponent> list, final Class1981 class8323) {
    }
    
    static {
        field17390 = LogManager.getLogger();
        field17391 = new Class94<Class7096>();
        field17392 = new Direction[] { Direction.WEST, Direction.EAST, Direction.NORTH, Direction.SOUTH, Direction.DOWN, Direction.UP};
        field17393 = CacheBuilder.newBuilder().maximumSize(512L).weakKeys().build((CacheLoader)new Class6046());
        field17394 = Class7698.method24494(Class7698.method24487(), method11778(2.0, 0.0, 2.0, 14.0, 16.0, 14.0), Class9306.field39920);
        field17395 = method11778(7.0, 0.0, 7.0, 9.0, 10.0, 9.0);
        field17414 = ThreadLocal.withInitial(() -> {
            final Class2270 class2270 = new Class2270(2048, 0.25f);
            class2270.defaultReturnValue((byte)127);
            return class2270;
        });
    }
}
