package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Difficulty;

public class Class3344 extends Class3343 {
   private static Class9803 field18857;
   private static Class9803 field18858;

   public Class3344(AbstractBlock var1) {
      super(Class2136.field13990, var1);
   }

   @Override
   public void method11563(World var1, BlockPos var2, BlockState var3, LivingEntity var4, ItemStack var5) {
      super.method11563(var1, var2, var3, var4, var5);
      TileEntity var8 = var1.getTileEntity(var2);
      if (var8 instanceof SkullTileEntity) {
         method11898(var1, var2, (SkullTileEntity)var8);
      }
   }

   public static void method11898(World var0, BlockPos var1, SkullTileEntity var2) {
      if (!var0.isRemote) {
         BlockState var5 = var2.method3775();
         boolean var6 = var5.method23448(Blocks.field36703) || var5.method23448(Blocks.field36704);
         if (var6 && var1.getY() >= 0 && var0.method6997() != Difficulty.field14351) {
            Class9803 var7 = method11900();
            Class9086 var8 = var7.method38656(var0, var1);
            if (var8 != null) {
               for (int var9 = 0; var9 < var7.method38654(); var9++) {
                  for (int var10 = 0; var10 < var7.method38653(); var10++) {
                     Class9632 var11 = var8.method33881(var9, var10, 0);
                     var0.setBlockState(var11.method37551(), Blocks.AIR.method11579(), 2);
                     var0.playEvent(2001, var11.method37551(), Block.getStateId(var11.method37548()));
                  }
               }

               Class1079 var13 = EntityType.field41102.method33215(var0);
               BlockPos var14 = var8.method33881(1, 2, 0).method37551();
               var13.method3273(
                  (double)var14.getX() + 0.5,
                  (double)var14.getY() + 0.55,
                  (double)var14.getZ() + 0.5,
                  var8.method33879().method544() != Class113.field413 ? 90.0F : 0.0F,
                  0.0F
               );
               var13.field4965 = var8.method33879().method544() != Class113.field413 ? 90.0F : 0.0F;
               var13.method5003();

               for (ServerPlayerEntity var12 : var0.<ServerPlayerEntity>method7182(ServerPlayerEntity.class, var13.getBoundingBox().method19664(50.0))) {
                  CriteriaTriggers.field44478.method15080(var12, var13);
               }

               var0.method6916(var13);

               for (int var16 = 0; var16 < var7.method38654(); var16++) {
                  for (int var17 = 0; var17 < var7.method38653(); var17++) {
                     var0.func_230547_a_(var8.method33881(var16, var17, 0).method37551(), Blocks.AIR);
                  }
               }
            }
         }
      }
   }

   public static boolean method11899(World var0, BlockPos var1, ItemStack var2) {
      return var2.getItem() == Items.field38059 && var1.getY() >= 2 && var0.method6997() != Difficulty.field14351 && !var0.isRemote
         ? method11901().method38656(var0, var1) != null
         : false;
   }

   private static Class9803 method11900() {
      if (field18857 == null) {
         field18857 = Class9659.method37706()
            .method37705("^^^", "###", "~#~")
            .method37707('#', var0 -> var0.method37548().method23446(BlockTags.field32793))
            .method37707('^', Class9632.method37552(Class166.method497(Blocks.field36703).or(Class166.method497(Blocks.field36704))))
            .method37707('~', Class9632.method37552(Class116.method330(Class8649.field38932)))
            .method37708();
      }

      return field18857;
   }

   private static Class9803 method11901() {
      if (field18858 == null) {
         field18858 = Class9659.method37706()
            .method37705("   ", "###", "~#~")
            .method37707('#', var0 -> var0.method37548().method23446(BlockTags.field32793))
            .method37707('~', Class9632.method37552(Class116.method330(Class8649.field38932)))
            .method37708();
      }

      return field18858;
   }
}
