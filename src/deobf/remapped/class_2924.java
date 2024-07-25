package remapped;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.function.BooleanSupplier;

public final class class_2924 implements BooleanSupplier {
   public class_2924(Path var1) {
      this.field_14253 = var1;
   }

   @Override
   public boolean getAsBoolean() {
      try {
         Files.deleteIfExists(this.field_14253);
         return true;
      } catch (IOException var4) {
         Util.method_44663().warn("Failed to delete", var4);
         return false;
      }
   }

   @Override
   public String toString() {
      return "delete old " + this.field_14253;
   }
}
