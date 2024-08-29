package mapped;

import net.minecraft.client.util.Util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.function.BooleanSupplier;

public final class Class7852 implements BooleanSupplier {
   public final Path field33662;
   public final Path field33663;

   public Class7852(Path var1, Path var2) {
      this.field33662 = var1;
      this.field33663 = var2;
   }

   @Override
   public boolean getAsBoolean() {
      try {
         Files.move(this.field33662, this.field33663);
         return true;
      } catch (IOException var4) {
         Util.method38542().error("Failed to rename", var4);
         return false;
      }
   }

   @Override
   public String toString() {
      return "rename " + this.field33662 + " to " + this.field33663;
   }
}
