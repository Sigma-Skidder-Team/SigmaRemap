package remapped;

import java.util.Set;
import net.minecraft.util.text.LanguageMap;

public final class class_5186 implements class_2237 {
   private static String[] field_26685;

   public class_5186(LanguageMap var1, Set var2) {
      this.field_26684 = var1;
      this.field_26683 = var2;
   }

   @Override
   public <T extends RuleValue<T>> void method_10289(RuleKey<T> var1, class_3275<T> var2) {
      if (!this.field_26684.func_230506_b_(var1.getLocaleString())) {
         this.field_26683.add(var1.getName());
      }
   }
}
