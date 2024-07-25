package remapped;

import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.MapLike;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class class_3562 implements MapLike<class_8406> {
   public class_3562(class_3504 var1, CompoundNBT var2) {
      this.field_17444 = var1;
      this.field_17445 = var2;
   }

   @Nullable
   public class_8406 get(class_8406 var1) {
      return this.field_17445.method_25929(var1.method_38710());
   }

   @Nullable
   public class_8406 get(String var1) {
      return this.field_17445.method_25929(var1);
   }

   public Stream<Pair<class_8406, class_8406>> entries() {
      return this.field_17445
         .method_25952()
         .stream()
         .<Pair<class_8406, class_8406>>map(var2 -> Pair.of(this.field_17444.createString(var2), var1.method_25929(var2)));
   }

   @Override
   public String toString() {
      return "MapLike[" + this.field_17445 + "]";
   }
}
