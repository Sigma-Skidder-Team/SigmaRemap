package mapped;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.math.BlockPos;

import javax.annotation.Nullable;
import java.util.Random;

public abstract class Class939 extends Class932 {
   public ResourceLocation field5302;
   public long field5303;

   public Class939(Class4387<?> var1) {
      super(var1);
   }

   public static void method3740(Class1665 var0, Random var1, BlockPos var2, ResourceLocation var3) {
      TileEntity var6 = var0.getTileEntity(var2);
      if (var6 instanceof Class939) {
         ((Class939)var6).method3744(var3, var1.nextLong());
      }
   }

   public boolean method3741(CompoundNBT var1) {
      if (!var1.method119("LootTable", 8)) {
         return false;
      } else {
         this.field5302 = new ResourceLocation(var1.method126("LootTable"));
         this.field5303 = var1.method123("LootTableSeed");
         return true;
      }
   }

   public boolean method3742(CompoundNBT var1) {
      if (this.field5302 != null) {
         var1.method109("LootTable", this.field5302.toString());
         if (this.field5303 != 0L) {
            var1.method103("LootTableSeed", this.field5303);
         }

         return true;
      } else {
         return false;
      }
   }

   public void method3743(PlayerEntity var1) {
      if (this.field5302 != null && this.field5324.getServer() != null) {
         Class7318 var4 = this.field5324.getServer().method1411().method1058(this.field5302);
         if (var1 instanceof ServerPlayerEntity) {
            CriteriaTriggers.field44504.method15109((ServerPlayerEntity)var1, this.field5302);
         }

         this.field5302 = null;
         Class9464 var5 = new Class9464((ServerWorld)this.field5324)
            .method36454(Class9525.field44335, Vector3d.method11328(this.field5325))
            .method36451(this.field5303);
         if (var1 != null) {
            var5.method36453(var1.method2978()).method36454(Class9525.field44330, var1);
         }

         var4.method23185(this, var5.method36460(Class8524.field38282));
      }
   }

   public void method3744(ResourceLocation var1, long var2) {
      this.field5302 = var1;
      this.field5303 = var2;
   }

   @Override
   public boolean method3617() {
      this.method3743((PlayerEntity)null);
      return this.method3724().stream().allMatch(ItemStack::isEmpty);
   }

   @Override
   public ItemStack method3618(int var1) {
      this.method3743((PlayerEntity)null);
      return this.method3724().get(var1);
   }

   @Override
   public ItemStack method3619(int var1, int var2) {
      this.method3743((PlayerEntity)null);
      ItemStack var5 = Class7920.method26563(this.method3724(), var1, var2);
      if (!var5.isEmpty()) {
         this.method3622();
      }

      return var5;
   }

   @Override
   public ItemStack method3620(int var1) {
      this.method3743((PlayerEntity)null);
      return Class7920.method26564(this.method3724(), var1);
   }

   @Override
   public void method3621(int var1, ItemStack var2) {
      this.method3743((PlayerEntity)null);
      this.method3724().set(var1, var2);
      if (var2.getCount() > this.method3630()) {
         var2.method32180(this.method3630());
      }

      this.method3622();
   }

   @Override
   public boolean method3623(PlayerEntity var1) {
      return this.field5324.getTileEntity(this.field5325) == this
         ? !(
            var1.method3276((double)this.field5325.getX() + 0.5, (double)this.field5325.getY() + 0.5, (double)this.field5325.getZ() + 0.5)
               > 64.0
         )
         : false;
   }

   @Override
   public void method3625() {
      this.method3724().clear();
   }

   public abstract NonNullList<ItemStack> method3724();

   public abstract void method3725(NonNullList<ItemStack> var1);

   @Override
   public boolean method3696(PlayerEntity var1) {
      return super.method3696(var1) && (this.field5302 == null || !var1.isSpectator());
   }

   @Nullable
   @Override
   public Class5812 method3627(int var1, PlayerInventory var2, PlayerEntity var3) {
      if (!this.method3696(var3)) {
         return null;
      } else {
         this.method3743(var2.field5444);
         return this.method3690(var1, var2);
      }
   }
}
