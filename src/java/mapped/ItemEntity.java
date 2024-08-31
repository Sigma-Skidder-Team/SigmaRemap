package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

import javax.annotation.Nullable;
import java.util.Objects;
import java.util.UUID;

public class ItemEntity extends Entity {
   private static final DataParameter<ItemStack> field5514 = EntityDataManager.<ItemStack>createKey(ItemEntity.class, DataSerializers.field33396);
   private int field5515;
   private int field5516;
   private int field5517 = 5;
   private UUID field5518;
   private UUID field5519;
   public final float field5520;

   public ItemEntity(EntityType<? extends ItemEntity> var1, World var2) {
      super(var1, var2);
      this.field5520 = (float)(Math.random() * Math.PI * 2.0);
   }

   public ItemEntity(World var1, double var2, double var4, double var6) {
      this(EntityType.field41042, var1);
      this.setPosition(var2, var4, var6);
      this.rotationYaw = this.rand.nextFloat() * 360.0F;
      this.method3435(this.rand.nextDouble() * 0.2 - 0.1, 0.2, this.rand.nextDouble() * 0.2 - 0.1);
   }

   public ItemEntity(World var1, double var2, double var4, double var6, ItemStack var8) {
      this(var1, var2, var4, var6);
      this.method4125(var8);
   }

   private ItemEntity(ItemEntity var1) {
      super(var1.getType(), var1.world);
      this.method4125(var1.method4124().copy());
      this.method3364(var1);
      this.field5515 = var1.field5515;
      this.field5520 = var1.field5520;
   }

   @Override
   public boolean method2940() {
      return false;
   }

   @Override
   public void registerData() {
      this.method3210().register(field5514, ItemStack.EMPTY);
   }

   @Override
   public void tick() {
      if (!this.method4124().isEmpty()) {
         super.tick();
         if (this.field5516 > 0 && this.field5516 != 32767) {
            this.field5516--;
         }

         this.prevPosX = this.getPosX();
         this.prevPosY = this.getPosY();
         this.prevPosZ = this.getPosZ();
         Vector3d var3 = this.method3433();
         float var4 = this.method3393() - 0.11111111F;
         if (this.method3250() && this.method3427(Class8953.field40469) > (double)var4) {
            this.method4115();
         } else if (this.method3264() && this.method3427(Class8953.field40470) > (double)var4) {
            this.method4116();
         } else if (!this.method3247()) {
            this.method3434(this.method3433().method11339(0.0, -0.04, 0.0));
         }

         if (!this.world.isRemote) {
            this.noClip = !this.world.method7052(this);
            if (this.noClip) {
               this.pushOutOfBlocks(this.getPosX(), (this.getBoundingBox().field28450 + this.getBoundingBox().field28453) / 2.0, this.getPosZ());
            }
         } else {
            this.noClip = false;
         }

         if (!this.onGround || method3234(this.method3433()) > 1.0E-5F || (this.ticksExisted + this.method3205()) % 4 == 0) {
            this.move(Class2107.field13742, this.method3433());
            float var5 = 0.98F;
            if (this.onGround) {
               var5 = this.world.getBlockState(new BlockPos(this.getPosX(), this.getPosY() - 1.0, this.getPosZ())).getBlock().method11571()
                  * 0.98F;
            }

            this.method3434(this.method3433().method11347((double)var5, 0.98, (double)var5));
            if (this.onGround) {
               Vector3d var6 = this.method3433();
               if (var6.y < 0.0) {
                  this.method3434(var6.method11347(1.0, -0.5, 1.0));
               }
            }
         }

         boolean var9 = MathHelper.floor(this.prevPosX) != MathHelper.floor(this.getPosX())
            || MathHelper.floor(this.prevPosY) != MathHelper.floor(this.getPosY())
            || MathHelper.floor(this.prevPosZ) != MathHelper.floor(this.getPosZ());
         int var10 = !var9 ? 40 : 2;
         if (this.ticksExisted % var10 == 0) {
            if (this.world.getFluidState(this.getPosition()).method23486(Class8953.field40470) && !this.method3249()) {
               this.method2863(Sounds.field26606, 0.4F, 2.0F + this.rand.nextFloat() * 0.4F);
            }

            if (!this.world.isRemote && this.method4118()) {
               this.method4117();
            }
         }

         if (this.field5515 != -32768) {
            this.field5515++;
         }

         this.isAirBorne = this.isAirBorne | this.method3257();
         if (!this.world.isRemote) {
            double var7 = this.method3433().method11336(var3).method11349();
            if (var7 > 0.01) {
               this.isAirBorne = true;
            }
         }

         if (!this.world.isRemote && this.field5515 >= 6000) {
            this.method2904();
         }
      } else {
         this.method2904();
      }
   }

