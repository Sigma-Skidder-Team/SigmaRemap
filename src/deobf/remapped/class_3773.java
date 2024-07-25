package remapped;

import java.io.File;
import java.util.regex.Pattern;

public class class_3773 {
   private static final Pattern field_18431 = Pattern.compile("[a-zA-Z0-9_]+");

   public static void method_17457(class_9716 var0) {
      String var3 = var0.method_44878();
      if (var3 != null && !var3.isEmpty() && !var3.contains("\u0000") && field_18431.matcher(var3).matches()) {
         String var4 = "http://s.optifine.net/capes/" + var3 + ".png";
         Identifier var5 = new Identifier("capeof/" + var3);
         TextureManager var6 = MinecraftClient.getInstance().getTextureManager();
         class_8143 var7 = var6.method_35679(var5);
         if (var7 != null && var7 instanceof class_9211) {
            class_9211 var8 = (class_9211)var7;
            if (var8.field_47114 != null) {
               if (var8.field_47114) {
                  var0.method_44886(var5);
                  if (var8.method_42540() instanceof class_7452) {
                     class_7452 var12 = (class_7452)var8.method_42540();
                     var0.method_44875(var12.method_33918());
                  }
               }

               return;
            }
         }

         class_7452 var11 = new class_7452(var0, var5);
         Identifier var9 = class_5525.field_28154;
         class_9211 var10 = new class_9211((File)null, var4, var9, false, var11);
         var10.field_47109 = true;
         var6.method_35682(var5, var10);
      }
   }

   public static class_5797 method_17456(class_5797 var0) {
      byte var3 = 64;
      byte var4 = 32;
      int var5 = var0.method_26228();

      for (int var6 = var0.method_26253(); var3 < var5 || var4 < var6; var4 *= 2) {
         var3 *= 2;
      }

      class_5797 var7 = new class_5797(var3, var4, true);
      var7.method_26250(var0);
      var0.close();
      return var7;
   }

   public static boolean method_17460(class_5797 var0, class_5797 var1) {
      return var0.method_26228() > var1.method_26253();
   }

   public static void method_17459(class_9716 var0) {
      String var3 = var0.method_44878();
      Identifier var4 = new Identifier("capeof/" + var3);
      TextureManager var5 = Config.method_14266();
      class_8143 var6 = var5.method_35679(var4);
      if (var6 instanceof class_1809) {
         class_1809 var7 = (class_1809)var6;
         var7.method_37052();
         var5.method_35678(var4);
      }

      var0.method_44886((Identifier)null);
      var0.method_44875(false);
      method_17457(var0);
   }
}
