package remapped;

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

public class class_7330 {
   private static class_8951[][] field_37459 = (class_8951[][])null;
   private static boolean field_37457 = false;
   private static class_8407 field_37460 = null;
   private static boolean field_37456;

   public static int method_33396(class_2522 var0) {
      int var3 = var0.method_11477();
      int var4 = var0.method_11473();
      class_8951 var5 = method_33395(var3, var4);
      return var5 == null ? -1 : var5.method_41098();
   }

   public static boolean method_33397() {
      return field_37457;
   }

   public static int method_33411(class_2522 var0) {
      if (field_37457) {
         int var3 = var0.method_11477();
         int var4 = var0.method_11473();
         class_8951 var5 = method_33395(var3, var4);
         return var5 == null ? 0 : var5.method_41094();
      } else {
         return 0;
      }
   }

   public static class_8951 method_33395(int var0, int var1) {
      if (field_37459 == null) {
         return null;
      } else if (var0 >= 0 && var0 < field_37459.length) {
         class_8951[] var4 = field_37459[var0];
         if (var4 == null) {
            return null;
         } else {
            for (int var5 = 0; var5 < var4.length; var5++) {
               class_8951 var6 = var4[var5];
               if (var6.method_41095(var0, var1)) {
                  return var6;
               }
            }

            return null;
         }
      } else {
         return null;
      }
   }

   public static class_8951[] method_33398(int var0) {
      if (field_37459 == null) {
         return null;
      } else {
         return var0 >= 0 && var0 < field_37459.length ? field_37459[var0] : null;
      }
   }

   public static void method_33392() {
      if (field_37456) {
         field_37456 = false;
         method_33404(class_6588.method_30120());
      }
   }

   public static void method_33404(class_8591 var0) {
      method_33402();
      if (var0 != null && !(var0 instanceof class_185)) {
         if (class_7860.field_39861.method_3596() && MinecraftClient.method_8510().method_8498() == null) {
            class_3111.method_14277("[Shaders] Delayed loading of block mappings after resources are loaded");
            field_37456 = true;
         } else {
            Object var3 = new ArrayList();
            String var4 = "/shaders/block.properties";
            InputStream var5 = var0.method_39505(var4);
            if (var5 != null) {
               method_33409(var5, var4, (List<List<class_8951>>)var3);
            }

            method_33401((List<List<class_8951>>)var3);
            if (var3.size() <= 0) {
               var3 = method_33410();
               field_37457 = true;
            }

            field_37459 = method_33407((List<List<class_8951>>)var3);
         }
      }
   }

   private static void method_33401(List<List<class_8951>> var0) {
      String[] var3 = class_8835.method_40646();

      for (int var4 = 0; var4 < var3.length; var4++) {
         String var5 = var3[var4];

         try {
            class_4639 var6 = new class_4639(var5, "shaders/block.properties");
            InputStream var7 = class_3111.method_14374(var6);
            method_33409(var7, var6.toString(), var0);
         } catch (IOException var8) {
         }
      }
   }

   private static void method_33409(InputStream var0, String var1, List<List<class_8951>> var2) {
      if (var0 != null) {
         try {
            var0 = class_9441.method_43672(var0, var1);
            class_8407 var5 = new class_8407();
            var5.load(var0);
            var0.close();
            class_3111.method_14277("[Shaders] Parsing block mappings: " + var1);
            class_6284 var6 = new class_6284("Shaders");

            for (String var8 : var5.keySet()) {
               String var9 = var5.getProperty(var8);
               if (var8.startsWith("layer.")) {
                  if (field_37460 == null) {
                     field_37460 = new class_8407();
                  }

                  field_37460.put(var8, var9);
               } else {
                  String var10 = "block.";
                  if (!var8.startsWith(var10)) {
                     class_3111.method_14317("[Shaders] Invalid block ID: " + var8);
                  } else {
                     String var11 = class_8251.method_37832(var8, var10);
                     int var12 = class_3111.method_14361(var11, -1);
                     if (var12 < 0) {
                        class_3111.method_14317("[Shaders] Invalid block ID: " + var8);
                     } else {
                        class_9491[] var13 = var6.method_28680(var9);
                        if (var13 != null && var13.length >= 1) {
                           class_8951 var14 = new class_8951(var12, var13);
                           method_33400(var2, var14);
                        } else {
                           class_3111.method_14317("[Shaders] Invalid block ID mapping: " + var8 + "=" + var9);
                        }
                     }
                  }
               }
            }
         } catch (IOException var15) {
            class_3111.method_14317("[Shaders] Error reading: " + var1);
         }
      }
   }

