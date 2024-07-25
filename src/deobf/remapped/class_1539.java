package remapped;

import com.mojang.serialization.Codec;
import java.util.Random;

public class class_1539 extends class_2446<class_1059> {
   public class_1539(Codec<class_1059> var1) {
      super(var1);
   }

   public boolean method_6979(class_9379 var1, BlockPos var2, class_1059 var3) {
      return !var3.field_5809.contains(var1.method_28262(var2));
   }

   public int method_6978(class_1059 var1) {
      return var1.field_5810;
   }

   public BlockPos method_6977(Random var1, BlockPos var2, class_1059 var3) {
      return var2.method_6104(
         var1.nextInt(var3.field_5805) - var1.nextInt(var3.field_5805),
         var1.nextInt(var3.field_5808) - var1.nextInt(var3.field_5808),
         var1.nextInt(var3.field_5811) - var1.nextInt(var3.field_5811)
      );
   }

   public class_2522 method_6976(Random var1, BlockPos var2, class_1059 var3) {
      return var3.field_5814.method_35002(var1, var2);
   }
}
