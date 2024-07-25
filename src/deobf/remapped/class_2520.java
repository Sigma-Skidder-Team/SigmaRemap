package remapped;

public abstract class class_2520 extends class_2733 {
   public class_2520(class_6629 var1, String var2, float var3) {
      super(var1, var2, var3);
   }

   @Override
   public class_1549 method_12291(class_9873 var1, String var2) {
      if (var1 instanceof class_2344) {
         class_2344 var5 = (class_2344)var1;
         if (!var2.equals("head")) {
            if (!var2.equals("headwear")) {
               if (!var2.equals("body")) {
                  if (!var2.equals("left_arm")) {
                     if (!var2.equals("right_arm")) {
                        if (!var2.equals("left_leg")) {
                           return !var2.equals("right_leg") ? null : var5.field_11706;
                        } else {
                           return var5.field_11703;
                        }
                     } else {
                        return var5.field_11705;
                     }
                  } else {
                     return var5.field_11701;
                  }
               } else {
                  return var5.field_11704;
               }
            } else {
               return var5.field_11695;
            }
         } else {
            return var5.field_11696;
         }
      } else {
         return null;
      }
   }

   @Override
   public String[] method_12292() {
      return new String[]{"head", "headwear", "body", "left_arm", "right_arm", "left_leg", "right_leg"};
   }
}
