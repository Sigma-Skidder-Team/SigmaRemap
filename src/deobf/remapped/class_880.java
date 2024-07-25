package remapped;

import com.mojang.serialization.Codec;
import java.util.Random;

public class class_880 extends class_7732 {
   private static String[] field_4535;
   public static final Codec<class_880> field_4536 = Codec.unit(() -> class_880.field_4537);
   public static final class_880 field_4537 = new class_880();
   private static final class_2522[] field_4534 = new class_2522[]{
      class_4783.field_23260.method_29260(),
      class_4783.field_23181.method_29260(),
      class_4783.field_23390.method_29260(),
      class_4783.field_23528.method_29260()
   };
   private static final class_2522[] field_4538 = new class_2522[]{
      class_4783.field_23762.method_29260(),
      class_4783.field_23797.method_29260(),
      class_4783.field_23282.method_29260(),
      class_4783.field_23892.method_29260()
   };

   @Override
   public class_9212<?> method_35003() {
      return class_9212.field_47119;
   }

   @Override
   public class_2522 method_35002(Random var1, class_1331 var2) {
      double var5 = class_6325.field_32304.method_31321((double)var2.method_12173() / 200.0, (double)var2.method_12185() / 200.0, false);
      if (!(var5 < -0.8)) {
         return var1.nextInt(3) <= 0 ? class_4783.field_23410.method_29260() : class_9665.<class_2522>method_44697(field_4538, var1);
      } else {
         return class_9665.<class_2522>method_44697(field_4534, var1);
      }
   }
}
