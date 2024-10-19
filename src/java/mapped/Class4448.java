package mapped;

import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.CompressedStreamTools;
import net.minecraft.util.text.ITextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nullable;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Class4448 implements Class4442 {
   private static final Logger field21619 = LogManager.getLogger();
   private final Class9068 field21620;

   public Class4448(Class9068 var1) {
      this.field21620 = var1;
   }

   @Override
   public void method14013(Class8297 var1) throws IOException {
      Path var4 = this.field21620.method33776();

      for (Path var6 : this.field21620.method33775()) {
         Files.walk(var6).filter(var0 -> var0.toString().endsWith(".nbt")).forEach(var3 -> method14080(var3, this.method14079(var6, var3), var4));
      }
   }

   @Override
   public String method14012() {
      return "NBT to SNBT";
   }

   private String method14079(Path var1, Path var2) {
      String var5 = var1.relativize(var2).toString().replaceAll("\\\\", "/");
      return var5.substring(0, var5.length() - ".nbt".length());
   }

   @Nullable
   public static Path method14080(Path var0, String var1, Path var2) {
      try {
         CompoundNBT var5 = CompressedStreamTools.readCompressed(Files.newInputStream(var0));
         ITextComponent var6 = var5.toFormattedComponent("    ", 0);
         String var7 = var6.getString() + "\n";
         Path var8 = var2.resolve(var1 + ".snbt");
         Files.createDirectories(var8.getParent());

         try (BufferedWriter var9 = Files.newBufferedWriter(var8)) {
            var9.write(var7);
         }

         field21619.info("Converted {} from NBT to SNBT", var1);
         return var8;
      } catch (IOException var22) {
         field21619.error("Couldn't convert {} from NBT to SNBT at {}", var1, var0, var22);
         return null;
      }
   }
}
