package remapped;

import javax.annotation.Nullable;

public abstract class class_1899 extends class_4612 {
   private static final class_7821<Boolean> field_9698 = class_8073.<Boolean>method_36641(class_1899.class, class_2734.field_13347);
   public int field_9699;
   public int field_9697;
   public int field_9700;

   public class_1899(EntityType<? extends class_1899> var1, World var2) {
      super(var1, var2);
   }

   @Override
   public class_8733 method_26864(class_1556 var1, class_9589 var2, class_2417 var3, class_8733 var4, CompoundNBT var5) {
      if (var4 == null) {
         var4 = new class_1821(true);
      }

      class_1821 var8 = (class_1821)var4;
      if (var8.method_8060() && var8.method_8062() > 0 && this.field_41717.nextFloat() <= var8.method_8061()) {
         this.method_8635(-24000);
      }

      var8.method_8063();
      return super.method_26864(var1, var2, var3, (class_8733)var4, var5);
   }

   @Nullable
   public abstract class_1899 method_8638(class_6331 var1, class_1899 var2);

   @Override
   public void method_37329() {
      super.method_37329();
      this.field_41735.method_36634(field_9698, false);
   }

   public boolean method_8636() {
      return false;
   }

   public int method_8634() {
      if (!this.world.field_33055) {
         return this.field_9699;
      } else {
         return !this.field_41735.<Boolean>method_36640(field_9698) ? 1 : -1;
      }
   }

   public void method_8633(int var1, boolean var2) {
      int var5 = this.method_8634();
      var5 += var1 * 20;
      if (var5 > 0) {
         var5 = 0;
      }

      int var6 = var5 - var5;
      this.method_8635(var5);
      if (var2) {
         this.field_9697 += var6;
         if (this.field_9700 == 0) {
            this.field_9700 = 40;
         }
      }

      if (this.method_8634() == 0) {
         this.method_8635(this.field_9697);
      }
   }

   public void method_8632(int var1) {
      this.method_8633(var1, false);
   }

   public void method_8635(int var1) {
      int var4 = this.field_9699;
      this.field_9699 = var1;
      if (var4 < 0 && var1 >= 0 || var4 >= 0 && var1 < 0) {
         this.field_41735.method_36633(field_9698, var1 < 0);
         this.method_8637();
      }
   }

   @Override
   public void writeAdditional(CompoundNBT var1) {
      super.writeAdditional(var1);
      var1.putInt("Age", this.method_8634());
      var1.putInt("ForcedAge", this.field_9697);
   }

   @Override
   public void readAdditional(CompoundNBT var1) {
      super.readAdditional(var1);
      this.method_8635(var1.method_25947("Age"));
      this.field_9697 = var1.method_25947("ForcedAge");
   }

   @Override
   public void method_37191(class_7821<?> var1) {
      if (field_9698.equals(var1)) {
         this.method_37187();
      }

      super.method_37191(var1);
   }

   @Override
   public void livingTick() {
      super.livingTick();
      if (!this.world.field_33055) {
         if (this.isAlive()) {
            int var3 = this.method_8634();
            if (var3 >= 0) {
               if (var3 > 0) {
                  this.method_8635(--var3);
               }
            } else {
               this.method_8635(++var3);
            }
         }
      } else if (this.field_9700 > 0) {
         if (this.field_9700 % 4 == 0) {
            this.world.method_43361(class_3090.field_15361, this.method_37361(1.0), this.method_37255() + 0.5, this.method_37383(1.0), 0.0, 0.0, 0.0);
         }

         this.field_9700--;
      }
   }

   public void method_8637() {
   }

   @Override
   public boolean method_26449() {
      return this.method_8634() < 0;
   }

   @Override
   public void method_26910(boolean var1) {
      this.method_8635(!var1 ? 0 : -24000);
   }
}
