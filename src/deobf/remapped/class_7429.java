package remapped;

public abstract class class_7429 extends class_7637 {
   private static final class_7821<Byte> field_37902 = class_8073.<Byte>method_36641(class_7429.class, class_2734.field_13361);
   public int field_37904;
   private class_248 field_37903 = class_248.field_877;

   public class_7429(class_6629<? extends class_7429> var1, World var2) {
      super(var1, var2);
   }

   @Override
   public void method_37329() {
      super.method_37329();
      this.field_41735.method_36634(field_37902, (byte)0);
   }

   @Override
   public void method_37314(CompoundNBT var1) {
      super.method_37314(var1);
      this.field_37904 = var1.method_25947("SpellTicks");
   }

   @Override
   public void method_37376(CompoundNBT var1) {
      super.method_37376(var1);
      var1.method_25931("SpellTicks", this.field_37904);
   }

   @Override
   public class_5871 method_34604() {
      if (!this.method_33825()) {
         return !this.method_18596() ? class_5871.field_29811 : class_5871.field_29819;
      } else {
         return class_5871.field_29814;
      }
   }

   public boolean method_33825() {
      return !this.field_41768.field_33055 ? this.field_37904 > 0 : this.field_41735.<Byte>method_36640(field_37902) > 0;
   }

   public void method_33822(class_248 var1) {
      this.field_37903 = var1;
      this.field_41735.method_36633(field_37902, (byte)class_248.method_1087(var1));
   }

   public class_248 method_33824() {
      return this.field_41768.field_33055 ? class_248.method_1084(this.field_41735.<Byte>method_36640(field_37902)) : this.field_37903;
   }

   @Override
   public void method_26919() {
      super.method_26919();
      if (this.field_37904 > 0) {
         this.field_37904--;
      }
   }

   @Override
   public void method_37123() {
      super.method_37123();
      if (this.field_41768.field_33055 && this.method_33825()) {
         class_248 var3 = this.method_33824();
         double var4 = class_248.method_1086(var3)[0];
         double var6 = class_248.method_1086(var3)[1];
         double var8 = class_248.method_1086(var3)[2];
         float var10 = this.field_29605 * (float) (Math.PI / 180.0) + class_9299.method_42840((float)this.field_41697 * 0.6662F) * 0.25F;
         float var11 = class_9299.method_42840(var10);
         float var12 = class_9299.method_42818(var10);
         this.field_41768
            .method_43361(
               class_3090.field_15353,
               this.method_37302() + (double)var11 * 0.6,
               this.method_37309() + 1.8,
               this.method_37156() + (double)var12 * 0.6,
               var4,
               var6,
               var8
            );
         this.field_41768
            .method_43361(
               class_3090.field_15353,
               this.method_37302() - (double)var11 * 0.6,
               this.method_37309() + 1.8,
               this.method_37156() - (double)var12 * 0.6,
               var4,
               var6,
               var8
            );
      }
   }

   public int method_33823() {
      return this.field_37904;
   }

   public abstract class_8461 method_33826();
}
