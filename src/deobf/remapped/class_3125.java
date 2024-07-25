package remapped;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class class_3125 extends class_5217 {
   private final File field_15521;

   public class_3125(File var1) {
      this.field_15521 = var1;
   }

   @Override
   public File method_23900(class_4639 var1) {
      return new File(this.field_15521, var1.toString().replace(':', '/'));
   }

   @Override
   public File method_23899(String var1) {
      return new File(this.field_15521, var1);
   }

   @Override
   public Collection<class_4639> method_23898(String var1, String var2, int var3, Predicate<String> var4) {
      Path var7 = this.field_15521.toPath().resolve(var2);

      try (Stream var8 = Files.walk(var7.resolve(var1), var3)) {
         return var8.filter(var0 -> Files.isRegularFile(var0))
            .filter(var0 -> !var0.endsWith(".mcmeta"))
            .filter(var1x -> var4.test(var1x.getFileName().toString()))
            .<class_4639>map(var2x -> new class_4639(var2, var7.relativize(var2x).toString().replaceAll("\\\\", "/")))
            .collect(Collectors.<class_4639>toList());
      } catch (NoSuchFileException var23) {
      } catch (IOException var24) {
         field_26786.warn("Unable to getFiles on {}", var1, var24);
      }

      return Collections.<class_4639>emptyList();
   }
}
