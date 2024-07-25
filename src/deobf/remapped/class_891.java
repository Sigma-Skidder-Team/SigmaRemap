package remapped;

public class class_891 extends class_9190 {
   private static String[] field_4587;
   private final class_5079 field_4586;

   private class_891(class_174 var1, double var2, double var4, double var6, class_2340 var8, class_5079 var9) {
      super(var1, var2, var4, var6, var8, null);
      this.field_4586 = var9;
      this.field_49477 *= 0.02F;
      this.field_49476 = 40;
   }

   @Override
   public void method_42358() {
      if (this.field_49476-- <= 0) {
         this.method_44948();
         this.field_49469
            .method_43361(this.field_4586, this.field_49462, this.field_49473, this.field_49465, this.field_49481, this.field_49486, this.field_49471);
      }
   }

   @Override
   public void method_42359() {
      this.field_49481 *= 0.02;
      this.field_49486 *= 0.02;
      this.field_49471 *= 0.02;
   }
}
