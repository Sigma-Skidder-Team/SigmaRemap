package mapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class Class7035 {
   public static final MapCodec<Class7035> field30357 = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
               Class87.field226.fieldOf("precipitation").forGetter(var0x -> var0x.field30358),
               Codec.FLOAT.fieldOf("temperature").forGetter(var0x -> var0x.field30359),
               Class93.field244.optionalFieldOf("temperature_modifier", Class93.field241).forGetter(var0x -> var0x.field30360),
               Codec.FLOAT.fieldOf("downfall").forGetter(var0x -> var0x.field30361)
            )
            .apply(var0, Class7035::new)
   );
   private final Class87 field30358;
   private final float field30359;
   private final Class93 field30360;
   private final float field30361;

   private Class7035(Class87 var1, float var2, Class93 var3, float var4) {
      this.field30358 = var1;
      this.field30359 = var2;
      this.field30360 = var3;
      this.field30361 = var4;
   }

   // $VF: synthetic method
   public static Class87 method21840(Class7035 var0) {
      return var0.field30358;
   }

   // $VF: synthetic method
   public static Class93 method21841(Class7035 var0) {
      return var0.field30360;
   }

   // $VF: synthetic method
   public static float method21842(Class7035 var0) {
      return var0.field30359;
   }

   // $VF: synthetic method
   public static float method21843(Class7035 var0) {
      return var0.field30361;
   }

   // $VF: synthetic method
   public Class7035(Class87 var1, float var2, Class93 var3, float var4, Class14 var5) {
      this(var1, var2, var3, var4);
   }
}
