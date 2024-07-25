package remapped;

import java.util.Random;
import java.util.function.Supplier;

public class class_2567 extends class_2830 implements class_3978 {
   private static String[] field_12698;
   public static final class_4190 field_12699 = class_6414.method_29292(4.0, 0.0, 4.0, 12.0, 9.0, 12.0);
   private final Supplier<class_5927<class_8541, ?>> field_12697;

   public class_2567(class_3073 var1, Supplier<class_5927<class_8541, ?>> var2) {
      super(var1);
      this.field_12697 = var2;
   }

   @Override
   public class_4190 method_10769(class_2522 var1, class_6163 var2, class_1331 var3, class_214 var4) {
      return field_12699;
   }

   @Override
   public boolean method_12870(class_2522 var1, class_6163 var2, class_1331 var3) {
      return var1.method_8349(class_2351.field_11769)
         || var1.method_8350(class_4783.field_23162)
         || var1.method_8350(class_4783.field_23531)
         || super.method_12870(var1, var2, var3);
   }

   @Override
   public boolean method_18358(class_6163 var1, class_1331 var2, class_2522 var3, boolean var4) {
      class_6414 var7 = ((class_8541)this.field_12697.get().field_30062).field_43717.method_8360();
      class_6414 var8 = var1.method_28262(var2.method_6100()).method_8360();
      return var8 == var7;
   }

   @Override
   public boolean method_18357(World var1, Random var2, class_1331 var3, class_2522 var4) {
      return (double)var2.nextFloat() < 0.4;
   }

   @Override
   public void method_18359(class_6331 var1, Random var2, class_1331 var3, class_2522 var4) {
      this.field_12697.get().method_27104(var1, var1.method_28945().method_10189(), var2, var3);
   }
}
