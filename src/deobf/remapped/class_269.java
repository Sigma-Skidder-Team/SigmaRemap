package remapped;

import java.util.Map;
import java.util.Random;
import javax.annotation.Nullable;

public class class_269 implements class_4904 {
   private final Map<class_8853, class_2451> field_966;
   private final int field_963;
   private final int field_965;
   private final int field_962;

   public class_269(int var1, int var2, int var3, Map<class_8853, class_2451> var4) {
      class_8669.field_44375.method_39801().filter(var1x -> !var4.containsKey(var1x)).findAny().ifPresent(var0 -> {
         throw new IllegalStateException("Missing trade for villager type: " + class_8669.field_44375.method_39797(var0));
      });
      this.field_966 = var4;
      this.field_963 = var1;
      this.field_965 = var2;
      this.field_962 = var3;
   }

   @Nullable
   @Override
   public class_8014 method_22451(Entity var1, Random var2) {
      if (!(var1 instanceof class_3449)) {
         return null;
      } else {
         ItemStack var5 = new ItemStack(this.field_966.get(((class_3449)var1).method_15891().method_13912()), this.field_963);
         return new class_8014(var5, new ItemStack(class_4897.field_24997), this.field_965, this.field_962, 0.05F);
      }
   }
}
