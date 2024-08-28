package mapped;

import com.mojang.bridge.game.GameVersion;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import io.netty.util.ResourceLeakDetector;
import io.netty.util.ResourceLeakDetector.Level;
import java.time.Duration;

public class Class9246 {
   private static String[] field42541;
   public static final Level field42542 = Level.DISABLED;
   public static final long field42543 = Duration.ofMillis(300L).toNanos();
   public static boolean field42544 = true;
   public static boolean field42545;
   public static final char[] field42546 = new char[]{'/', '\n', '\r', '\t', '\u0000', '\f', '`', '?', '*', '\\', '<', '>', '|', '"', ':'};
   private static GameVersion field42547;

   public static boolean method34771(char var0) {
      return var0 != 167 && var0 >= ' ' && var0 != 127;
   }

   public static String method34772(String var0) {
      StringBuilder var3 = new StringBuilder();

      for (char var7 : var0.toCharArray()) {
         if (method34771(var7)) {
            var3.append(var7);
         }
      }

      return var3.toString();
   }

   public static GameVersion method34773() {
      if (field42547 == null) {
         field42547 = Class8245.method28760();
      }

      return field42547;
   }

   public static int method34774() {
      return 754;
   }

   static {
      ResourceLeakDetector.setLevel(field42542);
      CommandSyntaxException.ENABLE_COMMAND_STACK_TRACES = false;
      CommandSyntaxException.BUILT_IN_EXCEPTIONS = new Class8106();
   }
}
