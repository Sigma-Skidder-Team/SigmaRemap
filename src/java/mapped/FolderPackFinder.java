package mapped;

import net.minecraft.resources.IPackFinder;
import net.minecraft.resources.ResourcePackInfo;

import java.io.File;
import java.io.FileFilter;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class FolderPackFinder implements IPackFinder {
   private static final FileFilter field32837 = var0 -> {
      boolean var3 = var0.isFile() && var0.getName().endsWith(".zip");
      boolean var4 = var0.isDirectory() && new File(var0, "pack.mcmeta").isFile();
      return var3 || var4;
   };
   private final File field32838;
   private final IPackNameDecorator field32839;

   public FolderPackFinder(File var1, IPackNameDecorator var2) {
      this.field32838 = var1;
      this.field32839 = var2;
   }

   @Override
   public void method25140(Consumer<ResourcePackInfo> var1, Class9325 var2) {
      if (!this.field32838.isDirectory()) {
         this.field32838.mkdirs();
      }

      File[] var5 = this.field32838.listFiles(field32837);
      if (var5 != null) {
         for (File var9 : var5) {
            String var10 = "file/" + var9.getName();
            ResourcePackInfo var11 = ResourcePackInfo.createResourcePack(var10, false, this.method25142(var9), var2, ResourcePackInfo.Priority.field12829, this.field32839);
            if (var11 != null) {
               var1.accept(var11);
            }
         }
      }
   }

   private Supplier<IResourcePack> method25142(File var1) {
      return !var1.isDirectory() ? () -> new Class311(var1) : () -> new Class309(var1);
   }
}
