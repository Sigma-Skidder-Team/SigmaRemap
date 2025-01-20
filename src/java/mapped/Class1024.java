package mapped;

import com.google.common.collect.Maps;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.attributes.MutableAttribute;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.ListNBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Difficulty;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraft.world.raid.Raid;

import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

public class Class1024 extends Class1025 implements Class1023 {
   private static final DataParameter<Boolean> field5710 = EntityDataManager.<Boolean>createKey(Class1024.class, DataSerializers.BOOLEAN);
   private final Class927 field5711 = new Class927(5);

   public Class1024(EntityType<? extends Class1024> var1, World var2) {
      super(var1, var2);
   }

   @Override
   public void method4219() {
      super.method4219();
      this.field5600.addGoal(0, new Class2603(this));
      this.field5600.addGoal(2, new Class2759(this, this, 10.0F));
      this.field5600.addGoal(3, new Class2691<Class1024>(this, 1.0, 8.0F));
      this.field5600.addGoal(8, new Class2736(this, 0.6));
      this.field5600.addGoal(9, new Class2612(this, PlayerEntity.class, 15.0F, 1.0F));
      this.field5600.addGoal(10, new Class2612(this, MobEntity.class, 15.0F));
      this.field5601.addGoal(1, new HurtByTargetGoal(this, Class1026.class).method10918());
      this.field5601.addGoal(2, new NearestAttackableTargetGoal<PlayerEntity>(this, PlayerEntity.class, true));
      this.field5601.addGoal(3, new NearestAttackableTargetGoal<Class1043>(this, Class1043.class, false));
      this.field5601.addGoal(3, new NearestAttackableTargetGoal<IronGolemEntity>(this, IronGolemEntity.class, true));
   }

   public static MutableAttribute method4541() {
      return MonsterEntity.method4343()
         .method21849(Attributes.MOVEMENT_SPEED, 0.35F)
         .method21849(Attributes.MAX_HEALTH, 24.0)
         .method21849(Attributes.ATTACK_DAMAGE, 5.0)
         .method21849(Attributes.FOLLOW_RANGE, 32.0);
   }

   @Override
   public void registerData() {
      super.registerData();
      this.dataManager.register(field5710, false);
   }

   @Override
   public boolean method4234(Class3262 var1) {
      return var1 == Items.CROSSBOW;
   }

   public boolean method4542() {
      return this.dataManager.<Boolean>method35445(field5710);
   }

   @Override
   public void method4535(boolean var1) {
      this.dataManager.set(field5710, var1);
   }

   @Override
   public void method4537() {
      this.idleTime = 0;
   }

   @Override
   public void writeAdditional(CompoundNBT compound) {
      super.writeAdditional(compound);
      ListNBT var4 = new ListNBT();

      for (int var5 = 0; var5 < this.field5711.getSizeInventory(); var5++) {
         ItemStack var6 = this.field5711.getStackInSlot(var5);
         if (!var6.isEmpty()) {
            var4.add(var6.method32112(new CompoundNBT()));
         }
      }

      compound.put("Inventory", var4);
   }

   @Override
   public Class2117 method4543() {
      if (!this.method4542()) {
         if (!this.method3092(Items.CROSSBOW)) {
            return !this.method4307() ? Class2117.field13801 : Class2117.field13795;
         } else {
            return Class2117.field13798;
         }
      } else {
         return Class2117.field13799;
      }
   }

   @Override
   public void readAdditional(CompoundNBT compound) {
      super.readAdditional(compound);
      ListNBT var4 = compound.getList("Inventory", 10);

      for (int var5 = 0; var5 < var4.size(); var5++) {
         ItemStack var6 = ItemStack.read(var4.getCompound(var5));
         if (!var6.isEmpty()) {
            this.field5711.method3676(var6);
         }
      }

      this.method4281(true);
   }

   @Override
   public float getBlockPathWeight(BlockPos var1, IWorldReader var2) {
      BlockState var5 = var2.getBlockState(var1.down());
      return !var5.isIn(Blocks.GRASS_BLOCK) && !var5.isIn(Blocks.SAND) ? 0.5F - var2.method7009(var1) : 10.0F;
   }

   @Override
   public int method4267() {
      return 1;
   }

   @Nullable
   @Override
   public Class5093 method4276(ServerWorldAccess var1, Class9755 var2, SpawnReason var3, Class5093 var4, CompoundNBT var5) {
      this.method4270(var2);
      this.method4273(var2);
      return super.method4276(var1, var2, var3, var4, var5);
   }

   @Override
   public void method4270(Class9755 var1) {
      this.setItemStackToSlot(EquipmentSlotType.MAINHAND, new ItemStack(Items.CROSSBOW));
   }

   @Override
   public void method4274(float var1) {
      super.method4274(var1);
      if (this.rand.nextInt(300) == 0) {
         ItemStack var4 = this.getHeldItemMainhand();
         if (var4.getItem() == Items.CROSSBOW) {
            Map var5 = EnchantmentHelper.method26312(var4);
            var5.putIfAbsent(Enchantments.PIERCING, 1);
            EnchantmentHelper.method26314(var5, var4);
            this.setItemStackToSlot(EquipmentSlotType.MAINHAND, var4);
         }
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
   public SoundEvent getAmbientSound() {
      return SoundEvents.field26945;
   }

   @Override
   public SoundEvent getDeathSound() {
      return SoundEvents.field26947;
   }

   @Override
   public SoundEvent getHurtSound(DamageSource var1) {
      return SoundEvents.field26948;
   }

   @Override
   public void method4530(LivingEntity var1, float var2) {
      this.method4538(this, 1.6F);
   }

   @Override
   public void method4536(LivingEntity var1, ItemStack var2, ProjectileEntity var3, float var4) {
      this.method4539(this, var1, var3, var4, 1.6F);
   }

   @Override
   public void method4246(ItemEntity var1) {
      ItemStack var4 = var1.method4124();
      if (!(var4.getItem() instanceof Class3301)) {
         Item var5 = var4.getItem();
         if (this.method4544(var5)) {
            this.triggerItemPickupTrigger(var1);
            ItemStack var6 = this.field5711.method3676(var4);
            if (!var6.isEmpty()) {
               var4.setCount(var6.getCount());
            } else {
               var1.remove();
            }
         }
      } else {
         super.method4246(var1);
      }
   }

   private boolean method4544(Item var1) {
      return this.method4552() && var1 == Items.field38092;
   }

   @Override
   public boolean method2963(int var1, ItemStack var2) {
      if (!super.method2963(var1, var2)) {
         int var5 = var1 - 300;
         if (var5 >= 0 && var5 < this.field5711.getSizeInventory()) {
            this.field5711.setInventorySlotContents(var5, var2);
            return true;
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   @Override
   public void method4545(int var1, boolean var2) {
      Raid var5 = this.method4551();
      boolean var6 = this.rand.nextFloat() <= var5.method25436();
      if (var6) {
         ItemStack var7 = new ItemStack(Items.CROSSBOW);
         HashMap var8 = Maps.newHashMap();
         if (var1 <= var5.method25435(Difficulty.NORMAL)) {
            if (var1 > var5.method25435(Difficulty.EASY)) {
               var8.put(Enchantments.QUICK_CHARGE, 1);
            }
         } else {
            var8.put(Enchantments.QUICK_CHARGE, 2);
         }

         var8.put(Enchantments.MULTISHOT, 1);
         EnchantmentHelper.method26314(var8, var7);
         this.setItemStackToSlot(EquipmentSlotType.MAINHAND, var7);
      }
   }

   @Override
   public SoundEvent method4546() {
      return SoundEvents.field26946;
   }
}
