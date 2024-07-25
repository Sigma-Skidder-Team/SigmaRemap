package remapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongArrayList;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class class_4527 {
   private static final Map<String, String> field_22097 = Util.<Map<String, String>>method_44659(Maps.newHashMap(), var0 -> {
      var0.put("Village", "Village");
      var0.put("Mineshaft", "Mineshaft");
      var0.put("Mansion", "Mansion");
      var0.put("Igloo", "Temple");
      var0.put("Desert_Pyramid", "Temple");
      var0.put("Jungle_Pyramid", "Temple");
      var0.put("Swamp_Hut", "Temple");
      var0.put("Stronghold", "Stronghold");
      var0.put("Monument", "Monument");
      var0.put("Fortress", "Fortress");
      var0.put("EndCity", "EndCity");
   });
   private static final Map<String, String> field_22101 = Util.<Map<String, String>>method_44659(Maps.newHashMap(), var0 -> {
      var0.put("Iglu", "Igloo");
      var0.put("TeDP", "Desert_Pyramid");
      var0.put("TeJP", "Jungle_Pyramid");
      var0.put("TeSH", "Swamp_Hut");
   });
   private final boolean field_22098;
   private final Map<String, Long2ObjectMap<class_5734>> field_22103 = Maps.newHashMap();
   private final Map<String, class_4453> field_22099 = Maps.newHashMap();
   private final List<String> field_22102;
   private final List<String> field_22100;

   public class_4527(class_4050 var1, List<String> var2, List<String> var3) {
      this.field_22102 = var2;
      this.field_22100 = var3;
      this.method_21034(var1);
      boolean var6 = false;

      for (String var8 : this.field_22100) {
         var6 |= this.field_22103.get(var8) != null;
      }

      this.field_22098 = var6;
   }

   public void method_21035(long var1) {
      for (String var6 : this.field_22102) {
         class_4453 var7 = this.field_22099.get(var6);
         if (var7 != null && var7.method_20640(var1)) {
            var7.method_20639(var1);
            var7.method_32923();
         }
      }
   }

   public class_5734 method_21033(class_5734 var1) {
      class_5734 var4 = var1.method_25937("Level");
      class_2034 var5 = new class_2034(var4.method_25947("xPos"), var4.method_25947("zPos"));
      if (this.method_21031(var5.field_10328, var5.field_10327)) {
         var1 = this.method_21030(var1, var5);
      }

      class_5734 var6 = var4.method_25937("Structures");
      class_5734 var7 = var6.method_25937("References");

      for (String var9 : this.field_22100) {
         class_5390 var10 = (class_5390)class_5390.field_27500.get(var9.toLowerCase(Locale.ROOT));
         if (!var7.method_25939(var9, 12) && var10 != null) {
            byte var11 = 8;
            LongArrayList var12 = new LongArrayList();

            for (int var13 = var5.field_10328 - 8; var13 <= var5.field_10328 + 8; var13++) {
               for (int var14 = var5.field_10327 - 8; var14 <= var5.field_10327 + 8; var14++) {
                  if (this.method_21036(var13, var14, var9)) {
                     var12.add(class_2034.method_9540(var13, var14));
                  }
               }
            }

            var7.method_25961(var9, var12);
         }
      }

      var6.method_25946("References", var7);
      var4.method_25946("Structures", var6);
      var1.method_25946("Level", var4);
      return var1;
   }

   private boolean method_21036(int var1, int var2, String var3) {
      return !this.field_22098
         ? false
         : this.field_22103.get(var3) != null && this.field_22099.get(field_22097.get(var3)).method_20641(class_2034.method_9540(var1, var2));
   }

   private boolean method_21031(int var1, int var2) {
      if (this.field_22098) {
         for (String var6 : this.field_22100) {
            if (this.field_22103.get(var6) != null && this.field_22099.get(field_22097.get(var6)).method_20640(class_2034.method_9540(var1, var2))) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   private class_5734 method_21030(class_5734 var1, class_2034 var2) {
      class_5734 var5 = var1.method_25937("Level");
      class_5734 var6 = var5.method_25937("Structures");
      class_5734 var7 = var6.method_25937("Starts");

      for (String var9 : this.field_22100) {
         Long2ObjectMap var10 = this.field_22103.get(var9);
         if (var10 != null) {
            long var11 = var2.method_9539();
            if (this.field_22099.get(field_22097.get(var9)).method_20640(var11)) {
               class_5734 var13 = (class_5734)var10.get(var11);
               if (var13 != null) {
                  var7.method_25946(var9, var13);
               }
            }
         }
      }

      var6.method_25946("Starts", var7);
      var5.method_25946("Structures", var6);
      var1.method_25946("Level", var5);
      return var1;
   }

   private void method_21034(class_4050 var1) {
      if (var1 != null) {
         Iterator var4 = this.field_22102.iterator();

         while (true) {
            String var5;
            class_5734 var6;
            while (true) {
               if (!var4.hasNext()) {
                  return;
               }

               var5 = (String)var4.next();
               var6 = new class_5734();

               try {
                  var6 = var1.method_18704(var5, 1493).method_25937("data").method_25937("Features");
                  if (var6.method_25940()) {
                     continue;
                  }
               } catch (IOException var17) {
               }
               break;
            }

            for (String var8 : var6.method_25952()) {
               class_5734 var9 = var6.method_25937(var8);
               long var10 = class_2034.method_9540(var9.method_25947("ChunkX"), var9.method_25947("ChunkZ"));
               class_3416 var12 = var9.method_25927("Children", 10);
               if (!var12.isEmpty()) {
                  String var13 = var12.method_15764(0).method_25965("id");
                  String var14 = field_22101.get(var13);
                  if (var14 != null) {
                     var9.method_25941("id", var14);
                  }
               }

               String var22 = var9.method_25965("id");
               this.field_22103.computeIfAbsent(var22, var0 -> new Long2ObjectOpenHashMap()).put(var10, var9);
            }

            String var18 = var5 + "_index";
            class_4453 var19 = var1.<class_4453>method_18708(() -> new class_4453(var18), var18);
            if (!var19.method_20643().isEmpty()) {
               this.field_22099.put(var5, var19);
            } else {
               class_4453 var20 = new class_4453(var18);
               this.field_22099.put(var5, var20);

               for (String var16 : var6.method_25952()) {
                  class_5734 var21 = var6.method_25937(var16);
                  var20.method_20642(class_2034.method_9540(var21.method_25947("ChunkX"), var21.method_25947("ChunkZ")));
               }

               var20.method_32923();
            }
         }
      }
   }

   public static class_4527 method_21032(class_5621<World> var0, class_4050 var1) {
      if (var0 != World.field_33048) {
         if (var0 != World.field_33029) {
            if (var0 != World.field_33038) {
               throw new RuntimeException(String.format("Unknown dimension type : %s", var0));
            } else {
               ImmutableList var5 = ImmutableList.of("EndCity");
               return new class_4527(var1, var5, var5);
            }
         } else {
            ImmutableList var4 = ImmutableList.of("Fortress");
            return new class_4527(var1, var4, var4);
         }
      } else {
         return new class_4527(
            var1,
            ImmutableList.of("Monument", "Stronghold", "Village", "Mineshaft", "Temple", "Mansion"),
            ImmutableList.of("Village", "Mineshaft", "Mansion", "Igloo", "Desert_Pyramid", "Jungle_Pyramid", "Swamp_Hut", "Stronghold", "Monument")
         );
      }
   }
}
