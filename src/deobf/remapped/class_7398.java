package remapped;

public abstract class class_7398 extends class_2733 {
   public class_7398(class_6629 var1, String var2, float var3) {
      super(var1, var2, var3);
   }

   @Override
   public class_1549 method_12291(class_9873 var1, String var2) {
      if (var1 instanceof class_6484) {
         class_6484 var5 = (class_6484)var1;
         if (!var2.equals("head")) {
            if (!var2.equals("body")) {
               if (!var2.equals("leg1")) {
                  if (!var2.equals("leg2")) {
                     if (!var2.equals("leg3")) {
                        return !var2.equals("leg4") ? null : (class_1549)class_7860.field_39930.method_39231(var5, 5);
                     } else {
                        return (class_1549)class_7860.field_39930.method_39231(var5, 4);
                     }
                  } else {
                     return (class_1549)class_7860.field_39930.method_39231(var5, 3);
                  }
               } else {
                  return (class_1549)class_7860.field_39930.method_39231(var5, 2);
               }
            } else {
               return (class_1549)class_7860.field_39930.method_39231(var5, 1);
            }
         } else {
            return (class_1549)class_7860.field_39930.method_39231(var5, 0);
         }
      } else {
         return null;
      }
   }

   @Override
   public String[] method_12292() {
      return new String[]{"head", "body", "leg1", "leg2", "leg3", "leg4"};
   }
}
