package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.entity.projectile.ProjectileHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.ListNBT;
import net.minecraft.network.IPacket;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.network.play.server.SSpawnObjectPacket;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.EntityRayTraceResult;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;

import java.util.OptionalInt;

public class FireworkRocketEntity extends ProjectileEntity implements Class889 {
   private static final DataParameter<ItemStack> field5120 = EntityDataManager.<ItemStack>createKey(FireworkRocketEntity.class, DataSerializers.field33396);
   private static final DataParameter<OptionalInt> field5121 = EntityDataManager.<OptionalInt>createKey(FireworkRocketEntity.class, DataSerializers.field33407);
   private static final DataParameter<Boolean> field5122 = EntityDataManager.<Boolean>createKey(FireworkRocketEntity.class, DataSerializers.field33398);
   private int field5123;
   private int field5124;
   public LivingEntity field5125;

   public FireworkRocketEntity(EntityType<? extends FireworkRocketEntity> var1, World var2) {
      super(var1, var2);
   }

   public FireworkRocketEntity(World var1, double var2, double var4, double var6, ItemStack var8) {
      super(EntityType.FIREWORK_ROCKET, var1);
      this.field5123 = 0;
      this.setPosition(var2, var4, var6);
      int var11 = 1;
      if (!var8.isEmpty() && var8.method32141()) {
         this.dataManager.set(field5120, var8.copy());
         var11 += var8.method32144("Fireworks").getByte("Flight");
      }

      this.setMotion(this.rand.nextGaussian() * 0.001, 0.05, this.rand.nextGaussian() * 0.001);
      this.field5124 = 10 * var11 + this.rand.nextInt(6) + this.rand.nextInt(7);
   }

   public FireworkRocketEntity(World var1, Entity var2, double var3, double var5, double var7, ItemStack var9) {
      this(var1, var3, var5, var7, var9);
      this.setShooter(var2);
   }

   public FireworkRocketEntity(World var1, ItemStack var2, LivingEntity var3) {
      this(var1, var3, var3.getPosX(), var3.getPosY(), var3.getPosZ(), var2);
      this.dataManager.set(field5121, OptionalInt.of(var3.getEntityId()));
      this.field5125 = var3;
   }

   public FireworkRocketEntity(World var1, ItemStack var2, double var3, double var5, double var7, boolean var9) {
      this(var1, var3, var5, var7, var2);
      this.dataManager.set(field5122, var9);
   }

   public FireworkRocketEntity(World var1, ItemStack var2, Entity var3, double var4, double var6, double var8, boolean var10) {
      this(var1, var2, var4, var6, var8, var10);
      this.setShooter(var3);
   }

   @Override
   public void registerData() {
      this.dataManager.register(field5120, ItemStack.EMPTY);
      this.dataManager.register(field5121, OptionalInt.empty());
      this.dataManager.register(field5122, false);
   }

   @Override
   public boolean isInRangeToRenderDist(double var1) {
      return var1 < 4096.0 && !this.method3507();
   }

   @Override
   public boolean isInRangeToRender3d(double var1, double var3, double var5) {
      return super.isInRangeToRender3d(var1, var3, var5) && !this.method3507();
   }

   @Override
   public void tick() {
      super.tick();
      if (!this.method3507()) {
         if (!this.method3508()) {
            double var9 = !this.collidedHorizontally ? 1.15 : 1.0;
            this.setMotion(this.getMotion().mul(var9, 1.0, var9).add(0.0, 0.04, 0.0));
         }

         Vector3d var3 = this.getMotion();
         this.move(MoverType.SELF, var3);
         this.setMotion(var3);
      } else {
         if (this.field5125 == null) {
            this.dataManager.<OptionalInt>method35445(field5121).ifPresent(var1 -> {
               Entity var4x = this.world.getEntityByID(var1);
               if (var4x instanceof LivingEntity) {
                  this.field5125 = (LivingEntity)var4x;
               }
            });
         }

         if (this.field5125 != null) {
            if (this.field5125.isElytraFlying()) {
               Vector3d var11 = this.field5125.getLookVec();
               double var4 = 1.5;
               double var6 = 0.1;
               Vector3d var8 = this.field5125.getMotion();
               this.field5125
                  .setMotion(
                     var8.add(
                        var11.x * 0.1 + (var11.x * 1.5 - var8.x) * 0.5,
                        var11.y * 0.1 + (var11.y * 1.5 - var8.y) * 0.5,
                        var11.z * 0.1 + (var11.z * 1.5 - var8.z) * 0.5
                     )
                  );
            }

            this.setPosition(this.field5125.getPosX(), this.field5125.getPosY(), this.field5125.getPosZ());
            this.setMotion(this.field5125.getMotion());
         }
      }

      RayTraceResult var12 = ProjectileHelper.method36385(this, this::method3467);
      if (!this.noClip) {
         this.method3464(var12);
         this.isAirBorne = true;
      }

      this.method3468();
      if (this.field5123 == 0 && !this.isSilent()) {
         this.world
            .playSound((PlayerEntity)null, this.getPosX(), this.getPosY(), this.getPosZ(), SoundEvents.field26577, SoundCategory.field14736, 3.0F, 1.0F);
      }

      this.field5123++;
      if (this.world.isRemote && this.field5123 % 2 < 2) {
         this.world
            .addParticle(
               ParticleTypes.field34072,
               this.getPosX(),
               this.getPosY() - 0.3,
               this.getPosZ(),
               this.rand.nextGaussian() * 0.05,
               -this.getMotion().y * 0.5,
               this.rand.nextGaussian() * 0.05
            );
      }

      if (!this.world.isRemote && this.field5123 > this.field5124) {
         this.method3504();
      }
   }

