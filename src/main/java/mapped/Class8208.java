package mapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class Class8208 {
   public static final Codec<Class8208> field35242 = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.INT.fieldOf("target").forGetter(Class8208::method28511),
               Codec.intRange(0, 256).fieldOf("size").forGetter(Class8208::method28512),
               Codec.INT.fieldOf("offset").forGetter(Class8208::method28513)
            )
            .apply(var0, Class8208::new)
   );
   private final int field35243;
   private final int field35244;
   private final int field35245;

   public Class8208(int var1, int var2, int var3) {
      this.field35243 = var1;
      this.field35244 = var2;
      this.field35245 = var3;
   }

   public int method28511() {
      return this.field35243;
   }

   public int method28512() {
      return this.field35244;
   }

   public int method28513() {
      return this.field35245;
   }
}
