package remapped;

public class class_1662 implements class_7907 {
   private final class_7907 field_8618;
   private final class_7907 field_8617;

   public class_1662(class_7907 var1, class_7907 var2) {
      if (var1 != var2) {
         this.field_8618 = var1;
         this.field_8617 = var2;
      } else {
         throw new IllegalArgumentException("Duplicate delegates");
      }
   }

   @Override
   public class_7907 method_35761(double var1, double var3, double var5) {
      this.field_8618.method_35761(var1, var3, var5);
      this.field_8617.method_35761(var1, var3, var5);
      return this;
   }

   @Override
   public class_7907 method_35743(int var1, int var2, int var3, int var4) {
      this.field_8618.method_35743(var1, var2, var3, var4);
      this.field_8617.method_35743(var1, var2, var3, var4);
      return this;
   }

   @Override
   public class_7907 method_35745(float var1, float var2) {
      this.field_8618.method_35745(var1, var2);
      this.field_8617.method_35745(var1, var2);
      return this;
   }

   @Override
   public class_7907 method_35738(int var1, int var2) {
      this.field_8618.method_35738(var1, var2);
      this.field_8617.method_35738(var1, var2);
      return this;
   }

   @Override
   public class_7907 method_35748(int var1, int var2) {
      this.field_8618.method_35748(var1, var2);
      this.field_8617.method_35748(var1, var2);
      return this;
   }

   @Override
   public class_7907 method_35755(float var1, float var2, float var3) {
      this.field_8618.method_35755(var1, var2, var3);
      this.field_8617.method_35755(var1, var2, var3);
      return this;
   }

   @Override
   public void method_35744(
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      int var10,
      int var11,
      float var12,
      float var13,
      float var14
   ) {
      this.field_8618.method_35744(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14);
      this.field_8617.method_35744(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14);
   }

   @Override
   public void method_35735() {
      this.field_8618.method_35735();
      this.field_8617.method_35735();
   }

   @Override
   public void method_35734(class_5155 var1) {
      this.field_8618.method_35734(var1);
      this.field_8617.method_35734(var1);
   }

   @Override
   public void method_35752(class_5155 var1) {
      this.field_8618.method_35752(var1);
      this.field_8617.method_35752(var1);
   }

   @Override
   public void method_35736(class_3581 var1) {
      this.field_8618.method_35736(var1);
      this.field_8617.method_35736(var1);
   }

   @Override
   public class_2426 method_35754(class_2426 var1) {
      return this.field_8617.method_35754(var1);
   }

   @Override
   public class_2426 method_35753(float var1, float var2, float var3) {
      return this.field_8617.method_35753(var1, var2, var3);
   }

   @Override
   public float[] method_35746(float var1, float var2, float var3, float var4) {
      return this.field_8617.method_35746(var1, var2, var3, var4);
   }

   @Override
   public int[] method_35739(int var1, int var2, int var3, int var4) {
      return this.field_8617.method_35739(var1, var2, var3, var4);
   }

   @Override
   public class_3758 method_35733() {
      return this.field_8617.method_35733();
   }
}
