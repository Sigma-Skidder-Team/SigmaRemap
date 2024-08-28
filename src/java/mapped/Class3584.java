package mapped;

import java.util.Comparator;

public class Class3584 implements Comparator {
   private static String[] field19526;

   @Override
   public int compare(Object var1, Object var2) {
      Class8090 var5 = (Class8090)var1;
      Class8090 var6 = (Class8090)var2;
      if (var5.field34789 == var6.field34789) {
         return Class7944.equals(var5.field34769, var6.field34769) ? var5.field34768.compareTo(var6.field34768) : var5.field34769.compareTo(var6.field34769);
      } else {
         return var6.field34789 - var5.field34789;
      }
   }
}