   private void method3504() {
      this.world.setEntityState(this, (byte)17);
      this.method3506();
      this.remove();
   }

   @Override
   public void method3465(EntityRayTraceResult var1) {
      super.method3465(var1);
      if (!this.world.isRemote) {
         this.method3504();
      }
   }

   @Override
   public void method3466(BlockRayTraceResult var1) {
      BlockPos var4 = new BlockPos(var1.getPos());
      this.world.getBlockState(var4).method23432(this.world, var4, this);
      if (!this.world.isRemote() && this.method3505()) {
         this.method3504();
      }

      super.method3466(var1);
   }

   private boolean method3505() {
      ItemStack var3 = this.dataManager.<ItemStack>method35445(field5120);
      CompoundNBT var4 = !var3.isEmpty() ? var3.method32145("Fireworks") : null;
      ListNBT var5 = var4 == null ? null : var4.getList("Explosions", 10);
      return var5 != null && !var5.isEmpty();
   }

   private void method3506() {
      float var3 = 0.0F;
      ItemStack var4 = this.dataManager.<ItemStack>method35445(field5120);
      CompoundNBT var5 = !var4.isEmpty() ? var4.method32145("Fireworks") : null;
      ListNBT var6 = var5 == null ? null : var5.getList("Explosions", 10);
      if (var6 != null && !var6.isEmpty()) {
         var3 = 5.0F + (float)(var6.size() * 2);
      }

      if (var3 > 0.0F) {
         if (this.field5125 != null) {
            this.field5125.attackEntityFrom(DamageSource.method31120(this, this.method3460()), 5.0F + (float)(var6.size() * 2));
         }

         double var7 = 5.0;
         Vector3d var9 = this.getPositionVec();

         for (LivingEntity var11 : this.world.<LivingEntity>getEntitiesWithinAABB(LivingEntity.class, this.getBoundingBox().grow(5.0))) {
            if (var11 != this.field5125 && !(this.getDistanceSq(var11) > 25.0)) {
               boolean var12 = false;

               for (int var13 = 0; var13 < 2; var13++) {
                  Vector3d var14 = new Vector3d(var11.getPosX(), var11.getPosYHeight(0.5 * (double)var13), var11.getPosZ());
                  BlockRayTraceResult var15 = this.world.rayTraceBlocks(new RayTraceContext(var9, var14, RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, this));
                  if (var15.getType() == RayTraceResult.Type.MISS) {
                     var12 = true;
                     break;
                  }
               }

               if (var12) {
                  float var16 = var3 * (float)Math.sqrt((5.0 - (double)this.getDistance(var11)) / 5.0);
                  var11.attackEntityFrom(DamageSource.method31120(this, this.method3460()), var16);
               }
            }
         }
      }
   }

   private boolean method3507() {
      return this.dataManager.<OptionalInt>method35445(field5121).isPresent();
   }

   public boolean method3508() {
      return this.dataManager.<Boolean>method35445(field5122);
   }

   @Override
   public void handleStatusUpdate(byte var1) {
      if (var1 == 17 && this.world.isRemote) {
         if (this.method3505()) {
            ItemStack var4 = this.dataManager.<ItemStack>method35445(field5120);
            CompoundNBT var5 = !var4.isEmpty() ? var4.method32145("Fireworks") : null;
            Vector3d var6 = this.getMotion();
            this.world.method6804(this.getPosX(), this.getPosY(), this.getPosZ(), var6.x, var6.y, var6.z, var5);
         } else {
            for (int var7 = 0; var7 < this.rand.nextInt(3) + 2; var7++) {
               this.world
                  .addParticle(
                     ParticleTypes.POOF,
                     this.getPosX(),
                     this.getPosY(),
                     this.getPosZ(),
                     this.rand.nextGaussian() * 0.05,
                     0.005,
                     this.rand.nextGaussian() * 0.05
                  );
            }
         }
      }

      super.handleStatusUpdate(var1);
   }

   @Override
   public void writeAdditional(CompoundNBT var1) {
      super.writeAdditional(var1);
      var1.putInt("Life", this.field5123);
      var1.putInt("LifeTime", this.field5124);
      ItemStack var4 = this.dataManager.<ItemStack>method35445(field5120);
      if (!var4.isEmpty()) {
         var1.put("FireworksItem", var4.method32112(new CompoundNBT()));
      }

      var1.putBoolean("ShotAtAngle", this.dataManager.<Boolean>method35445(field5122));
   }

   @Override
   public void readAdditional(CompoundNBT var1) {
      super.readAdditional(var1);
      this.field5123 = var1.getInt("Life");
      this.field5124 = var1.getInt("LifeTime");
      ItemStack var4 = ItemStack.read(var1.getCompound("FireworksItem"));
      if (!var4.isEmpty()) {
         this.dataManager.set(field5120, var4);
      }

      if (var1.contains("ShotAtAngle")) {
         this.dataManager.set(field5122, var1.getBoolean("ShotAtAngle"));
      }
   }

   @Override
   public ItemStack method3509() {
      ItemStack var3 = this.dataManager.<ItemStack>method35445(field5120);
      return !var3.isEmpty() ? var3 : new ItemStack(Items.field38068);
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
