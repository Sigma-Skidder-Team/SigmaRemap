package remapped;

import java.util.List;

public class class_7831 extends class_7238 {
   private static String[] field_39725;

   public class_7831(class_6003 var1) {
      super(var1, class_448.class);
      this.method_33113(class_8221.values(), class_9880.class);
   }

   @Override
   public void method_33132(int var1, class_754 var2, class_5407 var3, List<class_5407> var4, class_1455 var5) throws Exception {
      if (var3.method_24603() != class_5884.field_29885) {
         if (var3.method_24603() == class_5884.field_29872) {
            int var8 = (Integer)var3.method_24609();
            var3.method_24607(this.field_37136.method_19008().method_28217(var8));
         }
      } else {
         class_8806.method_40476((class_9530)var3.method_24609());
      }

      if (var2 != null) {
         if (!var2.method_3418(class_9880.field_50068)) {
            if (var2.method_3420(class_9880.field_49977) && var3.method_24602() == 10) {
               this.method_33119((class_5167)var3.method_24609());
            }
         } else if (var3.method_24602() != 15) {
            if (var3.method_24602() == 16) {
               var3.method_24605(15);
            }
         } else {
            var3.method_24605(16);
         }
      }
   }

   @Override
   public class_754 method_33127(int var1) {
      return class_5828.method_26382(var1);
   }
}
