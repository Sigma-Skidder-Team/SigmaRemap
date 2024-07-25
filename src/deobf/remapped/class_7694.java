package remapped;

import java.util.HashSet;
import java.util.Set;

public class class_7694 extends class_9448 {
   private static String[] field_39067;

   public class_7694() {
      super(class_3454.class);
   }

   @Override
   public Set<class_3841> method_43698(class_1331 var1, class_2522 var2, class_6590 var3) {
      HashSet var6 = new HashSet();
      if (var2.<class_7422>method_10313(class_3064.field_15063) == class_7422.field_37874) {
         class_2522 var7 = var3.method_30352(var1.method_6100());
         if (var7.method_8360() instanceof class_3454) {
            var6.add(new class_3841(var1, var7.method_10308(class_3454.field_15063, class_7422.field_37874)));
         }
      }

      return var6;
   }
}
