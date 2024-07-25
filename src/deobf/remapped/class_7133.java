package remapped;

public class class_7133 extends class_3316 {
   private class_1440 field_36749;
   private class_1440 field_36758;
   private class_1440 field_36751;
   private float field_36753;
   private class_1440 field_36752 = new class_1440(0.0F, 0.0F);
   private class_1440 field_36756 = new class_1440(0.0F, 0.0F);
   private class_1440 field_36750 = new class_1440(0.0F, 0.0F);
   private class_1440 field_36754 = new class_1440(0.0F, 0.0F);
   private class_1440 field_36761 = new class_1440(0.0F, 0.0F);
   private class_1440 field_36755 = new class_1440(0.0F, 0.0F);
   private boolean field_36757 = true;
   private boolean field_36760 = true;

   public class_7133(float var1, float var2, boolean var3, boolean var4) {
      this(0.0F, 0.0F, var1, var2);
   }

   public class_7133(float var1, float var2) {
      this(var1, var2, true, true);
   }

   public class_7133(float var1, float var2, float var3, float var4) {
      this(new class_1440(var1, var2), new class_1440(var3, var4));
   }

   public class_7133(float var1, float var2, float var3, float var4, boolean var5) {
      this(new class_1440(var1, var2), new class_1440(var1 + var3, var2 + var4));
   }

   public class_7133(float[] var1, float[] var2) {
      this.method_32758(var1, var2);
   }

   public class_7133(class_1440 var1, class_1440 var2) {
      this.method_32757(var1, var2);
   }

   public void method_32758(float[] var1, float[] var2) {
      this.method_32756(var1[0], var1[1], var2[0], var2[1]);
   }

   public class_1440 method_32769() {
      return this.field_36749;
   }

   public class_1440 method_32760() {
      return this.field_36758;
   }

   public float method_32768() {
      return this.field_36751.method_6597();
   }

   public float method_32761() {
      return this.field_36751.method_6601();
   }

   public void method_32757(class_1440 var1, class_1440 var2) {
      super.field_16377 = true;
      if (this.field_36749 == null) {
         this.field_36749 = new class_1440();
      }

      this.field_36749.method_6592(var1);
      if (this.field_36758 == null) {
         this.field_36758 = new class_1440();
      }

      this.field_36758.method_6592(var2);
      this.field_36751 = new class_1440(var2);
      this.field_36751.method_6605(var1);
      this.field_36753 = this.field_36751.method_6601();
   }

   public void method_32756(float var1, float var2, float var3, float var4) {
      super.field_16377 = true;
      this.field_36749.method_6591(var1, var2);
      this.field_36758.method_6591(var3, var4);
      float var7 = var3 - var1;
      float var8 = var4 - var2;
      this.field_36751.method_6591(var7, var8);
      this.field_36753 = var7 * var7 + var8 * var8;
   }

   public float method_32771() {
      return this.field_36758.method_6610() - this.field_36749.method_6610();
   }

   public float method_32753() {
      return this.field_36758.method_6613() - this.field_36749.method_6613();
   }

   @Override
   public float method_15212() {
      return this.method_32762();
   }

   @Override
   public float method_15220() {
      return this.method_32770();
   }

   public float method_32762() {
      return this.field_36749.method_6610();
   }

   public float method_32770() {
      return this.field_36749.method_6613();
   }

   public float method_32755() {
      return this.field_36758.method_6610();
   }

   public float method_32754() {
      return this.field_36758.method_6613();
   }

   public float method_32763(class_1440 var1) {
      return (float)Math.sqrt((double)this.method_32767(var1));
   }

   public boolean method_32759(class_1440 var1) {
      this.method_32772(var1, this.field_36761);
      return var1.equals(this.field_36761);
   }

   public float method_32767(class_1440 var1) {
      this.method_32772(var1, this.field_36761);
      this.field_36761.method_6605(var1);
      return this.field_36761.method_6601();
   }

   public void method_32772(class_1440 var1, class_1440 var2) {
      this.field_36752.method_6592(var1);
      this.field_36752.method_6605(this.field_36749);
      float var5 = this.field_36751.method_6606(this.field_36752);
      var5 /= this.field_36751.method_6601();
      if (!(var5 < 0.0F)) {
         if (!(var5 > 1.0F)) {
            var2.field_7766 = this.field_36749.method_6610() + var5 * this.field_36751.method_6610();
            var2.field_7765 = this.field_36749.method_6613() + var5 * this.field_36751.method_6613();
         } else {
            var2.method_6592(this.field_36758);
         }
      } else {
         var2.method_6592(this.field_36749);
      }
   }

   @Override
   public String toString() {
      return "[Line " + this.field_36749 + "," + this.field_36758 + "]";
   }

   public class_1440 method_32764(class_7133 var1) {
      return this.method_32765(var1, false);
   }

   public class_1440 method_32765(class_7133 var1, boolean var2) {
      class_1440 var5 = new class_1440();
      return this.method_32766(var1, var2, var5) ? var5 : null;
   }

   public boolean method_32766(class_7133 var1, boolean var2, class_1440 var3) {
      float var6 = this.field_36758.method_6610() - this.field_36749.method_6610();
      float var7 = var1.field_36758.method_6610() - var1.field_36749.method_6610();
      float var8 = this.field_36758.method_6613() - this.field_36749.method_6613();
      float var9 = var1.field_36758.method_6613() - var1.field_36749.method_6613();
      float var10 = var9 * var6 - var7 * var8;
      if (var10 == 0.0F) {
         return false;
      } else {
         float var11 = var7 * (this.field_36749.method_6613() - var1.field_36749.method_6613())
            - var9 * (this.field_36749.method_6610() - var1.field_36749.method_6610());
         var11 /= var10;
         float var12 = var6 * (this.field_36749.method_6613() - var1.field_36749.method_6613())
            - var8 * (this.field_36749.method_6610() - var1.field_36749.method_6610());
         var12 /= var10;
         if (var2 && (var11 < 0.0F || var11 > 1.0F || var12 < 0.0F || var12 > 1.0F)) {
            return false;
         } else {
            float var14 = this.field_36749.method_6610() + var11 * (this.field_36758.method_6610() - this.field_36749.method_6610());
            float var15 = this.field_36749.method_6613() + var11 * (this.field_36758.method_6613() - this.field_36749.method_6613());
            var3.method_6591(var14, var15);
            return true;
         }
      }
   }

   @Override
   public void method_15217() {
      this.field_16385 = new float[4];
      this.field_16385[0] = this.method_32762();
      this.field_16385[1] = this.method_32770();
      this.field_16385[2] = this.method_32755();
      this.field_16385[3] = this.method_32754();
   }

   @Override
   public class_3316 method_15207(class_4508 var1) {
      float[] var4 = new float[4];
      this.method_15217();
      var1.method_20952(this.field_16385, 0, var4, 0, 2);
      return new class_7133(var4[0], var4[1], var4[2], var4[3]);
   }

   @Override
   public boolean method_15232() {
      return false;
   }

   @Override
   public boolean method_15205(class_3316 var1) {
      return !(var1 instanceof class_2774) ? super.method_15205(var1) : var1.method_15205(this);
   }
}
