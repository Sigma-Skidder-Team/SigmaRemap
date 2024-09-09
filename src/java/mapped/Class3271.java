package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Optional;

public class Class3271 extends Item implements Class3260 {
   private static final Logger field18771 = LogManager.getLogger();

   public Class3271(Class5643 var1) {
      super(var1);
   }

   public static boolean method11789(ItemStack var0) {
      CompoundNBT var3 = var0.method32142();
      return var3 != null && (var3.contains("LodestoneDimension") || var3.contains("LodestonePos"));
   }

   @Override
   public boolean method11732(ItemStack var1) {
      return method11789(var1) || super.method11732(var1);
   }

   public static Optional<RegistryKey<World>> method11790(CompoundNBT var0) {
      return World.CODEC.parse(NBTDynamicOps.INSTANCE, var0.method116("LodestoneDimension")).result();
   }

   @Override
   public void method11724(ItemStack var1, World var2, Entity var3, int var4, boolean var5) {
      if (!var2.isRemote && method11789(var1)) {
         CompoundNBT var8 = var1.getOrCreateTag();
         if (var8.contains("LodestoneTracked") && !var8.getBoolean("LodestoneTracked")) {
            return;
         }

         Optional var9 = method11790(var8);
         if (var9.isPresent()
            && var9.get() == var2.getDimensionKey()
            && var8.contains("LodestonePos")
            && !((ServerWorld)var2).method6951().method6664(Class4913.field22771, Class8354.method29283(var8.getCompound("LodestonePos")))) {
            var8.method133("LodestonePos");
         }
      }
   }

   @Override
   public ActionResultType method11707(ItemUseContext var1) {
      BlockPos var4 = var1.method18345();
      World var5 = var1.method18360();
      if (!var5.getBlockState(var4).isIn(Blocks.field37129)) {
         return super.method11707(var1);
      } else {
         var5.method6742((PlayerEntity)null, var4, SoundEvents.field26749, Class2266.field14735, 1.0F, 1.0F);
         PlayerEntity var6 = var1.method18358();
         ItemStack var7 = var1.method18357();
         boolean var8 = !var6.abilities.isCreativeMode && var7.getCount() == 1;
         if (!var8) {
            ItemStack var9 = new ItemStack(Items.field37905, 1);
            CompoundNBT var10 = !var7.method32141() ? new CompoundNBT() : var7.method32142().method79();
            var9.method32148(var10);
            if (!var6.abilities.isCreativeMode) {
               var7.method32182(1);
            }

            this.method11791(var5.getDimensionKey(), var4, var10);
            if (!var6.inventory.method4045(var9)) {
               var6.method2882(var9, false);
            }
         } else {
            this.method11791(var5.getDimensionKey(), var4, var7.getOrCreateTag());
         }

         return ActionResultType.method9002(var5.isRemote);
      }
   }

   private void method11791(RegistryKey<World> var1, BlockPos var2, CompoundNBT var3) {
      var3.put("LodestonePos", Class8354.method29284(var2));
      World.CODEC
         .encodeStart(NBTDynamicOps.INSTANCE, var1)
         .resultOrPartial(field18771::error)
         .ifPresent(var1x -> var3.put("LodestoneDimension", var1x));
      var3.putBoolean("LodestoneTracked", true);
   }

   @Override
   public String method11720(ItemStack var1) {
      return !method11789(var1) ? super.method11720(var1) : "item.minecraft.lodestone_compass";
   }
}
