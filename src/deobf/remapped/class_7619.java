package remapped;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.function.BooleanSupplier;

public final class class_7619 implements BooleanSupplier {
   public class_7619(Path var1) {
      this.field_38772 = var1;
   }

   @Override
   public boolean getAsBoolean() {
      return Files.isRegularFile(this.field_38772);
   }

   @Override
   public String toString() {
      return "verify that " + this.field_38772 + " is present";
   }
}
