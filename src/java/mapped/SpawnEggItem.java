package mapped;

import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class SpawnEggItem extends Item {
   private static final Map<EntityType<?>, SpawnEggItem> field18817 = Maps.newIdentityHashMap();
   private final int field18818;
   private final int field18819;
   private final EntityType<?> field18820;

   public SpawnEggItem(EntityType<?> var1, int var2, int var3, Class5643 var4) {
      super(var4);
      this.field18820 = var1;
      this.field18818 = var2;
      this.field18819 = var3;
      field18817.put(var1, this);
   }

   @Override
   public ActionResultType method11707(Class5911 var1) {
      World var4 = var1.method18360();
      if (!(var4 instanceof ServerWorld)) {
         return ActionResultType.field14818;
      } else {
         ItemStack var5 = var1.method18357();
         BlockPos var6 = var1.method18345();
         Direction var7 = var1.method18354();
         BlockState var8 = var4.getBlockState(var6);
         if (var8.method23448(Blocks.field36532)) {
            TileEntity var9 = var4.getTileEntity(var6);
            if (var9 instanceof Class960) {
               Class7574 var13 = ((Class960)var9).method3911();
               EntityType var11 = this.method11855(var5.method32142());
               var13.method24790(var11);
               var9.method3622();
               var4.method6731(var6, var8, var8, 3);
               var5.method32182(1);
               return ActionResultType.field14819;
            }
         }

         BlockPos var12;
         if (!var8.method23414(var4, var6).method19516()) {
            var12 = var6.method8349(var7);
         } else {
            var12 = var6;
         }

         EntityType var10 = this.method11855(var5.method32142());
         if (var10.method33200(
               (ServerWorld)var4, var5, var1.method18358(), var12, Class2202.field14403, true, !Objects.equals(var6, var12) && var7 == Direction.field673
            )
            != null) {
            var5.method32182(1);
         }

         return ActionResultType.field14819;
      }
   }

   @Override
   public Class6794<ItemStack> method11700(World var1, PlayerEntity var2, Hand var3) {
      ItemStack var6 = var2.getHeldItem(var3);
      BlockRayTraceResult var7 = method11735(var1, var2, Class1985.field12963);
      if (var7.getType() == RayTraceResult.Type.BLOCK) {
         if (var1 instanceof ServerWorld) {
            BlockRayTraceResult var8 = var7;
            BlockPos var9 = var8.getPos();
            if (var1.getBlockState(var9).getBlock() instanceof Class3404) {
               if (var1.method6785(var2, var9) && var2.method2936(var9, var8.getFace(), var6)) {
                  EntityType var10 = this.method11855(var6.method32142());
                  if (var10.method33200((ServerWorld)var1, var6, var2, var9, Class2202.field14403, false, false) != null) {
                     if (!var2.abilities.isCreativeMode) {
                        var6.method32182(1);
                     }

                     var2.method2913(Class8876.field40098.method172(this));
                     return Class6794.<ItemStack>method20697(var6);
                  } else {
                     return Class6794.<ItemStack>method20698(var6);
                  }
               } else {
                  return Class6794.<ItemStack>method20699(var6);
               }
            } else {
               return Class6794.<ItemStack>method20698(var6);
            }
         } else {
            return Class6794.<ItemStack>method20696(var6);
         }
      } else {
         return Class6794.<ItemStack>method20698(var6);
      }
   }

   public boolean method11851(CompoundNBT var1, EntityType<?> var2) {
      return Objects.equals(this.method11855(var1), var2);
   }

   public int method11852(int var1) {
      return var1 != 0 ? this.field18819 : this.field18818;
   }

   @Nullable
   public static SpawnEggItem getEgg(EntityType<?> var0) {
      return field18817.get(var0);
   }

   public static Iterable<SpawnEggItem> method11854() {
      return Iterables.unmodifiableIterable(field18817.values());
   }

   public EntityType<?> method11855(CompoundNBT var1) {
      if (var1 != null && var1.method119("EntityTag", 10)) {
         CompoundNBT var4 = var1.getCompound("EntityTag");
         if (var4.method119("id", 8)) {
            return EntityType.method33199(var4.method126("id")).orElse(this.field18820);
         }
      }

      return this.field18820;
   }

   public Optional<Class1006> method11856(PlayerEntity var1, Class1006 var2, EntityType<? extends Class1006> var3, ServerWorld var4, Vector3d var5, ItemStack var6) {
      if (this.method11851(var6.method32142(), var3)) {
         Object var9;
         if (!(var2 instanceof Class1045)) {
            var9 = (Class1006)var3.method33215(var4);
         } else {
            var9 = ((Class1045)var2).method4389(var4, (Class1045)var2);
         }

         if (var9 != null) {
            ((Class1006)var9).method4308(true);
            if (((Class1006)var9).method3005()) {
               ((Class1006)var9).method3273(var5.method11320(), var5.method11321(), var5.method11322(), 0.0F, 0.0F);
               var4.method6995((Entity)var9);
               if (var6.method32152()) {
                  ((Class1006)var9).method3379(var6.method32149());
               }

               if (!var1.abilities.isCreativeMode) {
                  var6.method32182(1);
               }

               return Optional.<Class1006>of((Class1006)var9);
            } else {
               return Optional.<Class1006>empty();
            }
         } else {
            return Optional.<Class1006>empty();
         }
      } else {
         return Optional.<Class1006>empty();
      }
   }
}
