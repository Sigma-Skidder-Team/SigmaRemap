package mapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class Class9648 {
   public static final Codec<Class9648> field45108 = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.INT.fieldOf("centerX").orElse(0).forGetter(var0x -> var0x.field45109),
               Codec.INT.fieldOf("centerZ").orElse(0).forGetter(var0x -> var0x.field45110),
               Codec.INT.fieldOf("radius").orElse(0).forGetter(var0x -> var0x.field45111),
               Codec.INT.fieldOf("height").orElse(0).forGetter(var0x -> var0x.field45112),
               Codec.BOOL.fieldOf("guarded").orElse(false).forGetter(var0x -> var0x.field45113)
            )
            .apply(var0, Class9648::new)
   );
   private final int field45109;
   private final int field45110;
   private final int field45111;
   private final int field45112;
   private final boolean field45113;
   private final Class6488 field45114;

   public Class9648(int var1, int var2, int var3, int var4, boolean var5) {
      this.field45109 = var1;
      this.field45110 = var2;
      this.field45111 = var3;
      this.field45112 = var4;
      this.field45113 = var5;
      this.field45114 = new Class6488((double)(var1 - var3), 0.0, (double)(var2 - var3), (double)(var1 + var3), 256.0, (double)(var2 + var3));
   }

   public boolean method37625(BlockPos var1) {
      return var1.method8304() >> 4 == this.field45109 >> 4 && var1.method8306() >> 4 == this.field45110 >> 4;
   }

   public int method37626() {
      return this.field45109;
   }

   public int method37627() {
      return this.field45110;
   }

   public int method37628() {
      return this.field45111;
   }

   public int method37629() {
      return this.field45112;
   }

   public boolean method37630() {
      return this.field45113;
   }

   public Class6488 method37631() {
      return this.field45114;
   }
}
