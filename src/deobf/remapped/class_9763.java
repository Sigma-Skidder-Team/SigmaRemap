package remapped;

import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import it.unimi.dsi.fastutil.objects.ObjectList;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class class_9763 {
   private static boolean field_49593 = false;
   private static Map<class_6629, class_7067> field_49589 = null;
   private static Map<class_133, class_2255> field_49591 = null;
   private static Map<class_558, class_9873> field_49590 = null;

   public static void method_45062() {
      Map var2 = method_45054();
      Map var3 = method_45058();
      Map var4 = method_45051();
      if (var2 != null) {
         if (var3 != null) {
            field_49593 = false;
            var2.clear();
            var3.clear();
            var4.clear();
            var2.putAll(field_49589);
            var3.putAll(field_49591);
            var4.putAll(field_49590);
            if (class_3111.method_14409()) {
               class_4639[] var5 = method_45063();

               for (int var6 = 0; var6 < var5.length; var6++) {
                  class_4639 var7 = var5[var6];
                  class_3111.method_14277("CustomEntityModel: " + var7.method_21456());
                  class_8599 var8 = method_45061(var7);
                  if (var8 != null) {
                     class_222 var9 = var8.method_39530();
                     if (!(var8 instanceof class_7067)) {
                        if (!(var8 instanceof class_2255)) {
                           class_3111.method_14317("Unknown renderer type: " + var8.getClass().getName());
                        } else {
                           var3.put(var9.method_942().get(), (class_2255)var8);
                        }
                     } else {
                        var2.put(var9.method_940().get(), (class_7067)var8);
                     }

                     field_49593 = true;
                  }
               }
            }
         } else {
            class_3111.method_14317("Tile entity render map not found, custom entity models are DISABLED.");
         }
      } else {
         class_3111.method_14317("Entity render map not found, custom entity models are DISABLED.");
      }
   }

   private static Map<class_6629, class_7067> method_45054() {
      class_6122 var2 = MinecraftClient.method_8510().method_8587();
      Map var3 = var2.method_28130();
      if (var3 != null) {
         if (field_49589 == null) {
            field_49589 = new HashMap<class_6629, class_7067>(var3);
         }

         return var3;
      } else {
         return null;
      }
   }

   private static Map<class_133, class_2255> method_45058() {
      Map var2 = class_3569.field_17468.field_17471;
      if (field_49591 == null) {
         field_49591 = new HashMap<class_133, class_2255>(var2);
      }

      return var2;
   }

   private static Map<class_558, class_9873> method_45051() {
      Object var2 = (Map)class_7860.field_40215.method_7979();
      if (var2 == null) {
         class_3111.method_14317("Field not found: TileEntitySkullRenderer.MODELS");
         var2 = new HashMap();
      }

      if (field_49590 == null) {
         field_49590 = new HashMap<class_558, class_9873>((Map<? extends class_558, ? extends class_9873>)var2);
      }

      return (Map<class_558, class_9873>)var2;
   }

   private static class_4639[] method_45063() {
      String var2 = "optifine/cem/";
      String var3 = ".jem";
      ArrayList var4 = new ArrayList();
      String[] var5 = class_7676.method_34788();

      for (int var6 = 0; var6 < var5.length; var6++) {
         String var7 = var5[var6];
         String var8 = var2 + var7 + var3;
         class_4639 var9 = new class_4639(var8);
         if (class_3111.method_14362(var9)) {
            var4.add(var9);
         }
      }

      return var4.<class_4639>toArray(new class_4639[var4.size()]);
   }

   private static class_8599 method_45061(class_4639 var0) {
      try {
         JsonObject var3 = class_4296.method_19954(var0);
         return method_45060(var3, var0.method_21456());
      } catch (IOException var4) {
         class_3111.method_14348("" + var4.getClass().getName() + ": " + var4.getMessage());
         return null;
      } catch (JsonParseException var5) {
         class_3111.method_14348("" + var5.getClass().getName() + ": " + var5.getMessage());
         return null;
      } catch (Exception var6) {
         var6.printStackTrace();
         return null;
      }
   }

   private static class_8599 method_45060(JsonObject var0, String var1) {
      class_7175 var4 = class_4296.method_19949(var0, var1);
      String var5 = var4.method_32881();
      class_2733 var6 = class_7676.method_34789(var5);
      method_45053(var6, "Entity not found: " + var5);
      class_222 var7 = var6.method_12298();
      method_45053(var7, "Entity type not found: " + var5);
      class_8599 var8 = method_45052(var6, var4);
      if (var8 != null) {
         var8.method_39529(var7);
         return var8;
      } else {
         return null;
      }
   }

   private static class_8599 method_45052(class_2733 var0, class_7175 var1) {
      class_4639 var4 = var1.method_32884();
      class_9514[] var5 = var1.method_32883();
      float var6 = var1.method_32879();
      if (var6 < 0.0F) {
         var6 = var0.method_12297();
      }

      class_9873 var7 = var0.method_12295();
      if (var7 != null) {
         class_553 var8 = new class_553(var0, var7, var5);
         if (method_45057(var0, var7, var5, var8)) {
            class_8599 var9 = var0.method_12293(var7, var6);
            if (var9 != null) {
               if (var4 != null) {
                  var9.method_39531(var4);
               }

               return var9;
            } else {
               throw new JsonParseException("Entity renderer is null, model: " + var0.method_12290() + ", adapter: " + var0.getClass().getName());
            }
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   private static boolean method_45057(class_2733 var0, class_9873 var1, class_9514[] var2, class_553 var3) {
      for (int var6 = 0; var6 < var2.length; var6++) {
         class_9514 var7 = var2[var6];
         if (!method_45056(var0, var1, var7, var3)) {
            return false;
         }
      }

      return true;
   }

   private static boolean method_45056(class_2733 var0, class_9873 var1, class_9514 var2, class_553 var3) {
      String var6 = var2.method_43911();
      class_1549 var7 = var0.method_12291(var1, var6);
      if (var7 == null) {
         class_3111.method_14317("Model part not found: " + var6 + ", model: " + var1);
         return false;
      } else {
         if (!var2.method_43909()) {
            if (var7.field_8184 != null) {
               var7.field_8184.clear();
            }

            if (var7.field_8188 != null) {
               var7.field_8188.clear();
            }

            if (var7.field_8189 != null) {
               class_1549[] var8 = var0.method_12296(var1);
               Set var9 = Collections.newSetFromMap(new IdentityHashMap());
               var9.addAll(Arrays.asList(var8));
               ObjectList var10 = var7.field_8189;
               Iterator var11 = var10.iterator();

               while (var11.hasNext()) {
                  class_1549 var12 = (class_1549)var11.next();
                  if (!var9.contains(var12)) {
                     var11.remove();
                  }
               }
            }
         }

         var7.method_7043(var2.method_43912());
         class_4776 var13 = var2.method_43908();
         if (var13 != null) {
            var3.method_2660(var2.method_43912());
            var3.method_2658(var7);
            if (!var13.method_22014(var3)) {
               return false;
            }

            var2.method_43912().method_7040(var13);
         }

         return true;
      }
   }

   private static void method_45053(Object var0, String var1) {
      if (var0 == null) {
         throw new JsonParseException(var1);
      }
   }

   public static boolean method_45055() {
      return field_49593;
   }
}
