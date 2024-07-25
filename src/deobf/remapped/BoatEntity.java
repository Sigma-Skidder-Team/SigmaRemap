package remapped;

import com.google.common.collect.UnmodifiableIterator;
import java.util.List;
import javax.annotation.Nullable;

public class BoatEntity extends Entity {
   private static final class_7821<Integer> field_46797 = class_8073.<Integer>method_36641(BoatEntity.class, class_2734.field_13366);
   private static final class_7821<Integer> field_46814 = class_8073.<Integer>method_36641(BoatEntity.class, class_2734.field_13366);
   private static final class_7821<Float> field_46803 = class_8073.<Float>method_36641(BoatEntity.class, class_2734.field_13350);
   private static final class_7821<Integer> field_46811 = class_8073.<Integer>method_36641(BoatEntity.class, class_2734.field_13366);
   private static final class_7821<Boolean> field_46809 = class_8073.<Boolean>method_36641(BoatEntity.class, class_2734.field_13347);
   private static final class_7821<Boolean> field_46798 = class_8073.<Boolean>method_36641(BoatEntity.class, class_2734.field_13347);
   private static final class_7821<Integer> field_46810 = class_8073.<Integer>method_36641(BoatEntity.class, class_2734.field_13366);
   private final float[] field_46807 = new float[2];
   private float field_46801;
   private float field_46794;
   private float field_46789;
   private int field_46790;
   private double field_46806;
   private double field_46817;
   private double field_46800;
   private double field_46795;
   private double field_46816;
   private boolean field_46796;
   private boolean field_46812;
   private boolean field_46813;
   private boolean field_46804;
   private double field_46791;
   private float field_46799;
   private class_1038 field_46802;
   private class_1038 field_46808;
   private double field_46788;
   private boolean field_46793;
   private boolean field_46818;
   private float field_46805;
   private float field_46792;
   private float field_46815;

   public BoatEntity(class_6629<? extends BoatEntity> var1, World var2) {
      super(var1, var2);
      this.field_41759 = true;
   }

   public BoatEntity(World var1, double var2, double var4, double var6) {
      this(class_6629.field_34330, var1);
      this.method_37256(var2, var4, var6);
      this.method_37215(class_1343.field_7335);
      this.field_41767 = var2;
      this.field_41698 = var4;
      this.field_41725 = var6;
   }

   @Override
   public float method_37279(class_7653 var1, class_6097 var2) {
      return var2.field_31200;
   }

   @Override
   public boolean method_37126() {
      return false;
   }

   @Override
   public void method_37329() {
      this.field_41735.method_36634(field_46797, 0);
      this.field_41735.method_36634(field_46814, 1);
      this.field_41735.method_36634(field_46803, 0.0F);
      this.field_41735.method_36634(field_46811, class_3837.field_18740.ordinal());
      this.field_41735.method_36634(field_46809, false);
      this.field_41735.method_36634(field_46798, false);
      this.field_41735.method_36634(field_46810, 0);
   }

   @Override
   public boolean method_37325(Entity var1) {
      return method_42092(this, var1);
   }

   public static boolean method_42092(Entity var0, Entity var1) {
      return (var1.method_37173() || var1.method_37177()) && !var0.method_37308(var1);
   }

   @Override
   public boolean method_37173() {
      return true;
   }

   @Override
   public boolean method_37177() {
      return true;
   }

   @Override
   public class_1343 method_37375(class_9249 var1, class_8623 var2) {
      return class_5834.method_26437(super.method_37375(var1, var2));
   }

   @Override
   public double method_37149() {
      return -0.1;
   }

   @Override
   public boolean attackEntityFrom(DamageSource var1, float var2) {
      if (this.method_37180(var1)) {
         return false;
      } else if (!this.world.field_33055 && !this.field_41751) {
         this.method_42106(-this.method_42094());
         this.method_42098(10);
         this.method_42099(this.method_42109() + var2 * 10.0F);
         this.method_37138();
         boolean var5 = var1.method_28372() instanceof class_704 && ((class_704)var1.method_28372()).playerAbilities.isCreativeMode;
         if (var5 || this.method_42109() > 40.0F) {
            if (!var5 && this.world.method_29537().method_1285(class_291.field_1024)) {
               this.method_37312(this.method_42090());
            }

            this.method_37204();
         }

         return true;
      } else {
         return true;
      }
   }

