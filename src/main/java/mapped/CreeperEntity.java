package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.attributes.MutableAttribute;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.potion.EffectInstance;
import net.minecraft.util.*;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.Collection;

public class CreeperEntity extends MonsterEntity implements Class1080 {
   private static final DataParameter<Integer> field5938 = EntityDataManager.<Integer>createKey(CreeperEntity.class, DataSerializers.VARINT);
   private static final DataParameter<Boolean> field5939 = EntityDataManager.<Boolean>createKey(CreeperEntity.class, DataSerializers.BOOLEAN);
   private static final DataParameter<Boolean> field5940 = EntityDataManager.<Boolean>createKey(CreeperEntity.class, DataSerializers.BOOLEAN);
   private int field5941;
   private int field5942;
   private int field5943 = 30;
   private int field5944 = 3;
   private int field5945;

   public CreeperEntity(EntityType<? extends CreeperEntity> var1, World var2) {
      super(var1, var2);
   }

   @Override
   public void method4219() {
      this.field5600.addGoal(1, new Class2603(this));
      this.field5600.addGoal(2, new Class2627(this));
      this.field5600.addGoal(3, new Class2770<OcelotEntity>(this, OcelotEntity.class, 6.0F, 1.0, 1.2));
      this.field5600.addGoal(3, new Class2770<CatEntity>(this, CatEntity.class, 6.0F, 1.0, 1.2));
      this.field5600.addGoal(4, new Class2647(this, 1.0, false));
      this.field5600.addGoal(5, new WaterAvoidingRandomWalkingGoal(this, 0.8));
      this.field5600.addGoal(6, new Class2612(this, PlayerEntity.class, 8.0F));
      this.field5600.addGoal(6, new Class2668(this));
      this.field5601.addGoal(1, new NearestAttackableTargetGoal<PlayerEntity>(this, PlayerEntity.class, true));
      this.field5601.addGoal(2, new HurtByTargetGoal(this));
   }

   public static MutableAttribute method5018() {
      return MonsterEntity.method4343().method21849(Attributes.MOVEMENT_SPEED, 0.25);
   }

   @Override
   public int getMaxFallHeight() {
      return this.getAttackTarget() != null ? 3 + (int)(this.getHealth() - 1.0F) : 3;
   }

   @Override
   public boolean onLivingFall(float var1, float var2) {
      boolean var5 = super.onLivingFall(var1, var2);
      this.field5942 = (int)((float)this.field5942 + var1 * 1.5F);
      if (this.field5942 > this.field5943 - 5) {
         this.field5942 = this.field5943 - 5;
      }

      return var5;
   }

   @Override
   public void registerData() {
      super.registerData();
      this.dataManager.register(field5938, -1);
      this.dataManager.register(field5939, false);
      this.dataManager.register(field5940, false);
   }

   @Override
   public void writeAdditional(CompoundNBT compound) {
      super.writeAdditional(compound);
      if (this.dataManager.<Boolean>method35445(field5939)) {
         compound.putBoolean("powered", true);
      }

      compound.putShort("Fuse", (short)this.field5943);
      compound.putByte("ExplosionRadius", (byte)this.field5944);
      compound.putBoolean("ignited", this.method5024());
   }

   @Override
   public void readAdditional(CompoundNBT compound) {
      super.readAdditional(compound);
      this.dataManager.set(field5939, compound.getBoolean("powered"));
      if (compound.contains("Fuse", 99)) {
         this.field5943 = compound.getShort("Fuse");
      }

      if (compound.contains("ExplosionRadius", 99)) {
         this.field5944 = compound.getByte("ExplosionRadius");
      }

      if (compound.getBoolean("ignited")) {
         this.method5025();
      }
   }

