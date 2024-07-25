package remapped;

import com.google.common.collect.ComparisonChain;
import java.util.Comparator;

public class class_1684 implements Comparator<class_753> {
   private class_1684() {
   }

   public int compare(class_753 var1, class_753 var2) {
      class_3903 var5 = var1.method_3403();
      class_3903 var6 = var2.method_3403();
      return ComparisonChain.start()
         .compareTrueFirst(var1.method_3393() != class_4666.field_22756, var2.method_3393() != class_4666.field_22756)
         .compare(var5 == null ? "" : var5.method_23383(), var6 == null ? "" : var6.method_23383())
         .compare(var1.method_3392().getName(), var2.method_3392().getName(), String::compareToIgnoreCase)
         .result();
   }
}
