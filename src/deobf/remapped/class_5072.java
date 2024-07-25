package remapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Random;

public class class_5072 extends class_502 {
   public static final Codec<class_5072> field_26208 = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.INT.fieldOf("min_size").forGetter(var0x -> var0x.field_26207), Codec.INT.fieldOf("extra_size").forGetter(var0x -> var0x.field_26209)
            )
            .apply(var0, class_5072::new)
   );
   private final int field_26207;
   private final int field_26209;

   public class_5072(int var1, int var2) {
      this.field_26207 = var1;
      this.field_26209 = var2;
   }

   @Override
   public class_7739<?> method_2499() {
      return class_7739.field_39243;
   }

   @Override
   public void method_2498(class_9379 var1, BlockPos var2, class_2522 var3, Random var4) {
      class_2921 var7 = var2.method_6089();
      int var8 = this.field_26207 + var4.nextInt(var4.nextInt(this.field_26209 + 1) + 1);

      for (int var9 = 0; var9 < var8; var9++) {
         var1.method_7513(var7, var3, 2);
         var7.method_13368(Direction.field_817);
      }
   }
}
