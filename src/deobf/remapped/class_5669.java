package remapped;

import java.util.Iterator;

public class class_5669 extends class_2733 {
   public class_5669() {
      super(EntityType.field_34320, "dolphin", 0.7F);
   }

   @Override
   public class_9873 method_12295() {
      return new class_4995();
   }

   @Override
   public class_1549 method_12291(class_9873 var1, String var2) {
      if (var1 instanceof class_4995) {
         class_4995 var5 = (class_4995)var1;
         Iterator var6 = var5.method_24058().iterator();
         class_1549 var7 = class_4992.method_22956(var6, 0);
         if (var7 != null) {
            if (!var2.equals("body")) {
               if (!var2.equals("back_fin")) {
                  if (!var2.equals("left_fin")) {
                     if (!var2.equals("right_fin")) {
                        if (!var2.equals("tail")) {
                           if (!var2.equals("tail_fin")) {
                              return !var2.equals("head") ? null : var7.method_7041(4);
                           } else {
                              return var7.method_7041(3).method_7041(0);
                           }
                        } else {
                           return var7.method_7041(3);
                        }
                     } else {
                        return var7.method_7041(2);
                     }
                  } else {
                     return var7.method_7041(1);
                  }
               } else {
                  return var7.method_7041(0);
               }
            } else {
               return var7;
            }
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   @Override
   public String[] method_12292() {
      return new String[]{"body", "back_fin", "left_fin", "right_fin", "tail", "tail_fin", "head"};
   }

   @Override
   public class_8599 method_12293(class_9873 var1, float var2) {
      EntityRenderDispatcher var5 = MinecraftClient.getInstance().method_8587();
      class_5539 var6 = new class_5539(var5);
      var6.field_32487 = (class_4995<class_449>)var1;
      var6.field_36492 = var2;
      return (class_8599)var6;
   }
}
