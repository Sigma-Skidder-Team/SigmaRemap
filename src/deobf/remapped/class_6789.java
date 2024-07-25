package remapped;

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Supplier;

public class class_6789 extends class_8781 {
   public static final Codec<class_6789> field_35011 = RecordCodecBuilder.create(
      var0 -> var0.group(method_40367(), method_40366(), method_11825()).apply(var0, class_6789::new)
   );

   public class_6789(Either<class_4639, class_6561> var1, Supplier<class_86> var2, class_7599 var3) {
      super(var1, var2, var3);
   }

   @Override
   public class_8478 method_40365(class_6631 var1, class_9616 var2, boolean var3) {
      class_8478 var6 = super.method_40365(var1, var2, var3);
      var6.method_39033(class_2010.field_10194);
      var6.method_39048(class_2010.field_10193);
      return var6;
   }

   @Override
   public class_4263<?> method_11836() {
      return class_4263.field_20661;
   }

   @Override
   public String toString() {
      return "LegacySingle[" + this.field_44942 + "]";
   }
}
