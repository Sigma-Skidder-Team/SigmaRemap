package mapped;

import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.function.Supplier;

public class Class9319<SC extends Class8277> {
   private static String[] field43261;
   public static final Codec<Class9319<?>> field43262 = Registry.field16108.dispatch(var0 -> var0.field43264, Class6768::method20656);
   public static final Codec<Supplier<Class9319<?>>> field43263 = RegistryKeyCodec.create(Registry.field16100, field43262);
   public final Class6768<SC> field43264;
   public final SC field43265;

   public Class9319(Class6768<SC> var1, SC var2) {
      this.field43264 = var1;
      this.field43265 = (SC)var2;
   }

   public void method35209(
           Random var1, IChunk var2, Biome var3, int var4, int var5, int var6, double var7, BlockState var9, BlockState var10, int var11, long var12
   ) {
      this.field43264.method20654(var1, var2, var3, var4, var5, var6, var7, var9, var10, var11, var12, this.field43265);
   }

   public void method35210(long var1) {
      this.field43264.method20658(var1);
   }

   public SC method35211() {
      return this.field43265;
   }
}
