package remapped;

import java.util.ArrayList;

public class class_1993 {
   private static String[] field_10135;
   private String field_10131;
   private ArrayList field_10132 = new ArrayList();
   private float field_10128;
   private float field_10130;
   private float field_10133;
   private float field_10127;
   private float field_10124;
   private class_8112 field_10125;
   private boolean field_10134;
   private class_4508 field_10126;
   private String field_10129;

   public class_1993(String var1, boolean var2) {
      this.field_10131 = var1;
      this.field_10134 = var2;
   }

   public boolean method_9248() {
      return this.field_10134;
   }

   public void method_9257(class_4508 var1) {
      this.field_10126 = var1;
   }

   public class_4508 method_9250() {
      return this.field_10126;
   }

   public void method_9247(String var1) {
      this.field_10129 = var1;
   }

   public void method_9260(class_4226 var1) {
      if (this.field_10129 != null) {
         class_1993 var4 = var1.method_19681(this.field_10129);

         for (int var5 = 0; var5 < var4.field_10132.size(); var5++) {
            this.field_10132.add(var4.field_10132.get(var5));
         }
      }
   }

   public void method_9252() {
      if (this.field_10125 == null) {
         class_5688 var3 = new class_5688(128, 16);

         for (int var4 = 0; var4 < 128; var4++) {
            class_8709 var5 = this.method_9253((float)var4 / 128.0F);

            for (int var6 = 0; var6 < 16; var6++) {
               var3.method_25727(var4, var6, var5.method_40033(), var5.method_40025(), var5.method_40019(), var5.method_40031());
            }
         }

         this.field_10125 = var3.method_25725();
      }
   }

   public class_8112 method_9256() {
      this.method_9252();
      return this.field_10125;
   }

   public void method_9254(float var1) {
      this.field_10124 = var1;
   }

   public void method_9242(float var1) {
      this.field_10128 = var1;
   }

   public void method_9245(float var1) {
      this.field_10130 = var1;
   }

   public void method_9249(float var1) {
      this.field_10133 = var1;
   }

   public void method_9259(float var1) {
      this.field_10127 = var1;
   }

   public float method_9255() {
      return this.field_10124;
   }

   public float method_9244() {
      return this.field_10128;
   }

   public float method_9246() {
      return this.field_10130;
   }

   public float method_9243() {
      return this.field_10133;
   }

   public float method_9258() {
      return this.field_10127;
   }

   public void method_9251(float var1, class_8709 var2) {
      this.field_10132.add(new class_4576(this, var1, var2));
   }

   public class_8709 method_9253(float var1) {
      if (var1 <= 0.0F) {
         return ((class_4576)this.field_10132.get(0)).field_22275;
      } else if (var1 > 1.0F) {
         return ((class_4576)this.field_10132.get(this.field_10132.size() - 1)).field_22275;
      } else {
         for (int var4 = 1; var4 < this.field_10132.size(); var4++) {
            class_4576 var5 = (class_4576)this.field_10132.get(var4 - 1);
            class_4576 var6 = (class_4576)this.field_10132.get(var4);
            if (var1 <= var6.field_22276) {
               float var7 = var6.field_22276 - var5.field_22276;
               var1 -= var5.field_22276;
               float var8 = var1 / var7;
               class_8709 var9 = new class_8709(1, 1, 1, 1);
               var9.field_44645 = var5.field_22275.field_44645 * (1.0F - var8) + var6.field_22275.field_44645 * var8;
               var9.field_44663 = var5.field_22275.field_44663 * (1.0F - var8) + var6.field_22275.field_44663 * var8;
               var9.field_44649 = var5.field_22275.field_44649 * (1.0F - var8) + var6.field_22275.field_44649 * var8;
               var9.field_44648 = var5.field_22275.field_44648 * (1.0F - var8) + var6.field_22275.field_44648 * var8;
               return var9;
            }
         }

         return class_8709.field_44647;
      }
   }
}
