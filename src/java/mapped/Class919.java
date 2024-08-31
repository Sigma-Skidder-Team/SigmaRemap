package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResultType;

import javax.annotation.Nullable;

public abstract class Class919 extends AbstractMinecartEntity implements Class920, Class949 {
   private NonNullList<ItemStack> field5236 = NonNullList.<ItemStack>method68(36, ItemStack.EMPTY);
   private boolean field5237 = true;
   private ResourceLocation field5238;
   private long field5239;

   public Class919(EntityType<?> var1, World var2) {
      super(var1, var2);
   }

   public Class919(EntityType<?> var1, double var2, double var4, double var6, World var8) {
      super(var1, var8, var2, var4, var6);
   }

   @Override
   public void method3586(Class8654 var1) {
      super.method3586(var1);
      if (this.world.method6789().method17135(Class5462.field24229)) {
         Class7236.method22722(this.world, this, this);
         if (!this.world.isRemote) {
            Entity var4 = var1.method31113();
            if (var4 != null && var4.getType() == EntityType.PLAYER) {
               Class4388.method13832((PlayerEntity)var4, true);
            }
         }
      }
   }

   @Override
   public boolean method3617() {
      for (ItemStack var4 : this.field5236) {
         if (!var4.isEmpty()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public ItemStack method3618(int var1) {
      this.method3624((PlayerEntity)null);
      return this.field5236.get(var1);
   }

   @Override
   public ItemStack method3619(int var1, int var2) {
      this.method3624((PlayerEntity)null);
      return Class7920.method26563(this.field5236, var1, var2);
   }

   @Override
   public ItemStack method3620(int var1) {
      this.method3624((PlayerEntity)null);
      ItemStack var4 = this.field5236.get(var1);
      if (!var4.isEmpty()) {
         this.field5236.set(var1, ItemStack.EMPTY);
         return var4;
      } else {
         return ItemStack.EMPTY;
      }
   }

   @Override
   public void method3621(int var1, ItemStack var2) {
      this.method3624((PlayerEntity)null);
      this.field5236.set(var1, var2);
      if (!var2.isEmpty() && var2.getCount() > this.method3630()) {
         var2.method32180(this.method3630());
      }
   }

   @Override
   public boolean method2963(int var1, ItemStack var2) {
      if (var1 >= 0 && var1 < this.method3629()) {
         this.method3621(var1, var2);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void method3622() {
   }

   @Override
   public boolean method3623(PlayerEntity var1) {
      return !this.removed ? !(var1.getDistanceSq(this) > 64.0) : false;
   }

   @Nullable
   @Override
   public Entity method2745(ServerWorld var1) {
      this.field5237 = false;
      return super.method2745(var1);
   }

   @Override
   public void method2904() {
      if (!this.world.isRemote && this.field5237) {
         Class7236.method22722(this.world, this, this);
      }

      super.method2904();
   }

   @Override
   public void method2724(CompoundNBT var1) {
      super.method2724(var1);
      if (this.field5238 == null) {
         Class7920.method26565(var1, this.field5236);
      } else {
         var1.method109("LootTable", this.field5238.toString());
         if (this.field5239 != 0L) {
            var1.method103("LootTableSeed", this.field5239);
         }
      }
   }

   @Override
   public void method2723(CompoundNBT var1) {
      super.method2723(var1);
      this.field5236 = NonNullList.<ItemStack>method68(this.method3629(), ItemStack.EMPTY);
      if (!var1.method119("LootTable", 8)) {
         Class7920.method26567(var1, this.field5236);
      } else {
         this.field5238 = new ResourceLocation(var1.method126("LootTable"));
         this.field5239 = var1.method123("LootTableSeed");
      }
   }

   @Override
   public ActionResultType method3304(PlayerEntity var1, Hand var2) {
      var1.method2766(this);
      if (var1.world.isRemote) {
         return ActionResultType.field14818;
      } else {
         Class4388.method13832(var1, true);
         return ActionResultType.field14819;
      }
   }

   @Override
   public void method3593() {
      float var3 = 0.98F;
      if (this.field5238 == null) {
         int var4 = 15 - Class5812.method18152(this);
         var3 += (float)var4 * 0.001F;
      }

      this.method3434(this.method3433().method11347((double)var3, 0.0, (double)var3));
   }

   public void method3624(PlayerEntity var1) {
      if (this.field5238 != null && this.world.getServer() != null) {
         Class7318 var4 = this.world.getServer().method1411().method1058(this.field5238);
         if (var1 instanceof ServerPlayerEntity) {
            CriteriaTriggers.field44504.method15109((ServerPlayerEntity)var1, this.field5238);
         }

         this.field5238 = null;
         Class9464 var5 = new Class9464((ServerWorld)this.world).method36454(Class9525.field44335, this.getPositionVec()).method36451(this.field5239);
         if (var1 != null) {
            var5.method36453(var1.method2978()).method36454(Class9525.field44330, var1);
         }

         var4.method23185(this, var5.method36460(Class8524.field38282));
      }
   }

   @Override
   public void method3625() {
      this.method3624((PlayerEntity)null);
      this.field5236.clear();
   }

   public void method3626(ResourceLocation var1, long var2) {
      this.field5238 = var1;
      this.field5239 = var2;
   }

   @Nullable
   @Override
   public Class5812 method3627(int var1, PlayerInventory var2, PlayerEntity var3) {
      if (this.field5238 != null && var3.isSpectator()) {
         return null;
      } else {
         this.method3624(var2.field5444);
         return this.method3628(var1, var2);
      }
   }

   public abstract Class5812 method3628(int var1, PlayerInventory var2);
}
