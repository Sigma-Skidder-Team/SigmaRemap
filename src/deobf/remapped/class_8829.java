package remapped;

import java.util.UUID;
import javax.annotation.Nullable;

public class class_8829 extends class_5467 implements class_6250, class_674 {
   private static final class_7821<Byte> field_45170 = class_8073.<Byte>method_36641(class_8829.class, class_2734.field_13361);
   private static final class_7821<Integer> field_45169 = class_8073.<Integer>method_36641(class_8829.class, class_2734.field_13366);
   private static final class_4376 field_45167 = class_5804.method_26295(20, 39);
   private UUID field_45168;
   private float field_45166;
   private float field_45162;
   private int field_45161;
   private int field_45165;
   private int field_45159;
   private int field_45158;
   private int field_45157 = 0;
   private int field_45154 = 0;
   private class_1331 field_45156 = null;
   private class_1331 field_45160 = null;
   private class_6694 field_45171;
   private class_949 field_45155;
   private class_3494 field_45163;
   private int field_45153;

   public class_8829(class_6629<? extends class_8829> var1, World var2) {
      super(var1, var2);
      this.field_29900 = new class_2112(this, 20, true);
      this.field_29919 = new class_7778(this, this);
      this.method_26895(class_1108.field_6357, -1.0F);
      this.method_26895(class_1108.field_6359, -1.0F);
      this.method_26895(class_1108.field_6356, 16.0F);
      this.method_26895(class_1108.field_6344, -1.0F);
      this.method_26895(class_1108.field_6353, -1.0F);
   }

   @Override
   public void method_37329() {
      super.method_37329();
      this.field_41735.method_36634(field_45170, (byte)0);
      this.field_41735.method_36634(field_45169, 0);
   }

   @Override
   public float method_21376(class_1331 var1, class_4924 var2) {
      return !var2.method_28262(var1).method_8345() ? 0.0F : 10.0F;
   }

   @Override
   public void method_26851() {
      this.field_29916.method_3485(0, new class_4581(this, this, 1.4F, true));
      this.field_29916.method_3485(1, new class_7968(this, null));
      this.field_29916.method_3485(2, new class_9513(this, 1.0));
      this.field_29916.method_3485(3, new class_7228(this, 1.25, class_8137.method_37022(class_391.field_1607), false));
      this.field_45171 = new class_6694(this);
      this.field_29916.method_3485(4, this.field_45171);
      this.field_29916.method_3485(5, new class_8676(this, 1.25));
      this.field_29916.method_3485(5, new class_2898(this, null));
      this.field_45155 = new class_949(this);
      this.field_29916.method_3485(5, this.field_45155);
      this.field_45163 = new class_3494(this);
      this.field_29916.method_3485(6, this.field_45163);
      this.field_29916.method_3485(7, new class_4901(this, null));
      this.field_29916.method_3485(8, new class_5650(this));
      this.field_29916.method_3485(9, new class_787(this));
      this.field_29908.method_3485(1, new class_2591(this, this).method_38757(new Class[0]));
      this.field_29908.method_3485(2, new class_486(this));
      this.field_29908.method_3485(3, new class_6474<class_8829>(this, true));
   }

   @Override
   public void method_37376(CompoundNBT var1) {
      super.method_37376(var1);
      if (this.method_40588()) {
         var1.put("HivePos", class_4338.method_20190(this.method_40605()));
      }

      if (this.method_40603()) {
         var1.put("FlowerPos", class_4338.method_20190(this.method_40558()));
      }

      var1.putBoolean("HasNectar", this.method_40592());
      var1.putBoolean("HasStung", this.method_40610());
      var1.method_25931("TicksSincePollination", this.field_45165);
      var1.method_25931("CannotEnterHiveTicks", this.field_45159);
      var1.method_25931("CropsGrownSincePollination", this.field_45158);
      this.method_28528(var1);
   }

