package remapped;

public class class_5670 extends class_4407 {
   private static String[] field_28748;
   private final class_496 field_28747;

   public class_5670(class_496 var1, Class<? extends class_5834> var2, float var3) {
      super(var1, var2, var3);
      this.field_28747 = var1;
   }

   public void method_25654(class_5834 var1) {
      this.field_21563 = var1;
   }

   @Override
   public boolean method_16799() {
      return this.field_21563 != null && super.method_16799();
   }

   @Override
   public boolean method_16795() {
      if (!(this.field_21568.method_26594().nextFloat() >= this.field_21565)) {
         if (this.field_21563 == null) {
            if (this.field_21567 != class_704.class) {
               this.field_21563 = this.field_21568
                  .world
                  .<class_5834>method_25872(
                     this.field_21567,
                     this.field_21569,
                     this.field_21568,
                     this.field_21568.getPosX(),
                     this.field_21568.method_37388(),
                     this.field_21568.getPosZ(),
                     this.field_21568.method_37241().method_18899((double)this.field_21566, 3.0, (double)this.field_21566)
                  );
            } else {
               this.field_21563 = this.field_21568
                  .world
                  .method_25860(
                     this.field_21569, this.field_21568, this.field_21568.getPosX(), this.field_21568.method_37388(), this.field_21568.getPosZ()
                  );
            }
         }

         return this.field_28747.method_2451() && this.field_21563 != null;
      } else {
         return false;
      }
   }

   @Override
   public void method_16794() {
      if (this.field_21563 != null) {
         super.method_16794();
      }
   }
}
