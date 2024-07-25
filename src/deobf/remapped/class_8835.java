package remapped;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import net.minecraft.util.text.TranslationTextComponent;

public class class_8835 {
   public static Object field_45190 = class_7860.method_35559(class_7860.field_39912);
   public static Object field_45188 = class_7860.method_35559(class_7860.field_40071);
   public static Object field_45192 = class_7860.method_35559(class_7860.field_40245);
   public static final boolean field_45191 = class_7860.field_40213.method_3596();
   public static final boolean field_45187 = class_7860.field_39966.method_3596();

   public static void method_40636(String var0, Object var1) {
      Map var4 = (Map)class_7860.method_35559(class_7860.field_40093);
      if (var4 != null) {
         var4.put(var0, var1);
      }
   }

   public static InputStream method_40637(String var0) {
      if (class_7860.field_40102.method_45472()) {
         var0 = class_8251.method_37832(var0, "/");
         return (InputStream)class_7860.method_35556(class_7860.field_40196, var0);
      } else {
         return null;
      }
   }

   public static class_9859 method_40639() {
      String var2 = "optifine.OptiFineResourceLocator";
      Object var3 = System.getProperties().get(var2 + ".class");
      if (!(var3 instanceof Class)) {
         return new class_9859(var2);
      } else {
         Class var4 = (Class)var3;
         return new class_9859(var4);
      }
   }

   public static boolean method_40641(class_2522 var0) {
      return !field_45191 ? var0.method_8360().method_10802() : class_7860.method_35565(var0, class_7860.field_40213);
   }

   public static boolean method_40635(ItemStack var0) {
      return class_7860.field_40192.method_3596() ? class_7860.method_35565(var0.method_27960(), class_7860.field_40192, var0) : var0.method_27995();
   }

   public static int method_40643(class_2522 var0, class_5561 var1, class_1331 var2) {
      return !class_7860.field_40163.method_3596() ? var0.method_8339() : class_7860.method_35569(var0, class_7860.field_40163, var1, var2);
   }

   public static class_2134 method_40647(ItemStack var0, World var1) {
      if (!class_7860.field_40161.method_45472()) {
         return class_2143.method_10005(var0, var1);
      } else {
         class_2143 var4 = (class_2143)var0.method_27960();
         return class_2143.method_10005(var0, var1);
      }
   }

   public static String[] method_40646() {
      if (class_7860.field_39885.method_45472()) {
         Object var2 = class_7860.method_35556(class_7860.field_40066);
         List var3 = (List)class_7860.method_35555(var2, class_7860.field_39861);
         if (var3 != null) {
            ArrayList var4 = new ArrayList();

            for (Object var6 : var3) {
               if (class_7860.field_40089.method_45470(var6)) {
                  String var7 = class_7860.method_35575(var6, class_7860.field_40108);
                  if (var7 != null) {
                     var4.add(var7);
                  }
               }
            }

            return var4.<String>toArray(new String[var4.size()]);
         } else {
            return new String[0];
         }
      } else {
         return new String[0];
      }
   }

   public static boolean method_40652(class_2522 var0, class_6163 var1, class_1331 var2) {
      return !class_7860.field_39999.method_3596() ? var0.method_8345() : class_7860.method_35565(var0, class_7860.field_39999, var1, var2);
   }

   public static boolean method_40642(ItemStack var0, ItemStack var1, class_704 var2, class_5886 var3) {
      return !class_7860.field_40018.method_3596()
         ? var0.method_27960() instanceof class_7938
         : class_7860.method_35565(var0, class_7860.field_40018, var1, var2, var3);
   }

   public static boolean method_40651(ItemStack var0, class_704 var1) {
      return !class_7860.field_40025.method_3596()
         ? var0.method_27960() == class_4897.field_24840
         : class_7860.method_35565(var0, class_7860.field_40025, var1);
   }

   public static class_9521 method_40638(class_1876 var0, int var1, int var2) {
      return class_7860.field_39987.method_22501()
         ? new class_9521(var0.field_941 / 2 - 100, var1 + var2 * 2, 98, 20, new TranslationTextComponent("fml.menu.mods"), var1x -> {
         Screen var4 = (Screen)class_7860.field_39987.method_22500(var0);
            MinecraftClient.getInstance().method_8609(var4);
         })
         : null;
   }

   public static void method_40640(boolean var0) {
      if (class_7860.field_40043.method_7978()) {
         method_40650(class_7860.field_40043, var0);
      }
   }

   public static boolean method_40645(class_1790 var0, boolean var1) {
      if (var0.method_7978()) {
         Object var4 = class_7860.field_39897.method_7979();
         if (var4 != null) {
            Object var5 = class_7860.method_35557(var4, var0);
            return var5 != null ? class_7860.method_35565(var5, class_7860.field_39851) : var1;
         } else {
            return var1;
         }
      } else {
         return var1;
      }
   }

   private static void method_40650(class_1790 var0, boolean var1) {
      if (var0.method_7978()) {
         Object var4 = class_7860.field_39897.method_7979();
         if (var4 != null) {
            Object var5 = class_7860.method_35557(var4, var0);
            if (var5 != null) {
               class_3376 var6 = new class_3376(var1);
               class_7860.method_35561(var5, class_7860.field_39909, var6);
               Object var7 = class_7860.method_35557(var5, class_7860.field_40038);
               if (var7 != null) {
                  class_7860.method_35561(var7, class_7860.field_39962, null);
               }

               class_9569.method_44223("Set ForgeConfig.CLIENT." + var0.method_7977().getName() + "=" + var1);
            }
         }
      }
   }

   public static boolean method_40648(Entity var0) {
      return !field_45187 ? true : class_7860.method_35565(var0, class_7860.field_39966);
   }

   public static boolean method_40644(class_2451 var0, ItemStack var1) {
      return !class_7860.field_40121.method_3596() ? var0.method_11210() : class_7860.method_35565(var0, class_7860.field_40121, var1);
   }
}
