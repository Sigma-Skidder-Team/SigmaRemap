package remapped;

import java.util.HashSet;
import java.util.Set;

public class class_2108 extends class_9448 {
   private static String[] field_10556;

   public class_2108() {
      super(class_4115.class);
   }

   @Override
   public Set<class_3841> method_43698(class_1331 var1, class_2522 var2, class_6590 var3) {
      HashSet var6 = new HashSet();
      if (var2.<class_7422>method_10313(class_4115.field_20045) == class_7422.field_37876) {
         class_2522 var7 = var3.method_30352(var1.method_6081());
         if (var7.method_8360() instanceof class_4115) {
            class_2522 var8 = var2.method_10308(class_4115.field_20047, var7.<class_4340>method_10313(class_4115.field_20047));
            var6.add(new class_3841(var1, var8));
            var6.add(
               new class_3841(
                  var1.method_6081(),
                  var7.method_10308(class_4115.field_20050, var8.<class_240>method_10313(class_4115.field_20050))
                     .method_10308(class_4115.field_20051, var8.<Boolean>method_10313(class_4115.field_20051))
               )
            );
         }
      }

      if (var2.<class_7422>method_10313(class_4115.field_20045) == class_7422.field_37874) {
         class_2522 var9 = var3.method_30352(var1.method_6100());
         if (var9.method_8360() instanceof class_4115) {
            class_2522 var10 = var2.method_10308(class_4115.field_20050, var9.<class_240>method_10313(class_4115.field_20050))
               .method_10308(class_4115.field_20051, var9.<Boolean>method_10313(class_4115.field_20051));
            var6.add(new class_3841(var1, var10));
            var6.add(new class_3841(var1.method_6100(), var9.method_10308(class_4115.field_20047, var10.<class_4340>method_10313(class_4115.field_20047))));
         }
      }

      return var6;
   }
}
