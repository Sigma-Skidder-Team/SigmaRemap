package mapped;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.function.BooleanSupplier;

public final class Class7854 implements BooleanSupplier {
   public final Path field33665;

   public Class7854(Path var1) {
      this.field33665 = var1;
   }

   @Override
   public boolean getAsBoolean() {
      return Files.isRegularFile(this.field33665);
   }

   @Override
   public String toString() {
      return "verify that " + this.field33665 + " is present";
   }
}
