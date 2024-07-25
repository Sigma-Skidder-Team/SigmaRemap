package remapped;

import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;

public class class_581 extends class_6749 {
   private static final class_7821<Integer> field_3391 = class_8073.<Integer>method_36641(class_581.class, class_2734.field_13366);
   private class_6004 field_3394 = class_3697.field_18134;
   private final Set<class_2250> field_3395 = Sets.newHashSet();
   private boolean field_3392;

   public class_581(class_6629<? extends class_581> var1, World var2) {
      super(var1, var2);
   }

   public class_581(World var1, double var2, double var4, double var6) {
      super(class_6629.field_34290, var2, var4, var6, var1);
   }

   public class_581(World var1, class_5834 var2) {
      super(class_6629.field_34290, var2, var1);
   }

   public void method_2748(ItemStack var1) {
      if (var1.method_27960() != class_4897.field_25013) {
         if (var1.method_27960() == class_4897.field_25024) {
            this.field_3394 = class_3697.field_18134;
            this.field_3395.clear();
            this.field_41735.method_36633(field_3391, -1);
         }
      } else {
         this.field_3394 = class_9541.method_43990(var1);
         List var4 = class_9541.method_43995(var1);
         if (!var4.isEmpty()) {
            for (class_2250 var6 : var4) {
               this.field_3395.add(new class_2250(var6));
            }
         }

         int var7 = method_2749(var1);
         if (var7 != -1) {
            this.method_2751(var7);
         } else {
            this.method_2747();
         }
      }
   }

   public static int method_2749(ItemStack var0) {
      class_5734 var3 = var0.method_27990();
      return var3 != null && var3.method_25939("CustomPotionColor", 99) ? var3.method_25947("CustomPotionColor") : -1;
   }

   private void method_2747() {
      this.field_3392 = false;
      if (this.field_3394 == class_3697.field_18134 && this.field_3395.isEmpty()) {
         this.field_41735.method_36633(field_3391, -1);
      } else {
         this.field_41735.method_36633(field_3391, class_9541.method_43997(class_9541.method_43994(this.field_3394, this.field_3395)));
      }
   }

   public void method_2752(class_2250 var1) {
      this.field_3395.add(var1);
      this.method_37372().method_36633(field_3391, class_9541.method_43997(class_9541.method_43994(this.field_3394, this.field_3395)));
   }

   @Override
   public void method_37329() {
      super.method_37329();
      this.field_41735.method_36634(field_3391, -1);
   }

   @Override
   public void method_37123() {
      super.method_37123();
      if (!this.field_41768.field_33055) {
         if (this.field_34834 && this.field_34840 != 0 && !this.field_3395.isEmpty() && this.field_34840 >= 600) {
            this.field_41768.method_29587(this, (byte)0);
            this.field_3394 = class_3697.field_18134;
            this.field_3395.clear();
            this.field_41735.method_36633(field_3391, -1);
         }
      } else if (!this.field_34834) {
         this.method_2753(2);
      } else if (this.field_34840 % 5 == 0) {
         this.method_2753(1);
      }
   }

   private void method_2753(int var1) {
      int var4 = this.method_2750();
      if (var4 != -1 && var1 > 0) {
         double var5 = (double)(var4 >> 16 & 0xFF) / 255.0;
         double var7 = (double)(var4 >> 8 & 0xFF) / 255.0;
         double var9 = (double)(var4 >> 0 & 0xFF) / 255.0;

         for (int var11 = 0; var11 < var1; var11++) {
            this.field_41768.method_43361(class_3090.field_15353, this.method_37361(0.5), this.method_37255(), this.method_37383(0.5), var5, var7, var9);
         }
      }
   }

   public int method_2750() {
      return this.field_41735.<Integer>method_36640(field_3391);
   }

   private void method_2751(int var1) {
      this.field_3392 = true;
      this.field_41735.method_36633(field_3391, var1);
   }

   @Override
   public void method_37376(class_5734 var1) {
      super.method_37376(var1);
      if (this.field_3394 != class_3697.field_18134 && this.field_3394 != null) {
         var1.method_25941("Potion", class_8669.field_44365.method_39797(this.field_3394).toString());
      }

      if (this.field_3392) {
         var1.method_25931("Color", this.method_2750());
      }

      if (!this.field_3395.isEmpty()) {
         class_3416 var4 = new class_3416();

         for (class_2250 var6 : this.field_3395) {
            var4.add(var6.method_10345(new class_5734()));
         }

         var1.method_25946("CustomPotionEffects", var4);
      }
   }

   @Override
   public void method_37314(class_5734 var1) {
      super.method_37314(var1);
      if (var1.method_25939("Potion", 8)) {
         this.field_3394 = class_9541.method_43989(var1);
      }

      for (class_2250 var5 : class_9541.method_43998(var1)) {
         this.method_2752(var5);
      }

      if (!var1.method_25939("Color", 99)) {
         this.method_2747();
      } else {
         this.method_2751(var1.method_25947("Color"));
      }
   }

   @Override
   public void method_30935(class_5834 var1) {
      super.method_30935(var1);

      for (class_2250 var5 : this.field_3394.method_27404()) {
         var1.method_26558(
            new class_2250(var5.method_10339(), Math.max(var5.method_10347() / 8, 1), var5.method_10333(), var5.method_10338(), var5.method_10336())
         );
      }

      if (!this.field_3395.isEmpty()) {
         for (class_2250 var7 : this.field_3395) {
            var1.method_26558(var7);
         }
      }
   }

   @Override
   public ItemStack method_30925() {
      if (this.field_3395.isEmpty() && this.field_3394 == class_3697.field_18134) {
         return new ItemStack(class_4897.field_25024);
      } else {
         ItemStack var3 = new ItemStack(class_4897.field_25013);
         class_9541.method_43999(var3, this.field_3394);
         class_9541.method_43992(var3, this.field_3395);
         if (this.field_3392) {
            var3.method_27994().method_25931("CustomPotionColor", this.method_2750());
         }

         return var3;
      }
   }

   @Override
   public void method_37336(byte var1) {
      if (var1 != 0) {
         super.method_37336(var1);
      } else {
         int var4 = this.method_2750();
         if (var4 != -1) {
            double var5 = (double)(var4 >> 16 & 0xFF) / 255.0;
            double var7 = (double)(var4 >> 8 & 0xFF) / 255.0;
            double var9 = (double)(var4 >> 0 & 0xFF) / 255.0;

            for (int var11 = 0; var11 < 20; var11++) {
               this.field_41768.method_43361(class_3090.field_15353, this.method_37361(0.5), this.method_37255(), this.method_37383(0.5), var5, var7, var9);
            }
         }
      }
   }
}
