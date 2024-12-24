package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Mirror;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.feature.structure.StructureManager;
import net.minecraft.world.gen.feature.template.TemplateManager;

import java.util.Random;

public class Class4185 extends Class4180 {
   private final ResourceLocation field20471;
   private final Rotation field20472;

   public Class4185(TemplateManager var1, ResourceLocation var2, BlockPos var3, Rotation var4, int var5) {
      super(Class7792.field33459, 0);
      this.field20471 = var2;
      BlockPos var8 = (BlockPos)Class3191.method11408().get(var2);
      this.field20455 = var3.add(var8.getX(), var8.getY() - var5, var8.getZ());
      this.field20472 = var4;
      this.method12964(var1);
   }

   public Class4185(TemplateManager var1, CompoundNBT var2) {
      super(Class7792.field33459, var2);
      this.field20471 = new ResourceLocation(var2.getString("Template"));
      this.field20472 = Rotation.valueOf(var2.getString("Rot"));
      this.method12964(var1);
   }

   private void method12964(TemplateManager var1) {
      Class8969 var4 = var1.method31603(this.field20471);
      Class9463 var5 = new Class9463()
         .method36426(this.field20472)
         .method36425(Mirror.field13614)
         .method36427((BlockPos)Class3191.method11409().get(this.field20471))
         .method36434(Class7095.field30526);
      this.method12943(var4, this.field20455, var5);
   }

   @Override
   public void method12897(CompoundNBT var1) {
      super.method12897(var1);
      var1.putString("Template", this.field20471.toString());
      var1.putString("Rot", this.field20472.name());
   }

   @Override
   public void method12944(String var1, BlockPos var2, ServerWorldAccess var3, Random var4, MutableBoundingBox var5) {
      if ("chest".equals(var1)) {
         var3.setBlockState(var2, Blocks.AIR.getDefaultState(), 3);
         TileEntity var8 = var3.getTileEntity(var2.down());
         if (var8 instanceof ChestTileEntity) {
            ((ChestTileEntity)var8).method3744(Class8793.field39561, var4.nextLong());
         }
      }
   }

   @Override
   public boolean method12896(ISeedReader var1, StructureManager var2, ChunkGenerator var3, Random var4, MutableBoundingBox var5, ChunkPos var6, BlockPos var7) {
      Class9463 var10 = new Class9463()
         .method36426(this.field20472)
         .method36425(Mirror.field13614)
         .method36427((BlockPos)Class3191.method11409().get(this.field20471))
         .method36434(Class7095.field30526);
      BlockPos var11 = (BlockPos)Class3191.method11408().get(this.field20471);
      BlockPos var12 = this.field20455.method8337(Class8969.method32896(var10, new BlockPos(3 - var11.getX(), 0, 0 - var11.getZ())));
      int var13 = var1.method6736(Heightmap.Type.WORLD_SURFACE_WG, var12.getX(), var12.getZ());
      BlockPos var14 = this.field20455;
      this.field20455 = this.field20455.add(0, var13 - 90 - 1, 0);
      boolean var15 = super.method12896(var1, var2, var3, var4, var5, var6, var7);
      if (this.field20471.equals(Class3191.method11410())) {
         BlockPos var16 = this.field20455.method8337(Class8969.method32896(var10, new BlockPos(3, 0, 5)));
         BlockState var17 = var1.getBlockState(var16.down());
         if (!var17.isAir() && !var17.isIn(Blocks.LADDER)) {
            var1.setBlockState(var16, Blocks.SNOW_BLOCK.getDefaultState(), 3);
         }
      }

      this.field20455 = var14;
      return var15;
   }
}
