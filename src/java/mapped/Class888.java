package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.Packet;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.network.play.server.SSpawnObjectPacket;
import net.minecraft.util.math.BlockPos;

import java.util.OptionalInt;

public class Class888 extends ProjectileEntity implements Class889 {
   private static final DataParameter<ItemStack> field5120 = EntityDataManager.<ItemStack>createKey(Class888.class, DataSerializers.field33396);
   private static final DataParameter<OptionalInt> field5121 = EntityDataManager.<OptionalInt>createKey(Class888.class, DataSerializers.field33407);
   private static final DataParameter<Boolean> field5122 = EntityDataManager.<Boolean>createKey(Class888.class, DataSerializers.field33398);
   private int field5123;
   private int field5124;
   public LivingEntity field5125;

   public Class888(EntityType<? extends Class888> var1, World var2) {
      super(var1, var2);
   }

   public Class888(World var1, double var2, double var4, double var6, ItemStack var8) {
      super(EntityType.field41032, var1);
      this.field5123 = 0;
      this.setPosition(var2, var4, var6);
      byte var11 = 1;
      if (!var8.isEmpty() && var8.method32141()) {
         this.dataManager.method35446(field5120, var8.copy());
         var11 += var8.method32144("Fireworks").method120("Flight");
      }

      this.method3435(this.rand.nextGaussian() * 0.001, 0.05, this.rand.nextGaussian() * 0.001);
      this.field5124 = 10 * var11 + this.rand.nextInt(6) + this.rand.nextInt(7);
   }

   public Class888(World var1, Entity var2, double var3, double var5, double var7, ItemStack var9) {
      this(var1, var3, var5, var7, var9);
      this.setShooter(var2);
   }

   public Class888(World var1, ItemStack var2, LivingEntity var3) {
      this(var1, var3, var3.getPosX(), var3.getPosY(), var3.getPosZ(), var2);
      this.dataManager.method35446(field5121, OptionalInt.of(var3.method3205()));
      this.field5125 = var3;
   }

   public Class888(World var1, ItemStack var2, double var3, double var5, double var7, boolean var9) {
      this(var1, var3, var5, var7, var2);
      this.dataManager.method35446(field5122, var9);
   }

   public Class888(World var1, ItemStack var2, Entity var3, double var4, double var6, double var8, boolean var10) {
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
   public boolean method3290(double var1, double var3, double var5) {
      return super.method3290(var1, var3, var5) && !this.method3507();
   }

   @Override
   public void tick() {
      super.tick();
      if (!this.method3507()) {
         if (!this.method3508()) {
            double var9 = !this.collidedHorizontally ? 1.15 : 1.0;
            this.method3434(this.method3433().method11347(var9, 1.0, var9).method11339(0.0, 0.04, 0.0));
         }

         Vector3d var3 = this.method3433();
         this.move(Class2107.field13742, var3);
         this.method3434(var3);
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
            if (this.field5125.method3165()) {
               Vector3d var11 = this.field5125.method3320();
               double var4 = 1.5;
               double var6 = 0.1;
               Vector3d var8 = this.field5125.method3433();
               this.field5125
                  .method3434(
                     var8.method11339(
                        var11.x * 0.1 + (var11.x * 1.5 - var8.x) * 0.5,
                        var11.y * 0.1 + (var11.y * 1.5 - var8.y) * 0.5,
                        var11.z * 0.1 + (var11.z * 1.5 - var8.z) * 0.5
                     )
                  );
            }

            this.setPosition(this.field5125.getPosX(), this.field5125.getPosY(), this.field5125.getPosZ());
            this.method3434(this.field5125.method3433());
         }
      }

      RayTraceResult var12 = Class9456.method36385(this, this::method3467);
      if (!this.noClip) {
         this.method3464(var12);
         this.isAirBorne = true;
      }

      this.method3468();
      if (this.field5123 == 0 && !this.method3245()) {
         this.world
            .method6743((PlayerEntity)null, this.getPosX(), this.getPosY(), this.getPosZ(), Sounds.field26577, Class2266.field14736, 3.0F, 1.0F);
      }

      this.field5123++;
      if (this.world.isRemote && this.field5123 % 2 < 2) {
         this.world
            .method6746(
               Class7940.field34072,
               this.getPosX(),
               this.getPosY() - 0.3,
               this.getPosZ(),
               this.rand.nextGaussian() * 0.05,
               -this.method3433().y * 0.5,
               this.rand.nextGaussian() * 0.05
            );
      }

      if (!this.world.isRemote && this.field5123 > this.field5124) {
         this.method3504();
      }
   }

