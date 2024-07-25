package remapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class class_3881 {
   public static final Codec<class_3881> field_18890 = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.INT.fieldOf("target").forGetter(class_3881::method_17946),
               Codec.intRange(0, 256).fieldOf("size").forGetter(class_3881::method_17945),
               Codec.INT.fieldOf("offset").forGetter(class_3881::method_17944)
            )
            .apply(var0, class_3881::new)
   );
   private final int field_18891;
   private final int field_18887;
   private final int field_18889;

   public class_3881(int var1, int var2, int var3) {
      this.field_18891 = var1;
      this.field_18887 = var2;
      this.field_18889 = var3;
   }

   public int method_17946() {
      return this.field_18891;
   }

   public int method_17945() {
      return this.field_18887;
   }

   public int method_17944() {
      return this.field_18889;
   }
}
