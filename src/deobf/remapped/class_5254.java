package remapped;

import com.mojang.serialization.Codec;
import java.util.Random;

public class class_5254 extends class_7732 {
   private static String[] field_26901;
   public static final Codec<class_5254> field_26903 = Codec.unit(() -> class_5254.field_26902);
   private static final class_2522[] field_26904 = new class_2522[]{
      class_4783.field_23410.method_29260(),
      class_4783.field_23762.method_29260(),
      class_4783.field_23275.method_29260(),
      class_4783.field_23797.method_29260(),
      class_4783.field_23181.method_29260(),
      class_4783.field_23260.method_29260(),
      class_4783.field_23528.method_29260(),
      class_4783.field_23390.method_29260(),
      class_4783.field_23282.method_29260(),
      class_4783.field_23892.method_29260(),
      class_4783.field_23553.method_29260()
   };
   public static final class_5254 field_26902 = new class_5254();

   @Override
   public class_9212<?> method_35003() {
      return class_9212.field_47122;
   }

   @Override
   public class_2522 method_35002(Random var1, BlockPos var2) {
      double var5 = class_9299.method_42827(
         (1.0 + class_6325.field_32304.method_31321((double)var2.method_12173() / 48.0, (double)var2.method_12185() / 48.0, false)) / 2.0, 0.0, 0.9999
      );
      return field_26904[(int)(var5 * (double)field_26904.length)];
   }
}
