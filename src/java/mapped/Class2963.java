package mapped;

import com.mojang.serialization.Codec;

public class Class2963 extends Class2961<Class4728> {
   public Class2963(Codec<Class4728> var1) {
      super(var1);
   }

   public boolean method11361(Class5646 var1, Class1685 var2, long var3, Class2420 var5, int var6, int var7, Biome var8, Class7481 var9, Class4728 var10) {
      var5.method10374(var3, var6, var7, 10387320);
      return var5.nextFloat() < var10.field22399;
   }

   @Override
   public Class7072<Class4728> method11359() {
      return Class5448::new;
   }
}
