package remapped;

import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class class_8574 extends class_3578 {
   private class_8574 field_43947;
   private int field_43946 = 1;

   public class_8574(EntityType<? extends class_8574> var1, World var2) {
      super(var1, var2);
   }

   @Override
   public void registerGoals() {
      super.registerGoals();
      this.goalSelector.addGoal(5, new class_8188(this));
   }

   @Override
   public int method_26856() {
      return this.method_39439();
   }

   public int method_39439() {
      return super.method_26856();
   }

   @Override
   public boolean method_16635() {
      return !this.method_39444();
   }

   public boolean method_39444() {
      return this.field_43947 != null && this.field_43947.isAlive();
   }

   public class_8574 method_39443(class_8574 var1) {
      this.field_43947 = var1;
      var1.method_39442();
      return var1;
   }

   public void method_39435() {
      this.field_43947.method_39436();
      this.field_43947 = null;
   }

   private void method_39442() {
      this.field_43946++;
   }

   private void method_39436() {
      this.field_43946--;
   }

   public boolean method_39438() {
      return this.method_39445() && this.field_43946 < this.method_39439();
   }

   @Override
   public void method_37123() {
      super.method_37123();
      if (this.method_39445() && this.world.field_33033.nextInt(200) == 1) {
         List var3 = this.world.method_25868(this.getClass(), this.method_37241().method_18899(8.0, 8.0, 8.0));
         if (var3.size() <= 1) {
            this.field_43946 = 1;
         }
      }
   }

   public boolean method_39445() {
      return this.field_43946 > 1;
   }

   public boolean method_39441() {
      return this.method_37275(this.field_43947) <= 121.0;
   }

   public void method_39440() {
      if (this.method_39444()) {
         this.method_26927().method_5616(this.field_43947, 1.0);
      }
   }

   public void method_39437(Stream<class_8574> var1) {
      var1.limit((long)(this.method_39439() - this.field_43946)).filter(var1x -> var1x != this).forEach(var1x -> var1x.method_39443(this));
   }

   @Nullable
   @Override
   public class_8733 method_26864(class_1556 var1, class_9589 var2, class_2417 var3, class_8733 var4, CompoundNBT var5) {
      super.method_26864(var1, var2, var3, (class_8733)var4, var5);
      if (var4 != null) {
         this.method_39443(((class_7287)var4).field_37285);
      } else {
         var4 = new class_7287(this);
      }

      return (class_8733)var4;
   }
}
