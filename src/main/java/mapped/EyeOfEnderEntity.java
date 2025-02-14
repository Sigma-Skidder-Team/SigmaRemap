package mapped;

import net.minecraft.util.Util;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.IPacket;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.network.play.server.SSpawnObjectPacket;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;

public class EyeOfEnderEntity extends Entity implements Class889 {
   private static final DataParameter<ItemStack> field5132 = EntityDataManager.<ItemStack>createKey(EyeOfEnderEntity.class, DataSerializers.field33396);
   private double field5133;
   private double field5134;
   private double field5135;
   private int field5136;
   private boolean field5137;

   public EyeOfEnderEntity(EntityType<? extends EyeOfEnderEntity> var1, World var2) {
      super(var1, var2);
   }

   public EyeOfEnderEntity(World var1, double var2, double var4, double var6) {
      this(EntityType.EYE_OF_ENDER, var1);
      this.field5136 = 0;
      this.setPosition(var2, var4, var6);
   }

   public void method3522(ItemStack var1) {
      if (var1.getItem() != Items.field37979 || var1.method32141()) {
         this.getDataManager().set(field5132, Util.<ItemStack>make(var1.copy(), var0 -> var0.setCount(1)));
      }
   }

   private ItemStack method3523() {
      return this.getDataManager().<ItemStack>method35445(field5132);
   }

   @Override
   public ItemStack method3509() {
      ItemStack var3 = this.method3523();
      return !var3.isEmpty() ? var3 : new ItemStack(Items.field37979);
   }

   @Override
   public void registerData() {
      this.getDataManager().register(field5132, ItemStack.EMPTY);
   }

   @Override
   public boolean isInRangeToRenderDist(double var1) {
      double var5 = this.getBoundingBox().getAverageEdgeLength() * 4.0;
      if (Double.isNaN(var5)) {
         var5 = 4.0;
      }

      var5 *= 64.0;
      return var1 < var5 * var5;
   }

   public void method3524(BlockPos var1) {
      double var4 = (double)var1.getX();
      int var6 = var1.getY();
      double var7 = (double)var1.getZ();
      double var9 = var4 - this.getPosX();
      double var11 = var7 - this.getPosZ();
      float var13 = MathHelper.sqrt(var9 * var9 + var11 * var11);
      if (!(var13 > 12.0F)) {
         this.field5133 = var4;
         this.field5134 = (double)var6;
         this.field5135 = var7;
      } else {
         this.field5133 = this.getPosX() + var9 / (double)var13 * 12.0;
         this.field5135 = this.getPosZ() + var11 / (double)var13 * 12.0;
         this.field5134 = this.getPosY() + 8.0;
      }

      this.field5136 = 0;
      this.field5137 = this.rand.nextInt(5) > 0;
   }

   @Override
   public void method3325(double var1, double var3, double var5) {
      this.setMotion(var1, var3, var5);
      if (this.prevRotationPitch == 0.0F && this.prevRotationYaw == 0.0F) {
         float var9 = MathHelper.sqrt(var1 * var1 + var5 * var5);
         this.rotationYaw = (float)(MathHelper.method37814(var1, var5) * 180.0F / (float)Math.PI);
         this.rotationPitch = (float)(MathHelper.method37814(var3, (double)var9) * 180.0F / (float)Math.PI);
         this.prevRotationYaw = this.rotationYaw;
         this.prevRotationPitch = this.rotationPitch;
      }
   }

   @Override
   public void tick() {
      super.tick();
      Vector3d var3 = this.getMotion();
      double var4 = this.getPosX() + var3.x;
      double var6 = this.getPosY() + var3.y;
      double var8 = this.getPosZ() + var3.z;
      float var10 = MathHelper.sqrt(horizontalMag(var3));
      this.rotationPitch = ProjectileEntity.method3469(this.prevRotationPitch, (float)(MathHelper.method37814(var3.y, (double)var10) * 180.0F / (float)Math.PI));
      this.rotationYaw = ProjectileEntity.method3469(this.prevRotationYaw, (float)(MathHelper.method37814(var3.x, var3.z) * 180.0F / (float)Math.PI));
      if (!this.world.isRemote) {
         double var12 = this.field5133 - var4;
         double var14 = this.field5135 - var8;
         float var16 = (float)Math.sqrt(var12 * var12 + var14 * var14);
         float var17 = (float) MathHelper.method37814(var14, var12);
         double var18 = MathHelper.lerp(0.0025, (double)var10, (double)var16);
         double var20 = var3.y;
         if (var16 < 1.0F) {
            var18 *= 0.8;
            var20 *= 0.8;
         }

         int var22 = !(this.getPosY() < this.field5134) ? -1 : 1;
         var3 = new Vector3d(Math.cos((double)var17) * var18, var20 + ((double)var22 - var20) * 0.015F, Math.sin((double)var17) * var18);
         this.setMotion(var3);
      }

      float var11 = 0.25F;
      if (!this.isInWater()) {
         this.world
            .addParticle(
               ParticleTypes.field34090,
               var4 - var3.x * 0.25 + this.rand.nextDouble() * 0.6 - 0.3,
               var6 - var3.y * 0.25 - 0.5,
               var8 - var3.z * 0.25 + this.rand.nextDouble() * 0.6 - 0.3,
               var3.x,
               var3.y,
               var3.z
            );
      } else {
         for (int var23 = 0; var23 < 4; var23++) {
            this.world
               .addParticle(
                  ParticleTypes.BUBBLE,
                  var4 - var3.x * 0.25,
                  var6 - var3.y * 0.25,
                  var8 - var3.z * 0.25,
                  var3.x,
                  var3.y,
                  var3.z
               );
         }
      }

      if (this.world.isRemote) {
         this.setRawPosition(var4, var6, var8);
      } else {
         this.setPosition(var4, var6, var8);
         this.field5136++;
         if (this.field5136 > 80 && !this.world.isRemote) {
            this.playSound(SoundEvents.field26543, 1.0F, 1.0F);
            this.remove();
            if (!this.field5137) {
               this.world.playEvent(2003, this.getPosition(), 0);
            } else {
               this.world.addEntity(new ItemEntity(this.world, this.getPosX(), this.getPosY(), this.getPosZ(), this.method3509()));
            }
         }
      }
   }

   @Override
   public void writeAdditional(CompoundNBT var1) {
      ItemStack var4 = this.method3523();
      if (!var4.isEmpty()) {
         var1.put("Item", var4.method32112(new CompoundNBT()));
      }
   }

   @Override
   public void readAdditional(CompoundNBT var1) {
      ItemStack var4 = ItemStack.read(var1.getCompound("Item"));
      this.method3522(var4);
   }

   @Override
   public float getBrightness() {
      return 1.0F;
   }

   @Override
   public boolean canBeAttackedWithItem() {
      return false;
   }

   @Override
   public IPacket<?> createSpawnPacket() {
      return new SSpawnObjectPacket(this);
   }
}
