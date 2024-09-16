package mapped;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import org.apache.commons.lang3.tuple.Pair;

import java.util.Optional;
import java.util.Random;
import java.util.UUID;

public class Class1086 extends Class1087 implements Class1020 {
   private static final DataParameter<String> field5951 = EntityDataManager.<String>createKey(Class1086.class, DataSerializers.field33393);
   private Effect field5952;
   private int field5953;
   private UUID field5954;

   public Class1086(EntityType<? extends Class1086> var1, World var2) {
      super(var1, var2);
   }

   @Override
   public float method4339(BlockPos var1, Class1662 var2) {
      return !var2.getBlockState(var1.down()).isIn(Blocks.MYCELIUM) ? var2.method7009(var1) - 0.5F : 10.0F;
   }

   public static boolean method5034(EntityType<Class1086> var0, Class1660 var1, Class2202 var2, BlockPos var3, Random var4) {
      return var1.getBlockState(var3.down()).isIn(Blocks.MYCELIUM) && var1.method7021(var3, 0) > 8;
   }

   @Override
   public void method3353(ServerWorld var1, Class906 var2) {
      UUID var5 = var2.getUniqueID();
      if (!var5.equals(this.field5954)) {
         this.method5036(this.method5037() != Class2210.field14452 ? Class2210.field14452 : Class2210.field14453);
         this.field5954 = var5;
         this.playSound(SoundEvents.field26765, 2.0F, 1.0F);
      }
   }

   @Override
   public void registerData() {
      super.registerData();
      this.dataManager.register(field5951, Class2210.method8936(Class2210.field14452));
   }

   @Override
   public ActionResultType method4285(PlayerEntity var1, Hand var2) {
      ItemStack var5 = var1.getHeldItem(var2);
      if (var5.getItem() == Items.field37836 && !this.isChild()) {
         boolean var11 = false;
         ItemStack var12;
         if (this.field5952 == null) {
            var12 = new ItemStack(Items.field37837);
         } else {
            var11 = true;
            var12 = new ItemStack(Items.field38149);
            Class3284.method11816(var12, this.field5952, this.field5953);
            this.field5952 = null;
            this.field5953 = 0;
         }

         ItemStack var13 = Class8482.method29978(var5, var1, var12, false);
         var1.setHeldItem(var2, var13);
         SoundEvent var9;
         if (!var11) {
            var9 = SoundEvents.field26767;
         } else {
            var9 = SoundEvents.field26768;
         }

         this.playSound(var9, 1.0F, 1.0F);
         return ActionResultType.method9002(this.world.isRemote);
      } else if (var5.getItem() == Items.field37956 && this.method4516()) {
         this.method4515(Class2266.field14735);
         if (!this.world.isRemote) {
            var5.method32121(1, var1, var1x -> var1x.sendBreakAnimation(var2));
         }

         return ActionResultType.method9002(this.world.isRemote);
      } else if (this.method5037() == Class2210.field14453 && var5.getItem().method11743(Class5985.field26103)) {
         if (this.field5952 == null) {
            Optional var6 = this.method5035(var5);
            if (!var6.isPresent()) {
               return ActionResultType.field14820;
            }

            Pair var7 = (Pair)var6.get();
            if (!var1.abilities.isCreativeMode) {
               var5.method32182(1);
            }

            for (int var8 = 0; var8 < 4; var8++) {
               this.world
                  .addParticle(
                     ParticleTypes.field34063,
                     this.getPosX() + this.rand.nextDouble() / 2.0,
                     this.getPosYHeight(0.5),
                     this.getPosZ() + this.rand.nextDouble() / 2.0,
                     0.0,
                     this.rand.nextDouble() / 5.0,
                     0.0
                  );
            }

            this.field5952 = (Effect)var7.getLeft();
            this.field5953 = (Integer)var7.getRight();
            this.playSound(SoundEvents.field26766, 2.0F, 1.0F);
         } else {
            for (int var10 = 0; var10 < 2; var10++) {
               this.world
                  .addParticle(
                     ParticleTypes.field34092,
                     this.getPosX() + this.rand.nextDouble() / 2.0,
                     this.getPosYHeight(0.5),
                     this.getPosZ() + this.rand.nextDouble() / 2.0,
                     0.0,
                     this.rand.nextDouble() / 5.0,
                     0.0
                  );
            }
         }

         return ActionResultType.method9002(this.world.isRemote);
      } else {
         return super.method4285(var1, var2);
      }
   }

