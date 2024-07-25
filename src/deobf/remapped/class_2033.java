package remapped;

import com.mojang.datafixers.DataFixUtils;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class class_2033 {
   private final class_9379 field_10321;
   private final class_2904 field_10322;

   public class_2033(class_9379 var1, class_2904 var2) {
      this.field_10321 = var1;
      this.field_10322 = var2;
   }

   public class_2033 method_9529(class_702 var1) {
      if (var1.method_7066() == this.field_10321) {
         return new class_2033(var1, this.field_10322);
      } else {
         throw new IllegalStateException("Using invalid feature manager (source level: " + var1.method_7066() + ", region: " + var1);
      }
   }

   public Stream<? extends class_3200<?>> method_9531(class_6979 var1, class_5390<?> var2) {
      return this.field_10321
         .method_22554(var1.method_31930(), var1.method_31900(), class_7335.field_37493)
         .method_15067(var2)
         .stream()
         .<class_6979>map(var0 -> class_6979.method_31922(new class_2034(var0), 0))
         .<class_3200<?>>map(
            var2x -> this.method_9528(var2x, var2, this.field_10321.method_22554(var2x.method_31930(), var2x.method_31900(), class_7335.field_37491))
         )
         .filter(var0 -> var0 != null && var0.method_14731());
   }

   @Nullable
   public class_3200<?> method_9528(class_6979 var1, class_5390<?> var2, class_3287 var3) {
      return var3.method_15062(var2);
   }

   public void method_9530(class_6979 var1, class_5390<?> var2, class_3200<?> var3, class_3287 var4) {
      var4.method_15064(var2, var3);
   }

   public void method_9527(class_6979 var1, class_5390<?> var2, long var3, class_3287 var5) {
      var5.method_15063(var2, var3);
   }

   public boolean method_9532() {
      return this.field_10322.method_13287();
   }

   public class_3200<?> method_9525(class_1331 var1, boolean var2, class_5390<?> var3) {
      return (class_3200<?>)DataFixUtils.orElse(
         this.method_9531(class_6979.method_31921(var1), var3)
            .filter(var1x -> var1x.method_14724().method_44395(var1))
            .filter(var2x -> !var2 || var2x.method_14736().stream().anyMatch(var1xx -> var1xx.method_32512().method_44395(var1)))
            .findFirst(),
         class_3200.field_15991
      );
   }
}
