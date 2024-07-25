package remapped;

public class class_1044 extends class_8388 {
   private static String[] field_5749;
   private static final class_7821<Boolean> field_5748 = class_8073.<Boolean>method_36641(class_1044.class, class_2734.field_13347);

   public class_1044(class_6629<? extends class_1044> var1, World var2) {
      super(var1, var2);
   }

   public class_1044(World var1, class_5834 var2, double var3, double var5, double var7) {
      super(class_6629.field_34329, var2, var3, var5, var7, var1);
   }

   public class_1044(World var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(class_6629.field_34329, var2, var4, var6, var8, var10, var12, var1);
   }

   @Override
   public float method_38644() {
      return !this.method_4620() ? super.method_38644() : 0.73F;
   }

   @Override
   public boolean method_37264() {
      return false;
   }

   @Override
   public float method_37083(class_2730 var1, class_6163 var2, BlockPos var3, class_2522 var4, class_4774 var5, float var6) {
      return this.method_4620() && class_4653.method_21513(var4) ? Math.min(0.8F, var6) : var6;
   }

   @Override
   public void method_26163(class_5631 var1) {
      super.method_26163(var1);
      if (!this.world.field_33055) {
         Entity var4 = var1.method_25524();
         Entity var5 = this.method_26166();
         boolean var6;
         if (!(var5 instanceof class_5834)) {
            var6 = var4.attackEntityFrom(DamageSource.field_31686, 5.0F);
         } else {
            class_5834 var7 = (class_5834)var5;
            var6 = var4.attackEntityFrom(DamageSource.method_28376(this, var7), 8.0F);
            if (var6) {
               if (!var4.method_37330()) {
                  var7.heal(5.0F);
               } else {
                  this.method_37096(var7, var4);
               }
            }
         }

         if (var6 && var4 instanceof class_5834) {
            byte var8 = 0;
            if (this.world.method_43370() != class_423.field_1789) {
               if (this.world.method_43370() == class_423.field_1782) {
                  var8 = 40;
               }
            } else {
               var8 = 10;
            }

            if (var8 > 0) {
               ((class_5834)var4).method_26558(new class_2250(Effects.field_19725, 20 * var8, 1));
            }
         }
      }
   }

   @Override
   public void method_26160(class_7474 var1) {
      super.method_26160(var1);
      if (!this.world.field_33055) {
         class_7298 var4 = !this.world.method_29537().method_1285(class_291.field_1047) ? class_7298.field_37310 : class_7298.field_37311;
         this.world.method_29574(this, this.getPosX(), this.method_37309(), this.getPosZ(), 1.0F, false, var4);
         this.method_37204();
      }
   }

   @Override
   public boolean method_37167() {
      return false;
   }

   @Override
   public boolean attackEntityFrom(DamageSource var1, float var2) {
      return false;
   }

   @Override
   public void method_37329() {
      this.field_41735.method_36634(field_5748, false);
   }

   public boolean method_4620() {
      return this.field_41735.<Boolean>method_36640(field_5748);
   }

   public void method_4619(boolean var1) {
      this.field_41735.method_36633(field_5748, var1);
   }

   @Override
   public boolean method_38646() {
      return false;
   }
}
