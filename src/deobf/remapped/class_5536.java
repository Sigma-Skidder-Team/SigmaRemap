package remapped;

import java.util.Random;
import javax.annotation.Nullable;

public class class_5536 extends class_1871 {
   private static String[] field_28216;
   private class_1343 field_28217;

   public class_5536(class_2770 var1) {
      super(var1);
   }

   @Override
   public void method_23466() {
      class_1343 var3 = this.field_9479.method_12609(1.0F).method_6213();
      var3.method_6192((float) (-Math.PI / 4));
      double var4 = this.field_9479.field_13542.method_37302();
      double var6 = this.field_9479.field_13542.method_37080(0.5);
      double var8 = this.field_9479.field_13542.method_37156();

      for (int var10 = 0; var10 < 8; var10++) {
         Random var11 = this.field_9479.method_26594();
         double var12 = var4 + var11.nextGaussian() / 2.0;
         double var14 = var6 + var11.nextGaussian() / 2.0;
         double var16 = var8 + var11.nextGaussian() / 2.0;
         class_1343 var18 = this.field_9479.method_37098();
         this.field_9479
            .world
            .method_43361(
               class_3090.field_15315,
               var12,
               var14,
               var16,
               -var3.field_7336 * 0.08F + var18.field_7336,
               -var3.field_7333 * 0.3F + var18.field_7333,
               -var3.field_7334 * 0.08F + var18.field_7334
            );
         var3.method_6192((float) (Math.PI / 16));
      }
   }

   @Override
   public void method_23473() {
      if (this.field_28217 == null) {
         this.field_28217 = class_1343.method_6200(this.field_9479.world.method_22563(class_3801.field_18590, class_8870.field_45348));
      }

      if (this.field_28217.method_6203(this.field_9479.method_37302(), this.field_9479.method_37309(), this.field_9479.method_37156()) < 1.0) {
         this.field_9479.method_12611().<class_7659>method_29420(class_8978.field_45997).method_34666();
         this.field_9479.method_12611().method_29422(class_8978.field_45998);
      }
   }

   @Override
   public float method_23470() {
      return 1.5F;
   }

   @Override
   public float method_23465() {
      float var3 = class_9299.method_42842(Entity.method_37266(this.field_9479.method_37098())) + 1.0F;
      float var4 = Math.min(var3, 40.0F);
      return var4 / var3;
   }

   @Override
   public void method_23469() {
      this.field_28217 = null;
   }

   @Nullable
   @Override
   public class_1343 method_23463() {
      return this.field_28217;
   }

   @Override
   public class_8978<class_5536> method_23464() {
      return class_8978.field_45995;
   }
}
