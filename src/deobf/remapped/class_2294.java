package remapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;

public class class_2294 {
   public static String method_10557(class_6163 var0, class_1331 var1) {
      class_3757 var4 = var0.method_28260(var1);
      return method_10556(var4);
   }

   public static String method_10556(class_3757 var0) {
      if (var0 instanceof class_9875) {
         class_9875 var3 = (class_9875)var0;
         method_10558(var0);
         return var3.method_45507() ? var3.method_45508().getUnformattedComponentText() : null;
      } else {
         return null;
      }
   }

   public static void method_10558(class_3757 var0) {
      class_1331 var3 = var0.method_17399();
      ITextComponent var4 = method_10559(var0);
      if (var4 == null) {
         Object var5 = method_10561(var3);
         if (var5 == null) {
            var5 = new StringTextComponent("");
         }

         method_10560(var0, (ITextComponent)var5);
      }
   }

   public static ITextComponent method_10561(class_1331 var0) {
      class_3757 var3 = class_419.method_2088(var0);
      return var3 != null ? method_10559(var3) : null;
   }

   public static ITextComponent method_10559(class_3757 var0) {
      if (!(var0 instanceof class_9875)) {
         return !(var0 instanceof class_1100) ? null : (ITextComponent)class_7860.method_35557(var0, class_7860.field_40094);
      } else {
         return ((class_9875)var0).method_45508();
      }
   }

   public static boolean method_10560(class_3757 var0, ITextComponent var1) {
      if (!(var0 instanceof class_8346)) {
         if (!(var0 instanceof class_8837)) {
            if (!(var0 instanceof class_7932)) {
               if (!(var0 instanceof class_1100)) {
                  return false;
               } else {
                  ((class_1100)var0).method_4887(var1);
                  return true;
               }
            } else {
               ((class_7932)var0).method_35860(var1);
               return true;
            }
         } else {
            ((class_8837)var0).method_40654(var1);
            return true;
         }
      } else {
         ((class_8346)var0).method_38432(var1);
         return true;
      }
   }
}
