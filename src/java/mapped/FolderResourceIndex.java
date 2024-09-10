package mapped;

import net.minecraft.util.ResourceLocation;

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

public class FolderResourceIndex extends net.minecraft.client.resources.ResourceIndex {
   private final File field34180;

   public FolderResourceIndex(File var1) {
      this.field34180 = var1;
   }

   @Override
   public File getFile(ResourceLocation var1) {
      return new File(this.field34180, var1.toString().replace(':', '/'));
   }

   @Override
   public File getFile(String var1) {
      return new File(this.field34180, var1);
   }

   @Override
   public Collection<ResourceLocation> getFiles(String var1, String var2, int var3, Predicate<String> var4) {
      Path var7 = this.field34180.toPath().resolve(var2);

      try (Stream<Path> var8 = Files.walk(var7.resolve(var1), var3)) {
         return var8.filter(var0 -> Files.isRegularFile(var0))
            .filter(var0 -> !var0.endsWith(".mcmeta"))
            .filter(var1x -> var4.test(var1x.getFileName().toString()))
            .map(var2x -> new ResourceLocation(var2, var7.relativize(var2x).toString().replaceAll("\\\\", "/")))
            .collect(Collectors.<ResourceLocation>toList());
      } catch (NoSuchFileException var23) {
      } catch (IOException var24) {
         LOGGER.warn("Unable to getFiles on {}", var1, var24);
      }

      return Collections.<ResourceLocation>emptyList();
   }
}