   private void method4115() {
      Vector3d var3 = this.method3433();
      this.method3435(var3.x * 0.99F, var3.y + (double)(!(var3.y < 0.06F) ? 0.0F : 5.0E-4F), var3.z * 0.99F);
   }

   private void method4116() {
      Vector3d var3 = this.method3433();
      this.method3435(var3.x * 0.95F, var3.y + (double)(!(var3.y < 0.06F) ? 0.0F : 5.0E-4F), var3.z * 0.95F);
   }

   private void method4117() {
      if (this.method4118()) {
         for (ItemEntity var4 : this.world
            .<ItemEntity>method6772(ItemEntity.class, this.getBoundingBox().method19663(0.5, 0.0, 0.5), var1 -> var1 != this && var1.method4118())) {
            if (var4.method4118()) {
               this.method4119(var4);
               if (this.removed) {
                  break;
               }
            }
         }
      }
   }

   private boolean method4118() {
      ItemStack var3 = this.method4124();
      return this.isAlive() && this.field5516 != 32767 && this.field5515 != -32768 && this.field5515 < 6000 && var3.getCount() < var3.method32113();
   }

   private void method4119(ItemEntity var1) {
      ItemStack var4 = this.method4124();
      ItemStack var5 = var1.method4124();
      if (Objects.equals(this.method4126(), var1.method4126()) && method4120(var4, var5)) {
         if (var5.getCount() >= var4.getCount()) {
            method4123(var1, var5, this, var4);
         } else {
            method4123(this, var4, var1, var5);
         }
      }
   }

   public static boolean method4120(ItemStack var0, ItemStack var1) {
      if (var1.getItem() != var0.getItem()) {
         return false;
      } else if (var1.getCount() + var0.getCount() <= var1.method32113()) {
         return var1.method32141() ^ var0.method32141() ? false : !var1.method32141() || var1.method32142().equals(var0.method32142());
      } else {
         return false;
      }
   }

   public static ItemStack method4121(ItemStack var0, ItemStack var1, int var2) {
      int var5 = Math.min(Math.min(var0.method32113(), var2) - var0.getCount(), var1.getCount());
      ItemStack var6 = var0.copy();
      var6.method32181(var5);
      var1.method32182(var5);
      return var6;
   }

   private static void method4122(ItemEntity var0, ItemStack var1, ItemStack var2) {
      ItemStack var5 = method4121(var1, var2, 64);
      var0.method4125(var5);
   }

   private static void method4123(ItemEntity var0, ItemStack var1, ItemEntity var2, ItemStack var3) {
      method4122(var0, var1, var3);
      var0.field5516 = Math.max(var0.field5516, var2.field5516);
      var0.field5515 = Math.min(var0.field5515, var2.field5515);
      if (var3.isEmpty()) {
         var2.method2904();
      }
   }

   @Override
   public boolean method3249() {
      return this.method4124().getItem().method11748() || super.method3249();
   }

