package remapped;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.UUID;

public class class_9552 extends class_5783 {
   private Entity field_48601;
   private Direction field_48599;
   private int field_48600;
   private double field_48604;
   private double field_48598;
   private double field_48597;
   private UUID field_48603;

   public class_9552(EntityType<? extends class_9552> var1, World var2) {
      super(var1, var2);
      this.field_41731 = true;
   }

   public class_9552(World var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      this(EntityType.field_34271, var1);
      this.method_37144(var2, var4, var6, this.rotationYaw, this.rotationPitch);
      this.method_37214(var8, var10, var12);
   }

   public class_9552(World var1, class_5834 var2, Entity var3, class_9249 var4) {
      this(EntityType.field_34271, var1);
      this.method_26159(var2);
      BlockPos var7 = var2.method_37075();
      double var8 = (double)var7.method_12173() + 0.5;
      double var10 = (double)var7.method_12165() + 0.5;
      double var12 = (double)var7.method_12185() + 0.5;
      this.method_37144(var8, var10, var12, this.rotationYaw, this.rotationPitch);
      this.field_48601 = var3;
      this.field_48599 = Direction.field_817;
      this.method_44070(var4);
   }

   @Override
   public class_562 method_37197() {
      return class_562.field_3332;
   }

   @Override
   public void method_37376(CompoundNBT var1) {
      super.method_37376(var1);
      if (this.field_48601 != null) {
         var1.method_25964("Target", this.field_48601.method_37328());
      }

      if (this.field_48599 != null) {
         var1.method_25931("Dir", this.field_48599.method_1050());
      }

      var1.method_25931("Steps", this.field_48600);
      var1.method_25923("TXD", this.field_48604);
      var1.method_25923("TYD", this.field_48598);
      var1.method_25923("TZD", this.field_48597);
   }

   @Override
   public void method_37314(CompoundNBT var1) {
      super.method_37314(var1);
      this.field_48600 = var1.method_25947("Steps");
      this.field_48604 = var1.method_25932("TXD");
      this.field_48598 = var1.method_25932("TYD");
      this.field_48597 = var1.method_25932("TZD");
      if (var1.contains("Dir", 99)) {
         this.field_48599 = Direction.method_1033(var1.method_25947("Dir"));
      }

      if (var1.method_25954("Target")) {
         this.field_48603 = var1.method_25926("Target");
      }
   }

   @Override
   public void method_37329() {
   }

   private void method_44069(Direction var1) {
      this.field_48599 = var1;
   }

   private void method_44070(class_9249 var1) {
      double var4 = 0.5;
      BlockPos var6;
      if (this.field_48601 != null) {
         var4 = (double)this.field_48601.method_37074() * 0.5;
         var6 = new BlockPos(this.field_48601.getPosX(), this.field_48601.method_37309() + var4, this.field_48601.getPosZ());
      } else {
         var6 = this.method_37075().method_6100();
      }

      double var7 = (double)var6.method_12173() + 0.5;
      double var9 = (double)var6.method_12165() + var4;
      double var11 = (double)var6.method_12185() + 0.5;
      Direction var13 = null;
      if (!var6.method_12170(this.method_37245(), 2.0)) {
         BlockPos var22 = this.method_37075();
         ArrayList var23 = Lists.newArrayList();
         if (var1 != class_9249.field_47215) {
            if (var22.method_12173() < var6.method_12173() && this.world.method_22548(var22.method_6090())) {
               var23.add(Direction.field_804);
            } else if (var22.method_12173() > var6.method_12173() && this.world.method_22548(var22.method_6108())) {
               var23.add(Direction.field_809);
            }
         }

         if (var1 != class_9249.field_47216) {
            if (var22.method_12165() < var6.method_12165() && this.world.method_22548(var22.method_6081())) {
               var23.add(Direction.field_817);
            } else if (var22.method_12165() > var6.method_12165() && this.world.method_22548(var22.method_6100())) {
               var23.add(Direction.field_802);
            }
         }

         if (var1 != class_9249.field_47219) {
            if (var22.method_12185() < var6.method_12185() && this.world.method_22548(var22.method_6073())) {
               var23.add(Direction.field_800);
            } else if (var22.method_12185() > var6.method_12185() && this.world.method_22548(var22.method_6094())) {
               var23.add(Direction.field_818);
            }
         }

         var13 = Direction.method_1039(this.field_41717);
         if (!var23.isEmpty()) {
            var13 = (Direction)var23.get(this.field_41717.nextInt(var23.size()));
         } else {
            for (int var24 = 5; !this.world.method_22548(var22.method_6098(var13)) && var24 > 0; var24--) {
               var13 = Direction.method_1039(this.field_41717);
            }
         }

         var7 = this.getPosX() + (double)var13.method_1041();
         var9 = this.method_37309() + (double)var13.method_1054();
         var11 = this.getPosZ() + (double)var13.method_1034();
      }

      this.method_44069(var13);
      double var14 = var7 - this.getPosX();
      double var16 = var9 - this.method_37309();
      double var18 = var11 - this.getPosZ();
      double var20 = (double)class_9299.method_42842(var14 * var14 + var16 * var16 + var18 * var18);
      if (var20 != 0.0) {
         this.field_48604 = var14 / var20 * 0.15;
         this.field_48598 = var16 / var20 * 0.15;
         this.field_48597 = var18 / var20 * 0.15;
      } else {
         this.field_48604 = 0.0;
         this.field_48598 = 0.0;
         this.field_48597 = 0.0;
      }

      this.field_41763 = true;
      this.field_48600 = 10 + this.field_41717.nextInt(5) * 10;
   }

