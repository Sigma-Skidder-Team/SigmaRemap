package remapped;

import java.util.Random;

public class class_675 extends class_9513 {
   private static String[] field_3738;
   private final class_3845 field_3737;

   public class_675(class_3845 var1, double var2) {
      super(var1, var2);
      this.field_3737 = var1;
   }

   @Override
   public boolean method_16795() {
      return super.method_16795() && !this.field_3737.method_17856();
   }

   @Override
   public void method_43906() {
      class_9359 var3 = this.field_48435.method_24877();
      if (var3 == null && this.field_48441.method_24877() != null) {
         var3 = this.field_48441.method_24877();
      }

      if (var3 != null) {
         var3.method_3209(class_6234.field_31883);
         class_8807.field_45072.method_5733(var3, this.field_48435, this.field_48441, (class_1899)null);
      }

      class_3845.method_17857(this.field_3737, true);
      this.field_48435.method_24876();
      this.field_48441.method_24876();
      Random var4 = this.field_48435.method_26594();
      if (this.field_48439.getGameRules().getBoolean(GameRules.field_1033)) {
         this.field_48439
            .method_7509(
               new class_5614(
                  this.field_48439, this.field_48435.getPosX(), this.field_48435.method_37309(), this.field_48435.getPosZ(), var4.nextInt(7) + 1
               )
            );
      }
   }
}
