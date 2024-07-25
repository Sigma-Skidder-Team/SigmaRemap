package remapped;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import javax.annotation.Nullable;
import net.minecraft.util.text.ITextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_3916 implements class_5998 {
   private static final Logger field_19022 = LogManager.getLogger();
   private final class_6901 field_19020;

   public class_3916(class_6901 var1) {
      this.field_19020 = var1;
   }

   @Override
   public void method_27389(class_4162 var1) throws IOException {
      Path var4 = this.field_19020.method_31600();

      for (Path var6 : this.field_19020.method_31601()) {
         Files.walk(var6).filter(var0 -> var0.toString().endsWith(".nbt")).forEach(var3 -> method_18125(var3, this.method_18124(var6, var3), var4));
      }
   }

   @Override
   public String method_27387() {
      return "NBT to SNBT";
   }

   private String method_18124(Path var1, Path var2) {
      String var5 = var1.relativize(var2).toString().replaceAll("\\\\", "/");
      return var5.substring(0, var5.length() - ".nbt".length());
   }

   @Nullable
   public static Path method_18125(Path var0, String var1, Path var2) {
      try {
         CompoundNBT var5 = class_5957.method_27219(Files.newInputStream(var0));
         ITextComponent var6 = var5.method_38712("    ", 0);
         String var7 = var6.getString() + "\n";
         Path var8 = var2.resolve(var1 + ".snbt");
         Files.createDirectories(var8.getParent());

         try (BufferedWriter var9 = Files.newBufferedWriter(var8)) {
            var9.write(var7);
         }

         field_19022.info("Converted {} from NBT to SNBT", var1);
         return var8;
      } catch (IOException var22) {
         field_19022.error("Couldn't convert {} from NBT to SNBT at {}", var1, var0, var22);
         return null;
      }
   }
}
