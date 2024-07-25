package remapped;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;

public class class_1695 extends class_8757 {
   private static String[] field_8768;
   public class_1608 field_8766;
   public List<class_1608> field_8769;
   public List<class_1608> field_8765;
   public final List<class_7060> field_8767 = Lists.newArrayList();

   public class_1695(Random var1, int var2, int var3) {
      super(var1, var2, var3);
      this.field_8769 = Lists.newArrayList();

      for (class_1608 var9 : class_1588.method_7133()) {
         var9.field_8343 = 0;
         this.field_8769.add(var9);
      }

      this.field_8765 = Lists.newArrayList();

      for (class_1608 var13 : class_1588.method_7134()) {
         var13.field_8343 = 0;
         this.field_8765.add(var13);
      }
   }

   public class_1695(class_5799 var1, class_5734 var2) {
      super(class_2746.field_13440, var2);
   }
}
