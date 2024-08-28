package mapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class Class9245 {
   public static final Codec<Class9245> field42537 = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.intRange(0, 1023).fieldOf("distance").forGetter(Class9245::method34767),
               Codec.intRange(0, 1023).fieldOf("spread").forGetter(Class9245::method34768),
               Codec.intRange(1, 4095).fieldOf("count").forGetter(Class9245::method34769)
            )
            .apply(var0, Class9245::new)
   );
   private final int field42538;
   private final int field42539;
   private final int field42540;

   public Class9245(int var1, int var2, int var3) {
      this.field42538 = var1;
      this.field42539 = var2;
      this.field42540 = var3;
   }

   public int method34767() {
      return this.field42538;
   }

   public int method34768() {
      return this.field42539;
   }

   public int method34769() {
      return this.field42540;
   }
}
