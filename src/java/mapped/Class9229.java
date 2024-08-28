package mapped;

import java.time.Duration;
import java.util.Arrays;
import net.minecraft.util.text.ChatType;
import net.minecraft.util.text.StringTextComponent;

public class Class9229 {
   private static final Class9469 field42479 = new Class9469(Duration.ofSeconds(5L));

   public static void method34711(String var0) {
      Class6688 var3 = Class6688.field29302;
      var3.method20406();
      var3.method20400(ChatType.SYSTEM, new StringTextComponent(method34712(var0)), Util.field45724);
   }

   private static String method34712(String var0) {
      return var0.replace("\\n", System.lineSeparator());
   }

   public static void method34713(String... var0) {
      method34714(Arrays.<String>asList(var0));
   }

   public static void method34714(Iterable<String> var0) {
      method34711(method34715(var0));
   }

   public static String method34715(Iterable<String> var0) {
      return String.join(System.lineSeparator(), var0);
   }

   public static void method34716(String var0) {
      field42479.method36514(method34712(var0));
   }
}