   @Override
   public void method_37334(boolean var1) {
      if (!this.world.field_33055) {
         this.field_46793 = true;
         this.field_46818 = var1;
         if (this.method_42100() == 0) {
            this.method_42102(60);
         }
      }

      this.world
         .method_43361(
            class_3090.field_15346,
            this.getPosX() + (double)this.field_41717.nextFloat(),
            this.method_37309() + 0.7,
            this.getPosZ() + (double)this.field_41717.nextFloat(),
            0.0,
            0.0,
            0.0
         );
      if (this.field_41717.nextInt(20) == 0) {
         this.world
            .method_29527(
               this.getPosX(),
               this.method_37309(),
               this.getPosZ(),
               this.method_37133(),
               this.method_37197(),
               1.0F,
               0.8F + 0.4F * this.field_41717.nextFloat(),
               false
            );
      }
   }

   @Override
   public void method_37183(Entity var1) {
      if (!(var1 instanceof BoatEntity)) {
         if (var1.method_37241().field_19937 <= this.method_37241().field_19937) {
            super.method_37183(var1);
         }
      } else if (var1.method_37241().field_19937 < this.method_37241().field_19939) {
         super.method_37183(var1);
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public class_2451 method_42090() {
      switch (this.method_42112()) {
         case field_18740:
         default:
            return class_4897.field_25008;
         case field_18735:
            return class_4897.field_24898;
         case field_18734:
            return class_4897.field_24567;
         case field_18742:
            return class_4897.field_24702;
         case field_18738:
            return class_4897.field_25199;
         case field_18739:
            return class_4897.field_25052;
      }
   }

   @Override
   public void method_37082() {
      this.method_42106(-this.method_42094());
      this.method_42098(10);
      this.method_42099(this.method_42109() * 11.0F);
   }

   @Override
   public boolean method_37167() {
      return !this.field_41751;
   }

   @Override
   public void method_37318(double var1, double var3, double var5, float var7, float var8, int var9, boolean var10) {
      this.field_46806 = var1;
      this.field_46817 = var3;
      this.field_46800 = var5;
      this.field_46795 = (double)var7;
      this.field_46816 = (double)var8;
      this.field_46790 = 10;
   }

   @Override
   public Direction method_37235() {
      return this.method_37365().method_1042();
   }

   @Override
   public void method_37123() {
      this.field_46808 = this.field_46802;
      this.field_46802 = this.method_42095();
      if (this.field_46802 != class_1038.field_5728 && this.field_46802 != class_1038.field_5733) {
         this.field_46794 = 0.0F;
      } else {
         this.field_46794++;
      }

      if (!this.world.field_33055 && this.field_46794 >= 60.0F) {
         this.method_37305();
      }

      if (this.method_42110() > 0) {
         this.method_42098(this.method_42110() - 1);
      }

      if (this.method_42109() > 0.0F) {
         this.method_42099(this.method_42109() - 1.0F);
      }

      super.method_37123();
      this.method_42088();
      if (!this.canPassengerSteer()) {
         this.method_37215(class_1343.field_7335);
      } else {
         if (this.method_37114().isEmpty() || !(this.method_37114().get(0) instanceof class_704)) {
            this.method_42087(false, false);
         }

         this.method_42091();
         if (this.world.field_33055) {
            this.method_42113();
            this.world.method_29535(new class_8125(this.method_42104(0), this.method_42104(1)));
         }

         this.method_37226(class_7412.field_37839, this.method_37098());
      }

      this.method_42107();

      for (int var3 = 0; var3 <= 1; var3++) {
         if (!this.method_42104(var3)) {
            this.field_46807[var3] = 0.0F;
         } else {
            if (!this.method_37378()
               && (double)(this.field_46807[var3] % (float) (Math.PI * 2)) <= (float) (Math.PI / 4)
               && ((double)this.field_46807[var3] + (float) (Math.PI / 8)) % (float) (Math.PI * 2) >= (float) (Math.PI / 4)) {
               class_8461 var4 = this.method_42097();
               if (var4 != null) {
                  class_1343 var5 = this.method_37307(1.0F);
                  double var6 = var3 != 1 ? var5.field_7334 : -var5.field_7334;
                  double var8 = var3 != 1 ? -var5.field_7336 : var5.field_7336;
                  this.world
                     .method_29528(
                        (class_704)null,
                        this.getPosX() + var6,
                        this.method_37309(),
                        this.getPosZ() + var8,
                        var4,
                        this.method_37197(),
                        1.0F,
                        0.8F + 0.4F * this.field_41717.nextFloat()
                     );
               }
            }

            this.field_46807[var3] = (float)((double)this.field_46807[var3] + (float) (Math.PI / 8));
         }
      }

      this.method_37097();
      List var11 = this.world.method_25867(this, this.method_37241().method_18899(0.2F, -0.01F, 0.2F), class_3572.method_16616(this));
      if (!var11.isEmpty()) {
         boolean var12 = !this.world.field_33055 && !(this.method_37259() instanceof class_704);

         for (int var13 = 0; var13 < var11.size(); var13++) {
            Entity var10 = (Entity)var11.get(var13);
            if (!var10.method_37072(this)) {
               if (var12
                  && this.method_37114().size() < 2
                  && !var10.isPassenger()
                  && var10.method_37086() < this.method_37086()
                  && var10 instanceof class_5834
                  && !(var10 instanceof class_1829)
                  && !(var10 instanceof class_704)) {
                  var10.method_37353(this);
               } else {
                  this.method_37183(var10);
               }
            }
         }
      }
   }

   private void method_42107() {
      if (!this.world.field_33055) {
         if (!this.field_46793) {
            this.method_42102(0);
         }

         int var3 = this.method_42100();
         if (var3 > 0) {
            this.method_42102(--var3);
            int var4 = 60 - var3 - 1;
            if (var4 > 0 && var3 == 0) {
               this.method_42102(0);
               class_1343 var5 = this.method_37098();
               if (!this.field_46818) {
                  this.method_37214(var5.field_7336, !this.method_37071(class_704.class) ? 0.6 : 2.7, var5.field_7334);
               } else {
                  this.method_37215(var5.method_6214(0.0, -0.7, 0.0));
                  this.method_37305();
               }
            }

            this.field_46793 = false;
         }
      } else {
         int var7 = this.method_42100();
         if (var7 <= 0) {
            this.field_46805 -= 0.1F;
         } else {
            this.field_46805 += 0.05F;
         }

         this.field_46805 = class_9299.method_42828(this.field_46805, 0.0F, 1.0F);
         this.field_46815 = this.field_46792;
         this.field_46792 = 10.0F * (float)Math.sin((double)(0.5F * (float)this.world.method_29546())) * this.field_46805;
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Nullable
   public class_8461 method_42097() {
      switch (this.method_42095()) {
         case field_5732:
         case field_5728:
         case field_5733:
            return class_463.field_2133;
         case field_5729:
            return class_463.field_2515;
         case field_5730:
         default:
            return null;
      }
   }

   private void method_42088() {
      if (this.canPassengerSteer()) {
         this.field_46790 = 0;
         this.method_37223(this.getPosX(), this.method_37309(), this.getPosZ());
      }

      if (this.field_46790 > 0) {
         double var3 = this.getPosX() + (this.field_46806 - this.getPosX()) / (double)this.field_46790;
         double var5 = this.method_37309() + (this.field_46817 - this.method_37309()) / (double)this.field_46790;
         double var7 = this.getPosZ() + (this.field_46800 - this.getPosZ()) / (double)this.field_46790;
         double var9 = class_9299.method_42809(this.field_46795 - (double)this.rotationYaw);
         this.rotationYaw = (float)((double)this.rotationYaw + var9 / (double)this.field_46790);
         this.rotationPitch = (float)((double)this.rotationPitch + (this.field_46816 - (double)this.rotationPitch) / (double)this.field_46790);
         this.field_46790--;
         this.method_37256(var3, var5, var7);
         this.method_37395(this.rotationYaw, this.rotationPitch);
      }
   }

   public void method_42087(boolean var1, boolean var2) {
      this.field_41735.method_36633(field_46809, var1);
      this.field_41735.method_36633(field_46798, var2);
   }

   public float method_42108(int var1, float var2) {
      return !this.method_42104(var1)
         ? 0.0F
         : (float)class_9299.method_42841((double)this.field_46807[var1] - (float) (Math.PI / 8), (double)this.field_46807[var1], (double)var2);
   }

   private class_1038 method_42095() {
      class_1038 var3 = this.method_42089();
      if (var3 == null) {
         if (!this.method_42096()) {
            float var4 = this.method_42111();
            if (!(var4 > 0.0F)) {
               return class_1038.field_5730;
            } else {
               this.field_46799 = var4;
               return class_1038.field_5729;
            }
         } else {
            return class_1038.field_5732;
         }
      } else {
         this.field_46791 = this.method_37241().field_19939;
         return var3;
      }
   }

   public float method_42103() {
      Box var3 = this.method_37241();
      int var4 = class_9299.method_42847(var3.field_19941);
      int var5 = class_9299.method_42815(var3.field_19940);
      int var6 = class_9299.method_42847(var3.field_19939);
      int var7 = class_9299.method_42815(var3.field_19939 - this.field_46788);
      int var8 = class_9299.method_42847(var3.field_19938);
      int var9 = class_9299.method_42815(var3.field_19942);
      class_2921 var10 = new class_2921();

      label45:
      for (int var11 = var6; var11 < var7; var11++) {
         float var12 = 0.0F;

         for (int var13 = var4; var13 < var5; var13++) {
            for (int var14 = var8; var14 < var9; var14++) {
               var10.method_13362(var13, var11, var14);
               class_4774 var15 = this.world.method_28258(var10);
               if (var15.method_22007(class_6503.field_33094)) {
                  var12 = Math.max(var12, var15.method_22008(this.world, var10));
               }

               if (var12 >= 1.0F) {
                  continue label45;
               }
            }
         }

         if (var12 < 1.0F) {
            return (float)var10.method_12165() + var12;
         }
      }

      return (float)(var7 + 1);
   }

   public float method_42111() {
      Box var3 = this.method_37241();
      Box var4 = new Box(var3.field_19941, var3.field_19937 - 0.001, var3.field_19938, var3.field_19940, var3.field_19937, var3.field_19942);
      int var5 = class_9299.method_42847(var4.field_19941) - 1;
      int var6 = class_9299.method_42815(var4.field_19940) + 1;
      int var7 = class_9299.method_42847(var4.field_19937) - 1;
      int var8 = class_9299.method_42815(var4.field_19939) + 1;
      int var9 = class_9299.method_42847(var4.field_19938) - 1;
      int var10 = class_9299.method_42815(var4.field_19942) + 1;
      class_4190 var11 = class_3370.method_15523(var4);
      float var12 = 0.0F;
      int var13 = 0;
      class_2921 var14 = new class_2921();

      for (int var15 = var5; var15 < var6; var15++) {
         for (int var16 = var9; var16 < var10; var16++) {
            int var17 = (var15 != var5 && var15 != var6 - 1 ? 0 : 1) + (var16 != var9 && var16 != var10 - 1 ? 0 : 1);
            if (var17 != 2) {
               for (int var18 = var7; var18 < var8; var18++) {
                  if (var17 <= 0 || var18 != var7 && var18 != var8 - 1) {
                     var14.method_13362(var15, var18, var16);
                     class_2522 var19 = this.world.method_28262(var14);
                     if (!(var19.method_8360() instanceof class_9114)
                        && class_3370.method_15537(
                           var19.method_8324(this.world, var14).method_19496((double)var15, (double)var18, (double)var16), var11, class_8529.field_43655
                        )) {
                        var12 += var19.method_8360().method_29308();
                        var13++;
                     }
                  }
               }
            }
         }
      }

      return var12 / (float)var13;
   }

   private boolean method_42096() {
      Box var3 = this.method_37241();
      int var4 = class_9299.method_42847(var3.field_19941);
      int var5 = class_9299.method_42815(var3.field_19940);
      int var6 = class_9299.method_42847(var3.field_19937);
      int var7 = class_9299.method_42815(var3.field_19937 + 0.001);
      int var8 = class_9299.method_42847(var3.field_19938);
      int var9 = class_9299.method_42815(var3.field_19942);
      boolean var10 = false;
      this.field_46791 = Double.MIN_VALUE;
      class_2921 var11 = new class_2921();

      for (int var12 = var4; var12 < var5; var12++) {
         for (int var13 = var6; var13 < var7; var13++) {
            for (int var14 = var8; var14 < var9; var14++) {
               var11.method_13362(var12, var13, var14);
               class_4774 var15 = this.world.method_28258(var11);
               if (var15.method_22007(class_6503.field_33094)) {
                  float var16 = (float)var13 + var15.method_22008(this.world, var11);
                  this.field_46791 = Math.max((double)var16, this.field_46791);
                  var10 |= var3.field_19937 < (double)var16;
               }
            }
         }
      }

      return var10;
   }

   @Nullable
   private class_1038 method_42089() {
      Box var3 = this.method_37241();
      double var4 = var3.field_19939 + 0.001;
      int var6 = class_9299.method_42847(var3.field_19941);
      int var7 = class_9299.method_42815(var3.field_19940);
      int var8 = class_9299.method_42847(var3.field_19939);
      int var9 = class_9299.method_42815(var4);
      int var10 = class_9299.method_42847(var3.field_19938);
      int var11 = class_9299.method_42815(var3.field_19942);
      boolean var12 = false;
      class_2921 var13 = new class_2921();

      for (int var14 = var6; var14 < var7; var14++) {
         for (int var15 = var8; var15 < var9; var15++) {
            for (int var16 = var10; var16 < var11; var16++) {
               var13.method_13362(var14, var15, var16);
               class_4774 var17 = this.world.method_28258(var13);
               if (var17.method_22007(class_6503.field_33094) && var4 < (double)((float)var13.method_12165() + var17.method_22008(this.world, var13))) {
                  if (!var17.method_21993()) {
                     return class_1038.field_5733;
                  }

                  var12 = true;
               }
            }
         }
      }

      return !var12 ? null : class_1038.field_5728;
   }

   private void method_42091() {
      double var3 = -0.04F;
      double var5 = !this.method_37078() ? -0.04F : 0.0;
      double var7 = 0.0;
      this.field_46801 = 0.05F;
      if (this.field_46808 == class_1038.field_5730 && this.field_46802 != class_1038.field_5730 && this.field_46802 != class_1038.field_5729) {
         this.field_46791 = this.method_37080(1.0);
         this.method_37256(this.getPosX(), (double)(this.method_42103() - this.method_37074()) + 0.101, this.getPosZ());
         this.method_37215(this.method_37098().method_6210(1.0, 0.0, 1.0));
         this.field_46788 = 0.0;
         this.field_46802 = class_1038.field_5732;
      } else {
         if (this.field_46802 != class_1038.field_5732) {
            if (this.field_46802 != class_1038.field_5733) {
               if (this.field_46802 != class_1038.field_5728) {
                  if (this.field_46802 != class_1038.field_5730) {
                     if (this.field_46802 == class_1038.field_5729) {
                        this.field_46801 = this.field_46799;
                        if (this.method_37259() instanceof class_704) {
                           this.field_46799 /= 2.0F;
                        }
                     }
                  } else {
                     this.field_46801 = 0.9F;
                  }
               } else {
                  var7 = 0.01F;
                  this.field_46801 = 0.45F;
               }
            } else {
               var5 = -7.0E-4;
               this.field_46801 = 0.9F;
            }
         } else {
            var7 = (this.field_46791 - this.method_37309()) / (double)this.method_37074();
            this.field_46801 = 0.9F;
         }

         class_1343 var9 = this.method_37098();
         this.method_37214(var9.field_7336 * (double)this.field_46801, var9.field_7333 + var5, var9.field_7334 * (double)this.field_46801);
         this.field_46789 = this.field_46789 * this.field_46801;
         if (var7 > 0.0) {
            class_1343 var10 = this.method_37098();
            this.method_37214(var10.field_7336, (var10.field_7333 + var7 * 0.06153846016296973) * 0.75, var10.field_7334);
         }
      }
   }

   private void method_42113() {
      if (this.method_37151()) {
         float var3 = 0.0F;
         if (this.field_46796) {
            this.field_46789--;
         }

         if (this.field_46812) {
            this.field_46789++;
         }

         if (this.field_46812 != this.field_46796 && !this.field_46813 && !this.field_46804) {
            var3 += 0.005F;
         }

         this.rotationYaw = this.rotationYaw + this.field_46789;
         if (this.field_46813) {
            var3 += 0.04F;
         }

         if (this.field_46804) {
            var3 -= 0.005F;
         }

         this.method_37215(
            this.method_37098()
               .method_6214(
                  (double)(class_9299.method_42818(-this.rotationYaw * (float) (Math.PI / 180.0)) * var3),
                  0.0,
                  (double)(class_9299.method_42840(this.rotationYaw * (float) (Math.PI / 180.0)) * var3)
               )
         );
         this.method_42087(this.field_46812 && !this.field_46796 || this.field_46813, this.field_46796 && !this.field_46812 || this.field_46813);
      }
   }

   @Override
   public void method_37340(Entity var1) {
      if (this.method_37072(var1)) {
         float var4 = 0.0F;
         float var5 = (float)((!this.field_41751 ? this.method_37149() : 0.01F) + var1.method_37106());
         if (this.method_37114().size() > 1) {
            int var6 = this.method_37114().indexOf(var1);
            if (var6 != 0) {
               var4 = -0.6F;
            } else {
               var4 = 0.2F;
            }

            if (var1 instanceof class_5467) {
               var4 = (float)((double)var4 + 0.2);
            }
         }

         class_1343 var8 = new class_1343((double)var4, 0.0, 0.0).method_6192(-this.rotationYaw * (float) (Math.PI / 180.0) - (float) (Math.PI / 2));
         var1.method_37256(this.getPosX() + var8.field_7336, this.method_37309() + (double)var5, this.getPosZ() + var8.field_7334);
         var1.rotationYaw = var1.rotationYaw + this.field_46789;
         var1.setRotationYawHead(var1.method_37267() + this.field_46789);
         this.method_42105(var1);
         if (var1 instanceof class_5467 && this.method_37114().size() > 1) {
            int var7 = var1.method_37145() % 2 != 0 ? 270 : 90;
            var1.method_37090(((class_5467)var1).field_29605 + (float)var7);
            var1.setRotationYawHead(var1.method_37267() + (float)var7);
         }
      }
   }

   @Override
   public class_1343 method_37282(class_5834 var1) {
      class_1343 var4 = method_37373((double)(this.method_37086() * class_9299.field_47448), (double)var1.method_37086(), this.rotationYaw);
      double var5 = this.getPosX() + var4.field_7336;
      double var7 = this.getPosZ() + var4.field_7334;
      BlockPos var9 = new BlockPos(var5, this.method_37241().field_19939, var7);
      BlockPos var10 = var9.method_6100();
      if (!this.world.method_22565(var10)) {
         double var11 = (double)var9.method_12165() + this.world.method_28259(var9);
         double var13 = (double)var9.method_12165() + this.world.method_28259(var10);
         UnmodifiableIterator var15 = var1.method_26454().iterator();

         while (var15.hasNext()) {
            class_7653 var16 = (class_7653)var15.next();
            class_1343 var17 = class_160.method_649(this.world, var5, var11, var7, var1, var16);
            if (var17 != null) {
               var1.method_37356(var16);
               return var17;
            }

            class_1343 var18 = class_160.method_649(this.world, var5, var13, var7, var1, var16);
            if (var18 != null) {
               var1.method_37356(var16);
               return var18;
            }
         }
      }

      return super.method_37282(var1);
   }

   public void method_42105(Entity var1) {
      var1.method_37090(this.rotationYaw);
      float var4 = class_9299.method_42810(var1.rotationYaw - this.rotationYaw);
      float var5 = class_9299.method_42828(var4, -105.0F, 105.0F);
      var1.prevRotationYaw += var5 - var4;
      var1.rotationYaw += var5 - var4;
      var1.setRotationYawHead(var1.rotationYaw);
   }

   @Override
   public void method_37224(Entity var1) {
      this.method_42105(var1);
   }

   @Override
   public void method_37376(CompoundNBT var1) {
      var1.method_25941("Type", this.method_42112().method_17824());
   }

   @Override
   public void method_37314(CompoundNBT var1) {
      if (var1.contains("Type", 8)) {
         this.method_42101(class_3837.method_17825(var1.method_25965("Type")));
      }
   }

   @Override
   public class_6910 method_37128(class_704 var1, Hand var2) {
      if (!var1.method_3236()) {
         if (!(this.field_46794 < 60.0F)) {
            return class_6910.field_35521;
         } else if (this.world.field_33055) {
            return class_6910.field_35520;
         } else {
            return !var1.method_37353(this) ? class_6910.field_35521 : class_6910.field_35518;
         }
      } else {
         return class_6910.field_35521;
      }
   }

   @Override
   public void method_37105(double var1, boolean var3, class_2522 var4, BlockPos var5) {
      this.field_46788 = this.method_37098().field_7333;
      if (!this.isPassenger()) {
         if (!var3) {
            if (!this.world.method_28258(this.method_37075().method_6100()).method_22007(class_6503.field_33094) && var1 < 0.0) {
               this.field_41706 = (float)((double)this.field_41706 - var1);
            }
         } else {
            if (this.field_41706 > 3.0F) {
               if (this.field_46802 != class_1038.field_5729) {
                  this.field_41706 = 0.0F;
                  return;
               }

               this.method_37270(this.field_41706, 1.0F);
               if (!this.world.field_33055 && !this.field_41751) {
                  this.method_37204();
                  if (this.world.method_29537().method_1285(class_291.field_1024)) {
                     for (int var8 = 0; var8 < 3; var8++) {
                        this.method_37312(this.method_42112().method_17827());
                     }

                     for (int var9 = 0; var9 < 2; var9++) {
                        this.method_37312(class_4897.field_24413);
                     }
                  }
               }
            }

            this.field_41706 = 0.0F;
         }
      }
   }

   public boolean method_42104(int var1) {
      return this.field_41735.<Boolean>method_36640(var1 != 0 ? field_46798 : field_46809) && this.method_37259() != null;
   }

   public void method_42099(float var1) {
      this.field_41735.method_36633(field_46803, var1);
   }

   public float method_42109() {
      return this.field_41735.<Float>method_36640(field_46803);
   }

   public void method_42098(int var1) {
      this.field_41735.method_36633(field_46797, var1);
   }

   public int method_42110() {
      return this.field_41735.<Integer>method_36640(field_46797);
   }

   private void method_42102(int var1) {
      this.field_41735.method_36633(field_46810, var1);
   }

   private int method_42100() {
      return this.field_41735.<Integer>method_36640(field_46810);
   }

   public float method_42086(float var1) {
      return class_9299.method_42795(var1, this.field_46815, this.field_46792);
   }

   public void method_42106(int var1) {
      this.field_41735.method_36633(field_46814, var1);
   }

   public int method_42094() {
      return this.field_41735.<Integer>method_36640(field_46814);
   }

   public void method_42101(class_3837 var1) {
      this.field_41735.method_36633(field_46811, var1.ordinal());
   }

   public class_3837 method_42112() {
      return class_3837.method_17826(this.field_41735.<Integer>method_36640(field_46811));
   }

   @Override
   public boolean method_37286(Entity var1) {
      return this.method_37114().size() < 2 && !this.method_37261(class_6503.field_33094);
   }

   @Nullable
   @Override
   public Entity method_37259() {
      List var3 = this.method_37114();
      return !var3.isEmpty() ? (Entity)var3.get(0) : null;
   }

   public void method_42093(boolean var1, boolean var2, boolean var3, boolean var4) {
      this.field_46796 = var1;
      this.field_46812 = var2;
      this.field_46813 = var3;
      this.field_46804 = var4;
   }

   @Override
   public Packet<?> method_37142() {
      return new class_6589(this);
   }

   @Override
   public boolean method_37179() {
      return this.field_46802 == class_1038.field_5728 || this.field_46802 == class_1038.field_5733;
   }
}
