package remapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public final class class_8044 {
   public static final MapCodec<class_8044> field_41202 = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
               Identifier.field_22655
                  .flatXmap(
                     var0x -> Optional.<Object>ofNullable(class_8796.method_40440().get(var0x))
                           .<DataResult>map(DataResult::success)
                           .orElseGet(() -> DataResult.error("Unknown preset: " + var0x)),
                     var0x -> DataResult.success(class_8796.method_40439(var0x))
                  )
                  .fieldOf("preset")
                  .stable()
                  .forGetter(class_8044::method_36508),
               class_5203.<class_6325>method_23878(class_8669.field_44359).forGetter(class_8044::method_36510),
               Codec.LONG.fieldOf("seed").stable().forGetter(class_8044::method_36511)
            )
            .apply(var0, var0.stable(class_8044::new))
   );
   private final class_8796 field_41201;
   private final class_8669<class_6325> field_41198;
   private final long field_41200;

   private class_8044(class_8796 var1, class_8669<class_6325> var2, long var3) {
      this.field_41201 = var1;
      this.field_41198 = var2;
      this.field_41200 = var3;
   }

   public class_8796 method_36508() {
      return this.field_41201;
   }

   public class_8669<class_6325> method_36510() {
      return this.field_41198;
   }

   public long method_36511() {
      return this.field_41200;
   }

   public class_7258 method_36509() {
      return this.field_41201.method_40438(this.field_41198, this.field_41200);
   }
}
