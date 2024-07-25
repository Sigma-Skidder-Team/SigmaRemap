package remapped;

import java.util.Objects;
import java.util.Optional;
import java.util.Random;
import java.util.UUID;
import java.util.function.Predicate;

public class class_9668 extends class_5467 implements class_6250 {
   private static String[] field_49240;
   private static final class_7821<Boolean> field_49244 = class_8073.<Boolean>method_36641(class_9668.class, class_2734.field_13347);
   private float field_49241;
   private float field_49243;
   private int field_49246;
   private static final class_4376 field_49242 = class_5804.method_26295(20, 39);
   private int field_49239;
   private UUID field_49245;

   public class_9668(EntityType<? extends class_9668> var1, World var2) {
      super(var1, var2);
   }

   @Override
   public class_1899 method_8638(class_6331 var1, class_1899 var2) {
      return EntityType.field_34229.method_30484(var1);
   }

   @Override
   public boolean method_24866(ItemStack var1) {
      return false;
   }

   @Override
   public void method_26851() {
      super.method_26851();
      this.field_29916.method_3485(0, new class_787(this));
      this.field_29916.method_3485(1, new class_6677(this));
      this.field_29916.method_3485(1, new class_9493(this));
      this.field_29916.method_3485(4, new class_8676(this, 1.25));
      this.field_29916.method_3485(5, new class_8285(this, 1.0));
      this.field_29916.method_3485(6, new class_4407(this, class_704.class, 6.0F));
      this.field_29916.method_3485(7, new class_9691(this));
      this.field_29908.method_3485(1, new class_9867(this));
      this.field_29908.method_3485(2, new class_9724(this));
      this.field_29908.method_3485(3, new class_4138<class_704>(this, class_704.class, 10, true, false, this::method_28534));
      this.field_29908.method_3485(4, new class_4138<class_5542>(this, class_5542.class, 10, true, true, (Predicate<class_5834>)null));
      this.field_29908.method_3485(5, new class_6474<class_9668>(this, false));
   }

   public static class_1313 method_44713() {
      return class_5886.method_26846()
         .method_5984(class_7331.field_37468, 30.0)
         .method_5984(class_7331.field_37471, 20.0)
         .method_5984(class_7331.field_37465, 0.25)
         .method_5984(class_7331.field_37462, 6.0);
   }

   public static boolean method_44711(EntityType<class_9668> var0, class_9379 var1, class_2417 var2, BlockPos var3, Random var4) {
      Optional var7 = var1.method_2754(var3);
      return !Objects.equals(var7, Optional.<class_5621<class_6325>>of(class_8606.field_44137))
            && !Objects.equals(var7, Optional.<class_5621<class_6325>>of(class_8606.field_44115))
         ? method_24872(var0, var1, var2, var3, var4)
         : var1.method_25261(var3, 0) > 8 && var1.method_28262(var3.method_6100()).method_8350(class_4783.field_23496);
   }

   @Override
   public void method_37314(CompoundNBT var1) {
      super.method_37314(var1);
      this.method_28533((class_6331)this.world, var1);
   }

   @Override
   public void method_37376(CompoundNBT var1) {
      super.method_37376(var1);
      this.method_28528(var1);
   }

   @Override
   public void method_28529() {
      this.method_28532(field_49242.method_20387(this.field_41717));
   }

   @Override
   public void method_28532(int var1) {
      this.field_49239 = var1;
   }

   @Override
   public int method_28539() {
      return this.field_49239;
   }

   @Override
   public void method_28531(UUID var1) {
      this.field_49245 = var1;
   }

   @Override
   public UUID method_28535() {
      return this.field_49245;
   }

   @Override
   public class_8461 method_26918() {
      return !this.method_26449() ? class_463.field_2604 : class_463.field_2717;
   }

   @Override
   public class_8461 method_26541(DamageSource var1) {
      return class_463.field_2238;
   }

   @Override
   public class_8461 method_26599() {
      return class_463.field_2022;
   }

   @Override
   public void method_37207(BlockPos var1, class_2522 var2) {
      this.method_37155(class_463.field_2867, 0.15F, 1.0F);
   }

   public void method_44708() {
      if (this.field_49246 <= 0) {
         this.method_37155(class_463.field_2880, 1.0F, this.method_26547());
         this.field_49246 = 40;
      }
   }

   @Override
   public void method_37329() {
      super.method_37329();
      this.field_41735.method_36634(field_49244, false);
   }

   @Override
   public void method_37123() {
      super.method_37123();
      if (this.world.field_33055) {
         if (this.field_49243 != this.field_49241) {
            this.method_37187();
         }

         this.field_49241 = this.field_49243;
         if (!this.method_44709()) {
            this.field_49243 = class_9299.method_42828(this.field_49243 - 1.0F, 0.0F, 6.0F);
         } else {
            this.field_49243 = class_9299.method_42828(this.field_49243 + 1.0F, 0.0F, 6.0F);
         }
      }

      if (this.field_49246 > 0) {
         this.field_49246--;
      }

      if (!this.world.field_33055) {
         this.method_28530((class_6331)this.world, true);
      }
   }

   @Override
   public class_6097 method_37190(class_7653 var1) {
      if (!(this.field_49243 > 0.0F)) {
         return super.method_37190(var1);
      } else {
         float var4 = this.field_49243 / 6.0F;
         float var5 = 1.0F + var4;
         return super.method_37190(var1).method_27943(1.0F, var5);
      }
   }

   @Override
   public boolean method_26442(Entity var1) {
      boolean var4 = var1.attackEntityFrom(DamageSource.method_28345(this), (float)((int)this.method_26575(class_7331.field_37462)));
      if (var4) {
         this.method_37096(this, var1);
      }

      return var4;
   }

   public boolean method_44709() {
      return this.field_41735.<Boolean>method_36640(field_49244);
   }

   public void method_44712(boolean var1) {
      this.field_41735.method_36633(field_49244, var1);
   }

   public float method_44710(float var1) {
      return class_9299.method_42795(var1, this.field_49241, this.field_49243) / 6.0F;
   }

   @Override
   public float method_26458() {
      return 0.98F;
   }

   @Override
   public class_8733 method_26864(class_1556 var1, class_9589 var2, class_2417 var3, class_8733 var4, CompoundNBT var5) {
      if (var4 == null) {
         var4 = new class_1821(1.0F);
      }

      return super.method_26864(var1, var2, var3, (class_8733)var4, var5);
   }
}