   @Override
   public void method_37314(CompoundNBT var1) {
      this.field_45160 = null;
      if (var1.method_25938("HivePos")) {
         this.field_45160 = class_4338.method_20189(var1.getCompound("HivePos"));
      }

      this.field_45156 = null;
      if (var1.method_25938("FlowerPos")) {
         this.field_45156 = class_4338.method_20189(var1.getCompound("FlowerPos"));
      }

      super.method_37314(var1);
      this.method_40598(var1.getBoolean("HasNectar"));
      this.method_40624(var1.getBoolean("HasStung"));
      this.field_45165 = var1.method_25947("TicksSincePollination");
      this.field_45159 = var1.method_25947("CannotEnterHiveTicks");
      this.field_45158 = var1.method_25947("CropsGrownSincePollination");
      this.method_28533((class_6331)this.field_41768, var1);
   }

   @Override
   public boolean method_26442(Entity var1) {
      boolean var4 = var1.method_37181(class_6199.method_28370(this), (float)((int)this.method_26575(class_7331.field_37462)));
      if (var4) {
         this.method_37096(this, var1);
         if (var1 instanceof class_5834) {
            ((class_5834)var1).method_26504(((class_5834)var1).method_26619() + 1);
            byte var5 = 0;
            if (this.field_41768.method_43370() != class_423.field_1789) {
               if (this.field_41768.method_43370() == class_423.field_1782) {
                  var5 = 18;
               }
            } else {
               var5 = 10;
            }

            if (var5 > 0) {
               ((class_5834)var1).method_26558(new class_2250(Effects.field_19718, var5 * 20, 0));
            }
         }

         this.method_40624(true);
         this.method_28538();
         this.method_37155(class_463.field_2673, 1.0F, 1.0F);
      }

      return var4;
   }

   @Override
   public void method_37123() {
      super.method_37123();
      if (this.method_40592() && this.method_40582() < 10 && this.field_41717.nextFloat() < 0.05F) {
         for (int var3 = 0; var3 < this.field_41717.nextInt(2) + 1; var3++) {
            this.method_40585(
               this.field_41768,
               this.method_37302() - 0.3F,
               this.method_37302() + 0.3F,
               this.method_37156() - 0.3F,
               this.method_37156() + 0.3F,
               this.method_37080(0.5),
               class_3090.field_15344
            );
         }
      }

      this.method_40548();
   }

   private void method_40585(World var1, double var2, double var4, double var6, double var8, double var10, class_5079 var12) {
      var1.method_43361(
         var12,
         class_9299.method_42794(var1.field_33033.nextDouble(), var2, var4),
         var10,
         class_9299.method_42794(var1.field_33033.nextDouble(), var6, var8),
         0.0,
         0.0,
         0.0
      );
   }

   private void method_40553(class_1331 var1) {
      class_1343 var4 = class_1343.method_6200(var1);
      byte var5 = 0;
      class_1331 var6 = this.method_37075();
      int var7 = (int)var4.field_7333 - var6.method_12165();
      if (var7 <= 2) {
         if (var7 < -2) {
            var5 = -4;
         }
      } else {
         var5 = 4;
      }

      int var8 = 6;
      int var9 = 8;
      int var10 = var6.method_12176(var1);
      if (var10 < 15) {
         var8 = var10 / 2;
         var9 = var10 / 2;
      }

      class_1343 var11 = class_3425.method_15847(this, var8, var9, var5, var4, (float) (Math.PI / 10));
      if (var11 != null) {
         this.field_29904.method_5613(0.5F);
         this.field_29904.method_5595(var11.field_7336, var11.field_7333, var11.field_7334, 1.0);
      }
   }

   @Nullable
   public class_1331 method_40558() {
      return this.field_45156;
   }

   public boolean method_40603() {
      return this.field_45156 != null;
   }

   public void method_40551(class_1331 var1) {
      this.field_45156 = var1;
   }

   private boolean method_40611() {
      return this.field_45165 > 3600;
   }

