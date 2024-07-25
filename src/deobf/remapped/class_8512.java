package remapped;

import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Comparator;

public class class_8512 extends class_8374<class_5463> {
   private static String[] field_43572;

   public class_8512(class_3231 var1, class_1893 var2) {
      super(var2, var1.field_941, var1.field_940, 32, var1.field_940 - 64, 10);
      this.field_43571 = var1;
      ObjectArrayList var5 = new ObjectArrayList(class_6234.field_31829.iterator());
      var5.sort(Comparator.<class_6676, String>comparing(var0 -> class_6956.method_31803(class_3231.method_14811(var0))));
      ObjectListIterator var6 = var5.iterator();

      while (var6.hasNext()) {
         class_6676 var7 = (class_6676)var6.next();
         this.method_36202(new class_5463(this, var7, null));
      }
   }

   @Override
   public void method_36199(class_7966 var1) {
      this.field_43571.method_1183(var1);
   }
}
