package remapped;

import java.util.function.Predicate;
import org.apache.commons.lang3.Validate;

public abstract class class_4641 extends Entity {
   public static final Predicate<Entity> field_22662 = var0 -> var0 instanceof class_4641;
   private int field_22664;
   public BlockPos field_22661;
   public Direction field_22663 = Direction.field_800;

   public class_4641(class_6629<? extends class_4641> var1, World var2) {
      super(var1, var2);
   }

   public class_4641(class_6629<? extends class_4641> var1, World var2, BlockPos var3) {
      this(var1, var2);
      this.field_22661 = var3;
   }

   @Override
   public void method_37329() {
   }

   public void method_21468(Direction var1) {
      Validate.notNull(var1);
      Validate.isTrue(var1.method_1029().method_42629());
      this.field_22663 = var1;
      this.rotationYaw = (float)(this.field_22663.method_1031() * 90);
      this.prevRotationYaw = this.rotationYaw;
      this.method_21474();
   }

   public void method_21474() {
      if (this.field_22663 != null) {
         double var3 = (double)this.field_22661.method_12173() + 0.5;
         double var5 = (double)this.field_22661.method_12165() + 0.5;
         double var7 = (double)this.field_22661.method_12185() + 0.5;
         double var9 = 0.46875;
         double var11 = this.method_21476(this.method_21470());
         double var13 = this.method_21476(this.method_21473());
         var3 -= (double)this.field_22663.method_1041() * 0.46875;
         var7 -= (double)this.field_22663.method_1034() * 0.46875;
         var5 += var13;
         Direction var15 = this.field_22663.method_1053();
         var3 += var11 * (double)var15.method_1041();
         var7 += var11 * (double)var15.method_1034();
         this.method_37222(var3, var5, var7);
         double var16 = (double)this.method_21470();
         double var18 = (double)this.method_21473();
         double var20 = (double)this.method_21470();
         if (this.field_22663.method_1029() != class_9249.field_47219) {
            var16 = 1.0;
         } else {
            var20 = 1.0;
         }

         var16 /= 32.0;
         var18 /= 32.0;
         var20 /= 32.0;
         this.method_37094(new class_4092(var3 - var16, var5 - var18, var7 - var20, var3 + var16, var5 + var18, var7 + var20));
      }
   }

   private double method_21476(int var1) {
      return var1 % 32 != 0 ? 0.0 : 0.5;
   }

   @Override
   public void method_37123() {
      if (!this.world.field_33055) {
         if (this.method_37309() < -64.0) {
            this.method_37150();
         }

         if (this.field_22664++ == 100) {
            this.field_22664 = 0;
            if (!this.field_41751 && !this.method_21472()) {
               this.method_37204();
               this.method_21475((Entity)null);
            }
         }
      }
   }

   public boolean method_21472() {
      if (!this.world.method_6682(this)) {
         return false;
      } else {
         int var3 = Math.max(1, this.method_21470() / 16);
         int var4 = Math.max(1, this.method_21473() / 16);
         BlockPos var5 = this.field_22661.method_6098(this.field_22663.method_1046());
         Direction var6 = this.field_22663.method_1053();
         class_2921 var7 = new class_2921();

         for (int var8 = 0; var8 < var3; var8++) {
            for (int var9 = 0; var9 < var4; var9++) {
               int var10 = (var3 - 1) / -2;
               int var11 = (var4 - 1) / -2;
               var7.method_13364(var5).method_13369(var6, var8 + var10).method_13369(Direction.field_817, var9 + var11);
               class_2522 var12 = this.world.method_28262(var7);
               if (!var12.method_8362().method_24499() && !class_5877.method_26769(var12)) {
                  return false;
               }
            }
         }

         return this.world.method_25867(this, this.method_37241(), field_22662).isEmpty();
      }
   }

   @Override
   public boolean method_37167() {
      return true;
   }

   @Override
   public boolean method_37296(Entity var1) {
      if (!(var1 instanceof class_704)) {
         return false;
      } else {
         class_704 var4 = (class_704)var1;
         return this.world.method_29538(var4, this.field_22661) ? this.attackEntityFrom(DamageSource.method_28344(var4), 0.0F) : true;
      }
   }

   @Override
   public Direction method_37365() {
      return this.field_22663;
   }

   @Override
   public boolean attackEntityFrom(DamageSource var1, float var2) {
      if (!this.method_37180(var1)) {
         if (!this.field_41751 && !this.world.field_33055) {
            this.method_37204();
            this.method_37138();
            this.method_21475(var1.method_28372());
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public void method_37226(class_7412 var1, class_1343 var2) {
      if (!this.world.field_33055 && !this.field_41751 && var2.method_6221() > 0.0) {
         this.method_37204();
         this.method_21475((Entity)null);
      }
   }

   @Override
   public void method_37186(double var1, double var3, double var5) {
      if (!this.world.field_33055 && !this.field_41751 && var1 * var1 + var3 * var3 + var5 * var5 > 0.0) {
         this.method_37204();
         this.method_21475((Entity)null);
      }
   }

   @Override
   public void method_37376(CompoundNBT var1) {
      BlockPos var4 = this.method_21469();
      var1.method_25931("TileX", var4.method_12173());
      var1.method_25931("TileY", var4.method_12165());
      var1.method_25931("TileZ", var4.method_12185());
   }

   @Override
   public void method_37314(CompoundNBT var1) {
      this.field_22661 = new BlockPos(var1.method_25947("TileX"), var1.method_25947("TileY"), var1.method_25947("TileZ"));
   }

   public abstract int method_21470();

   public abstract int method_21473();

   public abstract void method_21475(Entity var1);

   public abstract void method_21471();

   @Override
   public class_91 method_37311(ItemStack var1, float var2) {
      class_91 var5 = new class_91(
         this.world,
         this.method_37302() + (double)((float)this.field_22663.method_1041() * 0.15F),
         this.method_37309() + (double)var2,
         this.method_37156() + (double)((float)this.field_22663.method_1034() * 0.15F),
         var1
      );
      var5.method_257();
      this.world.method_7509(var5);
      return var5;
   }

   @Override
   public boolean method_37118() {
      return false;
   }

   @Override
   public void method_37256(double var1, double var3, double var5) {
      this.field_22661 = new BlockPos(var1, var3, var5);
      this.method_21474();
      this.field_41763 = true;
   }

   public BlockPos method_21469() {
      return this.field_22661;
   }

   @Override
   public float method_37317(class_6631 var1) {
      if (this.field_22663.method_1029() != class_9249.field_47216) {
         switch (var1) {
            case field_34338:
               this.field_22663 = this.field_22663.method_1046();
               break;
            case field_34335:
               this.field_22663 = this.field_22663.method_1053();
               break;
            case field_34334:
               this.field_22663 = this.field_22663.method_1042();
         }
      }

      float var4 = class_9299.method_42810(this.rotationYaw);
      switch (var1) {
         case field_34338:
            return var4 + 180.0F;
         case field_34335:
            return var4 + 90.0F;
         case field_34334:
            return var4 + 270.0F;
         default:
            return var4;
      }
   }

   @Override
   public float method_37152(class_9022 var1) {
      return this.method_37317(var1.method_41390(this.field_22663));
   }

   @Override
   public void method_37384(class_6331 var1, class_900 var2) {
   }

   @Override
   public void method_37187() {
   }
}
