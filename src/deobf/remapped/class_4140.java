package remapped;

public class class_4140 extends class_9767 {
   private static String[] field_20148;
   private class_8416 field_20147;

   private class_4140() {
   }

   @Override
   public synchronized class_2993 method_45071(int var1) {
      if (this.field_20147 != null && class_8416.method_38733(this.field_20147) == var1) {
         return this.field_20147;
      } else {
         this.field_20147 = new class_8416(var1);
         return this.field_20147;
      }
   }
}
