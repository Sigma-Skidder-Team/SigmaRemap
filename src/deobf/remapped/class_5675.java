package remapped;

import com.mojang.serialization.Codec;
import java.util.Random;

public class class_5675 extends class_7732 {
   public static final Codec<class_5675> field_28762 = class_2522.field_12489
      .fieldOf("state")
      .xmap(class_1873::method_8360, class_6414::method_29260)
      .xmap(class_5675::new, var0 -> var0.field_28763)
      .codec();
   private final class_6414 field_28763;

   public class_5675(class_6414 var1) {
      this.field_28763 = var1;
   }

   @Override
   public class_9212<?> method_35003() {
      return class_9212.field_47124;
   }

   @Override
   public class_2522 method_35002(Random var1, class_1331 var2) {
      class_9249 var5 = class_9249.method_42627(var1);
      return this.field_28763.method_29260().method_10308(class_7947.field_40671, var5);
   }
}
