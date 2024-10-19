package mapped;

import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import net.minecraft.util.Util;
import net.minecraft.util.datafix.TypeReferences;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class Class9611 extends DataFix {
   public static final Map<String, String> field44940 = Util.<Map<String, String>>make(Maps.newHashMap(), var0 -> {
      var0.put("0", "minecraft:ocean");
      var0.put("1", "minecraft:plains");
      var0.put("2", "minecraft:desert");
      var0.put("3", "minecraft:mountains");
      var0.put("4", "minecraft:forest");
      var0.put("5", "minecraft:taiga");
      var0.put("6", "minecraft:swamp");
      var0.put("7", "minecraft:river");
      var0.put("8", "minecraft:nether");
      var0.put("9", "minecraft:the_end");
      var0.put("10", "minecraft:frozen_ocean");
      var0.put("11", "minecraft:frozen_river");
      var0.put("12", "minecraft:snowy_tundra");
      var0.put("13", "minecraft:snowy_mountains");
      var0.put("14", "minecraft:mushroom_fields");
      var0.put("15", "minecraft:mushroom_field_shore");
      var0.put("16", "minecraft:beach");
      var0.put("17", "minecraft:desert_hills");
      var0.put("18", "minecraft:wooded_hills");
      var0.put("19", "minecraft:taiga_hills");
      var0.put("20", "minecraft:mountain_edge");
      var0.put("21", "minecraft:jungle");
      var0.put("22", "minecraft:jungle_hills");
      var0.put("23", "minecraft:jungle_edge");
      var0.put("24", "minecraft:deep_ocean");
      var0.put("25", "minecraft:stone_shore");
      var0.put("26", "minecraft:snowy_beach");
      var0.put("27", "minecraft:birch_forest");
      var0.put("28", "minecraft:birch_forest_hills");
      var0.put("29", "minecraft:dark_forest");
      var0.put("30", "minecraft:snowy_taiga");
      var0.put("31", "minecraft:snowy_taiga_hills");
      var0.put("32", "minecraft:giant_tree_taiga");
      var0.put("33", "minecraft:giant_tree_taiga_hills");
      var0.put("34", "minecraft:wooded_mountains");
      var0.put("35", "minecraft:savanna");
      var0.put("36", "minecraft:savanna_plateau");
      var0.put("37", "minecraft:badlands");
      var0.put("38", "minecraft:wooded_badlands_plateau");
      var0.put("39", "minecraft:badlands_plateau");
      var0.put("40", "minecraft:small_end_islands");
      var0.put("41", "minecraft:end_midlands");
      var0.put("42", "minecraft:end_highlands");
      var0.put("43", "minecraft:end_barrens");
      var0.put("44", "minecraft:warm_ocean");
      var0.put("45", "minecraft:lukewarm_ocean");
      var0.put("46", "minecraft:cold_ocean");
      var0.put("47", "minecraft:deep_warm_ocean");
      var0.put("48", "minecraft:deep_lukewarm_ocean");
      var0.put("49", "minecraft:deep_cold_ocean");
      var0.put("50", "minecraft:deep_frozen_ocean");
      var0.put("127", "minecraft:the_void");
      var0.put("129", "minecraft:sunflower_plains");
      var0.put("130", "minecraft:desert_lakes");
      var0.put("131", "minecraft:gravelly_mountains");
      var0.put("132", "minecraft:flower_forest");
      var0.put("133", "minecraft:taiga_mountains");
      var0.put("134", "minecraft:swamp_hills");
      var0.put("140", "minecraft:ice_spikes");
      var0.put("149", "minecraft:modified_jungle");
      var0.put("151", "minecraft:modified_jungle_edge");
      var0.put("155", "minecraft:tall_birch_forest");
      var0.put("156", "minecraft:tall_birch_hills");
      var0.put("157", "minecraft:dark_forest_hills");
      var0.put("158", "minecraft:snowy_taiga_mountains");
      var0.put("160", "minecraft:giant_spruce_taiga");
      var0.put("161", "minecraft:giant_spruce_taiga_hills");
      var0.put("162", "minecraft:modified_gravelly_mountains");
      var0.put("163", "minecraft:shattered_savanna");
      var0.put("164", "minecraft:shattered_savanna_plateau");
      var0.put("165", "minecraft:eroded_badlands");
      var0.put("166", "minecraft:modified_wooded_badlands_plateau");
      var0.put("167", "minecraft:modified_badlands_plateau");
   });

   public Class9611(Schema var1, boolean var2) {
      super(var1, var2);
   }

   public TypeRewriteRule makeRule() {
      Type<?> var3 = this.getOutputSchema().getType(TypeReferences.LEVEL);
      return this.fixTypeEverywhereTyped(
         "LevelDataGeneratorOptionsFix", this.getInputSchema().getType(TypeReferences.LEVEL), var3, var1 -> (Typed)var1.write().flatMap(var1x -> {
               Optional<String> var4 = var1x.get("generatorOptions").asString().result();
               Dynamic<?> var5;
               if (!"flat".equalsIgnoreCase(var1x.get("generatorName").asString(""))) {
                  if ("buffet".equalsIgnoreCase(var1x.get("generatorName").asString("")) && var4.isPresent()) {
                     Dynamic<?> var6 = new Dynamic<>(JsonOps.INSTANCE, JSONUtils.method32798((String)var4.get(), true));
                     var5 = var1x.set("generatorOptions", var6.convert(var1x.getOps()));
                  } else {
                     var5 = var1x;
                  }
               } else {
                  String var7 = var4.orElse("");
                  var5 = var1x.set("generatorOptions", method37360(var7, var1x.getOps()));
               }

               return var3.readTyped(var5);
            }).map(Pair::getFirst).result().orElseThrow(() -> new IllegalStateException("Could not read new level type."))
      );
   }

   private static <T> Dynamic<T> method37360(String var0, DynamicOps<T> var1) {
      Iterator var4 = Splitter.on(';').split(var0).iterator();
      String var5 = "minecraft:plains";
      HashMap<String, Map> var6 = Maps.newHashMap();
      List<Pair<Integer, String>> var7;
      if (!var0.isEmpty() && var4.hasNext()) {
         var7 = method37362((String)var4.next());
         if (!var7.isEmpty()) {
            if (var4.hasNext()) {
               var5 = field44940.getOrDefault(var4.next(), "minecraft:plains");
            }

            if (!var4.hasNext()) {
               var6.put("village", Maps.newHashMap());
            } else {
               String[] var8 = ((String)var4.next()).toLowerCase(Locale.ROOT).split(",");

               for (String var12 : var8) {
                  String[] var13 = var12.split("\\(", 2);
                  if (!var13[0].isEmpty()) {
                     var6.put(var13[0], Maps.newHashMap());
                     if (var13.length > 1 && var13[1].endsWith(")") && var13[1].length() > 1) {
                        String[] var14 = var13[1].substring(0, var13[1].length() - 1).split(" ");

                        for (String var18 : var14) {
                           String[] var19 = var18.split("=", 2);
                           if (var19.length == 2) {
                              ((Map)var6.get(var13[0])).put(var19[0], var19[1]);
                           }
                        }
                     }
                  }
               }
            }
         }
      } else {
         var7 = Lists.newArrayList();
         var7.add(Pair.of(1, "minecraft:bedrock"));
         var7.add(Pair.of(2, "minecraft:dirt"));
         var7.add(Pair.of(1, "minecraft:grass_block"));
         var6.put("village", Maps.newHashMap());
      }

      T var20 = var1.createList(
         var7.stream()
            .map(
               var1x -> var1.createMap(
                     ImmutableMap.of(
                        var1.createString("height"),
                        var1.createInt((Integer)var1x.getFirst()),
                        var1.createString("block"),
                        var1.createString((String)var1x.getSecond())
                     )
                  )
            )
      );
      T var21 = var1.createMap(
         var6.entrySet()
            .stream()
            .map(
               var1x -> Pair.of(
                     var1.createString(var1x.getKey().toLowerCase(Locale.ROOT)),
                     var1.createMap(
                        ((Map<T, T>)var1x.getValue())
                           .entrySet()
                           .stream()
                           .map(var1xx -> Pair.of(var1.createString((String)var1xx.getKey()), var1.createString((String)var1xx.getValue())))
                           .collect(Collectors.toMap(Pair::getFirst, Pair::getSecond))
                     )
                  )
            )
            .collect(Collectors.toMap(Pair::getFirst, Pair::getSecond))
      );
      return new Dynamic(
         var1,
         var1.createMap(
            ImmutableMap.<T, T>of(var1.createString("layers"), var20, var1.createString("biome"), var1.createString(var5), var1.createString("structures"), var21)
         )
      );
   }

   @Nullable
   private static Pair<Integer, String> method37361(String var0) {
      String[] var3 = var0.split("\\*", 2);
      int var4;
      if (var3.length == 2) {
         try {
            var4 = Integer.parseInt(var3[0]);
         } catch (NumberFormatException var6) {
            return null;
         }
      } else {
         var4 = 1;
      }

      String var5 = var3[var3.length - 1];
      return Pair.of(var4, var5);
   }

   private static List<Pair<Integer, String>> method37362(String var0) {
      ArrayList var3 = Lists.newArrayList();
      String[] var4 = var0.split(",");

      for (String var8 : var4) {
         Pair var9 = method37361(var8);
         if (var9 == null) {
            return Collections.<Pair<Integer, String>>emptyList();
         }

         var3.add(var9);
      }

      return var3;
   }
}