   private void method3504() {
      this.world.method6786(this, (byte)17);
      this.method3506();
      this.method2904();
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
      ListNBT var5 = var4 == null ? null : var4.method131("Explosions", 10);
      return var5 != null && !var5.isEmpty();
   }

   private void method3506() {
      float var3 = 0.0F;
      ItemStack var4 = this.dataManager.<ItemStack>method35445(field5120);
      CompoundNBT var5 = !var4.isEmpty() ? var4.method32145("Fireworks") : null;
      ListNBT var6 = var5 == null ? null : var5.method131("Explosions", 10);
      if (var6 != null && !var6.isEmpty()) {
         var3 = 5.0F + (float)(var6.size() * 2);
      }

      if (var3 > 0.0F) {
         if (this.field5125 != null) {
            this.field5125.method2741(Class8654.method31120(this, this.method3460()), 5.0F + (float)(var6.size() * 2));
         }

         double var7 = 5.0;
         Vector3d var9 = this.getPositionVec();

         for (LivingEntity var11 : this.world.<LivingEntity>method7182(LivingEntity.class, this.getBoundingBox().method19664(5.0))) {
            if (var11 != this.field5125 && !(this.getDistanceSq(var11) > 25.0)) {
               boolean var12 = false;

               for (int var13 = 0; var13 < 2; var13++) {
                  Vector3d var14 = new Vector3d(var11.getPosX(), var11.method3440(0.5 * (double)var13), var11.getPosZ());
                  BlockRayTraceResult var15 = this.world.method7036(new Class6809(var9, var14, Class2271.field14774, Class1985.field12962, this));
                  if (var15.getType() == RayTraceResult.Type.MISS) {
                     var12 = true;
                     break;
                  }
               }

               if (var12) {
                  float var16 = var3 * (float)Math.sqrt((5.0 - (double)this.method3275(var11)) / 5.0);
                  var11.method2741(Class8654.method31120(this, this.method3460()), var16);
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
   public void method2866(byte var1) {
      if (var1 == 17 && this.world.isRemote) {
         if (this.method3505()) {
            ItemStack var4 = this.dataManager.<ItemStack>method35445(field5120);
            CompoundNBT var5 = !var4.isEmpty() ? var4.method32145("Fireworks") : null;
            Vector3d var6 = this.method3433();
            this.world.method6804(this.getPosX(), this.getPosY(), this.getPosZ(), var6.x, var6.y, var6.z, var5);
         } else {
            for (int var7 = 0; var7 < this.rand.nextInt(3) + 2; var7++) {
               this.world
                  .method6746(
                     Class7940.field34089,
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

      super.method2866(var1);
   }

   @Override
   public void method2724(CompoundNBT var1) {
      super.method2724(var1);
      var1.method102("Life", this.field5123);
      var1.method102("LifeTime", this.field5124);
      ItemStack var4 = this.dataManager.<ItemStack>method35445(field5120);
      if (!var4.isEmpty()) {
         var1.put("FireworksItem", var4.method32112(new CompoundNBT()));
      }

      var1.method115("ShotAtAngle", this.dataManager.<Boolean>method35445(field5122));
   }

   @Override
   public void method2723(CompoundNBT var1) {
      super.method2723(var1);
      this.field5123 = var1.method122("Life");
      this.field5124 = var1.method122("LifeTime");
      ItemStack var4 = ItemStack.method32104(var1.getCompound("FireworksItem"));
      if (!var4.isEmpty()) {
         this.dataManager.method35446(field5120, var4);
      }

      if (var1.contains("ShotAtAngle")) {
         this.dataManager.method35446(field5122, var1.method132("ShotAtAngle"));
      }
   }

   @Override
   public ItemStack method3509() {
      ItemStack var3 = this.dataManager.<ItemStack>method35445(field5120);
      return !var3.isEmpty() ? var3 : new ItemStack(Items.field38068);
   }

   @Override
   public boolean method3360() {
      return false;
   }

   @Override
   public Packet<?> method2835() {
      return new SSpawnObjectPacket(this);
   }
}
