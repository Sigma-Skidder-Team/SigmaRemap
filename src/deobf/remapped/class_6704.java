package remapped;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.Random;
import javax.annotation.Nullable;

public class class_6704 extends class_5467 implements class_1869, class_9479 {
   private static final class_7821<Boolean> field_34610 = class_8073.<Boolean>method_36641(class_6704.class, class_2734.field_13347);
   private int field_34611;
   private int field_34612 = 0;
   private boolean field_34613 = false;
   public static final ImmutableList<? extends class_3172<? extends class_6127<? super class_6704>>> field_34608 = ImmutableList.of(
      class_3172.field_15861, class_3172.field_15860, class_3172.field_15863, class_3172.field_15873
   );
   public static final ImmutableList<? extends class_6044<?>> field_34609 = ImmutableList.of(
      class_6044.field_30892,
      class_6044.field_30907,
      class_6044.field_30901,
      class_6044.field_30870,
      class_6044.field_30912,
      class_6044.field_30874,
      class_6044.field_30889,
      class_6044.field_30909,
      class_6044.field_30888,
      class_6044.field_30884,
      class_6044.field_30865,
      class_6044.field_30863,
      new class_6044[]{
         class_6044.field_30913,
         class_6044.field_30878,
         class_6044.field_30906,
         class_6044.field_30915,
         class_6044.field_30885,
         class_6044.field_30905,
         class_6044.field_30860
      }
   );

   public class_6704(EntityType<? extends class_6704> var1, World var2) {
      super(var1, var2);
      this.field_29915 = 5;
   }

   @Override
   public boolean method_26887(PlayerEntity var1) {
      return !this.method_26920();
   }

