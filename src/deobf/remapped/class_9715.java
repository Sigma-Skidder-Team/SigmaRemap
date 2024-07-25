package remapped;

import java.util.List;

public class class_9715 extends class_292 implements class_4511 {
   private boolean field_49380 = true;
   private int field_49379 = -1;
   private final BlockPos field_49378 = BlockPos.field_7306;

   public class_9715(EntityType<? extends class_9715> var1, World var2) {
      super(var1, var2);
   }

   public class_9715(World var1, double var2, double var4, double var6) {
      super(EntityType.field_34213, var2, var4, var6, var1);
   }

   @Override
   public class_3481 method_4737() {
      return class_3481.field_17063;
   }

   @Override
   public class_2522 method_4752() {
      return class_4783.field_23698.method_29260();
   }

   @Override
   public int method_4735() {
      return 1;
   }

   @Override
   public int method_31505() {
      return 5;
   }

   @Override
   public void method_4758(int var1, int var2, int var3, boolean var4) {
      boolean var7 = !var4;
      if (var7 != this.method_44873()) {
         this.method_44870(var7);
      }
   }

   public boolean method_44873() {
      return this.field_49380;
   }

   public void method_44870(boolean var1) {
      this.field_49380 = var1;
   }

   @Override
   public World method_17402() {
      return this.world;
   }

   @Override
   public double method_20973() {
      return this.getPosX();
   }

   @Override
   public double method_20974() {
      return this.method_37309() + 0.5;
   }

   @Override
   public double method_20975() {
      return this.getPosZ();
   }

   @Override
   public void method_37123() {
      super.method_37123();
      if (!this.world.field_33055 && this.isAlive() && this.method_44873()) {
         BlockPos var3 = this.method_37075();
         if (!var3.equals(this.field_49378)) {
            this.method_44869(0);
         } else {
            this.field_49379--;
         }

         if (!this.method_44872()) {
            this.method_44869(0);
            if (this.method_44871()) {
               this.method_44869(4);
               this.method_17407();
            }
         }
      }
   }

   public boolean method_44871() {
      if (!class_5772.method_26101(this)) {
         List var3 = this.world.<Entity>method_25869(class_91.class, this.method_37241().method_18899(0.25, 0.0, 0.25), class_3572.field_17481);
         if (!var3.isEmpty()) {
            class_5772.method_26105(this, (class_91)var3.get(0));
         }

         return false;
      } else {
         return true;
      }
   }

   @Override
   public void method_4743(DamageSource var1) {
      super.method_4743(var1);
      if (this.world.method_29537().method_1285(class_291.field_1024)) {
         this.method_37312(class_4783.field_23698);
      }
   }

   @Override
   public void writeAdditional(CompoundNBT var1) {
      super.writeAdditional(var1);
      var1.putInt("TransferCooldown", this.field_49379);
      var1.putBoolean("Enabled", this.field_49380);
   }

   @Override
   public void readAdditional(CompoundNBT var1) {
      super.readAdditional(var1);
      this.field_49379 = var1.method_25947("TransferCooldown");
      this.field_49380 = !var1.method_25938("Enabled") ? true : var1.getBoolean("Enabled");
   }

   public void method_44869(int var1) {
      this.field_49379 = var1;
   }

   public boolean method_44872() {
      return this.field_49379 > 0;
   }

   @Override
   public class_4088 method_1296(int var1, class_7051 var2) {
      return new class_7952(var1, var2, this);
   }
}
