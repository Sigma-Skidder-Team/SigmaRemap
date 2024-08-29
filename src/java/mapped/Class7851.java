package mapped;

import net.minecraft.client.util.Util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.function.BooleanSupplier;

public final class Class7851 implements BooleanSupplier {
   public final Path field33661;

   public Class7851(Path var1) {
      this.field33661 = var1;
   }

   @Override
   public boolean getAsBoolean() {
      try {
         Files.deleteIfExists(this.field33661);
         return true;
      } catch (IOException var4) {
         Util.method38542().warn("Failed to delete", var4);
         return false;
      }
   }

   @Override
   public String toString() {
      return "delete old " + this.field33661;
   }
}
