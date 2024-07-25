package remapped;

public class class_2783 extends class_3316 {
   public float field_13583;
   public float field_13582;

   public class_2783(float var1, float var2, float var3, float var4) {
      this.field_16381 = var1;
      this.field_16380 = var2;
      this.field_13583 = var3;
      this.field_13582 = var4;
      this.field_16386 = var1 + var3;
      this.field_16375 = var2 + var4;
      this.method_15202();
   }

   @Override
   public boolean method_15224(float var1, float var2) {
      if (!(var1 <= this.method_15212())) {
         if (!(var2 <= this.method_15220())) {
            return !(var1 >= this.field_16386) ? !(var2 >= this.field_16375) : false;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public void method_12658(class_2783 var1) {
      this.method_12657(var1.method_15212(), var1.method_15220(), var1.method_15213(), var1.method_15239());
   }

   public void method_12657(float var1, float var2, float var3, float var4) {
      this.method_15201(var1);
      this.method_15240(var2);
      this.method_12656(var3, var4);
   }

   public void method_12656(float var1, float var2) {
      this.method_12653(var1);
      this.method_12660(var2);
   }

   @Override
   public float method_15213() {
      return this.field_13583;
   }

   @Override
   public float method_15239() {
      return this.field_13582;
   }

   public void method_12659(float var1, float var2) {
      this.method_15201(this.method_15212() - var1);
      this.method_15240(this.method_15220() - var2);
      this.method_12653(this.method_15213() + var1 * 2.0F);
      this.method_12660(this.method_15239() + var2 * 2.0F);
   }

   public void method_12661(float var1, float var2) {
      this.method_12659(this.method_15213() * (var1 - 1.0F), this.method_15239() * (var2 - 1.0F));
   }

   public void method_12653(float var1) {
      if (var1 != this.field_13583) {
         this.field_16377 = true;
         this.field_13583 = var1;
         this.field_16386 = this.field_16381 + var1;
      }
   }

   public void method_12660(float var1) {
      if (var1 != this.field_13582) {
         this.field_16377 = true;
         this.field_13582 = var1;
         this.field_16375 = this.field_16380 + var1;
      }
   }

   @Override
   public boolean method_15205(class_3316 var1) {
      if (!(var1 instanceof class_2783)) {
         return !(var1 instanceof class_2774) ? super.method_15205(var1) : this.method_12654((class_2774)var1);
      } else {
         class_2783 var4 = (class_2783)var1;
         return this.field_16381 > var4.field_16381 + var4.field_13583 || this.field_16381 + this.field_13583 < var4.field_16381
            ? false
            : !(this.field_16380 > var4.field_16380 + var4.field_13582) && !(this.field_16380 + this.field_13582 < var4.field_16380);
      }
   }

   @Override
   public void method_15217() {
      float var3 = this.field_13583;
      float var4 = this.field_13582;
      this.field_16385 = new float[8];
      this.field_16385[0] = this.field_16381;
      this.field_16385[1] = this.field_16380;
      this.field_16385[2] = this.field_16381 + var3;
      this.field_16385[3] = this.field_16380;
      this.field_16385[4] = this.field_16381 + var3;
      this.field_16385[5] = this.field_16380 + var4;
      this.field_16385[6] = this.field_16381;
      this.field_16385[7] = this.field_16380 + var4;
      this.field_16386 = this.field_16385[2];
      this.field_16375 = this.field_16385[5];
      this.field_16384 = this.field_16385[0];
      this.field_16383 = this.field_16385[1];
      this.method_15218();
      this.method_15235();
   }

   private boolean method_12654(class_2774 var1) {
      return var1.method_15205(this);
   }

   @Override
   public String toString() {
      return "[Rectangle " + this.field_13583 + "x" + this.field_13582 + "]";
   }

   public static boolean method_12655(float var0, float var1, float var2, float var3, float var4, float var5) {
      return var0 >= var2 && var1 >= var3 && var0 <= var2 + var4 && var1 <= var3 + var5;
   }

   @Override
   public class_3316 method_15207(class_4508 var1) {
      this.method_15202();
      class_6714 var4 = new class_6714();
      float[] var5 = new float[this.field_16385.length];
      var1.method_20952(this.field_16385, 0, var5, 0, this.field_16385.length / 2);
      var4.field_16385 = var5;
      var4.method_15218();
      var4.method_15202();
      return var4;
   }
}
