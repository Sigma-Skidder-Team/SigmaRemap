package mapped;

import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.structure.StructureStart;
import net.minecraft.world.gen.feature.template.TemplateManager;

import java.util.List;

public class Class5449 extends StructureStart<Class4712> {
   private static String[] field24207;

   public Class5449(Structure<Class4712> var1, int var2, int var3, MutableBoundingBox var4, int var5, long var6) {
      super(var1, var2, var3, var4, var5, var6);
   }

   public void method17109(DynamicRegistries var1, ChunkGenerator var2, TemplateManager var3, int var4, int var5, Biome var6, Class4712 var7) {
      Class4175 var10 = new Class4175(this.field24201, (var4 << 4) + 2, (var5 << 4) + 2);
      this.field24196.add(var10);
      var10.method12894(var10, this.field24196, this.field24201);
      List var11 = var10.field20440;

      while (!var11.isEmpty()) {
         int var12 = this.field24201.nextInt(var11.size());
         Class4178 var13 = (Class4178)var11.remove(var12);
         var13.method12894(var10, this.field24196, this.field24201);
      }

      this.method17113();
      this.method17116(this.field24201, 48, 70);
   }
}
