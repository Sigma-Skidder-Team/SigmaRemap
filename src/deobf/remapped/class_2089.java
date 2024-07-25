package remapped;

import java.util.function.BiConsumer;
import net.minecraft.util.text.ITextComponent;

public abstract class class_2089 {
   public static final class_4639 field_10505 = new class_4639("textures/gui/options_background.png");
   public static final class_4639 field_10506 = new class_4639("textures/gui/container/stats_icons.png");
   public static final class_4639 field_10507 = new class_4639("textures/gui/icons.png");
   private int field_10504;

   public void method_9789(class_7966 var1, int var2, int var3, int var4, int var5) {
      if (var3 < var2) {
         int var8 = var2;
         var2 = var3;
         var3 = var8;
      }

      method_9774(var1, var2, var4, var3 + 1, var4 + 1, var5);
   }

   public void method_9790(class_7966 var1, int var2, int var3, int var4, int var5) {
      if (var4 < var3) {
         int var8 = var3;
         var3 = var4;
         var4 = var8;
      }

      method_9774(var1, var2, var3 + 1, var2 + 1, var4, var5);
   }

   public static void method_9774(class_7966 var0, int var1, int var2, int var3, int var4, int var5) {
      method_9775(var0.method_36058().method_28620(), var1, var2, var3, var4, var5);
   }

   private static void method_9775(class_8107 var0, int var1, int var2, int var3, int var4, int var5) {
      if (var1 < var3) {
         int var8 = var1;
         var1 = var3;
         var3 = var8;
      }

      if (var2 < var4) {
         int var13 = var2;
         var2 = var4;
         var4 = var13;
      }

      float var14 = (float)(var5 >> 24 & 0xFF) / 255.0F;
      float var9 = (float)(var5 >> 16 & 0xFF) / 255.0F;
      float var10 = (float)(var5 >> 8 & 0xFF) / 255.0F;
      float var11 = (float)(var5 & 0xFF) / 255.0F;
      class_9633 var12 = class_8042.method_36499().method_36501();
      class_3542.method_16488();
      class_3542.method_16354();
      class_3542.method_16437();
      var12.method_44471(7, class_7985.field_40903);
      var12.method_35762(var0, (float)var1, (float)var4, 0.0F).method_35742(var9, var10, var11, var14).method_35735();
      var12.method_35762(var0, (float)var3, (float)var4, 0.0F).method_35742(var9, var10, var11, var14).method_35735();
      var12.method_35762(var0, (float)var3, (float)var2, 0.0F).method_35742(var9, var10, var11, var14).method_35735();
      var12.method_35762(var0, (float)var1, (float)var2, 0.0F).method_35742(var9, var10, var11, var14).method_35735();
      var12.method_44487();
      class_138.method_554(var12);
      class_3542.method_16432();
      class_3542.method_16448();
   }

   public void method_9772(class_7966 var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      class_3542.method_16354();
      class_3542.method_16488();
      class_3542.method_16458();
      class_3542.method_16437();
      class_3542.method_16486(7425);
      class_8042 var10 = class_8042.method_36499();
      class_9633 var11 = var10.method_36501();
      var11.method_44471(7, class_7985.field_40903);
      method_9773(var1.method_36058().method_28620(), var11, var2, var3, var4, var5, this.field_10504, var6, var7);
      var10.method_36500();
      class_3542.method_16486(7424);
      class_3542.method_16448();
      class_3542.method_16374();
      class_3542.method_16432();
   }

   public static void method_9773(class_8107 var0, class_9633 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      float var11 = (float)(var7 >> 24 & 0xFF) / 255.0F;
      float var12 = (float)(var7 >> 16 & 0xFF) / 255.0F;
      float var13 = (float)(var7 >> 8 & 0xFF) / 255.0F;
      float var14 = (float)(var7 & 0xFF) / 255.0F;
      float var15 = (float)(var8 >> 24 & 0xFF) / 255.0F;
      float var16 = (float)(var8 >> 16 & 0xFF) / 255.0F;
      float var17 = (float)(var8 >> 8 & 0xFF) / 255.0F;
      float var18 = (float)(var8 & 0xFF) / 255.0F;
      var1.method_35762(var0, (float)var4, (float)var3, (float)var6).method_35742(var12, var13, var14, var11).method_35735();
      var1.method_35762(var0, (float)var2, (float)var3, (float)var6).method_35742(var12, var13, var14, var11).method_35735();
      var1.method_35762(var0, (float)var2, (float)var5, (float)var6).method_35742(var16, var17, var18, var15).method_35735();
      var1.method_35762(var0, (float)var4, (float)var5, (float)var6).method_35742(var16, var17, var18, var15).method_35735();
   }

