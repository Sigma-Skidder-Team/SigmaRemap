package remapped;

import java.util.Comparator;

public final class class_6257 implements Comparator {
   private static String[] field_31987;

   @Override
   public int compare(Object var1, Object var2) {
      class_3580 var5 = (class_3580)var1;
      class_3580 var6 = (class_3580)var2;
      if (var5.field_17535 == var6.field_17535) {
         if (var5.field_17553 == var6.field_17553) {
            return var5.field_17545.equals(var6.field_17545) ? var5.field_17529.compareTo(var6.field_17529) : var5.field_17545.compareTo(var6.field_17545);
         } else {
            return var6.field_17553 - var5.field_17553;
         }
      } else {
         return var5.field_17535 - var6.field_17535;
      }
   }
}
