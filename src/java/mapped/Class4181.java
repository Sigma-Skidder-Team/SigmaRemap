package mapped;

import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.Mirror;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.gen.feature.structure.ShipwreckPieces;
import net.minecraft.world.gen.feature.structure.StructureManager;
import net.minecraft.world.gen.feature.template.TemplateManager;

import java.util.Random;

public class Class4181 extends Class4180 {
   private final Rotation field20447;
   private final ResourceLocation field20456;
   private final boolean field20457;

   public Class4181(TemplateManager var1, ResourceLocation var2, BlockPos var3, Rotation var4, boolean var5) {
      super(Class7792.field33478, 0);
      this.field20455 = var3;
      this.field20447 = var4;
      this.field20456 = var2;
      this.field20457 = var5;
      this.method12945(var1);
   }

   public Class4181(TemplateManager var1, CompoundNBT var2) {
      super(Class7792.field33478, var2);
      this.field20456 = new ResourceLocation(var2.getString("Template"));
      this.field20457 = var2.getBoolean("isBeached");
      this.field20447 = Rotation.valueOf(var2.getString("Rot"));
      this.method12945(var1);
   }

   @Override
   public void method12897(CompoundNBT var1) {
      super.method12897(var1);
      var1.method109("Template", this.field20456.toString());
      var1.putBoolean("isBeached", this.field20457);
      var1.method109("Rot", this.field20447.name());
   }

   private void method12945(TemplateManager var1) {
      Class8969 var4 = var1.method31603(this.field20456);
      Class9463 var5 = new Class9463()
         .method36426(this.field20447)
         .method36425(Mirror.field13614)
         .method36427(ShipwreckPieces.method30927())
         .method36434(Class7095.field30528);
      this.method12943(var4, this.field20455, var5);
   }

   @Override
   public void method12944(String var1, BlockPos var2, Class1659 var3, Random var4, Class9764 var5) {
      if (!"map_chest".equals(var1)) {
         if (!"treasure_chest".equals(var1)) {
            if ("supply_chest".equals(var1)) {
               Class939.method3740(var3, var4, var2.down(), Class8793.field39567);
            }
         } else {
            Class939.method3740(var3, var4, var2.down(), Class8793.field39568);
         }
      } else {
         Class939.method3740(var3, var4, var2.down(), Class8793.field39566);
      }
   }

   @Override
   public boolean method12896(ISeedReader var1, StructureManager var2, ChunkGenerator var3, Random var4, Class9764 var5, ChunkPos var6, BlockPos var7) {
      int var10 = 256;
      int var11 = 0;
      BlockPos var12 = this.field20453.method32886();
      Heightmap.Type var13 = !this.field20457 ? Heightmap.Type.OCEAN_FLOOR_WG : Heightmap.Type.WORLD_SURFACE_WG;
      int var14 = var12.getX() * var12.getZ();
      if (var14 != 0) {
         BlockPos var15 = this.field20455.add(var12.getX() - 1, 0, var12.getZ() - 1);

         for (BlockPos var17 : BlockPos.method8359(this.field20455, var15)) {
            int var18 = var1.method6736(var13, var17.getX(), var17.getZ());
            var11 += var18;
            var10 = Math.min(var10, var18);
         }

         var11 /= var14;
      } else {
         var11 = var1.method6736(var13, this.field20455.getX(), this.field20455.getZ());
      }

      int var20 = !this.field20457 ? var11 : var10 - var12.getY() / 2 - var4.nextInt(3);
      this.field20455 = new BlockPos(this.field20455.getX(), var20, this.field20455.getZ());
      return super.method12896(var1, var2, var3, var4, var5, var6, var7);
   }
}
