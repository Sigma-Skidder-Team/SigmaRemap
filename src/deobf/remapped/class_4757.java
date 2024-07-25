package remapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public class class_4757 {
   public static final Codec<class_4757> field_23036 = RecordCodecBuilder.create(
         var0 -> var0.group(
                  Codec.intRange(0, 4096).fieldOf("spacing").forGetter(var0x -> var0x.field_23038),
                  Codec.intRange(0, 4096).fieldOf("separation").forGetter(var0x -> var0x.field_23035),
                  Codec.intRange(0, Integer.MAX_VALUE).fieldOf("salt").forGetter(var0x -> var0x.field_23037)
               )
               .apply(var0, class_4757::new)
      )
      .comapFlatMap(
         var0 -> var0.field_23038 > var0.field_23035 ? DataResult.success(var0) : DataResult.error("Spacing has to be smaller than separation"),
         Function.identity()
      );
   private final int field_23038;
   private final int field_23035;
   private final int field_23037;

   public class_4757(int var1, int var2, int var3) {
      this.field_23038 = var1;
      this.field_23035 = var2;
      this.field_23037 = var3;
   }

   public int method_21953() {
      return this.field_23038;
   }

   public int method_21952() {
      return this.field_23035;
   }

   public int method_21951() {
      return this.field_23037;
   }
}
