// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.stream.Stream;
import java.util.Arrays;
import javax.annotation.Nullable;
import it.unimi.dsi.fastutil.ints.IntListIterator;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.Map;
import it.unimi.dsi.fastutil.ints.Int2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import com.mojang.datafixers.Dynamic;

public final class Class9186
{
    private int field38923;
    private final Class9401[] field38924;
    private final Dynamic<?> field38925;
    private final int field38926;
    private final int field38927;
    private final Int2ObjectMap<Dynamic<?>> field38928;
    
    public Class9186(final Dynamic<?> field38925) {
        this.field38924 = new Class9401[16];
        this.field38928 = (Int2ObjectMap<Dynamic<?>>)new Int2ObjectLinkedOpenHashMap(16);
        this.field38925 = field38925;
        this.field38926 = field38925.get("xPos").asInt(0) << 4;
        this.field38927 = field38925.get("zPos").asInt(0) << 4;
        field38925.get("TileEntities").asStreamOpt().ifPresent(stream -> stream.forEach(dynamic -> {
            final int j = dynamic.get("x").asInt(0) - this.field38926 & 0xF;
            dynamic.get("y").asInt(0);
            final int k = dynamic.get("z").asInt(0) - this.field38927 & 0xF;
            final int l;
            if (this.field38928.put(l << 8 | k << 4 | j, (Object)dynamic) != null) {
                Class9251.method34140().warn("In chunk: {}x{} found a duplicate block entity at position: [{}, {}, {}]", (Object)this.field38926, (Object)this.field38927, (Object)j, (Object)l, (Object)k);
            }
        }));
        final boolean boolean1 = field38925.get("convertedFromAlphaFormat").asBoolean(false);
        field38925.get("Sections").asStreamOpt().ifPresent(stream2 -> stream2.forEach(dynamic2 -> {
            final Class9401 class9402 = new Class9401(dynamic2);
            this.field38923 = class9402.method34936(this.field38923);
            this.field38924[class9402.field40336] = class9402;
        }));
        for (final Class9401 class9401 : this.field38924) {
            if (class9401 != null) {
                for (final Map.Entry<Integer, V> entry : Class9401.method34941(class9401).entrySet()) {
                    final int n = class9401.field40336 << 12;
                    switch (entry.getKey()) {
                        case 2: {
                            final IntListIterator iterator2 = ((IntList)entry.getValue()).iterator();
                            while (iterator2.hasNext()) {
                                final int n2 = iterator2.next() | n;
                                if ("minecraft:grass_block".equals(Class9251.method34109(this.method33586(n2)))) {
                                    final String method34109 = Class9251.method34109(this.method33586(method33583(n2, Class2109.field12234)));
                                    if (!"minecraft:snow".equals(method34109) && !"minecraft:snow_layer".equals(method34109)) {
                                        continue;
                                    }
                                    this.method33584(n2, (Dynamic<?>)Class9251.method34124());
                                }
                            }
                            continue;
                        }
                        case 3: {
                            final IntListIterator iterator3 = ((IntList)entry.getValue()).iterator();
                            while (iterator3.hasNext()) {
                                final int n3 = iterator3.next() | n;
                                if ("minecraft:podzol".equals(Class9251.method34109(this.method33586(n3)))) {
                                    final String method34110 = Class9251.method34109(this.method33586(method33583(n3, Class2109.field12234)));
                                    if (!"minecraft:snow".equals(method34110) && !"minecraft:snow_layer".equals(method34110)) {
                                        continue;
                                    }
                                    this.method33584(n3, (Dynamic<?>)Class9251.method34125());
                                }
                            }
                            continue;
                        }
                        case 25: {
                            final IntListIterator iterator4 = ((IntList)entry.getValue()).iterator();
                            while (iterator4.hasNext()) {
                                final int n4 = iterator4.next() | n;
                                final Dynamic<?> method34111 = this.method33582(n4);
                                if (method34111 != null) {
                                    this.method33584(n4, (Dynamic<?>)Class9251.method34126().getOrDefault(Boolean.toString(method34111.get("powered").asBoolean(false)) + (byte)Math.min(Math.max(method34111.get("note").asInt(0), 0), 24), Class9251.method34126().get("false0")));
                                }
                            }
                            continue;
                        }
                        case 26: {
                            final IntListIterator iterator5 = ((IntList)entry.getValue()).iterator();
                            while (iterator5.hasNext()) {
                                final int n5 = iterator5.next() | n;
                                final Dynamic<?> method34112 = this.method33581(n5);
                                final Dynamic<?> method34113 = this.method33586(n5);
                                if (method34112 != null) {
                                    final int int1 = method34112.get("color").asInt(0);
                                    if (int1 == 14 || int1 < 0 || int1 >= 16) {
                                        continue;
                                    }
                                    final String string = Class9251.method34110(method34113, "facing") + Class9251.method34110(method34113, "occupied") + Class9251.method34110(method34113, "part") + int1;
                                    if (!Class9251.method34127().containsKey(string)) {
                                        continue;
                                    }
                                    this.method33584(n5, (Dynamic<?>)Class9251.method34127().get(string));
                                }
                            }
                            continue;
                        }
                        case 64:
                        case 71:
                        case 193:
                        case 194:
                        case 195:
                        case 196:
                        case 197: {
                            final IntListIterator iterator6 = ((IntList)entry.getValue()).iterator();
                            while (iterator6.hasNext()) {
                                final int n6 = iterator6.next() | n;
                                if (Class9251.method34109(this.method33586(n6)).endsWith("_door")) {
                                    final Dynamic<?> method34114 = this.method33586(n6);
                                    if (!"lower".equals(Class9251.method34110(method34114, "half"))) {
                                        continue;
                                    }
                                    final int method34115 = method33583(n6, Class2109.field12234);
                                    final Dynamic<?> method34116 = this.method33586(method34115);
                                    final String method34117 = Class9251.method34109(method34114);
                                    if (!method34117.equals(Class9251.method34109(method34116))) {
                                        continue;
                                    }
                                    final String method34118 = Class9251.method34110(method34114, "facing");
                                    final String method34119 = Class9251.method34110(method34114, "open");
                                    final String s = boolean1 ? "left" : Class9251.method34110(method34116, "hinge");
                                    final String s2 = boolean1 ? "false" : Class9251.method34110(method34116, "powered");
                                    this.method33584(n6, (Dynamic<?>)Class9251.method34128().get(method34117 + method34118 + "lower" + s + method34119 + s2));
                                    this.method33584(method34115, (Dynamic<?>)Class9251.method34128().get(method34117 + method34118 + "upper" + s + method34119 + s2));
                                }
                            }
                            continue;
                        }
                        case 86: {
                            final IntListIterator iterator7 = ((IntList)entry.getValue()).iterator();
                            while (iterator7.hasNext()) {
                                final int n7 = iterator7.next() | n;
                                if ("minecraft:carved_pumpkin".equals(Class9251.method34109(this.method33586(n7)))) {
                                    final String method34120 = Class9251.method34109(this.method33586(method33583(n7, Class2109.field12233)));
                                    if (!"minecraft:grass_block".equals(method34120) && !"minecraft:dirt".equals(method34120)) {
                                        continue;
                                    }
                                    this.method33584(n7, (Dynamic<?>)Class9251.method34129());
                                }
                            }
                            continue;
                        }
                        case 110: {
                            final IntListIterator iterator8 = ((IntList)entry.getValue()).iterator();
                            while (iterator8.hasNext()) {
                                final int n8 = iterator8.next() | n;
                                if ("minecraft:mycelium".equals(Class9251.method34109(this.method33586(n8)))) {
                                    final String method34121 = Class9251.method34109(this.method33586(method33583(n8, Class2109.field12234)));
                                    if (!"minecraft:snow".equals(method34121) && !"minecraft:snow_layer".equals(method34121)) {
                                        continue;
                                    }
                                    this.method33584(n8, (Dynamic<?>)Class9251.method34130());
                                }
                            }
                            continue;
                        }
                        case 140: {
                            final IntListIterator iterator9 = ((IntList)entry.getValue()).iterator();
                            while (iterator9.hasNext()) {
                                final int n9 = iterator9.next() | n;
                                final Dynamic<?> method34122 = this.method33582(n9);
                                if (method34122 != null) {
                                    this.method33584(n9, (Dynamic<?>)Class9251.method34131().getOrDefault(method34122.get("Item").asString("") + method34122.get("Data").asInt(0), Class9251.method34131().get("minecraft:air0")));
                                }
                            }
                            continue;
                        }
                        case 144: {
                            final IntListIterator iterator10 = ((IntList)entry.getValue()).iterator();
                            while (iterator10.hasNext()) {
                                final int n10 = iterator10.next() | n;
                                final Dynamic<?> method34123 = this.method33581(n10);
                                if (method34123 != null) {
                                    final String value = String.valueOf(method34123.get("SkullType").asInt(0));
                                    final String method34124 = Class9251.method34110(this.method33586(n10), "facing");
                                    String key;
                                    if (!"up".equals(method34124) && !"down".equals(method34124)) {
                                        key = value + method34124;
                                    }
                                    else {
                                        key = value + method34123.get("Rot").asInt(0);
                                    }
                                    method34123.remove("SkullType");
                                    method34123.remove("facing");
                                    method34123.remove("Rot");
                                    this.method33584(n10, (Dynamic<?>)Class9251.method34132().getOrDefault(key, Class9251.method34132().get("0north")));
                                }
                            }
                            continue;
                        }
                        case 175: {
                            final IntListIterator iterator11 = ((IntList)entry.getValue()).iterator();
                            while (iterator11.hasNext()) {
                                final int n11 = iterator11.next() | n;
                                if ("upper".equals(Class9251.method34110(this.method33586(n11), "half"))) {
                                    final String method34125 = Class9251.method34109(this.method33586(method33583(n11, Class2109.field12233)));
                                    if ("minecraft:sunflower".equals(method34125)) {
                                        this.method33584(n11, (Dynamic<?>)Class9251.method34133());
                                    }
                                    else if ("minecraft:lilac".equals(method34125)) {
                                        this.method33584(n11, (Dynamic<?>)Class9251.method34134());
                                    }
                                    else if ("minecraft:tall_grass".equals(method34125)) {
                                        this.method33584(n11, (Dynamic<?>)Class9251.method34135());
                                    }
                                    else if ("minecraft:large_fern".equals(method34125)) {
                                        this.method33584(n11, (Dynamic<?>)Class9251.method34136());
                                    }
                                    else if ("minecraft:rose_bush".equals(method34125)) {
                                        this.method33584(n11, (Dynamic<?>)Class9251.method34137());
                                    }
                                    else {
                                        if (!"minecraft:peony".equals(method34125)) {
                                            continue;
                                        }
                                        this.method33584(n11, (Dynamic<?>)Class9251.method34138());
                                    }
                                }
                            }
                            continue;
                        }
                        case 176:
                        case 177: {
                            final IntListIterator iterator12 = ((IntList)entry.getValue()).iterator();
                            while (iterator12.hasNext()) {
                                final int n12 = (int)((Iterator)iterator12).next() | n;
                                final Dynamic<?> method34126 = this.method33581(n12);
                                final Dynamic<?> method34127 = this.method33586(n12);
                                if (method34126 != null) {
                                    final int int2 = method34126.get("Base").asInt(0);
                                    if (int2 == 15 || int2 < 0 || int2 >= 16) {
                                        continue;
                                    }
                                    final String string2 = Class9251.method34110(method34127, (entry.getKey() == 176) ? "rotation" : "facing") + "_" + int2;
                                    if (!Class9251.method34139().containsKey(string2)) {
                                        continue;
                                    }
                                    this.method33584(n12, (Dynamic<?>)Class9251.method34139().get(string2));
                                }
                            }
                            continue;
                        }
                    }
                }
            }
        }
    }
    
