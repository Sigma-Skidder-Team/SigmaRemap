package remapped;

import java.util.Comparator;
import java.util.Date;

public final class class_9102 implements Comparator<class_7309> {
   private static String[] field_46612;

   public class_9102(String var1) {
      this.field_46613 = var1;
   }

   public int compare(class_7309 var1, class_7309 var2) {
      class_5933 var5 = var1.method_33349(this.field_46613);
      class_5933 var6 = var2.method_33349(this.field_46613);
      Date var7;
      if (var5 != null) {
         var7 = var5.method_27122();
      } else {
         var7 = new Date();
      }

      Date var8;
      if (var6 != null) {
         var8 = var6.method_27122();
      } else {
         var8 = new Date();
      }

      if (var5 != null && var6 != null) {
         long var9 = var7.getTime() - new Date().getTime();
         long var11 = var8.getTime() - new Date().getTime();
         if (var9 < 0L && var11 < 0L) {
            return var8.compareTo(var7);
         }
      }

      return var7.compareTo(var8);
   }
}
