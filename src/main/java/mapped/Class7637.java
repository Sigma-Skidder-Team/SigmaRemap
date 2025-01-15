// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableMap;
import org.apache.logging.log4j.LogManager;
import java.util.stream.IntStream;
import java.util.HashSet;
import java.io.InputStream;
import com.google.common.collect.ImmutableList;
import java.util.function.Supplier;
import java.util.Collections;
import java.util.Optional;
import com.mojang.datafixers.util.Either;
import java.io.Reader;
import java.io.Closeable;
import org.apache.commons.io.IOUtils;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.io.StringReader;
import java.io.FileNotFoundException;
import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.LinkedHashSet;
import java.util.Iterator;
import java.util.stream.Stream;
import java.util.function.Function;
import java.util.Collection;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.io.IOException;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import com.mojang.datafixers.util.Pair;
import org.apache.commons.lang3.tuple.Triple;
import com.google.common.base.Splitter;
import java.util.Map;
import org.apache.logging.log4j.Logger;
import java.util.Set;
import java.util.List;

public class Class7637
{
    public static final Class3687 field30237;
    public static final Class3687 field30238;
    public static final Class3687 field30239;
    public static final Class3687 field30240;
    public static final Class3687 field30241;
    public static final Class3687 field30242;
    public static final Class3687 field30243;
    public static final Class3687 field30244;
    public static final List<Class1932> field30245;
    public static final List<Class1932> field30246;
    public static final List<Class6332> field30247;
    private static final Set<Class3687> field30248;
    private static final Logger field30249;
    public static final Class1933 field30250;
    private static final String field30251;
    public static final String field30252;
    private static final Map<String, String> field30253;
    private static final Splitter field30254;
    private static final Splitter field30255;
    public static final Class7685 field30256;
    public static final Class7685 field30257;
    private static final Class9104<Class3833, Class7096> field30258;
    private static final Class8163 field30259;
    private static final Map<Class1932, Class9104<Class3833, Class7096>> field30260;
    private final Class6582 field30261;
    private Class391 field30262;
    private final Class7860 field30263;
    private final Set<Class1932> field30264;
    private final Class9333 field30265;
    private final Map<Class1932, Class7684> field30266;
    private final Map<Triple<Class1932, Class9294, Boolean>, Class6313> field30267;
    private final Map<Class1932, Class7684> field30268;
    private final Map<Class1932, Class6313> field30269;
    private Map<Class1932, Pair<Class1774, Class9430>> field30270;
    private int field30271;
    private final Object2IntMap<Class7096> field30272;
    public Map<Class1932, Class7684> field30273;
    
    public Class7637(final Class6582 class6582, final Class7860 class6583, final Class5028 class6584, final int n) {
        this(class6582, class6583, true);
        this.method24010(class6584, n);
    }
    
    public Class7637(final Class6582 field30261, final Class7860 field30262, final boolean b) {
        this.field30264 = Sets.newHashSet();
        this.field30265 = new Class9333();
        this.field30266 = Maps.newHashMap();
        this.field30267 = Maps.newHashMap();
        this.field30268 = Maps.newHashMap();
        this.field30269 = Maps.newHashMap();
        this.field30271 = 1;
        this.field30272 = (Object2IntMap<Class7096>)Class8349.method27851((Object2IntMap)new Object2IntOpenHashMap(), object2IntOpenHashMap -> object2IntOpenHashMap.defaultReturnValue(-1));
        this.field30261 = field30261;
        this.field30263 = field30262;
    }
    
