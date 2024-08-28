package mapped;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.function.BooleanSupplier;

public final class Class7853 implements BooleanSupplier {
   public final Path field33664;

   public Class7853(Path var1) {
      this.field33664 = var1;
   }

   @Override
   public boolean getAsBoolean() {
      return !Files.exists(this.field33664);
   }

   @Override
   public String toString() {
      return "verify that " + this.field33664 + " is deleted";
   }
}
