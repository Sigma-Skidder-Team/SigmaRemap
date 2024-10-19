package mapped;

import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.feature.structure.StructureStart;
import net.minecraft.world.gen.feature.template.TemplateManager;

import java.util.List;

public class Class5447 extends StructureStart<Class4712> {
   private static String[] field24204;
   private final long field24205;

   public Class5447(Structure<Class4712> var1, int var2, int var3, MutableBoundingBox var4, int var5, long var6) {
      super(var1, var2, var3, var4, var5, var6);
      this.field24205 = var6;
   }

   public void method17109(DynamicRegistries var1, ChunkGenerator var2, TemplateManager var3, int var4, int var5, Biome var6, Class4712 var7) {
      int var10 = 0;

      Class4196 var11;
      do {
         this.field24196.clear();
         this.field24197 = MutableBoundingBox.method38386();
         this.field24201.setLargeFeatureSeed(this.field24205 + (long)(var10++), var4, var5);
         Class9331.method35283();
         var11 = new Class4196(this.field24201, (var4 << 4) + 2, (var5 << 4) + 2);
         this.field24196.add(var11);
         var11.method12894(var11, this.field24196, this.field24201);
         List var12 = var11.field20500;

         while (!var12.isEmpty()) {
            int var13 = this.field24201.nextInt(var12.size());
            Class4178 var14 = (Class4178)var12.remove(var13);
            var14.method12894(var11, this.field24196, this.field24201);
         }

         this.method17113();
         this.method17115(var2.func_230356_f_(), this.field24201, 10);
      } while (this.field24196.isEmpty() || var11.field20499 == null);
   }
}
