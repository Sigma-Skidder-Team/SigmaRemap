package remapped;

public class class_7297 extends class_4314 {
   private static String[] field_37307;
   public static final class_7360<class_589> field_37308 = class_6023.field_30698;

   public class_7297(class_3073 var1) {
      super(var1);
   }

   @Override
   public class_3757 method_3281(class_6163 var1) {
      return new class_945();
   }

   @Override
   public class_6910 method_10777(class_2522 var1, World var2, class_1331 var3, class_704 var4, class_2584 var5, class_9529 var6) {
      class_3757 var9 = var2.method_28260(var3);
      if (!(var9 instanceof class_945)) {
         return class_6910.field_35521;
      } else {
         return !((class_945)var9).method_4125(var4) ? class_6910.field_35521 : class_6910.method_31659(var2.field_33055);
      }
   }

   @Override
   public void method_29257(World var1, class_1331 var2, class_2522 var3, class_5834 var4, class_6098 var5) {
      if (!var1.field_33055 && var4 != null) {
         class_3757 var8 = var1.method_28260(var2);
         if (var8 instanceof class_945) {
            ((class_945)var8).method_4112(var4);
         }
      }
   }

   @Override
   public class_7537 method_10788(class_2522 var1) {
      return class_7537.field_38469;
   }

   @Override
   public class_2522 method_29302(class_353 var1) {
      return this.method_29260().method_10308(field_37308, class_589.field_3411);
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_37308);
   }

   @Override
   public void method_10801(class_2522 var1, World var2, class_1331 var3, class_6414 var4, class_1331 var5, boolean var6) {
      if (var2 instanceof class_6331) {
         class_3757 var9 = var2.method_28260(var3);
         if (var9 instanceof class_945) {
            class_945 var10 = (class_945)var9;
            boolean var11 = var2.method_29576(var3);
            boolean var12 = var10.method_4124();
            if (var11 && !var12) {
               var10.method_4095(true);
               this.method_33296((class_6331)var2, var10);
            } else if (!var11 && var12) {
               var10.method_4095(false);
            }
         }
      }
   }

   private void method_33296(class_6331 var1, class_945 var2) {
      switch (var2.method_4085()) {
         case field_3417:
            var2.method_4115(false);
            break;
         case field_3414:
            var2.method_4088(var1, false);
            break;
         case field_3418:
            var2.method_4126();
         case field_3411:
      }
   }
}
