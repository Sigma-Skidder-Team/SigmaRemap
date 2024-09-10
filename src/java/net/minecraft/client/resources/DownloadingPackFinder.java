package net.minecraft.client.resources;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

import mapped.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.util.Util;
import net.minecraft.resources.IPackFinder;
import net.minecraft.resources.ResourcePackInfo;
import net.minecraft.resources.VanillaPack;
import net.minecraft.resources.data.PackMetadataSection;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.comparator.LastModifiedFileComparator;
import org.apache.commons.io.filefilter.TrueFileFilter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DownloadingPackFinder implements IPackFinder {
   private static final Logger field32840 = LogManager.getLogger();
   private static final Pattern field32841 = Pattern.compile("^[a-fA-F0-9]{40}$");
   private final VanillaPack vanillaPack;
   private final File serverPackDir;
   private final ReentrantLock field32844 = new ReentrantLock();
   private final ResourceIndex resourceIndex;
   private CompletableFuture<?> field32846;
   private ResourcePackInfo field32847;

   public DownloadingPackFinder(File var1, ResourceIndex var2) {
      this.serverPackDir = var1;
      this.resourceIndex = var2;
      this.vanillaPack = new VirtualAssetsPack(var2);
   }

   @Override
   public void findPacks(Consumer<ResourcePackInfo> var1, Class9325 var2) {
      ResourcePackInfo var5 = ResourcePackInfo.createResourcePack("vanilla", true, () -> this.vanillaPack, var2, ResourcePackInfo.Priority.field12830, IPackNameDecorator.field33171);
      if (var5 != null) {
         var1.accept(var5);
      }

      if (this.field32847 != null) {
         var1.accept(this.field32847);
      }

      ResourcePackInfo var6 = this.method25154(var2);
      if (var6 != null) {
         var1.accept(var6);
      }
   }

   public VanillaPack getVanillaPack() {
      return this.vanillaPack;
   }

   private static Map<String, String> getPackDownloadRequestProperties() {
      HashMap var2 = Maps.newHashMap();
      var2.put("X-Minecraft-Username", Minecraft.getInstance().getSession().getUsername());
      var2.put("X-Minecraft-UUID", Minecraft.getInstance().getSession().getPlayerID());
      var2.put("X-Minecraft-Version", SharedConstants.getVersion().getName());
      var2.put("X-Minecraft-Version-ID", SharedConstants.getVersion().getId());
      var2.put("X-Minecraft-Pack-Format", String.valueOf(SharedConstants.getVersion().getPackVersion()));
      var2.put("User-Agent", "Minecraft Java/" + SharedConstants.getVersion().getName());
      return var2;
   }

   public CompletableFuture<?> downloadResourcePack(String var1, String var2) {
      String var5 = DigestUtils.sha1Hex(var1);
      String var6 = field32841.matcher(var2).matches() ? var2 : "";
      this.field32844.lock();

      CompletableFuture var12;
      try {
         this.clearResourcePack();
         this.method25152();
         File var7 = new File(this.serverPackDir, var5);
         CompletableFuture<?> var8;
         if (var7.exists()) {
            var8 = CompletableFuture.completedFuture("");
         } else {
            WorkingScreen var9 = new WorkingScreen();
            Map var10 = getPackDownloadRequestProperties();
            Minecraft var11 = Minecraft.getInstance();
            var11.method1635(() -> var11.displayGuiScreen(var9));
            var8 = Class6639.method20256(var7, var1, var10, 104857600, var9, var11.getProxy());
         }

         this.field32846 = var8.thenCompose(
               var3 -> this.method25151(var6, var7) ? this.method25153(var7, IPackNameDecorator.field33173) : Util.method38497(new RuntimeException("Hash check failure for file " + var7 + ", see log")))
            .whenComplete((var1x, var2x) -> {
               if (var2x != null) {
                  field32840.warn("Pack application failed: {}, deleting file {}", var2x.getMessage(), var7);
                  method25149(var7);
               }
            });
         var12 = this.field32846;
      } finally {
         this.field32844.unlock();
      }

      return var12;
   }

   private static void method25149(File var0) {
      try {
         Files.delete(var0.toPath());
      } catch (IOException var4) {
         field32840.warn("Failed to delete file {}: {}", var0, var4.getMessage());
      }
   }

   public void clearResourcePack() {
      this.field32844.lock();

      try {
         if (this.field32846 != null) {
            this.field32846.cancel(true);
         }

         this.field32846 = null;
         if (this.field32847 != null) {
            this.field32847 = null;
            Minecraft.getInstance().scheduleResourcesRefresh();
         }
      } finally {
         this.field32844.unlock();
      }
   }

   private boolean method25151(String var1, File var2) {
      try (FileInputStream var5 = new FileInputStream(var2)) {
         String var7 = DigestUtils.sha1Hex(var5);
         if (var1.isEmpty()) {
            field32840.info("Found file {} without verification hash", var2);
            return true;
         } else if (!var7.toLowerCase(Locale.ROOT).equals(var1.toLowerCase(Locale.ROOT))) {
            field32840.warn("File {} had wrong hash (expected {}, found {}).", var2, var1, var7);
            return false;
         } else {
            field32840.info("Found file {} matching requested hash {}", var2, var1);
            return true;
         }
      } catch (IOException var22) {
         field32840.warn("File {} couldn't be hashed.", var2, var22);
         return false;
      }
   }

   private void method25152() {
      try {
         List<File> var3 = Lists.newArrayList(FileUtils.listFiles(this.serverPackDir, TrueFileFilter.TRUE, null));
         var3.sort(LastModifiedFileComparator.LASTMODIFIED_REVERSE);
         int var4 = 0;

         for (File var6 : var3) {
            if (var4++ >= 10) {
               field32840.info("Deleting old server resource pack {}", var6.getName());
               FileUtils.deleteQuietly(var6);
            }
         }
      } catch (IllegalArgumentException var7) {
         field32840.error("Error while deleting old server resource pack : {}", var7.getMessage());
      }
   }

   public CompletableFuture<Void> method25153(File var1, IPackNameDecorator var2) {
      PackMetadataSection var7;
      try (Class311 var5 = new Class311(var1)) {
         var7 = var5.<PackMetadataSection>getMetadata(PackMetadataSection.field29661);
      } catch (IOException var19) {
         return Util.<Void>method38497(new IOException(String.format("Invalid resourcepack at %s", var1), var19));
      }

      field32840.info("Applying server pack {}", var1);
      this.field32847 = new ResourcePackInfo(
         "server",
         true,
         () -> new Class311(var1),
         new TranslationTextComponent("resourcePack.server.name"),
         var7.method20752(),
         Class2064.method8721(var7.getPackFormat()),
         ResourcePackInfo.Priority.field12829,
         true,
         var2
      );
      return Minecraft.getInstance().scheduleResourcesRefresh();
   }

   @Nullable
   private ResourcePackInfo method25154(Class9325 var1) {
      ResourcePackInfo var4 = null;
      File var5 = this.resourceIndex.getFile(new ResourceLocation("resourcepacks/programmer_art.zip"));
      if (var5 != null && var5.isFile()) {
         var4 = method25155(var1, () -> method25157(var5));
      }

      if (var4 == null && SharedConstants.developmentMode) {
         File var6 = this.resourceIndex.getFile("../resourcepacks/programmer_art");
         if (var6 != null && var6.isDirectory()) {
            var4 = method25155(var1, () -> method25156(var6));
         }
      }

      return var4;
   }

   @Nullable
   private static ResourcePackInfo method25155(Class9325 var0, Supplier<IResourcePack> var1) {
      return ResourcePackInfo.createResourcePack("programer_art", false, var1, var0, ResourcePackInfo.Priority.field12829, IPackNameDecorator.field33171);
   }

   private static Class309 method25156(File var0) {
      return new Class310(var0);
   }

   private static IResourcePack method25157(File var0) {
      return new Class312(var0);
   }
}
