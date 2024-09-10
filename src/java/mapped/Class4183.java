package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.entity.EntityType;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.ISeedReader;

import java.util.Random;

public class Class4183 extends Class4180 {
   private final Class110 field20460;
   private final float field20461;
   private final ResourceLocation field20462;
   private final Class80 field20463;
   private final boolean field20464;

   public Class4183(TemplateManager var1, ResourceLocation var2, BlockPos var3, Class80 var4, float var5, Class110 var6, boolean var7) {
      super(Class7792.field33458, 0);
      this.field20462 = var2;
      this.field20455 = var3;
      this.field20463 = var4;
      this.field20461 = var5;
      this.field20460 = var6;
      this.field20464 = var7;
      this.method12947(var1);
   }

   public Class4183(TemplateManager var1, CompoundNBT var2) {
      super(Class7792.field33458, var2);
      this.field20462 = new ResourceLocation(var2.getString("Template"));
      this.field20463 = Class80.valueOf(var2.getString("Rot"));
      this.field20461 = var2.getFloat("Integrity");
      this.field20460 = Class110.valueOf(var2.getString("BiomeType"));
      this.field20464 = var2.getBoolean("IsLarge");
      this.method12947(var1);
   }

   private void method12947(TemplateManager var1) {
      Class8969 var4 = var1.method31603(this.field20462);
      Class9463 var5 = new Class9463().method36426(this.field20463).method36425(Class2089.field13614).method36434(Class7095.field30528);
      this.method12943(var4, this.field20455, var5);
   }

   @Override
   public void method12897(CompoundNBT var1) {
      super.method12897(var1);
      var1.method109("Template", this.field20462.toString());
      var1.method109("Rot", this.field20463.name());
      var1.putFloat("Integrity", this.field20461);
      var1.method109("BiomeType", this.field20460.toString());
      var1.putBoolean("IsLarge", this.field20464);
   }

   @Override
   public void method12944(String var1, BlockPos var2, Class1659 var3, Random var4, Class9764 var5) {
      if (!"chest".equals(var1)) {
         if ("drowned".equals(var1)) {
            Class1037 var8 = EntityType.field41021.create(var3.method6970());
            var8.method4278();
            var8.moveToBlockPosAndAngles(var2, 0.0F, 0.0F);
            var8.method4276(var3, var3.method6807(var2), Class2202.field14394, (Class5093)null, (CompoundNBT)null);
            var3.method6995(var8);
            if (var2.getY() <= var3.method6776()) {
               var3.setBlockState(var2, Blocks.WATER.method11579(), 2);
            } else {
               var3.setBlockState(var2, Blocks.AIR.method11579(), 2);
            }
         }
      } else {
         var3.setBlockState(
            var2,
            Blocks.CHEST.method11579().method23465(Class3348.field18867, Boolean.valueOf(var3.getFluidState(var2).method23486(FluidTags.field40469))),
            2
         );
         TileEntity var9 = var3.getTileEntity(var2);
         if (var9 instanceof Class941) {
            ((Class941)var9).method3744(!this.field20464 ? Class8793.field39563 : Class8793.field39564, var4.nextLong());
         }
      }
   }

   @Override
   public boolean method12896(ISeedReader var1, Class7480 var2, ChunkGenerator var3, Random var4, Class9764 var5, ChunkPos var6, BlockPos var7) {
      this.field20454.method36433().method36434(new Class7094(this.field20461)).method36434(Class7095.field30528);
      int var10 = var1.method6736(Class101.field297, this.field20455.getX(), this.field20455.getZ());
      this.field20455 = new BlockPos(this.field20455.getX(), var10, this.field20455.getZ());
      BlockPos var11 = Class8969.method32905(
            new BlockPos(this.field20453.method32886().getX() - 1, 0, this.field20453.method32886().getZ() - 1),
            Class2089.field13614,
            this.field20463,
            BlockPos.ZERO
         )
         .method8337(this.field20455);
      this.field20455 = new BlockPos(this.field20455.getX(), this.method12948(this.field20455, var1, var11), this.field20455.getZ());
      return super.method12896(var1, var2, var3, var4, var5, var6, var7);
   }

   private int method12948(BlockPos var1, IBlockReader var2, BlockPos var3) {
      int var6 = var1.getY();
      int var7 = 512;
      int var8 = var6 - 1;
      int var9 = 0;

      for (BlockPos var11 : BlockPos.method8359(var1, var3)) {
         int var12 = var11.getX();
         int var13 = var11.getZ();
         int var14 = var1.getY() - 1;
         BlockPos.Mutable var15 = new BlockPos.Mutable(var12, var14, var13);
         BlockState var16 = var2.getBlockState(var15);

         for (FluidState var17 = var2.getFluidState(var15);
              (var16.isAir() || var17.method23486(FluidTags.field40469) || var16.getBlock().isIn(BlockTags.field32779)) && var14 > 1;
              var17 = var2.getFluidState(var15)
         ) {
            var15.method8372(var12, --var14, var13);
            var16 = var2.getBlockState(var15);
         }

         var7 = Math.min(var7, var14);
         if (var14 < var8 - 2) {
            var9++;
         }
      }

      int var18 = Math.abs(var1.getX() - var3.getX());
      if (var8 - var7 > 2 && var9 > var18 - 2) {
         var6 = var7 + 1;
      }

      return var6;
   }
}
