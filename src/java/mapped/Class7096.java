// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.DynamicOps;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;
import com.google.common.collect.ImmutableMap;
import java.util.concurrent.atomic.AtomicInteger;

public class Class7096 extends Class7097<Class3833, Class7096> implements Class7098<Class7096>
{
    private Class8063 field27615;
    private final int field27616;
    private final boolean field27617;
    private int field27618;
    private int field27619;
    private Class1932 field27620;
    private int field27621;
    private static final AtomicInteger field27622;
    
    public int method21691() {
        if (this.field27618 < 0) {
            this.field27618 = Class90.field208.method504(this.method21696());
        }
        return this.field27618;
    }
    
    public int method21692() {
        if (this.field27619 < 0) {
            this.field27619 = Class6770.method20651(this);
            if (this.field27619 < 0) {
                Class8571.method28848("Metadata not found, block: " + this.method21693());
                this.field27619 = 0;
            }
        }
        return this.field27619;
    }
    
    public Class1932 method21693() {
        if (this.field27620 == null) {
            this.field27620 = Class90.field208.method503(this.method21696());
        }
        return this.field27620;
    }
    
    public int method21694() {
        if (this.field27621 < 0) {
            this.field27621 = Class7096.field27622.incrementAndGet();
        }
        return this.field27621;
    }
    
    public Class7096(final Class3833 class3833, final ImmutableMap<Class7111<?>, Comparable<?>> immutableMap) {
        super(class3833, immutableMap);
        this.field27618 = -1;
        this.field27619 = -1;
        this.field27621 = -1;
        this.field27616 = class3833.method11781(this);
        this.field27617 = class3833.method11820(this);
    }
    
    public void method21695() {
        if (!this.method21696().method11882()) {
            this.field27615 = new Class8063(this, null);
        }
    }
    
    public Class3833 method21696() {
        return (Class3833)this.field27624;
    }
    
    public Class8059 method21697() {
        return this.method21696().method11782(this);
    }
    
    public boolean method21698(final Class1855 class1855, final Class354 class1856, final Class7499<?> class1857) {
        return this.method21696().method11779(this, class1855, class1856, class1857);
    }
    
    public boolean method21699(final Class1855 class1855, final Class354 class1856) {
        return (this.field27615 == null) ? this.method21696().method11818(this, class1855, class1856) : Class8063.method26452(this.field27615);
    }
    
    public int method21700(final Class1855 class1855, final Class354 class1856) {
        return (this.field27615 == null) ? this.method21696().method11819(this, class1855, class1856) : Class8063.method26453(this.field27615);
    }
    
    public Class7702 method21701(final Class1855 class1855, final Class354 class1856, final Class179 class1857) {
        return (this.field27615 != null && Class8063.method26454(this.field27615) != null) ? Class8063.method26454(this.field27615)[class1857.ordinal()] : Class7698.method24503(this.method21729(class1855, class1856), class1857);
    }
    
    public boolean method21702() {
        return this.field27615 == null || Class8063.method26455(this.field27615);
    }
    
    public boolean method21703() {
        return this.field27617;
    }
    
    public int method21704() {
        final Class5719 class5719 = new Class5719(this);
        Class9463.method35173().method35188().method21097(class5719);
        if (!class5719.method16987()) {
            return this.field27616;
        }
        return 1;
    }
    
    public int method21705(final Class1855 class1855, final Class354 class1856) {
        return this.method21704();
    }
    
    public boolean method21706() {
        return this.method21696().method11780(this);
    }
    
    public Class8819 method21707(final Class1855 class1855, final Class354 class1856) {
        return this.method21696().method11783(this, class1855, class1856);
    }
    
    public Class7096 method21708(final Class2052 class2052) {
        return this.method21696().method11790(this, class2052);
    }
    
    public Class7096 method21709(final Class2181 class2181) {
        return this.method21696().method11791(this, class2181);
    }
    
    public Class2115 method21710() {
        return this.method21696().method11797(this);
    }
    
    public boolean method21711() {
        return this.method21696().method11804(this);
    }
    
    public float method21712(final Class1855 class1855, final Class354 class1856) {
        return this.method21696().method11859(this, class1855, class1856);
    }
    
    public boolean method21713(final Class1855 class1855, final Class354 class1856) {
        return this.method21696().method11793(this, class1855, class1856);
    }
    
    public boolean method21714() {
        return this.method21696().method11849(this);
    }
    
    public int method21715(final Class1855 class1855, final Class354 class1856, final Class179 class1857) {
        return this.method21696().method11848(this, class1855, class1856, class1857);
    }
    
    public boolean method21716() {
        return this.method21696().method11873(this);
    }
    
    public int method21717(final Class1847 class1847, final Class354 class1848) {
        return this.method21696().method11874(this, class1847, class1848);
    }
    
