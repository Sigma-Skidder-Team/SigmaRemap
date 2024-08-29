package mapped;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Class9172 {
   private static Class9590[][] field42101 = (Class9590[][])null;
   private static boolean field42102 = false;
   private static Class20 field42103 = null;
   private static boolean field42104;

   public static int method34259(BlockState var0) {
      int var3 = var0.method23490();
      int var4 = var0.method23491();
      Class9590 var5 = method34262(var3, var4);
      return var5 == null ? -1 : var5.method37236();
   }

   public static boolean method34260() {
      return field42102;
   }

   public static int method34261(BlockState var0) {
      if (field42102) {
         int var3 = var0.method23490();
         int var4 = var0.method23491();
         Class9590 var5 = method34262(var3, var4);
         return var5 == null ? 0 : var5.method37237();
      } else {
         return 0;
      }
   }

   public static Class9590 method34262(int var0, int var1) {
      if (field42101 == null) {
         return null;
      } else if (var0 >= 0 && var0 < field42101.length) {
         Class9590[] var4 = field42101[var0];
         if (var4 == null) {
            return null;
         } else {
            for (int var5 = 0; var5 < var4.length; var5++) {
               Class9590 var6 = var4[var5];
               if (var6.method37239(var0, var1)) {
                  return var6;
               }
            }

            return null;
         }
      } else {
         return null;
      }
   }

   public static Class9590[] method34263(int var0) {
      if (field42101 == null) {
         return null;
      } else {
         return var0 >= 0 && var0 < field42101.length ? field42101[var0] : null;
      }
   }

   public static void method34264() {
      if (field42104) {
         field42104 = false;
         method34265(Shaders.method32955());
      }
   }

   public static void method34265(Class4671 var0) {
      method34276();
      if (var0 != null && !(var0 instanceof Class4670)) {
         if (Class9299.field42965.method20214() && Minecraft.getInstance().getResourceManager() == null) {
            Class7944.method26810("[Shaders] Delayed loading of block mappings after resources are loaded");
            field42104 = true;
         } else {
            List<List<Class9590>> var3 = new ArrayList();
            String var4 = "/shaders/block.properties";
            InputStream var5 = var0.method14639(var4);
            if (var5 != null) {
               method34267(var5, var4, (List<List<Class9590>>)var3);
            }

            method34266((List<List<Class9590>>)var3);
            if (var3.size() <= 0) {
               var3 = method34270();
               field42102 = true;
            }

            field42101 = method34269((List<List<Class9590>>)var3);
         }
      }
   }

   private static void method34266(List<List<Class9590>> var0) {
      String[] var3 = Class9561.method37049();

      for (int var4 = 0; var4 < var3.length; var4++) {
         String var5 = var3[var4];

         try {
            ResourceLocation var6 = new ResourceLocation(var5, "shaders/block.properties");
            InputStream var7 = Class7944.method26863(var6);
            method34267(var7, var6.toString(), var0);
         } catch (IOException var8) {
         }
      }
   }

   private static void method34267(InputStream var0, String var1, List<List<Class9590>> var2) {
      if (var0 != null) {
         try {
            var0 = Class9711.method38047(var0, var1);
            Class20 var5 = new Class20();
            var5.load(var0);
            var0.close();
            Class7944.method26810("[Shaders] Parsing block mappings: " + var1);
            Class8896 var6 = new Class8896("Shaders");

            for (String var8 : (Set<String>)(Set<?>) var5.keySet()) {
               String var9 = var5.getProperty(var8);
               if (var8.startsWith("layer.")) {
                  if (field42103 == null) {
                     field42103 = new Class20();
                  }

                  field42103.put(var8, var9);
               } else {
                  String var10 = "block.";
                  if (!var8.startsWith(var10)) {
                     Class7944.method26811("[Shaders] Invalid block ID: " + var8);
                  } else {
                     String var11 = Class9402.method35762(var8, var10);
                     int var12 = Class7944.method26899(var11, -1);
                     if (var12 < 0) {
                        Class7944.method26811("[Shaders] Invalid block ID: " + var8);
                     } else {
                        Class9727[] var13 = var6.method32384(var9);
                        if (var13 != null && var13.length >= 1) {
                           Class9590 var14 = new Class9590(var12, var13);
                           method34268(var2, var14);
                        } else {
                           Class7944.method26811("[Shaders] Invalid block ID mapping: " + var8 + "=" + var9);
                        }
                     }
                  }
               }
            }
         } catch (IOException var15) {
            Class7944.method26811("[Shaders] Error reading: " + var1);
         }
      }
   }

   private static void method34268(List<List<Class9590>> var0, Class9590 var1) {
      int[] var4 = var1.method37240();

      for (int var5 = 0; var5 < var4.length; var5++) {
         int var6 = var4[var5];

         while (var6 >= var0.size()) {
            var0.add((List)null);
         }

         List var7 = (List)var0.get(var6);
         if (var7 == null) {
            var7 = new ArrayList();
            var0.set(var6, var7);
         }

         Class9590 var8 = new Class9590(var1.method37236(), var1.method37241(var6));
         var7.add(var8);
      }
   }

   private static Class9590[][] method34269(List<List<Class9590>> var0) {
      Class9590[][] var3 = new Class9590[var0.size()][];

      for (int var4 = 0; var4 < var3.length; var4++) {
         List<Class9590> var5 = (List)var0.get(var4);
         if (var5 != null) {
            var3[var4] = var5.toArray(new Class9590[var5.size()]);
         }
      }

      return var3;
   }

   private static List<List<Class9590>> method34270() {
      try {
         String var2 = "flattening_ids.txt";
         Class7944.method26810("Using legacy block aliases: " + var2);
         ArrayList var3 = new ArrayList();
         ArrayList<String> var4 = new ArrayList();
         int var5 = 0;
         InputStream var6 = Class7944.method26784("/" + var2);
         if (var6 == null) {
            return var3;
         } else {
            String[] var7 = Class7944.method26923(var6);

            for (int var8 = 0; var8 < var7.length; var8++) {
               int var9 = var8 + 1;
               String var10 = var7[var8];
               if (var10.trim().length() > 0) {
                  var4.add(var10);
                  if (!var10.startsWith("#")) {
                     if (var10.startsWith("alias")) {
                        String[] var11 = Class7944.method26903(var10, " ");
                        String var12 = var11[1];
                        String var13 = var11[2];
                        String var14 = "{Name:'" + var13 + "'";
                        List<String> var15 = var4.stream().filter(var1 -> var1.startsWith(var14)).collect(Collectors.toList());
                        if (var15.size() <= 0) {
                           Class7944.method26811("Block not processed: " + var10);
                        } else {
                           for (String var17 : var15) {
                              String var18 = "{Name:'" + var12 + "'";
                              String var19 = var17.replace(var14, var18);
                              var4.add(var19);
                              method34271(var19, var9, var3);
                              var5++;
                           }
                        }
                     } else {
                        method34271(var10, var9, var3);
                        var5++;
                     }
                  }
               }
            }

            Class7944.method26810("Legacy block aliases: " + var5);
            return var3;
         }
      } catch (IOException var20) {
         Class7944.method26811("Error loading legacy block aliases: " + var20.getClass().getName() + ": " + var20.getMessage());
         return new ArrayList<List<Class9590>>();
      }
   }

   private static void method34271(String var0, int var1, List<List<Class9590>> var2) {
      String[] var5 = Class7944.method26903(var0, " ");
      if (var5.length != 4) {
         Class7944.method26811("Invalid flattening line: " + var0);
      } else {
         String var6 = var5[0];
         String var7 = var5[1];
         int var8 = Class7944.method26899(var5[2], Integer.MIN_VALUE);
         int var9 = Class7944.method26899(var5[3], Integer.MIN_VALUE);
         if (var8 >= 0 && var9 >= 0) {
            try {
               JsonParser var10 = new JsonParser();
               JsonObject var11 = var10.parse(var6).getAsJsonObject();
               String var12 = var11.get("Name").getAsString();
               ResourceLocation var13 = new ResourceLocation(var12);
               Block var14 = Class9716.method38066(var13);
               if (var14 == null) {
                  Class7944.method26811("Invalid block name (" + var1 + "): " + var12);
                  return;
               }

               BlockState var15 = var14.method11579();
               Collection var16 = var15.method23461();
               LinkedHashMap var17 = new LinkedHashMap();
               JsonObject var18 = (JsonObject)var11.get("Properties");
               if (var18 != null) {
                  for (Entry var20 : var18.entrySet()) {
                     String var21 = (String)var20.getKey();
                     String var22 = ((JsonElement)var20.getValue()).getAsString();
                     Class8550 var23 = Class7104.method22099(var21, var16);
                     if (var23 == null) {
                        Class7944.method26811("Invalid property (" + var1 + "): " + var21);
                     } else {
                        Comparable var24 = Class8896.method32391(var23, var22);
                        if (var24 == null) {
                           Class7944.method26811("Invalid property value (" + var1 + "): " + var22);
                        } else {
                           var17.put(var23, var24);
                        }
                     }
                  }
               }

               int var26 = var15.method23490();

               while (var2.size() <= var26) {
                  var2.add((List)null);
               }

               List var27 = (List)var2.get(var26);
               if (var27 == null) {
                  var27 = new ArrayList(Class9716.method38068(var14));
                  var2.set(var26, var27);
               }

               Class9727 var28 = method34273(var15.getBlock(), var15.method23490(), var17);
               method34272((List<Class9590>)var27, var8, var9, var28);
            } catch (Exception var25) {
               Class7944.method26811("Error parsing: " + var0);
            }
         } else {
            Class7944.method26811("Invalid blockID or metadata (" + var1 + "): " + var8 + ":" + var9);
         }
      }
   }

   private static void method34272(List<Class9590> var0, int var1, int var2, Class9727 var3) {
      for (Class9590 var7 : var0) {
         if (var7.method37236() == var1 && var7.method37237() == var2) {
            Class9727[] var8 = var7.method37238();

            for (int var9 = 0; var9 < var8.length; var9++) {
               Class9727 var10 = var8[var9];
               if (var10.method38103() == var3.method38103()) {
                  var10.method38108(var3.method38104());
                  return;
               }
            }
         }
      }

      Class9590 var11 = new Class9590(var1, var2, new Class9727[]{var3});
      var0.add(var11);
   }

   private static Class9727 method34273(Block var0, int var1, Map<Class8550, Comparable> var2) {
      ArrayList<BlockState> var5 = new ArrayList();
      Set<Class8550> var6 = var2.keySet();

      for (BlockState var8 : Class9716.method38070(var0)) {
         boolean var9 = true;

         for (Class8550 var11 : var6) {
            if (!var8.method23462(var11)) {
               var9 = false;
               break;
            }

            Comparable var12 = (Comparable)var2.get(var11);
            Comparable var13 = var8.<Comparable>method23463(var11);
            if (!var12.equals(var13)) {
               var9 = false;
               break;
            }
         }

         if (var9) {
            var5.add(var8);
         }
      }

      LinkedHashSet<Integer> var14 = new LinkedHashSet();

      for (BlockState var17 : var5) {
         var14.add(var17.method23491());
      }

      Integer[] var16 = var14.toArray(new Integer[var14.size()]);
      int[] var18 = Class7944.method26976(var16);
      return new Class9727(var1, var18);
   }

   private static void method34274() {
      for (ResourceLocation var3 : Registry.BLOCK.method9190()) {
         Block var4 = Registry.BLOCK.method9184(var3);
         int var5 = var4.method11579().method23490();
         Class9590[] var6 = method34263(var5);
         if (var6 != null) {
            for (BlockState var8 : Class9716.method38070(var4)) {
               int var9 = var8.method23491();
               Class9590 var10 = method34262(var5, var9);
               if (var10 == null) {
                  Class7944.method26811("State has no alias: " + var8);
               }
            }
         } else {
            Class7944.method26811("Block has no alias: " + var4);
         }
      }
   }

   public static Class20 method34275() {
      return field42103;
   }

   public static void method34276() {
      field42101 = (Class9590[][])null;
      field42102 = false;
      field42103 = null;
   }

   public static int method34277(BlockState var0) {
      if (!field42102) {
         return var0.getRenderType().ordinal();
      } else {
         Block var3 = var0.getBlock();
         if (var3 instanceof Class3404) {
            return 1;
         } else {
            BlockRenderType var4 = var0.getRenderType();
            return var4 != BlockRenderType.field9886 && var4 != BlockRenderType.MODEL ? var4.ordinal() : var4.ordinal() + 1;
         }
      }
   }
}
