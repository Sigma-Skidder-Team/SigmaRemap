package remapped;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class class_6092 extends class_608 implements class_1869 {
   private static final UUID field_31175 = UUID.fromString("7E0292F2-9434-48D5-A29F-9583AF7DF27F");
   private static final class_9343 field_31180 = new class_9343(field_31175, "Covered armor bonus", 20.0, class_9342.field_47679);
   public static final class_7821<Direction> field_31172 = class_8073.<Direction>method_36641(class_6092.class, class_2734.field_13364);
   public static final class_7821<Optional<BlockPos>> field_31171 = class_8073.<Optional<BlockPos>>method_36641(class_6092.class, class_2734.field_13352);
   public static final class_7821<Byte> field_31170 = class_8073.<Byte>method_36641(class_6092.class, class_2734.field_13361);
   public static final class_7821<Byte> field_31177 = class_8073.<Byte>method_36641(class_6092.class, class_2734.field_13361);
   private float field_31173;
   private float field_31178;
   private BlockPos field_31176 = null;
   private int field_31174;

   public class_6092(EntityType<? extends class_6092> var1, World var2) {
      super(var1, var2);
      this.field_29915 = 5;
   }

   @Override
   public void method_26851() {
      this.field_29916.method_3485(1, new class_4407(this, class_704.class, 8.0F));
      this.field_29916.method_3485(4, new class_2478(this));
      this.field_29916.method_3485(7, new class_864(this, null));
      this.field_29916.method_3485(8, new class_9691(this));
      this.field_29908.method_3485(1, new class_8420(this).method_38757());
      this.field_29908.method_3485(2, new class_7980(this, this));
      this.field_29908.method_3485(3, new class_1049(this));
   }

   @Override
   public boolean method_37126() {
      return false;
   }

   @Override
   public class_562 method_37197() {
      return class_562.field_3332;
   }

   @Override
   public class_8461 method_26918() {
      return class_463.field_2662;
   }

   @Override
   public void method_26853() {
      if (!this.method_27924()) {
         super.method_26853();
      }
   }

   @Override
   public class_8461 method_26599() {
      return class_463.field_2447;
   }

   @Override
   public class_8461 method_26541(DamageSource var1) {
      return !this.method_27924() ? class_463.field_2257 : class_463.field_1976;
   }

   @Override
   public void method_37329() {
      super.method_37329();
      this.field_41735.method_36634(field_31172, Direction.field_802);
      this.field_41735.method_36634(field_31171, Optional.<BlockPos>empty());
      this.field_41735.method_36634(field_31170, (byte)0);
      this.field_41735.method_36634(field_31177, (byte)16);
   }

   public static class_1313 method_27908() {
      return class_5886.method_26846().method_5984(class_7331.field_37468, 30.0);
   }

   @Override
   public class_1902 method_26847() {
      return new class_6952(this, this);
   }

   @Override
   public void method_37314(CompoundNBT var1) {
      super.method_37314(var1);
      this.field_41735.method_36633(field_31172, Direction.method_1033(var1.method_25950("AttachFace")));
      this.field_41735.method_36633(field_31170, var1.method_25950("Peek"));
      this.field_41735.method_36633(field_31177, var1.method_25950("Color"));
      if (!var1.method_25938("APX")) {
         this.field_41735.method_36633(field_31171, Optional.<BlockPos>empty());
      } else {
         int var4 = var1.method_25947("APX");
         int var5 = var1.method_25947("APY");
         int var6 = var1.method_25947("APZ");
         this.field_41735.method_36633(field_31171, Optional.<BlockPos>of(new BlockPos(var4, var5, var6)));
      }
   }

   @Override
   public void method_37376(CompoundNBT var1) {
      super.method_37376(var1);
      var1.method_25921("AttachFace", (byte)this.field_41735.<Direction>method_36640(field_31172).method_1050());
      var1.method_25921("Peek", this.field_41735.<Byte>method_36640(field_31170));
      var1.method_25921("Color", this.field_41735.<Byte>method_36640(field_31177));
      BlockPos var4 = this.method_27906();
      if (var4 != null) {
         var1.method_25931("APX", var4.method_12173());
         var1.method_25931("APY", var4.method_12165());
         var1.method_25931("APZ", var4.method_12185());
      }
   }

   @Override
   public void method_37123() {
      super.method_37123();
      BlockPos var3 = this.field_41735.<Optional<BlockPos>>method_36640(field_31171).orElse((BlockPos)null);
      if (var3 == null && !this.world.field_33055) {
         var3 = this.method_37075();
         this.field_41735.method_36633(field_31171, Optional.<BlockPos>of(var3));
      }

      if (!this.isPassenger()) {
         if (!this.world.field_33055) {
            class_2522 var4 = this.world.method_28262(var3);
            if (!var4.method_8345()) {
               if (!var4.method_8350(class_4783.field_23833)) {
                  if (!var4.method_8350(class_4783.field_23336)) {
                     this.method_27920();
                  } else {
                     Direction var5 = var4.<Direction>method_10313(class_1166.field_16180);
                     if (!this.world.method_22548(var3.method_6098(var5))) {
                        this.method_27920();
                     } else {
                        var3 = var3.method_6098(var5);
                        this.field_41735.method_36633(field_31171, Optional.<BlockPos>of(var3));
                     }
                  }
               } else {
                  Direction var19 = var4.<Direction>method_10313(class_1990.field_16180);
                  if (!this.world.method_22548(var3.method_6098(var19))) {
                     this.method_27920();
                  } else {
                     var3 = var3.method_6098(var19);
                     this.field_41735.method_36633(field_31171, Optional.<BlockPos>of(var3));
                  }
               }
            }

            Direction var20 = this.method_27914();
            if (!this.method_27916(var3, var20)) {
               Direction var6 = this.method_27907(var3);
               if (var6 == null) {
                  this.method_27920();
               } else {
                  this.field_41735.method_36633(field_31172, var6);
               }
            }
         }
      } else {
         var3 = null;
         float var17 = this.method_37243().rotationYaw;
         this.rotationYaw = var17;
         this.field_29605 = var17;
         this.field_29611 = var17;
         this.field_31174 = 0;
      }

      float var18 = (float)this.method_27911() * 0.01F;
      this.field_31173 = this.field_31178;
      if (!(this.field_31178 > var18)) {
         if (this.field_31178 < var18) {
            this.field_31178 = class_9299.method_42828(this.field_31178 + 0.05F, 0.0F, var18);
         }
      } else {
         this.field_31178 = class_9299.method_42828(this.field_31178 - 0.05F, var18, 1.0F);
      }

      if (var3 != null) {
         if (this.world.field_33055) {
            if (this.field_31174 > 0 && this.field_31176 != null) {
               this.field_31174--;
            } else {
               this.field_31176 = var3;
            }
         }

         this.method_37306((double)var3.method_12173() + 0.5, (double)var3.method_12165(), (double)var3.method_12185() + 0.5);
         double var7 = 0.5 - (double)class_9299.method_42818((0.5F + this.field_31178) * (float) Math.PI) * 0.5;
         double var9 = 0.5 - (double)class_9299.method_42818((0.5F + this.field_31173) * (float) Math.PI) * 0.5;
         Direction var11 = this.method_27914().method_1046();
         this.method_37094(
            new Box(
                  this.getPosX() - 0.5,
                  this.method_37309(),
                  this.getPosZ() - 0.5,
                  this.getPosX() + 0.5,
                  this.method_37309() + 1.0,
                  this.getPosZ() + 0.5
               )
               .method_18928((double)var11.method_1041() * var7, (double)var11.method_1054() * var7, (double)var11.method_1034() * var7)
         );
         double var12 = var7 - var9;
         if (var12 > 0.0) {
            List var14 = this.world.method_25870(this, this.method_37241());
            if (!var14.isEmpty()) {
               for (Entity var16 : var14) {
                  if (!(var16 instanceof class_6092) && !var16.field_41731) {
                     var16.method_37226(
                        class_7412.field_37841,
                        new class_1343(var12 * (double)var11.method_1041(), var12 * (double)var11.method_1054(), var12 * (double)var11.method_1034())
                     );
                  }
               }
            }
         }
      }
   }

   @Override
   public void method_37226(class_7412 var1, class_1343 var2) {
      if (var1 != class_7412.field_37837) {
         super.method_37226(var1, var2);
      } else {
         this.method_27920();
      }
   }

   @Override
   public void method_37256(double var1, double var3, double var5) {
      super.method_37256(var1, var3, var5);
      if (this.field_41735 != null && this.field_41697 != 0) {
         Optional var9 = this.field_41735.<Optional>method_36640(field_31171);
         Optional var10 = Optional.<BlockPos>of(new BlockPos(var1, var3, var5));
         if (!var10.equals(var9)) {
            this.field_41735.method_36633(field_31171, var10);
            this.field_41735.method_36633(field_31170, (byte)0);
            this.field_41763 = true;
         }
      }
   }

   @Nullable
   public Direction method_27907(BlockPos var1) {
      for (Direction var7 : Direction.values()) {
         if (this.method_27916(var1, var7)) {
            return var7;
         }
      }

      return null;
   }

   private boolean method_27916(BlockPos var1, Direction var2) {
      return this.world.method_29566(var1.method_6098(var2), this, var2.method_1046())
         && this.world.method_6683(this, class_6392.method_29191(var1, var2.method_1046()));
   }

   public boolean method_27920() {
      if (!this.method_26859() && this.method_37330()) {
         BlockPos var3 = this.method_37075();

         for (int var4 = 0; var4 < 5; var4++) {
            BlockPos var5 = var3.method_6104(8 - this.field_41717.nextInt(17), 8 - this.field_41717.nextInt(17), 8 - this.field_41717.nextInt(17));
            if (var5.method_12165() > 0
               && this.world.method_22548(var5)
               && this.world.method_6673().method_9813(var5)
               && this.world.method_6683(this, new Box(var5))) {
               Direction var6 = this.method_27907(var5);
               if (var6 != null) {
                  this.field_41735.method_36633(field_31172, var6);
                  this.method_37155(class_463.field_2780, 1.0F, 1.0F);
                  this.field_41735.method_36633(field_31171, Optional.<BlockPos>of(var5));
                  this.field_41735.method_36633(field_31170, (byte)0);
                  this.method_26860((class_5834)null);
                  return true;
               }
            }
         }

         return false;
      } else {
         return true;
      }
   }

   @Override
   public void method_26606() {
      super.method_26606();
      this.method_37215(class_1343.field_7335);
      if (!this.method_26859()) {
         this.field_29611 = 0.0F;
         this.field_29605 = 0.0F;
      }
   }

   @Override
   public void method_37191(class_7821<?> var1) {
      if (field_31171.equals(var1) && this.world.field_33055 && !this.isPassenger()) {
         BlockPos var4 = this.method_27906();
         if (var4 != null) {
            if (this.field_31176 != null) {
               this.field_31174 = 6;
            } else {
               this.field_31176 = var4;
            }

            this.method_37306((double)var4.method_12173() + 0.5, (double)var4.method_12165(), (double)var4.method_12185() + 0.5);
         }
      }

      super.method_37191(var1);
   }

   @Override
   public void method_37318(double var1, double var3, double var5, float var7, float var8, int var9, boolean var10) {
      this.field_29612 = 0;
   }

   @Override
   public boolean attackEntityFrom(DamageSource var1, float var2) {
      if (this.method_27924()) {
         Entity var5 = var1.method_28353();
         if (var5 instanceof class_6749) {
            return false;
         }
      }

      if (!super.attackEntityFrom(var1, var2)) {
         return false;
      } else {
         if ((double)this.method_26551() < (double)this.method_26465() * 0.5 && this.field_41717.nextInt(4) == 0) {
            this.method_27920();
         }

         return true;
      }
   }

   private boolean method_27924() {
      return this.method_27911() == 0;
   }

   @Override
   public boolean method_37173() {
      return this.method_37330();
   }

   public Direction method_27914() {
      return this.field_41735.<Direction>method_36640(field_31172);
   }

   @Nullable
   public BlockPos method_27906() {
      return this.field_41735.<Optional<BlockPos>>method_36640(field_31171).orElse((BlockPos)null);
   }

   public void method_27917(BlockPos var1) {
      this.field_41735.method_36633(field_31171, Optional.<BlockPos>ofNullable(var1));
   }

   public int method_27911() {
      return this.field_41735.<Byte>method_36640(field_31170);
   }

   public void method_27913(int var1) {
      if (!this.world.field_33055) {
         this.method_26561(class_7331.field_37473).method_45004(field_31180);
         if (var1 != 0) {
            this.method_37155(class_463.field_2073, 1.0F, 1.0F);
         } else {
            this.method_26561(class_7331.field_37473).method_45005(field_31180);
            this.method_37155(class_463.field_2341, 1.0F, 1.0F);
         }
      }

      this.field_41735.method_36633(field_31170, (byte)var1);
   }

   public float method_27923(float var1) {
      return class_9299.method_42795(var1, this.field_31173, this.field_31178);
   }

   public int method_27925() {
      return this.field_31174;
   }

   public BlockPos method_27921() {
      return this.field_31176;
   }

   @Override
   public float method_26425(class_7653 var1, class_6097 var2) {
      return 0.5F;
   }

   @Override
   public int method_26862() {
      return 180;
   }

   @Override
   public int method_26903() {
      return 180;
   }

   @Override
   public void method_37183(Entity var1) {
   }

   @Override
   public float method_37355() {
      return 0.0F;
   }

   public boolean method_27918() {
      return this.field_31176 != null && this.method_27906() != null;
   }

   @Nullable
   public class_9077 method_27909() {
      Byte var3 = this.field_41735.<Byte>method_36640(field_31177);
      return var3 != 16 && var3 <= 15 ? class_9077.method_41789(var3) : null;
   }
}