    public float method21718(final Class1855 class1855, final Class354 class1856) {
        return this.method21696().method11800(this, class1855, class1856);
    }
    
    public float method21719(final Class512 class512, final Class1855 class513, final Class354 class514) {
        return this.method21696().method11830(this, class512, class513, class514);
    }
    
    public int method21720(final Class1855 class1855, final Class354 class1856, final Class179 class1857) {
        return this.method21696().method11851(this, class1855, class1856, class1857);
    }
    
    public Class2117 method21721() {
        return this.method21696().method11858(this);
    }
    
    public boolean method21722(final Class1855 class1855, final Class354 class1856) {
        return (this.field27615 == null) ? this.method21696().method11817(this, class1855, class1856) : Class8063.method26456(this.field27615);
    }
    
    public boolean method21723() {
        return (this.field27615 == null) ? this.method21696().method11806(this) : Class8063.method26457(this.field27615);
    }
    
    public boolean method21724(final Class7096 class7096, final Class179 class7097) {
        return this.method21696().method11807(this, class7096, class7097);
    }
    
    public Class7702 method21725(final Class1855 class1855, final Class354 class1856) {
        return this.method21726(class1855, class1856, Class7543.method23629());
    }
    
    public Class7702 method21726(final Class1855 class1855, final Class354 class1856, final Class7543 class1857) {
        return this.method21696().method11808(this, class1855, class1856, class1857);
    }
    
    public Class7702 method21727(final Class1855 class1855, final Class354 class1856) {
        return (this.field27615 == null) ? this.method21728(class1855, class1856, Class7543.method23629()) : Class8063.method26458(this.field27615);
    }
    
    public Class7702 method21728(final Class1855 class1855, final Class354 class1856, final Class7543 class1857) {
        return this.method21696().method11809(this, class1855, class1856, class1857);
    }
    
    public Class7702 method21729(final Class1855 class1855, final Class354 class1856) {
        return this.method21696().method11810(this, class1855, class1856);
    }
    
    public Class7702 method21730(final Class1855 class1855, final Class354 class1856) {
        return this.method21696().method11811(this, class1855, class1856);
    }
    
    public final boolean method21731(final Class1855 class1855, final Class354 class1856, final Class399 class1857) {
        return Class3833.method11815(this.method21728(class1855, class1856, Class7543.method23630(class1857)), Class179.field512);
    }
    
    public Class5487 method21732(final Class1855 class1855, final Class354 class1856) {
        return this.method21696().method11880(this, class1855, class1856);
    }
    
    public boolean method21733(final Class1847 class1847, final Class354 class1848, final int n, final int n2) {
        return this.method21696().method11857(this, class1847, class1848, n, n2);
    }
    
    public void method21734(final Class1847 class1847, final Class354 class1848, final Class3833 class1849, final Class354 class1850, final boolean b) {
        this.method21696().method11825(this, class1847, class1848, class1849, class1850, b);
    }
    
    public void method21735(final Class1851 class1851, final Class354 class1852, final int n) {
        this.method21696().method11784(this, class1851, class1852, n);
    }
    
    public void method21736(final Class1851 class1851, final Class354 class1852, final int n) {
        this.method21696().method11788(this, class1851, class1852, n);
    }
    
    public void method21737(final Class1847 class1847, final Class354 class1848, final Class7096 class1849, final boolean b) {
        this.method21696().method11828(this, class1847, class1848, class1849, b);
    }
    
    public void method21738(final Class1847 class1847, final Class354 class1848, final Class7096 class1849, final boolean b) {
        this.method21696().method11829(this, class1847, class1848, class1849, b);
    }
    
    public void method21739(final Class1849 class1849, final Class354 class1850, final Random random) {
        this.method21696().method11822(this, class1849, class1850, random);
    }
    
    public void method21740(final Class1849 class1849, final Class354 class1850, final Random random) {
        this.method21696().method11821(this, class1849, class1850, random);
    }
    
    public void method21741(final Class1847 class1847, final Class354 class1848, final Class399 class1849) {
        this.method21696().method11850(this, class1847, class1848, class1849);
    }
    
    public void method21742(final Class1847 class1847, final Class354 class1848, final Class8321 class1849) {
        this.method21696().method11831(this, class1847, class1848, class1849);
    }
    
    public List<Class8321> method21743(final Class9098 class9098) {
        return this.method21696().method11833(this, class9098);
    }
    
    public Class2201 method21744(final Class1847 class1847, final Class512 class1848, final Class316 class1849, final Class7005 class1850) {
        return this.method21696().method11844(this, class1847, class1850.method21447(), class1848, class1849, class1850);
    }
    
    public void method21745(final Class1847 class1847, final Class354 class1848, final Class512 class1849) {
        this.method21696().method11847(this, class1847, class1848, class1849);
    }
    