   @Override
   public boolean method2741(Class8654 var1, float var2) {
      if (!this.method2760(var1)) {
         if (!this.method4124().isEmpty() && this.method4124().getItem() == Items.field38066 && var1.method31131()) {
            return false;
         } else if (this.method4124().getItem().method11749(var1)) {
            this.method3141();
            this.field5517 = (int)((float)this.field5517 - var2);
            if (this.field5517 <= 0) {
               this.method2904();
            }

            return false;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   @Override
   public void method2724(CompoundNBT var1) {
      var1.method101("Health", (short)this.field5517);
      var1.method101("Age", (short)this.field5515);
      var1.method101("PickupDelay", (short)this.field5516);
      if (this.method4128() != null) {
         var1.method104("Thrower", this.method4128());
      }

      if (this.method4126() != null) {
         var1.method104("Owner", this.method4126());
      }

      if (!this.method4124().isEmpty()) {
         var1.put("Item", this.method4124().method32112(new CompoundNBT()));
      }
   }

   @Override
   public void method2723(CompoundNBT var1) {
      this.field5517 = var1.method121("Health");
      this.field5515 = var1.method121("Age");
      if (var1.contains("PickupDelay")) {
         this.field5516 = var1.method121("PickupDelay");
      }

      if (var1.method106("Owner")) {
         this.field5519 = var1.method105("Owner");
      }

      if (var1.method106("Thrower")) {
         this.field5518 = var1.method105("Thrower");
      }

      CompoundNBT var4 = var1.getCompound("Item");
      this.method4125(ItemStack.method32104(var4));
      if (this.method4124().isEmpty()) {
         this.method2904();
      }
   }

   @Override
   public void method3279(PlayerEntity var1) {
      if (!this.world.isRemote) {
         ItemStack var4 = this.method4124();
         Item var5 = var4.getItem();
         int var6 = var4.getCount();
         if (this.field5516 == 0 && (this.field5519 == null || this.field5519.equals(var1.getUniqueID())) && var1.inventory.method4045(var4)) {
            var1.method2751(this, var6);
            if (var4.isEmpty()) {
               this.method2904();
               var4.method32180(var6);
            }

            var1.method2776(Class8876.field40100.method172(var5), var6);
            var1.method3134(this);
         }
      }
   }

   @Override
   public ITextComponent getName() {
      ITextComponent var3 = this.method3380();
      return (ITextComponent)(var3 == null ? new TranslationTextComponent(this.method4124().getTranslationKey()) : var3);
   }

   @Override
   public boolean method3360() {
      return false;
   }

   @Nullable
   @Override
   public Entity method2745(ServerWorld var1) {
      Entity var4 = super.method2745(var1);
      if (!this.world.isRemote && var4 instanceof ItemEntity) {
         ((ItemEntity)var4).method4117();
      }

      return var4;
   }

   public ItemStack method4124() {
      return this.method3210().<ItemStack>method35445(field5514);
   }

   public void method4125(ItemStack var1) {
      this.method3210().method35446(field5514, var1);
   }

   @Override
   public void method3155(DataParameter<?> var1) {
      super.method3155(var1);
      if (field5514.equals(var1)) {
         this.method4124().method32166(this);
      }
   }

   @Nullable
   public UUID method4126() {
      return this.field5519;
   }

   public void method4127(UUID var1) {
      this.field5519 = var1;
   }

   @Nullable
   public UUID method4128() {
      return this.field5518;
   }

   public void method4129(UUID var1) {
      this.field5518 = var1;
   }

   public int method4130() {
      return this.field5515;
   }

   public void method4131() {
      this.field5516 = 10;
   }

   public void method4132() {
      this.field5516 = 0;
   }

   public void method4133() {
      this.field5516 = 32767;
   }

   public void method4134(int var1) {
      this.field5516 = var1;
   }

   public boolean method4135() {
      return this.field5516 > 0;
   }

   public void method4136() {
      this.field5515 = -6000;
   }

   public void method4137() {
      this.method4133();
      this.field5515 = 5999;
   }

   public float method4138(float var1) {
      return ((float)this.method4130() + var1) / 20.0F + this.field5520;
   }

   @Override
   public Packet<?> method2835() {
      return new Class5487(this);
   }

   public ItemEntity method4139() {
      return new ItemEntity(this);
   }
}
