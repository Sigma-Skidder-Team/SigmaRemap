package remapped;

import com.mojang.serialization.Codec;
import java.util.Random;

public class class_5893 extends class_2710 {
   public static final Codec<class_5893> field_29933 = class_2307.<class_6414>method_10610(() -> class_8410.method_38721().method_29392())
      .fieldOf("tag")
      .xmap(class_5893::new, var0 -> var0.field_29931)
      .codec();
   private final class_2307<class_6414> field_29931;

   public class_5893(class_2307<class_6414> var1) {
      this.field_29931 = var1;
   }

   @Override
   public boolean method_12207(class_2522 var1, Random var2) {
      return var1.method_8349(this.field_29931);
   }

   @Override
   public class_7768<?> method_12209() {
      return class_7768.field_39364;
   }
}
