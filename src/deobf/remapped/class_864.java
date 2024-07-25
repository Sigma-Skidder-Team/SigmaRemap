package remapped;

public class class_864 extends class_3599 {
   private static String[] field_4475;
   private int field_4476;

   private class_864(class_6092 var1) {
      this.field_4474 = var1;
   }

   @Override
   public boolean method_16795() {
      return this.field_4474.method_17809() == null && class_6092.method_27915(this.field_4474).nextInt(40) == 0;
   }

   @Override
   public boolean method_16799() {
      return this.field_4474.method_17809() == null && this.field_4476 > 0;
   }

   @Override
   public void method_16796() {
      this.field_4476 = 20 * (1 + class_6092.method_27919(this.field_4474).nextInt(3));
      this.field_4474.method_27913(30);
   }

   @Override
   public void method_16793() {
      if (this.field_4474.method_17809() == null) {
         this.field_4474.method_27913(0);
      }
   }

   @Override
   public void method_16794() {
      this.field_4476--;
   }
}
