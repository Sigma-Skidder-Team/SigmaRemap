package remapped;

public enum class_3292 {
   public class_3292(class_6414... var3) {
   }

   @Override
   public class_2522 method_43653(class_2522 var1, class_240 var2, class_2522 var3, class_9379 var4, class_1331 var5, class_1331 var6) {
      if (var3.method_8350(var1.method_8360())
         && var2.method_1029().method_42629()
         && var1.<class_9264>method_10313(class_6942.field_35695) == class_9264.field_47274
         && var3.<class_9264>method_10313(class_6942.field_35695) == class_9264.field_47274) {
         class_240 var9 = var1.<class_240>method_10313(class_6942.field_35692);
         if (var2.method_1029() != var9.method_1029() && var9 == var3.<class_240>method_10313(class_6942.field_35692)) {
            class_9264 var10 = var2 != var9.method_1042() ? class_9264.field_47277 : class_9264.field_47279;
            var4.method_7513(var6, var3.method_10308(class_6942.field_35695, var10.method_42710()), 18);
            if (var9 == class_240.field_818 || var9 == class_240.field_804) {
               class_3757 var11 = var4.method_28260(var5);
               class_3757 var12 = var4.method_28260(var6);
               if (var11 instanceof class_7099 && var12 instanceof class_7099) {
                  class_7099.method_32632((class_7099)var11, (class_7099)var12);
               }
            }

            return var1.method_10308(class_6942.field_35695, var10);
         }
      }

      return var1;
   }
}
