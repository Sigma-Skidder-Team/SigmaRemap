package mapped;

import net.minecraft.entity.passive.WolfEntity;
import net.minecraft.block.BlockState;
import net.minecraft.client.util.Util;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import javax.annotation.Nullable;
import java.util.Random;

public class Class1094 extends Class1018 {
   private static final DataParameter<Integer> field5986 = EntityDataManager.<Integer>createKey(Class1094.class, DataSerializers.VARINT);
   private static final ResourceLocation field5987 = new ResourceLocation("killer_bunny");
   private int field5988;
   private int field5989;
   private boolean field5990;
   private int field5991;
   private int field5992;

   public Class1094(EntityType<? extends Class1094> var1, World var2) {
      super(var1, var2);
      this.field5597 = new Class7955(this, this);
      this.field5596 = new Class6840(this);
      this.method5104(0.0);
   }

   @Override
   public void method4219() {
      this.field5600.addGoal(1, new Class2603(this));
      this.field5600.addGoal(1, new Class2749(this, 2.2));
      this.field5600.addGoal(2, new Class2785(this, 0.8));
      this.field5600.addGoal(3, new Class2680(this, 1.0, Class120.method339(Items.field38052, Items.field38057, Blocks.DANDELION), false));
      this.field5600.addGoal(4, new Class2772<PlayerEntity>(this, PlayerEntity.class, 8.0F, 2.2, 2.2));
      this.field5600.addGoal(4, new Class2772<WolfEntity>(this, WolfEntity.class, 10.0F, 2.2, 2.2));
      this.field5600.addGoal(4, new Class2772<Class1009>(this, Class1009.class, 4.0F, 2.2, 2.2));
      this.field5600.addGoal(5, new Class2634(this));
      this.field5600.addGoal(6, new WaterAvoidingRandomWalkingGoal(this, 0.6));
      this.field5600.addGoal(11, new Class2612(this, PlayerEntity.class, 10.0F));
   }

   @Override
   public float getJumpUpwardsMotion() {
      if (!this.collidedHorizontally && (!this.field5596.method20811() || !(this.field5596.method20818() > this.getPosY() + 0.5))) {
         Class8238 var3 = this.field5599.method21657();
         if (var3 != null && !var3.method28693()) {
            Vector3d var4 = var3.method28703(this);
            if (var4.y > this.getPosY() + 0.5) {
               return 0.5F;
            }
         }

         return !(this.field5596.method20812() <= 0.6) ? 0.3F : 0.2F;
      } else {
         return 0.5F;
      }
   }

   @Override
   public void jump() {
      super.jump();
      double var3 = this.field5596.method20812();
      if (var3 > 0.0) {
         double var5 = horizontalMag(this.getMotion());
         if (var5 < 0.01) {
            this.moveRelative(0.1F, new Vector3d(0.0, 0.0, 1.0));
         }
      }

      if (!this.world.isRemote) {
         this.world.setEntityState(this, (byte)1);
      }
   }

   public float method5103(float var1) {
      return this.field5989 != 0 ? ((float)this.field5988 + var1) / (float)this.field5989 : 0.0F;
   }

   public void method5104(double var1) {
      this.method4230().method21645(var1);
      this.field5596.method20813(this.field5596.method20817(), this.field5596.method20818(), this.field5596.method20819(), var1);
   }

