package remapped;

import java.util.HashSet;
import java.util.Set;

public class class_2709 extends class_9448 {
   private static String[] field_13256;

   public class_2709() {
      super(class_6498.class);
   }

   @Override
   public Set<class_3841> method_43697(class_1331 var1, class_2522 var2, class_6590 var3) {
      HashSet var6 = new HashSet();
      class_9529 var7 = new class_9529(new class_1343(0.0, 0.0, 0.0), Direction.field_802, var1, false);
      class_353 var8 = new class_353(this.field_48220.field_9601, this.field_48220.thePlayer, class_2584.field_12791, new ItemStack(var2.method_8360()), var7);
      var8.field_1379 = var1;
      var8.field_1381 = false;
      class_2522 var9 = var2.method_8360().method_29302(var8);
      var6.add(new class_3841(var1, var9));
      return var6;
   }
}