    public boolean method21746(final Class1855 class1855, final Class354 class1856) {
        return this.method21696().method11794(this, class1855, class1856);
    }
    
    public boolean method21747(final Class1855 class1855, final Class354 class1856) {
        return this.method21696().method11795(this, class1855, class1856);
    }
    
    public Class7096 method21748(final Class179 class179, final Class7096 class180, final Class1851 class181, final Class354 class182, final Class354 class183) {
        return this.method21696().method11789(this, class179, class180, class181, class182, class183);
    }
    
    public boolean method21749(final Class1855 class1855, final Class354 class1856, final Class2084 class1857) {
        return this.method21696().method11796(this, class1855, class1856, class1857);
    }
    
    public boolean method21750(final Class7074 class7074) {
        return this.method21696().method11798(this, class7074);
    }
    
    public boolean method21751(final Class7255 class7255) {
        return this.method21696().method11799(this, class7255);
    }
    
    public boolean method21752(final Class1852 class1852, final Class354 class1853) {
        return this.method21696().method11843(this, class1852, class1853);
    }
    
    public boolean method21753(final Class1855 class1855, final Class354 class1856) {
        return this.method21696().method11803(this, class1855, class1856);
    }
    
    @Nullable
    public Class434 method21754(final Class1847 class1847, final Class354 class1848) {
        return this.method21696().method11827(this, class1847, class1848);
    }
    
    public boolean method21755(final Class7909<Class3833> class7909) {
        return this.method21696().method11785(class7909);
    }
    
    public Class7099 method21756() {
        return this.method21696().method11864(this);
    }
    
    public boolean method21757() {
        return this.method21696().method11801(this);
    }
    
    public long method21758(final Class354 class354) {
        return this.method21696().method11868(this, class354);
    }
    
    public Class7696 method21759() {
        return this.method21696().method11881(this);
    }
    
    public void method21760(final Class1847 class1847, final Class7096 class1848, final Class7005 class1849, final Class399 class1850) {
        this.method21696().method11869(class1847, class1848, class1849, class1850);
    }
    
    public boolean method21761(final Class1855 class1855, final Class354 class1856, final Class179 class1857) {
        return (this.field27615 == null) ? Class3833.method11814(this, class1855, class1856, class1857) : Class8063.method26459(this.field27615)[class1857.ordinal()];
    }
    
    public boolean method21762(final Class1855 class1855, final Class354 class1856) {
        return (this.field27615 == null) ? Class3833.method11816(this.method21727(class1855, class1856)) : Class8063.method26460(this.field27615);
    }
    
    public static <T> Dynamic<T> method21763(final DynamicOps<T> dynamicOps, final Class7096 class7096) {
        final ImmutableMap<Class7111<?>, Comparable<?>> method21776 = class7096.method21776();
        Object o;
        if (!method21776.isEmpty()) {
            o = dynamicOps.createMap((Map)ImmutableMap.of(dynamicOps.createString("Name"), dynamicOps.createString(Class90.field208.method503(class7096.method21696()).toString()), dynamicOps.createString("Properties"), dynamicOps.createMap((Map)method21776.entrySet().stream().map(entry -> Pair.of(dynamicOps2.createString(entry.getKey().method21826()), dynamicOps2.createString(Class7098.method21777((Class7111<Comparable>)entry.getKey(), (Comparable<?>)entry.getValue())))).collect(Collectors.toMap((Function<? super Object, ?>)Pair::getFirst, (Function<? super Object, ?>)Pair::getSecond)))));
        }
        else {
            o = dynamicOps.createMap((Map)ImmutableMap.of(dynamicOps.createString("Name"), dynamicOps.createString(Class90.field208.method503(class7096.method21696()).toString())));
        }
        return (Dynamic<T>)new Dynamic((DynamicOps)dynamicOps, o);
    }
    
    public static <T> Class7096 method21764(final Dynamic<T> dynamic) {
        final Class3833 class3833 = Class90.field208.method505(new Class1932(dynamic.getElement("Name").flatMap(dynamic.getOps()::getStringValue).orElse("minecraft:air")));
        final Map map = dynamic.get("Properties").asMap(dynamic2 -> dynamic2.asString(""), dynamic3 -> dynamic3.asString(""));
        Class7096 method11878 = class3833.method11878();
        final Class9104<Class3833, Class7096> method11879 = class3833.method11876();
        for (final Map.Entry<String, V> entry : map.entrySet()) {
            final String s = entry.getKey();
            final Class7111 method11880 = method11879.method32906(s);
            if (method11880 == null) {
                continue;
            }
            method11878 = Class7098.method21778(method11878, method11880, s, dynamic.toString(), (String)entry.getValue());
        }
        return method11878;
    }
    
    static {
        field27622 = new AtomicInteger(0);
    }
}
