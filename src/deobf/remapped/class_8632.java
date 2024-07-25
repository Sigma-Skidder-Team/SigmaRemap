package remapped;

import java.util.Comparator;

public class class_8632 implements Comparator {
   private static String[] field_44271;

   @Override
   public int compare(Object var1, Object var2) {
      class_3580 var5 = (class_3580)var1;
      class_3580 var6 = (class_3580)var2;
      if (var5.field_17553 == var6.field_17553) {
         return Config.equals(var5.field_17545, var6.field_17545)
            ? var5.field_17529.compareTo(var6.field_17529)
            : var5.field_17545.compareTo(var6.field_17545);
      } else {
         return var6.field_17553 - var5.field_17553;
      }
   }
}
