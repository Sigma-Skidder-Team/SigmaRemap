package mapped;

import java.util.Random;

public class Class5451 extends Class5444<Class4712> {
   private static String[] field24209;
   private boolean field24210;

   public Class5451(Structure<Class4712> var1, int var2, int var3, Class9764 var4, int var5, long var6) {
      super(var1, var2, var3, var4, var5, var6);
   }

   public void method17109(DynamicRegistries var1, ChunkGenerator var2, Class8761 var3, int var4, int var5, Biome var6, Class4712 var7) {
      this.method17126(var4, var5);
   }

   private void method17126(int var1, int var2) {
      int var5 = var1 * 16 - 29;
      int var6 = var2 * 16 - 29;
      Direction var7 = Class76.field161.method247(this.field24201);
      this.field24196.add(new Class4224(this.field24201, var5, var6, var7));
      this.method17113();
      this.field24210 = true;
   }

   @Override
   public void method17112(Class1658 var1, Class7480 var2, ChunkGenerator var3, Random var4, Class9764 var5, Class7481 var6) {
      if (!this.field24210) {
         this.field24196.clear();
         this.method17126(this.method17118(), this.method17119());
      }

      super.method17112(var1, var2, var3, var4, var5, var6);
   }
}
