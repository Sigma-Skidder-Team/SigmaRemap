package remapped;

import com.mojang.serialization.Codec;
import java.util.Random;

public class class_9034 extends class_2710 {
   public static final Codec<class_9034> field_46220 = class_8669.field_44462.fieldOf("block").xmap(class_9034::new, var0 -> var0.field_46221).codec();
   private final class_6414 field_46221;

   public class_9034(class_6414 var1) {
      this.field_46221 = var1;
   }

   @Override
   public boolean method_12207(class_2522 var1, Random var2) {
      return var1.method_8350(this.field_46221);
   }

   @Override
   public class_7768<?> method_12209() {
      return class_7768.field_39367;
   }
}
