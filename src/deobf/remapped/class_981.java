package remapped;

import com.mojang.serialization.Codec;
import java.util.Random;

public class class_981 extends class_4285<class_6893> {
   public class_981(Codec<class_6893> var1) {
      super(var1);
   }

   public boolean method_4281(class_700 var1, class_6541 var2, Random var3, class_1331 var4, class_6893 var5) {
      boolean var8 = var3.nextBoolean();
      return !var8 ? var5.field_35456.get().method_27104(var1, var2, var3, var4) : var5.field_35454.get().method_27104(var1, var2, var3, var4);
   }
}
