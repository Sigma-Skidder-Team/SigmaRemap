package remapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Random;

public class class_6534 extends class_7732 {
   public static final Codec<class_6534> field_33232 = class_1634.method_7287(class_2522.field_12489)
      .comapFlatMap(class_6534::method_29747, var0 -> var0.field_33234)
      .fieldOf("entries")
      .codec();
   private final class_1634<class_2522> field_33234;

   private static DataResult<class_6534> method_29747(class_1634<class_2522> var0) {
      return !var0.method_7284() ? DataResult.success(new class_6534(var0)) : DataResult.error("WeightedStateProvider with no states");
   }

   private class_6534(class_1634<class_2522> var1) {
      this.field_33234 = var1;
   }

   @Override
   public class_9212<?> method_35003() {
      return class_9212.field_47118;
   }

   public class_6534() {
      this(new class_1634<class_2522>());
   }

   public class_6534 method_29748(class_2522 var1, int var2) {
      this.field_33234.method_7281(var1, var2);
      return this;
   }

   @Override
   public class_2522 method_35002(Random var1, BlockPos var2) {
      return this.field_33234.method_7282(var1);
   }
}
