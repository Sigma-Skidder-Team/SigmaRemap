package mapped;

import java.util.OptionalInt;

public class Class888 extends Class882 implements Class889 {
   private static final Class9289<ItemStack> field5120 = Class9361.<ItemStack>method35441(Class888.class, Class7784.field33396);
   private static final Class9289<OptionalInt> field5121 = Class9361.<OptionalInt>method35441(Class888.class, Class7784.field33407);
   private static final Class9289<Boolean> field5122 = Class9361.<Boolean>method35441(Class888.class, Class7784.field33398);
   private int field5123;
   private int field5124;
   public Class880 field5125;

   public Class888(EntityType<? extends Class888> var1, World var2) {
      super(var1, var2);
   }

   public Class888(World var1, double var2, double var4, double var6, ItemStack var8) {
      super(EntityType.field41032, var1);
      this.field5123 = 0;
      this.method3215(var2, var4, var6);
      byte var11 = 1;
      if (!var8.isEmpty() && var8.method32141()) {
         this.field5063.method35446(field5120, var8.copy());
         var11 += var8.method32144("Fireworks").method120("Flight");
      }

      this.method3435(this.field5054.nextGaussian() * 0.001, 0.05, this.field5054.nextGaussian() * 0.001);
      this.field5124 = 10 * var11 + this.field5054.nextInt(6) + this.field5054.nextInt(7);
   }

   public Class888(World var1, Entity var2, double var3, double var5, double var7, ItemStack var9) {
      this(var1, var3, var5, var7, var9);
      this.method3459(var2);
   }

   public Class888(World var1, ItemStack var2, Class880 var3) {
      this(var1, var3, var3.getPosX(), var3.getPosY(), var3.getPosZ(), var2);
      this.field5063.method35446(field5121, OptionalInt.of(var3.method3205()));
      this.field5125 = var3;
   }

   public Class888(World var1, ItemStack var2, double var3, double var5, double var7, boolean var9) {
      this(var1, var3, var5, var7, var2);
      this.field5063.method35446(field5122, var9);
   }

   public Class888(World var1, ItemStack var2, Entity var3, double var4, double var6, double var8, boolean var10) {
      this(var1, var2, var4, var6, var8, var10);
      this.method3459(var3);
   }

   @Override
   public void method2850() {
      this.field5063.method35442(field5120, ItemStack.EMPTY);
      this.field5063.method35442(field5121, OptionalInt.empty());
      this.field5063.method35442(field5122, false);
   }

   @Override
   public boolean method3291(double var1) {
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
            double var9 = !this.field5037 ? 1.15 : 1.0;
            this.method3434(this.method3433().method11347(var9, 1.0, var9).method11339(0.0, 0.04, 0.0));
         }

