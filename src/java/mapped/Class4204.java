package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.StairsBlock;
import net.minecraft.entity.EntityType;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.gen.feature.template.TemplateManager;

import java.util.List;
import java.util.Random;

public class Class4204 extends Class4194 {
   private boolean field20511;

   public Class4204(int var1, Class9764 var2, Direction var3) {
      super(Class7792.field33449, var1);
      this.method12939(var3);
      this.field20444 = var2;
   }

   public Class4204(TemplateManager var1, CompoundNBT var2) {
      super(Class7792.field33449, var2);
      this.field20511 = var2.getBoolean("Mob");
   }

   @Override
   public void method12897(CompoundNBT var1) {
      super.method12897(var1);
      var1.putBoolean("Mob", this.field20511);
   }

   @Override
   public void method12894(Class4178 var1, List<Class4178> var2, Random var3) {
      if (var1 != null) {
         ((Class4196)var1).field20499 = this;
      }
   }

   public static Class4204 method12997(List<Class4178> var0, int var1, int var2, int var3, Direction var4, int var5) {
      Class9764 var8 = Class9764.method38388(var1, var2, var3, -4, -1, 0, 11, 8, 16, var4);
      return method12989(var8) && Class4178.method12918(var0, var8) == null ? new Class4204(var5, var8, var4) : null;
   }