   private static void method_33400(List<List<class_8951>> var0, class_8951 var1) {
      int[] var4 = var1.method_41097();

      for (int var5 = 0; var5 < var4.length; var5++) {
         int var6 = var4[var5];

         while (var6 >= var0.size()) {
            var0.add((List)null);
         }

         Object var7 = (List)var0.get(var6);
         if (var7 == null) {
            var7 = new ArrayList();
            var0.set(var6, var7);
         }

         class_8951 var8 = new class_8951(var1.method_41098(), var1.method_41100(var6));
         var7.add(var8);
      }
   }

   private static class_8951[][] method_33407(List<List<class_8951>> var0) {
      class_8951[][] var3 = new class_8951[var0.size()][];

      for (int var4 = 0; var4 < var3.length; var4++) {
         List var5 = (List)var0.get(var4);
         if (var5 != null) {
            var3[var4] = var5.<class_8951>toArray(new class_8951[var5.size()]);
         }
      }

      return var3;
   }

   private static List<List<class_8951>> method_33410() {
      try {
         String var2 = "flattening_ids.txt";
         class_3111.method_14277("Using legacy block aliases: " + var2);
         ArrayList var3 = new ArrayList();
         ArrayList var4 = new ArrayList();
         int var5 = 0;
         InputStream var6 = class_3111.method_14300("/" + var2);
         if (var6 == null) {
            return var3;
         } else {
            String[] var7 = class_3111.method_14432(var6);

            for (int var8 = 0; var8 < var7.length; var8++) {
               int var9 = var8 + 1;
               String var10 = var7[var8];
               if (var10.trim().length() > 0) {
                  var4.add(var10);
                  if (!var10.startsWith("#")) {
                     if (var10.startsWith("alias")) {
                        String[] var11 = class_3111.method_14302(var10, " ");
                        String var12 = var11[1];
                        String var13 = var11[2];
                        String var14 = "{Name:'" + var13 + "'";
                        List var15 = var4.stream().filter(var1 -> var1.startsWith(var14)).collect(Collectors.toList());
                        if (var15.size() <= 0) {
                           class_3111.method_14317("Block not processed: " + var10);
                        } else {
                           for (String var17 : var15) {
                              String var18 = "{Name:'" + var12 + "'";
                              String var19 = var17.replace(var14, var18);
                              var4.add(var19);
                              method_33394(var19, var9, var3);
                              var5++;
                           }
                        }
                     } else {
                        method_33394(var10, var9, var3);
                        var5++;
                     }
                  }
               }
            }

            class_3111.method_14277("Legacy block aliases: " + var5);
            return var3;
         }
      } catch (IOException var20) {
         class_3111.method_14317("Error loading legacy block aliases: " + var20.getClass().getName() + ": " + var20.getMessage());
         return new ArrayList<List<class_8951>>();
      }
   }

