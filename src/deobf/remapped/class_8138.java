package remapped;

import java.util.Random;
import javax.annotation.Nullable;

public class class_8138 extends class_2830 implements class_3978 {
   private static String[] field_41680;
   public static final class_7044 field_41679 = class_6023.field_30676;
   public static final class_4190[] field_41681 = new class_4190[]{
      class_6414.method_29292(7.0, 0.0, 7.0, 9.0, 2.0, 9.0),
      class_6414.method_29292(7.0, 0.0, 7.0, 9.0, 4.0, 9.0),
      class_6414.method_29292(7.0, 0.0, 7.0, 9.0, 6.0, 9.0),
      class_6414.method_29292(7.0, 0.0, 7.0, 9.0, 8.0, 9.0),
      class_6414.method_29292(7.0, 0.0, 7.0, 9.0, 10.0, 9.0),
      class_6414.method_29292(7.0, 0.0, 7.0, 9.0, 12.0, 9.0),
      class_6414.method_29292(7.0, 0.0, 7.0, 9.0, 14.0, 9.0),
      class_6414.method_29292(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private final class_8497 field_41682;

   public class_8138(class_8497 var1, class_3073 var2) {
      super(var2);
      this.field_41682 = var1;
      this.method_29284(this.field_32751.method_36446().method_10308(field_41679, Integer.valueOf(0)));
   }

   @Override
   public class_4190 method_10769(class_2522 var1, class_6163 var2, BlockPos var3, class_214 var4) {
      return field_41681[var1.<Integer>method_10313(field_41679)];
   }

   @Override
   public boolean method_12870(class_2522 var1, class_6163 var2, BlockPos var3) {
      return var1.method_8350(class_4783.field_23421);
   }

   @Override
   public void method_10783(class_2522 var1, class_6331 var2, BlockPos var3, Random var4) {
      if (var2.method_25261(var3, 0) >= 9) {
         float var7 = class_8557.method_39377(this, var2, var3);
         if (var4.nextInt((int)(25.0F / var7) + 1) == 0) {
            int var8 = var1.<Integer>method_10313(field_41679);
            if (var8 >= 7) {
               Direction var9 = class_9594.field_48893.method_44313(var4);
               BlockPos var10 = var3.method_6098(var9);
               class_2522 var11 = var2.method_28262(var10.method_6100());
               if (var2.method_28262(var10).method_8345()
                  && (
                     var11.method_8350(class_4783.field_23421)
                        || var11.method_8350(class_4783.field_23592)
                        || var11.method_8350(class_4783.field_23577)
                        || var11.method_8350(class_4783.field_23201)
                        || var11.method_8350(class_4783.field_23259)
                  )) {
                  var2.method_29594(var10, this.field_41682.method_29260());
                  var2.method_29594(var3, this.field_41682.method_39159().method_29260().method_10308(class_380.field_1543, var9));
               }
            } else {
               var1 = var1.method_10308(field_41679, Integer.valueOf(var8 + 1));
               var2.method_7513(var3, var1, 2);
            }
         }
      }
   }

   @Nullable
   public class_2451 method_37035() {
      if (this.field_41682 != class_4783.field_23871) {
         return this.field_41682 != class_4783.field_23261 ? null : class_4897.field_24435;
      } else {
         return class_4897.field_24480;
      }
   }

   @Override
   public ItemStack method_29276(class_6163 var1, BlockPos var2, class_2522 var3) {
      class_2451 var6 = this.method_37035();
      return var6 != null ? new ItemStack(var6) : ItemStack.EMPTY;
   }

   @Override
   public boolean method_18358(class_6163 var1, BlockPos var2, class_2522 var3, boolean var4) {
      return var3.<Integer>method_10313(field_41679) != 7;
   }

   @Override
   public boolean method_18357(World var1, Random var2, BlockPos var3, class_2522 var4) {
      return true;
   }

   @Override
   public void method_18359(class_6331 var1, Random var2, BlockPos var3, class_2522 var4) {
      int var7 = Math.min(7, var4.<Integer>method_10313(field_41679) + class_9299.method_42824(var1.field_33033, 2, 5));
      class_2522 var8 = var4.method_10308(field_41679, Integer.valueOf(var7));
      var1.method_7513(var3, var8, 2);
      if (var7 == 7) {
         var8.method_8373(var1, var3, var1.field_33033);
      }
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_41679);
   }

   public class_8497 method_37034() {
      return this.field_41682;
   }
}