         Vector3d var3 = this.method3433();
         this.move(Class2107.field13742, var3);
         this.method3434(var3);
      } else {
         if (this.field5125 == null) {
            this.field5063.<OptionalInt>method35445(field5121).ifPresent(var1 -> {
               Entity var4x = this.world.method6774(var1);
               if (var4x instanceof Class880) {
                  this.field5125 = (Class880)var4x;
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
                        var11.field18048 * 0.1 + (var11.field18048 * 1.5 - var8.field18048) * 0.5,
                        var11.field18049 * 0.1 + (var11.field18049 * 1.5 - var8.field18049) * 0.5,
                        var11.field18050 * 0.1 + (var11.field18050 * 1.5 - var8.field18050) * 0.5
                     )
                  );
            }

            this.method3215(this.field5125.getPosX(), this.field5125.getPosY(), this.field5125.getPosZ());
            this.method3434(this.field5125.method3433());
         }
      }

      RayTraceResult var12 = Class9456.method36385(this, this::method3467);
      if (!this.field5052) {
         this.method3464(var12);
         this.field5078 = true;
      }

      this.method3468();
      if (this.field5123 == 0 && !this.method3245()) {
         this.world
            .method6743((PlayerEntity)null, this.getPosX(), this.getPosY(), this.getPosZ(), Class6067.field26577, Class2266.field14736, 3.0F, 1.0F);
      }

      this.field5123++;
      if (this.world.field9020 && this.field5123 % 2 < 2) {
         this.world
            .method6746(
               Class7940.field34072,
               this.getPosX(),
               this.getPosY() - 0.3,
               this.getPosZ(),
               this.field5054.nextGaussian() * 0.05,
               -this.method3433().field18049 * 0.5,
               this.field5054.nextGaussian() * 0.05
            );
      }

      if (!this.world.field9020 && this.field5123 > this.field5124) {
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
      if (!this.world.field9020) {
         this.method3504();
      }
   }

   @Override
   public void method3466(BlockRayTraceResult var1) {
      BlockPos var4 = new BlockPos(var1.getPos());
      this.world.getBlockState(var4).method23432(this.world, var4, this);
      if (!this.world.method6714() && this.method3505()) {
         this.method3504();
      }

      super.method3466(var1);
   }

   private boolean method3505() {
      ItemStack var3 = this.field5063.<ItemStack>method35445(field5120);
      CompoundNBT var4 = !var3.isEmpty() ? var3.method32145("Fireworks") : null;
      ListNBT var5 = var4 == null ? null : var4.method131("Explosions", 10);
      return var5 != null && !var5.isEmpty();
   }

   private void method3506() {
      float var3 = 0.0F;
      ItemStack var4 = this.field5063.<ItemStack>method35445(field5120);
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

         for (Class880 var11 : this.world.<Class880>method7182(Class880.class, this.method3389().method19664(5.0))) {
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
      return this.field5063.<OptionalInt>method35445(field5121).isPresent();
   }

   public boolean method3508() {
      return this.field5063.<Boolean>method35445(field5122);
   }

   @Override
   public void method2866(byte var1) {
      if (var1 == 17 && this.world.field9020) {
         if (this.method3505()) {
            ItemStack var4 = this.field5063.<ItemStack>method35445(field5120);
            CompoundNBT var5 = !var4.isEmpty() ? var4.method32145("Fireworks") : null;
            Vector3d var6 = this.method3433();
            this.world.method6804(this.getPosX(), this.getPosY(), this.getPosZ(), var6.field18048, var6.field18049, var6.field18050, var5);
         } else {
            for (int var7 = 0; var7 < this.field5054.nextInt(3) + 2; var7++) {
               this.world
                  .method6746(
                     Class7940.field34089,
                     this.getPosX(),
                     this.getPosY(),
                     this.getPosZ(),
                     this.field5054.nextGaussian() * 0.05,
                     0.005,
                     this.field5054.nextGaussian() * 0.05
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
      ItemStack var4 = this.field5063.<ItemStack>method35445(field5120);
      if (!var4.isEmpty()) {
         var1.put("FireworksItem", var4.method32112(new CompoundNBT()));
      }

      var1.method115("ShotAtAngle", this.field5063.<Boolean>method35445(field5122));
   }

   @Override
   public void method2723(CompoundNBT var1) {
      super.method2723(var1);
      this.field5123 = var1.method122("Life");
      this.field5124 = var1.method122("LifeTime");
      ItemStack var4 = ItemStack.method32104(var1.getCompound("FireworksItem"));
      if (!var4.isEmpty()) {
         this.field5063.method35446(field5120, var4);
      }

      if (var1.contains("ShotAtAngle")) {
         this.field5063.method35446(field5122, var1.method132("ShotAtAngle"));
      }
   }

   @Override
   public ItemStack method3509() {
      ItemStack var3 = this.field5063.<ItemStack>method35445(field5120);
      return !var3.isEmpty() ? var3 : new ItemStack(Items.field38068);
   }

   @Override
   public boolean method3360() {
      return false;
   }

   @Override
   public Packet<?> method2835() {
      return new Class5487(this);
   }
}
