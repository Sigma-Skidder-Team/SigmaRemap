package remapped;

import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class class_4838 extends class_6291 {
   private static String[] field_24146;
   public static final Codec<class_4838> field_24144 = Codec.unit(() -> class_4838.field_24145);
   public static final class_4838 field_24145 = new class_4838();

   @Override
   public class_8783<?> method_28707() {
      return class_8783.field_44950;
   }

   @Override
   public void method_28703(class_700 var1, Random var2, List<class_1331> var3, List<class_1331> var4, Set<class_1331> var5, class_9616 var6) {
      var3.forEach(var5x -> {
         if (var2.nextInt(3) > 0) {
            class_1331 var8 = var5x.method_6108();
            if (class_4285.method_19908(var1, var8)) {
               this.method_28705(var1, var8, class_4196.field_20415, var5, var6);
            }
         }

         if (var2.nextInt(3) > 0) {
            class_1331 var9 = var5x.method_6090();
            if (class_4285.method_19908(var1, var9)) {
               this.method_28705(var1, var9, class_4196.field_20409, var5, var6);
            }
         }

         if (var2.nextInt(3) > 0) {
            class_1331 var10 = var5x.method_6094();
            if (class_4285.method_19908(var1, var10)) {
               this.method_28705(var1, var10, class_4196.field_20408, var5, var6);
            }
         }

         if (var2.nextInt(3) > 0) {
            class_1331 var11 = var5x.method_6073();
            if (class_4285.method_19908(var1, var11)) {
               this.method_28705(var1, var11, class_4196.field_20411, var5, var6);
            }
         }
      });
   }
}
