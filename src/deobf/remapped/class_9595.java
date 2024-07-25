package remapped;

public class class_9595 extends LookAtGoal {
   private static String[] field_48900;
   private final AbstractVillagerEntity field_48899;

   public class_9595(AbstractVillagerEntity var1) {
      super(var1, PlayerEntity.class, 8.0F);
      this.field_48899 = var1;
   }

   @Override
   public boolean method_16795() {
      if (!this.field_48899.method_2024()) {
         return false;
      } else {
         this.field_21563 = this.field_48899.method_978();
         return true;
      }
   }
}
