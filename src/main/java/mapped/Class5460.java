package mapped;

import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.feature.structure.StructureStart;
import net.minecraft.world.gen.feature.template.TemplateManager;

public class Class5460 extends StructureStart<Class4711> {
   private static String[] field24219;

   public Class5460(Structure<Class4711> var1, int var2, int var3, MutableBoundingBox var4, int var5, long var6) {
      super(var1, var2, var3, var4, var5, var6);
   }

   public void method17109(DynamicRegistries var1, ChunkGenerator var2, TemplateManager var3, int var4, int var5, Biome var6, Class4711 var7) {
      int var10 = var4 * 16;
      int var11 = var5 * 16;
      BlockPos var12 = new BlockPos(var10, 90, var11);
      Rotation var13 = Rotation.randomRotation(this.field24201);
      Class9830.method38791(var3, var12, var13, this.field24196, this.field24201, var7);
      this.method17113();
   }
}