   @Override
   public void setJumping(boolean var1) {
      super.setJumping(var1);
      if (var1) {
         this.playSound(this.method5112(), this.getSoundVolume(), ((this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F) * 0.8F);
      }
   }

   public void method5105() {
      this.setJumping(true);
      this.field5989 = 10;
      this.field5988 = 0;
   }

   @Override
   public void registerData() {
      super.registerData();
      this.dataManager.register(field5986, 0);
   }

   @Override
   public void updateAITasks() {
      if (this.field5991 > 0) {
         this.field5991--;
      }

      if (this.field5992 > 0) {
         this.field5992 = this.field5992 - this.rand.nextInt(3);
         if (this.field5992 < 0) {
            this.field5992 = 0;
         }
      }

      if (this.onGround) {
         if (!this.field5990) {
            this.setJumping(false);
            this.method5110();
         }

         if (this.method5114() == 99 && this.field5991 == 0) {
            LivingEntity var3 = this.method4232();
            if (var3 != null && this.getDistanceSq(var3) < 16.0) {
               this.method5106(var3.getPosX(), var3.getPosZ());
               this.field5596.method20813(var3.getPosX(), var3.getPosY(), var3.getPosZ(), this.field5596.method20812());
               this.method5105();
               this.field5990 = true;
            }
         }

         Class7955 var6 = (Class7955)this.field5597;
         if (var6.method27045()) {
            if (!var6.method27046()) {
               this.method5107();
            }
         } else if (this.field5596.method20811() && this.field5991 == 0) {
            Class8238 var4 = this.field5599.method21657();
            Vector3d var5 = new Vector3d(this.field5596.method20817(), this.field5596.method20818(), this.field5596.method20819());
            if (var4 != null && !var4.method28693()) {
               var5 = var4.method28703(this);
            }

            this.method5106(var5.x, var5.z);
            this.method5105();
         }
      }

      this.field5990 = this.onGround;
   }

   @Override
   public boolean method3261() {
      return false;
   }

   private void method5106(double var1, double var3) {
      this.rotationYaw = (float)(MathHelper.method37814(var3 - this.getPosZ(), var1 - this.getPosX()) * 180.0F / (float)Math.PI) - 90.0F;
   }

   private void method5107() {
      ((Class7955)this.field5597).method27047(true);
   }

   private void method5108() {
      ((Class7955)this.field5597).method27047(false);
   }

   private void method5109() {
      if (!(this.field5596.method20812() < 2.2)) {
         this.field5991 = 1;
      } else {
         this.field5991 = 10;
      }
   }

   private void method5110() {
      this.method5109();
      this.method5108();
   }

   @Override
   public void livingEntity() {
      super.livingEntity();
      if (this.field5988 == this.field5989) {
         if (this.field5989 != 0) {
            this.field5988 = 0;
            this.field5989 = 0;
            this.setJumping(false);
         }
      } else {
         this.field5988++;
      }
   }

   public static Class7037 method5111() {
      return MobEntity.method4220().method21849(Attributes.field42105, 3.0).method21849(Attributes.MOVEMENT_SPEED, 0.3F);
   }

   @Override
   public void writeAdditional(CompoundNBT var1) {
      super.writeAdditional(var1);
      var1.putInt("RabbitType", this.method5114());
      var1.putInt("MoreCarrotTicks", this.field5992);
   }

   @Override
   public void readAdditional(CompoundNBT var1) {
      super.readAdditional(var1);
      this.method5115(var1.getInt("RabbitType"));
      this.field5992 = var1.getInt("MoreCarrotTicks");
   }

   public SoundEvent method5112() {
      return SoundEvents.field26991;
   }

   @Override
   public SoundEvent getAmbientSound() {
      return SoundEvents.field26987;
   }

   @Override
   public SoundEvent getHurtSound(DamageSource var1) {
      return SoundEvents.field26990;
   }

   @Override
   public SoundEvent getDeathSound() {
      return SoundEvents.field26989;
   }

   @Override
   public boolean attackEntityAsMob(Entity var1) {
      if (this.method5114() != 99) {
         return var1.attackEntityFrom(DamageSource.method31115(this), 3.0F);
      } else {
         this.playSound(SoundEvents.field26988, 1.0F, (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F);
         return var1.attackEntityFrom(DamageSource.method31115(this), 8.0F);
      }
   }

   @Override
   public Class2266 method2864() {
      return this.method5114() != 99 ? Class2266.field14734 : Class2266.field14733;
   }

   @Override
   public boolean attackEntityFrom(DamageSource var1, float var2) {
      return !this.isInvulnerableTo(var1) ? super.attackEntityFrom(var1, var2) : false;
   }

   private boolean method5113(Item var1) {
      return var1 == Items.field38052 || var1 == Items.field38057 || var1 == Blocks.DANDELION.method11581();
   }

   public Class1094 method4389(ServerWorld var1, Class1045 var2) {
      Class1094 var5 = EntityType.RABBIT.create(var1);
      int var6 = this.method5116(var1);
      if (this.rand.nextInt(20) != 0) {
         if (var2 instanceof Class1094 && this.rand.nextBoolean()) {
            var6 = ((Class1094)var2).method5114();
         } else {
            var6 = this.method5114();
         }
      }

      var5.method5115(var6);
      return var5;
   }

   @Override
   public boolean method4381(ItemStack var1) {
      return this.method5113(var1.getItem());
   }

   public int method5114() {
      return this.dataManager.<Integer>method35445(field5986);
   }

   public void method5115(int var1) {
      if (var1 == 99) {
         this.getAttribute(Attributes.field42113).method38661(8.0);
         this.field5600.addGoal(4, new Class2648(this));
         this.field5601.addGoal(1, new HurtByTargetGoal(this).method10918());
         this.field5601.addGoal(2, new NearestAttackableTargetGoal<PlayerEntity>(this, PlayerEntity.class, true));
         this.field5601.addGoal(2, new NearestAttackableTargetGoal<WolfEntity>(this, WolfEntity.class, true));
         if (!this.method3381()) {
            this.method3379(new TranslationTextComponent(Util.makeTranslationKey("entity", field5987)));
         }
      }

      this.dataManager.method35446(field5986, var1);
   }

   @Nullable
   @Override
   public Class5093 method4276(Class1659 var1, Class9755 var2, Class2202 var3, Class5093 var4, CompoundNBT var5) {
      int var8 = this.method5116(var1);
      if (!(var4 instanceof Class5099)) {
         var4 = new Class5099(var8);
      } else {
         var8 = ((Class5099)var4).field23196;
      }

      this.method5115(var8);
      return super.method4276(var1, var2, var3, (Class5093)var4, var5);
   }

   private int method5116(Class1660 var1) {
      Biome var4 = var1.getBiome(this.getPosition());
      int var5 = this.rand.nextInt(100);
      if (var4.method32500() != Class87.field225) {
         if (var4.getCategory() != Class100.field286) {
            return var5 >= 50 ? (var5 >= 90 ? 2 : 5) : 0;
         } else {
            return 4;
         }
      } else {
         return var5 >= 80 ? 3 : 1;
      }
   }

   public static boolean method5117(EntityType<Class1094> var0, Class1660 var1, Class2202 var2, BlockPos var3, Random var4) {
      BlockState var7 = var1.getBlockState(var3.down());
      return (var7.isIn(Blocks.field36395) || var7.isIn(Blocks.SNOW) || var7.isIn(Blocks.SAND))
         && var1.method7021(var3, 0) > 8;
   }

   private boolean method5118() {
      return this.field5992 == 0;
   }

   @Override
   public void handleStatusUpdate(byte var1) {
      if (var1 != 1) {
         super.handleStatusUpdate(var1);
      } else {
         this.method3262();
         this.field5989 = 10;
         this.field5988 = 0;
      }
   }

   @Override
   public Vector3d func_241205_ce_() {
      return new Vector3d(0.0, (double)(0.6F * this.getEyeHeight()), (double)(this.getWidth() * 0.4F));
   }

   // $VF: synthetic method
   public static Class7956 method5119(Class1094 var0) {
      return var0.field5597;
   }

   // $VF: synthetic method
   public static boolean method5120(Class1094 var0) {
      return var0.method5118();
   }

   // $VF: synthetic method
   public static int method5121(Class1094 var0, int var1) {
      return var0.field5992 = var1;
   }
}
