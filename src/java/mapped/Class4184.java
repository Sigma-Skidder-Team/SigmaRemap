package mapped;

import com.google.common.collect.Lists;
import com.mojang.serialization.Dynamic;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.Direction;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3i;
import net.minecraft.world.ISeedReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Random;

public class Class4184 extends Class4180 {
   private static final Logger field20465 = LogManager.getLogger();
   private final ResourceLocation field20466;
   private final Class80 field20467;
   private final Class2089 field20468;
   private final Class2219 field20469;
   private final Class8299 field20470;

   public Class4184(BlockPos var1, Class2219 var2, Class8299 var3, ResourceLocation var4, Class8969 var5, Class80 var6, Class2089 var7, BlockPos var8) {
      super(Class7792.field33460, 0);
      this.field20455 = var1;
      this.field20466 = var4;
      this.field20467 = var6;
      this.field20468 = var7;
      this.field20469 = var2;
      this.field20470 = var3;
      this.method12949(var5, var8);
   }

   public Class4184(TemplateManager var1, CompoundNBT var2) {
      super(Class7792.field33460, var2);
      this.field20466 = new ResourceLocation(var2.getString("Template"));
      this.field20467 = Class80.valueOf(var2.getString("Rotation"));
      this.field20468 = Class2089.valueOf(var2.getString("Mirror"));
      this.field20469 = Class2219.method8946(var2.getString("VerticalPlacement"));
      this.field20470 = (Class8299)Class8299.field35673
         .parse(new Dynamic(NBTDynamicOps.INSTANCE, var2.method116("Properties")))
         .getOrThrow(true, field20465::error);
      Class8969 var5 = var1.method31603(this.field20466);
      this.method12949(var5, new BlockPos(var5.method32886().getX() / 2, 0, var5.method32886().getZ() / 2));
   }

   @Override
   public void method12897(CompoundNBT var1) {
      super.method12897(var1);
      var1.method109("Template", this.field20466.toString());
      var1.method109("Rotation", this.field20467.name());
      var1.method109("Mirror", this.field20468.name());
      var1.method109("VerticalPlacement", this.field20469.method8945());
      Class8299.field35673
         .encodeStart(NBTDynamicOps.INSTANCE, this.field20470)
         .resultOrPartial(field20465::error)
         .ifPresent(var1x -> var1.put("Properties", var1x));
   }

   private void method12949(Class8969 var1, BlockPos var2) {
      Class7095 var5 = !this.field20470.field35676 ? Class7095.field30528 : Class7095.field30526;
      ArrayList var6 = Lists.newArrayList();
      var6.add(method12960(Blocks.field36521, 0.3F, Blocks.AIR));
      var6.add(this.method12950());
      if (!this.field20470.field35674) {
         var6.add(method12960(Blocks.NETHERRACK, 0.07F, Blocks.field36890));
      }

      Class9463 var7 = new Class9463()
         .method36426(this.field20467)
         .method36425(this.field20468)
         .method36427(var2)
         .method36434(var5)
         .method36434(new Class7093(var6))
         .method36434(new Class7097(this.field20470.field35675))
         .method36434(new Class7096());
      if (this.field20470.field35679) {
         var7.method36434(Class7091.field30519);
      }

      this.method12943(var1, this.field20455, var7);
   }

   private Class7872 method12950() {
      if (this.field20469 != Class2219.field14496) {
         return !this.field20470.field35674
            ? method12960(Blocks.LAVA, 0.2F, Blocks.field36890)
            : method12961(Blocks.LAVA, Blocks.NETHERRACK);
      } else {
         return method12961(Blocks.LAVA, Blocks.field36890);
      }
   }

   @Override
   public boolean method12896(ISeedReader var1, Class7480 var2, ChunkGenerator var3, Random var4, Class9764 var5, ChunkPos var6, BlockPos var7) {
      if (!var5.method38396(this.field20455)) {
         return true;
      } else {
         var5.method38392(this.field20453.method32909(this.field20454, this.field20455));
         boolean var10 = super.method12896(var1, var2, var3, var4, var5, var6, var7);
         this.method12955(var4, var1);
         this.method12953(var4, var1);
         if (this.field20470.field35678 || this.field20470.field35677) {
            BlockPos.method8361(this.method12915()).forEach(var3x -> {
               if (this.field20470.field35678) {
                  this.method12951(var4, var1, var3x);
               }

               if (this.field20470.field35677) {
                  this.method12952(var4, var1, var3x);
               }
            });
         }

         return var10;
      }
   }

   @Override
   public void method12944(String var1, BlockPos var2, Class1659 var3, Random var4, Class9764 var5) {
   }