   public static MutableAttribute method_30713() {
      return MonsterEntity.func_234295_eP_()
         .createMutableAttribute(Attributes.MAX_HEALTH, 40.0)
         .createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.3F)
         .createMutableAttribute(Attributes.KNOCKBACK_RESISTANCE, 0.6F)
         .createMutableAttribute(Attributes.ATTACK_KNOCKBACK, 1.0)
         .createMutableAttribute(Attributes.ATTACK_DAMAGE, 6.0);
   }

   @Override
   public boolean method_26442(Entity var1) {
      if (var1 instanceof LivingEntity) {
         this.field_34611 = 10;
         this.world.method_29587(this, (byte)4);
         this.method_37155(SoundEvents.field_2523, 1.0F, this.method_26547());
         class_6902.method_31606(this, (LivingEntity)var1);
         return class_9479.method_43797(this, (LivingEntity)var1);
      } else {
         return false;
      }
   }

   @Override
   public void method_26469(LivingEntity var1) {
      if (this.method_30714()) {
         class_9479.method_43796(this, var1);
      }
   }

   @Override
   public boolean attackEntityFrom(DamageSource var1, float var2) {
      boolean var5 = super.attackEntityFrom(var1, var2);
      if (!this.world.field_33055) {
         if (var5 && var1.method_28372() instanceof LivingEntity) {
            class_6902.method_31607(this, (LivingEntity)var1.method_28372());
         }

         return var5;
      } else {
         return false;
      }
   }

   @Override
   public class_1193<class_6704> method_26410() {
      return class_1150.<class_6704>method_5128(field_34609, field_34608);
   }

   @Override
   public class_1150<?> method_26585(Dynamic<?> var1) {
      return class_6902.method_31630(this.method_26410().method_5284(var1));
   }

   @Override
   public class_1150<class_6704> method_26525() {
      return (class_1150<class_6704>)super.method_26525();
   }

   @Override
   public void method_26919() {
      this.world.method_29599().startSection("hoglinBrain");
      this.method_26525().method_5141((class_6331)this.world, this);
      this.world.method_29599().endSection();
      class_6902.method_31614(this);
      if (!this.method_30710()) {
         this.field_34612 = 0;
      } else {
         this.field_34612++;
         if (this.field_34612 > 300) {
            this.method_30706(SoundEvents.field_2625);
            this.method_30712((class_6331)this.world);
         }
      }
   }

   @Override
   public void livingTick() {
      if (this.field_34611 > 0) {
         this.field_34611--;
      }

      super.livingTick();
   }

   @Override
   public void method_8637() {
      if (!this.method_26449()) {
         this.field_29915 = 5;
         this.getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue(6.0);
      } else {
         this.field_29915 = 3;
         this.getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue(0.5);
      }
   }

   public static boolean method_30705(EntityType<class_6704> var0, class_9379 var1, class_2417 var2, BlockPos var3, Random var4) {
      return !var1.method_28262(var3.method_6100()).method_8350(class_4783.field_23273);
   }

   @Nullable
   @Override
   public class_8733 method_26864(class_1556 var1, class_9589 var2, class_2417 var3, class_8733 var4, CompoundNBT var5) {
      if (var1.method_43360().nextFloat() < 0.2F) {
         this.method_26910(true);
      }

      return super.method_26864(var1, var2, var3, var4, var5);
   }

   @Override
   public boolean method_26911(double var1) {
      return !this.method_26925();
   }

   @Override
   public float method_21376(BlockPos var1, class_4924 var2) {
      if (!class_6902.method_31615(this, var1)) {
         return !var2.method_28262(var1.method_6100()).method_8350(class_4783.field_23598) ? 0.0F : 10.0F;
      } else {
         return -1.0F;
      }
   }

   @Override
   public double getMountedYOffset() {
      return (double)this.method_37074() - (!this.method_26449() ? 0.15 : 0.2);
   }

   @Override
   public class_6910 method_26857(PlayerEntity var1, Hand var2) {
      class_6910 var5 = super.method_26857(var1, var2);
      if (var5.method_31662()) {
         this.method_26883();
      }

      return var5;
   }

   @Override
   public void method_37336(byte var1) {
      if (var1 != 4) {
         super.method_37336(var1);
      } else {
         this.field_34611 = 10;
         this.method_37155(SoundEvents.field_2523, 1.0F, this.method_26547());
      }
   }

   @Override
   public int method_43795() {
      return this.field_34611;
   }

   @Override
   public boolean method_26482() {
      return true;
   }

   @Override
   public int method_26427(PlayerEntity var1) {
      return this.field_29915;
   }

   private void method_30712(class_6331 var1) {
      class_3895 var4 = this.<class_3895>method_26898(EntityType.field_34244, true);
      if (var4 != null) {
         var4.method_26558(new class_2250(Effects.NAUSEA, 200, 0));
      }
   }

   @Override
   public boolean method_24866(ItemStack var1) {
      return var1.method_27960() == class_4897.field_24379;
   }

   public boolean method_30714() {
      return !this.method_26449();
   }

   @Override
   public void method_37329() {
      super.method_37329();
      this.field_41735.method_36634(field_34610, false);
   }

   @Override
   public void writeAdditional(CompoundNBT var1) {
      super.writeAdditional(var1);
      if (this.method_30709()) {
         var1.putBoolean("IsImmuneToZombification", true);
      }

      var1.putInt("TimeInOverworld", this.field_34612);
      if (this.field_34613) {
         var1.putBoolean("CannotBeHunted", true);
      }
   }

   @Override
   public void readAdditional(CompoundNBT var1) {
      super.readAdditional(var1);
      this.method_30711(var1.getBoolean("IsImmuneToZombification"));
      this.field_34612 = var1.method_25947("TimeInOverworld");
      this.method_30708(var1.getBoolean("CannotBeHunted"));
   }

   public void method_30711(boolean var1) {
      this.method_37372().method_36633(field_34610, var1);
   }

   private boolean method_30709() {
      return this.method_37372().<Boolean>method_36640(field_34610);
   }

   public boolean method_30710() {
      return !this.world.method_22572().method_40227() && !this.method_30709() && !this.isAIDisabled();
   }

   private void method_30708(boolean var1) {
      this.field_34613 = var1;
   }

   public boolean method_30707() {
      return this.method_30714() && !this.field_34613;
   }

   @Nullable
   @Override
   public class_1899 method_8638(class_6331 var1, class_1899 var2) {
      class_6704 var5 = EntityType.field_34306.method_30484(var1);
      if (var5 != null) {
         var5.method_26883();
      }

      return var5;
   }

   @Override
   public boolean method_24870() {
      return !class_6902.method_31623(this) && super.method_24870();
   }

   @Override
   public class_562 method_37197() {
      return class_562.field_3332;
   }

   @Override
   public SoundEvent method_26918() {
      return !this.world.field_33055 ? class_6902.method_31618(this).orElse((SoundEvent)null) : null;
   }

   @Override
   public SoundEvent method_26541(DamageSource var1) {
      return SoundEvents.field_2463;
   }

   @Override
   public SoundEvent method_26599() {
      return SoundEvents.field_2667;
   }

   @Override
   public SoundEvent method_37239() {
      return SoundEvents.field_1986;
   }

   @Override
   public SoundEvent method_37133() {
      return SoundEvents.field_2384;
   }

   @Override
   public void method_37207(BlockPos var1, class_2522 var2) {
      this.method_37155(SoundEvents.field_2064, 0.15F, 1.0F);
   }

   public void method_30706(SoundEvent var1) {
      this.method_37155(var1, this.method_26439(), this.method_26547());
   }

   @Override
   public void method_26929() {
      super.method_26929();
      class_1892.method_8440(this);
   }
}
