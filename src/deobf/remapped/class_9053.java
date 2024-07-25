package remapped;

public class class_9053 extends class_2550 {
   public int field_46360 = 1;

   public class_9053(class_6629<? extends class_9053> var1, World var2) {
      super(var1, var2);
   }

   public class_9053(World var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(class_6629.field_34216, var2, var4, var6, var8, var10, var12, var1);
   }

   public class_9053(World var1, class_5834 var2, double var3, double var5, double var7) {
      super(class_6629.field_34216, var2, var3, var5, var7, var1);
   }

   @Override
   public void method_26160(class_7474 var1) {
      super.method_26160(var1);
      if (!this.field_41768.field_33055) {
         boolean var4 = this.field_41768.method_29537().method_1285(class_291.field_1047);
         this.field_41768
            .method_29574(
               (Entity)null,
               this.method_37302(),
               this.method_37309(),
               this.method_37156(),
               (float)this.field_46360,
               var4,
               !var4 ? class_7298.field_37310 : class_7298.field_37311
            );
         this.method_37204();
      }
   }

   @Override
   public void method_26163(class_5631 var1) {
      super.method_26163(var1);
      if (!this.field_41768.field_33055) {
         Entity var4 = var1.method_25524();
         Entity var5 = this.method_26166();
         var4.method_37181(class_6199.method_28375(this, var5), 6.0F);
         if (var5 instanceof class_5834) {
            this.method_37096((class_5834)var5, var4);
         }
      }
   }

   @Override
   public void method_37376(CompoundNBT var1) {
      super.method_37376(var1);
      var1.method_25931("ExplosionPower", this.field_46360);
   }

   @Override
   public void method_37314(CompoundNBT var1) {
      super.method_37314(var1);
      if (var1.contains("ExplosionPower", 99)) {
         this.field_46360 = var1.method_25947("ExplosionPower");
      }
   }
}
