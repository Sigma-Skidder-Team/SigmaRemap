package remapped;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;

public class class_6076 {
   private class_3581 field_31104 = null;
   private int field_31093 = class_1920.method_8817();
   private int field_31094 = 4096;
   private int field_31100 = 0;
   private int field_31101;
   private class_8161<class_5584> field_31096 = new class_8161<class_5584>();
   private class_5584 field_31095 = null;
   private IntBuffer field_31102 = class_3111.method_14260(this.field_31094);
   private IntBuffer field_31099 = class_3111.method_14260(this.field_31094);
   private final int field_31098 = class_7985.field_40918.method_13168();
   private int field_31103 = 7;
   private boolean field_31097 = class_3111.method_14424();

   public class_6076(class_3581 var1) {
      this.field_31104 = var1;
      this.method_27823();
      long var4 = this.method_27827(this.field_31094);
      class_1920.method_8802(class_1920.field_9822, var4, class_1920.field_9825);
      this.method_27832();
   }

   public void method_27831(ByteBuffer var1, class_5584 var2) {
      if (this.field_31093 >= 0) {
         int var5 = var2.method_25378();
         int var6 = var2.method_25376();
         int var7 = this.method_27830((long)var1.limit());
         if (var7 > 0) {
            if (var7 > var6) {
               var2.method_25373(this.field_31100);
               var2.method_25371(var7);
               this.field_31100 += var7;
               if (var5 >= 0) {
                  this.field_31096.method_37437(var2.method_25370());
               }

               this.field_31096.method_37446(var2.method_25370());
            }

            var2.method_25371(var7);
            this.field_31101 += var7 - var6;
            this.method_27829(var2.method_25374());
            long var8 = this.method_27827(var2.method_25378());
            this.method_27823();
            class_1920.method_8870(class_1920.field_9822, var8, var1);
            this.method_27832();
            if (this.field_31100 > this.field_31101 * 11 / 10) {
               this.method_27820(1);
            }
         } else if (var5 >= 0) {
            var2.method_25373(-1);
            var2.method_25371(0);
            this.field_31096.method_37437(var2.method_25370());
            this.field_31101 -= var6;
         }
      }
   }

   private void method_27820(int var1) {
      if (!this.field_31096.method_37449()) {
         class_5584 var4 = this.field_31095;
         if (var4 == null || !this.field_31096.method_37450(var4.method_25370())) {
            var4 = this.field_31096.method_37448().method_11037();
         }

         int var5 = var4.method_25378();
         class_5584 var6 = var4.method_25372();
         if (var6 != null) {
            var5 = var6.method_25374();
         } else {
            var5 = 0;
         }

         int var7 = 0;

         while (var4 != null && var7 < var1) {
            var7++;
            if (var4.method_25378() != var5) {
               int var8 = var4.method_25378() - var5;
               if (var4.method_25376() > var8) {
                  this.method_27829(this.field_31100 + var4.method_25376());
                  this.method_27824(var4.method_25378(), this.field_31100, var4.method_25376());
                  var4.method_25373(this.field_31100);
                  this.field_31100 = this.field_31100 + var4.method_25376();
                  class_5584 var9 = var4.method_25375();
                  this.field_31096.method_37437(var4.method_25370());
                  this.field_31096.method_37446(var4.method_25370());
                  var4 = var9;
               } else {
                  this.method_27824(var4.method_25378(), var5, var4.method_25376());
                  var4.method_25373(var5);
                  var5 += var4.method_25376();
                  var4 = var4.method_25375();
               }
            } else {
               var5 += var4.method_25376();
               var4 = var4.method_25375();
            }
         }

         if (var4 == null) {
            this.field_31100 = this.field_31096.method_37440().method_11037().method_25374();
         }

         this.field_31095 = var4;
      }
   }

