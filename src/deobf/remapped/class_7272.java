package remapped;

import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.util.text.TranslationTextComponent;

public class class_7272 extends class_5467 {
   private static final class_7821<Integer> field_37232 = class_8073.<Integer>method_36641(class_7272.class, class_2734.field_13366);
   private static final Identifier field_37238 = new Identifier("killer_bunny");
   private int field_37237;
   private int field_37236;
   private boolean field_37239;
   private int field_37233;
   private int field_37234;

   public class_7272(class_6629<? extends class_7272> var1, World var2) {
      super(var1, var2);
      this.field_29914 = new class_3143(this, this);
      this.field_29900 = new class_1830(this);
      this.method_33227(0.0);
   }

   @Override
   public void method_26851() {
      this.field_29916.method_3485(1, new class_787(this));
      this.field_29916.method_3485(1, new class_229(this, 2.2));
      this.field_29916.method_3485(2, new class_9513(this, 0.8));
      this.field_29916
         .method_3485(3, new class_7228(this, 1.0, class_8137.method_37019(class_4897.field_25136, class_4897.field_25070, class_4783.field_23410), false));
      this.field_29916.method_3485(4, new class_8695<class_704>(this, class_704.class, 8.0F, 2.2, 2.2));
      this.field_29916.method_3485(4, new class_8695<class_9408>(this, class_9408.class, 10.0F, 2.2, 2.2));
      this.field_29916.method_3485(4, new class_8695<class_1173>(this, class_1173.class, 4.0F, 2.2, 2.2));
      this.field_29916.method_3485(5, new class_805(this));
      this.field_29916.method_3485(6, new class_2889(this, 0.6));
      this.field_29916.method_3485(11, new class_4407(this, class_704.class, 10.0F));
   }

   @Override
   public float method_26538() {
      if (!this.field_41744 && (!this.field_29900.method_12877() || !(this.field_29900.method_12881() > this.method_37309() + 0.5))) {
         class_3998 var3 = this.field_29904.method_5594();
         if (var3 != null && !var3.method_18436()) {
            class_1343 var4 = var3.method_18439(this);
            if (var4.field_7333 > this.method_37309() + 0.5) {
               return 0.5F;
            }
         }

         return !(this.field_29900.method_12880() <= 0.6) ? 0.3F : 0.2F;
      } else {
         return 0.5F;
      }
   }

   @Override
   public void method_26595() {
      super.method_26595();
      double var3 = this.field_29900.method_12880();
      if (var3 > 0.0) {
         double var5 = method_37266(this.method_37098());
         if (var5 < 0.01) {
            this.method_37092(0.1F, new class_1343(0.0, 0.0, 1.0));
         }
      }

      if (!this.world.field_33055) {
         this.world.method_29587(this, (byte)1);
      }
   }

   public float method_33235(float var1) {
      return this.field_37236 != 0 ? ((float)this.field_37237 + var1) / (float)this.field_37236 : 0.0F;
   }

   public void method_33227(double var1) {
      this.method_26927().method_5600(var1);
      this.field_29900.method_12879(this.field_29900.method_12887(), this.field_29900.method_12881(), this.field_29900.method_12886(), var1);
   }

   @Override
   public void method_26528(boolean var1) {
      super.method_26528(var1);
      if (var1) {
         this.method_37155(this.method_33238(), this.method_26439(), ((this.field_41717.nextFloat() - this.field_41717.nextFloat()) * 0.2F + 1.0F) * 0.8F);
      }
   }

   public void method_33225() {
      this.method_26528(true);
      this.field_37236 = 10;
      this.field_37237 = 0;
   }

   @Override
   public void method_37329() {
      super.method_37329();
      this.field_41735.method_36634(field_37232, 0);
   }

   @Override
   public void method_26919() {
      if (this.field_37233 > 0) {
         this.field_37233--;
      }

      if (this.field_37234 > 0) {
         this.field_37234 = this.field_37234 - this.field_41717.nextInt(3);
         if (this.field_37234 < 0) {
            this.field_37234 = 0;
         }
      }

      if (this.field_41726) {
         if (!this.field_37239) {
            this.method_26528(false);
            this.method_33232();
         }

         if (this.method_33239() == 99 && this.field_37233 == 0) {
            class_5834 var3 = this.method_17809();
            if (var3 != null && this.method_37275(var3) < 16.0) {
               this.method_33243(var3.method_37302(), var3.method_37156());
               this.field_29900.method_12879(var3.method_37302(), var3.method_37309(), var3.method_37156(), this.field_29900.method_12880());
               this.method_33225();
               this.field_37239 = true;
            }
         }

         class_3143 var6 = (class_3143)this.field_29914;
         if (var6.method_14532()) {
            if (!var6.method_14534()) {
               this.method_33228();
            }
         } else if (this.field_29900.method_12877() && this.field_37233 == 0) {
            class_3998 var4 = this.field_29904.method_5594();
            class_1343 var5 = new class_1343(this.field_29900.method_12887(), this.field_29900.method_12881(), this.field_29900.method_12886());
            if (var4 != null && !var4.method_18436()) {
               var5 = var4.method_18439(this);
            }

            this.method_33243(var5.field_7336, var5.field_7334);
            this.method_33225();
         }
      }

      this.field_37239 = this.field_41726;
   }

   @Override
   public boolean method_37374() {
      return false;
   }

   private void method_33243(double var1, double var3) {
      this.rotationYaw = (float)(class_9299.method_42821(var3 - this.method_37156(), var1 - this.method_37302()) * 180.0F / (float)Math.PI) - 90.0F;
   }

   private void method_33228() {
      ((class_3143)this.field_29914).method_14533(true);
   }

   private void method_33240() {
      ((class_3143)this.field_29914).method_14533(false);
   }

