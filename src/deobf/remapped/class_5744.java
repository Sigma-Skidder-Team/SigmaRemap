package remapped;

import com.google.common.collect.ImmutableMap;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class class_5744 extends class_5920<class_4612> {
   private static String[] field_29088;
   private final float field_29087;

   public class_5744(float var1) {
      super(ImmutableMap.of(class_6044.field_30889, class_561.field_3318));
      this.field_29087 = var1;
   }

   public boolean method_25996(class_6331 var1, class_4612 var2) {
      return !var1.method_25263(var2.method_37075());
   }

   public void method_25995(class_6331 var1, class_4612 var2, long var3) {
      class_1331 var7 = var2.method_37075();
      List var8 = class_1331.method_6084(var7.method_6104(-1, -1, -1), var7.method_6104(1, 1, 1))
         .<class_1331>map(class_1331::method_6072)
         .collect(Collectors.toList());
      Collections.shuffle(var8);
      Optional var9 = var8.stream()
         .filter(var1x -> !var1.method_25263(var1x))
         .filter(var2x -> var1.method_29518(var2x, var2))
         .filter(var2x -> var1.method_6682(var2))
         .findFirst();
      var9.ifPresent(var2x -> var2.method_26525().method_5105(class_6044.field_30889, new class_6651(var2x, this.field_29087, 0)));
   }
}
