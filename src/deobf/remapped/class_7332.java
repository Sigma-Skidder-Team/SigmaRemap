package remapped;

import javax.annotation.Nullable;

public final class class_7332 {
   private static String[] field_37482;
   public static final int field_37483 = 8192;
   public static final int field_37479 = 1024;
   public final byte[] field_37478;
   public int field_37477;
   public int field_37484;
   public boolean field_37476;
   public boolean field_37481;
   public class_7332 field_37475;
   public class_7332 field_37480;

   public class_7332() {
      this.field_37478 = new byte[8192];
      this.field_37481 = true;
      this.field_37476 = false;
   }

   public class_7332(class_7332 var1) {
      this(var1.field_37478, var1.field_37477, var1.field_37484);
      var1.field_37476 = true;
   }

   public class_7332(byte[] var1, int var2, int var3) {
      this.field_37478 = var1;
      this.field_37477 = var2;
      this.field_37484 = var3;
      this.field_37481 = false;
      this.field_37476 = true;
   }

   @Nullable
   public class_7332 method_33414() {
      class_7332 var3 = this.field_37475 == this ? null : this.field_37475;
      this.field_37480.field_37475 = this.field_37475;
      this.field_37475.field_37480 = this.field_37480;
      this.field_37475 = null;
      this.field_37480 = null;
      return var3;
   }

   public class_7332 method_33417(class_7332 var1) {
      var1.field_37480 = this;
      var1.field_37475 = this.field_37475;
      this.field_37475.field_37480 = var1;
      this.field_37475 = var1;
      return var1;
   }

   public class_7332 method_33416(int var1) {
      if (var1 > 0 && var1 <= this.field_37484 - this.field_37477) {
         class_7332 var4;
         if (var1 < 1024) {
            var4 = class_420.method_2091();
            System.arraycopy(this.field_37478, this.field_37477, var4.field_37478, 0, var1);
         } else {
            var4 = new class_7332(this);
         }

         var4.field_37484 = var4.field_37477 + var1;
         this.field_37477 += var1;
         this.field_37480.method_33417(var4);
         return var4;
      } else {
         throw new IllegalArgumentException();
      }
   }

   public void method_33418() {
      if (this.field_37480 != this) {
         if (this.field_37480.field_37481) {
            int var3 = this.field_37484 - this.field_37477;
            int var4 = 8192 - this.field_37480.field_37484 + (!this.field_37480.field_37476 ? this.field_37480.field_37477 : 0);
            if (var3 <= var4) {
               this.method_33419(this.field_37480, var3);
               this.method_33414();
               class_420.method_2090(this);
            }
         }
      } else {
         throw new IllegalStateException();
      }
   }

   public void method_33419(class_7332 var1, int var2) {
      if (var1.field_37481) {
         if (var1.field_37484 + var2 > 8192) {
            if (var1.field_37476) {
               throw new IllegalArgumentException();
            }

            if (var1.field_37484 + var2 - var1.field_37477 > 8192) {
               throw new IllegalArgumentException();
            }

            System.arraycopy(var1.field_37478, var1.field_37477, var1.field_37478, 0, var1.field_37484 - var1.field_37477);
            var1.field_37484 = var1.field_37484 - var1.field_37477;
            var1.field_37477 = 0;
         }

         System.arraycopy(this.field_37478, this.field_37477, var1.field_37478, var1.field_37484, var2);
         var1.field_37484 += var2;
         this.field_37477 += var2;
      } else {
         throw new IllegalArgumentException();
      }
   }
}
