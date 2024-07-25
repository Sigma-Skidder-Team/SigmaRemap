package remapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class class_3043 implements class_6157 {
   public static final Codec<class_3043> field_14928 = RecordCodecBuilder.create(
      var0 -> var0.group(
               class_1331.field_7305.optionalFieldOf("exit").forGetter(var0x -> var0x.field_14925),
               Codec.BOOL.fieldOf("exact").forGetter(var0x -> var0x.field_14927)
            )
            .apply(var0, class_3043::new)
   );
   private final Optional<class_1331> field_14925;
   private final boolean field_14927;

   private class_3043(Optional<class_1331> var1, boolean var2) {
      this.field_14925 = var1;
      this.field_14927 = var2;
   }

   public static class_3043 method_13893(class_1331 var0, boolean var1) {
      return new class_3043(Optional.<class_1331>of(var0), var1);
   }

   public static class_3043 method_13894() {
      return new class_3043(Optional.<class_1331>empty(), false);
   }

   public Optional<class_1331> method_13892() {
      return this.field_14925;
   }

   public boolean method_13895() {
      return this.field_14927;
   }
}
