package remapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicLike;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.OptionalDynamic;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.commons.lang3.math.NumberUtils;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.apache.commons.lang3.mutable.MutableInt;

public class class_9002 extends DataFix {
   private static final ImmutableMap<String, class_9010> field_46084 = ImmutableMap.builder()
      .put(field_46083[51], new class_9010(32, 8, 10387312))
      .put(field_46083[62], new class_9010(32, 8, 14357617))
      .put(field_46083[63], new class_9010(32, 8, 14357618))
      .put(field_46083[64], new class_9010(32, 8, 14357619))
      .put(field_46083[65], new class_9010(32, 8, 14357620))
      .put(field_46083[66], new class_9010(32, 8, 165745296))
      .put(field_46083[70], new class_9010(32, 5, 10387313))
      .put(field_46083[67], new class_9010(20, 11, 10387313))
      .put(field_46083[68], new class_9010(80, 20, 10387319))
      .build();

   public class_9002(Schema var1) {
      super(var1, true);
   }

   public TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         "WorldGenSettings building",
         this.getInputSchema().getType(class_4002.field_19441),
         var0 -> var0.update(DSL.remainderFinder(), class_9002::method_41318)
      );
   }

   private static <T> Dynamic<T> method_41315(long var0, DynamicLike<T> var2, Dynamic<T> var3, Dynamic<T> var4) {
      return var2.createMap(
         ImmutableMap.of(
            var2.createString("type"),
            var2.createString("minecraft:noise"),
            var2.createString("biome_source"),
            var4,
            var2.createString("seed"),
            var2.createLong(var0),
            var2.createString("settings"),
            var3
         )
      );
   }

   private static <T> Dynamic<T> method_41314(Dynamic<T> var0, long var1, boolean var3, boolean var4) {
      Builder var7 = ImmutableMap.builder()
         .put(var0.createString("type"), var0.createString("minecraft:vanilla_layered"))
         .put(var0.createString("seed"), var0.createLong(var1))
         .put(var0.createString("large_biomes"), var0.createBoolean(var4));
      if (var3) {
         var7.put(var0.createString("legacy_biome_init_layer"), var0.createBoolean(var3));
      }

      return var0.createMap(var7.build());
   }

   private static <T> Dynamic<T> method_41318(Dynamic<T> var0) {
      DynamicOps var3 = var0.getOps();
      long var4 = var0.get("RandomSeed").asLong(0L);
      Optional var6 = var0.get("generatorName").asString().map(var0x -> var0x.toLowerCase(Locale.ROOT)).result();
      Optional var7 = var0.get("legacy_custom_options")
         .asString()
         .result()
         .<Optional>map(Optional::of)
         .orElseGet(() -> !var6.equals(Optional.<String>of("customized")) ? Optional.empty() : var0.get("generatorOptions").asString().result());
      boolean var8 = false;
      Dynamic var9;
      if (var6.equals(Optional.<String>of("customized"))) {
         var9 = method_41310(var0, var4);
      } else if (!var6.isPresent()) {
         var9 = method_41310(var0, var4);
      } else {
         String var10 = (String)var6.get();
         switch (var10) {
            case "flat":
               OptionalDynamic var13 = var0.get("generatorOptions");
               Map var14 = method_41316(var3, var13);
               var9 = var0.createMap(
                  ImmutableMap.of(
                     var0.createString("type"),
                     var0.createString("minecraft:flat"),
                     var0.createString("settings"),
                     var0.createMap(
                        ImmutableMap.of(
                           var0.createString("structures"),
                           var0.createMap(var14),
                           var0.createString("layers"),
                           var13.get("layers")
                              .result()
                              .orElseGet(
                                 () -> var0.createList(
                                       Stream.<Dynamic>of(
                                          var0.createMap(
                                             ImmutableMap.of(
                                                var0.createString("height"),
                                                var0.createInt(1),
                                                var0.createString("block"),
                                                var0.createString("minecraft:bedrock")
                                             )
                                          ),
                                          var0.createMap(
                                             ImmutableMap.of(
                                                var0.createString("height"), var0.createInt(2), var0.createString("block"), var0.createString("minecraft:dirt")
                                             )
                                          ),
                                          var0.createMap(
                                             ImmutableMap.of(
                                                var0.createString("height"),
                                                var0.createInt(1),
                                                var0.createString("block"),
                                                var0.createString("minecraft:grass_block")
                                             )
                                          )
                                       )
                                    )
                              ),
                           var0.createString("biome"),
                           var0.createString(var13.get("biome").asString("minecraft:plains"))
                        )
                     )
                  )
               );
               break;
            case "debug_all_block_states":
               var9 = var0.createMap(ImmutableMap.of(var0.createString("type"), var0.createString("minecraft:debug")));
               break;
            case "buffet":
               OptionalDynamic var15 = var0.get("generatorOptions");
               OptionalDynamic var16 = var15.get("chunk_generator");
               Optional var17 = var16.get("type").asString().result();
               Dynamic var18;
               if (Objects.equals(var17, Optional.<String>of("minecraft:caves"))) {
                  var18 = var0.createString("minecraft:caves");
                  var8 = true;
               } else if (Objects.equals(var17, Optional.<String>of("minecraft:floating_islands"))) {
                  var18 = var0.createString("minecraft:floating_islands");
               } else {
                  var18 = var0.createString("minecraft:overworld");
               }

               Dynamic var19 = var15.get("biome_source")
                  .result()
                  .orElseGet(() -> var0.createMap(ImmutableMap.of(var0.createString("type"), var0.createString("minecraft:fixed"))));
               Dynamic var21;
               if (var19.get("type").asString().result().equals(Optional.<String>of("minecraft:fixed"))) {
                  String var27 = var19.get("options")
                     .get("biomes")
                     .asStream()
                     .findFirst()
                     .<String>flatMap(var0x -> var0x.asString().result())
                     .orElse("minecraft:ocean");
                  var21 = var19.remove("options").set("biome", var0.createString(var27));
               } else {
                  var21 = var19;
               }

               var9 = method_41315(var4, var0, var18, var21);
               break;
            default:
               boolean var20 = ((String)var6.get()).equals("default");
               boolean var22 = ((String)var6.get()).equals("default_1_1") || var20 && var0.get("generatorVersion").asInt(0) == 0;
               boolean var23 = ((String)var6.get()).equals("amplified");
               boolean var24 = ((String)var6.get()).equals("largebiomes");
               var9 = method_41315(var4, var0, var0.createString(var23 ? "minecraft:amplified" : "minecraft:overworld"), method_41314(var0, var4, var22, var24));
         }
      }

      boolean var25 = var0.get("MapFeatures").asBoolean(true);
      boolean var11 = var0.get("BonusChest").asBoolean(false);
      Builder var26 = ImmutableMap.builder();
      var26.put(var3.createString("seed"), var3.createLong(var4));
      var26.put(var3.createString("generate_features"), var3.createBoolean(var25));
      var26.put(var3.createString("bonus_chest"), var3.createBoolean(var11));
      var26.put(var3.createString("dimensions"), method_41312(var0, var4, var9, var8));
      var7.ifPresent(var2 -> var26.put(var3.createString("legacy_custom_options"), var3.createString(var2)));
      return new Dynamic(var3, var3.createMap(var26.build()));
   }

   public static <T> Dynamic<T> method_41310(Dynamic<T> var0, long var1) {
      return method_41315(var1, var0, var0.createString("minecraft:overworld"), method_41314(var0, var1, false, false));
   }

   public static <T> T method_41312(Dynamic<T> var0, long var1, Dynamic<T> var3, boolean var4) {
      DynamicOps var7 = var0.getOps();
      return (T)var7.createMap(
         ImmutableMap.of(
            var7.createString("minecraft:overworld"),
            var7.createMap(
               ImmutableMap.of(
                  var7.createString("type"),
                  var7.createString("minecraft:overworld" + (!var4 ? "" : "_caves")),
                  var7.createString("generator"),
                  var3.getValue()
               )
            ),
            var7.createString("minecraft:the_nether"),
            var7.createMap(
               ImmutableMap.of(
                  var7.createString("type"),
                  var7.createString("minecraft:the_nether"),
                  var7.createString("generator"),
                  method_41315(
                        var1,
                        var0,
                        var0.createString("minecraft:nether"),
                        var0.createMap(
                           ImmutableMap.of(
                              var0.createString("type"),
                              var0.createString("minecraft:multi_noise"),
                              var0.createString("seed"),
                              var0.createLong(var1),
                              var0.createString("preset"),
                              var0.createString("minecraft:nether")
                           )
                        )
                     )
                     .getValue()
               )
            ),
            var7.createString("minecraft:the_end"),
            var7.createMap(
               ImmutableMap.of(
                  var7.createString("type"),
                  var7.createString("minecraft:the_end"),
                  var7.createString("generator"),
                  method_41315(
                        var1,
                        var0,
                        var0.createString("minecraft:end"),
                        var0.createMap(
                           ImmutableMap.of(var0.createString("type"), var0.createString("minecraft:the_end"), var0.createString("seed"), var0.createLong(var1))
                        )
                     )
                     .getValue()
               )
            )
         )
      );
   }

   private static <T> Map<Dynamic<T>, Dynamic<T>> method_41316(DynamicOps<T> var0, OptionalDynamic<T> var1) {
      MutableInt var4 = new MutableInt(32);
      MutableInt var5 = new MutableInt(3);
      MutableInt var6 = new MutableInt(128);
      MutableBoolean var7 = new MutableBoolean(false);
      HashMap var8 = Maps.newHashMap();
      if (!var1.result().isPresent()) {
         var7.setTrue();
         var8.put("minecraft:village", field_46084.get("minecraft:village"));
      }

      var1.get("structures")
         .flatMap(Dynamic::getMapValues)
         .result()
         .ifPresent(var5x -> var5x.forEach((var5xx, var6x) -> var6x.getMapValues().result().ifPresent(var6xx -> var6xx.forEach((var6xxx, var7x) -> {
                     String var10 = var5xx.asString("");
                     String var11 = var6xxx.asString("");
                     String var12 = var7x.asString("");
                     if ("stronghold".equals(var10)) {
                        var7.setTrue();
                        switch (var11) {
                           case "distance":
                              var4.setValue(method_41317(var12, var4.getValue(), 1));
                              return;
                           case "spread":
                              var5.setValue(method_41317(var12, var5.getValue(), 1));
                              return;
                           case "count":
                              var6.setValue(method_41317(var12, var6.getValue(), 1));
                              return;
                        }
                     } else {
                        switch (var11) {
                           case "distance":
                              switch (var10) {
                                 case "village":
                                    method_41311(var8, "minecraft:village", var12, 9);
                                    return;
                                 case "biome_1":
                                    method_41311(var8, "minecraft:desert_pyramid", var12, 9);
                                    method_41311(var8, "minecraft:igloo", var12, 9);
                                    method_41311(var8, "minecraft:jungle_pyramid", var12, 9);
                                    method_41311(var8, "minecraft:swamp_hut", var12, 9);
                                    method_41311(var8, "minecraft:pillager_outpost", var12, 9);
                                    return;
                                 case "endcity":
                                    method_41311(var8, "minecraft:endcity", var12, 1);
                                    return;
                                 case "mansion":
                                    method_41311(var8, "minecraft:mansion", var12, 1);
                                    return;
                                 default:
                                    return;
                              }
                           case "separation":
                              if ("oceanmonument".equals(var10)) {
                                 class_9010 var15 = (class_9010)var8.getOrDefault("minecraft:monument", field_46084.get("minecraft:monument"));
                                 int var16 = method_41317(var12, class_9010.method_41343(var15), 1);
                                 var8.put("minecraft:monument", new class_9010(var16, class_9010.method_41343(var15), class_9010.method_41344(var15)));
                              }

                              return;
                           case "spacing":
                              if ("oceanmonument".equals(var10)) {
                                 method_41311(var8, "minecraft:monument", var12, 1);
                              }

                              return;
                        }
                     }
                  }))));
      Builder var9 = ImmutableMap.builder();
      var9.put(
         var1.createString("structures"),
         var1.createMap(
            var8.entrySet()
               .stream()
               .collect(Collectors.toMap(var1x -> var1.createString((String)var1x.getKey()), var1x -> ((class_9010)var1x.getValue()).method_41342(var0)))
         )
      );
      if (var7.isTrue()) {
         var9.put(
            var1.createString("stronghold"),
            var1.createMap(
               ImmutableMap.of(
                  var1.createString("distance"),
                  var1.createInt(var4.getValue()),
                  var1.createString("spread"),
                  var1.createInt(var5.getValue()),
                  var1.createString("count"),
                  var1.createInt(var6.getValue())
               )
            )
         );
      }

      return var9.build();
   }

   private static int method_41313(String var0, int var1) {
      return NumberUtils.toInt(var0, var1);
   }

   private static int method_41317(String var0, int var1, int var2) {
      return Math.max(var2, method_41313(var0, var1));
   }

   private static void method_41311(Map<String, class_9010> var0, String var1, String var2, int var3) {
      class_9010 var6 = (class_9010)var0.getOrDefault(var1, field_46084.get(var1));
      int var7 = method_41317(var2, class_9010.method_41346(var6), var3);
      var0.put(var1, new class_9010(var7, class_9010.method_41343(var6), class_9010.method_41344(var6)));
   }
}
