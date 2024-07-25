package remapped;

public class class_1601 extends AbstractMinecartEntity {
   private static String[] field_8332;

   public class_1601(EntityType<?> var1, World var2) {
      super(var1, var2);
   }

   public class_1601(World var1, double var2, double var4, double var6) {
      super(EntityType.field_34239, var1, var2, var4, var6);
   }

   @Override
   public class_6910 method_37128(PlayerEntity var1, Hand var2) {
      if (!var1.method_3236()) {
         if (!this.method_37151()) {
            if (this.world.field_33055) {
               return class_6910.field_35520;
            } else {
               return !var1.method_37353(this) ? class_6910.field_35521 : class_6910.field_35518;
            }
         } else {
            return class_6910.field_35521;
         }
      } else {
         return class_6910.field_35521;
      }
   }

   @Override
   public void method_4758(int var1, int var2, int var3, boolean var4) {
      if (var4) {
         if (this.method_37151()) {
            this.method_37305();
         }

         if (this.method_4747() == 0) {
            this.method_4756(-this.method_4751());
            this.method_4749(10);
            this.method_4742(50.0F);
            this.method_37138();
         }
      }
   }

   @Override
   public class_3481 method_4737() {
      return class_3481.field_17066;
   }
}
