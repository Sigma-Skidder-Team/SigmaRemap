package remapped;

import java.util.Locale;
import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.util.text.TranslationTextComponent;

public class class_9222 implements class_4904 {
   private final int field_47148;
   private final class_5390<?> field_47149;
   private final class_8086 field_47150;
   private final int field_47152;
   private final int field_47153;

   public class_9222(int var1, class_5390<?> var2, class_8086 var3, int var4, int var5) {
      this.field_47148 = var1;
      this.field_47149 = var2;
      this.field_47150 = var3;
      this.field_47152 = var4;
      this.field_47153 = var5;
   }

   @Nullable
   @Override
   public class_8014 method_22451(class_8145 var1, Random var2) {
      if (var1.field_41768 instanceof class_6331) {
         class_6331 var5 = (class_6331)var1.field_41768;
         class_1331 var6 = var5.method_29000(this.field_47149, var1.method_37075(), 100, true);
         if (var6 == null) {
            return null;
         } else {
            class_6098 var7 = class_2143.method_10014(var5, var6.method_12173(), var6.method_12185(), (byte)2, true, true);
            class_2143.method_10013(var5, var7);
            class_2134.method_9969(var7, var6, "+", this.field_47150);
            var7.method_28032(new TranslationTextComponent("filled_map." + this.field_47149.method_24556().toLowerCase(Locale.ROOT)));
            return new class_8014(
               new class_6098(class_4897.field_24997, this.field_47148), new class_6098(class_4897.field_24830), var7, this.field_47152, this.field_47153, 0.2F
            );
         }
      } else {
         return null;
      }
   }
}
