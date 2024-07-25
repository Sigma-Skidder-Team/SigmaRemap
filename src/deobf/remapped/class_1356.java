package remapped;

import javax.annotation.Nullable;

public class class_1356 extends Entity {
   private static final class_7821<Integer> field_7387 = class_8073.<Integer>method_36641(class_1356.class, class_2734.field_13366);
   private class_5834 field_7388;
   private int field_7390 = 80;

   public class_1356(class_6629<? extends class_1356> var1, World var2) {
      super(var1, var2);
      this.field_41759 = true;
   }

   public class_1356(World var1, double var2, double var4, double var6, class_5834 var8) {
      this(class_6629.field_34291, var1);
      this.method_37256(var2, var4, var6);
      double var11 = var1.field_33033.nextDouble() * (float) (Math.PI * 2);
      this.method_37214(-Math.sin(var11) * 0.02, 0.2F, -Math.cos(var11) * 0.02);
      this.method_6255(80);
      this.field_41767 = var2;
      this.field_41698 = var4;
      this.field_41725 = var6;
      this.field_7388 = var8;
   }

   @Override
   public void method_37329() {
      this.field_41735.method_36634(field_7387, 80);
   }

   @Override
   public boolean method_37126() {
      return false;
   }

   @Override
   public boolean method_37167() {
      return !this.field_41751;
   }

   @Override
   public void method_37123() {
      if (!this.method_37078()) {
         this.method_37215(this.method_37098().method_6214(0.0, -0.04, 0.0));
      }

      this.method_37226(class_7412.field_37839, this.method_37098());
      this.method_37215(this.method_37098().method_6209(0.98));
      if (this.field_41726) {
         this.method_37215(this.method_37098().method_6210(0.7, -0.5, 0.7));
      }

      this.field_7390--;
      if (this.field_7390 > 0) {
         this.method_37228();
         if (this.field_41768.field_33055) {
            this.field_41768.method_43361(class_3090.field_15376, this.method_37302(), this.method_37309() + 0.5, this.method_37156(), 0.0, 0.0, 0.0);
         }
      } else {
         this.method_37204();
         if (!this.field_41768.field_33055) {
            this.method_6259();
         }
      }
   }

   private void method_6259() {
      float var3 = 4.0F;
      this.field_41768.method_29573(this, this.method_37302(), this.method_37080(0.0625), this.method_37156(), 4.0F, class_7298.field_37309);
   }

   @Override
   public void method_37376(CompoundNBT var1) {
      var1.method_25958("Fuse", (short)this.method_6258());
   }

   @Override
   public void method_37314(CompoundNBT var1) {
      this.method_6255(var1.method_25956("Fuse"));
   }

   @Nullable
   public class_5834 method_6256() {
      return this.field_7388;
   }

   @Override
   public float method_37279(class_7653 var1, class_6097 var2) {
      return 0.15F;
   }

   public void method_6255(int var1) {
      this.field_41735.method_36633(field_7387, var1);
      this.field_7390 = var1;
   }

   @Override
   public void method_37191(class_7821<?> var1) {
      if (field_7387.equals(var1)) {
         this.field_7390 = this.method_6257();
      }
   }

   public int method_6257() {
      return this.field_41735.<Integer>method_36640(field_7387);
   }

   public int method_6258() {
      return this.field_7390;
   }

   @Override
   public Packet<?> method_37142() {
      return new class_6589(this);
   }
}
