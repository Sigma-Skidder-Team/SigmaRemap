package mapped;

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

public class Class9322 {
   private static final Class6950[] field43272 = new Class6950[0];
   public static Class5404 field43273;
   public static Int2ObjectMap<String> field43274 = new Int2ObjectOpenHashMap(8582, 1.0F);
   public static Map<String, Integer> field43275 = new HashMap<String, Integer>(8582, 1.0F);
   public static Int2ObjectMap<Class4147> field43276 = new Int2ObjectOpenHashMap(1);
   public static Int2ObjectMap<Class9039> field43277 = new Int2ObjectOpenHashMap(1);
   public static IntSet field43278 = new IntOpenHashSet(377, 1.0F);

   public static void method35222(Class7161 var0, Class9695 var1) {
      for (Class1983 var7 : Class1983.values()) {
         Class9695 var8 = var1.method37961(var7);
         int var9 = field43273.method16985(var0, var8.method37962(), var8.method37963(), var8.method37964());
         Class4147 var10 = (Class4147)field43276.get(var9);
         if (var10 != null) {
            int var11 = var10.method12839(var0, var8, var9);
            Class8563 var12 = new Class8563(11, null, var0);
            var12.method30560(Class4750.field22551, var8);
            var12.method30560(Class4750.field22544, var11);

            try {
               var12.method30568(Class6380.class, true, true);
            } catch (Exception var14) {
               var14.printStackTrace();
            }
         }
      }
   }

