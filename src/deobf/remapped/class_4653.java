package remapped;

import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.function.Predicate;
import net.minecraft.util.text.ITextComponent;

public class class_4653 extends class_1173 implements class_7187, class_2354 {
   private static final class_7821<Integer> field_22692 = class_8073.<Integer>method_36641(class_4653.class, class_2734.field_13366);
   private static final class_7821<Integer> field_22703 = class_8073.<Integer>method_36641(class_4653.class, class_2734.field_13366);
   private static final class_7821<Integer> field_22700 = class_8073.<Integer>method_36641(class_4653.class, class_2734.field_13366);
   private static final List<class_7821<Integer>> field_22701 = ImmutableList.of(field_22692, field_22703, field_22700);
   private static final class_7821<Integer> field_22689 = class_8073.<Integer>method_36641(class_4653.class, class_2734.field_13366);
   private final float[] field_22695 = new float[2];
   private final float[] field_22693 = new float[2];
   private final float[] field_22698 = new float[2];
   private final float[] field_22690 = new float[2];
   private final int[] field_22691 = new int[2];
   private final int[] field_22694 = new int[2];
   private int field_22699;
   private final class_495 field_22702 = (class_495)new class_495(this.method_19839(), class_1062.field_5821, class_2976.field_14631).method_43461(true);
   private static final Predicate<class_5834> field_22697 = var0 -> var0.method_26550() != class_2780.field_13579 && var0.method_26556();
   private static final class_4931 field_22696 = new class_4931().method_22607(20.0).method_22606(field_22697);

   public class_4653(class_6629<? extends class_4653> var1, World var2) {
      super(var1, var2);
      this.method_26456(this.method_26465());
      this.method_26927().method_5611(true);
      this.field_29915 = 50;
   }

   @Override
   public void method_26851() {
      this.field_29916.method_3485(0, new class_2552(this));
      this.field_29916.method_3485(2, new class_1837(this, 1.0, 40, 20.0F));
      this.field_29916.method_3485(5, new class_2889(this, 1.0));
      this.field_29916.method_3485(6, new class_4407(this, class_704.class, 8.0F));
      this.field_29916.method_3485(7, new class_9691(this));
      this.field_29908.method_3485(1, new class_8420(this));
      this.field_29908.method_3485(2, new class_4138<class_5886>(this, class_5886.class, 0, false, false, field_22697));
   }

   @Override
   public void method_37329() {
      super.method_37329();
      this.field_41735.method_36634(field_22692, 0);
      this.field_41735.method_36634(field_22703, 0);
      this.field_41735.method_36634(field_22700, 0);
      this.field_41735.method_36634(field_22689, 0);
   }

   @Override
   public void method_37376(CompoundNBT var1) {
      super.method_37376(var1);
      var1.method_25931("Invul", this.method_21507());
   }

   @Override
   public void method_37314(CompoundNBT var1) {
      super.method_37314(var1);
      this.method_21509(var1.method_25947("Invul"));
      if (this.method_45507()) {
         this.field_22702.method_43451(this.method_19839());
      }
   }

   @Override
   public void method_37303(ITextComponent var1) {
      super.method_37303(var1);
      this.field_22702.method_43451(this.method_19839());
   }

   @Override
   public class_8461 method_26918() {
      return class_463.field_2481;
   }

   @Override
   public class_8461 method_26541(DamageSource var1) {
      return class_463.field_2017;
   }

   @Override
   public class_8461 method_26599() {
      return class_463.field_2109;
   }

