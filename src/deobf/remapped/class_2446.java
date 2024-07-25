package remapped;

import com.mojang.serialization.Codec;
import java.util.Random;

public abstract class class_2446<U extends class_6157> extends class_4285<U> {
   public class_2446(Codec<U> var1) {
      super(var1);
   }

   @Override
   public boolean method_19907(class_700 var1, class_6541 var2, Random var3, class_1331 var4, U var5) {
      class_2522 var8 = this.method_11181(var3, var4, (U)var5);
      int var9 = 0;

      for (int var10 = 0; var10 < this.method_11183((U)var5); var10++) {
         class_1331 var11 = this.method_11182(var3, var4, (U)var5);
         if (var1.method_22548(var11) && var11.method_12165() < 255 && var8.method_8309(var1, var11) && this.method_11184(var1, var11, (U)var5)) {
            var1.method_7513(var11, var8, 2);
            var9++;
         }
      }

      return var9 > 0;
   }

   public abstract boolean method_11184(class_9379 var1, class_1331 var2, U var3);

   public abstract int method_11183(U var1);

   public abstract class_1331 method_11182(Random var1, class_1331 var2, U var3);

   public abstract class_2522 method_11181(Random var1, class_1331 var2, U var3);
}
