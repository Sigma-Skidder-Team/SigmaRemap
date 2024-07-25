package remapped;

import java.util.ArrayList;

public class class_9609 extends class_3316 {
   private static String[] field_48969;
   public static final int field_48966 = 50;
   private int field_48967;
   private float field_48968;
   private float field_48970;

   public class_9609(float var1, float var2, float var3, float var4) {
      this(var1, var2, var3, var4, 50);
   }

   public class_9609(float var1, float var2, float var3, float var4, int var5) {
      this.field_16381 = var1 - var3;
      this.field_16380 = var2 - var4;
      this.field_48968 = var3;
      this.field_48970 = var4;
      this.field_48967 = var5;
      this.method_15202();
   }

   public void method_44371(float var1, float var2) {
      this.method_44367(var1);
      this.method_44370(var2);
   }

   public float method_44368() {
      return this.field_48968;
   }

   public void method_44367(float var1) {
      if (var1 != this.field_48968) {
         this.field_48968 = var1;
         this.field_16377 = true;
      }
   }

   public float method_44369() {
      return this.field_48970;
   }

   public void method_44370(float var1) {
      if (var1 != this.field_48970) {
         this.field_48970 = var1;
         this.field_16377 = true;
      }
   }

   @Override
   public void method_15217() {
      ArrayList var3 = new ArrayList();
      this.field_16386 = -Float.MIN_VALUE;
      this.field_16375 = -Float.MIN_VALUE;
      this.field_16384 = Float.MAX_VALUE;
      this.field_16383 = Float.MAX_VALUE;
      float var4 = 0.0F;
      float var5 = 359.0F;
      float var6 = this.field_16381 + this.field_48968;
      float var7 = this.field_16380 + this.field_48970;
      int var8 = 360 / this.field_48967;

      for (float var9 = var4; var9 <= var5 + (float)var8; var9 += (float)var8) {
         float var10 = var9;
         if (var9 > var5) {
            var10 = var5;
         }

         float var11 = (float)((double)var6 + class_215.method_933(Math.toRadians((double)var10)) * (double)this.field_48968);
         float var12 = (float)((double)var7 + class_215.method_932(Math.toRadians((double)var10)) * (double)this.field_48970);
         if (var11 > this.field_16386) {
            this.field_16386 = var11;
         }

         if (var12 > this.field_16375) {
            this.field_16375 = var12;
         }

         if (var11 < this.field_16384) {
            this.field_16384 = var11;
         }

         if (var12 < this.field_16383) {
            this.field_16383 = var12;
         }

         var3.add(new Float(var11));
         var3.add(new Float(var12));
      }

      this.field_16385 = new float[var3.size()];

      for (int var13 = 0; var13 < this.field_16385.length; var13++) {
         this.field_16385[var13] = (Float)var3.get(var13);
      }
   }

   @Override
   public class_3316 method_15207(class_4508 var1) {
      this.method_15202();
      class_6714 var4 = new class_6714();
      float[] var5 = new float[this.field_16385.length];
      var1.method_20952(this.field_16385, 0, var5, 0, this.field_16385.length / 2);
      var4.field_16385 = var5;
      var4.method_15202();
      return var4;
   }

   @Override
   public void method_15218() {
      this.field_16376 = new float[2];
      this.field_16376[0] = this.field_16381 + this.field_48968;
      this.field_16376[1] = this.field_16380 + this.field_48970;
   }

   @Override
   public void method_15235() {
      this.field_16379 = !(this.field_48968 > this.field_48970) ? this.field_48970 : this.field_48968;
   }
}
