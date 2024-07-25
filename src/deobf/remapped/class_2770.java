package remapped;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_2770 extends MobEntity implements class_1869 {
   private static final Logger field_13523 = LogManager.getLogger();
   public static final class_7821<Integer> field_13536 = class_8073.<Integer>method_36641(class_2770.class, class_2734.field_13366);
   private static final class_4931 field_13522 = new class_4931().method_22607(64.0);
   public final double[][] field_13541 = new double[64][3];
   public int field_13545 = -1;
   private final class_5708[] field_13533;
   public final class_5708 field_13542;
   private final class_5708 field_13543;
   private final class_5708 field_13532;
   private final class_5708 field_13525;
   private final class_5708 field_13539;
   private final class_5708 field_13527;
   private final class_5708 field_13528;
   private final class_5708 field_13538;
   public float field_13544;
   public float field_13526;
   public boolean field_13530;
   public int field_13537;
   public float field_13546;
   public class_3577 field_13548;
   private final class_2810 field_13524;
   private final class_6455 field_13534;
   private int field_13535 = 100;
   private int field_13531;
   private final class_5851[] field_13521 = new class_5851[24];
   private final int[] field_13540 = new int[24];
   private final class_5424 field_13547 = new class_5424();

   public class_2770(EntityType<? extends class_2770> var1, World var2) {
      super(EntityType.field_34310, var2);
      this.field_13542 = new class_5708(this, "head", 1.0F, 1.0F);
      this.field_13543 = new class_5708(this, "neck", 3.0F, 3.0F);
      this.field_13532 = new class_5708(this, "body", 5.0F, 3.0F);
      this.field_13525 = new class_5708(this, "tail", 2.0F, 2.0F);
      this.field_13539 = new class_5708(this, "tail", 2.0F, 2.0F);
      this.field_13527 = new class_5708(this, "tail", 2.0F, 2.0F);
      this.field_13528 = new class_5708(this, "wing", 4.0F, 2.0F);
      this.field_13538 = new class_5708(this, "wing", 4.0F, 2.0F);
      this.field_13533 = new class_5708[]{
         this.field_13542, this.field_13543, this.field_13532, this.field_13525, this.field_13539, this.field_13527, this.field_13528, this.field_13538
      };
      this.method_26456(this.method_26465());
      this.field_41731 = true;
      this.field_41750 = true;
      if (!(var2 instanceof class_6331)) {
         this.field_13524 = null;
      } else {
         this.field_13524 = ((class_6331)var2).method_28967();
      }

      this.field_13534 = new class_6455(this);
   }

   public static MutableAttribute method_12605() {
      return MobEntity.method_26846().createMutableAttribute(Attributes.MAX_HEALTH, 200.0);
   }

   @Override
   public void method_37329() {
      super.method_37329();
      this.method_37372().method_36634(field_13536, class_8978.field_46000.method_41171());
   }

   public double[] method_12613(int var1, float var2) {
      if (this.method_26450()) {
         var2 = 0.0F;
      }

      var2 = 1.0F - var2;
      int var5 = this.field_13545 - var1 & 63;
      int var6 = this.field_13545 - var1 - 1 & 63;
      double[] var7 = new double[3];
      double var8 = this.field_13541[var5][0];
      double var10 = MathHelper.wrapDegrees(this.field_13541[var6][0] - var8);
      var7[0] = var8 + var10 * (double)var2;
      var8 = this.field_13541[var5][1];
      var10 = this.field_13541[var6][1] - var8;
      var7[1] = var8 + var10 * (double)var2;
      var7[2] = MathHelper.lerp((double)var2, this.field_13541[var5][2], this.field_13541[var6][2]);
      return var7;
   }

   @Override
   public void livingTick() {
      if (this.world.field_33055) {
         this.method_26456(this.method_26551());
         if (!this.method_37378()) {
            float var3 = MathHelper.cos(this.field_13526 * (float) (Math.PI * 2));
            float var4 = MathHelper.cos(this.field_13544 * (float) (Math.PI * 2));
            if (var4 <= -0.3F && var3 >= -0.3F) {
               this.world
                  .method_29527(
                     this.getPosX(),
                     this.method_37309(),
                     this.getPosZ(),
                     SoundEvents.field_2737,
                     this.method_37197(),
                     5.0F,
                     0.8F + this.field_41717.nextFloat() * 0.3F,
                     false
                  );
            }

            if (!this.field_13534.method_29421().method_23472() && --this.field_13535 < 0) {
               this.world
                  .method_29527(
                     this.getPosX(),
                     this.method_37309(),
                     this.getPosZ(),
                     SoundEvents.field_1942,
                     this.method_37197(),
                     2.5F,
                     0.8F + this.field_41717.nextFloat() * 0.3F,
                     false
                  );
               this.field_13535 = 200 + this.field_41717.nextInt(200);
            }
         }
      }

      this.field_13544 = this.field_13526;
      if (!this.method_26450()) {
         this.method_12620();
         class_1343 var42 = this.method_37098();
         float var44 = 0.2F / (MathHelper.sqrt(method_37266(var42)) * 10.0F + 1.0F);
         var44 *= (float)Math.pow(2.0, var42.field_7333);
         if (!this.field_13534.method_29421().method_23472()) {
            if (!this.field_13530) {
               this.field_13526 += var44;
            } else {
               this.field_13526 += var44 * 0.5F;
            }
         } else {
            this.field_13526 += 0.1F;
         }

         this.rotationYaw = MathHelper.wrapDegrees(this.rotationYaw);
         if (!this.isAIDisabled()) {
            if (this.field_13545 < 0) {
               for (int var5 = 0; var5 < this.field_13541.length; var5++) {
                  this.field_13541[var5][0] = (double)this.rotationYaw;
                  this.field_13541[var5][1] = this.method_37309();
               }
            }

            if (++this.field_13545 == this.field_13541.length) {
               this.field_13545 = 0;
            }

            this.field_13541[this.field_13545][0] = (double)this.rotationYaw;
            this.field_13541[this.field_13545][1] = this.method_37309();
            if (!this.world.field_33055) {
               class_5120 var47 = this.field_13534.method_29421();
               var47.method_23473();
               if (this.field_13534.method_29421() != var47) {
                  var47 = this.field_13534.method_29421();
                  var47.method_23473();
               }

               class_1343 var6 = var47.method_23463();
               if (var6 != null) {
                  double var9 = var6.field_7336 - this.getPosX();
                  double var11 = var6.field_7333 - this.method_37309();
                  double var13 = var6.field_7334 - this.getPosZ();
                  double var15 = var9 * var9 + var11 * var11 + var13 * var13;
                  float var17 = var47.method_23470();
                  double var18 = (double) MathHelper.sqrt(var9 * var9 + var13 * var13);
                  if (var18 > 0.0) {
                     var11 = MathHelper.clamp(var11 / var18, (double)(-var17), (double)var17);
                  }

                  this.method_37215(this.method_37098().method_6214(0.0, var11 * 0.01, 0.0));
                  this.rotationYaw = MathHelper.wrapDegrees(this.rotationYaw);
                  double var20 = MathHelper.clamp(
                     MathHelper.wrapDegrees(180.0 - MathHelper.method_42821(var9, var13) * 180.0F / (float)Math.PI - (double)this.rotationYaw), -50.0, 50.0
                  );
                  class_1343 var22 = var6.method_6193(this.getPosX(), this.method_37309(), this.getPosZ()).method_6213();
                  class_1343 var23 = new class_1343(
                        (double) MathHelper.sin(this.rotationYaw * (float) (Math.PI / 180.0)),
                        this.method_37098().field_7333,
                        (double)(-MathHelper.cos(this.rotationYaw * (float) (Math.PI / 180.0)))
                     )
                     .method_6213();
                  float var24 = Math.max(((float)var23.method_6206(var22) + 0.5F) / 1.5F, 0.0F);
                  this.field_13546 *= 0.8F;
                  this.field_13546 = (float)((double)this.field_13546 + var20 * (double)var47.method_23465());
                  this.rotationYaw = this.rotationYaw + this.field_13546 * 0.1F;
                  float var25 = (float)(2.0 / (var15 + 1.0));
                  float var26 = 0.06F;
                  this.method_37092(0.06F * (var24 * var25 + (1.0F - var25)), new class_1343(0.0, 0.0, -1.0));
                  if (!this.field_13530) {
                     this.method_37226(class_7412.field_37839, this.method_37098());
                  } else {
                     this.method_37226(class_7412.field_37839, this.method_37098().method_6209(0.8F));
                  }

                  class_1343 var27 = this.method_37098().method_6213();
                  double var28 = 0.8 + 0.15 * (var27.method_6206(var23) + 1.0) / 2.0;
                  this.method_37215(this.method_37098().method_6210(var28, 0.91F, var28));
               }
            } else {
               if (this.field_29612 > 0) {
                  double var7 = this.getPosX() + (this.field_29597 - this.getPosX()) / (double)this.field_29612;
                  double var52 = this.method_37309() + (this.field_29609 - this.method_37309()) / (double)this.field_29612;
                  double var53 = this.getPosZ() + (this.field_29650 - this.getPosZ()) / (double)this.field_29612;
                  double var54 = MathHelper.wrapDegrees(this.field_29604 - (double)this.rotationYaw);
                  this.rotationYaw = (float)((double)this.rotationYaw + var54 / (double)this.field_29612);
                  this.rotationPitch = (float)((double)this.rotationPitch + (this.field_29625 - (double)this.rotationPitch) / (double)this.field_29612);
                  this.field_29612--;
                  this.method_37256(var7, var52, var53);
                  this.method_37395(this.rotationYaw, this.rotationPitch);
               }

               this.field_13534.method_29421().method_23466();
            }

            this.field_29605 = this.rotationYaw;
            class_1343[] var48 = new class_1343[this.field_13533.length];

            for (int var50 = 0; var50 < this.field_13533.length; var50++) {
               var48[var50] = new class_1343(
                  this.field_13533[var50].getPosX(), this.field_13533[var50].method_37309(), this.field_13533[var50].getPosZ()
               );
            }

            float var51 = (float)(this.method_12613(5, 1.0F)[1] - this.method_12613(10, 1.0F)[1]) * 10.0F * (float) (Math.PI / 180.0);
            float var30 = MathHelper.cos(var51);
            float var31 = MathHelper.sin(var51);
            float var32 = this.rotationYaw * (float) (Math.PI / 180.0);
            float var33 = MathHelper.sin(var32);
            float var34 = MathHelper.cos(var32);
            this.method_12618(this.field_13532, (double)(var33 * 0.5F), 0.0, (double)(-var34 * 0.5F));
            this.method_12618(this.field_13528, (double)(var34 * 4.5F), 2.0, (double)(var33 * 4.5F));
            this.method_12618(this.field_13538, (double)(var34 * -4.5F), 2.0, (double)(var33 * -4.5F));
            if (!this.world.field_33055 && this.field_29645 == 0) {
               this.method_12619(
                  this.world
                     .method_25867(this, this.field_13528.getBoundingBox().method_18899(4.0, 2.0, 4.0).method_18918(0.0, -2.0, 0.0), class_3572.field_17479)
               );
               this.method_12619(
                  this.world
                     .method_25867(this, this.field_13538.getBoundingBox().method_18899(4.0, 2.0, 4.0).method_18918(0.0, -2.0, 0.0), class_3572.field_17479)
               );
               this.method_12624(this.world.method_25867(this, this.field_13542.getBoundingBox().grow(1.0), class_3572.field_17479));
               this.method_12624(this.world.method_25867(this, this.field_13543.getBoundingBox().grow(1.0), class_3572.field_17479));
            }

            float var35 = MathHelper.sin(this.rotationYaw * (float) (Math.PI / 180.0) - this.field_13546 * 0.01F);
            float var36 = MathHelper.cos(this.rotationYaw * (float) (Math.PI / 180.0) - this.field_13546 * 0.01F);
            float var37 = this.method_12607();
            this.method_12618(this.field_13542, (double)(var35 * 6.5F * var30), (double)(var37 + var31 * 6.5F), (double)(-var36 * 6.5F * var30));
            this.method_12618(this.field_13543, (double)(var35 * 5.5F * var30), (double)(var37 + var31 * 5.5F), (double)(-var36 * 5.5F * var30));
            double[] var55 = this.method_12613(5, 1.0F);

            for (int var38 = 0; var38 < 3; var38++) {
               class_5708 var39 = null;
               if (var38 == 0) {
                  var39 = this.field_13525;
               }

               if (var38 == 1) {
                  var39 = this.field_13539;
               }

               if (var38 == 2) {
                  var39 = this.field_13527;
               }

               double[] var40 = this.method_12613(12 + var38 * 2, 1.0F);
               float var41 = this.rotationYaw * (float) (Math.PI / 180.0) + this.method_12626(var40[0] - var55[0]) * (float) (Math.PI / 180.0);
               float var56 = MathHelper.sin(var41);
               float var57 = MathHelper.cos(var41);
               float var58 = 1.5F;
               float var59 = (float)(var38 + 1) * 2.0F;
               this.method_12618(
                  var39,
                  (double)(-(var33 * 1.5F + var56 * var59) * var30),
                  var40[1] - var55[1] - (double)((var59 + 1.5F) * var31) + 1.5,
                  (double)((var34 * 1.5F + var57 * var59) * var30)
               );
            }

            if (!this.world.field_33055) {
               this.field_13530 = this.method_12608(this.field_13542.getBoundingBox())
                  | this.method_12608(this.field_13543.getBoundingBox())
                  | this.method_12608(this.field_13532.getBoundingBox());
               if (this.field_13524 != null) {
                  this.field_13524.method_12783(this);
               }
            }

            for (int var60 = 0; var60 < this.field_13533.length; var60++) {
               this.field_13533[var60].field_41767 = var48[var60].field_7336;
               this.field_13533[var60].field_41698 = var48[var60].field_7333;
               this.field_13533[var60].field_41725 = var48[var60].field_7334;
               this.field_13533[var60].field_41754 = var48[var60].field_7336;
               this.field_13533[var60].field_41713 = var48[var60].field_7333;
               this.field_13533[var60].field_41724 = var48[var60].field_7334;
            }
         } else {
            this.field_13526 = 0.5F;
         }
      } else {
         float var43 = (this.field_41717.nextFloat() - 0.5F) * 8.0F;
         float var46 = (this.field_41717.nextFloat() - 0.5F) * 4.0F;
         float var49 = (this.field_41717.nextFloat() - 0.5F) * 8.0F;
         this.world
            .method_43361(
               class_3090.field_15339,
               this.getPosX() + (double)var43,
               this.method_37309() + 2.0 + (double)var46,
               this.getPosZ() + (double)var49,
               0.0,
               0.0,
               0.0
            );
      }
   }

   private void method_12618(class_5708 var1, double var2, double var4, double var6) {
      var1.method_37256(this.getPosX() + var2, this.method_37309() + var4, this.getPosZ() + var6);
   }

   private float method_12607() {
      if (!this.field_13534.method_29421().method_23472()) {
         double[] var3 = this.method_12613(5, 1.0F);
         double[] var4 = this.method_12613(0, 1.0F);
         return (float)(var3[1] - var4[1]);
      } else {
         return -1.0F;
      }
   }

   private void method_12620() {
      if (this.field_13548 != null) {
         if (!this.field_13548.field_41751) {
            if (this.field_41697 % 10 == 0 && this.method_26551() < this.method_26465()) {
               this.method_26456(this.method_26551() + 1.0F);
            }
         } else {
            this.field_13548 = null;
         }
      }

      if (this.field_41717.nextInt(10) == 0) {
         List var3 = this.world.<class_3577>method_25868(class_3577.class, this.getBoundingBox().grow(32.0));
         class_3577 var4 = null;
         double var5 = Double.MAX_VALUE;

         for (class_3577 var8 : var3) {
            double var9 = var8.method_37275(this);
            if (var9 < var5) {
               var5 = var9;
               var4 = var8;
            }
         }

         this.field_13548 = var4;
      }
   }

   private void method_12619(List<Entity> var1) {
      double var4 = (this.field_13532.getBoundingBox().field_19941 + this.field_13532.getBoundingBox().field_19940) / 2.0;
      double var6 = (this.field_13532.getBoundingBox().field_19938 + this.field_13532.getBoundingBox().field_19942) / 2.0;

      for (Entity var9 : var1) {
         if (var9 instanceof LivingEntity) {
            double var10 = var9.getPosX() - var4;
            double var12 = var9.getPosZ() - var6;
            double var14 = Math.max(var10 * var10 + var12 * var12, 0.1);
            var9.method_37186(var10 / var14 * 4.0, 0.2F, var12 / var14 * 4.0);
            if (!this.field_13534.method_29421().method_23472() && ((LivingEntity)var9).method_26577() < var9.field_41697 - 2) {
               var9.attackEntityFrom(DamageSource.method_28345(this), 5.0F);
               this.method_37096(this, var9);
            }
         }
      }
   }

   private void method_12624(List<Entity> var1) {
      for (Entity var5 : var1) {
         if (var5 instanceof LivingEntity) {
            var5.attackEntityFrom(DamageSource.method_28345(this), 10.0F);
            this.method_37096(this, var5);
         }
      }
   }

   private float method_12626(double var1) {
      return (float) MathHelper.wrapDegrees(var1);
   }

   private boolean method_12608(Box var1) {
      int var4 = MathHelper.floor(var1.field_19941);
      int var5 = MathHelper.floor(var1.field_19937);
      int var6 = MathHelper.floor(var1.field_19938);
      int var7 = MathHelper.floor(var1.field_19940);
      int var8 = MathHelper.floor(var1.field_19939);
      int var9 = MathHelper.floor(var1.field_19942);
      boolean var10 = false;
      boolean var11 = false;

      for (int var12 = var4; var12 <= var7; var12++) {
         for (int var13 = var5; var13 <= var8; var13++) {
            for (int var14 = var6; var14 <= var9; var14++) {
               BlockPos var15 = new BlockPos(var12, var13, var14);
               class_2522 var16 = this.world.method_28262(var15);
               class_6414 var17 = var16.method_8360();
               if (!var16.method_8345() && var16.method_8362() != class_5371.field_27434) {
                  if (this.world.getGameRules().getBoolean(GameRules.field_1047) && !class_2351.field_11754.method_10609(var17)) {
                     var11 = this.world.method_7508(var15, false) || var11;
                  } else {
                     var10 = true;
                  }
               }
            }
         }
      }

      if (var11) {
         BlockPos var18 = new BlockPos(
            var4 + this.field_41717.nextInt(var7 - var4 + 1),
            var5 + this.field_41717.nextInt(var8 - var5 + 1),
            var6 + this.field_41717.nextInt(var9 - var6 + 1)
         );
         this.world.method_43364(2008, var18, 0);
      }

      return var10;
   }

   public boolean method_12621(class_5708 var1, DamageSource var2, float var3) {
      if (this.field_13534.method_29421().method_23464() == class_8978.field_46005) {
         return false;
      } else {
         var3 = this.field_13534.method_29421().method_23467(var2, var3);
         if (var1 != this.field_13542) {
            var3 = var3 / 4.0F + Math.min(var3, 1.0F);
         }

         if (var3 < 0.01F) {
            return false;
         } else {
            if (var2.method_28372() instanceof PlayerEntity || var2.method_28367()) {
               float var6 = this.method_26551();
               this.method_12623(var2, var3);
               if (this.method_26450() && !this.field_13534.method_29421().method_23472()) {
                  this.method_26456(1.0F);
                  this.field_13534.method_29422(class_8978.field_46005);
               }

               if (this.field_13534.method_29421().method_23472()) {
                  this.field_13531 = (int)((float)this.field_13531 + (var6 - this.method_26551()));
                  if ((float)this.field_13531 > 0.25F * this.method_26465()) {
                     this.field_13531 = 0;
                     this.field_13534.method_29422(class_8978.field_46003);
                  }
               }
            }

            return true;
         }
      }
   }

   @Override
   public boolean attackEntityFrom(DamageSource var1, float var2) {
      if (var1 instanceof class_5405 && ((class_5405)var1).method_24600()) {
         this.method_12621(this.field_13532, var1, var2);
      }

      return false;
   }

   public boolean method_12623(DamageSource var1, float var2) {
      return super.attackEntityFrom(var1, var2);
   }

   @Override
   public void method_37250() {
      this.method_37204();
      if (this.field_13524 != null) {
         this.field_13524.method_12783(this);
         this.field_13524.method_12779(this);
      }
   }

   @Override
   public void method_26526() {
      if (this.field_13524 != null) {
         this.field_13524.method_12783(this);
      }

      this.field_13537++;
      if (this.field_13537 >= 180 && this.field_13537 <= 200) {
         float var3 = (this.field_41717.nextFloat() - 0.5F) * 8.0F;
         float var4 = (this.field_41717.nextFloat() - 0.5F) * 4.0F;
         float var5 = (this.field_41717.nextFloat() - 0.5F) * 8.0F;
         this.world
            .method_43361(
               class_3090.field_15377,
               this.getPosX() + (double)var3,
               this.method_37309() + 2.0 + (double)var4,
               this.getPosZ() + (double)var5,
               0.0,
               0.0,
               0.0
            );
      }

      boolean var6 = this.world.getGameRules().getBoolean(GameRules.field_1033);
      short var7 = 500;
      if (this.field_13524 != null && !this.field_13524.method_12777()) {
         var7 = 12000;
      }

      if (!this.world.field_33055) {
         if (this.field_13537 > 150 && this.field_13537 % 5 == 0 && var6) {
            this.method_12625(MathHelper.floor((float)var7 * 0.08F));
         }

         if (this.field_13537 == 1 && !this.method_37378()) {
            this.world.method_29589(1028, this.method_37075(), 0);
         }
      }

      this.method_37226(class_7412.field_37839, new class_1343(0.0, 0.1F, 0.0));
      this.rotationYaw += 20.0F;
      this.field_29605 = this.rotationYaw;
      if (this.field_13537 == 200 && !this.world.field_33055) {
         if (var6) {
            this.method_12625(MathHelper.floor((float)var7 * 0.2F));
         }

         if (this.field_13524 != null) {
            this.field_13524.method_12779(this);
         }

         this.method_37204();
      }
   }

   private void method_12625(int var1) {
      while (var1 > 0) {
         int var4 = class_5614.method_25476(var1);
         var1 -= var4;
         this.world.method_7509(new class_5614(this.world, this.getPosX(), this.method_37309(), this.getPosZ(), var4));
      }
   }

   public int method_12606() {
      if (this.field_13521[0] == null) {
         for (int var3 = 0; var3 < 24; var3++) {
            byte var4 = 5;
            int var6;
            int var7;
            if (var3 >= 12) {
               if (var3 >= 20) {
                  int var5 = var3 - 20;
                  var6 = MathHelper.floor(20.0F * MathHelper.cos(2.0F * ((float) -Math.PI + (float) (Math.PI / 4) * (float)var5)));
                  var7 = MathHelper.floor(20.0F * MathHelper.sin(2.0F * ((float) -Math.PI + (float) (Math.PI / 4) * (float)var5)));
               } else {
                  int var8 = var3 - 12;
                  var6 = MathHelper.floor(40.0F * MathHelper.cos(2.0F * ((float) -Math.PI + (float) (Math.PI / 8) * (float)var8)));
                  var7 = MathHelper.floor(40.0F * MathHelper.sin(2.0F * ((float) -Math.PI + (float) (Math.PI / 8) * (float)var8)));
                  var4 += 10;
               }
            } else {
               var6 = MathHelper.floor(60.0F * MathHelper.cos(2.0F * ((float) -Math.PI + (float) (Math.PI / 12) * (float)var3)));
               var7 = MathHelper.floor(60.0F * MathHelper.sin(2.0F * ((float) -Math.PI + (float) (Math.PI / 12) * (float)var3)));
            }

            int var9 = Math.max(
               this.world.method_22552() + 10, this.world.method_22563(class_3801.field_18590, new BlockPos(var6, 0, var7)).method_12165() + var4
            );
            this.field_13521[var3] = new class_5851(var6, var9, var7);
         }

         this.field_13540[0] = 6146;
         this.field_13540[1] = 8197;
         this.field_13540[2] = 8202;
         this.field_13540[3] = 16404;
         this.field_13540[4] = 32808;
         this.field_13540[5] = 32848;
         this.field_13540[6] = 65696;
         this.field_13540[7] = 131392;
         this.field_13540[8] = 131712;
         this.field_13540[9] = 263424;
         this.field_13540[10] = 526848;
         this.field_13540[11] = 525313;
         this.field_13540[12] = 1581057;
         this.field_13540[13] = 3166214;
         this.field_13540[14] = 2138120;
         this.field_13540[15] = 6373424;
         this.field_13540[16] = 4358208;
         this.field_13540[17] = 12910976;
         this.field_13540[18] = 9044480;
         this.field_13540[19] = 9706496;
         this.field_13540[20] = 15216640;
         this.field_13540[21] = 13688832;
         this.field_13540[22] = 11763712;
         this.field_13540[23] = 8257536;
      }

      return this.method_12614(this.getPosX(), this.method_37309(), this.getPosZ());
   }

   public int method_12614(double var1, double var3, double var5) {
      float var9 = 10000.0F;
      int var10 = 0;
      class_5851 var11 = new class_5851(MathHelper.floor(var1), MathHelper.floor(var3), MathHelper.floor(var5));
      byte var12 = 0;
      if (this.field_13524 == null || this.field_13524.method_12784() == 0) {
         var12 = 12;
      }

      for (int var13 = var12; var13 < 24; var13++) {
         if (this.field_13521[var13] != null) {
            float var14 = this.field_13521[var13].method_26687(var11);
            if (var14 < var9) {
               var9 = var14;
               var10 = var13;
            }
         }
      }

      return var10;
   }

   @Nullable
   public class_3998 method_12612(int var1, int var2, class_5851 var3) {
      for (int var6 = 0; var6 < 24; var6++) {
         class_5851 var7 = this.field_13521[var6];
         var7.field_29726 = false;
         var7.field_29732 = 0.0F;
         var7.field_29734 = 0.0F;
         var7.field_29727 = 0.0F;
         var7.field_29739 = null;
         var7.field_29737 = -1;
      }

      class_5851 var15 = this.field_13521[var1];
      class_5851 var16 = this.field_13521[var2];
      var15.field_29734 = 0.0F;
      var15.field_29727 = var15.method_26688(var16);
      var15.field_29732 = var15.field_29727;
      this.field_13547.method_24664();
      this.field_13547.method_24666(var15);
      class_5851 var8 = var15;
      byte var9 = 0;
      if (this.field_13524 == null || this.field_13524.method_12784() == 0) {
         var9 = 12;
      }

      while (!this.field_13547.method_24663()) {
         class_5851 var10 = this.field_13547.method_24667();
         if (var10.equals(var16)) {
            if (var3 != null) {
               var3.field_29739 = var16;
               var16 = var3;
            }

            return this.method_12610(var15, var16);
         }

         if (var10.method_26688(var16) < var8.method_26688(var16)) {
            var8 = var10;
         }

         var10.field_29726 = true;
         int var11 = 0;

         for (int var12 = 0; var12 < 24; var12++) {
            if (this.field_13521[var12] == var10) {
               var11 = var12;
               break;
            }
         }

         for (int var17 = var9; var17 < 24; var17++) {
            if ((this.field_13540[var11] & 1 << var17) > 0) {
               class_5851 var13 = this.field_13521[var17];
               if (!var13.field_29726) {
                  float var14 = var10.field_29734 + var10.method_26688(var13);
                  if (!var13.method_26690() || var14 < var13.field_29734) {
                     var13.field_29739 = var10;
                     var13.field_29734 = var14;
                     var13.field_29727 = var13.method_26688(var16);
                     if (!var13.method_26690()) {
                        var13.field_29732 = var13.field_29734 + var13.field_29727;
                        this.field_13547.method_24666(var13);
                     } else {
                        this.field_13547.method_24668(var13, var13.field_29734 + var13.field_29727);
                     }
                  }
               }
            }
         }
      }

      if (var8 != var15) {
         field_13523.debug("Failed to find path from {} to {}", var1, var2);
         if (var3 != null) {
            var3.field_29739 = var8;
            var8 = var3;
         }

         return this.method_12610(var15, var8);
      } else {
         return null;
      }
   }

   private class_3998 method_12610(class_5851 var1, class_5851 var2) {
      ArrayList var5 = Lists.newArrayList();
      class_5851 var6 = var2;
      var5.add(0, var2);

      while (var6.field_29739 != null) {
         var6 = var6.field_29739;
         var5.add(0, var6);
      }

      return new class_3998(var5, new BlockPos(var2.field_29731, var2.field_29735, var2.field_29736), true);
   }

   @Override
   public void writeAdditional(CompoundNBT var1) {
      super.writeAdditional(var1);
      var1.putInt("DragonPhase", this.field_13534.method_29421().method_23464().method_41171());
   }

   @Override
   public void readAdditional(CompoundNBT var1) {
      super.readAdditional(var1);
      if (var1.method_25938("DragonPhase")) {
         this.field_13534.method_29422(class_8978.method_41168(var1.method_25947("DragonPhase")));
      }
   }

   @Override
   public void method_37233() {
   }

   public class_5708[] method_12615() {
      return this.field_13533;
   }

   @Override
   public boolean method_37167() {
      return false;
   }

   @Override
   public class_562 method_37197() {
      return class_562.field_3332;
   }

   @Override
   public SoundEvent method_26918() {
      return SoundEvents.field_2158;
   }

   @Override
   public SoundEvent method_26541(DamageSource var1) {
      return SoundEvents.field_2603;
   }

   @Override
   public float method_26439() {
      return 5.0F;
   }

   public float method_12616(int var1, double[] var2, double[] var3) {
      class_5120 var6 = this.field_13534.method_29421();
      class_8978 var7 = var6.method_23464();
      double var10;
      if (var7 == class_8978.field_45995 || var7 == class_8978.field_46003) {
         BlockPos var8 = this.world.method_22563(class_3801.field_18590, class_8870.field_45348);
         float var9 = Math.max(MathHelper.sqrt(var8.method_12179(this.method_37245(), true)) / 4.0F, 1.0F);
         var10 = (double)((float)var1 / var9);
      } else if (!var6.method_23472()) {
         if (var1 != 6) {
            var10 = var3[1] - var2[1];
         } else {
            var10 = 0.0;
         }
      } else {
         var10 = (double)var1;
      }

      return (float)var10;
   }

   public class_1343 method_12609(float var1) {
      class_5120 var4 = this.field_13534.method_29421();
      class_8978 var5 = var4.method_23464();
      class_1343 var11;
      if (var5 == class_8978.field_45995 || var5 == class_8978.field_46003) {
         BlockPos var12 = this.world.method_22563(class_3801.field_18590, class_8870.field_45348);
         float var13 = Math.max(MathHelper.sqrt(var12.method_12179(this.method_37245(), true)) / 4.0F, 1.0F);
         float var8 = 6.0F / var13;
         float var9 = this.rotationPitch;
         float var10 = 1.5F;
         this.rotationPitch = -var8 * 1.5F * 5.0F;
         var11 = this.method_37307(var1);
         this.rotationPitch = var9;
      } else if (!var4.method_23472()) {
         var11 = this.method_37307(var1);
      } else {
         float var6 = this.rotationPitch;
         float var7 = 1.5F;
         this.rotationPitch = -45.0F;
         var11 = this.method_37307(var1);
         this.rotationPitch = var6;
      }

      return var11;
   }

   public void method_12617(class_3577 var1, BlockPos var2, DamageSource var3) {
      PlayerEntity var6;
      if (!(var3.method_28372() instanceof PlayerEntity)) {
         var6 = this.world.method_25858(field_13522, (double)var2.getX(), (double)var2.method_12165(), (double)var2.method_12185());
      } else {
         var6 = (PlayerEntity)var3.method_28372();
      }

      if (var1 == this.field_13548) {
         this.method_12621(this.field_13542, DamageSource.method_28351(var6), 10.0F);
      }

      this.field_13534.method_29421().method_23468(var1, var2, var3, var6);
   }

   @Override
   public void method_37191(class_7821<?> var1) {
      if (field_13536.equals(var1) && this.world.field_33055) {
         this.field_13534.method_29422(class_8978.method_41168(this.method_37372().<Integer>method_36640(field_13536)));
      }

      super.method_37191(var1);
   }

   public class_6455 method_12611() {
      return this.field_13534;
   }

   @Nullable
   public class_2810 method_12622() {
      return this.field_13524;
   }

   @Override
   public boolean method_26558(class_2250 var1) {
      return false;
   }

   @Override
   public boolean method_37158(Entity var1) {
      return false;
   }

   @Override
   public boolean method_37148() {
      return false;
   }
}
