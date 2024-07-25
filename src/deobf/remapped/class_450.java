package remapped;

import javax.annotation.Nullable;
import org.apache.commons.lang3.tuple.Pair;

public class class_450 {
   private static final Identifier field_1875 = new Identifier("textures/misc/underwater.png");

   public static void method_2171(MinecraftClient var0, class_7966 var1) {
      RenderSystem.method_16458();
      class_5989 var4 = var0.thePlayer;
      if (!var4.field_41731) {
         if (class_7860.field_40092.method_3596() && class_7860.field_40137.method_3596()) {
            Pair var8 = method_2172(var4);
            if (var8 != null) {
               Object var6 = class_7860.method_35559(class_7860.field_40055);
               if (!class_7860.field_40092.method_3592(var4, var1, var6, var8.getLeft(), var8.getRight())) {
                  class_5155 var7 = (class_5155)class_7860.method_35555(
                     var0.method_8505().method_3716(), class_7860.field_40137, var8.getLeft(), var0.field_9601, var8.getRight()
                  );
                  method_2168(var0, var7, var1);
               }
            }
         } else {
            class_2522 var5 = method_2170(var4);
            if (var5 != null) {
               method_2168(var0, var0.method_8505().method_3716().method_43938(var5), var1);
            }
         }
      }

      if (!var0.thePlayer.method_37221()) {
         if (var0.thePlayer.method_37261(class_6503.field_33094) && !class_7860.field_40021.method_3592(var4, var1)) {
            method_2167(var0, var1);
         }

         if (var0.thePlayer.method_37264() && !class_7860.field_39929.method_3592(var4, var1)) {
            method_2169(var0, var1);
         }
      }

      RenderSystem.enableAlphaTest();
   }

   @Nullable
   private static class_2522 method_2170(class_704 var0) {
      Pair var3 = method_2172(var0);
      return var3 != null ? (class_2522)var3.getLeft() : null;
   }

   private static Pair<class_2522, class_1331> method_2172(class_704 var0) {
      class_2921 var3 = new class_2921();

      for (int var4 = 0; var4 < 8; var4++) {
         double var5 = var0.method_37302() + (double)(((float)((var4 >> 0) % 2) - 0.5F) * var0.method_37086() * 0.8F);
         double var7 = var0.method_37388() + (double)(((float)((var4 >> 1) % 2) - 0.5F) * 0.1F);
         double var9 = var0.method_37156() + (double)(((float)((var4 >> 2) % 2) - 0.5F) * var0.method_37086() * 0.8F);
         var3.method_13361(var5, var7, var9);
         class_2522 var11 = var0.field_41768.method_28262(var3);
         if (var11.method_8352() != class_7537.field_38470 && var11.method_8330(var0.field_41768, var3)) {
            return Pair.of(var11, var3.method_6072());
         }
      }

      return null;
   }

   private static void method_2168(MinecraftClient var0, class_5155 var1, class_7966 var2) {
      if (class_153.method_611()) {
         class_153.method_609(var1);
      }

      var0.getTextureManager().bindTexture(var1.method_23608().method_38519());
      class_9633 var5 = class_8042.method_36499().method_36501();
      float var6 = 0.1F;
      float var7 = -1.0F;
      float var8 = 1.0F;
      float var9 = -1.0F;
      float var10 = 1.0F;
      float var11 = -0.5F;
      float var12 = var1.method_23630();
      float var13 = var1.method_23619();
      float var14 = var1.method_23642();
      float var15 = var1.method_23640();
      class_8107 var16 = var2.method_36058().method_28620();
      var5.method_44471(7, class_7985.field_40913);
      var5.method_35762(var16, -1.0F, -1.0F, -0.5F).method_35742(0.1F, 0.1F, 0.1F, 1.0F).method_35745(var13, var15).method_35735();
      var5.method_35762(var16, 1.0F, -1.0F, -0.5F).method_35742(0.1F, 0.1F, 0.1F, 1.0F).method_35745(var12, var15).method_35735();
      var5.method_35762(var16, 1.0F, 1.0F, -0.5F).method_35742(0.1F, 0.1F, 0.1F, 1.0F).method_35745(var12, var14).method_35735();
      var5.method_35762(var16, -1.0F, 1.0F, -0.5F).method_35742(0.1F, 0.1F, 0.1F, 1.0F).method_35745(var13, var14).method_35735();
      var5.method_44487();
      class_138.method_554(var5);
   }

