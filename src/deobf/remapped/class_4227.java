package remapped;

public class class_4227 extends class_3316 {
   private static String[] field_20510;

   public class_4227(float var1, float var2) {
      this.field_16381 = var1;
      this.field_16380 = var2;
      this.method_15202();
   }

   @Override
   public class_3316 method_15207(class_4508 var1) {
      float[] var4 = new float[this.field_16385.length];
      var1.method_20952(this.field_16385, 0, var4, 0, this.field_16385.length / 2);
      return new class_4227(this.field_16385[0], this.field_16385[1]);
   }

   @Override
   public void method_15217() {
      this.field_16385 = new float[2];
      this.field_16385[0] = this.method_15212();
      this.field_16385[1] = this.method_15220();
      this.field_16386 = this.field_16381;
      this.field_16375 = this.field_16380;
      this.field_16384 = this.field_16381;
      this.field_16383 = this.field_16380;
      this.method_15218();
      this.method_15235();
   }

   @Override
   public void method_15218() {
      this.field_16376 = new float[2];
      this.field_16376[0] = this.field_16385[0];
      this.field_16376[1] = this.field_16385[1];
   }

   @Override
   public void method_15235() {
      this.field_16379 = 0.0F;
   }
}
