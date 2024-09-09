package mapped;

import com.mojang.serialization.Codec;

public class Class2976 extends Structure<Class4712> {
   public Class2976(Codec<Class4712> var1) {
      super(var1);
   }

   @Override
   public boolean method11357() {
      return false;
   }

   public boolean method11361(ChunkGenerator var1, Class1685 var2, long var3, Class2420 var5, int var6, int var7, Biome var8, ChunkPos var9, Class4712 var10) {
      for (Biome var14 : var2.method7202(var6 * 16 + 9, var1.method17807(), var7 * 16 + 9, 32)) {
         if (!var14.method32507().method24277(this)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public Class7072<Class4712> method11359() {
      return Class5450::new;
   }
}