    public void method24010(final Class5028 class5028, final int n) {
        class5028.method15297("missing_model");
        try {
            this.field30266.put(Class7637.field30250, this.method24022(Class7637.field30250));
            this.method24018(Class7637.field30250);
        }
        catch (final IOException cause) {
            Class7637.field30249.error("Error loading missing model, should never happen :(", (Throwable)cause);
            throw new RuntimeException(cause);
        }
        class5028.method15300("static_definitions");
        Class7637.field30260.forEach((p0, class5030) -> class5030.method32902().forEach(class5032 -> this.method24018(Class9509.method35432(class5031, class5032))));
        class5028.method15300("blocks");
        final Iterator<Object> iterator = Class90.field208.iterator();
        while (iterator.hasNext()) {
            iterator.next().method11876().method32902().forEach(class5033 -> this.method24018(Class9509.method35431(class5033)));
        }
        class5028.method15300("items");
        final Iterator<Class1932> iterator2 = Class90.field211.method507().iterator();
        while (iterator2.hasNext()) {
            this.method24018(new Class1933(iterator2.next(), "inventory"));
        }
        class5028.method15300("special");
        this.method24018(new Class1933("minecraft:trident_in_hand#inventory"));
        final Iterator<Class1932> iterator3 = this.method24029().iterator();
        while (iterator3.hasNext()) {
            this.method24017(iterator3.next());
        }
        class5028.method15300("textures");
        this.field30273 = this.field30266;
        Class8969.method31828(this);
        final LinkedHashSet linkedHashSet = Sets.newLinkedHashSet();
        final Set<? super Object> set = this.field30268.values().stream().flatMap(class5034 -> class5034.method24382(this::method24014, set2).stream()).collect((Collector<? super Object, ?, Set<? super Object>>)Collectors.toSet());
        set.addAll(Class7637.field30248);
        Class9570.method35818(Class9570.field41289, set);
        linkedHashSet.stream().filter(pair -> !((String)pair.getSecond()).equals(Class7637.field30251)).forEach(pair2 -> Class7637.field30249.warn("Unable to resolve texture reference: {} in {}", pair2.getFirst(), pair2.getSecond()));
        final Map<Object, List<? super Object>> map = set.stream().collect((Collector<? super Object, ?, Map<Object, List<? super Object>>>)Collectors.groupingBy((Function<? super Object, ?>)Class3687::method11330));
        class5028.method15300("stitching");
        this.field30270 = Maps.newHashMap();
        for (final Map.Entry<Class1932, V> entry : map.entrySet()) {
            final Class1774 class5029 = new Class1774(entry.getKey());
            this.field30270.put(entry.getKey(), (Pair<Class1774, Class9430>)Pair.of((Object)class5029, (Object)class5029.method6332(this.field30261, ((List)entry.getValue()).stream().map(Class3687::method11331), class5028, n)));
        }
        class5028.method15299();
    }
    
    public Class391 method24011(final Class1663 class1663, final Class5028 class1664) {
        class1664.method15297("atlas");
        for (final Pair pair : this.field30270.values()) {
            final Class1774 class1665 = (Class1774)pair.getFirst();
            final Class9430 class1666 = (Class9430)pair.getSecond();
            class1665.method6331(class1666);
            class1663.method5851(class1665.method6340(), class1665);
            class1663.method5849(class1665.method6340());
            class1665.method6341(class1666);
        }
        this.field30262 = new Class391((Collection<Class1774>)this.field30270.values().stream().map((Function<? super Pair<Class1774, Class9430>, ?>)Pair::getFirst).collect((Collector<? super Object, ?, List<? super Object>>)Collectors.toList()));
        class1664.method15300("baking");
        this.field30268.keySet().forEach(class1667 -> {
            Class6313 method24020 = null;
            try {
                method24020 = this.method24020(class1667, Class2122.field12371);
            }
            catch (final Exception ex) {
                Class7637.field30249.warn("Unable to bake model: '{}': {}", (Object)class1667, (Object)ex);
            }
            if (method24020 != null) {
                this.field30269.put(class1667, method24020);
            }
            return;
        });
        class1664.method15299();
        return this.field30262;
    }
    
    private static Predicate<Class7096> method24012(final Class9104<Class3833, Class7096> class9105, final String s) {
        final HashMap hashMap = Maps.newHashMap();
        final Iterator iterator = Class7637.field30254.split((CharSequence)s).iterator();
        while (iterator.hasNext()) {
            final Iterator iterator2 = Class7637.field30255.split((CharSequence)iterator.next()).iterator();
            if (!iterator2.hasNext()) {
                continue;
            }
            final String s2 = (String)iterator2.next();
            final Class7111<?> method32906 = class9105.method32906(s2);
            if (method32906 != null && iterator2.hasNext()) {
                final String str = (String)iterator2.next();
                final Comparable method32907 = method24013(method32906, str);
                if (method32907 == null) {
                    throw new RuntimeException("Unknown value: '" + str + "' for blockstate property: '" + s2 + "' " + method32906.method21829());
                }
                hashMap.put(method32906, method32907);
            }
            else {
                if (s2.isEmpty()) {
                    continue;
                }
                throw new RuntimeException("Unknown blockstate property: '" + s2 + "'");
            }
        }
        return class9107 -> {
            final Object o = class9105.method32904();
            if (class9107 != null && class9106 == class9107.method21696()) {
                map.entrySet().iterator();
                final Iterator iterator3;
                while (iterator3.hasNext()) {
                    final Map.Entry<Class7111<T>, V> entry = iterator3.next();
                    if (Objects.equals(class9107.method21772((Class7111<Object>)entry.getKey()), entry.getValue())) {
                        continue;
                    }
                    else {
                        return false;
                    }
                }
                return true;
            }
            else {
                return false;
            }
        };
    }
    
