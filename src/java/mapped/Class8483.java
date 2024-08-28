package mapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public class Class8483 {
   public static final Codec<Class8483> field36361 = RecordCodecBuilder.<Class8483>create(
         var0 -> var0.group(
                  Codec.intRange(0, 4096).fieldOf("spacing").forGetter(var0x -> var0x.field36362),
                  Codec.intRange(0, 4096).fieldOf("separation").forGetter(var0x -> var0x.field36363),
                  Codec.intRange(0, Integer.MAX_VALUE).fieldOf("salt").forGetter(var0x -> var0x.field36364)
               )
               .apply(var0, Class8483::new)
      )
      .comapFlatMap(
         var0 -> var0.field36362 > var0.field36363 ? DataResult.success(var0) : DataResult.error("Spacing has to be smaller than separation"),
         Function.identity()
      );
   private final int field36362;
   private final int field36363;
   private final int field36364;

   public Class8483(int var1, int var2, int var3) {
      this.field36362 = var1;
      this.field36363 = var2;
      this.field36364 = var3;
   }

   public int method29980() {
      return this.field36362;
   }

   public int method29981() {
      return this.field36363;
   }

   public int method29982() {
      return this.field36364;
   }
}
