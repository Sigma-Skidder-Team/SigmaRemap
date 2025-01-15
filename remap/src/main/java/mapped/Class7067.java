// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;
import org.apache.logging.log4j.LogManager;
import com.google.common.base.Splitter;

import java.util.function.Function;
import java.util.stream.Collectors;
import com.mojang.datafixers.util.Pair;
import java.util.stream.Stream;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.DynamicOps;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Iterator;
import javax.annotation.Nullable;
import com.google.common.collect.Maps;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.Logger;

public class Class7067 extends Class7065
{
    private static final Logger field27497;
    private static final Class8530<?, ?> field27498;
    private static final Class8530<?, ?> field27499;
    private static final Class8530<?, ?> field27500;
    private static final Class8530<?, ?> field27501;
    private static final Class8530<?, ?> field27502;
    private static final Class8530<?, ?> field27503;
    private static final Class8530<?, ?> field27504;
    private static final Class8530<?, ?> field27505;
    private static final Class8530<?, ?> field27506;
    private static final Class8530<?, ?> field27507;
    private static final Class8530<?, ?> field27508;
    private static final Class8530<?, ?> field27509;
    private static final Class8530<?, ?> field27510;
    private static final Class8530<?, ?> field27511;
    private static final Class8530<?, ?> field27512;
    private static final Class8530<?, ?> field27513;
    public static final Map<Class8530<?, ?>, Class2108> field27514;
    public static final Map<String, Class8530<?, ?>[]> field27515;
    public static final Map<Class8530<?, ?>, Class5113> field27516;
    private final List<Class9127> field27517;
    private final Map<String, Map<String, String>> field27518;
    private Class3090 field27519;
    private final Class7096[] field27520;
    private boolean field27521;
    private int field27522;
    
    public Class7067() {
        this.field27517 = Lists.newArrayList();
        this.field27518 = Maps.newHashMap();
        this.field27520 = new Class7096[256];
    }
    
    @Nullable
    public static Class3833 method21586(final String s) {
        try {
            return Class90.field208.method506(new Class1932(s)).orElse(null);
        }
        catch (final IllegalArgumentException ex) {
            Class7067.field27497.warn("Invalid blockstate: {}", (Object)s, (Object)ex);
            return null;
        }
    }
    
    public Class3090 method21587() {
        return this.field27519;
    }
    
    public void method21588(final Class3090 field27519) {
        this.field27519 = field27519;
    }
    
    public Map<String, Map<String, String>> method21589() {
        return this.field27518;
    }
    
    public List<Class9127> method21590() {
        return this.field27517;
    }
    
