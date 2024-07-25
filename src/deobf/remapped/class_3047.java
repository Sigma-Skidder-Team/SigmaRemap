package remapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class class_3047 {
   private static final int[] field_14940 = new int[]{0, 10, 70, 150, 250};
   public static final Codec<class_3047> field_14935 = RecordCodecBuilder.create(
      var0 -> var0.group(
               class_8669.field_44375.fieldOf("type").orElseGet(() -> class_8853.field_45268).forGetter(var0x -> var0x.field_14939),
               class_8669.field_44425.fieldOf("profession").orElseGet(() -> class_4466.field_21775).forGetter(var0x -> var0x.field_14936),
               Codec.INT.fieldOf("level").orElse(1).forGetter(var0x -> var0x.field_14938)
            )
            .apply(var0, class_3047::new)
   );
   private final class_8853 field_14939;
   private final class_4466 field_14936;
   private final int field_14938;

   public class_3047(class_8853 var1, class_4466 var2, int var3) {
      this.field_14939 = var1;
      this.field_14936 = var2;
      this.field_14938 = Math.max(1, var3);
   }

   public class_8853 method_13912() {
      return this.field_14939;
   }

   public class_4466 method_13910() {
      return this.field_14936;
   }

   public int method_13906() {
      return this.field_14938;
   }

   public class_3047 method_13914(class_8853 var1) {
      return new class_3047(var1, this.field_14936, this.field_14938);
   }

   public class_3047 method_13909(class_4466 var1) {
      return new class_3047(this.field_14939, var1, this.field_14938);
   }

   public class_3047 method_13913(int var1) {
      return new class_3047(this.field_14939, this.field_14936, var1);
   }

   public static int method_13908(int var0) {
      return !method_13907(var0) ? 0 : field_14940[var0 - 1];
   }

   public static int method_13905(int var0) {
      return !method_13907(var0) ? 0 : field_14940[var0];
   }

   public static boolean method_13907(int var0) {
      return var0 >= 1 && var0 < 5;
   }
}
