package remapped;

import java.io.IOException;
import java.nio.file.Path;

public class class_1569 extends IOException {
   private class_1569(Path var1, String var2) {
      super(var1.toAbsolutePath() + ": " + var2);
   }

   public static class_1569 method_7084(Path var0) {
      return new class_1569(var0, "already locked (possibly by other Minecraft instance?)");
   }
}