   private boolean method_40560() {
      if (this.field_45159 <= 0 && !class_6694.method_30686(this.field_45171) && !this.method_40610() && this.method_17809() == null) {
         boolean var3 = this.method_40611() || this.field_41768.method_29561() || this.field_41768.method_29544() || this.method_40592();
         return var3 && !this.method_40568();
      } else {
         return false;
      }
   }

   public void method_40617(int var1) {
      this.field_45159 = var1;
   }

   public float method_40549(float var1) {
      return class_9299.method_42795(var1, this.field_45162, this.field_45166);
   }

   private void method_40548() {
      this.field_45162 = this.field_45166;
      if (!this.method_40615()) {
         this.field_45166 = Math.max(0.0F, this.field_45166 - 0.24F);
      } else {
         this.field_45166 = Math.min(1.0F, this.field_45166 + 0.2F);
      }
   }

   @Override
   public void method_26919() {
      boolean var3 = this.method_40610();
      if (!this.method_37134()) {
         this.field_45153 = 0;
      } else {
         this.field_45153++;
      }

      if (this.field_45153 > 20) {
         this.method_37181(class_6199.field_31671, 1.0F);
      }

      if (var3) {
         this.field_45161++;
         if (this.field_45161 % 5 == 0 && this.field_41717.nextInt(class_9299.method_42829(1200 - this.field_45161, 1, 1200)) == 0) {
            this.method_37181(class_6199.field_31664, this.method_26551());
         }
      }

      if (!this.method_40592()) {
         this.field_45165++;
      }

      if (!this.field_41768.field_33055) {
         this.method_28530((class_6331)this.field_41768, false);
      }
   }

   public void method_40584() {
      this.field_45165 = 0;
   }

   private boolean method_40568() {
      if (this.field_45160 == null) {
         return false;
      } else {
         class_3757 var3 = this.field_41768.method_28260(this.field_45160);
         return var3 instanceof class_5354 && ((class_5354)var3).method_24446();
      }
   }

   @Override
   public int method_28539() {
      return this.field_41735.<Integer>method_36640(field_45169);
   }

   @Override
   public void method_28532(int var1) {
      this.field_41735.method_36633(field_45169, var1);
   }

   @Override
   public UUID method_28535() {
      return this.field_45168;
   }

   @Override
   public void method_28531(UUID var1) {
      this.field_45168 = var1;
   }

   @Override
   public void method_28529() {
      this.method_28532(field_45167.method_20387(this.field_41717));
   }

   private boolean method_40620(class_1331 var1) {
      class_3757 var4 = this.field_41768.method_28260(var1);
      return !(var4 instanceof class_5354) ? false : !((class_5354)var4).method_24453();
   }

   public boolean method_40588() {
      return this.field_45160 != null;
   }

   @Nullable
   public class_1331 method_40605() {
      return this.field_45160;
   }

   @Override
   public void method_26929() {
      super.method_26929();
      class_1892.method_8435(this);
   }

   private int method_40582() {
      return this.field_45158;
   }

   private void method_40612() {
      this.field_45158 = 0;
   }

   private void method_40556() {
      this.field_45158++;
   }

   @Override
   public void method_26606() {
      super.method_26606();
      if (!this.field_41768.field_33055) {
         if (this.field_45159 > 0) {
            this.field_45159--;
         }

         if (this.field_45157 > 0) {
            this.field_45157--;
         }

         if (this.field_45154 > 0) {
            this.field_45154--;
         }

         boolean var3 = this.method_28537() && !this.method_40610() && this.method_17809() != null && this.method_17809().method_37275(this) < 4.0;
         this.method_40593(var3);
         if (this.field_41697 % 20 == 0 && !this.method_40586()) {
            this.field_45160 = null;
         }
      }
   }

   private boolean method_40586() {
      if (!this.method_40588()) {
         return false;
      } else {
         class_3757 var3 = this.field_41768.method_28260(this.field_45160);
         return var3 != null && var3.method_17405() == class_133.field_353;
      }
   }

   public boolean method_40592() {
      return this.method_40566(8);
   }