    @Nullable
    public static <T extends Comparable<T>> T method24013(final Class7111<T> class7111, final String s) {
        return class7111.method21830(s).orElse(null);
    }
    
    public Class7684 method24014(final Class1932 class1932) {
        if (this.field30266.containsKey(class1932)) {
            return this.field30266.get(class1932);
        }
        if (this.field30264.contains(class1932)) {
            throw new IllegalStateException("Circular reference while loading " + class1932);
        }
        this.field30264.add(class1932);
        final Class7684 defaultValue = this.field30266.get(Class7637.field30250);
        while (!this.field30264.isEmpty()) {
            final Class1932 class1933 = this.field30264.iterator().next();
            try {
                if (!this.field30266.containsKey(class1933)) {
                    this.method24015(class1933);
                }
            }
            catch (final Class2366 class1934) {
                Class7637.field30249.warn(class1934.getMessage());
                this.field30266.put(class1933, defaultValue);
            }
            catch (final Exception ex) {
                Class7637.field30249.warn("Unable to load model: '{}' referenced from: {}: {}", (Object)class1933, (Object)class1932);
                Class7637.field30249.warn(ex.getClass().getName() + ": " + ex.getMessage());
                this.field30266.put(class1933, defaultValue);
            }
            finally {
                this.field30264.remove(class1933);
            }
        }
        return this.field30266.getOrDefault(class1932, defaultValue);
    }
    
