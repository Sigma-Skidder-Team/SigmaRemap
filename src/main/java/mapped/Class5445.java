package mapped;

import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.feature.structure.ShipwreckConfig;
import net.minecraft.world.gen.feature.structure.ShipwreckPieces;
import net.minecraft.world.gen.feature.structure.StructureStart;
import net.minecraft.world.gen.feature.template.TemplateManager;

public class Class5445 extends StructureStart<ShipwreckConfig> {
   private static String[] field24202;

   public Class5445(Structure<ShipwreckConfig> var1, int var2, int var3, MutableBoundingBox var4, int var5, long var6) {
      super(var1, var2, var3, var4, var5, var6);
   }

   public void method17109(DynamicRegistries var1, ChunkGenerator var2, TemplateManager var3, int var4, int var5, Biome var6, ShipwreckConfig var7) {
      Rotation var10 = Rotation.randomRotation(this.field24201);
      BlockPos var11 = new BlockPos(var4 * 16, 90, var5 * 16);
      ShipwreckPieces.method30926(var3, var11, var10, this.field24196, this.field24201, var7);
      this.method17113();
   }
}
