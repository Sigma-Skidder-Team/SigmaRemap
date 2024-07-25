package remapped;

public class class_8696 extends class_8985 {
   private static String[] field_44592;
   private BlockPos field_44593;

   public class_8696(MobEntity var1, World var2) {
      super(var1, var2);
   }

   @Override
   public class_3998 method_5615(BlockPos var1, int var2) {
      this.field_44593 = var1;
      return super.method_5615(var1, var2);
   }

   @Override
   public class_3998 method_5598(Entity var1, int var2) {
      this.field_44593 = var1.method_37075();
      return super.method_5598(var1, var2);
   }

   @Override
   public boolean method_5616(Entity var1, double var2) {
      class_3998 var6 = this.method_5598(var1, 0);
      if (var6 == null) {
         this.field_44593 = var1.method_37075();
         this.field_6871 = var2;
         return true;
      } else {
         return this.method_5607(var6, var2);
      }
   }

   @Override
   public void method_5612() {
      if (this.method_5591()) {
         if (this.field_44593 != null) {
            if (!this.field_44593.method_12170(this.field_6877.method_37245(), (double)this.field_6877.method_37086())
               && (
                  !(this.field_6877.method_37309() > (double)this.field_44593.getY())
                     || !new BlockPos((double)this.field_44593.getX(), this.field_6877.method_37309(), (double)this.field_44593.getZ())
                        .method_12170(this.field_6877.method_37245(), (double)this.field_6877.method_37086())
               )) {
               this.field_6877
                  .method_26905()
                  .method_12879(
                     (double)this.field_44593.getX(), (double)this.field_44593.getY(), (double)this.field_44593.getZ(), this.field_6871
                  );
            } else {
               this.field_44593 = null;
            }
         }
      } else {
         super.method_5612();
      }
   }
}
