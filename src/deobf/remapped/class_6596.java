package remapped;

import java.util.List;
import java.util.Random;

public class class_6596 {
   private static final Identifier[] field_34030 = new Identifier[]{
      new Identifier("nether_fossils/fossil_1"),
      new Identifier("nether_fossils/fossil_2"),
      new Identifier("nether_fossils/fossil_3"),
      new Identifier("nether_fossils/fossil_4"),
      new Identifier("nether_fossils/fossil_5"),
      new Identifier("nether_fossils/fossil_6"),
      new Identifier("nether_fossils/fossil_7"),
      new Identifier("nether_fossils/fossil_8"),
      new Identifier("nether_fossils/fossil_9"),
      new Identifier("nether_fossils/fossil_10"),
      new Identifier("nether_fossils/fossil_11"),
      new Identifier("nether_fossils/fossil_12"),
      new Identifier("nether_fossils/fossil_13"),
      new Identifier("nether_fossils/fossil_14")
   };

   public static void method_30372(class_5799 var0, List<class_7060> var1, Random var2, BlockPos var3) {
      class_6631 var6 = class_6631.method_30492(var2);
      var1.add(new class_8370(var0, Util.<Identifier>method_44697(field_34030, var2), var3, var6));
   }
}
