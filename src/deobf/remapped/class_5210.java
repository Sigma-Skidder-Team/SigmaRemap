package remapped;

public abstract class class_5210 extends class_4314 implements class_2593 {
   public static final class_6720 field_26767 = class_6023.field_30719;
   public static final class_4190 field_26769 = class_6414.method_29292(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private final class_9271 field_26768;

   public class_5210(class_3073 var1, class_9271 var2) {
      super(var1);
      this.field_26768 = var2;
   }

   @Override
   public class_2522 method_10763(class_2522 var1, class_240 var2, class_2522 var3, class_9379 var4, class_1331 var5, class_1331 var6) {
      if (var1.<Boolean>method_10313(field_26767)) {
         var4.method_43362().method_14011(var5, class_8532.field_43674, class_8532.field_43674.method_10711(var4));
      }

      return super.method_10763(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public class_4190 method_10769(class_2522 var1, class_6163 var2, class_1331 var3, class_214 var4) {
      return field_26769;
   }

   @Override
   public boolean method_29278() {
      return true;
   }

   @Override
   public class_3757 method_3281(class_6163 var1) {
      return new class_8398();
   }

   @Override
   public class_6910 method_10777(class_2522 var1, class_6486 var2, class_1331 var3, class_704 var4, class_2584 var5, class_9529 var6) {
      class_6098 var9 = var4.method_26617(var5);
      boolean var10 = var9.method_27960() instanceof class_239 && var4.field_3876.field_4938;
      if (!var2.field_33055) {
         class_3757 var11 = var2.method_28260(var3);
         if (!(var11 instanceof class_8398)) {
            return class_6910.field_35521;
         } else {
            class_8398 var12 = (class_8398)var11;
            if (var10) {
               boolean var13 = var12.method_38673(((class_239)var9.method_27960()).method_1015());
               if (var13 && !var4.method_3186()) {
                  var9.method_27970(1);
               }
            }

            return !var12.method_38674(var4) ? class_6910.field_35521 : class_6910.field_35520;
         }
      } else {
         return !var10 ? class_6910.field_35518 : class_6910.field_35520;
      }
   }

   @Override
   public class_4774 method_10762(class_2522 var1) {
      return !var1.<Boolean>method_10313(field_26767) ? super.method_10762(var1) : class_8532.field_43674.method_17649(false);
   }

   public class_9271 method_23887() {
      return this.field_26768;
   }
}
