package mapped;

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

public class Class8297 {
   private static final Logger field35641 = LogManager.getLogger();
   private final Path field35642;
   private final Path field35643;
   private int field35644;
   private final Map<Path, String> field35645 = Maps.newHashMap();
   private final Map<Path, String> field35646 = Maps.newHashMap();
   private final Set<Path> field35647 = Sets.newHashSet();

   public Class8297(Path var1, String var2) throws IOException {
      this.field35642 = var1;
      Path var5 = var1.resolve(".cache");
      Files.createDirectories(var5);
      this.field35643 = var5.resolve(var2);
      this.method29006().forEach(var1x -> {
         String var4 = this.field35645.put(var1x, "");
      });
      if (Files.isReadable(this.field35643)) {
         IOUtils.readLines(Files.newInputStream(this.field35643), Charsets.UTF_8).forEach(var2x -> {
            int var5x = var2x.indexOf(32);
            this.field35645.put(var1.resolve(var2x.substring(var5x + 1)), var2x.substring(0, var5x));
         });
      }
   }

   public void method29000() throws IOException {
      this.method29005();

      BufferedWriter var3;
      try {
         var3 = Files.newBufferedWriter(this.field35643);
      } catch (IOException var5) {
         field35641.warn("Unable write cachefile {}: {}", this.field35643, var5.toString());
         return;
      }

      IOUtils.writeLines(
         this.field35646
            .entrySet()
            .stream()
            .<String>map(var1 -> var1.getValue() + ' ' + this.field35642.relativize(var1.getKey()))
            .collect(Collectors.toList()),
         System.lineSeparator(),
         var3
      );
      var3.close();
      field35641.debug("Caching: cache hits: {}, created: {} removed: {}", this.field35644, this.field35646.size() - this.field35644, this.field35645.size());
   }

   @Nullable
   public String method29001(Path var1) {
      return this.field35645.get(var1);
   }

   public void method29002(Path var1, String var2) {
      this.field35646.put(var1, var2);
      if (Objects.equals(this.field35645.remove(var1), var2)) {
         this.field35644++;
      }
   }

   public boolean method29003(Path var1) {
      return this.field35645.containsKey(var1);
   }

   public void method29004(Path var1) {
      this.field35647.add(var1);
   }

   private void method29005() throws IOException {
      this.method29006().forEach(var1 -> {
         if (this.method29003(var1) && !this.field35647.contains(var1)) {
            try {
               Files.delete(var1);
            } catch (IOException var5) {
               field35641.debug("Unable to delete: {} ({})", var1, var5.toString());
            }
         }
      });
   }

   private Stream<Path> method29006() throws IOException {
      return Files.walk(this.field35642).filter(var1 -> !Objects.equals(this.field35643, var1) && !Files.isDirectory(var1));
   }
}
