// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.types.Type;
import java.util.ArrayList;
import java.util.Collections;
import javax.annotation.Nullable;
import java.util.List;
import java.util.HashMap;
import java.util.Iterator;
import java.util.stream.Collector;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.util.Pair;
import com.google.common.collect.Lists;
import java.util.Locale;
import com.google.common.collect.Maps;
import com.google.common.base.Splitter;
import java.util.Optional;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.types.DynamicOps;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.JsonOps;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import java.util.Map;
import com.mojang.datafixers.DataFix;

public class Class6555 extends DataFix
{
    public static final Map<String, String> field26043;
    
    public Class6555(final Schema schema, final boolean b) {
        super(schema, b);
    }
    
    public TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped("LevelDataGeneratorOptionsFix", this.getInputSchema().getType(Class9451.field40611), this.getOutputSchema().getType(Class9451.field40611), typed -> {
            typed.write();
            final Dynamic dynamic;
            dynamic.get("generatorOptions").asString();
            Dynamic dynamic2;
            if (!"flat".equalsIgnoreCase(dynamic.get("generatorName").asString(""))) {
                final Optional optional;
                if ("buffet".equalsIgnoreCase(dynamic.get("generatorName").asString("")) && optional.isPresent()) {
                    dynamic2 = dynamic.set("generatorOptions", new Dynamic((DynamicOps)JsonOps.INSTANCE, (Object)Class9583.method35930(optional.get(), true)).convert(dynamic.getOps()));
                }
                else {
                    dynamic2 = dynamic;
                }
            }
            else {
                final Optional optional;
                dynamic2 = dynamic.set("generatorOptions", (Dynamic)method19864(optional.orElse(""), (com.mojang.datafixers.types.DynamicOps<Object>)dynamic.getOps()));
            }
            return (Typed)((Optional)type.readTyped(dynamic2).getSecond()).orElseThrow(() -> new IllegalStateException("Could not read new level type."));
        });
    }
    
    private static <T> Dynamic<T> method19864(final String s, final DynamicOps<T> dynamicOps) {
        final Iterator iterator = Splitter.on(';').split((CharSequence)s).iterator();
        String s2 = "minecraft:plains";
        final HashMap hashMap = Maps.newHashMap();
        List<Pair<Integer, String>> list;
        if (!s.isEmpty() && iterator.hasNext()) {
            list = method19866((String)iterator.next());
            if (!list.isEmpty()) {
                if (iterator.hasNext()) {
                    s2 = Class6555.field26043.getOrDefault(iterator.next(), "minecraft:plains");
                }
                if (!iterator.hasNext()) {
                    hashMap.put("village", Maps.newHashMap());
                }
                else {
                    final String[] split = ((String)iterator.next()).toLowerCase(Locale.ROOT).split(",");
                    for (int length = split.length, i = 0; i < length; ++i) {
                        final String[] split2 = split[i].split("\\(", 2);
                        if (!split2[0].isEmpty()) {
                            hashMap.put(split2[0], Maps.newHashMap());
                            if (split2.length > 1) {
                                if (split2[1].endsWith(")")) {
                                    if (split2[1].length() > 1) {
                                        final String[] split3 = split2[1].substring(0, split2[1].length() - 1).split(" ");
                                        for (int length2 = split3.length, j = 0; j < length2; ++j) {
                                            final String[] split4 = split3[j].split("=", 2);
                                            if (split4.length == 2) {
                                                ((Map)hashMap.get(split2[0])).put(split4[0], split4[1]);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        else {
            list = Lists.newArrayList();
            list.add(Pair.of((Object)1, (Object)"minecraft:bedrock"));
            list.add(Pair.of((Object)2, (Object)"minecraft:dirt"));
            list.add(Pair.of((Object)1, (Object)"minecraft:grass_block"));
            hashMap.put("village", Maps.newHashMap());
        }
        return (Dynamic<T>)new Dynamic((DynamicOps)dynamicOps, dynamicOps.createMap((Map)ImmutableMap.of(dynamicOps.createString("layers"), dynamicOps.createList((Stream)list.stream().map(pair -> dynamicOps2.createMap((Map)ImmutableMap.of(dynamicOps2.createString("height"), dynamicOps2.createInt((int)pair.getFirst()), dynamicOps2.createString("block"), dynamicOps2.createString((String)pair.getSecond()))))), dynamicOps.createString("biome"), dynamicOps.createString(s2), dynamicOps.createString("structures"), dynamicOps.createMap((Map)hashMap.entrySet().stream().map(entry -> Pair.of(dynamicOps3.createString(entry.getKey().toLowerCase(Locale.ROOT)), dynamicOps3.createMap((Map)((Map)entry.getValue()).entrySet().stream().map(entry2 -> Pair.of(dynamicOps4.createString((String)entry2.getKey()), dynamicOps4.createString((String)entry2.getValue()))).collect(Collectors.toMap((Function<? super Object, ?>)Pair::getFirst, (Function<? super Object, ?>)Pair::getSecond))))).collect(Collectors.toMap((Function<? super Object, ?>)Pair::getFirst, (Function<? super Object, ?>)Pair::getSecond))))));
    }
    
    @Nullable
    private static Pair<Integer, String> method19865(final String s) {
        final String[] split = s.split("\\*", 2);
        if (split.length == 2) {
            try {
                final int int1 = Integer.parseInt(split[0]);
                return (Pair<Integer, String>)Pair.of((Object)int1, (Object)split[split.length - 1]);
            }
            catch (final NumberFormatException ex) {
                return null;
            }
        }
        final int int1 = 1;
        return (Pair<Integer, String>)Pair.of((Object)int1, (Object)split[split.length - 1]);
    }
    
    private static List<Pair<Integer, String>> method19866(final String s) {
        final ArrayList arrayList = Lists.newArrayList();
        final String[] split = s.split(",");
        for (int length = split.length, i = 0; i < length; ++i) {
            final Pair<Integer, String> method19865 = method19865(split[i]);
            if (method19865 == null) {
                return Collections.emptyList();
            }
            arrayList.add(method19865);
        }
        return arrayList;
    }
    
    static {
        field26043 = Class8349.method27851(Maps.newHashMap(), hashMap -> {
            hashMap.put("0", "minecraft:ocean");
            hashMap.put("1", "minecraft:plains");
            hashMap.put("2", "minecraft:desert");
            hashMap.put("3", "minecraft:mountains");
            hashMap.put("4", "minecraft:forest");
            hashMap.put("5", "minecraft:taiga");
            hashMap.put("6", "minecraft:swamp");
            hashMap.put("7", "minecraft:river");
            hashMap.put("8", "minecraft:nether");
            hashMap.put("9", "minecraft:the_end");
            hashMap.put("10", "minecraft:frozen_ocean");
            hashMap.put("11", "minecraft:frozen_river");
            hashMap.put("12", "minecraft:snowy_tundra");
            hashMap.put("13", "minecraft:snowy_mountains");
            hashMap.put("14", "minecraft:mushroom_fields");
            hashMap.put("15", "minecraft:mushroom_field_shore");
            hashMap.put("16", "minecraft:beach");
            hashMap.put("17", "minecraft:desert_hills");
            hashMap.put("18", "minecraft:wooded_hills");
            hashMap.put("19", "minecraft:taiga_hills");
            hashMap.put("20", "minecraft:mountain_edge");
            hashMap.put("21", "minecraft:jungle");
            hashMap.put("22", "minecraft:jungle_hills");
            hashMap.put("23", "minecraft:jungle_edge");
            hashMap.put("24", "minecraft:deep_ocean");
            hashMap.put("25", "minecraft:stone_shore");
            hashMap.put("26", "minecraft:snowy_beach");
            hashMap.put("27", "minecraft:birch_forest");
            hashMap.put("28", "minecraft:birch_forest_hills");
            hashMap.put("29", "minecraft:dark_forest");
            hashMap.put("30", "minecraft:snowy_taiga");
            hashMap.put("31", "minecraft:snowy_taiga_hills");
            hashMap.put("32", "minecraft:giant_tree_taiga");
            hashMap.put("33", "minecraft:giant_tree_taiga_hills");
            hashMap.put("34", "minecraft:wooded_mountains");
            hashMap.put("35", "minecraft:savanna");
            hashMap.put("36", "minecraft:savanna_plateau");
            hashMap.put("37", "minecraft:badlands");
            hashMap.put("38", "minecraft:wooded_badlands_plateau");
            hashMap.put("39", "minecraft:badlands_plateau");
            hashMap.put("40", "minecraft:small_end_islands");
            hashMap.put("41", "minecraft:end_midlands");
            hashMap.put("42", "minecraft:end_highlands");
            hashMap.put("43", "minecraft:end_barrens");
            hashMap.put("44", "minecraft:warm_ocean");
            hashMap.put("45", "minecraft:lukewarm_ocean");
            hashMap.put("46", "minecraft:cold_ocean");
            hashMap.put("47", "minecraft:deep_warm_ocean");
            hashMap.put("48", "minecraft:deep_lukewarm_ocean");
            hashMap.put("49", "minecraft:deep_cold_ocean");
            hashMap.put("50", "minecraft:deep_frozen_ocean");
            hashMap.put("127", "minecraft:the_void");
            hashMap.put("129", "minecraft:sunflower_plains");
            hashMap.put("130", "minecraft:desert_lakes");
            hashMap.put("131", "minecraft:gravelly_mountains");
            hashMap.put("132", "minecraft:flower_forest");
            hashMap.put("133", "minecraft:taiga_mountains");
            hashMap.put("134", "minecraft:swamp_hills");
            hashMap.put("140", "minecraft:ice_spikes");
            hashMap.put("149", "minecraft:modified_jungle");
            hashMap.put("151", "minecraft:modified_jungle_edge");
            hashMap.put("155", "minecraft:tall_birch_forest");
            hashMap.put("156", "minecraft:tall_birch_hills");
            hashMap.put("157", "minecraft:dark_forest_hills");
            hashMap.put("158", "minecraft:snowy_taiga_mountains");
            hashMap.put("160", "minecraft:giant_spruce_taiga");
            hashMap.put("161", "minecraft:giant_spruce_taiga_hills");
            hashMap.put("162", "minecraft:modified_gravelly_mountains");
            hashMap.put("163", "minecraft:shattered_savanna");
            hashMap.put("164", "minecraft:shattered_savanna_plateau");
            hashMap.put("165", "minecraft:eroded_badlands");
            hashMap.put("166", "minecraft:modified_wooded_badlands_plateau");
            hashMap.put("167", "minecraft:modified_badlands_plateau");
        });
    }
}
