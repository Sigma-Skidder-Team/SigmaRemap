package remapped;

import java.util.List;

public class class_1960 extends class_7238 {
   private static String[] field_9976;

   public class_1960(class_3846 var1) {
      super(var1, class_7556.class);
   }

   @Override
   public void method_33132(int var1, class_754 var2, class_5407 var3, List<class_5407> var4, class_1455 var5) throws Exception {
      if (var3.method_24603() != class_5884.field_29885) {
         if (var3.method_24603() == class_5884.field_29872) {
            int var8 = (Integer)var3.method_24609();
            var3.method_24607(this.field_37136.method_19008().method_28217(var8));
         }
      } else {
         class_5619.method_25487((class_9530)var3.method_24609());
      }

      if (var2 != null) {
         if (var3.method_24602() > 11 && var2.method_3418(class_3085.field_15190)) {
            var3.method_24605(var3.method_24602() + 1);
         }

         if (!var2.method_3418(class_3085.field_15206)) {
            if (var2 == class_3085.field_15266 && var3.method_24602() == 10) {
               this.method_33119((class_5167)var3.method_24609());
            }
         } else if (var3.method_24602() != 18) {
            if (var3.method_24602() > 18) {
               var3.method_24605(var3.method_24602() - 1);
            }
         } else {
            var4.remove(var3);
         }
      }
   }

   @Override
   public int method_33115(int var1) {
      return class_5560.method_25260(var1);
   }

   @Override
   public class_754 method_33127(int var1) {
      return class_7065.method_32542(var1);
   }
}