   private static void method_2167(MinecraftClient var0, class_7966 var1) {
      RenderSystem.method_16432();
      var0.getTextureManager().bindTexture(field_1875);
      if (class_153.method_611()) {
         class_153.method_612(var0.getTextureManager().method_35679(field_1875).method_37055());
      }

      class_9633 var4 = class_8042.method_36499().method_36501();
      float var5 = var0.thePlayer.method_37193();
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      float var6 = 4.0F;
      float var7 = -1.0F;
      float var8 = 1.0F;
      float var9 = -1.0F;
      float var10 = 1.0F;
      float var11 = -0.5F;
      float var12 = -var0.thePlayer.field_41701 / 64.0F;
      float var13 = var0.thePlayer.field_41755 / 64.0F;
      class_8107 var14 = var1.method_36058().method_28620();
      var4.method_44471(7, class_7985.field_40913);
      var4.method_35762(var14, -1.0F, -1.0F, -0.5F).method_35742(var5, var5, var5, 0.1F).method_35745(4.0F + var12, 4.0F + var13).method_35735();
      var4.method_35762(var14, 1.0F, -1.0F, -0.5F).method_35742(var5, var5, var5, 0.1F).method_35745(0.0F + var12, 4.0F + var13).method_35735();
      var4.method_35762(var14, 1.0F, 1.0F, -0.5F).method_35742(var5, var5, var5, 0.1F).method_35745(0.0F + var12, 0.0F + var13).method_35735();
      var4.method_35762(var14, -1.0F, 1.0F, -0.5F).method_35742(var5, var5, var5, 0.1F).method_35745(4.0F + var12, 0.0F + var13).method_35735();
      var4.method_44487();
      class_138.method_554(var4);
      RenderSystem.method_16448();
   }

   private static void method_2169(MinecraftClient var0, class_7966 var1) {
      class_9633 var4 = class_8042.method_36499().method_36501();
      RenderSystem.method_16457(519);
      RenderSystem.method_16387(false);
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.method_16432();
      class_5155 var5 = class_6560.field_33441.method_12947();
      if (class_153.method_611()) {
         class_153.method_609(var5);
      }

      var0.getTextureManager().bindTexture(var5.method_23608().method_38519());
      float var6 = var5.method_23630();
      float var7 = var5.method_23619();
      float var8 = (var6 + var7) / 2.0F;
      float var9 = var5.method_23642();
      float var10 = var5.method_23640();
      float var11 = (var9 + var10) / 2.0F;
      float var12 = var5.method_23632();
      float var13 = class_9299.method_42795(var12, var6, var8);
      float var14 = class_9299.method_42795(var12, var7, var8);
      float var15 = class_9299.method_42795(var12, var9, var11);
      float var16 = class_9299.method_42795(var12, var10, var11);
      float var17 = 1.0F;
      class_9081 var18 = new class_9081(0.9F);
      SigmaMainClass.getInstance().getEventManager().call(var18);

      for (int var19 = 0; var19 < 2; var19++) {
         var1.method_36063();
         float var20 = -0.5F;
         float var21 = 0.5F;
         float var22 = -0.5F;
         float var23 = 0.5F;
         float var24 = -0.5F;
         var1.method_36065((double)((float)(-(var19 * 2 - 1)) * 0.24F), -0.3F, 0.0);
         var1.method_36060(class_2426.field_12074.method_11074((float)(var19 * 2 - 1) * 10.0F));
         class_8107 var25 = var1.method_36058().method_28620();
         var4.method_44471(7, class_7985.field_40913);
         var4.method_35762(var25, -0.5F, -0.5F, -0.5F).method_35742(1.0F, 1.0F, 1.0F, var18.method_41810()).method_35745(var14, var16).method_35735();
         var4.method_35762(var25, 0.5F, -0.5F, -0.5F).method_35742(1.0F, 1.0F, 1.0F, var18.method_41810()).method_35745(var13, var16).method_35735();
         var4.method_35762(var25, 0.5F, 0.5F, -0.5F).method_35742(1.0F, 1.0F, 1.0F, var18.method_41810()).method_35745(var13, var15).method_35735();
         var4.method_35762(var25, -0.5F, 0.5F, -0.5F).method_35742(1.0F, 1.0F, 1.0F, var18.method_41810()).method_35745(var14, var15).method_35735();
         var4.method_44487();
         class_138.method_554(var4);
         var1.method_36064();
      }

      RenderSystem.method_16448();
      RenderSystem.method_16387(true);
      RenderSystem.method_16457(515);
   }
}