   private void method12951(Random var1, Class1660 var2, BlockPos var3) {
      BlockState var6 = var2.getBlockState(var3);
      if (!var6.isAir() && !var6.isIn(Blocks.VINE)) {
         Direction var7 = Class76.field161.method247(var1);
         BlockPos var8 = var3.method8349(var7);
         BlockState var9 = var2.getBlockState(var8);
         if (var9.isAir() && Block.method11549(var6.method23414(var2, var3), var7)) {
            Class8551 var10 = Class3402.method12039(var7.method536());
            var2.setBlockState(var8, Blocks.VINE.method11579().method23465(var10, Boolean.valueOf(true)), 3);
         }
      }
   }

   private void method12952(Random var1, Class1660 var2, BlockPos var3) {
      if (var1.nextFloat() < 0.5F && var2.getBlockState(var3).isIn(Blocks.NETHERRACK) && var2.getBlockState(var3.up()).isAir()) {
         var2.setBlockState(var3.up(), Blocks.field36449.method11579().method23465(Class3465.field19306, Boolean.valueOf(true)), 3);
      }
   }

   private void method12953(Random var1, Class1660 var2) {
      for (int var5 = this.field20444.field45678 + 1; var5 < this.field20444.field45681; var5++) {
         for (int var6 = this.field20444.field45680 + 1; var6 < this.field20444.field45683; var6++) {
            BlockPos var7 = new BlockPos(var5, this.field20444.field45679, var6);
            if (var2.getBlockState(var7).isIn(Blocks.NETHERRACK)) {
               this.method12954(var1, var2, var7.down());
            }
         }
      }
   }

   private void method12954(Random var1, Class1660 var2, BlockPos var3) {
      BlockPos.Mutable var6 = var3.method8354();
      this.method12957(var1, var2, var6);
      int var7 = 8;

      while (var7 > 0 && var1.nextFloat() < 0.5F) {
         var6.method8379(Direction.DOWN);
         var7--;
         this.method12957(var1, var2, var6);
      }
   }

   private void method12955(Random var1, Class1660 var2) {
      boolean var5 = this.field20469 == Class2219.field14494 || this.field20469 == Class2219.field14496;
      Vector3i var6 = this.field20444.method38401();
      int var7 = var6.getX();
      int var8 = var6.getZ();
      float[] var9 = new float[]{1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.9F, 0.9F, 0.8F, 0.7F, 0.6F, 0.4F, 0.2F};
      int var10 = var9.length;
      int var11 = (this.field20444.method38398() + this.field20444.method38400()) / 2;
      int var12 = var1.nextInt(Math.max(1, 8 - var11 / 2));

      BlockPos.Mutable var14 = BlockPos.ZERO.method8354();

      for (int var15 = var7 - var10; var15 <= var7 + var10; var15++) {
         for (int var16 = var8 - var10; var16 <= var8 + var10; var16++) {
            int var17 = Math.abs(var15 - var7) + Math.abs(var16 - var8);
            int var18 = Math.max(0, var17 + var12);
            if (var18 < var10) {
               float var19 = var9[var18];
               if (var1.nextDouble() < (double)var19) {
                  int var20 = method12958(var2, var15, var16, this.field20469);
                  int var21 = !var5 ? Math.min(this.field20444.field45679, var20) : var20;
                  var14.method8372(var15, var21, var16);
                  if (Math.abs(var21 - this.field20444.field45679) <= 3 && this.method12956(var2, var14)) {
                     this.method12957(var1, var2, var14);
                     if (this.field20470.field35677) {
                        this.method12952(var1, var2, var14);
                     }

                     this.method12954(var1, var2, var14.down());
                  }
               }
            }
         }
      }
   }

   private boolean method12956(Class1660 var1, BlockPos var2) {
      BlockState var5 = var1.getBlockState(var2);
      return !var5.isIn(Blocks.AIR)
         && !var5.isIn(Blocks.field36527)
         && !var5.isIn(Blocks.CHEST)
         && (this.field20469 == Class2219.field14499 || !var5.isIn(Blocks.LAVA));
   }

   private void method12957(Random var1, Class1660 var2, BlockPos var3) {
      if (!this.field20470.field35674 && var1.nextFloat() < 0.07F) {
         var2.setBlockState(var3, Blocks.field36890.method11579(), 3);
      } else {
         var2.setBlockState(var3, Blocks.NETHERRACK.method11579(), 3);
      }
   }

   private static int method12958(Class1660 var0, int var1, int var2, Class2219 var3) {
      return var0.method6736(method12959(var3), var1, var2) - 1;
   }

   public static Heightmap.Type method12959(Class2219 var0) {
      return var0 != Class2219.field14496 ? Heightmap.Type.field295 : Heightmap.Type.field297;
   }

   private static Class7872 method12960(Block var0, float var1, Block var2) {
      return new Class7872(new Class6439(var0, var1), Class6435.field28275, var2.method11579());
   }

   private static Class7872 method12961(Block var0, Block var1) {
      return new Class7872(new Class6438(var0), Class6435.field28275, var1.method11579());
   }
}
