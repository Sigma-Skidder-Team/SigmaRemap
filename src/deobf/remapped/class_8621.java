package remapped;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.function.BooleanSupplier;

public final class class_8621 implements BooleanSupplier {
   public class_8621(Path var1, Path var2) {
      this.field_44241 = var1;
      this.field_44239 = var2;
   }

   @Override
   public boolean getAsBoolean() {
      try {
         Files.move(this.field_44241, this.field_44239);
         return true;
      } catch (IOException var4) {
         class_9665.method_44663().error("Failed to rename", var4);
         return false;
      }
   }

   @Override
   public String toString() {
      return "rename " + this.field_44241 + " to " + this.field_44239;
   }
}
