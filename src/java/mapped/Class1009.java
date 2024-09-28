package mapped;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Difficulty;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;

import java.util.Random;
import java.util.function.Predicate;

public abstract class Class1009 extends Class1046 implements Class1008 {
   public Class1009(EntityType<? extends Class1009> var1, World var2) {
      super(var1, var2);
      this.field5594 = 5;
   }

   @Override
   public Class2266 method2864() {
      return Class2266.field14733;
   }

   @Override
   public void livingTick() {
      this.updateArmSwingProgress();
      this.method4338();
      super.livingTick();
   }

   public void method4338() {
      float var3 = this.getBrightness();
      if (var3 > 0.5F) {
         this.field4973 += 2;
      }
   }

   @Override
   public boolean method4256() {
      return true;
   }

   @Override
   public SoundEvent method2859() {
      return SoundEvents.field26685;
   }

   @Override
   public SoundEvent method2860() {
      return SoundEvents.field26684;
   }

   @Override
   public boolean attackEntityFrom(DamageSource var1, float var2) {
      return !this.isInvulnerableTo(var1) ? super.attackEntityFrom(var1, var2) : false;
   }

   @Override
   public SoundEvent getHurtSound(DamageSource var1) {
      return SoundEvents.field26682;
   }

   @Override
   public SoundEvent getDeathSound() {
      return SoundEvents.field26681;
   }

   @Override
   public SoundEvent getFallSound(int var1) {
      return var1 <= 4 ? SoundEvents.field26683 : SoundEvents.field26680;
   }

   @Override
   public float method4339(BlockPos var1, IWorldReader var2) {
      return 0.5F - var2.method7009(var1);
   }

   public static boolean method4340(Class1659 var0, BlockPos var1, Random var2) {
      if (var0.getLightFor(LightType.SKY, var1) <= var2.nextInt(32)) {
         int var5 = !var0.method6970().method6794() ? var0.method7015(var1) : var0.method7016(var1, 10);
         return var5 <= var2.nextInt(8);
      } else {
         return false;
      }
   }

   public static boolean method4341(EntityType<? extends Class1009> var0, Class1659 var1, Class2202 var2, BlockPos var3, Random var4) {
      return var1.method6997() != Difficulty.field14351 && method4340(var1, var3, var4) && method4264(var0, var1, var2, var3, var4);
   }

   public static boolean method4342(EntityType<? extends Class1009> var0, Class1660 var1, Class2202 var2, BlockPos var3, Random var4) {
      return var1.method6997() != Difficulty.field14351 && method4264(var0, var1, var2, var3, var4);
   }

   public static Class7037 method4343() {
      return MobEntity.method4220().method21848(Attributes.ATTACK_DAMAGE);
   }

   @Override
   public boolean canDropLoot() {
      return true;
   }

   @Override
   public boolean method3010() {
      return true;
   }

   public boolean method4344(PlayerEntity var1) {
      return true;
   }

   @Override
   public ItemStack findAmmo(ItemStack var1) {
      if (!(var1.getItem() instanceof Class3262)) {
         return ItemStack.EMPTY;
      } else {
         Predicate var4 = ((Class3262)var1.getItem()).method11751();
         ItemStack var5 = Class3262.method11774(this, var4);
         return !var5.isEmpty() ? var5 : new ItemStack(Items.field37797);
      }
   }
}
