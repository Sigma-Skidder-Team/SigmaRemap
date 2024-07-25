package remapped;

import com.mojang.bridge.game.GameVersion;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import io.netty.util.ResourceLeakDetector;
import io.netty.util.ResourceLeakDetector.Level;
import java.time.Duration;

public class class_7665 {
   private static String[] field_38953;
   public static final Level field_38955 = Level.DISABLED;
   public static final long field_38959 = Duration.ofMillis(300L).toNanos();
   public static boolean field_38957 = true;
   public static boolean field_38958;
   public static final char[] field_38956 = new char[]{'/', '\n', '\r', '\t', '\u0000', '\f', '`', '?', '*', '\\', '<', '>', '|', '"', ':'};
   private static GameVersion field_38954;

   public static boolean method_34675(char var0) {
      return var0 != 167 && var0 >= ' ' && var0 != 127;
   }

   public static String method_34677(String var0) {
      StringBuilder var3 = new StringBuilder();

      for (char var7 : var0.toCharArray()) {
         if (method_34675(var7)) {
            var3.append(var7);
         }
      }

      return var3.toString();
   }

   public static GameVersion method_34674() {
      if (field_38954 == null) {
         field_38954 = class_4028.method_18550();
      }

      return field_38954;
   }

   public static int method_34676() {
      return 754;
   }

   static {
      ResourceLeakDetector.setLevel(field_38955);
      CommandSyntaxException.ENABLE_COMMAND_STACK_TRACES = false;
      CommandSyntaxException.BUILT_IN_EXCEPTIONS = new class_3628();
   }
}
