package remapped;

import java.util.function.Predicate;

public class class_2960 extends class_3578 {
   private static final class_7821<Integer> field_14453 = class_8073.<Integer>method_36641(class_2960.class, class_2734.field_13366);
   private int field_14452;
   private int field_14451;
   private static final Predicate<class_5834> field_14454 = var0 -> {
      if (var0 == null) {
         return false;
      } else {
         return !(var0 instanceof class_704) || !var0.method_37221() && !((class_704)var0).method_3186()
            ? var0.method_26550() != class_2780.field_13578
            : false;
      }
   };

   public class_2960(class_6629<? extends class_2960> var1, World var2) {
      super(var1, var2);
   }

   @Override
   public void method_37329() {
      super.method_37329();
      this.field_41735.method_36634(field_14453, 0);
   }

   public int method_13537() {
      return this.field_41735.<Integer>method_36640(field_14453);
   }

   public void method_13541(int var1) {
      this.field_41735.method_36633(field_14453, var1);
   }

   @Override
   public void method_37191(class_7821<?> var1) {
      if (field_14453.equals(var1)) {
         this.method_37187();
      }

      super.method_37191(var1);
   }

   @Override
   public void method_37376(class_5734 var1) {
      super.method_37376(var1);
      var1.method_25931("PuffState", this.method_13537());
   }

   @Override
   public void method_37314(class_5734 var1) {
      super.method_37314(var1);
      this.method_13541(var1.method_25947("PuffState"));
   }

   @Override
   public ItemStack method_16633() {
      return new ItemStack(class_4897.field_25174);
   }

   @Override
   public void method_26851() {
      super.method_26851();
      this.field_29916.method_3485(1, new class_3865(this));
   }

   @Override
   public void method_37123() {
      if (!this.field_41768.field_33055 && this.method_37330() && this.method_26530()) {
         if (this.field_14452 <= 0) {
            if (this.method_13537() != 0) {
               if (this.field_14451 > 60 && this.method_13537() == 2) {
                  this.method_37155(class_463.field_2251, this.method_26439(), this.method_26547());
                  this.method_13541(1);
               } else if (this.field_14451 > 100 && this.method_13537() == 1) {
                  this.method_37155(class_463.field_2251, this.method_26439(), this.method_26547());
                  this.method_13541(0);
               }

               this.field_14451++;
            }
         } else {
            if (this.method_13537() != 0) {
               if (this.field_14452 > 40 && this.method_13537() == 1) {
                  this.method_37155(class_463.field_2151, this.method_26439(), this.method_26547());
                  this.method_13541(2);
               }
            } else {
               this.method_37155(class_463.field_2151, this.method_26439(), this.method_26547());
               this.method_13541(1);
            }

            this.field_14452++;
         }
      }

      super.method_37123();
   }

   @Override
   public void method_26606() {
      super.method_26606();
      if (this.method_37330() && this.method_13537() > 0) {
         for (class_5886 var4 : this.field_41768.<class_5834>method_25869(class_5886.class, this.method_37241().method_18898(0.3), field_14454)) {
            if (var4.method_37330()) {
               this.method_13536(var4);
            }
         }
      }
   }

   private void method_13536(class_5886 var1) {
      int var4 = this.method_13537();
      if (var1.method_37181(class_6199.method_28345(this), (float)(1 + var4))) {
         var1.method_26558(new class_2250(Effects.field_19718, 60 * var4, 0));
         this.method_37155(class_463.field_1961, 1.0F, 1.0F);
      }
   }

   @Override
   public void method_37347(class_704 var1) {
      int var4 = this.method_13537();
      if (var1 instanceof class_9359 && var4 > 0 && var1.method_37181(class_6199.method_28345(this), (float)(1 + var4))) {
         if (!this.method_37378()) {
            ((class_9359)var1).field_47794.method_4156(new class_2161(class_2161.field_10787, 0.0F));
         }

         var1.method_26558(new class_2250(Effects.field_19718, 60 * var4, 0));
      }
   }

   @Override
   public class_8461 method_26918() {
      return class_463.field_2405;
   }

   @Override
   public class_8461 method_26599() {
      return class_463.field_1999;
   }

   @Override
   public class_8461 method_26541(class_6199 var1) {
      return class_463.field_2800;
   }

   @Override
   public class_8461 method_16632() {
      return class_463.field_2525;
   }

   @Override
   public class_6097 method_37190(class_7653 var1) {
      return super.method_37190(var1).method_27942(method_13540(this.method_13537()));
   }

   private static float method_13540(int var0) {
      switch (var0) {
         case 0:
            return 0.5F;
         case 1:
            return 0.7F;
         default:
            return 1.0F;
      }
   }
}
