package remapped;

import jaco.mp3.resources.DecoderException;

public class class_909 implements class_6161 {
   private static String[] field_4654;
   private static final class_5318 field_4653 = new class_5318();
   private class_9401 field_4649;
   private class_2948 field_4651;
   private class_2948 field_4659;
   private class_6514 field_4647;
   private class_4619 field_4648;
   private class_884 field_4657;
   private int field_4650;
   private int field_4656;
   private class_814 field_4652 = new class_814();
   private class_5318 field_4658;
   private boolean field_4655;

   public class_909() {
      this(null);
   }

   public class_909(class_5318 var1) {
      if (var1 == null) {
         var1 = field_4653;
      }

      this.field_4658 = var1;
      class_814 var4 = this.field_4658.method_24261();
      if (var4 != null) {
         this.field_4652.method_3562(var4);
      }
   }

   public static class_5318 method_3887() {
      return (class_5318)field_4653.clone();
   }

   public void method_3892(class_814 var1) {
      if (var1 == null) {
         var1 = class_814.field_4323;
      }

      this.field_4652.method_3562(var1);
      float[] var4 = this.field_4652.method_3560();
      if (this.field_4651 != null) {
         this.field_4651.method_13491(var4);
      }

      if (this.field_4659 != null) {
         this.field_4659.method_13491(var4);
      }
   }

   public class_9401 method_3883(class_1915 var1, class_8212 var2) throws DecoderException {
      if (!this.field_4655) {
         this.method_3884(var1);
      }

      int var5 = var1.method_8696();
      this.field_4649.method_43542();
      class_7734 var6 = this.method_3886(var1, var2, var5);
      var6.method_35005();
      this.field_4649.method_43545(1);
      return this.field_4649;
   }

   public void method_3891(class_9401 var1) {
      this.field_4649 = var1;
   }

   public int method_3893() {
      return this.field_4650;
   }

   public int method_3885() {
      return this.field_4656;
   }

   public int method_3894() {
      return 2304;
   }

   public class_477 method_3889(int var1) {
      return new class_477(var1, null);
   }

   public class_477 method_3890(int var1, Throwable var2) {
      return new class_477(var1, var2);
   }

   public class_7734 method_3886(class_1915 var1, class_8212 var2, int var3) throws DecoderException {
      Object var6 = null;
      switch (var3) {
         case 1:
            if (this.field_4657 == null) {
               this.field_4657 = new class_884();
               this.field_4657.method_3802(var2, var1, this.field_4651, this.field_4659, this.field_4649, 0);
            }

            var6 = this.field_4657;
            break;
         case 2:
            if (this.field_4648 == null) {
               this.field_4648 = new class_4619();
               this.field_4648.method_3802(var2, var1, this.field_4651, this.field_4659, this.field_4649, 0);
            }

            var6 = this.field_4648;
            break;
         case 3:
            if (this.field_4647 == null) {
               this.field_4647 = new class_6514(var2, var1, this.field_4651, this.field_4659, this.field_4649, 0);
            }

            var6 = this.field_4647;
      }

      if (var6 == null) {
         throw this.method_3890(513, null);
      } else {
         return (class_7734)var6;
      }
   }

   private void method_3884(class_1915 var1) throws DecoderException {
      float var4 = 32700.0F;
      int var5 = var1.method_8685();
      int var6 = var1.method_8696();
      int var7 = var5 != 3 ? 2 : 1;
      if (this.field_4649 == null) {
         this.field_4649 = new class_904(var1.method_8707(), var7);
      }

      float[] var8 = this.field_4652.method_3560();
      this.field_4651 = new class_2948(0, var4, var8);
      if (var7 == 2) {
         this.field_4659 = new class_2948(1, var4, var8);
      }

      this.field_4656 = var7;
      this.field_4650 = var1.method_8707();
      this.field_4655 = true;
   }
}
