package remapped;

import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.stream.Stream;

public class class_3010<DC extends class_9793> implements class_3988<class_3010<?>> {
   public static final Codec<class_3010<?>> field_14783 = class_8669.field_44449.dispatch("type", var0 -> var0.field_14782, class_5788::method_26181);
   private final class_5788<DC> field_14782;
   private final DC field_14780;

   public class_3010(class_5788<DC> var1, DC var2) {
      this.field_14782 = var1;
      this.field_14780 = (DC)var2;
   }

   public Stream<BlockPos> method_13769(class_6680 var1, Random var2, BlockPos var3) {
      return this.field_14782.method_26185(var1, var2, this.field_14780, var3);
   }

   @Override
   public String toString() {
      return String.format("[%s %s]", class_8669.field_44449.method_39797(this.field_14782), this.field_14780);
   }

   public class_3010<?> method_13771(class_3010<?> var1) {
      return new class_3010<class_2692>(class_5788.field_29239, new class_2692(var1, this));
   }

   public DC method_13768() {
      return this.field_14780;
   }
}
