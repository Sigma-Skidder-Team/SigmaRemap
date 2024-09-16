package mapped;

import net.minecraft.world.gen.feature.structure.StructureStart;

public class Class5458 extends StructureStart<Class4712> {
   private static String[] field24217;

   public Class5458(Structure<Class4712> var1, int var2, int var3, Class9764 var4, int var5, long var6) {
      super(var1, var2, var3, var4, var5, var6);
   }

   public void method17109(DynamicRegistries var1, ChunkGenerator var2, TemplateManager var3, int var4, int var5, Biome var6, Class4712 var7) {
      Class4210 var10 = new Class4210(this.field24201, var4 * 16, var5 * 16);
      this.field24196.add(var10);
      this.method17113();
   }
}
