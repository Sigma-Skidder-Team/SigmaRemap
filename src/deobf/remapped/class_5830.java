package remapped;

import com.google.common.collect.Sets;
import java.util.Set;

public class class_5830 {
   private static final String field_29586 = "ViaVersion|" + class_5988.class.getSimpleName();
   private static final Set<String> field_29587 = Sets.newHashSet(new String[]{"crafting_special_banneraddpattern", "crafting_special_repairitem"});
   private static final class_9078 field_29585 = new class_7602();

   public static void method_26388(class_4106 var0) {
      class_3672 var3 = new class_3672(var0, class_5830::method_26389, class_5830::method_26387);
      var3.method_17042(class_7810.field_39611);
      var3.method_17045(class_7810.field_39613, class_8039.field_41162);
      var0.method_19014(class_7810.field_39536, null, new class_4250());
      var3.method_17040(class_7810.field_39621, class_8039.field_41134);
      var3.method_17038(class_7810.field_39538, class_8039.field_41162);
      var0.method_19015(class_7810.field_39596, new class_4629());
      var3.method_17043(class_7810.field_39591, class_8039.field_41162);
      class_6216 var4 = new class_6216(var0, class_5830::method_26389);
      var0.method_19015(class_7810.field_39575, new class_4844(var4));
      var3.method_17036(class_3970.field_19230, class_8039.field_41162);
      var0.method_18992(class_3970.field_19238, new class_490());
      var3.method_17039(class_3970.field_19244, class_8039.field_41162);
      var3.method_17034(class_7810.field_39576, class_8039.field_41162, class_8039.field_41146);
   }

   public static void method_26389(class_9530 var0) {
      if (var0 != null) {
         var0.method_43965(class_5988.field_30499.method_28210(var0.method_43963()));
         if (var0.method_43959() != null) {
            class_5287 var3 = var0.method_43959().<class_5287>method_25123("display");
            if (var3 instanceof class_5531) {
               class_5531 var4 = (class_5531)var3;
               class_5287 var5 = var4.<class_5287>method_25123("Lore");
               if (var5 instanceof class_913) {
                  class_913 var6 = (class_913)var5;
                  var4.<class_913>method_25122(new class_913(field_29586 + "|Lore", var6.clone().method_3922()));

                  for (class_5287 var8 : var6) {
                     if (var8 instanceof class_887) {
                        String var9 = class_68.method_67(((class_887)var8).method_3809(), class_2909.field_14206, true);
                        ((class_887)var8).method_3808(var9);
                     }
                  }
               }
            }
         }
      }
   }

   public static void method_26387(class_9530 var0) {
      if (var0 != null) {
         var0.method_43965(class_5988.field_30499.method_28204(var0.method_43963()));
         if (var0.method_43959() != null) {
            class_5287 var3 = var0.method_43959().<class_5287>method_25123("display");
            if (var3 instanceof class_5531) {
               class_5531 var4 = (class_5531)var3;
               class_5287 var5 = var4.<class_5287>method_25123("Lore");
               if (var5 instanceof class_913) {
                  class_913 var6 = (class_913)var5;
                  class_913 var7 = var4.<class_913>method_25126(field_29586 + "|Lore");
                  if (var7 == null) {
                     for (class_5287 var9 : var6) {
                        if (var9 instanceof class_887) {
                           ((class_887)var9).method_3808(class_68.method_72(((class_887)var9).method_3809()));
                        }
                     }
                  } else {
                     var4.<class_913>method_25122(new class_913("Lore", var7.method_3922()));
                  }
               }
            }
         }
      }
   }
}