   private void method_33226() {
      if (!(this.field_29900.method_12880() < 2.2)) {
         this.field_37233 = 1;
      } else {
         this.field_37233 = 10;
      }
   }

   private void method_33232() {
      this.method_33226();
      this.method_33240();
   }

   @Override
   public void method_26606() {
      super.method_26606();
      if (this.field_37237 == this.field_37236) {
         if (this.field_37236 != 0) {
            this.field_37237 = 0;
            this.field_37236 = 0;
            this.method_26528(false);
         }
      } else {
         this.field_37237++;
      }
   }

   public static class_1313 method_33234() {
      return class_5886.method_26846().method_5984(class_7331.field_37468, 3.0).method_5984(class_7331.field_37465, 0.3F);
   }

   @Override
   public void method_37376(CompoundNBT var1) {
      super.method_37376(var1);
      var1.method_25931("RabbitType", this.method_33239());
      var1.method_25931("MoreCarrotTicks", this.field_37234);
   }

   @Override
   public void method_37314(CompoundNBT var1) {
      super.method_37314(var1);
      this.method_33231(var1.method_25947("RabbitType"));
      this.field_37234 = var1.method_25947("MoreCarrotTicks");
   }

   public class_8461 method_33238() {
      return class_463.field_2567;
   }

   @Override
   public class_8461 method_26918() {
      return class_463.field_2590;
   }

   @Override
   public class_8461 method_26541(DamageSource var1) {
      return class_463.field_2576;
   }

   @Override
   public class_8461 method_26599() {
      return class_463.field_2163;
   }

   @Override
   public boolean method_26442(Entity var1) {
      if (this.method_33239() != 99) {
         return var1.attackEntityFrom(DamageSource.method_28345(this), 3.0F);
      } else {
         this.method_37155(class_463.field_2065, 1.0F, (this.field_41717.nextFloat() - this.field_41717.nextFloat()) * 0.2F + 1.0F);
         return var1.attackEntityFrom(DamageSource.method_28345(this), 8.0F);
      }
   }

   @Override
   public class_562 method_37197() {
      return this.method_33239() != 99 ? class_562.field_3328 : class_562.field_3332;
   }

   @Override
   public boolean attackEntityFrom(DamageSource var1, float var2) {
      return !this.method_37180(var1) ? super.attackEntityFrom(var1, var2) : false;
   }

   private boolean method_33233(class_2451 var1) {
      return var1 == class_4897.field_25136 || var1 == class_4897.field_25070 || var1 == class_4783.field_23410.method_10803();
   }

   public class_7272 method_33244(class_6331 var1, class_1899 var2) {
      class_7272 var5 = class_6629.field_34251.method_30484(var1);
      int var6 = this.method_33236(var1);
      if (this.field_41717.nextInt(20) != 0) {
         if (var2 instanceof class_7272 && this.field_41717.nextBoolean()) {
            var6 = ((class_7272)var2).method_33239();
         } else {
            var6 = this.method_33239();
         }
      }

      var5.method_33231(var6);
      return var5;
   }

   @Override
   public boolean method_24866(ItemStack var1) {
      return this.method_33233(var1.method_27960());
   }

   public int method_33239() {
      return this.field_41735.<Integer>method_36640(field_37232);
   }

   public void method_33231(int var1) {
      if (var1 == 99) {
         this.method_26561(class_7331.field_37473).method_45006(8.0);
         this.field_29916.method_3485(4, new class_4810(this));
         this.field_29908.method_3485(1, new class_8420(this).method_38757());
         this.field_29908.method_3485(2, new class_4138<class_704>(this, class_704.class, true));
         this.field_29908.method_3485(2, new class_4138<class_9408>(this, class_9408.class, true));
         if (!this.method_45507()) {
            this.method_37303(new TranslationTextComponent(Util.createTranslationKey("entity", field_37238)));
         }
      }

      this.field_41735.method_36633(field_37232, var1);
   }

   @Nullable
   @Override
   public class_8733 method_26864(class_1556 var1, class_9589 var2, class_2417 var3, class_8733 var4, CompoundNBT var5) {
      int var8 = this.method_33236(var1);
      if (!(var4 instanceof class_5715)) {
         var4 = new class_5715(var8);
      } else {
         var8 = ((class_5715)var4).field_28895;
      }

      this.method_33231(var8);
      return super.method_26864(var1, var2, var3, (class_8733)var4, var5);
   }

   private int method_33236(class_9379 var1) {
      class_6325 var4 = var1.method_22561(this.method_37075());
      int var5 = this.field_41717.nextInt(100);
      if (var4.method_28866() != class_6750.field_34846) {
         if (var4.method_28887() != class_8862.field_45294) {
            return var5 >= 50 ? (var5 >= 90 ? 2 : 5) : 0;
         } else {
            return 4;
         }
      } else {
         return var5 >= 80 ? 3 : 1;
      }
   }

   public static boolean method_33242(class_6629<class_7272> var0, class_9379 var1, class_2417 var2, BlockPos var3, Random var4) {
      class_2522 var7 = var1.method_28262(var3.method_6100());
      return (var7.method_8350(class_4783.field_23259) || var7.method_8350(class_4783.field_23552) || var7.method_8350(class_4783.field_23216))
         && var1.method_25261(var3, 0) > 8;
   }

   private boolean method_33241() {
      return this.field_37234 == 0;
   }

   @Override
   public void method_37336(byte var1) {
      if (var1 != 1) {
         super.method_37336(var1);
      } else {
         this.method_37343();
         this.field_37236 = 10;
         this.field_37237 = 0;
      }
   }

   @Override
   public class_1343 method_37323() {
      return new class_1343(0.0, (double)(0.6F * this.method_37277()), (double)(this.method_37086() * 0.4F));
   }
}
