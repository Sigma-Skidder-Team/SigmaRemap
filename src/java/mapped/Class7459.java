package mapped;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.biome.Biome;
import net.optifine.Config;

public class Class7459 implements Class7458 {
   private static String[] field32079;
   private TileEntity field32080;

   @Override
   public int method24123() {
      return Config.method26934(this.field32080.getPos(), 0);
   }

   @Override
   public BlockPos method24124() {
      return this.field32080.getPos();
   }

   @Override
   public String method24126() {
      return Class7599.method24889(this.field32080);
   }

   @Override
   public Biome method24125() {
      return this.field32080.method3734().getBiome(this.field32080.getPos());
   }

   @Override
   public int method24127() {
      return -1;
   }

   @Override
   public int method24128() {
      return -1;
   }

   public TileEntity method24129() {
      return this.field32080;
   }

   public void method24130(TileEntity var1) {
      this.field32080 = var1;
   }
}
