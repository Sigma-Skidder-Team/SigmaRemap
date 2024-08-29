package mapped;

import javax.annotation.Nullable;

public class Class886 extends AbstractArrowEntity {
   private static final DataParameter<Byte> field5111 = EntityDataManager.<Byte>method35441(Class886.class, Class7784.field33390);
   private static final DataParameter<Boolean> field5112 = EntityDataManager.<Boolean>method35441(Class886.class, Class7784.field33398);
   private ItemStack field5113 = new ItemStack(Items.field38144);
   private boolean field5114;
   public int field5115;

   public Class886(EntityType<? extends Class886> var1, World var2) {
      super(var1, var2);
   }

   public Class886(World var1, Class880 var2, ItemStack var3) {
      super(EntityType.field41093, var2, var1);
      this.field5113 = var3.copy();
      this.dataManager.method35446(field5111, (byte)Class7858.method26336(var3));
      this.dataManager.method35446(field5112, var3.method32159());
   }

   public Class886(World var1, double var2, double var4, double var6) {
      super(EntityType.field41093, var2, var4, var6, var1);
   }

   @Override
   public void registerData() {
      super.registerData();
      this.dataManager.register(field5111, (byte)0);
      this.dataManager.register(field5112, false);
   }

   @Override
   public void tick() {
      if (this.field5101 > 4) {
         this.field5114 = true;
      }

      Entity var3 = this.method3460();
      if ((this.field5114 || this.method3493()) && var3 != null) {
         byte var4 = this.dataManager.<Byte>method35445(field5111);
         if (var4 > 0 && !this.method3495()) {
            if (!this.world.field9020 && this.field5102 == Class2192.field14332) {
               this.method3303(this.method3480(), 0.1F);
            }

            this.method2904();
         } else if (var4 > 0) {
            this.method3492(true);
            Vector3d var5 = new Vector3d(var3.getPosX() - this.getPosX(), var3.method3442() - this.getPosY(), var3.getPosZ() - this.getPosZ());
            this.method3446(this.getPosX(), this.getPosY() + var5.field18049 * 0.015 * (double)var4, this.getPosZ());
            if (this.world.field9020) {
               this.lastTickPosY = this.getPosY();
            }

            double var6 = 0.05 * (double)var4;
            this.method3434(this.method3433().method11344(0.95).method11338(var5.method11333().method11344(var6)));
            if (this.field5115 == 0) {
               this.method2863(Sounds.field27150, 10.0F, 1.0F);
            }

            this.field5115++;
         }
      }

      super.tick();
   }

   private boolean method3495() {
      Entity var3 = this.method3460();
      return var3 != null && var3.method3066() ? !(var3 instanceof ServerPlayerEntity) || !var3.isSpectator() : false;
   }

   @Override
   public ItemStack method3480() {
      return this.field5113.copy();
   }

   public boolean method3496() {
      return this.dataManager.<Boolean>method35445(field5112);
   }

   @Nullable
   @Override
   public EntityRayTraceResult method3479(Vector3d var1, Vector3d var2) {
      return !this.field5114 ? super.method3479(var1, var2) : null;
   }

   @Override
   public void method3465(EntityRayTraceResult var1) {
      Entity var4 = var1.getEntity();
      float var5 = 8.0F;
      if (var4 instanceof Class880) {
         Class880 var6 = (Class880)var4;
         var5 += Class7858.method26318(this.field5113, var6.method3089());
      }

      Entity var12 = this.method3460();
      Class8654 var7 = Class8654.method31119(this, (Entity)(var12 != null ? var12 : this));
      this.field5114 = true;
      Class9455 var8 = Sounds.field27148;
      if (var4.method2741(var7, var5)) {
         if (var4.getType() == EntityType.field41025) {
            return;
         }

         if (var4 instanceof Class880) {
            Class880 var9 = (Class880)var4;
            if (var12 instanceof Class880) {
               Class7858.method26320(var9, var12);
               Class7858.method26321((Class880)var12, var9);
            }

            this.method3478(var9);
         }
      }

      this.method3434(this.method3433().method11347(-0.01, -0.1, -0.01));
      float var13 = 1.0F;
      if (this.world instanceof ServerWorld && this.world.method6794() && Class7858.method26338(this.field5113)) {
         BlockPos var10 = var4.getPosition();
         if (this.world.method7022(var10)) {
            Class906 var11 = EntityType.field41046.method33215(this.world);
            var11.method3271(Vector3d.method11330(var10));
            var11.method3550(!(var12 instanceof ServerPlayerEntity) ? null : (ServerPlayerEntity)var12);
            this.world.method6916(var11);
            var8 = Sounds.field27155;
            var13 = 5.0F;
         }
      }

      this.method2863(var8, var13, 1.0F);
   }

   @Override
   public Class9455 method3476() {
      return Sounds.field27149;
   }

   @Override
   public void method3279(PlayerEntity var1) {
      Entity var4 = this.method3460();
      if (var4 == null || var4.getUniqueID() == var1.getUniqueID()) {
         super.method3279(var1);
      }
   }

   @Override
   public void method2723(CompoundNBT var1) {
      super.method2723(var1);
      if (var1.method119("Trident", 10)) {
         this.field5113 = ItemStack.method32104(var1.getCompound("Trident"));
      }

      this.field5114 = var1.method132("DealtDamage");
      this.dataManager.method35446(field5111, (byte)Class7858.method26336(this.field5113));
   }

   @Override
   public void method2724(CompoundNBT var1) {
      super.method2724(var1);
      var1.put("Trident", this.field5113.method32112(new CompoundNBT()));
      var1.method115("DealtDamage", this.field5114);
   }

   @Override
   public void method3474() {
      byte var3 = this.dataManager.<Byte>method35445(field5111);
      if (this.field5102 != Class2192.field14332 || var3 <= 0) {
         super.method3474();
      }
   }

   @Override
   public float method3491() {
      return 0.99F;
   }

   @Override
   public boolean method3290(double var1, double var3, double var5) {
      return true;
   }
}
