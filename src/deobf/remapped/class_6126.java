package remapped;

public abstract class class_6126 extends class_2733 {
   public class_6126(EntityType var1, String var2, float var3) {
      super(var1, var2, var3);
   }

   public class_6126(EntityType var1, String var2, float var3, String[] var4) {
      super(var1, var2, var3, var4);
   }

   @Override
   public class_1549 method_12291(class_9873 var1, String var2) {
      if (var1 instanceof class_5723) {
         class_5723 var5 = (class_5723)var1;
         if (!var2.equals("head")) {
            if (!var2.equals("hat")) {
               if (!var2.equals("body")) {
                  if (!var2.equals("arms")) {
                     if (!var2.equals("right_leg")) {
                        if (!var2.equals("left_leg")) {
                           if (var2.equals("nose")) {
                              class_1549 var6 = (class_1549)class_7860.field_40081.method_39231(var5, 0);
                              if (var6 != null) {
                                 return var6.method_7041(0);
                              }
                           }

                           if (!var2.equals("right_arm")) {
                              return !var2.equals("left_arm") ? null : (class_1549)class_7860.field_40081.method_39231(var5, 7);
                           } else {
                              return (class_1549)class_7860.field_40081.method_39231(var5, 6);
                           }
                        } else {
                           return (class_1549)class_7860.field_40081.method_39231(var5, 5);
                        }
                     } else {
                        return (class_1549)class_7860.field_40081.method_39231(var5, 4);
                     }
                  } else {
                     return (class_1549)class_7860.field_40081.method_39231(var5, 3);
                  }
               } else {
                  return (class_1549)class_7860.field_40081.method_39231(var5, 2);
               }
            } else {
               return (class_1549)class_7860.field_40081.method_39231(var5, 1);
            }
         } else {
            return (class_1549)class_7860.field_40081.method_39231(var5, 0);
         }
      } else {
         return null;
      }
   }

   @Override
   public String[] method_12292() {
      return new String[]{"head", "hat", "body", "arms", "right_leg", "left_leg", "nose", "right_arm", "left_arm"};
   }
}