   @Override
   public void method4515(Class2266 var1) {
      this.world.method6744((PlayerEntity)null, this, SoundEvents.field26769, var1, 1.0F, 1.0F);
      if (!this.world.isRemote()) {
         ((ServerWorld)this.world).spawnParticle(ParticleTypes.field34070, this.getPosX(), this.getPosYHeight(0.5), this.getPosZ(), 1, 0.0, 0.0, 0.0, 0.0);
         this.remove();
         Class1087 var4 = EntityType.field41016.create(this.world);
         var4.setLocationAndAngles(this.getPosX(), this.getPosY(), this.getPosZ(), this.rotationYaw, this.rotationPitch);
         var4.setHealth(this.getHealth());
         var4.renderYawOffset = this.renderYawOffset;
         if (this.method3381()) {
            var4.method3379(this.method3380());
            var4.method3382(this.method3383());
         }

         if (this.method4282()) {
            var4.method4278();
         }

         var4.method3363(this.method3362());
         this.world.addEntity(var4);

         for (int var5 = 0; var5 < 5; var5++) {
            this.world
               .addEntity(
                  new ItemEntity(
                     this.world,
                     this.getPosX(),
                     this.getPosYHeight(1.0),
                     this.getPosZ(),
                     new ItemStack(Class2210.method8937(this.method5037()).getBlock())
                  )
               );
         }
      }
   }

   @Override
   public boolean method4516() {
      return this.isAlive() && !this.isChild();
   }

   @Override
   public void writeAdditional(CompoundNBT var1) {
      super.writeAdditional(var1);
      var1.method109("Type", Class2210.method8936(this.method5037()));
      if (this.field5952 != null) {
         var1.method100("EffectId", (byte) Effect.getId(this.field5952));
         var1.putInt("EffectDuration", this.field5953);
      }
   }

   @Override
   public void readAdditional(CompoundNBT var1) {
      super.readAdditional(var1);
      this.method5036(Class2210.method8938(var1.getString("Type")));
      if (var1.contains("EffectId", 1)) {
         this.field5952 = Effect.get(var1.getByte("EffectId"));
      }

      if (var1.contains("EffectDuration", 3)) {
         this.field5953 = var1.getInt("EffectDuration");
      }
   }

   private Optional<Pair<Effect, Integer>> method5035(ItemStack var1) {
      Item var4 = var1.getItem();
      if (var4 instanceof Class3292) {
         Block var5 = ((Class3292)var4).method11845();
         if (var5 instanceof Class3490) {
            Class3490 var6 = (Class3490)var5;
            return Optional.<Pair<Effect, Integer>>of(Pair.of(var6.method12186(), var6.method12187()));
         }
      }

      return Optional.<Pair<Effect, Integer>>empty();
   }

   private void method5036(Class2210 var1) {
      this.dataManager.method35446(field5951, Class2210.method8936(var1));
   }

   public Class2210 method5037() {
      return Class2210.method8938(this.dataManager.<String>method35445(field5951));
   }

   public Class1086 method4389(ServerWorld var1, Class1045 var2) {
      Class1086 var5 = EntityType.field41058.create(var1);
      var5.method5036(this.method5038((Class1086)var2));
      return var5;
   }

   private Class2210 method5038(Class1086 var1) {
      Class2210 var4 = this.method5037();
      Class2210 var5 = var1.method5037();
      Class2210 var6;
      if (var4 == var5 && this.rand.nextInt(1024) == 0) {
         var6 = var4 != Class2210.field14453 ? Class2210.field14453 : Class2210.field14452;
      } else {
         var6 = !this.rand.nextBoolean() ? var5 : var4;
      }

      return var6;
   }
}
