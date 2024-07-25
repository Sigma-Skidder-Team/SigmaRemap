package remapped;

import javax.annotation.Nullable;

public class class_3936 extends class_1871 {
   private static String[] field_19124;
   private class_1343 field_19125;
   private int field_19123;

   public class_3936(class_2770 var1) {
      super(var1);
   }

   @Override
   public void method_23466() {
      if (this.field_19123++ % 10 == 0) {
         float var3 = (this.field_9479.method_26594().nextFloat() - 0.5F) * 8.0F;
         float var4 = (this.field_9479.method_26594().nextFloat() - 0.5F) * 4.0F;
         float var5 = (this.field_9479.method_26594().nextFloat() - 0.5F) * 8.0F;
         this.field_9479
            .world
            .method_43361(
               class_3090.field_15377,
               this.field_9479.method_37302() + (double)var3,
               this.field_9479.method_37309() + 2.0 + (double)var4,
               this.field_9479.method_37156() + (double)var5,
               0.0,
               0.0,
               0.0
            );
      }
   }

   @Override
   public void method_23473() {
      this.field_19123++;
      if (this.field_19125 == null) {
         BlockPos var5 = this.field_9479.world.method_22563(class_3801.field_18595, class_8870.field_45348);
         this.field_19125 = class_1343.method_6200(var5);
      }

      double var3 = this.field_19125.method_6203(this.field_9479.method_37302(), this.field_9479.method_37309(), this.field_9479.method_37156());
      if (!(var3 < 100.0) && !(var3 > 22500.0) && !this.field_9479.field_41744 && !this.field_9479.field_41774) {
         this.field_9479.method_26456(1.0F);
      } else {
         this.field_9479.method_26456(0.0F);
      }
   }

   @Override
   public void method_23469() {
      this.field_19125 = null;
      this.field_19123 = 0;
   }

   @Override
   public float method_23470() {
      return 3.0F;
   }

   @Nullable
   @Override
   public class_1343 method_23463() {
      return this.field_19125;
   }

   @Override
   public class_8978<class_3936> method_23464() {
      return class_8978.field_46005;
   }
}
