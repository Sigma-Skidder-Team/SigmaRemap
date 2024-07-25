package remapped;

import com.google.common.base.Charsets;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_4162 {
   private static final Logger field_20236 = LogManager.getLogger();
   private final Path field_20234;
   private final Path field_20235;
   private int field_20233;
   private final Map<Path, String> field_20231 = Maps.newHashMap();
   private final Map<Path, String> field_20238 = Maps.newHashMap();
   private final Set<Path> field_20232 = Sets.newHashSet();

   public class_4162(Path var1, String var2) throws IOException {
      this.field_20234 = var1;
      Path var5 = var1.resolve(".cache");
      Files.createDirectories(var5);
      this.field_20235 = var5.resolve(var2);
      this.method_19314().forEach(var1x -> {
         String var4 = this.field_20231.put(var1x, "");
      });
      if (Files.isReadable(this.field_20235)) {
         IOUtils.readLines(Files.newInputStream(this.field_20235), Charsets.UTF_8).forEach(var2x -> {
            int var5x = var2x.indexOf(32);
            this.field_20231.put(var1.resolve(var2x.substring(var5x + 1)), var2x.substring(0, var5x));
         });
      }
   }

   public void method_19316() throws IOException {
      this.method_19310();

      BufferedWriter var3;
      try {
         var3 = Files.newBufferedWriter(this.field_20235);
      } catch (IOException var5) {
         field_20236.warn("Unable write cachefile {}: {}", this.field_20235, var5.toString());
         return;
      }

      IOUtils.writeLines(
         this.field_20238
            .entrySet()
            .stream()
            .<String>map(var1 -> var1.getValue() + ' ' + this.field_20234.relativize(var1.getKey()))
            .collect(Collectors.toList()),
         System.lineSeparator(),
         var3
      );
      var3.close();
      field_20236.debug(
         "Caching: cache hits: {}, created: {} removed: {}", this.field_20233, this.field_20238.size() - this.field_20233, this.field_20231.size()
      );
   }

   @Nullable
   public String method_19313(Path var1) {
      return this.field_20231.get(var1);
   }

   public void method_19317(Path var1, String var2) {
      this.field_20238.put(var1, var2);
      if (Objects.equals(this.field_20231.remove(var1), var2)) {
         this.field_20233++;
      }
   }

   public boolean method_19312(Path var1) {
      return this.field_20231.containsKey(var1);
   }

   public void method_19311(Path var1) {
      this.field_20232.add(var1);
   }

   private void method_19310() throws IOException {
      this.method_19314().forEach(var1 -> {
         if (this.method_19312(var1) && !this.field_20232.contains(var1)) {
            try {
               Files.delete(var1);
            } catch (IOException var5) {
               field_20236.debug("Unable to delete: {} ({})", var1, var5.toString());
            }
         }
      });
   }

   private Stream<Path> method_19314() throws IOException {
      return Files.walk(this.field_20234).filter(var1 -> !Objects.equals(this.field_20235, var1) && !Files.isDirectory(var1));
   }
}
