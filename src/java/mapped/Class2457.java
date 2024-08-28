package mapped;

import java.io.IOException;
import java.nio.file.Path;

public class Class2457 extends IOException {
   private Class2457(Path var1, String var2) {
      super(var1.toAbsolutePath() + ": " + var2);
   }

   public static Class2457 method10465(Path var0) {
      return new Class2457(var0, "already locked (possibly by other Minecraft instance?)");
   }
}
