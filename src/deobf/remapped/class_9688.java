package remapped;

import java.util.Comparator;

public class class_9688 implements Comparator<class_1331> {
   private static String[] field_49299;

   public class_9688(class_4820 var1) {
      this.field_49300 = var1;
   }

   public int compare(class_1331 var1, class_1331 var2) {
      return !(
            Math.sqrt(
                  class_4820.method_22208()
                     .field_9632
                     .method_37273((double)var1.method_12173() + 0.5, (double)var1.method_12165() + 0.5, (double)var1.method_12185() + 0.5)
               )
               > Math.sqrt(
                  class_4820.method_22210()
                     .field_9632
                     .method_37273((double)var2.method_12173() + 0.5, (double)var2.method_12165() + 0.5, (double)var2.method_12185() + 0.5)
               )
         )
         ? -1
         : 1;
   }
}
