package remapped;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;

public class class_7943 {
   private static final class_8035[] field_40655 = new class_8035[0];
   public static class_9790 field_40653;
   public static Int2ObjectMap<String> field_40660 = new Int2ObjectOpenHashMap(8582, 1.0F);
   public static Map<String, Integer> field_40659 = new HashMap<String, Integer>(8582, 1.0F);
   public static Int2ObjectMap<class_111> field_40656 = new Int2ObjectOpenHashMap(1);
   public static Int2ObjectMap<class_6772> field_40654 = new Int2ObjectOpenHashMap(1);
   public static IntSet field_40657 = new IntOpenHashSet(377, 1.0F);

   public static void method_35972(class_1455 var0, class_9371 var1) {
      for (class_2391 var7 : class_2391.values()) {
         class_9371 var8 = var1.method_43341(var7);
         int var9 = field_40653.method_45194(var0, var8.method_43340(), var8.method_43342(), var8.method_43343());
         class_111 var10 = (class_111)field_40656.get(var9);
         if (var10 != null) {
            int var11 = var10.method_340(var0, var8, var9);
            class_5051 var12 = new class_5051(11, null, var0);
            var12.method_23236(class_8039.field_41137, var8);
            var12.method_23236(class_8039.field_41157, var11);

            try {
               var12.method_23235(class_8633.class, true, true);
            } catch (Exception var14) {
               var14.printStackTrace();
            }
         }
      }
   }

   public static void method_35974(class_1455 var0, int var1, int var2, int var3) {
      for (int var6 = -1; var6 <= 1; var6++) {
         for (int var7 = -1; var7 <= 1; var7++) {
            if (Math.abs(var6) + Math.abs(var7) != 0) {
               ArrayList var8 = new ArrayList();
               if (Math.abs(var6) + Math.abs(var7) == 2) {
                  for (int var9 = var3 * 16; var9 < var3 * 16 + 16; var9++) {
                     int var10 = var6 == 1 ? 0 : 15;
                     int var11 = var7 == 1 ? 0 : 15;
                     method_35971(var0, new class_9371((var1 + var6 << 4) + var10, (short)var9, (var2 + var7 << 4) + var11), var8);
                  }
               } else {
                  for (int var17 = var3 * 16; var17 < var3 * 16 + 16; var17++) {
                     byte var12;
                     byte var13;
                     byte var19;
                     byte var20;
                     if (var6 == 1) {
                        var19 = 0;
                        var20 = 2;
                        var12 = 0;
                        var13 = 16;
                     } else if (var6 == -1) {
                        var19 = 14;
                        var20 = 16;
                        var12 = 0;
                        var13 = 16;
                     } else if (var7 == 1) {
                        var19 = 0;
                        var20 = 16;
                        var12 = 0;
                        var13 = 2;
                     } else {
                        var19 = 0;
                        var20 = 16;
                        var12 = 14;
                        var13 = 16;
                     }

                     for (int var14 = var19; var14 < var20; var14++) {
                        for (int var15 = var12; var15 < var13; var15++) {
                           method_35971(var0, new class_9371((var1 + var6 << 4) + var14, (short)var17, (var2 + var7 << 4) + var15), var8);
                        }
                     }
                  }
               }

               if (!var8.isEmpty()) {
                  class_5051 var18 = new class_5051(15, null, var0);
                  var18.method_23236(class_8039.field_41179, var1 + var6);
                  var18.method_23236(class_8039.field_41179, var2 + var7);
                  var18.method_23236(class_8039.field_41154, var8.<class_9523>toArray(field_40655));

                  try {
                     var18.method_23235(class_8633.class, true, true);
                  } catch (Exception var16) {
                     var16.printStackTrace();
                  }
               }
            }
         }
      }
   }

   public static void method_35971(class_1455 var0, class_9371 var1, List<class_8035> var2) {
      int var5 = field_40653.method_45194(var0, var1.method_43340(), var1.method_43342(), var1.method_43343());
      class_111 var6 = method_35961(var5);
      if (var6 != null) {
         int var7 = var6.method_340(var0, var1, var5);
         var2.add(new class_8035(var1.method_43340() & 15, var1.method_43342(), var1.method_43343() & 15, var7));
      }
   }

   public static void method_35960(class_1455 var0, int var1, int var2, int var3, int var4) {
      if (method_35965()) {
         if (!method_35966(var4)) {
            field_40653.method_45189(var0, var1, var2, var3);
         } else {
            field_40653.method_45187(var0, var1, var2, var3, var4);
         }
      }
   }

   public static void method_35967(class_1455 var0) {
      if (method_35965()) {
         field_40653.method_45192(var0);
      }
   }

   public static boolean method_35965() {
      return field_40653.method_45188();
   }

