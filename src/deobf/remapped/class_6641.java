package remapped;

public class class_6641 extends class_2733 {
   public class_6641() {
      super(EntityType.field_34276, "villager", 0.5F);
   }

   public class_6641(EntityType var1, String var2, float var3) {
      super(var1, var2, var3);
   }

   @Override
   public class_9873 method_12295() {
      return new class_5103(0.0F);
   }

   @Override
   public class_1549 method_12291(class_9873 var1, String var2) {
      if (var1 instanceof class_5103) {
         class_5103 var5 = (class_5103)var1;
         if (!var2.equals("head")) {
            if (!var2.equals("headwear")) {
               if (!var2.equals("headwear2")) {
                  if (!var2.equals("body")) {
                     if (!var2.equals("bodywear")) {
                        if (!var2.equals("arms")) {
                           if (!var2.equals("right_leg")) {
                              if (!var2.equals("left_leg")) {
                                 return !var2.equals("nose") ? null : (class_1549)class_7860.field_40174.method_39231(var5, 8);
                              } else {
                                 return (class_1549)class_7860.field_40174.method_39231(var5, 7);
                              }
                           } else {
                              return (class_1549)class_7860.field_40174.method_39231(var5, 6);
                           }
                        } else {
                           return (class_1549)class_7860.field_40174.method_39231(var5, 5);
                        }
                     } else {
                        return (class_1549)class_7860.field_40174.method_39231(var5, 4);
                     }
                  } else {
                     return (class_1549)class_7860.field_40174.method_39231(var5, 3);
                  }
               } else {
                  return (class_1549)class_7860.field_40174.method_39231(var5, 2);
               }
            } else {
               return (class_1549)class_7860.field_40174.method_39231(var5, 1);
            }
         } else {
            return (class_1549)class_7860.field_40174.method_39231(var5, 0);
         }
      } else {
         return null;
      }
   }

   @Override
   public String[] method_12292() {
      return new String[]{"head", "headwear", "headwear2", "body", "bodywear", "arms", "right_leg", "left_leg", "nose"};
   }

   @Override
   public class_8599 method_12293(class_9873 var1, float var2) {
      class_550 var5 = (class_550) MinecraftClient.getInstance().method_8498();
      EntityRenderDispatcher var6 = MinecraftClient.getInstance().method_8587();
      class_9122 var7 = new class_9122(var6, var5);
      var7.field_32487 = (class_5103<class_7666>)var1;
      var7.field_36492 = var2;
      return (class_8599)var7;
   }
}
