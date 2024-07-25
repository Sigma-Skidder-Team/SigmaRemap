package remapped;

import java.util.concurrent.Callable;

public final class class_4445 implements Callable {
   private static String[] field_21672;

   public class_4445(long var1, long var3, class_8720 var5) {
      this.field_21671 = var1;
      this.field_21673 = var3;
      this.field_21670 = var5;
   }

   public Long call() {
      long var3 = 0L;

      for (long var5 = this.field_21671; var5 < this.field_21673; var5++) {
         if (this.field_21670.method_36121(var5) == 1) {
            var3++;
         }
      }

      return var3;
   }
}