   public static void method_9787(class_7966 var0, TextRenderer var1, String var2, int var3, int var4, int var5) {
      var1.method_45390(var0, var2, (float)(var3 - var1.method_45395(var2) / 2), (float)var4, var5);
   }

   public static void method_9788(class_7966 var0, TextRenderer var1, ITextComponent var2, int var3, int var4, int var5) {
      class_7107 var8 = var2.func_241878_f();
      var1.method_45402(var0, var8, (float)(var3 - var1.method_45400(var8) / 2), (float)var4, var5);
   }

   public static void method_9770(class_7966 var0, TextRenderer var1, String var2, int var3, int var4, int var5) {
      var1.method_45390(var0, var2, (float)var3, (float)var4, var5);
   }

   public static void method_9771(class_7966 var0, TextRenderer var1, ITextComponent var2, int var3, int var4, int var5) {
      var1.method_45392(var0, var2, (float)var3, (float)var4, var5);
   }

   public void method_9784(int var1, int var2, BiConsumer<Integer, Integer> var3) {
      class_3542.method_16425(class_5033.field_26048, class_8535.field_43697, class_5033.field_26042, class_8535.field_43697);
      var3.accept(var1 + 1, var2);
      var3.accept(var1 - 1, var2);
      var3.accept(var1, var2 + 1);
      var3.accept(var1, var2 - 1);
      class_3542.method_16398(class_5033.field_26042, class_8535.field_43697);
      var3.accept(var1, var2);
   }

   public static void method_9782(class_7966 var0, int var1, int var2, int var3, int var4, int var5, class_5155 var6) {
      method_9786(
         var0.method_36058().method_28620(),
         var1,
         var1 + var4,
         var2,
         var2 + var5,
         var3,
         var6.method_23630(),
         var6.method_23619(),
         var6.method_23642(),
         var6.method_23640()
      );
   }

   public void method_9781(class_7966 var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      method_9779(var1, var2, var3, this.field_10504, (float)var4, (float)var5, var6, var7, 256, 256);
   }

   public static void method_9779(class_7966 var0, int var1, int var2, int var3, float var4, float var5, int var6, int var7, int var8, int var9) {
      method_9785(var0, var1, var1 + var6, var2, var2 + var7, var3, var6, var7, var4, var5, var9, var8);
   }

   public static void method_9780(class_7966 var0, int var1, int var2, int var3, int var4, float var5, float var6, int var7, int var8, int var9, int var10) {
      method_9785(var0, var1, var1 + var3, var2, var2 + var4, 0, var7, var8, var5, var6, var9, var10);
   }

   public static void method_9778(class_7966 var0, int var1, int var2, float var3, float var4, int var5, int var6, int var7, int var8) {
      method_9780(var0, var1, var2, var5, var6, var3, var4, var5, var6, var7, var8);
   }

   private static void method_9785(
      class_7966 var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, float var8, float var9, int var10, int var11
   ) {
      method_9786(
         var0.method_36058().method_28620(),
         var1,
         var2,
         var3,
         var4,
         var5,
         (var8 + 0.0F) / (float)var10,
         (var8 + (float)var6) / (float)var10,
         (var9 + 0.0F) / (float)var11,
         (var9 + (float)var7) / (float)var11
      );
   }

   private static void method_9786(class_8107 var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, float var9) {
      class_9633 var12 = class_8042.method_36499().method_36501();
      var12.method_44471(7, class_7985.field_40912);
      var12.method_35762(var0, (float)var1, (float)var4, (float)var5).method_35745(var6, var9).method_35735();
      var12.method_35762(var0, (float)var2, (float)var4, (float)var5).method_35745(var7, var9).method_35735();
      var12.method_35762(var0, (float)var2, (float)var3, (float)var5).method_35745(var7, var8).method_35735();
      var12.method_35762(var0, (float)var1, (float)var3, (float)var5).method_35745(var6, var8).method_35735();
      var12.method_44487();
      class_3542.method_16374();
      class_138.method_554(var12);
   }

   public int method_9777() {
      return this.field_10504;
   }

   public void method_9776(int var1) {
      this.field_10504 = var1;
   }
}