   @Override
   public void tick() {
      if (this.isAlive()) {
         this.field5941 = this.field5942;
         if (this.method5024()) {
            this.method5021(1);
         }

         int var3 = this.method5020();
         if (var3 > 0 && this.field5942 == 0) {
            this.playSound(SoundEvents.field26484, 1.0F, 0.5F);
         }

         this.field5942 += var3;
         if (this.field5942 < 0) {
            this.field5942 = 0;
         }

         if (this.field5942 >= this.field5943) {
            this.field5942 = this.field5943;
            this.method5022();
         }
      }

      super.tick();
   }

   @Override
   public SoundEvent getHurtSound(DamageSource var1) {
      return SoundEvents.field26483;
   }

   @Override
   public SoundEvent getDeathSound() {
      return SoundEvents.field26482;
   }

   @Override
   public void dropSpecialItems(DamageSource var1, int var2, boolean var3) {
      super.dropSpecialItems(var1, var2, var3);
      Entity var6 = var1.getTrueSource();
      if (var6 != this && var6 instanceof CreeperEntity) {
         CreeperEntity var7 = (CreeperEntity)var6;
         if (var7.method5026()) {
            var7.method5027();
            this.entityDropItem(Items.field38062);
         }
      }
   }

   @Override
   public boolean attackEntityAsMob(Entity var1) {
      return true;
   }

   @Override
   public boolean method5016() {
      return this.dataManager.<Boolean>method35445(field5939);
   }

   public float method5019(float var1) {
      return MathHelper.lerp(var1, (float)this.field5941, (float)this.field5942) / (float)(this.field5943 - 2);
   }

   public int method5020() {
      return this.dataManager.<Integer>method35445(field5938);
   }

   public void method5021(int var1) {
      this.dataManager.set(field5938, var1);
   }

   @Override
   public void method3353(ServerWorld var1, LightningBoltEntity var2) {
      super.method3353(var1, var2);
      this.dataManager.set(field5939, true);
   }

   @Override
   public ActionResultType method4285(PlayerEntity var1, Hand var2) {
      ItemStack var5 = var1.getHeldItem(var2);
      if (var5.getItem() != Items.FLINT_AND_STEEL) {
         return super.method4285(var1, var2);
      } else {
         this.world
            .playSound(
               var1,
               this.getPosX(),
               this.getPosY(),
               this.getPosZ(),
               SoundEvents.field26587,
               this.getSoundCategory(),
               1.0F,
               this.rand.nextFloat() * 0.4F + 0.8F
            );
         if (!this.world.isRemote) {
            this.method5025();
            var5.damageItem(1, var1, var1x -> var1x.sendBreakAnimation(var2));
         }

         return ActionResultType.method9002(this.world.isRemote);
      }
   }

   private void method5022() {
      if (!this.world.isRemote) {
         Class2141 var3 = !this.world.getGameRules().getBoolean(GameRules.field24224) ? Class2141.field14014 : Class2141.field14016;
         float var4 = !this.method5016() ? 1.0F : 2.0F;
         this.dead = true;
         this.world.method6755(this, this.getPosX(), this.getPosY(), this.getPosZ(), (float)this.field5944 * var4, var3);
         this.remove();
         this.method5023();
      }
   }

   private void method5023() {
      Collection<EffectInstance> var3 = this.getActivePotionEffects();
      if (!var3.isEmpty()) {
         AreaEffectCloudEntity var4 = new AreaEffectCloudEntity(this.world, this.getPosX(), this.getPosY(), this.getPosZ());
         var4.method4097(2.5F);
         var4.method4110(-0.5F);
         var4.method4112(10);
         var4.method4109(var4.method4108() / 2);
         var4.method4111(-var4.method4098() / (float)var4.method4108());

         for (EffectInstance var6 : var3) {
            var4.method4101(new EffectInstance(var6));
         }

         this.world.addEntity(var4);
      }
   }

   public boolean method5024() {
      return this.dataManager.<Boolean>method35445(field5940);
   }

   public void method5025() {
      this.dataManager.set(field5940, true);
   }

   public boolean method5026() {
      return this.method5016() && this.field5945 < 1;
   }

   public void method5027() {
      this.field5945++;
   }
}
