package remapped;

import java.util.List;

public class class_2674 extends class_7238 {
   private static String[] field_13135;

   public class_2674(class_8633 var1) {
      super(var1, class_7053.class);
   }

   @Override
   public void method_33132(int var1, class_754 var2, class_5407 var3, List<class_5407> var4, class_1455 var5) throws Exception {
      if (var3.method_24603().method_25778() <= 4) {
         var3.method_24608(class_9550.method_44066(var3.method_24603().method_25778()));
      } else {
         var3.method_24608(class_9550.method_44066(var3.method_24603().method_25778() + 1));
      }

      if (var3.method_24602() == 2) {
         var3.method_24608(class_9550.field_48573);
         if (var3.method_24609() != null && !((String)var3.method_24609()).isEmpty()) {
            var3.method_24607(class_68.method_70((String)var3.method_24609()));
         } else {
            var3.method_24607(null);
         }
      }

      if (var2 == class_4630.field_22535 && var3.method_24602() == 12) {
         int var8 = (Integer)var3.method_24609();
         int var9 = var8 & 4095;
         int var10 = var8 >> 12 & 15;
         var3.method_24607(var9 << 4 | var10 & 15);
      }

      if (var3.method_24603() != class_9550.field_48589) {
         if (var3.method_24603() == class_9550.field_48574) {
            var3.method_24607(class_2750.method_12391((Integer)var3.method_24609()));
         }
      } else {
         var3.method_24608(class_9550.field_48589);
         class_9330.method_43074((class_9530)var3.method_24609());
      }

      if (var2 != null) {
         if (var2 == class_4630.field_22585 && var3.method_24602() == 17) {
            var3.method_24607(15 - (Integer)var3.method_24609());
         }

         if (var2.method_3418(class_4630.field_22512) && var3.method_24602() > 14) {
            var3.method_24605(var3.method_24602() + 1);
         }

         if (var2.method_3418(class_4630.field_22621) && var3.method_24602() == 9) {
            int var14 = (Integer)var3.method_24609();
            int var16 = (var14 & 4095) << 4 | var14 >> 12 & 15;
            int var18 = class_2750.method_12391(var16);
            var3.method_24607(var18);
         }

         if (var2 == class_4630.field_22627) {
            if (var3.method_24602() == 9) {
               int var15 = (Integer)var3.method_24609();
               class_5407 var17 = this.method_33117(10, var4);
               class_5407 var19 = this.method_33117(11, var4);
               int var11 = var17 == null ? 0 : (Integer)var17.method_24609();
               int var12 = var19 == null ? 0 : (Integer)var19.method_24609();
               class_5167 var13 = class_1176.method_5214(var15, new Integer[]{var11, var12});
               if (var13 != null && var13.method_23691() != -1) {
                  var4.add(new class_5407(9, class_9550.field_48585, var13));
               }
            }

            if (var3.method_24602() >= 9) {
               var4.remove(var3);
            }
         }

         if (var3.method_24602() == 0) {
            var3.method_24607((byte)((Byte)var3.method_24609() & -17));
         }
      }
   }

   @Override
   public int method_33115(int var1) {
      return class_8269.method_38121(var1);
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
