package remapped;

public class class_6093 extends class_3429 {
   private static String[] field_31181;

   public class_6093(EntityType<? extends class_6093> var1, World var2) {
      super(var1, var2);
   }

   public class_6093(World var1, class_5834 var2) {
      super(EntityType.field_34219, var2, var1);
   }

   public class_6093(World var1, double var2, double var4, double var6) {
      super(EntityType.field_34219, var2, var4, var6, var1);
   }

   @Override
   public class_2451 method_15854() {
      return class_4897.field_24623;
   }

   @Override
   public float method_43874() {
      return 0.07F;
   }

   @Override
   public void method_26160(class_7474 var1) {
      super.method_26160(var1);
      if (!this.world.field_33055) {
         this.world.method_43364(2002, this.method_37075(), class_9541.method_44000(class_3697.field_18108));
         int var4 = 3 + this.world.field_33033.nextInt(5) + this.world.field_33033.nextInt(5);

         while (var4 > 0) {
            int var5 = class_5614.method_25476(var4);
            var4 -= var5;
            this.world.method_7509(new class_5614(this.world, this.getPosX(), this.method_37309(), this.getPosZ(), var5));
         }

         this.method_37204();
      }
   }
}
