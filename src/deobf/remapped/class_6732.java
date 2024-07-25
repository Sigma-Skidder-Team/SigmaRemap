package remapped;

import java.util.List;

public class class_6732 extends class_7238 {
   private static String[] field_34769;

   public class_6732(class_757 var1) {
      super(var1, class_2188.class);
      this.method_33118(class_3085.field_15292, class_8221.field_42187);
      this.method_33113(class_3085.values(), class_8221.class);
   }

   @Override
   public void method_33132(int var1, class_754 var2, class_5407 var3, List<class_5407> var4, class_1455 var5) throws Exception {
      if (var3.method_24603() != class_5884.field_29885) {
         if (var3.method_24603() == class_5884.field_29872) {
            int var8 = (Integer)var3.method_24609();
            var3.method_24607(this.field_37136.method_19008().method_28217(var8));
         }
      } else {
         class_3663.method_17004((class_9530)var3.method_24609());
      }

      if (var2 != null) {
         if (var2 != class_8221.field_42097) {
            if (var2.method_3418(class_8221.field_42169)) {
               if (var3.method_24602() != 8) {
                  if (var3.method_24602() > 8) {
                     var3.method_24605(var3.method_24602() - 1);
                  }
               } else {
                  var4.remove(var3);
               }
            }
         } else if (var3.method_24602() == 10) {
            this.method_33119((class_5167)var3.method_24609());
         }
      }
   }

   @Override
   public class_754 method_33127(int var1) {
      return class_7338.method_33466(var1);
   }
}
