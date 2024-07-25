package remapped;

public abstract class class_5521 extends class_4109 {
   private static final class_7821<Boolean> field_28096 = class_8073.<Boolean>method_36641(class_5521.class, class_2734.field_13347);

   public class_5521(class_6629<? extends class_5521> var1, World var2) {
      super(var1, var2);
      this.field_20028 = false;
   }

   @Override
   public void method_19084() {
      this.method_26561(class_7331.field_37468).method_45006((double)this.method_19082());
   }

   @Override
   public void method_37329() {
      super.method_37329();
      this.field_41735.method_36634(field_28096, false);
   }

   public static class_1313 method_25018() {
      return method_19064().method_5984(class_7331.field_37465, 0.175F).method_5984(class_7331.field_37464, 0.5);
   }

   public boolean method_25017() {
      return this.field_41735.<Boolean>method_36640(field_28096);
   }

   public void method_25016(boolean var1) {
      this.field_41735.method_36633(field_28096, var1);
   }

   @Override
   public int method_19085() {
      return !this.method_25017() ? super.method_19085() : 17;
   }

   @Override
   public double method_37149() {
      return super.method_37149() - 0.25;
   }

   @Override
   public void method_26522() {
      super.method_26522();
      if (this.method_25017()) {
         if (!this.field_41768.field_33055) {
            this.method_37312(class_4783.field_23471);
         }

         this.method_25016(false);
      }
   }

   @Override
   public void method_37376(class_5734 var1) {
      super.method_37376(var1);
      var1.method_25934("ChestedHorse", this.method_25017());
      if (this.method_25017()) {
         class_3416 var4 = new class_3416();

         for (int var5 = 2; var5 < this.field_20021.method_31505(); var5++) {
            ItemStack var6 = this.field_20021.method_31498(var5);
            if (!var6.method_28022()) {
               class_5734 var7 = new class_5734();
               var7.method_25921("Slot", (byte)var5);
               var6.method_27998(var7);
               var4.add(var7);
            }
         }

         var1.method_25946("Items", var4);
      }
   }

   @Override
   public void method_37314(class_5734 var1) {
      super.method_37314(var1);
      this.method_25016(var1.method_25933("ChestedHorse"));
      if (this.method_25017()) {
         class_3416 var4 = var1.method_25927("Items", 10);
         this.method_19072();

         for (int var5 = 0; var5 < var4.size(); var5++) {
            class_5734 var6 = var4.method_15764(var5);
            int var7 = var6.method_25950("Slot") & 255;
            if (var7 >= 2 && var7 < this.field_20021.method_31505()) {
               this.field_20021.method_31503(var7, ItemStack.method_28015(var6));
            }
         }
      }

      this.method_19070();
   }

   @Override
   public boolean method_37166(int var1, ItemStack var2) {
      if (var1 == 499) {
         if (this.method_25017() && var2.method_28022()) {
            this.method_25016(false);
            this.method_19072();
            return true;
         }

         if (!this.method_25017() && var2.method_27960() == class_4783.field_23471.method_10803()) {
            this.method_25016(true);
            this.method_19072();
            return true;
         }
      }

      return super.method_37166(var1, var2);
   }

   @Override
   public class_6910 method_26857(class_704 var1, class_2584 var2) {
      ItemStack var5 = var1.method_26617(var2);
      if (!this.method_26449()) {
         if (this.method_19043() && var1.method_3236()) {
            this.method_19076(var1);
            return class_6910.method_31659(this.field_41768.field_33055);
         }

         if (this.method_37151()) {
            return super.method_26857(var1, var2);
         }
      }

      if (!var5.method_28022()) {
         if (this.method_24866(var5)) {
            return this.method_19079(var1, var5);
         }

         if (!this.method_19043()) {
            this.method_19037();
            return class_6910.method_31659(this.field_41768.field_33055);
         }

         if (!this.method_25017() && var5.method_27960() == class_4783.field_23471.method_10803()) {
            this.method_25016(true);
            this.method_25020();
            if (!var1.field_3876.field_4944) {
               var5.method_27970(1);
            }

            this.method_19072();
            return class_6910.method_31659(this.field_41768.field_33055);
         }

         if (!this.method_26449() && !this.method_43357() && var5.method_27960() == class_4897.field_24836) {
            this.method_19076(var1);
            return class_6910.method_31659(this.field_41768.field_33055);
         }
      }

      if (!this.method_26449()) {
         this.method_19039(var1);
         return class_6910.method_31659(this.field_41768.field_33055);
      } else {
         return super.method_26857(var1, var2);
      }
   }

   public void method_25020() {
      this.method_37155(class_463.field_2031, 1.0F, (this.field_41717.nextFloat() - this.field_41717.nextFloat()) * 0.2F + 1.0F);
   }

   public int method_25019() {
      return 5;
   }
}
