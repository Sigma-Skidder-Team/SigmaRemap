package mapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public final class Class9609 {
   public static final Codec<Class9609> field44933 = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.INT.fieldOf("spacing").forGetter(var0x -> var0x.field44934),
               Codec.INT.fieldOf("separation").forGetter(var0x -> var0x.field44935),
               Codec.INT.fieldOf("salt").forGetter(var0x -> var0x.field44936)
            )
            .apply(var0, Class9609::new)
   );
   private final int field44934;
   private final int field44935;
   private final int field44936;

   public Class9609(int var1, int var2, int var3) {
      this.field44934 = var1;
      this.field44935 = var2;
      this.field44936 = var3;
   }

   public <T> Dynamic<T> method37349(DynamicOps<T> var1) {
      return new Dynamic(var1, field44933.encodeStart(var1, this).result().orElse(var1.emptyMap()));
   }

   // $VF: synthetic method
   public static int method37354(Class9609 var0) {
      return var0.field44934;
   }

   // $VF: synthetic method
   public static int method37355(Class9609 var0) {
      return var0.field44935;
   }

   // $VF: synthetic method
   public static int method37356(Class9609 var0) {
      return var0.field44936;
   }
}
