package remapped;

import com.mojang.serialization.Codec;
import java.util.Random;

public class class_649 extends class_2710 {
   public static final Codec<class_649> field_3624 = class_2522.field_12489.fieldOf("block_state").xmap(class_649::new, var0 -> var0.field_3623).codec();
   private final class_2522 field_3623;

   public class_649(class_2522 var1) {
      this.field_3623 = var1;
   }

   @Override
   public boolean method_12207(class_2522 var1, Random var2) {
      return var1 == this.field_3623;
   }

   @Override
   public class_7768<?> method_12209() {
      return class_7768.field_39365;
   }
}