   @Override
   public void method_37233() {
      if (this.world.method_43370() == class_423.field_1790) {
         this.method_37204();
      }
   }

   @Override
   public void method_37123() {
      super.method_37123();
      if (!this.world.field_33055) {
         if (this.field_48601 == null && this.field_48603 != null) {
            this.field_48601 = ((class_6331)this.world).method_28925(this.field_48603);
            if (this.field_48601 == null) {
               this.field_48603 = null;
            }
         }

         if (this.field_48601 == null
            || !this.field_48601.method_37330()
            || this.field_48601 instanceof class_704 && ((class_704)this.field_48601).method_37221()) {
            if (!this.method_37078()) {
               this.method_37215(this.method_37098().method_6214(0.0, -0.04, 0.0));
            }
         } else {
            this.field_48604 = class_9299.method_42827(this.field_48604 * 1.025, -1.0, 1.0);
            this.field_48598 = class_9299.method_42827(this.field_48598 * 1.025, -1.0, 1.0);
            this.field_48597 = class_9299.method_42827(this.field_48597 * 1.025, -1.0, 1.0);
            class_1343 var3 = this.method_37098();
            this.method_37215(
               var3.method_6214(
                  (this.field_48604 - var3.field_7336) * 0.2, (this.field_48598 - var3.field_7333) * 0.2, (this.field_48597 - var3.field_7334) * 0.2
               )
            );
         }

         class_7474 var7 = class_8462.method_38935(this, this::method_26164);
         if (var7.method_33990() != class_1430.field_7721) {
            this.method_26160(var7);
         }
      }

      this.method_37097();
      class_1343 var8 = this.method_37098();
      this.method_37256(this.getPosX() + var8.field_7336, this.method_37309() + var8.field_7333, this.getPosZ() + var8.field_7334);
      class_8462.method_38933(this, 0.5F);
      if (!this.world.field_33055) {
         if (this.field_48601 != null && !this.field_48601.field_41751) {
            if (this.field_48600 > 0) {
               this.field_48600--;
               if (this.field_48600 == 0) {
                  this.method_44070(this.field_48599 != null ? this.field_48599.method_1029() : null);
               }
            }

            if (this.field_48599 != null) {
               BlockPos var4 = this.method_37075();
               class_9249 var5 = this.field_48599.method_1029();
               if (!this.world.method_29518(var4.method_6098(this.field_48599), this)) {
                  BlockPos var6 = this.field_48601.method_37075();
                  if (var5 == class_9249.field_47215 && var4.method_12173() == var6.method_12173()
                     || var5 == class_9249.field_47219 && var4.method_12185() == var6.method_12185()
                     || var5 == class_9249.field_47216 && var4.method_12165() == var6.method_12165()) {
                     this.method_44070(var5);
                  }
               } else {
                  this.method_44070(var5);
               }
            }
         }
      } else {
         this.world
            .method_43361(
               class_3090.field_15332,
               this.getPosX() - var8.field_7336,
               this.method_37309() - var8.field_7333 + 0.15,
               this.getPosZ() - var8.field_7334,
               0.0,
               0.0,
               0.0
            );
      }
   }

   @Override
   public boolean method_26164(Entity var1) {
      return super.method_26164(var1) && !var1.field_41731;
   }

   @Override
   public boolean method_37264() {
      return false;
   }

   @Override
   public boolean method_37176(double var1) {
      return var1 < 16384.0;
   }

   @Override
   public float method_37193() {
      return 1.0F;
   }

   @Override
   public void method_26163(class_5631 var1) {
      super.method_26163(var1);
      Entity var4 = var1.method_25524();
      Entity var5 = this.method_26166();
      class_5834 var6 = !(var5 instanceof class_5834) ? null : (class_5834)var5;
      boolean var7 = var4.attackEntityFrom(DamageSource.method_28358(this, var6).method_28359(), 4.0F);
      if (var7) {
         this.method_37096(var6, var4);
         if (var4 instanceof class_5834) {
            ((class_5834)var4).method_26558(new class_2250(Effects.LevitationEffect, 200));
         }
      }
   }

   @Override
   public void method_26165(class_9529 var1) {
      super.method_26165(var1);
      ((class_6331)this.world).method_28957(class_3090.field_15339, this.getPosX(), this.method_37309(), this.getPosZ(), 2, 0.2, 0.2, 0.2, 0.0);
      this.method_37155(class_463.field_2709, 1.0F, 1.0F);
   }

   @Override
   public void method_26160(class_7474 var1) {
      super.method_26160(var1);
      this.method_37204();
   }

   @Override
   public boolean method_37167() {
      return true;
   }

   @Override
   public boolean attackEntityFrom(DamageSource var1, float var2) {
      if (!this.world.field_33055) {
         this.method_37155(class_463.field_2348, 1.0F, 1.0F);
         ((class_6331)this.world)
            .method_28957(class_3090.field_15322, this.getPosX(), this.method_37309(), this.getPosZ(), 15, 0.2, 0.2, 0.2, 0.0);
         this.method_37204();
      }

      return true;
   }

   @Override
   public Packet<?> method_37142() {
      return new class_6589(this);
   }
}