   @Override
   public void method_26606() {
      class_1343 var3 = this.method_37098().method_6210(1.0, 0.6, 1.0);
      if (!this.world.field_33055 && this.method_21508(0) > 0) {
         Entity var4 = this.world.method_29534(this.method_21508(0));
         if (var4 != null) {
            double var5 = var3.field_7333;
            if (this.method_37309() < var4.method_37309() || !this.method_32928() && this.method_37309() < var4.method_37309() + 5.0) {
               var5 = Math.max(0.0, var5);
               var5 += 0.3 - var5 * 0.6F;
            }

            var3 = new class_1343(var3.field_7336, var5, var3.field_7334);
            class_1343 var7 = new class_1343(var4.getPosX() - this.getPosX(), 0.0, var4.getPosZ() - this.getPosZ());
            if (method_37266(var7) > 9.0) {
               class_1343 var8 = var7.method_6213();
               var3 = var3.method_6214(var8.field_7336 * 0.3 - var3.field_7336 * 0.6, 0.0, var8.field_7334 * 0.3 - var3.field_7334 * 0.6);
            }
         }
      }

      this.method_37215(var3);
      if (method_37266(var3) > 0.05) {
         this.rotationYaw = (float)class_9299.method_42821(var3.field_7334, var3.field_7336) * (180.0F / (float)Math.PI) - 90.0F;
      }

      super.method_26606();

      for (int var33 = 0; var33 < 2; var33++) {
         this.field_22690[var33] = this.field_22693[var33];
         this.field_22698[var33] = this.field_22695[var33];
      }

      for (int var34 = 0; var34 < 2; var34++) {
         int var9 = this.method_21508(var34 + 1);
         Entity var10 = null;
         if (var9 > 0) {
            var10 = this.world.method_29534(var9);
         }

         if (var10 == null) {
            this.field_22693[var34] = this.method_21516(this.field_22693[var34], this.field_29605, 10.0F);
         } else {
            double var11 = this.method_21520(var34 + 1);
            double var13 = this.method_21510(var34 + 1);
            double var15 = this.method_21518(var34 + 1);
            double var17 = var10.getPosX() - var11;
            double var19 = var10.method_37388() - var13;
            double var21 = var10.getPosZ() - var15;
            double var23 = (double)class_9299.method_42842(var17 * var17 + var21 * var21);
            float var25 = (float)(class_9299.method_42821(var21, var17) * 180.0F / (float)Math.PI) - 90.0F;
            float var26 = (float)(-(class_9299.method_42821(var19, var23) * 180.0F / (float)Math.PI));
            this.field_22695[var34] = this.method_21516(this.field_22695[var34], var26, 40.0F);
            this.field_22693[var34] = this.method_21516(this.field_22693[var34], var25, 10.0F);
         }
      }

      boolean var35 = this.method_32928();

      for (int var37 = 0; var37 < 3; var37++) {
         double var27 = this.method_21520(var37);
         double var29 = this.method_21510(var37);
         double var31 = this.method_21518(var37);
         this.world
            .method_43361(
               class_3090.field_15376,
               var27 + this.field_41717.nextGaussian() * 0.3F,
               var29 + this.field_41717.nextGaussian() * 0.3F,
               var31 + this.field_41717.nextGaussian() * 0.3F,
               0.0,
               0.0,
               0.0
            );
         if (var35 && this.world.field_33033.nextInt(4) == 0) {
            this.world
               .method_43361(
                  class_3090.field_15353,
                  var27 + this.field_41717.nextGaussian() * 0.3F,
                  var29 + this.field_41717.nextGaussian() * 0.3F,
                  var31 + this.field_41717.nextGaussian() * 0.3F,
                  0.7F,
                  0.7F,
                  0.5
               );
         }
      }

      if (this.method_21507() > 0) {
         for (int var38 = 0; var38 < 3; var38++) {
            this.world
               .method_43361(
                  class_3090.field_15353,
                  this.getPosX() + this.field_41717.nextGaussian(),
                  this.method_37309() + (double)(this.field_41717.nextFloat() * 3.3F),
                  this.getPosZ() + this.field_41717.nextGaussian(),
                  0.7F,
                  0.7F,
                  0.9F
               );
         }
      }
   }