    private void method24015(final Class1932 p0) throws Exception {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: instanceof      Lmapped/Class1933;
        //     4: ifne            21
        //     7: aload_0        
        //     8: aload_1        
        //     9: aload_0        
        //    10: aload_1        
        //    11: invokespecial   mapped/Class7637.method24022:(Lmapped/Class1932;)Lmapped/Class7685;
        //    14: invokespecial   mapped/Class7637.method24016:(Lmapped/Class1932;Lmapped/Class7684;)V
        //    17: goto            686
        //    20: athrow         
        //    21: aload_1        
        //    22: checkcast       Lmapped/Class1933;
        //    25: astore          4
        //    27: aload           4
        //    29: invokevirtual   mapped/Class1933.method7807:()Ljava/lang/String;
        //    32: ldc_w           "inventory"
        //    35: invokestatic    java/util/Objects.equals:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //    38: ifeq            142
        //    41: new             Lmapped/Class1932;
        //    44: dup            
        //    45: aload_1        
        //    46: invokevirtual   mapped/Class1932.method7798:()Ljava/lang/String;
        //    49: new             Ljava/lang/StringBuilder;
        //    52: dup            
        //    53: invokespecial   java/lang/StringBuilder.<init>:()V
        //    56: ldc_w           "item/"
        //    59: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    62: aload_1        
        //    63: invokevirtual   mapped/Class1932.method7797:()Ljava/lang/String;
        //    66: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    69: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    72: invokespecial   mapped/Class1932.<init>:(Ljava/lang/String;Ljava/lang/String;)V
        //    75: astore          5
        //    77: aload_1        
        //    78: invokevirtual   mapped/Class1932.method7797:()Ljava/lang/String;
        //    81: astore          6
        //    83: aload           6
        //    85: ldc_w           "optifine/"
        //    88: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //    91: ifne            105
        //    94: aload           6
        //    96: ldc_w           "item/"
        //    99: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   102: ifeq            108
        //   105: aload_1        
        //   106: astore          5
        //   108: aload_0        
        //   109: aload           5
        //   111: invokespecial   mapped/Class7637.method24022:(Lmapped/Class1932;)Lmapped/Class7685;
        //   114: astore          7
        //   116: aload_0        
        //   117: aload           4
        //   119: aload           7
        //   121: invokespecial   mapped/Class7637.method24016:(Lmapped/Class1932;Lmapped/Class7684;)V
        //   124: aload_0        
        //   125: getfield        mapped/Class7637.field30266:Ljava/util/Map;
        //   128: aload           5
        //   130: aload           7
        //   132: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   137: pop            
        //   138: goto            686
        //   141: athrow         
        //   142: new             Lmapped/Class1932;
        //   145: dup            
        //   146: aload_1        
        //   147: invokevirtual   mapped/Class1932.method7798:()Ljava/lang/String;
        //   150: aload_1        
        //   151: invokevirtual   mapped/Class1932.method7797:()Ljava/lang/String;
        //   154: invokespecial   mapped/Class1932.<init>:(Ljava/lang/String;Ljava/lang/String;)V
        //   157: astore          5
        //   159: getstatic       mapped/Class7637.field30260:Ljava/util/Map;
        //   162: aload           5
        //   164: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   169: invokestatic    java/util/Optional.ofNullable:(Ljava/lang/Object;)Ljava/util/Optional;
        //   172: aload           5
        //   174: invokedynamic   BootstrapMethod #11, get:(Lmapped/Class1932;)Ljava/util/function/Supplier;
        //   179: invokevirtual   java/util/Optional.orElseGet:(Ljava/util/function/Supplier;)Ljava/lang/Object;
        //   182: checkcast       Lmapped/Class9104;
        //   185: astore          6
        //   187: aload_0        
        //   188: getfield        mapped/Class7637.field30265:Lmapped/Class9333;
        //   191: aload           6
        //   193: invokevirtual   mapped/Class9333.method34574:(Lmapped/Class9104;)V
        //   196: aload_0        
        //   197: getfield        mapped/Class7637.field30263:Lmapped/Class7860;
        //   200: aload           6
        //   202: invokevirtual   mapped/Class9104.method32904:()Ljava/lang/Object;
        //   205: checkcast       Lmapped/Class3833;
        //   208: invokevirtual   mapped/Class7860.method25445:(Lmapped/Class3833;)Ljava/util/Set;
        //   211: invokestatic    com/google/common/collect/ImmutableList.copyOf:(Ljava/util/Collection;)Lcom/google/common/collect/ImmutableList;
        //   214: astore          7
        //   216: aload           6
        //   218: invokevirtual   mapped/Class9104.method32902:()Lcom/google/common/collect/ImmutableList;
        //   221: astore          8
        //   223: invokestatic    com/google/common/collect/Maps.newHashMap:()Ljava/util/HashMap;
        //   226: astore          9
        //   228: aload           8
        //   230: aload           9
        //   232: aload           5
        //   234: invokedynamic   BootstrapMethod #12, accept:(Ljava/util/Map;Lmapped/Class1932;)Ljava/util/function/Consumer;
        //   239: invokevirtual   com/google/common/collect/ImmutableList.forEach:(Ljava/util/function/Consumer;)V
        //   242: invokestatic    com/google/common/collect/Maps.newHashMap:()Ljava/util/HashMap;
        //   245: astore          10
        //   247: new             Lmapped/Class1932;
        //   250: dup            
        //   251: aload_1        
        //   252: invokevirtual   mapped/Class1932.method7798:()Ljava/lang/String;
        //   255: new             Ljava/lang/StringBuilder;
        //   258: dup            
        //   259: invokespecial   java/lang/StringBuilder.<init>:()V
        //   262: ldc_w           "blockstates/"
        //   265: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   268: aload_1        
        //   269: invokevirtual   mapped/Class1932.method7797:()Ljava/lang/String;
        //   272: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   275: ldc_w           ".json"
        //   278: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   281: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   284: invokespecial   mapped/Class1932.<init>:(Ljava/lang/String;Ljava/lang/String;)V
        //   287: astore          11
        //   289: aload_0        
        //   290: getfield        mapped/Class7637.field30266:Ljava/util/Map;
        //   293: getstatic       mapped/Class7637.field30250:Lmapped/Class1933;
        //   296: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   301: checkcast       Lmapped/Class7684;
        //   304: astore          12
        //   306: new             Lmapped/Class9593;
        //   309: dup            
        //   310: aload           12
        //   312: invokestatic    com/google/common/collect/ImmutableList.of:(Ljava/lang/Object;)Lcom/google/common/collect/ImmutableList;
        //   315: invokestatic    com/google/common/collect/ImmutableList.of:()Lcom/google/common/collect/ImmutableList;
        //   318: invokespecial   mapped/Class9593.<init>:(Ljava/util/List;Ljava/util/List;)V
        //   321: astore          13
        //   323: aload           12
        //   325: aload           13
        //   327: invokedynamic   BootstrapMethod #13, get:(Lmapped/Class9593;)Ljava/util/function/Supplier;
        //   332: invokestatic    com/mojang/datafixers/util/Pair.of:(Ljava/lang/Object;Ljava/lang/Object;)Lcom/mojang/datafixers/util/Pair;
        //   335: astore          14
        //   337: aload_0        
        //   338: getfield        mapped/Class7637.field30261:Lmapped/Class6582;
        //   341: aload           11
        //   343: invokeinterface mapped/Class6582.method19935:(Lmapped/Class1932;)Ljava/util/List;
        //   348: invokeinterface java/util/List.stream:()Ljava/util/stream/Stream;
        //   353: aload_0        
        //   354: invokedynamic   BootstrapMethod #14, apply:(Lmapped/Class7637;)Ljava/util/function/Function;
        //   359: invokeinterface java/util/stream/Stream.map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
        //   364: invokestatic    java/util/stream/Collectors.toList:()Ljava/util/stream/Collector;
        //   367: invokeinterface java/util/stream/Stream.collect:(Ljava/util/stream/Collector;)Ljava/lang/Object;
        //   372: checkcast       Ljava/util/List;
        //   375: astore          15
        //   377: goto            437
        //   380: athrow         
        //   381: astore          16
        //   383: getstatic       mapped/Class7637.field30249:Lorg/apache/logging/log4j/Logger;
        //   386: ldc_w           "Exception loading blockstate definition: {}: {}"
        //   389: aload           11
        //   391: aload           16
        //   393: invokeinterface org/apache/logging/log4j/Logger.warn:(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
        //   398: invokestatic    com/google/common/collect/Maps.newHashMap:()Ljava/util/HashMap;
        //   401: astore          17
        //   403: aload           9
        //   405: aload_0        
        //   406: aload           10
        //   408: aload           11
        //   410: aload           14
        //   412: aload           17
        //   414: invokedynamic   BootstrapMethod #15, accept:(Lmapped/Class7637;Ljava/util/Map;Lmapped/Class1932;Lcom/mojang/datafixers/util/Pair;Ljava/util/HashMap;)Ljava/util/function/BiConsumer;
        //   419: invokeinterface java/util/Map.forEach:(Ljava/util/function/BiConsumer;)V
        //   424: aload           17
        //   426: aload_0        
        //   427: invokedynamic   BootstrapMethod #16, accept:(Lmapped/Class7637;)Ljava/util/function/BiConsumer;
        //   432: invokevirtual   java/util/HashMap.forEach:(Ljava/util/function/BiConsumer;)V
        //   435: return         
        //   436: athrow         
        //   437: aload           15
        //   439: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   444: astore          16
        //   446: aload           16
        //   448: invokeinterface java/util/Iterator.hasNext:()Z
        //   453: ifeq            567
        //   456: aload           16
        //   458: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   463: checkcast       Lcom/mojang/datafixers/util/Pair;
        //   466: astore          17
        //   468: aload           17
        //   470: invokevirtual   com/mojang/datafixers/util/Pair.getSecond:()Ljava/lang/Object;
        //   473: checkcast       Lmapped/Class5593;
        //   476: astore          18
        //   478: invokestatic    com/google/common/collect/Maps.newIdentityHashMap:()Ljava/util/IdentityHashMap;
        //   481: astore          19
        //   483: aload           18
        //   485: invokevirtual   mapped/Class5593.method16830:()Z
        //   488: ifeq            518
        //   491: aload           18
        //   493: invokevirtual   mapped/Class5593.method16831:()Lmapped/Class7686;
        //   496: astore          20
        //   498: aload           8
        //   500: aload           19
        //   502: aload           20
        //   504: aload           7
        //   506: invokedynamic   BootstrapMethod #17, accept:(Ljava/util/Map;Lmapped/Class7686;Ljava/util/List;)Ljava/util/function/Consumer;
        //   511: invokevirtual   com/google/common/collect/ImmutableList.forEach:(Ljava/util/function/Consumer;)V
        //   514: goto            521
        //   517: athrow         
        //   518: aconst_null    
        //   519: astore          20
        //   521: aload           18
        //   523: invokevirtual   mapped/Class5593.method16829:()Ljava/util/Map;
        //   526: aload           8
        //   528: aload           6
        //   530: aload           19
        //   532: aload           7
        //   534: aload           20
        //   536: aload           14
        //   538: aload           18
        //   540: aload           11
        //   542: aload           17
        //   544: invokedynamic   BootstrapMethod #18, accept:(Lcom/google/common/collect/ImmutableList;Lmapped/Class9104;Ljava/util/Map;Ljava/util/List;Lmapped/Class7686;Lcom/mojang/datafixers/util/Pair;Lmapped/Class5593;Lmapped/Class1932;Lcom/mojang/datafixers/util/Pair;)Ljava/util/function/BiConsumer;
        //   549: invokeinterface java/util/Map.forEach:(Ljava/util/function/BiConsumer;)V
        //   554: aload           10
        //   556: aload           19
        //   558: invokeinterface java/util/Map.putAll:(Ljava/util/Map;)V
        //   563: goto            446
        //   566: athrow         
        //   567: invokestatic    com/google/common/collect/Maps.newHashMap:()Ljava/util/HashMap;
        //   570: astore          16
        //   572: aload           9
        //   574: aload_0        
        //   575: aload           10
        //   577: aload           11
        //   579: aload           14
        //   581: aload           16
        //   583: invokedynamic   BootstrapMethod #15, accept:(Lmapped/Class7637;Ljava/util/Map;Lmapped/Class1932;Lcom/mojang/datafixers/util/Pair;Ljava/util/HashMap;)Ljava/util/function/BiConsumer;
        //   588: invokeinterface java/util/Map.forEach:(Ljava/util/function/BiConsumer;)V
        //   593: aload           16
        //   595: aload_0        
        //   596: invokedynamic   BootstrapMethod #16, accept:(Lmapped/Class7637;)Ljava/util/function/BiConsumer;
        //   601: invokevirtual   java/util/HashMap.forEach:(Ljava/util/function/BiConsumer;)V
        //   604: return         
        //   605: athrow         
        //   606: astore          15
        //   608: aload           15
        //   610: athrow         
        //   611: athrow         
        //   612: astore          15
        //   614: new             Lmapped/Class2366;
        //   617: dup            
        //   618: ldc_w           "Exception loading blockstate definition: '%s': %s"
        //   621: iconst_2       
        //   622: anewarray       Ljava/lang/Object;
        //   625: dup            
        //   626: iconst_0       
        //   627: aload           11
        //   629: aastore        
        //   630: dup            
        //   631: iconst_1       
        //   632: aload           15
        //   634: aastore        
        //   635: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   638: invokespecial   mapped/Class2366.<init>:(Ljava/lang/String;)V
        //   641: athrow         
        //   642: athrow         
        //   643: astore          21
        //   645: invokestatic    com/google/common/collect/Maps.newHashMap:()Ljava/util/HashMap;
        //   648: astore          22
        //   650: aload           9
        //   652: aload_0        
        //   653: aload           10
        //   655: aload           11
        //   657: aload           14
        //   659: aload           22
        //   661: invokedynamic   BootstrapMethod #15, accept:(Lmapped/Class7637;Ljava/util/Map;Lmapped/Class1932;Lcom/mojang/datafixers/util/Pair;Ljava/util/HashMap;)Ljava/util/function/BiConsumer;
        //   666: invokeinterface java/util/Map.forEach:(Ljava/util/function/BiConsumer;)V
        //   671: aload           22
        //   673: aload_0        
        //   674: invokedynamic   BootstrapMethod #16, accept:(Lmapped/Class7637;)Ljava/util/function/BiConsumer;
        //   679: invokevirtual   java/util/HashMap.forEach:(Ljava/util/function/BiConsumer;)V
        //   682: aload           21
        //   684: athrow         
        //   685: athrow         
        //   686: return         
        //    Exceptions:
        //  throws java.lang.Exception
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  337    377    381    436    Ljava/io/IOException;
        //  337    380    606    611    Lmapped/Class2366;
        //  381    398    606    611    Lmapped/Class2366;
        //  437    517    606    611    Lmapped/Class2366;
        //  518    566    606    611    Lmapped/Class2366;
        //  337    380    612    642    Ljava/lang/Exception;
        //  381    398    612    642    Ljava/lang/Exception;
        //  437    517    612    642    Ljava/lang/Exception;
        //  518    566    612    642    Ljava/lang/Exception;
        //  337    380    643    685    Any
        //  381    398    643    685    Any
        //  437    517    643    685    Any
        //  518    566    643    685    Any
        //  606    611    643    685    Any
        //  612    642    643    685    Any
        //  643    645    643    685    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Could not infer any expression.
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:382)
        //     at com.strobel.decompiler.ast.TypeAnalysis.run(TypeAnalysis.java:95)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:344)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:144)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private void method24016(final Class1932 class1932, final Class7684 class1933) {
        this.field30266.put(class1932, class1933);
        this.field30264.addAll(class1933.method24381());
    }
    
    private void method24017(final Class1932 class1932) {
        final Class7684 method24014 = this.method24014(class1932);
        this.field30266.put(class1932, method24014);
        this.field30268.put(class1932, method24014);
    }
    
    public void method24018(final Class1933 class1933) {
        final Class7684 method24014 = this.method24014(class1933);
        this.field30266.put(class1933, method24014);
        this.field30268.put(class1933, method24014);
    }
    
    private void method24019(final Iterable<Class7096> iterable) {
        iterable.forEach(class7096 -> {
            this.field30271++;
            this.field30272.put((Object)class7096, n);
        });
    }
    
    @Nullable
    public Class6313 method24020(final Class1932 class1932, final Class2123 class1933) {
        return this.method24021(class1932, class1933, this.field30262::method1415);
    }
    
    public Class6313 method24021(final Class1932 class1932, final Class2123 class1933, final Function<Class3687, Class1912> function) {
        final Triple of = Triple.of((Object)class1932, (Object)class1933.method8274(), (Object)class1933.method8278());
        if (this.field30267.containsKey(of)) {
            return this.field30267.get(of);
        }
        if (this.field30262 != null) {
            final Class7684 method24014 = this.method24014(class1932);
            if (method24014 instanceof Class7685) {
                final Class7685 class1934 = (Class7685)method24014;
                if (class1934.method24398() == Class7637.field30256) {
                    if (!Class9570.field41282.method22623()) {
                        return Class7637.field30259.method26985(this.field30262::method1415, class1934).method24392(this, class1934, this.field30262::method1415, class1933, class1932, false);
                    }
                    return Class7637.field30259.method26985(function, class1934).method24392(this, class1934, function, class1933, class1932, false);
                }
            }
            Class6313 class1935 = method24014.method24383(this, this.field30262::method1415, class1933, class1932);
            if (Class9570.field41282.method22623()) {
                class1935 = method24014.method24383(this, function, class1933, class1932);
            }
            this.field30267.put((Triple<Class1932, Class9294, Boolean>)of, class1935);
            return class1935;
        }
        throw new IllegalStateException("bake called too early");
    }
    
    private Class7685 method24022(final Class1932 class1932) throws IOException {
        Reader reader = null;
        Class1671 method19933 = null;
        Class7685 field30257;
        try {
            final String method19934 = class1932.method7797();
            Class1932 method19935 = class1932;
            if ("builtin/generated".equals(method19934)) {
                return Class7637.field30256;
            }
            if (!"builtin/entity".equals(method19934)) {
                if (method19934.startsWith("builtin/")) {
                    final String s = Class7637.field30253.get(method19934.substring("builtin/".length()));
                    if (s == null) {
                        throw new FileNotFoundException(class1932.toString());
                    }
                    reader = new StringReader(s);
                }
                else {
                    method19935 = this.method24025(class1932);
                    method19933 = this.field30261.method19933(method19935);
                    reader = new InputStreamReader(method19933.method5887(), StandardCharsets.UTF_8);
                }
                final Class7685 method19936 = Class7685.method24385(reader);
                method19936.field30523 = class1932.toString();
                method24026(method19936, Class8969.method31833(method19935.method7797()));
                return method19936;
            }
            field30257 = Class7637.field30257;
        }
        finally {
            IOUtils.closeQuietly(reader);
            IOUtils.closeQuietly((Closeable)method19933);
        }
        return field30257;
    }
    
    public Map<Class1932, Class6313> method24023() {
        return this.field30269;
    }
    
    public Object2IntMap<Class7096> method24024() {
        return this.field30272;
    }
    
    private Class1932 method24025(Class1932 class1932) {
        final String method7797 = class1932.method7797();
        if (!method7797.startsWith("optifine/")) {
            return new Class1932(class1932.method7798(), "models/" + class1932.method7797() + ".json");
        }
        if (!method7797.endsWith(".json")) {
            class1932 = new Class1932(class1932.method7798(), method7797 + ".json");
        }
        return class1932;
    }
    
    public static void method24026(final Class7685 class7685, final String s) {
        final Class1932 method24027 = method24027(class7685.field30526, s);
        if (method24027 != class7685.field30526) {
            class7685.field30526 = method24027;
        }
        if (class7685.field30524 != null) {
            for (final Map.Entry<K, Either> entry : class7685.field30524.entrySet()) {
                final Optional right = entry.getValue().right();
                if (!right.isPresent()) {
                    continue;
                }
                final String anObject = right.get();
                final String method24028 = method24028(anObject, s);
                if (method24028.equals(anObject)) {
                    continue;
                }
                entry.setValue(Either.right((Object)method24028));
            }
        }
    }
    
    public static Class1932 method24027(Class1932 class1932, final String s) {
        if (class1932 == null || s == null) {
            return class1932;
        }
        if (class1932.method7798().equals("minecraft")) {
            final String method7797 = class1932.method7797();
            final String method7798 = method24028(method7797, s);
            if (method7798 != method7797) {
                class1932 = new Class1932(class1932.method7798(), method7798);
            }
            return class1932;
        }
        return class1932;
    }
    
    private static String method24028(String s, final String s2) {
        s = Class8969.method31832(s, s2);
        s = Class9518.method35518(s, ".json");
        s = Class9518.method35518(s, ".png");
        return s;
    }
    
    public Set<Class1932> method24029() {
        return Collections.emptySet();
    }
    
    public Class391 method24030() {
        return this.field30262;
    }
    
    static {
        field30237 = new Class3687(Class1774.field9853, new Class1932("block/fire_0"));
        field30238 = new Class3687(Class1774.field9853, new Class1932("block/fire_1"));
        field30239 = new Class3687(Class1774.field9853, new Class1932("block/lava_flow"));
        field30240 = new Class3687(Class1774.field9853, new Class1932("block/water_flow"));
        field30241 = new Class3687(Class1774.field9853, new Class1932("block/water_overlay"));
        field30242 = new Class3687(Class1774.field9853, new Class1932("entity/banner_base"));
        field30243 = new Class3687(Class1774.field9853, new Class1932("entity/shield_base"));
        field30244 = new Class3687(Class1774.field9853, new Class1932("entity/shield_base_nopattern"));
        field30245 = IntStream.range(0, 10).mapToObj(i -> {
            new Class1932("block/destroy_stage_" + i);
            return;
        }).collect((Collector<? super Object, ?, List<Class1932>>)Collectors.toList());
        field30246 = Class7637.field30245.stream().map(class1933 -> {
            new Class1932("textures/" + class1933.method7797() + ".png");
            return;
        }).collect((Collector<? super Object, ?, List<Class1932>>)Collectors.toList());
        field30247 = Class7637.field30246.stream().map((Function<? super Object, ?>)Class6332::method18786).collect((Collector<? super Object, ?, List<Class6332>>)Collectors.toList());
        field30248 = Class8349.method27851(Sets.newHashSet(), set -> {
            set.add(Class7637.field30240);
            set.add(Class7637.field30239);
            set.add(Class7637.field30241);
            set.add(Class7637.field30237);
            set.add(Class7637.field30238);
            set.add(Class4166.field18565);
            set.add(Class4164.field18551);
            set.add(Class4164.field18552);
            set.add(Class4164.field18553);
            set.add(Class4164.field18554);
            set.add(Class4164.field18555);
            set.add(Class4164.field18556);
            set.add(Class4173.field18589);
            set.add(Class7637.field30242);
            set.add(Class7637.field30243);
            set.add(Class7637.field30244);
            Class7637.field30245.iterator();
            final Iterator iterator;
            while (iterator.hasNext()) {
                set.add(new Class3687(Class1774.field9853, iterator.next()));
            }
            set.add(new Class3687(Class1774.field9853, Class3427.field16193));
            set.add(new Class3687(Class1774.field9853, Class3427.field16194));
            set.add(new Class3687(Class1774.field9853, Class3427.field16195));
            set.add(new Class3687(Class1774.field9853, Class3427.field16196));
            set.add(new Class3687(Class1774.field9853, Class3427.field16197));
            Class8752.method30267(set::add);
            return;
        });
        field30249 = LogManager.getLogger();
        field30250 = new Class1933("builtin/missing", "missing");
        field30251 = Class7637.field30250.toString();
        field30252 = ("{    'textures': {       'particle': '" + Class1913.method7551().method7797() + "',       'missingno': '" + Class1913.method7551().method7797() + "'    },    'elements': [         {  'from': [ 0, 0, 0 ],            'to': [ 16, 16, 16 ],            'faces': {                'down':  { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'down',  'texture': '#missingno' },                'up':    { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'up',    'texture': '#missingno' },                'north': { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'north', 'texture': '#missingno' },                'south': { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'south', 'texture': '#missingno' },                'west':  { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'west',  'texture': '#missingno' },                'east':  { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'east',  'texture': '#missingno' }            }        }    ]}").replace('\'', '\"');
        field30253 = Maps.newHashMap((Map)ImmutableMap.of((Object)"missing", (Object)Class7637.field30252));
        field30254 = Splitter.on(',');
        field30255 = Splitter.on('=').limit(2);
        field30256 = Class8349.method27851(Class7685.method24386("{\"gui_light\": \"front\"}"), class1935 -> class1935.field30523 = "generation marker");
        field30257 = Class8349.method27851(Class7685.method24386("{\"gui_light\": \"side\"}"), class1936 -> class1936.field30523 = "block entity marker");
        field30258 = new Class9500<Class3833, Class7096>(Class7521.field29147).method35378(Class7113.method21834("map")).method35380((Class6846<Class3833, Class7096, Class7097>)Class7096::new);
        field30259 = new Class8163();
        field30260 = (Map)ImmutableMap.of((Object)new Class1932("item_frame"), (Object)Class7637.field30258);
    }
}
