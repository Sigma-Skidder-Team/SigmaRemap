package remapped;

public class class_1240 {
   public static final int field_6852 = 0;
   public static final int field_6848 = 1;
   public static final int field_6843 = 2;
   public static final int field_6846 = 3;
   public static final int field_6847 = 4;
   public static final int field_6849 = 5;
   public static final int field_6844 = 6;
   public static final int field_6850 = 7;
   public static final int field_6853 = 8;
   public static final int field_6851 = 1;

   public static int method_5532(String var0) {
      if (var0 != null) {
         var0 = var0.toLowerCase().trim();
         if (!var0.equals("alpha")) {
            if (!var0.equals("add")) {
               if (!var0.equals("subtract")) {
                  if (!var0.equals("multiply")) {
                     if (!var0.equals("dodge")) {
                        if (!var0.equals("burn")) {
                           if (!var0.equals("screen")) {
                              if (!var0.equals("overlay")) {
                                 if (!var0.equals("replace")) {
                                    Config.method_14317("Unknown blend: " + var0);
                                    return 1;
                                 } else {
                                    return 8;
                                 }
                              } else {
                                 return 7;
                              }
                           } else {
                              return 6;
                           }
                        } else {
                           return 5;
                        }
                     } else {
                        return 4;
                     }
                  } else {
                     return 3;
                  }
               } else {
                  return 2;
               }
            } else {
               return 1;
            }
         } else {
            return 0;
         }
      } else {
         return 1;
      }
   }

   public static void method_5531(int var0, float var1) {
      switch (var0) {
         case 0:
            GlStateManager.method_8801();
            GlStateManager.method_8829();
            GlStateManager.blendFunc(770, 771);
            GlStateManager.color4f(1.0F, 1.0F, 1.0F, var1);
            break;
         case 1:
            GlStateManager.method_8801();
            GlStateManager.method_8829();
            GlStateManager.blendFunc(770, 1);
            GlStateManager.color4f(1.0F, 1.0F, 1.0F, var1);
            break;
         case 2:
            GlStateManager.method_8801();
            GlStateManager.method_8829();
            GlStateManager.blendFunc(775, 0);
            GlStateManager.color4f(var1, var1, var1, 1.0F);
            break;
         case 3:
            GlStateManager.method_8801();
            GlStateManager.method_8829();
            GlStateManager.blendFunc(774, 771);
            GlStateManager.color4f(var1, var1, var1, var1);
            break;
         case 4:
            GlStateManager.method_8801();
            GlStateManager.method_8829();
            GlStateManager.blendFunc(1, 1);
            GlStateManager.color4f(var1, var1, var1, 1.0F);
            break;
         case 5:
            GlStateManager.method_8801();
            GlStateManager.method_8829();
            GlStateManager.blendFunc(0, 769);
            GlStateManager.color4f(var1, var1, var1, 1.0F);
            break;
         case 6:
            GlStateManager.method_8801();
            GlStateManager.method_8829();
            GlStateManager.blendFunc(1, 769);
            GlStateManager.color4f(var1, var1, var1, 1.0F);
            break;
         case 7:
            GlStateManager.method_8801();
            GlStateManager.method_8829();
            GlStateManager.blendFunc(774, 768);
            GlStateManager.color4f(var1, var1, var1, 1.0F);
            break;
         case 8:
            GlStateManager.enableAlphaTest();
            GlStateManager.method_8775();
            GlStateManager.color4f(1.0F, 1.0F, 1.0F, var1);
      }

      GlStateManager.method_8843();
   }

   public static void method_5533(float var0) {
      GlStateManager.method_8801();
      GlStateManager.method_8829();
      GlStateManager.blendFunc(770, 1);
      GlStateManager.color4f(1.0F, 1.0F, 1.0F, var0);
   }
}
