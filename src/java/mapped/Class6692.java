package mapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class Class6692 extends Class6691 {
   public static final Codec<Class6692> field29310 = RecordCodecBuilder.create(
      var0 -> var0.group(
               Registry.field16074.fieldOf("type").forGetter(var0x -> var0x.field29311),
               Codec.INT.fieldOf("weight").forGetter(var0x -> var0x.field29309),
               Codec.INT.fieldOf("minCount").forGetter(var0x -> var0x.field29312),
               Codec.INT.fieldOf("maxCount").forGetter(var0x -> var0x.field29313)
            )
            .apply(var0, Class6692::new)
   );
   public final Class8992<?> field29311;
   public final int field29312;
   public final int field29313;

   public Class6692(Class8992<?> var1, int var2, int var3, int var4) {
      super(var2);
      this.field29311 = var1.method33209() != Class179.field628 ? var1 : Class8992.field41064;
      this.field29312 = var3;
      this.field29313 = var4;
   }

   @Override
   public String toString() {
      return Class8992.method33198(this.field29311) + "*(" + this.field29312 + "-" + this.field29313 + "):" + this.field29309;
   }
}
