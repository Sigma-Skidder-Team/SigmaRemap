package remapped;

import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class class_912 extends class_1173 implements class_6250 {
   private static final UUID field_4676 = UUID.fromString("020E0DFB-87AE-4653-9556-831010E291A0");
   private static final class_9343 field_4683 = new class_9343(field_4676, "Attacking speed boost", 0.15F, class_9342.field_47679);
   private static final class_7821<Optional<class_2522>> field_4686 = class_8073.<Optional<class_2522>>method_36641(class_912.class, class_2734.field_13354);
   private static final class_7821<Boolean> field_4678 = class_8073.<Boolean>method_36641(class_912.class, class_2734.field_13347);
   private static final class_7821<Boolean> field_4685 = class_8073.<Boolean>method_36641(class_912.class, class_2734.field_13347);
   private static final Predicate<class_5834> field_4681 = var0 -> var0 instanceof class_2667 && ((class_2667)var0).method_12022();
   private int field_4679 = Integer.MIN_VALUE;
   private int field_4677;
   private static final class_4376 field_4684 = class_5804.method_26295(20, 39);
   private int field_4682;
   private UUID field_4687;

   public class_912(class_6629<? extends class_912> var1, World var2) {
      super(var1, var2);
      this.field_41733 = 1.0F;
      this.method_26895(class_1108.field_6359, -1.0F);
   }

   @Override
   public void method_26851() {
      this.field_29916.method_3485(0, new class_787(this));
      this.field_29916.method_3485(1, new class_990(this));
      this.field_29916.method_3485(2, new class_9037(this, 1.0, false));
      this.field_29916.method_3485(7, new class_2889(this, 1.0, 0.0F));
      this.field_29916.method_3485(8, new class_4407(this, class_704.class, 8.0F));
      this.field_29916.method_3485(8, new class_9691(this));
      this.field_29916.method_3485(10, new class_6766(this));
      this.field_29916.method_3485(11, new class_1198(this));
      this.field_29908.method_3485(1, new class_9344(this, this::method_28534));
      this.field_29908.method_3485(2, new class_8420(this));
      this.field_29908.method_3485(3, new class_4138<class_2667>(this, class_2667.class, 10, true, false, field_4681));
      this.field_29908.method_3485(4, new class_6474<class_912>(this, false));
   }

   public static class_1313 method_3909() {
      return class_1173.method_5201()
         .method_5984(class_7331.field_37468, 40.0)
         .method_5984(class_7331.field_37465, 0.3F)
         .method_5984(class_7331.field_37462, 7.0)
         .method_5984(class_7331.field_37471, 64.0);
   }

   @Override
   public void method_26860(class_5834 var1) {
      super.method_26860(var1);
      class_9747 var4 = this.method_26561(class_7331.field_37465);
      if (var1 != null) {
         this.field_4677 = this.field_41697;
         this.field_41735.method_36633(field_4678, true);
         if (!var4.method_45007(field_4683)) {
            var4.method_45011(field_4683);
         }
      } else {
         this.field_4677 = 0;
         this.field_41735.method_36633(field_4678, false);
         this.field_41735.method_36633(field_4685, false);
         var4.method_45004(field_4683);
      }
   }

   @Override
   public void method_37329() {
      super.method_37329();
      this.field_41735.method_36634(field_4686, Optional.<class_2522>empty());
      this.field_41735.method_36634(field_4678, false);
      this.field_41735.method_36634(field_4685, false);
   }

   @Override
   public void method_28529() {
      this.method_28532(field_4684.method_20387(this.field_41717));
   }

   @Override
   public void method_28532(int var1) {
      this.field_4682 = var1;
   }

   @Override
   public int method_28539() {
      return this.field_4682;
   }

   @Override
   public void method_28531(UUID var1) {
      this.field_4687 = var1;
   }

   @Override
   public UUID method_28535() {
      return this.field_4687;
   }

   public void method_3907() {
      if (this.field_41697 >= this.field_4679 + 400) {
         this.field_4679 = this.field_41697;
         if (!this.method_37378()) {
            this.world
               .method_29527(this.method_37302(), this.method_37388(), this.method_37156(), class_463.field_2369, this.method_37197(), 2.5F, 1.0F, false);
         }
      }
   }

   @Override
   public void method_37191(class_7821<?> var1) {
      if (field_4678.equals(var1) && this.method_3916() && this.world.field_33055) {
         this.method_3907();
      }

      super.method_37191(var1);
   }

   @Override
   public void method_37376(CompoundNBT var1) {
      super.method_37376(var1);
      class_2522 var4 = this.method_3913();
      if (var4 != null) {
         var1.put("carriedBlockState", class_4338.method_20187(var4));
      }

      this.method_28528(var1);
   }

   @Override
   public void method_37314(CompoundNBT var1) {
      super.method_37314(var1);
      class_2522 var4 = null;
      if (var1.contains("carriedBlockState", 10)) {
         var4 = class_4338.method_20185(var1.getCompound("carriedBlockState"));
         if (var4.method_8345()) {
            var4 = null;
         }
      }

      this.method_3915(var4);
      this.method_28533((class_6331)this.world, var1);
   }

   private boolean method_3905(class_704 var1) {
      ItemStack var4 = var1.inventory.field_36405.get(3);
      if (var4.method_27960() != class_4783.field_23281.method_10803()) {
         class_1343 var5 = var1.method_37307(1.0F).method_6213();
         class_1343 var6 = new class_1343(
            this.method_37302() - var1.method_37302(), this.method_37388() - var1.method_37388(), this.method_37156() - var1.method_37156()
         );
         double var7 = var6.method_6217();
         var6 = var6.method_6213();
         double var9 = var5.method_6206(var6);
         return !(var9 > 1.0 - 0.025 / var7) ? false : var1.method_26420(this);
      } else {
         return false;
      }
   }

   @Override
   public float method_26425(class_7653 var1, class_6097 var2) {
      return 2.55F;
   }

   @Override
   public void method_26606() {
      if (this.world.field_33055) {
         for (int var3 = 0; var3 < 2; var3++) {
            this.world
               .method_43361(
                  class_3090.field_15356,
                  this.method_37361(0.5),
                  this.method_37255() - 0.25,
                  this.method_37383(0.5),
                  (this.field_41717.nextDouble() - 0.5) * 2.0,
                  -this.field_41717.nextDouble(),
                  (this.field_41717.nextDouble() - 0.5) * 2.0
               );
         }
      }

      this.field_29654 = false;
      if (!this.world.field_33055) {
         this.method_28530((class_6331)this.world, true);
      }

      super.method_26606();
   }

   @Override
   public boolean method_26537() {
      return true;
   }

   @Override
   public void method_26919() {
      if (this.world.method_29602() && this.field_41697 >= this.field_4677 + 600) {
         float var3 = this.method_37193();
         if (var3 > 0.5F && this.world.method_25263(this.method_37075()) && this.field_41717.nextFloat() * 30.0F < (var3 - 0.4F) * 2.0F) {
            this.method_26860((class_5834)null);
            this.method_3914();
         }
      }

      super.method_26919();
   }

   public boolean method_3914() {
      if (!this.world.method_22567() && this.method_37330()) {
         double var3 = this.method_37302() + (this.field_41717.nextDouble() - 0.5) * 64.0;
         double var5 = this.method_37309() + (double)(this.field_41717.nextInt(64) - 32);
         double var7 = this.method_37156() + (this.field_41717.nextDouble() - 0.5) * 64.0;
         return this.method_3912(var3, var5, var7);
      } else {
         return false;
      }
   }

   private boolean method_3911(Entity var1) {
      class_1343 var4 = new class_1343(
         this.method_37302() - var1.method_37302(), this.method_37080(0.5) - var1.method_37388(), this.method_37156() - var1.method_37156()
      );
      var4 = var4.method_6213();
      double var5 = 16.0;
      double var7 = this.method_37302() + (this.field_41717.nextDouble() - 0.5) * 8.0 - var4.field_7336 * 16.0;
      double var9 = this.method_37309() + (double)(this.field_41717.nextInt(16) - 8) - var4.field_7333 * 16.0;
      double var11 = this.method_37156() + (this.field_41717.nextDouble() - 0.5) * 8.0 - var4.field_7334 * 16.0;
      return this.method_3912(var7, var9, var11);
   }

   private boolean method_3912(double var1, double var3, double var5) {
      class_2921 var9 = new class_2921(var1, var3, var5);

      while (var9.method_12165() > 0 && !this.world.method_28262(var9).method_8362().method_24502()) {
         var9.method_13368(Direction.field_802);
      }

      class_2522 var10 = this.world.method_28262(var9);
      boolean var11 = var10.method_8362().method_24502();
      boolean var12 = var10.method_8364().method_22007(class_6503.field_33094);
      if (var11 && !var12) {
         boolean var13 = this.method_26499(var1, var3, var5, true);
         if (var13 && !this.method_37378()) {
            this.world
               .method_29528((class_704)null, this.field_41767, this.field_41698, this.field_41725, class_463.field_2563, this.method_37197(), 1.0F, 1.0F);
            this.method_37155(class_463.field_2563, 1.0F, 1.0F);
         }

         return var13;
      } else {
         return false;
      }
   }

   @Override
   public class_8461 method_26918() {
      return !this.method_3910() ? class_463.field_1996 : class_463.field_2231;
   }

   @Override
   public class_8461 method_26541(DamageSource var1) {
      return class_463.field_2641;
   }

   @Override
   public class_8461 method_26599() {
      return class_463.field_2436;
   }

   @Override
   public void method_26614(DamageSource var1, int var2, boolean var3) {
      super.method_26614(var1, var2, var3);
      class_2522 var6 = this.method_3913();
      if (var6 != null) {
         this.method_37312(var6.method_8360());
      }
   }

   public void method_3915(class_2522 var1) {
      this.field_41735.method_36633(field_4686, Optional.<class_2522>ofNullable(var1));
   }

   @Nullable
   public class_2522 method_3913() {
      return this.field_41735.<Optional<class_2522>>method_36640(field_4686).orElse((class_2522)null);
   }

   @Override
   public boolean attackEntityFrom(DamageSource var1, float var2) {
      if (this.method_37180(var1)) {
         return false;
      } else if (!(var1 instanceof class_8758)) {
         boolean var6 = super.attackEntityFrom(var1, var2);
         if (!this.world.method_22567() && !(var1.method_28372() instanceof class_5834) && this.field_41717.nextInt(10) != 0) {
            this.method_3914();
         }

         return var6;
      } else {
         for (int var5 = 0; var5 < 64; var5++) {
            if (this.method_3914()) {
               return true;
            }
         }

         return false;
      }
   }

   public boolean method_3910() {
      return this.field_41735.<Boolean>method_36640(field_4678);
   }

   public boolean method_3916() {
      return this.field_41735.<Boolean>method_36640(field_4685);
   }

   public void method_3904() {
      this.field_41735.method_36633(field_4685, true);
   }

   @Override
   public boolean method_26915() {
      return super.method_26915() || this.method_3913() != null;
   }
}
