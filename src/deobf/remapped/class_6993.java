package remapped;

import javax.annotation.Nullable;

public abstract class class_6993 extends MonsterEntity {
   public static final class_7821<Boolean> field_35907 = class_8073.<Boolean>method_36641(class_6993.class, class_2734.field_13347);
   public int field_35908 = 0;

   public class_6993(EntityType<? extends class_6993> var1, World var2) {
      super(var1, var2);
      this.method_26871(true);
      this.method_31994();
      this.method_26895(class_1108.field_6357, 16.0F);
      this.method_26895(class_1108.field_6352, -1.0F);
   }

   private void method_31994() {
      if (class_3613.method_16840(this)) {
         ((class_8985)this.method_26927()).method_41199(true);
      }
   }

   public abstract boolean method_31988();

   public void method_31989(boolean var1) {
      this.method_37372().method_36633(field_35907, var1);
   }

   public boolean method_31991() {
      return this.method_37372().<Boolean>method_36640(field_35907);
   }

   @Override
   public void method_37329() {
      super.method_37329();
      this.field_41735.method_36634(field_35907, false);
   }

   @Override
   public void writeAdditional(CompoundNBT var1) {
      super.writeAdditional(var1);
      if (this.method_31991()) {
         var1.putBoolean("IsImmuneToZombification", true);
      }

      var1.putInt("TimeInOverworld", this.field_35908);
   }

   @Override
   public double method_37106() {
      return !this.method_26449() ? -0.45 : -0.05;
   }

   @Override
   public void readAdditional(CompoundNBT var1) {
      super.readAdditional(var1);
      this.method_31989(var1.getBoolean("IsImmuneToZombification"));
      this.field_35908 = var1.method_25947("TimeInOverworld");
   }

   @Override
   public void method_26919() {
      super.method_26919();
      if (!this.method_31990()) {
         this.field_35908 = 0;
      } else {
         this.field_35908++;
      }

      if (this.field_35908 > 300) {
         this.method_31986();
         this.method_31992((class_6331)this.world);
      }
   }

   public boolean method_31990() {
      return !this.world.method_22572().method_40227() && !this.method_31991() && !this.method_26859();
   }

   public void method_31992(class_6331 var1) {
      class_1918 var4 = this.<class_1918>method_26898(EntityType.field_34234, true);
      if (var4 != null) {
         var4.method_26558(new class_2250(Effects.NAUSEA, 200, 0));
      }
   }

   public boolean method_31995() {
      return !this.method_26449();
   }

   public abstract class_9316 method_31993();

   @Nullable
   @Override
   public class_5834 method_17809() {
      return this.field_29675.<class_5834>method_5138(class_6044.field_30884).orElse((class_5834)null);
   }

   public boolean method_31987() {
      return this.method_26446().method_27960() instanceof class_9742;
   }

   @Override
   public void method_26853() {
      if (class_134.method_531(this)) {
         super.method_26853();
      }
   }

   @Override
   public void method_26929() {
      super.method_26929();
      class_1892.method_8440(this);
   }

   public abstract void method_31986();
}
