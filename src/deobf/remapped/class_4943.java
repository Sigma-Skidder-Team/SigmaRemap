package remapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class class_4943 extends class_2103 {
   public static final Codec<class_4943> field_25594 = RecordCodecBuilder.create(
      var0 -> var0.group(
               class_3801.field_18596.fieldOf("heightmap").orElse(class_3801.field_18598).forGetter(var0x -> var0x.field_25597),
               Codec.INT.fieldOf("offset").orElse(0).forGetter(var0x -> var0x.field_25595)
            )
            .apply(var0, class_4943::new)
   );
   private final class_3801 field_25597;
   private final int field_25595;

   public class_4943(class_3801 var1, int var2) {
      this.field_25597 = var1;
      this.field_25595 = var2;
   }

   @Nullable
   @Override
   public class_4099 method_9859(class_4924 var1, class_1331 var2, class_1331 var3, class_4099 var4, class_4099 var5, class_8478 var6) {
      class_3801 var9;
      if (!(var1 instanceof class_6331)) {
         var9 = this.field_25597;
      } else if (this.field_25597 != class_3801.field_18598) {
         if (this.field_25597 != class_3801.field_18591) {
            var9 = this.field_25597;
         } else {
            var9 = class_3801.field_18599;
         }
      } else {
         var9 = class_3801.field_18592;
      }

      int var10 = var1.method_22562(var9, var5.field_19965.method_12173(), var5.field_19965.method_12185()) + this.field_25595;
      int var11 = var4.field_19965.method_12165();
      return new class_4099(new class_1331(var5.field_19965.method_12173(), var10 + var11, var5.field_19965.method_12185()), var5.field_19967, var5.field_19968);
   }

   @Override
   public class_2111<?> method_9858() {
      return class_2111.field_10593;
   }
}
