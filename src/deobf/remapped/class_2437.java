package remapped;

import java.util.ArrayList;

public class class_2437 implements class_6948 {
   private static String[] field_12114;
   private ArrayList field_12115;
   private boolean field_12117;
   private int field_12116;
   private int field_12113;

   public class_2437(class_487 var1, ArrayList var2, int var3, int var4) {
      this.field_12118 = var1;
      this.field_12115 = var2;
      this.field_12116 = var3;
      this.field_12113 = var4;
      this.field_12117 = false;
   }

   public void method_11104(ArrayList var1) {
      this.field_12115 = var1;
   }

   public ArrayList method_11107() {
      return this.field_12115;
   }

   @Override
   public float method_31784(float var1) {
      class_1440 var4 = (class_1440)this.field_12115.get(0);

      for (int var5 = 1; var5 < this.field_12115.size(); var5++) {
         class_1440 var6 = (class_1440)this.field_12115.get(var5);
         if (var1 >= var4.method_6610() && var1 <= var6.method_6610()) {
            float var7 = (var1 - var4.method_6610()) / (var6.method_6610() - var4.method_6610());
            return var4.method_6613() + var7 * (var6.method_6613() - var4.method_6613());
         }

         var4 = var6;
      }

      return 0.0F;
   }

   public boolean method_11108() {
      return this.field_12117;
   }

   public void method_11106(boolean var1) {
      this.field_12117 = var1;
   }

   public int method_11111() {
      return this.field_12113;
   }

   public void method_11110(int var1) {
      this.field_12113 = var1;
   }

   public int method_11105() {
      return this.field_12116;
   }

   public void method_11103(int var1) {
      this.field_12116 = var1;
   }
}