   @Override
   public void method_26919() {
      if (this.method_21507() <= 0) {
         super.method_26919();

         for (int var3 = 1; var3 < 3; var3++) {
            if (this.field_41697 >= this.field_22691[var3 - 1]) {
               this.field_22691[var3 - 1] = this.field_41697 + 10 + this.field_41717.nextInt(10);
               if (this.world.method_43370() == class_423.field_1789 || this.world.method_43370() == class_423.field_1782) {
                  int var4 = var3 - 1;
                  int var5 = this.field_22694[var3 - 1];
                  this.field_22694[var4] = this.field_22694[var3 - 1] + 1;
                  if (var5 > 15) {
                     float var6 = 10.0F;
                     float var7 = 5.0F;
                     double var8 = class_9299.method_42832(this.field_41717, this.getPosX() - 10.0, this.getPosX() + 10.0);
                     double var10 = class_9299.method_42832(this.field_41717, this.method_37309() - 5.0, this.method_37309() + 5.0);
                     double var12 = class_9299.method_42832(this.field_41717, this.getPosZ() - 10.0, this.getPosZ() + 10.0);
                     this.method_21515(var3 + 1, var8, var10, var12, true);
                     this.field_22694[var3 - 1] = 0;
                  }
               }

               int var23 = this.method_21508(var3);
               if (var23 <= 0) {
                  List var27 = this.world
                     .<class_5834>method_25863(class_5834.class, field_22696, this, this.method_37241().method_18899(20.0, 8.0, 20.0));

                  for (int var29 = 0; var29 < 10 && !var27.isEmpty(); var29++) {
                     class_5834 var31 = (class_5834)var27.get(this.field_41717.nextInt(var27.size()));
                     if (var31 != this && var31.method_37330() && this.method_26420(var31)) {
                        if (!(var31 instanceof class_704)) {
                           this.method_21512(var3, var31.method_37145());
                        } else if (!((class_704)var31).playerAbilities.disableDamage) {
                           this.method_21512(var3, var31.method_37145());
                        }
                        break;
                     }

                     var27.remove(var31);
                  }
               } else {
                  Entity var26 = this.world.method_29534(var23);
                  if (var26 == null || !var26.method_37330() || this.method_37275(var26) > 900.0 || !this.method_26420(var26)) {
                     this.method_21512(var3, 0);
                  } else if (var26 instanceof class_704 && ((class_704)var26).playerAbilities.disableDamage) {
                     this.method_21512(var3, 0);
                  } else {
                     this.method_21519(var3 + 1, (class_5834)var26);
                     this.field_22691[var3 - 1] = this.field_41697 + 40 + this.field_41717.nextInt(20);
                     this.field_22694[var3 - 1] = 0;
                  }
               }
            }
         }

         if (this.method_17809() == null) {
            this.method_21512(0, 0);
         } else {
            this.method_21512(0, this.method_17809().method_37145());
         }

         if (this.field_22699 > 0) {
            this.field_22699--;
            if (this.field_22699 == 0 && this.world.method_29537().method_1285(class_291.field_1047)) {
               int var21 = class_9299.method_42847(this.method_37309());
               int var24 = class_9299.method_42847(this.getPosX());
               int var28 = class_9299.method_42847(this.getPosZ());
               boolean var30 = false;

               for (int var32 = -1; var32 <= 1; var32++) {
                  for (int var14 = -1; var14 <= 1; var14++) {
                     for (int var15 = 0; var15 <= 3; var15++) {
                        int var16 = var24 + var32;
                        int var17 = var21 + var15;
                        int var18 = var28 + var14;
                        BlockPos var19 = new BlockPos(var16, var17, var18);
                        class_2522 var20 = this.world.method_28262(var19);
                        if (method_21513(var20)) {
                           var30 = this.world.method_7511(var19, true, this) || var30;
                        }
                     }
                  }
               }

               if (var30) {
                  this.world.method_43365((class_704)null, 1022, this.method_37075(), 0);
               }
            }
         }

         if (this.field_41697 % 20 == 0) {
            this.heal(1.0F);
         }

         this.field_22702.method_43459(this.method_26551() / this.method_26465());
      } else {
         int var22 = this.method_21507() - 1;
         if (var22 <= 0) {
            class_7298 var25 = !this.world.method_29537().method_1285(class_291.field_1047) ? class_7298.field_37310 : class_7298.field_37311;
            this.world.method_29574(this, this.getPosX(), this.method_37388(), this.getPosZ(), 7.0F, false, var25);
            if (!this.method_37378()) {
               this.world.method_29589(1023, this.method_37075(), 0);
            }
         }

         this.method_21509(var22);
         if (this.field_41697 % 10 == 0) {
            this.heal(10.0F);
         }
      }
   }

   public static boolean method_21513(class_2522 var0) {
      return !var0.method_8345() && !class_2351.field_11764.method_10609(var0.method_8360());
   }

   public void method_21517() {
      this.method_21509(220);
      this.method_26456(this.method_26465() / 3.0F);
   }

   @Override
   public void method_37130(class_2522 var1, class_1343 var2) {
   }

   @Override
   public void method_37093(class_9359 var1) {
      super.method_37093(var1);
      this.field_22702.method_2403(var1);
   }

   @Override
   public void method_37212(class_9359 var1) {
      super.method_37212(var1);
      this.field_22702.method_2405(var1);
   }

   private double method_21520(int var1) {
      if (var1 > 0) {
         float var4 = (this.field_29605 + (float)(180 * (var1 - 1))) * (float) (Math.PI / 180.0);
         float var5 = class_9299.method_42840(var4);
         return this.getPosX() + (double)var5 * 1.3;
      } else {
         return this.getPosX();
      }
   }

   private double method_21510(int var1) {
      return var1 > 0 ? this.method_37309() + 2.2 : this.method_37309() + 3.0;
   }

   private double method_21518(int var1) {
      if (var1 > 0) {
         float var4 = (this.field_29605 + (float)(180 * (var1 - 1))) * (float) (Math.PI / 180.0);
         float var5 = class_9299.method_42818(var4);
         return this.getPosZ() + (double)var5 * 1.3;
      } else {
         return this.getPosZ();
      }
   }