    @Nullable
    private Dynamic<?> method33581(final int n) {
        return this.field38928.get(n);
    }
    
    @Nullable
    private Dynamic<?> method33582(final int n) {
        return this.field38928.remove(n);
    }
    
    public static int method33583(final int n, final Class2109 class2109) {
        switch (Class9466.field40713[class2109.method8233().ordinal()]) {
            case 1: {
                final int n2 = (n & 0xF) + class2109.method8232().method8329();
                return (n2 >= 0 && n2 <= 15) ? ((n & 0xFFFFFFF0) | n2) : -1;
            }
            case 2: {
                final int n3 = (n >> 8) + class2109.method8232().method8329();
                return (n3 >= 0 && n3 <= 255) ? ((n & 0xFF) | n3 << 8) : -1;
            }
            case 3: {
                final int n4 = (n >> 4 & 0xF) + class2109.method8232().method8329();
                return (n4 >= 0 && n4 <= 15) ? ((n & 0xFFFFFF0F) | n4 << 4) : -1;
            }
            default: {
                return -1;
            }
        }
    }
    
    private void method33584(final int n, final Dynamic<?> dynamic) {
        if (n >= 0) {
            if (n <= 65535) {
                final Class9401 method33585 = this.method33585(n);
                if (method33585 != null) {
                    method33585.method34935(n & 0xFFF, dynamic);
                }
            }
        }
    }
    
