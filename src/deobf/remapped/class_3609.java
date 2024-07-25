package remapped;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.function.BooleanSupplier;

public final class class_3609 implements BooleanSupplier {
   public class_3609(Path var1) {
      this.field_17629 = var1;
   }

   @Override
   public boolean getAsBoolean() {
      return !Files.exists(this.field_17629);
   }

   @Override
   public String toString() {
      return "verify that " + this.field_17629 + " is deleted";
   }
}
