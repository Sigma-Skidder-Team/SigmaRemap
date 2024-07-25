package remapped;

public final class class_7669 {
   private static String[] field_38991;
   private static class_1299 field_38989 = class_3980.method_18363();
   private static class_1810 field_38990 = class_3980.method_18361();

   public static final void method_34750(class_3316 var0) {
      class_8343 var3 = class_9162.method_42220();
      class_9162.method_42217();
      float[] var4 = var0.method_15230();
      field_38990.method_8039();

      for (byte var5 = 0; var5 < var4.length; var5 += 2) {
         field_38990.method_8037(var4[var5], var4[var5 + 1]);
      }

      if (var0.method_15232()) {
         field_38990.method_8037(var4[0], var4[1]);
      }

      field_38990.method_8034();
      if (var3 != null) {
         var3.method_38419();
      } else {
         class_9162.method_42217();
      }
   }

   public static final void method_34751(class_3316 var0, class_5909 var1) {
      float[] var4 = var0.method_15230();
      class_8343 var5 = class_9162.method_42220();
      class_9162.method_42217();
      float[] var6 = var0.method_15228();
      field_38989.method_5934(3);

      for (byte var7 = 0; var7 < var4.length; var7 += 2) {
         var1.method_27016(var0, var4[var7], var4[var7 + 1]).method_40021();
         class_1440 var8 = var1.method_27015(var0, var4[var7], var4[var7 + 1]);
         field_38989.method_5919(var4[var7] + var8.field_7766, var4[var7 + 1] + var8.field_7765);
      }

      if (var0.method_15232()) {
         var1.method_27016(var0, var4[0], var4[1]).method_40021();
         class_1440 var9 = var1.method_27015(var0, var4[0], var4[1]);
         field_38989.method_5919(var4[0] + var9.field_7766, var4[1] + var9.field_7765);
      }

      field_38989.method_5940();
      if (var5 != null) {
         var5.method_38419();
      } else {
         class_9162.method_42217();
      }
   }

   public static boolean method_34749(class_3316 var0) {
      return var0.method_15233() != null ? var0.method_15233().method_39349() != 0 : false;
   }

   public static final void method_34741(class_3316 var0) {
      if (method_34749(var0)) {
         class_8343 var3 = class_9162.method_42220();
         class_9162.method_42217();
         method_34742(var0, new class_5173());
         if (var3 != null) {
            var3.method_38419();
         } else {
            class_9162.method_42217();
         }
      }
   }

   private static final void method_34742(class_3316 var0, class_2007 var1) {
      class_8554 var4 = var0.method_15233();
      field_38989.method_5934(4);

      for (int var5 = 0; var5 < var4.method_39349(); var5++) {
         for (int var6 = 0; var6 < 3; var6++) {
            float[] var7 = var4.method_39351(var5, var6);
            float[] var8 = var1.method_9321(var0, var7[0], var7[1]);
            if (var8 != null) {
               field_38989.method_5919(var8[0], var8[1]);
            } else {
               field_38989.method_5919(var7[0], var7[1]);
            }
         }
      }

      field_38989.method_5940();
   }

   public static final void method_34745(class_3316 var0, class_8112 var1) {
      method_34746(var0, var1, 0.01F, 0.01F);
   }

   public static final void method_34739(class_3316 var0, class_8112 var1) {
      method_34740(var0, var1, 1.0F, 1.0F);
   }

   public static final void method_34746(class_3316 var0, class_8112 var1, float var2, float var3) {
      if (method_34749(var0)) {
         class_8343 var6 = class_9162.method_42220();
         var1.method_36897().method_38419();
         method_34742(var0, new class_7882(var2, var3, var1));
         float[] var7 = var0.method_15230();
         if (var6 != null) {
            var6.method_38419();
         } else {
            class_9162.method_42217();
         }
      }
   }

   public static final void method_34740(class_3316 var0, class_8112 var1, float var2, float var3) {
      if (method_34749(var0)) {
         float[] var6 = var0.method_15230();
         class_8343 var7 = class_9162.method_42220();
         var1.method_36897().method_38419();
         float var8 = var0.method_15212();
         float var9 = var0.method_15220();
         float var10 = var0.method_15200() - var8;
         float var11 = var0.method_15208() - var9;
         method_34742(var0, new class_3673(var2, var3, var1));
         if (var7 != null) {
            var7.method_38419();
         } else {
            class_9162.method_42217();
         }
      }
   }

   public static final void method_34743(class_3316 var0, class_5909 var1) {
      if (method_34749(var0)) {
         class_8343 var4 = class_9162.method_42220();
         class_9162.method_42217();
         float[] var5 = var0.method_15228();
         method_34742(var0, new class_1192(var1));
         if (var4 != null) {
            var4.method_38419();
         } else {
            class_9162.method_42217();
         }
      }
   }

   public static final void method_34747(class_3316 var0, class_8112 var1, float var2, float var3, class_5909 var4) {
      if (method_34749(var0)) {
         class_8343 var7 = class_9162.method_42220();
         var1.method_36897().method_38419();
         float[] var8 = var0.method_15228();
         method_34742(var0, new class_898(var4, var8, var2, var3, var1));
         if (var7 != null) {
            var7.method_38419();
         } else {
            class_9162.method_42217();
         }
      }
   }

   public static final void method_34748(class_3316 var0, class_8112 var1, class_1084 var2) {
      class_8343 var5 = class_9162.method_42220();
      var1.method_36897().method_38419();
      float[] var6 = var0.method_15228();
      method_34742(var0, new class_436(var2));
      if (var5 != null) {
         var5.method_38419();
      } else {
         class_9162.method_42217();
      }
   }
}