    public void method21591() {
        int n = 0;
        for (final Class9127 class9127 : this.field27517) {
            class9127.method33117(n);
            n += class9127.method33114();
        }
        this.field27522 = 0;
        this.field27521 = true;
        int n2 = 0;
        for (final Class9127 class9128 : this.field27517) {
            for (int i = class9128.method33116(); i < class9128.method33116() + class9128.method33114(); ++i) {
                final Class7096 method33115 = class9128.method33115();
                if (method33115.method21696() != Class7521.field29147) {
                    this.field27521 = false;
                    this.field27520[i] = method33115;
                }
            }
            if (class9128.method33115().method21696() != Class7521.field29147) {
                this.field27522 += class9128.method33114() + n2;
                n2 = 0;
            }
            else {
                n2 += class9128.method33114();
            }
        }
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.field27517.size(); ++i) {
            if (i > 0) {
                sb.append(",");
            }
            sb.append(this.field27517.get(i));
        }
        sb.append(";");
        sb.append(Class90.field217.method503(this.field27519));
        sb.append(";");
        if (!this.field27518.isEmpty()) {
            int n = 0;
            for (final Map.Entry<String, V> entry : this.field27518.entrySet()) {
                if (n++ > 0) {
                    sb.append(",");
                }
                sb.append(entry.getKey().toLowerCase(Locale.ROOT));
                final Map map = (Map)entry.getValue();
                if (map.isEmpty()) {
                    continue;
                }
                sb.append("(");
                int n2 = 0;
                for (final Map.Entry<String, V> entry2 : map.entrySet()) {
                    if (n2++ > 0) {
                        sb.append(" ");
                    }
                    sb.append(entry2.getKey());
                    sb.append("=");
                    sb.append((String)entry2.getValue());
                }
                sb.append(")");
            }
        }
        return sb.toString();
    }
    
    @Nullable
    private static Class9127 method21592(final String s, final int n) {
        final String[] split = s.split("\\*", 2);
        int max = 0;
        Label_0057: {
            if (split.length == 2) {
                try {
                    max = Math.max(Integer.parseInt(split[0]), 0);
                    break Label_0057;
                }
                catch (final NumberFormatException ex) {
                    Class7067.field27497.error("Error while parsing flat world string => {}", (Object)ex.getMessage());
                    return null;
                }
            }
            max = 1;
        }
        final int n2 = Math.min(n + max, 256) - n;
        Class3833 method21586;
        try {
            method21586 = method21586(split[split.length - 1]);
        }
        catch (final Exception ex2) {
            Class7067.field27497.error("Error while parsing flat world string => {}", (Object)ex2.getMessage());
            return null;
        }
        if (method21586 == null) {
            Class7067.field27497.error("Error while parsing flat world string => Unknown block, {}", (Object)split[split.length - 1]);
            return null;
        }
        final Class9127 class9127 = new Class9127(n2, method21586);
        class9127.method33117(n);
        return class9127;
    }
    
    private static List<Class9127> method21593(final String s) {
        final ArrayList arrayList = Lists.newArrayList();
        final String[] split = s.split(",");
        int n = 0;
        final String[] array = split;
        for (int length = array.length, i = 0; i < length; ++i) {
            final Class9127 method21592 = method21592(array[i], n);
            if (method21592 == null) {
                return Collections.emptyList();
            }
            arrayList.add(method21592);
            n += method21592.method33114();
        }
        return arrayList;
    }
    
    public <T> Dynamic<T> method21594(final DynamicOps<T> dynamicOps) {
        return (Dynamic<T>)new Dynamic((DynamicOps)dynamicOps, dynamicOps.createMap((Map)ImmutableMap.of(dynamicOps.createString("layers"), dynamicOps.createList((Stream)this.field27517.stream().map(class9127 -> dynamicOps2.createMap((Map)ImmutableMap.of(dynamicOps2.createString("height"), dynamicOps2.createInt(class9127.method33114()), dynamicOps2.createString("block"), dynamicOps2.createString(Class90.field208.method503(class9127.method33115().method21696()).toString()))))), dynamicOps.createString("biome"), dynamicOps.createString(Class90.field217.method503(this.field27519).toString()), dynamicOps.createString("structures"), dynamicOps.createMap((Map)this.field27518.entrySet().stream().map(entry -> Pair.of(dynamicOps3.createString(entry.getKey().toLowerCase(Locale.ROOT)), dynamicOps3.createMap((Map)((Map)entry.getValue()).entrySet().stream().map(entry2 -> Pair.of(dynamicOps4.createString((String)entry2.getKey()), dynamicOps4.createString((String)entry2.getValue()))).collect(Collectors.toMap((Function<? super Object, ?>)Pair::getFirst, (Function<? super Object, ?>)Pair::getSecond))))).collect(Collectors.toMap((Function<? super Object, ?>)Pair::getFirst, (Function<? super Object, ?>)Pair::getSecond))))));
    }
    
    public static Class7067 method21595(final Dynamic<?> dynamic) {
        final Class7067 class7067 = Class8705.field36578.method29874();
        final List list = dynamic.get("layers").asList(dynamic2 -> Pair.of((Object)dynamic2.get("height").asInt(1), (Object)method21586(dynamic2.get("block").asString(""))));
        if (list.stream().anyMatch(pair -> pair.getSecond() == null)) {
            return method21599();
        }
        final List list2 = (List)list.stream().map(pair2 -> new Class9127((int)pair2.getFirst(), (Class3833)pair2.getSecond())).collect(Collectors.toList());
        if (!list2.isEmpty()) {
            class7067.method21590().addAll(list2);
            class7067.method21591();
            class7067.method21588(Class90.field217.method505(new Class1932(dynamic.get("biome").asString(""))));
            dynamic.get("structures").flatMap((Function)Dynamic::getMapValues).ifPresent(map -> map.keySet().forEach(dynamic3 -> dynamic3.asString().map(s -> class7068.method21589().put(s, Maps.newHashMap()))));
            return class7067;
        }
        return method21599();
    }
    
    public static Class7067 method21596(final String s) {
        final Iterator iterator = Splitter.on(';').split((CharSequence)s).iterator();
        if (!iterator.hasNext()) {
            return method21599();
        }
        final Class7067 class7067 = Class8705.field36578.method29874();
        final List<Class9127> method21593 = method21593((String)iterator.next());
        if (method21593.isEmpty()) {
            return method21599();
        }
        class7067.method21590().addAll(method21593);
        class7067.method21591();
        Class3090 field27633 = Class7102.field27633;
        if (iterator.hasNext()) {
            try {
                field27633 = Class90.field217.method506(new Class1932((String)iterator.next())).orElseThrow(() -> {
                    new IllegalArgumentException("Invalid Biome: " + obj);
                    return;
                });
            }
            catch (final Exception ex) {
                Class7067.field27497.error("Error while parsing flat world string => {}", (Object)ex.getMessage());
            }
        }
        class7067.method21588(field27633);
        if (iterator.hasNext()) {
            final String[] split = ((String)iterator.next()).toLowerCase(Locale.ROOT).split(",");
            for (int length = split.length, i = 0; i < length; ++i) {
                final String[] split2 = split[i].split("\\(", 2);
                if (!split2[0].isEmpty()) {
                    class7067.method21597(split2[0]);
                    if (split2.length > 1 && split2[1].endsWith(")") && split2[1].length() > 1) {
                        final String[] split3 = split2[1].substring(0, split2[1].length() - 1).split(" ");
                        for (int length2 = split3.length, j = 0; j < length2; ++j) {
                            final String[] split4 = split3[j].split("=", 2);
                            if (split4.length == 2) {
                                class7067.method21598(split2[0], split4[0], split4[1]);
                            }
                        }
                    }
                }
            }
        }
        else {
            class7067.method21589().put("village", Maps.newHashMap());
        }
        return class7067;
    }
    
    private void method21597(final String s) {
        this.field27518.put(s, Maps.newHashMap());
    }
    
    private void method21598(final String s, final String anObject, final String s2) {
        this.field27518.get(s).put(anObject, s2);
        if ("village".equals(s)) {
            if ("distance".equals(anObject)) {
                this.field27477 = MathHelper.method35676(s2, this.field27477, 9);
            }
        }
        if ("biome_1".equals(s)) {
            if ("distance".equals(anObject)) {
                this.field27484 = MathHelper.method35676(s2, this.field27484, 9);
            }
        }
        if ("stronghold".equals(s)) {
            if (!"distance".equals(anObject)) {
                if (!"count".equals(anObject)) {
                    if ("spread".equals(anObject)) {
                        this.field27483 = MathHelper.method35676(s2, this.field27483, 1);
                    }
                }
                else {
                    this.field27482 = MathHelper.method35676(s2, this.field27482, 1);
                }
            }
            else {
                this.field27481 = MathHelper.method35676(s2, this.field27481, 1);
            }
        }
        if ("oceanmonument".equals(s)) {
            if (!"separation".equals(anObject)) {
                if ("spacing".equals(anObject)) {
                    this.field27479 = MathHelper.method35676(s2, this.field27479, 1);
                }
            }
            else {
                this.field27480 = MathHelper.method35676(s2, this.field27480, 1);
            }
        }
        if ("endcity".equals(s)) {
            if ("distance".equals(anObject)) {
                this.field27488 = MathHelper.method35676(s2, this.field27488, 1);
            }
        }
        if ("mansion".equals(s)) {
            if ("distance".equals(anObject)) {
                this.field27492 = MathHelper.method35676(s2, this.field27492, 1);
            }
        }
    }
    
    public static Class7067 method21599() {
        final Class7067 class7067 = Class8705.field36578.method29874();
        class7067.method21588(Class7102.field27633);
        class7067.method21590().add(new Class9127(1, Class7521.field29172));
        class7067.method21590().add(new Class9127(2, Class7521.field29156));
        class7067.method21590().add(new Class9127(1, Class7521.field29155));
        class7067.method21591();
        class7067.method21589().put("village", Maps.newHashMap());
        return class7067;
    }
    
    public boolean method21600() {
        return this.field27521;
    }
    
    public Class7096[] method21601() {
        return this.field27520;
    }
    
    public void method21602(final int n) {
        this.field27520[n] = null;
    }
    
    static {
        field27497 = LogManager.getLogger();
        field27498 = Class4535.field19959.method13527(new Class5132(0.004, Class1964.field10718)).method28610(Class7133.field27782.method21889(Class6926.field27145));
        field27499 = Class4535.field19972.method13527(new Class5115(Class7067.\u7b2e\ub168\u69a4\u9e09\u56a5\ud7eb[29], 6)).method28610(Class7133.field27782.method21889(Class6926.field27145));
        field27500 = Class4535.field19966.method13527(Class5113.field22059).method28610(Class7133.field27782.method21889(Class6926.field27145));
        field27501 = Class4535.field19965.method13527(Class5113.field22059).method28610(Class7133.field27782.method21889(Class6926.field27145));
        field27502 = Class4535.field19962.method13527(Class5113.field22059).method28610(Class7133.field27782.method21889(Class6926.field27145));
        field27503 = Class4535.field19961.method13527(Class5113.field22059).method28610(Class7133.field27782.method21889(Class6926.field27145));
        field27504 = Class4535.field19963.method13527(Class5113.field22059).method28610(Class7133.field27782.method21889(Class6926.field27145));
        field27505 = Class4535.field19964.method13527(new Class5125(false)).method28610(Class7133.field27782.method21889(Class6926.field27145));
        field27506 = Class4535.field19967.method13527(Class5113.field22059).method28610(Class7133.field27782.method21889(Class6926.field27145));
        field27507 = Class4535.field20002.method13527(new Class5141(Class7521.field29173.method11878())).method28610(Class7133.field27812.method21889((Object)new Class6928(4)));
        field27508 = Class4535.field20002.method13527(new Class5141(Class7521.field29174.method11878())).method28610(Class7133.field27811.method21889((Object)new Class6928(80)));
        field27509 = Class4535.field19970.method13527(Class5113.field22059).method28610(Class7133.field27782.method21889(Class6926.field27145));
        field27510 = Class4535.field19960.method13527(Class5113.field22059).method28610(Class7133.field27782.method21889(Class6926.field27145));
        field27511 = Class4535.field19969.method13527(Class5113.field22059).method28610(Class7133.field27782.method21889(Class6926.field27145));
        field27512 = Class4535.field19968.method13527(new Class5130(Class1957.field10667, 0.3f, 0.1f)).method28610(Class7133.field27782.method21889(Class6926.field27145));
        field27513 = Class4535.field19958.method13527(Class5113.field22059).method28610(Class7133.field27782.method21889(Class6926.field27145));
        field27514 = Class8349.method27851(Maps.newHashMap(), hashMap -> {
            hashMap.put(Class7067.field27498, Class2108.field12224);
            hashMap.put(Class7067.field27499, Class2108.field12225);
            hashMap.put(Class7067.field27500, Class2108.field12224);
            hashMap.put(Class7067.field27501, Class2108.field12225);
            hashMap.put(Class7067.field27502, Class2108.field12225);
            hashMap.put(Class7067.field27503, Class2108.field12225);
            hashMap.put(Class7067.field27504, Class2108.field12225);
            hashMap.put(Class7067.field27505, Class2108.field12225);
            hashMap.put(Class7067.field27512, Class2108.field12225);
            hashMap.put(Class7067.field27507, Class2108.field12223);
            hashMap.put(Class7067.field27508, Class2108.field12223);
            hashMap.put(Class7067.field27509, Class2108.field12225);
            hashMap.put(Class7067.field27510, Class2108.field12225);
            hashMap.put(Class7067.field27511, Class2108.field12224);
            hashMap.put(Class7067.field27506, Class2108.field12225);
            hashMap.put(Class7067.field27513, Class2108.field12225);
            return;
        });
        field27515 = Class8349.method27851(Maps.newHashMap(), hashMap2 -> {
            hashMap2.put("mineshaft", new Class8530[] { Class7067.field27498 });
            hashMap2.put("village", new Class8530[] { Class7067.field27499 });
            hashMap2.put("stronghold", new Class8530[] { Class7067.field27500 });
            hashMap2.put("biome_1", new Class8530[] { Class7067.field27501, Class7067.field27502, Class7067.field27503, Class7067.field27504, Class7067.field27512, Class7067.field27505 });
            hashMap2.put("oceanmonument", new Class8530[] { Class7067.field27506 });
            hashMap2.put("lake", new Class8530[] { Class7067.field27507 });
            hashMap2.put("lava_lake", new Class8530[] { Class7067.field27508 });
            hashMap2.put("endcity", new Class8530[] { Class7067.field27509 });
            hashMap2.put("mansion", new Class8530[] { Class7067.field27510 });
            hashMap2.put("fortress", new Class8530[] { Class7067.field27511 });
            hashMap2.put("pillager_outpost", new Class8530[] { Class7067.field27513 });
            return;
        });
        field27516 = Class8349.method27851(Maps.newHashMap(), hashMap3 -> {
            hashMap3.put(Class7067.field27498, new Class5132(0.004, Class1964.field10718));
            hashMap3.put(Class7067.field27499, new Class5115("village/plains/town_centers", 6));
            hashMap3.put(Class7067.field27500, Class5113.field22059);
            hashMap3.put(Class7067.field27501, Class5113.field22059);
            hashMap3.put(Class7067.field27502, Class5113.field22059);
            hashMap3.put(Class7067.field27503, Class5113.field22059);
            hashMap3.put(Class7067.field27504, Class5113.field22059);
            hashMap3.put(Class7067.field27512, new Class5130(Class1957.field10667, 0.3f, 0.9f));
            hashMap3.put(Class7067.field27505, new Class5125(false));
            hashMap3.put(Class7067.field27506, Class5113.field22059);
            hashMap3.put(Class7067.field27509, Class5113.field22059);
            hashMap3.put(Class7067.field27510, Class5113.field22059);
            hashMap3.put(Class7067.field27511, Class5113.field22059);
            hashMap3.put(Class7067.field27513, Class5113.field22059);
        });
    }
}
