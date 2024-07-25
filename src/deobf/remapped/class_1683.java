package remapped;

public class class_1683 extends class_5502 {
   private static String[] field_8707;

   private class_1683(ClientWorld var1, double var2, double var4, double var6, class_2340 var8, class_5079 var9) {
      super(var1, var2, var4, var6, var8, var9, null);
   }

   @Override
   public void method_42359() {
      if (this.field_49482) {
         this.method_44948();
         this.field_49469.method_43361(this.field_28000, this.field_49462, this.field_49473, this.field_49465, 0.0, 0.0, 0.0);
         this.field_49469
            .method_29527(
               this.field_49462 + 0.5,
               this.field_49473,
               this.field_49465 + 0.5,
               class_463.field_2646,
               class_562.field_3322,
               0.3F + this.field_49469.field_33033.nextFloat() * 2.0F / 3.0F,
               1.0F,
               false
            );
      }
   }
}