   private void method_27821() {
      int var3 = 0;
      int var4 = 0;

      for (class_5584 var5 = this.field_31096.method_37448().method_11037(); var5 != null; var5 = var5.method_25375()) {
         var3++;
         var4 += var5.method_25376();
         if (var5.method_25378() < 0 || var5.method_25376() <= 0 || var5.method_25374() > this.field_31100) {
            throw new RuntimeException("Invalid range: " + var5);
         }

         class_5584 var6 = var5.method_25372();
         if (var6 != null && var5.method_25378() < var6.method_25374()) {
            throw new RuntimeException("Invalid range: " + var5);
         }

         class_5584 var7 = var5.method_25375();
         if (var7 != null && var5.method_25374() > var7.method_25378()) {
            throw new RuntimeException("Invalid range: " + var5);
         }
      }

      if (var3 != this.field_31096.method_37445()) {
         throw new RuntimeException("Invalid count: " + var3 + " <> " + this.field_31096.method_37445());
      } else if (var4 != this.field_31101) {
         throw new RuntimeException("Invalid size: " + var4 + " <> " + this.field_31101);
      }
   }

   private void method_27829(int var1) {
      if (this.field_31094 < var1) {
         this.method_27828(var1);
      }
   }

   private void method_27824(int var1, int var2, int var3) {
      long var6 = this.method_27827(var1);
      long var8 = this.method_27827(var2);
      long var10 = this.method_27827(var3);
      class_1920.method_8760(class_1920.field_9819, this.field_31093);
      class_1920.method_8760(class_1920.field_9840, this.field_31093);
      class_1920.method_8869(class_1920.field_9819, class_1920.field_9840, var6, var8, var10);
      class_3111.method_14312("Copy VBO range");
      class_1920.method_8760(class_1920.field_9819, 0);
      class_1920.method_8760(class_1920.field_9840, 0);
   }

   private void method_27828(int var1) {
      int var4 = this.field_31094 * 6 / 4;

      while (var4 < var1) {
         var4 = var4 * 6 / 4;
      }

      long var5 = this.method_27827(this.field_31094);
      long var7 = this.method_27827(var4);
      int var9 = class_1920.method_8817();
      class_1920.method_8760(class_1920.field_9822, var9);
      class_1920.method_8802(class_1920.field_9822, var7, class_1920.field_9825);
      class_3111.method_14312("Expand VBO");
      class_1920.method_8760(class_1920.field_9822, 0);
      class_1920.method_8760(class_1920.field_9819, this.field_31093);
      class_1920.method_8760(class_1920.field_9840, var9);
      class_1920.method_8869(class_1920.field_9819, class_1920.field_9840, 0L, 0L, var5);
      class_3111.method_14312("Copy VBO: " + var7);
      class_1920.method_8760(class_1920.field_9819, 0);
      class_1920.method_8760(class_1920.field_9840, 0);
      class_1920.method_8825(this.field_31093);
      this.field_31102 = class_3111.method_14260(var4);
      this.field_31099 = class_3111.method_14260(var4);
      this.field_31093 = var9;
      this.field_31094 = var4;
   }

   public void method_27823() {
      class_1920.method_8760(class_1920.field_9822, this.field_31093);
   }

   public void method_27819(int var1, class_5584 var2) {
      if (this.field_31103 != var1) {
         if (this.field_31102.position() > 0) {
            throw new IllegalArgumentException("Mixed region draw modes: " + this.field_31103 + " != " + var1);
         }

         this.field_31103 = var1;
      }

      this.field_31102.put(var2.method_25378());
      this.field_31099.put(var2.method_25376());
   }

   public void method_27822() {
      this.method_27823();
      class_7985.field_40918.method_13179(0L);
      if (this.field_31097) {
         class_293.method_1299();
      }

      ((Buffer)this.field_31102).flip();
      ((Buffer)this.field_31099).flip();
      class_1920.method_8847(this.field_31103, this.field_31102, this.field_31099);
      ((Buffer)this.field_31102).limit(this.field_31102.capacity());
      ((Buffer)this.field_31099).limit(this.field_31099.capacity());
      if (this.field_31100 > this.field_31101 * 11 / 10) {
         this.method_27820(1);
      }
   }

   public void method_27832() {
      class_1920.method_8760(class_1920.field_9822, 0);
   }

   public void method_27833() {
      if (this.field_31093 >= 0) {
         class_1920.method_8825(this.field_31093);
         this.field_31093 = -1;
      }
   }

   private long method_27827(int var1) {
      return (long)var1 * (long)this.field_31098;
   }

   private int method_27830(long var1) {
      return (int)(var1 / (long)this.field_31098);
   }

   public int method_27825() {
      return this.field_31100;
   }
}
