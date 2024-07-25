package remapped;

import com.mojang.serialization.Codec;
import java.util.Random;

public class class_6516 extends class_7732 {
   public static final Codec<class_6516> field_33176 = class_2522.field_12489.fieldOf("state").xmap(class_6516::new, var0 -> var0.field_33178).codec();
   private final class_2522 field_33178;

   public class_6516(class_2522 var1) {
      this.field_33178 = var1;
   }

   @Override
   public class_9212<?> method_35003() {
      return class_9212.field_47120;
   }

   @Override
   public class_2522 method_35002(Random var1, BlockPos var2) {
      return this.field_33178;
   }
}
