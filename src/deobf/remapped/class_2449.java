package remapped;

import java.util.List;

public class class_2449 extends class_7238 {
   private static String[] field_12162;

   public class_2449(class_5768 var1) {
      super(var1, class_7053.class);
   }

   @Override
   public void method_33132(int var1, class_754 var2, class_5407 var3, List<class_5407> var4, class_1455 var5) {
      if (var3.method_24603() != class_9550.field_48589) {
         if (var3.method_24603() == class_9550.field_48574) {
            int var8 = (Integer)var3.method_24609();
            var3.method_24607(this.field_37136.method_19008().method_28217(var8));
         }
      } else {
         class_3166.method_14616((class_9530)var3.method_24609());
      }

      if (var2 != null) {
         if (var2.method_3418(class_4630.field_22621) && var3.method_24602() == 9) {
            int var9 = (Integer)var3.method_24609();
            var3.method_24607(this.field_37136.method_19008().method_28217(var9));
         } else if (var2.method_3418(class_4630.field_22544) && var3.method_24602() >= 7) {
            var3.method_24605(var3.method_24602() + 1);
         } else if (var2.method_3420(class_4630.field_22627) && var3.method_24602() == 10) {
            this.method_33119((class_5167)var3.method_24609());
         }
      }
   }

   @Override
   public class_754 method_33127(int var1) {
      return class_5764.method_26066(var1, false);
   }

   @Override
   public class_754 method_33114(int var1) {
      return class_5764.method_26066(var1, true);
   }
}
