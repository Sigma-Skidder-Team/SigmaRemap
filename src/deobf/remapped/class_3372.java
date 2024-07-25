package remapped;

import java.util.Optional;
import java.util.function.Predicate;

public class class_3372 {
   private static String[] field_16633;
   public final class_7539 field_16626 = new class_7539();
   public final class_2995 field_16625;
   public final class_2995 field_16632;
   public final class_2995 field_16620;
   public final class_2995 field_16630;
   public final class_2995 field_16631;
   public final class_8540 field_16623;
   public final class_2779 field_16634;
   public final class_2995 field_16619;
   public final class_2995 field_16629;
   public final class_2995 field_16628;
   public final class_2995 field_16621;
   public final class_2973 field_16637;
   public final class_8701 field_16624;
   public final class_4562 field_16638;
   public final class_6323 field_16622;
   public final class_6742 field_16627;
   public final class_8448 field_16635;
   private boolean field_16636;

   public class_3372(MinecraftClient var1) {
      this.field_16625 = new class_3748(var1);
      this.field_16632 = new class_8957(var1);
      this.field_16620 = new class_1016(var1);
      this.field_16630 = new class_934(var1);
      this.field_16631 = new class_4921(var1);
      this.field_16623 = new class_8540();
      this.field_16634 = new class_2779(var1);
      this.field_16619 = new class_4874(var1);
      this.field_16629 = new class_7897();
      this.field_16628 = new class_262(var1);
      this.field_16621 = new class_4537(var1);
      this.field_16637 = new class_2973(var1);
      this.field_16624 = new class_8701();
      this.field_16638 = new class_4562(var1);
      this.field_16622 = new class_6323(var1);
      this.field_16627 = new class_6742(var1);
      this.field_16635 = new class_8448();
   }

   public void method_15551() {
      this.field_16626.method_13699();
      this.field_16625.method_13699();
      this.field_16632.method_13699();
      this.field_16620.method_13699();
      this.field_16630.method_13699();
      this.field_16631.method_13699();
      this.field_16623.method_13699();
      this.field_16634.method_13699();
      this.field_16619.method_13699();
      this.field_16629.method_13699();
      this.field_16628.method_13699();
      this.field_16621.method_13699();
      this.field_16637.method_13699();
      this.field_16624.method_13699();
      this.field_16638.method_13699();
      this.field_16622.method_13699();
      this.field_16627.method_13699();
      this.field_16635.method_13699();
   }

   public boolean method_15557() {
      this.field_16636 = !this.field_16636;
      return this.field_16636;
   }

   public void method_15550(class_7966 var1, class_3758 var2, double var3, double var5, double var7) {
      if (this.field_16636 && !MinecraftClient.getInstance().method_8503()) {
         this.field_16632.method_13698(var1, var2, var3, var5, var7);
      }

      this.field_16635.method_13698(var1, var2, var3, var5, var7);
   }

   public static Optional<class_8145> method_15558(class_8145 var0, int var1) {
      if (var0 != null) {
         class_1343 var4 = var0.method_37335(1.0F);
         class_1343 var5 = var0.method_37307(1.0F).method_6209((double)var1);
         class_1343 var6 = var4.method_6215(var5);
         class_4092 var7 = var0.method_37241().method_18929(var5).method_18898(1.0);
         int var8 = var1 * var1;
         Predicate var9 = var0x -> !var0x.method_37221() && var0x.method_37167();
         class_5631 var10 = class_8462.method_38932(var0, var4, var6, var7, var9, (double)var8);
         if (var10 != null) {
            return !(var4.method_6204(var10.method_33993()) > (double)var8) ? Optional.<class_8145>of(var10.method_25524()) : Optional.<class_8145>empty();
         } else {
            return Optional.<class_8145>empty();
         }
      } else {
         return Optional.<class_8145>empty();
      }
   }

   public static void method_15561(class_1331 var0, class_1331 var1, float var2, float var3, float var4, float var5) {
      class_9071 var8 = MinecraftClient.getInstance().field_9590.method_35949();
      if (var8.method_41642()) {
         class_1343 var9 = var8.method_41627().method_6207();
         class_4092 var10 = new class_4092(var0, var1).method_18920(var9);
         method_15562(var10, var2, var3, var4, var5);
      }
   }

   public static void method_15560(class_1331 var0, float var1, float var2, float var3, float var4, float var5) {
      class_9071 var8 = MinecraftClient.getInstance().field_9590.method_35949();
      if (var8.method_41642()) {
         class_1343 var9 = var8.method_41627().method_6207();
         class_4092 var10 = new class_4092(var0).method_18920(var9).method_18898((double)var1);
         method_15562(var10, var2, var3, var4, var5);
      }
   }

   public static void method_15562(class_4092 var0, float var1, float var2, float var3, float var4) {
      method_15559(var0.field_19941, var0.field_19937, var0.field_19938, var0.field_19940, var0.field_19939, var0.field_19942, var1, var2, var3, var4);
   }

   public static void method_15559(
      double var0, double var2, double var4, double var6, double var8, double var10, float var12, float var13, float var14, float var15
   ) {
      class_8042 var18 = class_8042.method_36499();
      class_9633 var19 = var18.method_36501();
      var19.method_44471(5, class_7985.field_40903);
      class_4316.method_20064(var19, var0, var2, var4, var6, var8, var10, var12, var13, var14, var15);
      var18.method_36500();
   }

   public static void method_15556(String var0, int var1, int var2, int var3, int var4) {
      method_15553(var0, (double)var1 + 0.5, (double)var2 + 0.5, (double)var3 + 0.5, var4);
   }

   public static void method_15553(String var0, double var1, double var3, double var5, int var7) {
      method_15554(var0, var1, var3, var5, var7, 0.02F);
   }

   public static void method_15554(String var0, double var1, double var3, double var5, int var7, float var8) {
      method_15555(var0, var1, var3, var5, var7, var8, true, 0.0F, false);
   }

   public static void method_15555(String var0, double var1, double var3, double var5, int var7, float var8, boolean var9, float var10, boolean var11) {
      MinecraftClient var14 = MinecraftClient.getInstance();
      class_9071 var15 = var14.field_9590.method_35949();
      if (var15.method_41642() && var14.method_8587().field_31304 != null) {
         class_9854 var16 = var14.field_9668;
         double var17 = var15.method_41627().field_7336;
         double var19 = var15.method_41627().field_7333;
         double var21 = var15.method_41627().field_7334;
         class_3542.method_16438();
         class_3542.method_16413((float)(var1 - var17), (float)(var3 - var19) + 0.07F, (float)(var5 - var21));
         class_3542.method_16465(0.0F, 1.0F, 0.0F);
         class_3542.method_16358(new class_8107(var15.method_41644()));
         class_3542.method_16403(var8, -var8, var8);
         class_3542.method_16432();
         if (!var11) {
            class_3542.method_16428();
         } else {
            class_3542.method_16491();
         }

         class_3542.method_16387(true);
         class_3542.method_16403(-1.0F, 1.0F, 1.0F);
         float var23 = !var9 ? 0.0F : (float)(-var16.method_45395(var0)) / 2.0F;
         var23 -= var10 / var8;
         class_3542.method_16374();
         class_3758 var24 = class_2565.method_11648(class_8042.method_36499().method_36501());
         var16.method_45411(var0, var23, 0.0F, var7, false, class_1221.method_5406().method_5410(), var24, var11, 0, 15728880);
         var24.method_17415();
         class_3542.method_16480(1.0F, 1.0F, 1.0F, 1.0F);
         class_3542.method_16428();
         class_3542.method_16489();
      }
   }
}
