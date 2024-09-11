package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.function.Predicate;

public class Class3342 extends Class3198 implements Class3255 {
   public static final Class8553 field18848 = Class3198.field18484;
   private Class9803 field18849;
   private Class9803 field18850;
   private Class9803 field18851;
   private Class9803 field18852;
   private static final Predicate<BlockState> field18853 = var0 -> var0 != null
         && (var0.isIn(Blocks.field36589) || var0.isIn(Blocks.field36590));

   public Class3342(AbstractBlock var1) {
      super(var1);
      this.method11578(this.field18612.method35393().method23465(field18848, Direction.NORTH));
   }

   @Override
   public void method11589(BlockState var1, World var2, BlockPos var3, BlockState var4, boolean var5) {
      if (!var4.isIn(var1.getBlock())) {
         this.method11892(var2, var3);
      }
   }

   public boolean method11891(Class1662 var1, BlockPos var2) {
      return this.method11893().method38656(var1, var2) != null || this.method11895().method38656(var1, var2) != null;
   }

   private void method11892(World var1, BlockPos var2) {
      Class9086 var5 = this.method11894().method38656(var1, var2);
      if (var5 == null) {
         var5 = this.method11896().method38656(var1, var2);
         if (var5 != null) {
            for (int var6 = 0; var6 < this.method11896().method38654(); var6++) {
               for (int var7 = 0; var7 < this.method11896().method38653(); var7++) {
                  Class9632 var8 = var5.method33881(var6, var7, 0);
                  var1.setBlockState(var8.method37551(), Blocks.AIR.method11579(), 2);
                  var1.playEvent(2001, var8.method37551(), Block.getStateId(var8.method37548()));
               }
            }

            BlockPos var12 = var5.method33881(1, 2, 0).method37551();
            Class1058 var15 = EntityType.field41041.create(var1);
            var15.method4870(true);
            var15.setLocationAndAngles((double)var12.getX() + 0.5, (double)var12.getY() + 0.05, (double)var12.getZ() + 0.5, 0.0F, 0.0F);
            var1.addEntity(var15);

            for (ServerPlayerEntity var9 : var1.<ServerPlayerEntity>method7182(ServerPlayerEntity.class, var15.getBoundingBox().method19664(5.0))) {
               CriteriaTriggers.field44478.method15080(var9, var15);
            }

            for (int var19 = 0; var19 < this.method11896().method38654(); var19++) {
               for (int var22 = 0; var22 < this.method11896().method38653(); var22++) {
                  Class9632 var10 = var5.method33881(var19, var22, 0);
                  var1.func_230547_a_(var10.method37551(), Blocks.AIR);
               }
            }
         }
      } else {
         for (int var13 = 0; var13 < this.method11894().method38653(); var13++) {
            Class9632 var16 = var5.method33881(0, var13, 0);
            var1.setBlockState(var16.method37551(), Blocks.AIR.method11579(), 2);
            var1.playEvent(2001, var16.method37551(), Block.getStateId(var16.method37548()));
         }

         Class1021 var14 = EntityType.field41082.create(var1);
         BlockPos var17 = var5.method33881(0, 2, 0).method37551();
         var14.setLocationAndAngles((double)var17.getX() + 0.5, (double)var17.getY() + 0.05, (double)var17.getZ() + 0.5, 0.0F, 0.0F);
         var1.addEntity(var14);

         for (ServerPlayerEntity var23 : var1.<ServerPlayerEntity>method7182(ServerPlayerEntity.class, var14.getBoundingBox().method19664(5.0))) {
            CriteriaTriggers.field44478.method15080(var23, var14);
         }

         for (int var21 = 0; var21 < this.method11894().method38653(); var21++) {
            Class9632 var24 = var5.method33881(0, var21, 0);
            var1.func_230547_a_(var24.method37551(), Blocks.AIR);
         }
      }
   }

   @Override
   public BlockState method11495(Class5909 var1) {
      return this.method11579().method23465(field18848, var1.method18350().method536());
   }

   @Override
   public void method11489(Class7558<Block, BlockState> var1) {
      var1.method24737(field18848);
   }

   private Class9803 method11893() {
      if (this.field18849 == null) {
         this.field18849 = Class9659.method37706()
            .method37705(" ", "#", "#")
            .method37707('#', Class9632.method37552(Class166.method497(Blocks.SNOW_BLOCK)))
            .method37708();
      }

      return this.field18849;
   }

   private Class9803 method11894() {
      if (this.field18850 == null) {
         this.field18850 = Class9659.method37706()
            .method37705("^", "#", "#")
            .method37707('^', Class9632.method37552(field18853))
            .method37707('#', Class9632.method37552(Class166.method497(Blocks.SNOW_BLOCK)))
            .method37708();
      }

      return this.field18850;
   }

   private Class9803 method11895() {
      if (this.field18851 == null) {
         this.field18851 = Class9659.method37706()
            .method37705("~ ~", "###", "~#~")
            .method37707('#', Class9632.method37552(Class166.method497(Blocks.field36522)))
            .method37707('~', Class9632.method37552(Class116.method330(Class8649.field38932)))
            .method37708();
      }

      return this.field18851;
   }

   private Class9803 method11896() {
      if (this.field18852 == null) {
         this.field18852 = Class9659.method37706()
            .method37705("~^~", "###", "~#~")
            .method37707('^', Class9632.method37552(field18853))
            .method37707('#', Class9632.method37552(Class166.method497(Blocks.field36522)))
            .method37707('~', Class9632.method37552(Class116.method330(Class8649.field38932)))
            .method37708();
      }

      return this.field18852;
   }
}