   public static void method_35963(class_1455 var0, class_6545 var1) {
      long var4 = (long)(var1.method_29858() << 4);
      long var6 = (long)(var1.method_29860() << 4);

      for (int var8 = 0; var8 < var1.method_29869().length; var8++) {
         class_3929 var9 = var1.method_29869()[var8];
         if (var9 != null) {
            boolean var10 = false;

            for (int var11 = 0; var11 < var9.method_18193(); var11++) {
               int var15 = var9.method_18168(var11);
               if (method_35964(var15)) {
                  var10 = true;
                  break;
               }
            }

            if (var10) {
               long var12 = (long)(var8 << 4);

               for (int var14 = 0; var14 < 16; var14++) {
                  for (int var16 = 0; var16 < 16; var16++) {
                     for (int var17 = 0; var17 < 16; var17++) {
                        int var18 = var9.method_18186(var17, var14, var16);
                        class_111 var19 = method_35961(var18);
                        if (var19 != null) {
                           var18 = var19.method_340(
                              var0, new class_9371((int)(var4 + (long)var17), (short)((int)(var12 + (long)var14)), (int)(var6 + (long)var16)), var18
                           );
                           var9.method_18182(var17, var14, var16, var18);
                        }
                     }
                  }
               }
            }
         }
      }
   }

   public static void method_35970() {
      if (class_3446.method_15884().method_25803()) {
         class_3446.method_15886().method_34617().info("Loading block connection mappings ...");
         JsonObject var2 = class_3792.method_17614("mapping-1.13.json", true);
         JsonObject var3 = var2.getAsJsonObject("blockstates");

         for (Entry var5 : var3.entrySet()) {
            int var6 = Integer.parseInt((String)var5.getKey());
            String var7 = ((JsonElement)var5.getValue()).getAsString();
            field_40660.put(var6, var7);
            field_40659.put(var7, var6);
         }

         field_40656 = new Int2ObjectOpenHashMap(3650, 1.0F);
         if (!class_3446.method_15884().method_25809()) {
            field_40654 = new Int2ObjectOpenHashMap(1146, 1.0F);
            JsonObject var19 = class_3792.method_17613("blockConnections.json");

            for (Entry var23 : var19.entrySet()) {
               int var26 = field_40659.get(var23.getKey());
               class_6772 var8 = new class_6772();

               for (Entry var10 : ((JsonElement)var23.getValue()).getAsJsonObject().entrySet()) {
                  String var11 = (String)var10.getKey();
                  JsonObject var12 = ((JsonElement)var10.getValue()).getAsJsonObject();
                  boolean[] var13 = new boolean[6];

                  for (class_2391 var17 : class_2391.values()) {
                     String var18 = var17.toString().toLowerCase(Locale.ROOT);
                     if (var12.has(var18)) {
                        var13[var17.ordinal()] = var12.getAsJsonPrimitive(var18).getAsBoolean();
                     }
                  }

                  var8.method_31082(var11, var13);
               }

               if (((String)var23.getKey()).contains("stairs")) {
                  var8.method_31082("allFalseIfStairPre1_12", new boolean[6]);
               }

               field_40654.put(var26, var8);
            }
         }

         JsonObject var20 = class_3792.method_17613("blockData.json");

         for (JsonElement var27 : var20.getAsJsonArray("occluding")) {
            field_40657.add(field_40659.get(var27.getAsString()));
         }

         ArrayList var25 = new ArrayList();
         var25.add(class_8045.method_36512());
         var25.addAll(class_3719.method_17253());
         var25.add(class_1858.method_8234());
         var25.addAll(class_3016.method_13788());
         var25.add(class_5470.method_24882());
         var25.addAll(class_422.method_2093());
         var25.add(class_3963.method_18312());
         var25.add(class_9508.method_43881());
         var25.add(class_4654.method_21523());
         var25.add(class_4222.method_19663());
         var25.add(class_5447.method_24830());
         var25.addAll(class_7715.method_34907());
         var25.add(class_4239.method_19775());
         var25.add(class_8640.method_39644());
         var25.add(class_5897.method_26964());
         if (class_3446.method_15884().method_25823()) {
            var25.add(class_2671.method_12035());
         }

         for (String var29 : field_40659.keySet()) {
            class_9297 var30 = class_9297.method_42781(var29);

            for (class_3590 var32 : var25) {
               var32.method_16783(var30);
            }
         }

         if (class_3446.method_15884().method_25834().equalsIgnoreCase("packet")) {
            field_40653 = new class_6976();
            class_3446.method_15883().method_33743().method_24491(class_9790.class, field_40653);
         }
      }
   }

   public static boolean method_35966(int var0) {
      return field_40654.containsKey(var0) || field_40656.containsKey(var0);
   }

   public static boolean method_35964(int var0) {
      return field_40656.containsKey(var0);
   }

   public static int method_35968(class_1455 var0, class_9371 var1, int var2) {
      class_111 var5 = (class_111)field_40656.get(var2);
      return var5 == null ? var2 : var5.method_340(var0, var1, var2);
   }

   public static class_111 method_35961(int var0) {
      return (class_111)field_40656.get(var0);
   }

   public static int method_35969(String var0) {
      return field_40659.getOrDefault(var0, -1);
   }

   public static String method_35973(int var0) {
      return (String)field_40660.get(var0);
   }
}