   private static void method_33394(String var0, int var1, List<List<class_8951>> var2) {
      String[] var5 = class_3111.method_14302(var0, " ");
      if (var5.length != 4) {
         class_3111.method_14317("Invalid flattening line: " + var0);
      } else {
         String var6 = var5[0];
         String var7 = var5[1];
         int var8 = class_3111.method_14361(var5[2], Integer.MIN_VALUE);
         int var9 = class_3111.method_14361(var5[3], Integer.MIN_VALUE);
         if (var8 >= 0 && var9 >= 0) {
            try {
               JsonParser var10 = new JsonParser();
               JsonObject var11 = var10.parse(var6).getAsJsonObject();
               String var12 = var11.get("Name").getAsString();
               class_4639 var13 = new class_4639(var12);
               class_6414 var14 = class_9451.method_43712(var13);
               if (var14 == null) {
                  class_3111.method_14317("Invalid block name (" + var1 + "): " + var12);
                  return;
               }

               class_2522 var15 = var14.method_29260();
               Collection var16 = var15.method_10310();
               LinkedHashMap var17 = new LinkedHashMap();
               JsonObject var18 = (JsonObject)var11.get("Properties");
               if (var18 != null) {
                  for (Entry var20 : var18.entrySet()) {
                     String var21 = (String)var20.getKey();
                     String var22 = ((JsonElement)var20.getValue()).getAsString();
                     class_5019 var23 = class_1385.method_6387(var21, var16);
                     if (var23 == null) {
                        class_3111.method_14317("Invalid property (" + var1 + "): " + var21);
                     } else {
                        Comparable var24 = class_6284.method_28670(var23, var22);
                        if (var24 == null) {
                           class_3111.method_14317("Invalid property value (" + var1 + "): " + var22);
                        } else {
                           var17.put(var23, var24);
                        }
                     }
                  }
               }

               int var26 = var15.method_11477();

               while (var2.size() <= var26) {
                  var2.add((List)null);
               }

               Object var27 = (List)var2.get(var26);
               if (var27 == null) {
                  var27 = new ArrayList(class_9451.method_43713(var14));
                  var2.set(var26, var27);
               }

               class_9491 var28 = method_33393(var15.method_8360(), var15.method_11477(), var17);
               method_33403((List<class_8951>)var27, var8, var9, var28);
            } catch (Exception var25) {
               class_3111.method_14317("Error parsing: " + var0);
            }
         } else {
            class_3111.method_14317("Invalid blockID or metadata (" + var1 + "): " + var8 + ":" + var9);
         }
      }
   }

   private static void method_33403(List<class_8951> var0, int var1, int var2, class_9491 var3) {
      for (class_8951 var7 : var0) {
         if (var7.method_41098() == var1 && var7.method_41094() == var2) {
            class_9491[] var8 = var7.method_41099();

            for (int var9 = 0; var9 < var8.length; var9++) {
               class_9491 var10 = var8[var9];
               if (var10.method_43838() == var3.method_43838()) {
                  var10.method_43839(var3.method_43844());
                  return;
               }
            }
         }
      }

      class_8951 var11 = new class_8951(var1, var2, new class_9491[]{var3});
      var0.add(var11);
   }

   private static class_9491 method_33393(class_6414 var0, int var1, Map<class_5019, Comparable> var2) {
      ArrayList var5 = new ArrayList();
      Set var6 = var2.keySet();

      for (class_2522 var8 : class_9451.method_43715(var0)) {
         boolean var9 = true;

         for (class_5019 var11 : var6) {
            if (!var8.method_10307(var11)) {
               var9 = false;
               break;
            }

            Comparable var12 = (Comparable)var2.get(var11);
            Comparable var13 = var8.<Comparable>method_10313(var11);
            if (!var12.equals(var13)) {
               var9 = false;
               break;
            }
         }

         if (var9) {
            var5.add(var8);
         }
      }

      LinkedHashSet var14 = new LinkedHashSet();

      for (class_2522 var17 : var5) {
         var14.add(var17.method_11473());
      }

      Integer[] var16 = var14.<Integer>toArray(new Integer[var14.size()]);
      int[] var18 = class_3111.method_14267(var16);
      return new class_9491(var1, var18);
   }

   private static void method_33399() {
      for (class_4639 var3 : class_8669.field_44462.method_39805()) {
         class_6414 var4 = class_8669.field_44462.method_39806(var3);
         int var5 = var4.method_29260().method_11477();
         class_8951[] var6 = method_33398(var5);
         if (var6 != null) {
            for (class_2522 var8 : class_9451.method_43715(var4)) {
               int var9 = var8.method_11473();
               class_8951 var10 = method_33395(var5, var9);
               if (var10 == null) {
                  class_3111.method_14317("State has no alias: " + var8);
               }
            }
         } else {
            class_3111.method_14317("Block has no alias: " + var4);
         }
      }
   }

   public static class_8407 method_33405() {
      return field_37460;
   }

   public static void method_33402() {
      field_37459 = (class_8951[][])null;
      field_37457 = false;
      field_37460 = null;
   }

   public static int method_33406(class_2522 var0) {
      if (!field_37457) {
         return var0.method_8352().ordinal();
      } else {
         class_6414 var3 = var0.method_8360();
         if (var3 instanceof class_7855) {
            return 1;
         } else {
            class_7537 var4 = var0.method_8352();
            return var4 != class_7537.field_38467 && var4 != class_7537.field_38469 ? var4.ordinal() : var4.ordinal() + 1;
         }
      }
   }
}
