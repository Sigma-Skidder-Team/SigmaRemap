package remapped;

import javax.annotation.Nullable;

public abstract class class_3558 extends class_3599 {
   public int field_17439;
   public int field_17437;

   public class_3558(class_7429 var1) {
      this.field_17438 = var1;
   }

   @Override
   public boolean method_16795() {
      LivingEntity var3 = this.field_17438.method_17809();
      if (var3 == null || !var3.isAlive()) {
         return false;
      } else {
         return !this.field_17438.method_33825() ? this.field_17438.field_41697 >= this.field_17437 : false;
      }
   }

   @Override
   public boolean method_16799() {
      LivingEntity var3 = this.field_17438.method_17809();
      return var3 != null && var3.isAlive() && this.field_17439 > 0;
   }

   @Override
   public void method_16796() {
      this.field_17439 = this.method_16542();
      this.field_17438.field_37904 = this.method_16545();
      this.field_17437 = this.field_17438.field_41697 + this.method_16541();
      SoundEvent var3 = this.method_16540();
      if (var3 != null) {
         this.field_17438.method_37155(var3, 1.0F, 1.0F);
      }

      this.field_17438.method_33822(this.method_16544());
   }

   @Override
   public void method_16794() {
      this.field_17439--;
      if (this.field_17439 == 0) {
         this.method_16543();
         this.field_17438.method_37155(this.field_17438.method_33826(), 1.0F, 1.0F);
      }
   }

   public abstract void method_16543();

   public int method_16542() {
      return 20;
   }

   public abstract int method_16545();

   public abstract int method_16541();

   @Nullable
   public abstract SoundEvent method_16540();

   public abstract class_248 method_16544();
}
