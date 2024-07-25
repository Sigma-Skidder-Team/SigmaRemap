package remapped;

import java.util.List;

public class class_7845 implements class_2237 {
   public class_7845(class_341 var1, List var2, GameRules var3) {
      this.field_39764 = var1;
      this.field_39761 = var2;
      this.field_39763 = var3;
   }

   @Override
   public <T extends RuleValue<T>> void method_10289(RuleKey<T> var1, class_3275<T> var2) {
      this.field_39761.add(String.format("%s=%s\n", var1.getName(), this.field_39763.method_1287(var1).toString()));
   }
}
