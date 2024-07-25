package remapped;

import java.util.ArrayList;
import java.util.List;

public class class_4685 implements class_1564<class_913, List> {
   public List method_21642(class_913 var1) {
      ArrayList var4 = new ArrayList();

      for (class_5287 var7 : var1.method_3922()) {
         var4.add(class_5737.method_25980(var7));
      }

      return var4;
   }

   public class_913 method_21641(String var1, List var2) {
      ArrayList var5 = new ArrayList();

      for (Object var7 : var2) {
         var5.add(class_5737.<Object, class_5287>method_25979("", var7));
      }

      return new class_913(var1, var5);
   }
}
