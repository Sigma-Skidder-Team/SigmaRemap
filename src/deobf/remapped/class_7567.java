package remapped;

import java.time.Duration;
import java.util.Arrays;
import net.minecraft.util.text.ChatType;
import net.minecraft.util.text.StringTextComponent;

public class class_7567 {
   private static final class_8494 field_38560 = new class_8494(Duration.ofSeconds(5L));

   public static void method_34410(String var0) {
      NarratorChatListener var3 = NarratorChatListener.INSTANCE;
      var3.method_34347();
      var3.method_44914(ChatType.SYSTEM, new StringTextComponent(method_34406(var0)), Util.NIL_UUID);
   }

   private static String method_34406(String var0) {
      return var0.replace("\\n", System.lineSeparator());
   }

   public static void method_34408(String... var0) {
      method_34412(Arrays.<String>asList(var0));
   }

   public static void method_34412(Iterable<String> var0) {
      method_34410(method_34407(var0));
   }

   public static String method_34407(Iterable<String> var0) {
      return String.join(System.lineSeparator(), var0);
   }

   public static void method_34409(String var0) {
      field_38560.method_39148(method_34406(var0));
   }
}