   @Override
   public boolean method12896(ISeedReader var1, Class7480 var2, ChunkGenerator var3, Random var4, Class9764 var5, ChunkPos var6, BlockPos var7) {
      this.method12928(var1, var5, 0, 0, 0, 10, 7, 15, false, var4, Class9331.method35288());
      this.method12984(var1, var4, var5, Class2213.field14472, 4, 1, 0);
      int var10 = 6;
      this.method12928(var1, var5, 1, var10, 1, 1, var10, 14, false, var4, Class9331.method35288());
      this.method12928(var1, var5, 9, var10, 1, 9, var10, 14, false, var4, Class9331.method35288());
      this.method12928(var1, var5, 2, var10, 1, 8, var10, 2, false, var4, Class9331.method35288());
      this.method12928(var1, var5, 2, var10, 14, 8, var10, 14, false, var4, Class9331.method35288());
      this.method12928(var1, var5, 1, 1, 1, 2, 1, 4, false, var4, Class9331.method35288());
      this.method12928(var1, var5, 8, 1, 1, 9, 1, 4, false, var4, Class9331.method35288());
      this.method12927(var1, var5, 1, 1, 1, 1, 1, 3, Blocks.LAVA.getDefaultState(), Blocks.LAVA.getDefaultState(), false);
      this.method12927(var1, var5, 9, 1, 1, 9, 1, 3, Blocks.LAVA.getDefaultState(), Blocks.LAVA.getDefaultState(), false);
      this.method12928(var1, var5, 3, 1, 8, 7, 1, 12, false, var4, Class9331.method35288());
      this.method12927(var1, var5, 4, 1, 9, 6, 1, 11, Blocks.LAVA.getDefaultState(), Blocks.LAVA.getDefaultState(), false);
      BlockState var11 = Blocks.IRON_BARS
         .getDefaultState()
         .with(Class3237.field18680, Boolean.valueOf(true))
         .with(Class3237.field18682, Boolean.valueOf(true));
      BlockState var12 = Blocks.IRON_BARS
         .getDefaultState()
         .with(Class3237.field18683, Boolean.valueOf(true))
         .with(Class3237.field18681, Boolean.valueOf(true));

      for (int var13 = 3; var13 < 14; var13 += 2) {
         this.method12927(var1, var5, 0, 3, var13, 0, 4, var13, var11, var11, false);
         this.method12927(var1, var5, 10, 3, var13, 10, 4, var13, var11, var11, false);
      }

      for (int var23 = 2; var23 < 9; var23 += 2) {
         this.method12927(var1, var5, var23, 3, 15, var23, 4, 15, var12, var12, false);
      }

      BlockState var24 = Blocks.STONE_BRICK_STAIRS.getDefaultState().with(StairsBlock.FACING, Direction.NORTH);
      this.method12928(var1, var5, 4, 1, 5, 6, 1, 7, false, var4, Class9331.method35288());
      this.method12928(var1, var5, 4, 2, 6, 6, 2, 7, false, var4, Class9331.method35288());
      this.method12928(var1, var5, 4, 3, 7, 6, 3, 7, false, var4, Class9331.method35288());

      for (int var14 = 4; var14 <= 6; var14++) {
         this.method12923(var1, var24, var14, 1, 4, var5);
         this.method12923(var1, var24, var14, 2, 5, var5);
         this.method12923(var1, var24, var14, 3, 6, var5);
      }

      BlockState var25 = Blocks.field36650.getDefaultState().with(Class3400.field19053, Direction.NORTH);
      BlockState var15 = Blocks.field36650.getDefaultState().with(Class3400.field19053, Direction.SOUTH);
      BlockState var16 = Blocks.field36650.getDefaultState().with(Class3400.field19053, Direction.EAST);
      BlockState var17 = Blocks.field36650.getDefaultState().with(Class3400.field19053, Direction.WEST);
      boolean var18 = true;
      boolean[] var19 = new boolean[12];

      for (int var20 = 0; var20 < var19.length; var20++) {
         var19[var20] = var4.nextFloat() > 0.9F;
         var18 &= var19[var20];
      }

      this.method12923(var1, var25.with(Class3400.field19054, Boolean.valueOf(var19[0])), 4, 3, 8, var5);
      this.method12923(var1, var25.with(Class3400.field19054, Boolean.valueOf(var19[1])), 5, 3, 8, var5);
      this.method12923(var1, var25.with(Class3400.field19054, Boolean.valueOf(var19[2])), 6, 3, 8, var5);
      this.method12923(var1, var15.with(Class3400.field19054, Boolean.valueOf(var19[3])), 4, 3, 12, var5);
      this.method12923(var1, var15.with(Class3400.field19054, Boolean.valueOf(var19[4])), 5, 3, 12, var5);
      this.method12923(var1, var15.with(Class3400.field19054, Boolean.valueOf(var19[5])), 6, 3, 12, var5);
      this.method12923(var1, var16.with(Class3400.field19054, Boolean.valueOf(var19[6])), 3, 3, 9, var5);
      this.method12923(var1, var16.with(Class3400.field19054, Boolean.valueOf(var19[7])), 3, 3, 10, var5);
      this.method12923(var1, var16.with(Class3400.field19054, Boolean.valueOf(var19[8])), 3, 3, 11, var5);
      this.method12923(var1, var17.with(Class3400.field19054, Boolean.valueOf(var19[9])), 7, 3, 9, var5);
      this.method12923(var1, var17.with(Class3400.field19054, Boolean.valueOf(var19[10])), 7, 3, 10, var5);
      this.method12923(var1, var17.with(Class3400.field19054, Boolean.valueOf(var19[11])), 7, 3, 11, var5);
      if (var18) {
         BlockState var26 = Blocks.field36649.getDefaultState();
         this.method12923(var1, var26, 4, 3, 9, var5);
         this.method12923(var1, var26, 5, 3, 9, var5);
         this.method12923(var1, var26, 6, 3, 9, var5);
         this.method12923(var1, var26, 4, 3, 10, var5);
         this.method12923(var1, var26, 5, 3, 10, var5);
         this.method12923(var1, var26, 6, 3, 10, var5);
         this.method12923(var1, var26, 4, 3, 11, var5);
         this.method12923(var1, var26, 5, 3, 11, var5);
         this.method12923(var1, var26, 6, 3, 11, var5);
      }

      if (!this.field20511) {
         var10 = this.method12921(3);
         BlockPos var27 = new BlockPos(this.method12920(5, 6), var10, this.method12922(5, 6));
         if (var5.method38396(var27)) {
            this.field20511 = true;
            var1.setBlockState(var27, Blocks.field36532.getDefaultState(), 2);
            TileEntity var21 = var1.getTileEntity(var27);
            if (var21 instanceof Class960) {
               ((Class960)var21).method3911().method24790(EntityType.field41077);
            }
         }
      }

      return true;
   }
}