    @Nullable
    private Class9401 method33585(final int n) {
        final int n2 = n >> 12;
        return (n2 >= this.field38924.length) ? null : this.field38924[n2];
    }
    
    public Dynamic<?> method33586(final int n) {
        if (n >= 0 && n <= 65535) {
            final Class9401 method33585 = this.method33585(n);
            return (method33585 != null) ? method33585.method34934(n & 0xFFF) : Class9251.method34121();
        }
        return (Dynamic<?>)Class9251.method34121();
    }
    
    public Dynamic<?> method33587() {
        final Dynamic<?> field38925 = this.field38925;
        Dynamic dynamic;
        if (!this.field38928.isEmpty()) {
            dynamic = field38925.set("TileEntities", field38925.createList(this.field38928.values().stream()));
        }
        else {
            dynamic = field38925.remove("TileEntities");
        }
        Dynamic dynamic2 = dynamic.emptyMap();
        Dynamic dynamic3 = dynamic.emptyList();
        for (final Class9401 class9401 : this.field38924) {
            if (class9401 != null) {
                dynamic3 = dynamic3.merge(class9401.method34938());
                dynamic2 = dynamic2.set(String.valueOf(class9401.field40336), dynamic2.createIntList(Arrays.stream(Class9401.method34942(class9401).toIntArray())));
            }
        }
        final Dynamic emptyMap = dynamic.emptyMap();
        return (Dynamic<?>)dynamic.set("UpgradeData", emptyMap.set("Sides", emptyMap.createByte((byte)this.field38923)).set("Indices", dynamic2)).set("Sections", dynamic3);
    }
}
