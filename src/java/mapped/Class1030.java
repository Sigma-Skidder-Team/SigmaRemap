package mapped;

import com.google.common.collect.Maps;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.Difficulty;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.Random;
import java.util.function.Predicate;

public class Class1030 extends Class1025 {
   private static final Predicate<Difficulty> field5731 = var0 -> var0 == Difficulty.NORMAL || var0 == Difficulty.HARD;
   private boolean field5732;

   public Class1030(EntityType<? extends Class1030> var1, World var2) {
      super(var1, var2);
   }

   @Override
   public void method4219() {
      super.method4219();
      this.field5600.addGoal(0, new Class2603(this));
      this.field5600.addGoal(1, new Class2644(this));
      this.field5600.addGoal(2, new Class2646(this, this));
      this.field5600.addGoal(3, new Class2759(this, this, 10.0F));
      this.field5600.addGoal(4, new Class2656(this, this));
      this.field5601.addGoal(1, new HurtByTargetGoal(this, Class1026.class).method10918());
      this.field5601.addGoal(2, new NearestAttackableTargetGoal<PlayerEntity>(this, PlayerEntity.class, true));
      this.field5601.addGoal(3, new NearestAttackableTargetGoal<Class1043>(this, Class1043.class, true));
      this.field5601.addGoal(3, new NearestAttackableTargetGoal<Class1058>(this, Class1058.class, true));
      this.field5601.addGoal(4, new Class2713(this));
      this.field5600.addGoal(8, new Class2736(this, 0.6));
      this.field5600.addGoal(9, new Class2612(this, PlayerEntity.class, 3.0F, 1.0F));
      this.field5600.addGoal(10, new Class2612(this, MobEntity.class, 8.0F));
   }

   @Override
   public void updateAITasks() {
      if (!this.method4305() && Class8100.method28053(this)) {
         boolean var3 = ((ServerWorld)this.world).method6958(this.getPosition());
         ((Class6991)this.method4230()).method21682(var3);
      }

      super.updateAITasks();
   }

   public static Class7037 method4589() {
      return Class1009.method4343()
         .method21849(Attributes.MOVEMENT_SPEED, 0.35F)
         .method21849(Attributes.field42106, 12.0)
         .method21849(Attributes.field42105, 24.0)
         .method21849(Attributes.ATTACK_DAMAGE, 5.0);
   }

   @Override
   public void writeAdditional(CompoundNBT var1) {
      super.writeAdditional(var1);
      if (this.field5732) {
         var1.putBoolean("Johnny", true);
      }
   }

   @Override
   public Class2117 method4543() {
      if (!this.method4307()) {
         return !this.method4555() ? Class2117.field13794 : Class2117.field13800;
      } else {
         return Class2117.field13795;
      }
   }

   @Override
   public void readAdditional(CompoundNBT var1) {
      super.readAdditional(var1);
      if (var1.contains("Johnny", 99)) {
         this.field5732 = var1.getBoolean("Johnny");
      }
   }

   @Override
   public SoundEvent method4546() {
      return SoundEvents.field27210;
   }

   @Nullable
   @Override
   public Class5093 method4276(Class1659 var1, Class9755 var2, Class2202 var3, Class5093 var4, CompoundNBT var5) {
      Class5093 var8 = super.method4276(var1, var2, var3, var4, var5);
      ((Class6991)this.method4230()).method21682(true);
      this.method4270(var2);
      this.method4273(var2);
      return var8;
   }

   @Override
   public void method4270(Class9755 var1) {
      if (this.method4551() == null) {
         this.setItemStackToSlot(EquipmentSlotType.MAINHAND, new ItemStack(Items.field37823));
      }
   }

   @Override
   public boolean isOnSameTeam(Entity var1) {
      if (super.isOnSameTeam(var1)) {
         return true;
      } else {
         return var1 instanceof LivingEntity && ((LivingEntity)var1).getCreatureAttribute() == CreatureAttribute.field33508
            ? this.getTeam() == null && var1.getTeam() == null
            : false;
      }
   }

   @Override
   public void method3379(ITextComponent var1) {
      super.method3379(var1);
      if (!this.field5732 && var1 != null && var1.getString().equals("Johnny")) {
         this.field5732 = true;
      }
   }

   @Override
   public SoundEvent getAmbientSound() {
      return SoundEvents.field27209;
   }

   @Override
   public SoundEvent getDeathSound() {
      return SoundEvents.field27211;
   }

   @Override
   public SoundEvent getHurtSound(DamageSource var1) {
      return SoundEvents.field27212;
   }

   @Override
   public void method4545(int var1, boolean var2) {
      ItemStack var5 = new ItemStack(Items.field37823);
      Class7699 var6 = this.method4551();
      int var7 = 1;
      if (var1 > var6.method25435(Difficulty.NORMAL)) {
         var7 = 2;
      }

      boolean var8 = this.rand.nextFloat() <= var6.method25436();
      if (var8) {
         HashMap var9 = Maps.newHashMap();
         var9.put(Enchantments.SHARPNESS, var7);
         EnchantmentHelper.method26314(var9, var5);
      }

      this.setItemStackToSlot(EquipmentSlotType.MAINHAND, var5);
   }

   // $VF: synthetic method
   public static Predicate method4591() {
      return field5731;
   }

   // $VF: synthetic method
   public static Random method4592(Class1030 var0) {
      return var0.rand;
   }

   // $VF: synthetic method
   public static boolean method4593(Class1030 var0) {
      return var0.field5732;
   }
}
