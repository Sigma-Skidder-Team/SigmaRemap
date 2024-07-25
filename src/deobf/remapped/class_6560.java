package remapped;

import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import javax.annotation.Nullable;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.tuple.Triple;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_6560 {
   public static final class_2843 field_33455 = new class_2843(class_8359.field_42824, new Identifier("block/fire_0"));
   public static final class_2843 field_33441 = new class_2843(class_8359.field_42824, new Identifier("block/fire_1"));
   public static final class_2843 field_33438 = new class_2843(class_8359.field_42824, new Identifier("block/lava_flow"));
   public static final class_2843 field_33450 = new class_2843(class_8359.field_42824, new Identifier("block/water_flow"));
   public static final class_2843 field_33464 = new class_2843(class_8359.field_42824, new Identifier("block/water_overlay"));
   public static final class_2843 field_33431 = new class_2843(class_8359.field_42824, new Identifier("entity/banner_base"));
   public static final class_2843 field_33440 = new class_2843(class_8359.field_42824, new Identifier("entity/shield_base"));
   public static final class_2843 field_33457 = new class_2843(class_8359.field_42824, new Identifier("entity/shield_base_nopattern"));
   public static final List<Identifier> field_33432 = IntStream.range(0, 10)
      .<Identifier>mapToObj(var0 -> new Identifier("block/destroy_stage_" + var0))
      .collect(Collectors.<Identifier>toList());
   public static final List<Identifier> field_33451 = field_33432.stream()
      .<Identifier>map(var0 -> new Identifier("textures/" + var0.method_21456() + ".png"))
      .collect(Collectors.<Identifier>toList());
   public static final List<RenderLayer> field_33452 = field_33451.stream().<RenderLayer>map(RenderLayer::method_16719).collect(Collectors.<RenderLayer>toList());
   private static final Set<class_2843> field_33456 = Util.<Set<class_2843>>make(Sets.newHashSet(), var0 -> {
      var0.add(field_33450);
      var0.add(field_33438);
      var0.add(field_33464);
      var0.add(field_33455);
      var0.add(field_33441);
      var0.add(class_5420.field_27614);
      var0.add(class_5611.field_28488);
      var0.add(class_5611.field_28487);
      var0.add(class_5611.field_28480);
      var0.add(class_5611.field_28479);
      var0.add(class_5611.field_28482);
      var0.add(class_5611.field_28478);
      var0.add(class_4293.field_20829);
      var0.add(field_33431);
      var0.add(field_33440);
      var0.add(field_33457);

      for (Identifier var4 : field_33432) {
         var0.add(new class_2843(class_8359.field_42824, var4));
      }

      var0.add(new class_2843(class_8359.field_42824, class_3683.field_18048));
      var0.add(new class_2843(class_8359.field_42824, class_3683.field_18058));
      var0.add(new class_2843(class_8359.field_42824, class_3683.field_18050));
      var0.add(new class_2843(class_8359.field_42824, class_3683.field_18053));
      var0.add(new class_2843(class_8359.field_42824, class_3683.field_18055));
      class_5276.method_24069(var0::add);
   });
   private static final Logger field_33453 = LogManager.getLogger();
   public static final class_454 field_33445 = new class_454("builtin/missing", "missing");
   private static final String field_33446 = field_33445.toString();
   public static final String field_33465 = ("{    'textures': {       'particle': '"
         + class_2008.method_9327().method_21456()
         + "',       'missingno': '"
         + class_2008.method_9327().method_21456()
         + "'    },    'elements': [         {  'from': [ 0, 0, 0 ],            'to': [ 16, 16, 16 ],            'faces': {                'down':  { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'down',  'texture': '#missingno' },                'up':    { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'up',    'texture': '#missingno' },                'north': { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'north', 'texture': '#missingno' },                'south': { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'south', 'texture': '#missingno' },                'west':  { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'west',  'texture': '#missingno' },                'east':  { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'east',  'texture': '#missingno' }            }        }    ]}")
      .replace('\'', '"');
   private static final Map<String, String> field_33442 = Maps.newHashMap(ImmutableMap.of("missing", field_33465));
   private static final Splitter field_33443 = Splitter.on(',');
   private static final Splitter field_33466 = Splitter.on('=').limit(2);
   public static final class_9403 field_33462 = Util.<class_9403>make(
      class_9403.method_43560("{\"gui_light\": \"front\"}"), var0 -> var0.field_48083 = "generation marker"
   );
   public static final class_9403 field_33459 = Util.<class_9403>make(
      class_9403.method_43560("{\"gui_light\": \"side\"}"), var0 -> var0.field_48083 = "block entity marker"
   );
   private static final class_8021<class_6414, class_2522> field_33434 = new class_2203<class_6414, class_2522>(class_4783.field_23184)
      .method_10162(class_6720.method_30845("map"))
      .method_10164(class_6414::method_29260, class_2522::new);
   private static final class_4644 field_33458 = new class_4644();
   private static final Map<Identifier, class_8021<class_6414, class_2522>> field_33435 = ImmutableMap.of(new Identifier("item_frame"), field_33434);
   private final class_7832 field_33463;
   private class_6885 field_33444;
   private final class_4468 field_33460;
   private final Set<Identifier> field_33448 = Sets.newHashSet();
   private final class_9695 field_33437 = new class_9695();
   private final Map<Identifier, class_2053> field_33436 = Maps.newHashMap();
   private final Map<Triple<Identifier, class_1221, Boolean>, class_7373> field_33461 = Maps.newHashMap();
   private final Map<Identifier, class_2053> field_33433 = Maps.newHashMap();
   private final Map<Identifier, class_7373> field_33449 = Maps.newHashMap();
   private Map<Identifier, Pair<class_8359, class_3930>> field_33430;
   private int field_33454 = 1;
   private final Object2IntMap<class_2522> field_33447 = Util.<Object2IntMap<class_2522>>make(
      new Object2IntOpenHashMap(), var0 -> var0.defaultReturnValue(-1)
   );
   public Map<Identifier, class_2053> field_33467;

   public class_6560(class_7832 var1, class_4468 var2, class_3492 var3, int var4) {
      this(var1, var2, true);
      this.method_29955(var3, var4);
   }

   public class_6560(class_7832 var1, class_4468 var2, boolean var3) {
      this.field_33463 = var1;
      this.field_33460 = var2;
   }

   public void method_29955(class_3492 var1, int var2) {
      class_7860.field_40039.method_3590();
      var1.startSection("missing_model");

      try {
         this.field_33436.put(field_33445, this.method_29952(field_33445));
         this.method_29953(field_33445);
      } catch (IOException var12) {
         field_33453.error("Error loading missing model, should never happen :(", var12);
         throw new RuntimeException(var12);
      }

      var1.method_16050("static_definitions");
      field_33435.forEach((var1x, var2x) -> var2x.method_36441().forEach(var2xx -> this.method_29953(class_9524.method_43942(var1x, var2xx))));
      var1.method_16050("blocks");

      for (class_6414 var6 : class_8669.field_44462) {
         var6.method_29306().method_36441().forEach(var1x -> this.method_29953(class_9524.method_43941(var1x)));
      }

      var1.method_16050("items");

      for (Identifier var16 : class_8669.field_44382.method_39805()) {
         this.method_29953(new class_454(var16, "inventory"));
      }

      var1.method_16050("special");
      this.method_29953(new class_454("minecraft:trident_in_hand#inventory"));

      for (Identifier var17 : this.method_29946()) {
         this.method_29942(var17);
      }

      var1.method_16050("textures");
      this.field_33467 = this.field_33436;
      class_5525.method_25066(this);
      LinkedHashSet var15 = Sets.newLinkedHashSet();
      Set var18 = this.field_33433
         .values()
         .stream()
         .<class_2843>flatMap(var2x -> var2x.method_9591(this::method_29951, var15).stream())
         .collect(Collectors.toSet());
      var18.addAll(field_33456);
      class_7860.method_35556(class_7860.field_40122, var18);
      var15.stream()
         .filter(var0 -> !((String)var0.getSecond()).equals(field_33446))
         .forEach(var0 -> field_33453.warn("Unable to resolve texture reference: {} in {}", var0.getFirst(), var0.getSecond()));
      Map var7 = var18.stream().collect(Collectors.groupingBy(class_2843::method_12946));
      var1.method_16050("stitching");
      this.field_33430 = Maps.newHashMap();

      for (Entry var9 : var7.entrySet()) {
         class_8359 var10 = new class_8359((Identifier)var9.getKey());
         class_3930 var11 = var10.method_38516(this.field_33463, ((List)var9.getValue()).stream().<Identifier>map(class_2843::method_12948), var1, var2);
         this.field_33430.put((Identifier)var9.getKey(), Pair.of(var10, var11));
      }

      var1.endSection();
   }

   public class_6885 method_29938(TextureManager var1, class_3492 var2) {
      var2.startSection("atlas");

      for (Pair var6 : this.field_33430.values()) {
         class_8359 var7 = (class_8359)var6.getFirst();
         class_3930 var8 = (class_3930)var6.getSecond();
         var7.method_38520(var8);
         var1.method_35682(var7.method_38519(), var7);
         var1.bindTexture(var7.method_38519());
         var7.method_38521(var8);
      }

      this.field_33444 = new class_6885(this.field_33430.values().stream().<class_8359>map(Pair::getFirst).collect(Collectors.<class_8359>toList()));
      var2.method_16050("baking");
      this.field_33433.keySet().forEach(var1x -> {
         class_7373 var4 = null;

         try {
            var4 = this.method_29939(var1x, class_7507.field_38322);
         } catch (Exception var6x) {
            field_33453.warn("Unable to bake model: '{}': {}", var1x, var6x);
         }

         if (var4 != null) {
            this.field_33449.put(var1x, var4);
         }
      });
      var2.endSection();
      return this.field_33444;
   }

   private static Predicate<class_2522> method_29937(class_8021<class_6414, class_2522> var0, String var1) {
      HashMap var4 = Maps.newHashMap();

      for (String var6 : field_33443.split(var1)) {
         Iterator var7 = field_33466.split(var6).iterator();
         if (var7.hasNext()) {
            String var8 = (String)var7.next();
            class_5019 var9 = var0.method_36440(var8);
            if (var9 != null && var7.hasNext()) {
               String var10 = (String)var7.next();
               Comparable var11 = method_29947(var9, var10);
               if (var11 == null) {
                  throw new RuntimeException("Unknown value: '" + var10 + "' for blockstate property: '" + var8 + "' " + var9.method_23105());
               }

               var4.put(var9, var11);
            } else if (!var8.isEmpty()) {
               throw new RuntimeException("Unknown blockstate property: '" + var8 + "'");
            }
         }
      }

      class_6414 var12 = (class_6414)var0.method_36442();
      return var2 -> {
         if (var2 != null && var12 == var2.method_8360()) {
            for (Entry var6x : var4.entrySet()) {
               if (!Objects.equals(var2.method_10313((class_5019)var6x.getKey()), var6x.getValue())) {
                  return false;
               }
            }

            return true;
         } else {
            return false;
         }
      };
   }

   @Nullable
   public static <T extends Comparable<T>> T method_29947(class_5019<T> var0, String var1) {
      return (T)var0.method_23108(var1).orElse(null);
   }

   public class_2053 method_29951(Identifier var1) {
      if (this.field_33436.containsKey(var1)) {
         return this.field_33436.get(var1);
      } else if (this.field_33448.contains(var1)) {
         throw new IllegalStateException("Circular reference while loading " + var1);
      } else {
         this.field_33448.add(var1);
         class_2053 var4 = this.field_33436.get(field_33445);

         while (!this.field_33448.isEmpty()) {
            Identifier var5 = this.field_33448.iterator().next();

            try {
               if (!this.field_33436.containsKey(var5)) {
                  this.method_29948(var5);
               }
            } catch (class_1383 var11) {
               field_33453.warn(var11.getMessage());
               this.field_33436.put(var5, var4);
            } catch (Exception var12) {
               field_33453.warn("Unable to load model: '{}' referenced from: {}: {}", var5, var1);
               field_33453.warn(var12.getClass().getName() + ": " + var12.getMessage());
               this.field_33436.put(var5, var4);
            } finally {
               this.field_33448.remove(var5);
            }
         }

         return this.field_33436.getOrDefault(var1, var4);
      }
   }

   private void method_29948(Identifier var1) throws Exception {
      if (!(var1 instanceof class_454)) {
         this.method_29940(var1, this.method_29952(var1));
      } else {
         class_454 var4 = (class_454)var1;
         if (!Objects.equals(var4.method_2184(), "inventory")) {
            Identifier var31 = new Identifier(var1.method_21461(), var1.method_21456());
            class_8021 var32 = Optional.<class_8021<class_6414, class_2522>>ofNullable(field_33435.get(var31))
               .orElseGet(() -> class_8669.field_44462.method_39806(var31).method_29306());
            this.field_33437.method_44799(var32);
            ImmutableList var33 = ImmutableList.copyOf(this.field_33460.method_20746((class_6414)var32.method_36442()));
            ImmutableList var8 = var32.method_36441();
            HashMap var9 = Maps.newHashMap();
            var8.forEach(var2 -> {
               class_2522 var5x = var9.put(class_9524.method_43942(var31, var2), var2);
            });
            HashMap var10 = Maps.newHashMap();
            Identifier var11 = new Identifier(var1.method_21461(), "blockstates/" + var1.method_21456() + ".json");
            class_2053 var12 = this.field_33436.get(field_33445);
            class_8198 var13 = new class_8198(ImmutableList.of(var12), ImmutableList.of());
            Pair var14 = Pair.of(var12, (Supplier<class_8198>)() -> var13);

            try {
               List var15;
               try {
                  var15 = this.field_33463
                     .method_35457(var11)
                     .stream()
                     .<Pair>map(
                        var1x -> {
                           try (InputStream var4x = var1x.method_18576()) {
                              return Pair.of(
                                 var1x.method_18579(), class_6751.method_30946(this.field_33437, new InputStreamReader(var4x, StandardCharsets.UTF_8))
                              );
                           } catch (Exception var18x) {
                              throw new class_1383(
                                 String.format(
                                    "Exception loading blockstate definition: '%s' in resourcepack: '%s': %s",
                                    var1x.method_18578(),
                                    var1x.method_18579(),
                                    var18x.getMessage()
                                 )
                              );
                           }
                        }
                     )
                     .collect(Collectors.toList());
               } catch (IOException var27) {
                  field_33453.warn("Exception loading blockstate definition: {}: {}", var11, var27);
                  return;
               }

               for (Pair var17 : var15) {
                  class_6751 var18 = (class_6751)var17.getSecond();
                  IdentityHashMap var19 = Maps.newIdentityHashMap();
                  class_9846 var20;
                  if (var18.method_30948()) {
                     var20 = var18.method_30949();
                     var8.forEach(var3 -> {
                        Pair var6x = var19.put(var3, Pair.of(var20, (Supplier<class_8198>)() -> class_8198.method_37556(var3, var20, var33)));
                     });
                  } else {
                     var20 = null;
                  }

                  var18.method_30947()
                     .forEach(
                        (var9x, var10x) -> {
                           try {
                              var8.stream()
                                 .filter(method_29937(var32, var9x))
                                 .forEach(
                                    var6xx -> {
                                       Pair var9xx = var19.put(
                                          var6xx, Pair.of(var10x, (Supplier<class_8198>)() -> class_8198.method_37555(var6xx, var10x, var33))
                                       );
                                       if (var9xx != null && var9xx.getFirst() != var20) {
                                          var19.put(var6xx, var14);
                                          throw new RuntimeException(
                                             "Overlapping definition with: "
                                                + var18.method_30947()
                                                   .entrySet()
                                                   .stream()
                                                   .filter(var1xxx -> var1xxx.getValue() == var9xx.getFirst())
                                                   .findFirst()
                                                   .get()
                                                   .getKey()
                                          );
                                       }
                                    }
                                 );
                           } catch (Exception var14x) {
                              field_33453.warn(
                                 "Exception loading blockstate definition: '{}' in resourcepack: '{}' for variant: '{}': {}",
                                 var11,
                                 var17.getFirst(),
                                 var9x,
                                 var14x.getMessage()
                              );
                           }
                        }
                     );
                  var10.putAll(var19);
               }

               return;
            } catch (class_1383 var28) {
               throw var28;
            } catch (Exception var29) {
               throw new class_1383(String.format("Exception loading blockstate definition: '%s': %s", var11, var29));
            } finally {
               HashMap var22 = Maps.newHashMap();
               var9.forEach((var5x, var6x) -> {
                  Pair var9x = (Pair)var10.get(var6x);
                  if (var9x == null) {
                     field_33453.warn("Exception loading blockstate definition: '{}' missing model for variant: '{}'", var11, var5x);
                     var9x = var14;
                  }

                  this.method_29940(var5x, (class_2053)var9x.getFirst());

                  try {
                     class_8198 var10x = (class_8198)((Supplier)var9x.getSecond()).get();
                     var22.computeIfAbsent(var10x, var0 -> Sets.newIdentityHashSet()).add(var6x);
                  } catch (Exception var11x) {
                     field_33453.warn("Exception evaluating model definition: '{}'", var5x, var11x);
                  }
               });
               var22.forEach((var1x, var2) -> {
                  Iterator var5x = ((Set)var2).iterator();

                  while (var5x.hasNext()) {
                     class_2522 var6x = (class_2522)var5x.next();
                     if (var6x.method_8352() != class_7537.field_38469) {
                        var5x.remove();
                        this.field_33447.put(var6x, 0);
                     }
                  }

                  if (((Set)var2).size() > 1) {
                     this.method_29950((Set)var2);
                  }
               });
            }
         }

         Identifier var5 = new Identifier(var1.method_21461(), "item/" + var1.method_21456());
         String var6 = var1.method_21456();
         if (var6.startsWith("optifine/") || var6.startsWith("item/")) {
            var5 = var1;
         }

         class_9403 var7 = this.method_29952(var5);
         this.method_29940(var4, var7);
         this.field_33436.put(var5, var7);
      }
   }

   private void method_29940(Identifier var1, class_2053 var2) {
      this.field_33436.put(var1, var2);
      this.field_33448.addAll(var2.method_9589());
   }

   private void method_29942(Identifier var1) {
      class_2053 var4 = this.method_29951(var1);
      this.field_33436.put(var1, var4);
      this.field_33433.put(var1, var4);
   }

   public void method_29953(class_454 var1) {
      class_2053 var4 = this.method_29951(var1);
      this.field_33436.put(var1, var4);
      this.field_33433.put(var1, var4);
   }

   private void method_29950(Iterable<class_2522> var1) {
      int var4 = this.field_33454++;
      var1.forEach(var2 -> this.field_33447.put(var2, var4));
   }

   @Nullable
   public class_7373 method_29939(Identifier var1, class_5598 var2) {
      return this.method_29949(var1, var2, this.field_33444::method_31568);
   }

   public class_7373 method_29949(Identifier var1, class_5598 var2, Function<class_2843, class_5155> var3) {
      Triple var6 = Triple.of(var1, var2.method_25403(), var2.method_25404());
      if (!this.field_33461.containsKey(var6)) {
         if (this.field_33444 != null) {
            class_2053 var7 = this.method_29951(var1);
            if (var7 instanceof class_9403) {
               class_9403 var8 = (class_9403)var7;
               if (var8.method_43567() == field_33462) {
                  if (!class_7860.field_40161.method_45472()) {
                     return field_33458.method_21483(this.field_33444::method_31568, var8)
                        .method_43561(this, var8, this.field_33444::method_31568, var2, var1, false);
                  }

                  return field_33458.method_21483(var3, var8).method_43561(this, var8, var3, var2, var1, false);
               }
            }

            class_7373 var9 = var7.method_9590(this, this.field_33444::method_31568, var2, var1);
            if (class_7860.field_40161.method_45472()) {
               var9 = var7.method_9590(this, var3, var2, var1);
            }

            this.field_33461.put(var6, var9);
            return var9;
         } else {
            throw new IllegalStateException("bake called too early");
         }
      } else {
         return this.field_33461.get(var6);
      }
   }

   private class_9403 method_29952(Identifier var1) throws IOException {
      Object var4 = null;
      class_4038 var5 = null;

      class_9403 var10;
      try {
         String var6 = var1.method_21456();
         Identifier var7 = var1;
         if ("builtin/generated".equals(var6)) {
            return field_33462;
         }

         if ("builtin/entity".equals(var6)) {
            return field_33459;
         }

         if (var6.startsWith("builtin/")) {
            String var8 = var6.substring("builtin/".length());
            String var9 = field_33442.get(var8);
            if (var9 == null) {
               throw new FileNotFoundException(var1.toString());
            }

            var4 = new StringReader(var9);
         } else {
            var7 = this.method_29956(var1);
            var5 = this.field_33463.method_35458(var7);
            var4 = new InputStreamReader(var5.method_18576(), StandardCharsets.UTF_8);
         }

         class_9403 var15 = class_9403.method_43559((Reader)var4);
         var15.field_48083 = var1.toString();
         String var17 = class_5525.method_25091(var7.method_21456());
         method_29957(var15, var17);
         var10 = var15;
      } finally {
         IOUtils.closeQuietly((Reader)var4);
         IOUtils.closeQuietly(var5);
      }

      return var10;
   }

   public Map<Identifier, class_7373> method_29936() {
      return this.field_33449;
   }

   public Object2IntMap<class_2522> method_29944() {
      return this.field_33447;
   }

   private Identifier method_29956(Identifier var1) {
      String var4 = var1.method_21456();
      if (!var4.startsWith("optifine/")) {
         return new Identifier(var1.method_21461(), "models/" + var1.method_21456() + ".json");
      } else {
         if (!var4.endsWith(".json")) {
            var1 = new Identifier(var1.method_21461(), var4 + ".json");
         }

         return var1;
      }
   }

   public static void method_29957(class_9403 var0, String var1) {
      Identifier var4 = method_29945(var0.field_48072, var1);
      if (var4 != var0.field_48072) {
         var0.field_48072 = var4;
      }

      if (var0.field_48076 != null) {
         for (Entry var6 : var0.field_48076.entrySet()) {
            Either var7 = (Either)var6.getValue();
            Optional var8 = var7.left();
            if (var8.isPresent()) {
               class_2843 var9 = (class_2843)var8.get();
               Identifier var10 = var9.method_12948();
               String var11 = var10.method_21456();
               String var12 = method_29954(var11, var1);
               if (!var12.equals(var11)) {
                  Identifier var13 = new Identifier(var10.method_21461(), var12);
                  class_2843 var14 = new class_2843(var9.method_12946(), var13);
                  Either var15 = Either.left(var14);
                  var6.setValue(var15);
               }
            }
         }
      }
   }

   public static Identifier method_29945(Identifier var0, String var1) {
      if (var0 != null && var1 != null) {
         if (var0.method_21461().equals("minecraft")) {
            String var4 = var0.method_21456();
            String var5 = method_29954(var4, var1);
            if (var5 != var4) {
               var0 = new Identifier(var0.method_21461(), var5);
            }

            return var0;
         } else {
            return var0;
         }
      } else {
         return var0;
      }
   }

   private static String method_29954(String var0, String var1) {
      var0 = class_5525.method_25096(var0, var1);
      var0 = class_8251.method_37822(var0, ".json");
      return class_8251.method_37822(var0, ".png");
   }

   public Set<Identifier> method_29946() {
      return Collections.<Identifier>emptySet();
   }

   public class_6885 method_29943() {
      return this.field_33444;
   }
}
