package remapped;

import javax.annotation.Nullable;

public class class_223 extends class_608 implements class_9897, class_2354 {
   private static final class_7821<Byte> field_730 = class_8073.<Byte>method_36641(class_223.class, class_2734.field_13361);

   public class_223(class_6629<? extends class_223> var1, class_6486 var2) {
      super(var1, var2);
   }

   @Override
   public void method_26851() {
      this.field_29916.method_3485(1, new class_1837(this, 1.25, 20, 10.0F));
      this.field_29916.method_3485(2, new class_2889(this, 1.0, 1.0000001E-5F));
      this.field_29916.method_3485(3, new class_4407(this, class_704.class, 6.0F));
      this.field_29916.method_3485(4, new class_9691(this));
      this.field_29908.method_3485(1, new class_4138<class_5886>(this, class_5886.class, 10, true, false, var0 -> var0 instanceof class_1869));
   }

   public static class_1313 method_946() {
      return class_5886.method_26846().method_5984(class_7331.field_37468, 4.0).method_5984(class_7331.field_37465, 0.2F);
   }

   @Override
   public void method_37329() {
      super.method_37329();
      this.field_41735.method_36634(field_730, (byte)16);
   }

   @Override
   public void method_37376(class_5734 var1) {
      super.method_37376(var1);
      var1.method_25934("Pumpkin", this.method_947());
   }

   @Override
   public void method_37314(class_5734 var1) {
      super.method_37314(var1);
      if (var1.method_25938("Pumpkin")) {
         this.method_948(var1.method_25933("Pumpkin"));
      }
   }

   @Override
   public boolean method_26537() {
      return true;
   }

   @Override
   public void method_26606() {
      super.method_26606();
      if (!this.field_41768.field_33055) {
         int var3 = class_9299.method_42847(this.method_37302());
         int var4 = class_9299.method_42847(this.method_37309());
         int var5 = class_9299.method_42847(this.method_37156());
         if (this.field_41768.method_22561(new class_1331(var3, 0, var5)).method_28865(new class_1331(var3, var4, var5)) > 1.0F) {
            this.method_37181(class_6199.field_31665, 1.0F);
         }

         if (!this.field_41768.method_29537().method_1285(class_291.field_1047)) {
            return;
         }

         class_2522 var6 = class_4783.field_23552.method_29260();

         for (int var7 = 0; var7 < 4; var7++) {
            var3 = class_9299.method_42847(this.method_37302() + (double)((float)(var7 % 2 * 2 - 1) * 0.25F));
            var4 = class_9299.method_42847(this.method_37309());
            var5 = class_9299.method_42847(this.method_37156() + (double)((float)(var7 / 2 % 2 * 2 - 1) * 0.25F));
            class_1331 var8 = new class_1331(var3, var4, var5);
            if (this.field_41768.method_28262(var8).method_8345()
               && this.field_41768.method_22561(var8).method_28865(var8) < 0.8F
               && var6.method_8309(this.field_41768, var8)) {
               this.field_41768.method_29594(var8, var6);
            }
         }
      }
   }

   @Override
   public void method_10805(class_5834 var1, float var2) {
      class_6889 var5 = new class_6889(this.field_41768, this);
      double var6 = var1.method_37388() - 1.1F;
      double var8 = var1.method_37302() - this.method_37302();
      double var10 = var6 - var5.method_37309();
      double var12 = var1.method_37156() - this.method_37156();
      float var14 = class_9299.method_42842(var8 * var8 + var12 * var12) * 0.2F;
      var5.method_26161(var8, var10 + (double)var14, var12, 1.6F, 12.0F);
      this.method_37155(class_463.field_2565, 1.0F, 0.4F / (this.method_26594().nextFloat() * 0.4F + 0.8F));
      this.field_41768.method_7509(var5);
   }

   @Override
   public float method_26425(class_7653 var1, class_6097 var2) {
      return 1.7F;
   }

   @Override
   public class_6910 method_26857(class_704 var1, class_2584 var2) {
      class_6098 var5 = var1.method_26617(var2);
      if (var5.method_27960() == class_4897.field_24853 && this.method_45584()) {
         this.method_45583(class_562.field_3335);
         if (!this.field_41768.field_33055) {
            var5.method_28003(1, var1, var1x -> var1x.method_26447(var2));
         }

         return class_6910.method_31659(this.field_41768.field_33055);
      } else {
         return class_6910.field_35521;
      }
   }

   @Override
   public void method_45583(class_562 var1) {
      this.field_41768.method_29540((class_704)null, this, class_463.field_2661, var1, 1.0F, 1.0F);
      if (!this.field_41768.method_22567()) {
         this.method_948(false);
         this.method_37311(new class_6098(class_4897.field_25172), 1.7F);
      }
   }

   @Override
   public boolean method_45584() {
      return this.method_37330() && this.method_947();
   }

   public boolean method_947() {
      return (this.field_41735.<Byte>method_36640(field_730) & 16) != 0;
   }

   public void method_948(boolean var1) {
      byte var4 = this.field_41735.<Byte>method_36640(field_730);
      if (!var1) {
         this.field_41735.method_36633(field_730, (byte)(var4 & -17));
      } else {
         this.field_41735.method_36633(field_730, (byte)(var4 | 16));
      }
   }

   @Nullable
   @Override
   public class_8461 method_26918() {
      return class_463.field_2561;
   }

   @Nullable
   @Override
   public class_8461 method_26541(class_6199 var1) {
      return class_463.field_2763;
   }

   @Nullable
   @Override
   public class_8461 method_26599() {
      return class_463.field_2804;
   }

   @Override
   public class_1343 method_37323() {
      return new class_1343(0.0, (double)(0.75F * this.method_37277()), (double)(this.method_37086() * 0.4F));
   }
}