   private void method_40598(boolean var1) {
      if (var1) {
         this.method_40584();
      }

      this.method_40590(8, var1);
   }

   public boolean method_40610() {
      return this.method_40566(4);
   }

   private void method_40624(boolean var1) {
      this.method_40590(4, var1);
   }

   private boolean method_40615() {
      return this.method_40566(2);
   }

   private void method_40593(boolean var1) {
      this.method_40590(2, var1);
   }

   private boolean method_40559(class_1331 var1) {
      return !this.method_40545(var1, 32);
   }

   private void method_40590(int var1, boolean var2) {
      if (!var2) {
         this.field_41735.method_36633(field_45170, (byte)(this.field_41735.<Byte>method_36640(field_45170) & ~var1));
      } else {
         this.field_41735.method_36633(field_45170, (byte)(this.field_41735.<Byte>method_36640(field_45170) | var1));
      }
   }

   private boolean method_40566(int var1) {
      return (this.field_41735.<Byte>method_36640(field_45170) & var1) != 0;
   }

   public static class_1313 method_40625() {
      return class_5886.method_26846()
         .method_5984(class_7331.field_37468, 10.0)
         .method_5984(class_7331.field_37474, 0.6F)
         .method_5984(class_7331.field_37465, 0.3F)
         .method_5984(class_7331.field_37462, 2.0)
         .method_5984(class_7331.field_37471, 48.0);
   }

   @Override
   public class_1249 method_26933(World var1) {
      class_5967 var4 = new class_5967(this, this, var1);
      var4.method_23534(false);
      var4.method_5611(false);
      var4.method_23535(true);
      return var4;
   }

   @Override
   public boolean method_24866(ItemStack var1) {
      return var1.method_27960().method_11250(class_391.field_1607);
   }

   private boolean method_40580(class_1331 var1) {
      return this.field_41768.method_29585(var1) && this.field_41768.method_28262(var1).method_8360().method_29299(class_2351.field_11795);
   }

   @Override
   public void method_37207(class_1331 var1, class_2522 var2) {
   }

   @Override
   public class_8461 method_26918() {
      return null;
   }

   @Override
   public class_8461 method_26541(class_6199 var1) {
      return class_463.field_2391;
   }

   @Override
   public class_8461 method_26599() {
      return class_463.field_2161;
   }

   @Override
   public float method_26439() {
      return 0.4F;
   }

   public class_8829 method_40623(class_6331 var1, class_1899 var2) {
      return class_6629.field_34238.method_30484(var1);
   }

   @Override
   public float method_26425(class_7653 var1, class_6097 var2) {
      return !this.method_26449() ? var2.field_31200 * 0.5F : var2.field_31200 * 0.5F;
   }

   @Override
   public boolean method_37270(float var1, float var2) {
      return false;
   }

   @Override
   public void method_37105(double var1, boolean var3, class_2522 var4, class_1331 var5) {
   }

   @Override
   public boolean method_37217() {
      return true;
   }

   public void method_40581() {
      this.method_40598(false);
      this.method_40612();
   }

   @Override
   public boolean method_37181(class_6199 var1, float var2) {
      if (!this.method_37180(var1)) {
         Entity var5 = var1.method_28372();
         if (!this.field_41768.field_33055) {
            class_6694.method_30689(this.field_45171);
         }

         return super.method_37181(var1, var2);
      } else {
         return false;
      }
   }

   @Override
   public class_2780 method_26550() {
      return class_2780.field_13575;
   }

   @Override
   public void method_26583(class_2307<class_2340> var1) {
      this.method_37215(this.method_37098().method_6214(0.0, 0.01, 0.0));
   }

   @Override
   public class_1343 method_37323() {
      return new class_1343(0.0, (double)(0.5F * this.method_37277()), (double)(this.method_37086() * 0.2F));
   }

   private boolean method_40545(class_1331 var1, int var2) {
      return var1.method_12171(this.method_37075(), (double)var2);
   }
}