   private float method_21516(float var1, float var2, float var3) {
      float var6 = class_9299.method_42810(var2 - var1);
      if (var6 > var3) {
         var6 = var3;
      }

      if (var6 < -var3) {
         var6 = -var3;
      }

      return var1 + var6;
   }

   private void method_21519(int var1, class_5834 var2) {
      this.method_21515(
         var1,
         var2.getPosX(),
         var2.method_37309() + (double)var2.method_37277() * 0.5,
         var2.getPosZ(),
         var1 == 0 && this.field_41717.nextFloat() < 0.001F
      );
   }

   private void method_21515(int var1, double var2, double var4, double var6, boolean var8) {
      if (!this.method_37378()) {
         this.world.method_43365((class_704)null, 1024, this.method_37075(), 0);
      }

      double var11 = this.method_21520(var1);
      double var13 = this.method_21510(var1);
      double var15 = this.method_21518(var1);
      double var17 = var2 - var11;
      double var19 = var4 - var13;
      double var21 = var6 - var15;
      class_1044 var23 = new class_1044(this.world, this, var17, var19, var21);
      var23.method_26159(this);
      if (var8) {
         var23.method_4619(true);
      }

      var23.method_37222(var11, var13, var15);
      this.world.method_7509(var23);
   }

   @Override
   public void method_10805(class_5834 var1, float var2) {
      this.method_21519(0, var1);
   }

   @Override
   public boolean attackEntityFrom(DamageSource var1, float var2) {
      if (this.method_37180(var1)) {
         return false;
      } else if (var1 == DamageSource.field_31671 || var1.method_28372() instanceof class_4653) {
         return false;
      } else if (this.method_21507() > 0 && var1 != DamageSource.field_31685) {
         return false;
      } else {
         if (this.method_32928()) {
            Entity var5 = var1.method_28353();
            if (var5 instanceof class_6749) {
               return false;
            }
         }

         Entity var7 = var1.method_28372();
         if (var7 != null && !(var7 instanceof class_704) && var7 instanceof class_5834 && ((class_5834)var7).method_26550() == this.method_26550()) {
            return false;
         } else {
            if (this.field_22699 <= 0) {
               this.field_22699 = 20;
            }

            for (int var6 = 0; var6 < this.field_22694.length; var6++) {
               this.field_22694[var6] = this.field_22694[var6] + 3;
            }

            return super.attackEntityFrom(var1, var2);
         }
      }
   }

   @Override
   public void method_26614(DamageSource var1, int var2, boolean var3) {
      super.method_26614(var1, var2, var3);
      class_91 var6 = this.method_37312(class_4897.field_24381);
      if (var6 != null) {
         var6.method_244();
      }
   }

   @Override
   public void method_37233() {
      if (this.world.method_43370() == class_423.field_1790 && this.method_26869()) {
         this.method_37204();
      } else {
         this.field_29658 = 0;
      }
   }

   @Override
   public boolean method_37270(float var1, float var2) {
      return false;
   }

   @Override
   public boolean method_26558(class_2250 var1) {
      return false;
   }

   public static class_1313 method_21506() {
      return class_1173.method_5201()
         .method_5984(class_7331.field_37468, 300.0)
         .method_5984(class_7331.field_37465, 0.6F)
         .method_5984(class_7331.field_37471, 40.0)
         .method_5984(class_7331.field_37473, 4.0);
   }

   public float method_21511(int var1) {
      return this.field_22693[var1];
   }

   public float method_21514(int var1) {
      return this.field_22695[var1];
   }

   public int method_21507() {
      return this.field_41735.<Integer>method_36640(field_22689);
   }

   public void method_21509(int var1) {
      this.field_41735.method_36633(field_22689, var1);
   }

   public int method_21508(int var1) {
      return this.field_41735.<Integer>method_36640(field_22701.get(var1));
   }

   public void method_21512(int var1, int var2) {
      this.field_41735.method_36633(field_22701.get(var1), var2);
   }

   @Override
   public boolean method_32928() {
      return this.method_26551() <= this.method_26465() / 2.0F;
   }

   @Override
   public class_2780 method_26550() {
      return class_2780.field_13579;
   }

   @Override
   public boolean method_37158(Entity var1) {
      return false;
   }

   @Override
   public boolean method_37148() {
      return false;
   }

   @Override
   public boolean method_26495(class_2250 var1) {
      return var1.method_10339() != Effects.field_19725 ? super.method_26495(var1) : false;
   }
}