   public static void method35223(Class7161 var0, int var1, int var2, int var3) {
      for (int var6 = -1; var6 <= 1; var6++) {
         for (int var7 = -1; var7 <= 1; var7++) {
            if (Math.abs(var6) + Math.abs(var7) != 0) {
               ArrayList<Class6950> var8 = new ArrayList();
               if (Math.abs(var6) + Math.abs(var7) == 2) {
                  for (int var9 = var3 * 16; var9 < var3 * 16 + 16; var9++) {
                     int var10 = var6 == 1 ? 0 : 15;
                     int var11 = var7 == 1 ? 0 : 15;
                     method35224(var0, new Class9695((var1 + var6 << 4) + var10, (short)var9, (var2 + var7 << 4) + var11), var8);
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
                           method35224(var0, new Class9695((var1 + var6 << 4) + var14, (short)var17, (var2 + var7 << 4) + var15), var8);
                        }
                     }
                  }
               }

               if (!var8.isEmpty()) {
                  Class8563 var18 = new Class8563(15, null, var0);
                  var18.method30560(Class4750.field22526, var1 + var6);
                  var18.method30560(Class4750.field22526, var2 + var7);
                  var18.method30560(Class4750.field22564, var8.toArray(field43272));

                  try {
                     var18.method30568(Class6380.class, true, true);
                  } catch (Exception var16) {
                     var16.printStackTrace();
                  }
               }
            }
         }
      }
   }

   public static void method35224(Class7161 var0, Class9695 var1, List<Class6950> var2) {
      int var5 = field43273.method16985(var0, var1.method37962(), var1.method37963(), var1.method37964());
      Class4147 var6 = method35233(var5);
      if (var6 != null) {
         int var7 = var6.method12839(var0, var1, var5);
         var2.add(new Class6950(var1.method37962() & 15, var1.method37963(), var1.method37964() & 15, var7));
      }
   }

   public static void method35225(Class7161 var0, int var1, int var2, int var3, int var4) {
      if (method35227()) {
         if (!method35230(var4)) {
            field43273.method16988(var0, var1, var2, var3);
         } else {
            field43273.method16987(var0, var1, var2, var3, var4);
         }
      }
   }

   public static void method35226(Class7161 var0) {
      if (method35227()) {
         field43273.method16989(var0);
      }
   }

   public static boolean method35227() {
      return field43273.method16991();
   }

   public static void method35228(Class7161 var0, Class8173 var1) {
      long var4 = (long)(var1.method28440() << 4);
      long var6 = (long)(var1.method28441() << 4);

      for (int var8 = 0; var8 < var1.method28446().length; var8++) {
         Class8225 var9 = var1.method28446()[var8];
         if (var9 != null) {
            boolean var10 = false;

            for (int var11 = 0; var11 < var9.method28631(); var11++) {
               int var15 = var9.method28632(var11);
               if (method35231(var15)) {
                  var10 = true;
                  break;
               }
            }

            if (var10) {
               long var12 = (long)(var8 << 4);

               for (int var14 = 0; var14 < 16; var14++) {
                  for (int var16 = 0; var16 < 16; var16++) {
                     for (int var17 = 0; var17 < 16; var17++) {
                        int var18 = var9.method28626(var17, var14, var16);
                        Class4147 var19 = method35233(var18);
                        if (var19 != null) {
                           var18 = var19.method12839(
                              var0, new Class9695((int)(var4 + (long)var17), (short)((int)(var12 + (long)var14)), (int)(var6 + (long)var16)), var18
                           );
                           var9.method28623(var17, var14, var16, var18);
                        }
                     }
                  }
               }
            }
         }
      }
   }

   public static void method35229() {
      if (ViaVersion3.method27612().method21925()) {
         ViaVersion3.method27613().getLogger().info("Loading block connection mappings ...");
         JsonObject var2 = Class8159.method28359("mapping-1.13.json", true);
         JsonObject var3 = var2.getAsJsonObject("blockstates");

         for (Entry var5 : var3.entrySet()) {
            int var6 = Integer.parseInt((String)var5.getKey());
            String var7 = ((JsonElement)var5.getValue()).getAsString();
            field43274.put(var6, var7);
            field43275.put(var7, var6);
         }

         field43276 = new Int2ObjectOpenHashMap(3650, 1.0F);
         if (!ViaVersion3.method27612().method21927()) {
            field43277 = new Int2ObjectOpenHashMap(1146, 1.0F);
            JsonObject var19 = Class8159.method28358("blockConnections.json");

            for (Entry var23 : var19.entrySet()) {
               int var26 = field43275.get(var23.getKey());
               Class9039 var8 = new Class9039();

               for (Entry var10 : ((JsonElement)var23.getValue()).getAsJsonObject().entrySet()) {
                  String var11 = (String)var10.getKey();
                  JsonObject var12 = ((JsonElement)var10.getValue()).getAsJsonObject();
                  boolean[] var13 = new boolean[6];

                  for (Class1983 var17 : Class1983.values()) {
                     String var18 = var17.toString().toLowerCase(Locale.ROOT);
                     if (var12.has(var18)) {
                        var13[var17.ordinal()] = var12.getAsJsonPrimitive(var18).getAsBoolean();
                     }
                  }

                  var8.method33537(var11, var13);
               }

               if (((String)var23.getKey()).contains("stairs")) {
                  var8.method33537("allFalseIfStairPre1_12", new boolean[6]);
               }

               field43277.put(var26, var8);
            }
         }

         JsonObject var20 = Class8159.method28358("blockData.json");

         for (JsonElement var27 : var20.getAsJsonArray("occluding")) {
            field43278.add(field43275.get(var27.getAsString()));
         }

         ArrayList<Class8097> var25 = new ArrayList();
         var25.add(Class4157.method12862());
         var25.addAll(Class4153.method12856());
         var25.add(Class4152.method12855());
         var25.addAll(Class4149.method12847());
         var25.add(Class4156.method12861());
         var25.addAll(Class4150.method12851());
         var25.add(Class4163.method12884());
         var25.add(Class4161.method12877());
         var25.add(Class4160.method12871());
         var25.add(Class4159.method12865());
         var25.add(Class4154.method12857());
         var25.addAll(Class4151.method12852());
         var25.add(Class4164.method12887());
         var25.add(Class4158.method12863());
         var25.add(Class4162.method12881());
         if (ViaVersion3.method27612().method21939()) {
            var25.add(Class4165.method12890());
         }

         for (String var29 : field43275.keySet()) {
            Class9678 var30 = Class9678.method37755(var29);

            for (Class8097 var32 : var25) {
               var32.method28051(var30);
            }
         }

         if (ViaVersion3.method27612().method21926().equalsIgnoreCase("packet")) {
            field43273 = new Class5406();
            ViaVersion3.getInstance().method34424().method31082(Class5404.class, field43273);
         }
      }
   }

   public static boolean method35230(int var0) {
      return field43277.containsKey(var0) || field43276.containsKey(var0);
   }

   public static boolean method35231(int var0) {
      return field43276.containsKey(var0);
   }

   public static int method35232(Class7161 var0, Class9695 var1, int var2) {
      Class4147 var5 = (Class4147)field43276.get(var2);
      return var5 == null ? var2 : var5.method12839(var0, var1, var2);
   }

   public static Class4147 method35233(int var0) {
      return (Class4147)field43276.get(var0);
   }

   public static int method35234(String var0) {
      return field43275.getOrDefault(var0, -1);
   }

   public static String method35235(int var0) {
      return (String)field43274.get(var0);
   }
}
