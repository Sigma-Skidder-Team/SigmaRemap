package remapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.comparator.LastModifiedFileComparator;
import org.apache.commons.io.filefilter.IOFileFilter;
import org.apache.commons.io.filefilter.TrueFileFilter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ClientBuiltinResourcePackProvider implements class_3026 {
   private static final Logger field_28115 = LogManager.getLogger();
   private static final Pattern field_28112 = Pattern.compile("^[a-fA-F0-9]{40}$");
   private final class_599 field_28120;
   private final File field_28117;
   private final ReentrantLock field_28119 = new ReentrantLock();
   private final class_5217 field_28114;
   private CompletableFuture<?> field_28113;
   private class_5522 field_28118;

   public ClientBuiltinResourcePackProvider(File var1, class_5217 var2) {
      this.field_28117 = var1;
      this.field_28114 = var2;
      this.field_28120 = new class_2229(var2);
   }

   @Override
   public void method_13812(Consumer<class_5522> var1, class_7953 var2) {
      class_5522 var5 = class_5522.method_25028("vanilla", true, () -> this.field_28120, var2, class_1154.field_6564, class_2541.field_12595);
      if (var5 != null) {
         var1.accept(var5);
      }

      if (this.field_28118 != null) {
         var1.accept(this.field_28118);
      }

      class_5522 var6 = this.method_25062(var2);
      if (var6 != null) {
         var1.accept(var6);
      }
   }

   public class_599 method_25060() {
      return this.field_28120;
   }

   private static Map<String, String> method_25053() {
      HashMap var2 = Maps.newHashMap();
      var2.put("X-Minecraft-Username", MinecraftClient.getInstance().method_8502().method_5366());
      var2.put("X-Minecraft-UUID", MinecraftClient.getInstance().method_8502().method_5367());
      var2.put("X-Minecraft-Version", class_7665.method_34674().getName());
      var2.put("X-Minecraft-Version-ID", class_7665.method_34674().getId());
      var2.put("X-Minecraft-Pack-Format", String.valueOf(class_7665.method_34674().getPackVersion()));
      var2.put("User-Agent", "Minecraft Java/" + class_7665.method_34674().getName());
      return var2;
   }

   public CompletableFuture<?> method_25055(String var1, String var2) {
      String var5 = DigestUtils.sha1Hex(var1);
      String var6 = field_28112.matcher(var2).matches() ? var2 : "";
      this.field_28119.lock();

      CompletableFuture var12;
      try {
         this.method_25058();
         this.method_25052();
         File var7 = new File(this.field_28117, var5);
         CompletableFuture var8;
         if (var7.exists()) {
            var8 = CompletableFuture.<String>completedFuture("");
         } else {
            class_7152 var9 = new class_7152();
            Map var10 = method_25053();
            MinecraftClient var11 = MinecraftClient.getInstance();
            var11.method_34465(() -> var11.method_8609(var9));
            var8 = class_828.method_3612(var7, var1, var10, 104857600, var9, var11.method_8607());
         }

         this.field_28113 = var8.<Void>thenCompose(
               var3 -> this.method_25051(var6, var7)
                     ? this.method_25054(var7, class_2541.field_12596)
                     : Util.<Void>completeExceptionally(new RuntimeException("Hash check failure for file " + var7 + ", see log"))
            )
            .whenComplete((var1x, var2x) -> {
               if (var2x != null) {
                  field_28115.warn("Pack application failed: {}, deleting file {}", var2x.getMessage(), var7);
                  method_25050(var7);
               }
            });
         var12 = this.field_28113;
      } finally {
         this.field_28119.unlock();
      }

      return var12;
   }

   private static void method_25050(File var0) {
      try {
         Files.delete(var0.toPath());
      } catch (IOException var4) {
         field_28115.warn("Failed to delete file {}: {}", var0, var4.getMessage());
      }
   }

   public void method_25058() {
      this.field_28119.lock();

      try {
         if (this.field_28113 != null) {
            this.field_28113.cancel(true);
         }

         this.field_28113 = null;
         if (this.field_28118 != null) {
            this.field_28118 = null;
            MinecraftClient.getInstance().reloadResourcesConcurrently();
         }
      } finally {
         this.field_28119.unlock();
      }
   }

   private boolean method_25051(String var1, File var2) {
      try (FileInputStream var5 = new FileInputStream(var2)) {
         String var7 = DigestUtils.sha1Hex(var5);
         if (var1.isEmpty()) {
            field_28115.info("Found file {} without verification hash", var2);
            return true;
         } else if (!var7.toLowerCase(Locale.ROOT).equals(var1.toLowerCase(Locale.ROOT))) {
            field_28115.warn("File {} had wrong hash (expected {}, found {}).", var2, var1, var7);
            return false;
         } else {
            field_28115.info("Found file {} matching requested hash {}", var2, var1);
            return true;
         }
      } catch (IOException var22) {
         field_28115.warn("File {} couldn't be hashed.", var2, var22);
         return false;
      }
   }

   private void method_25052() {
      try {
         ArrayList var3 = Lists.newArrayList(FileUtils.listFiles(this.field_28117, TrueFileFilter.TRUE, (IOFileFilter)null));
         var3.sort(LastModifiedFileComparator.LASTMODIFIED_REVERSE);
         int var4 = 0;

         for (File var6 : var3) {
            if (var4++ >= 10) {
               field_28115.info("Deleting old server resource pack {}", var6.getName());
               FileUtils.deleteQuietly(var6);
            }
         }
      } catch (IllegalArgumentException var7) {
         field_28115.error("Error while deleting old server resource pack : {}", var7.getMessage());
      }
   }

   public CompletableFuture<Void> method_25054(File var1, class_2541 var2) {
      class_975 var7;
      try (class_2140 var5 = new class_2140(var1)) {
         var7 = var5.<class_975>웨室殢ใ藸褕(class_975.field_4998);
      } catch (IOException var19) {
         return Util.<Void>completeExceptionally(new IOException(String.format("Invalid resourcepack at %s", var1), var19));
      }

      field_28115.info("Applying server pack {}", var1);
      this.field_28118 = new class_5522(
         "server",
         true,
         () -> new class_2140(var1),
         new TranslationTextComponent("resourcePack.server.name"),
         var7.method_4266(),
         class_2057.method_9601(var7.method_4267()),
         class_1154.field_6565,
         true,
         var2
      );
      return MinecraftClient.getInstance().reloadResourcesConcurrently();
   }

   @Nullable
   private class_5522 method_25062(class_7953 var1) {
      class_5522 var4 = null;
      File var5 = this.field_28114.method_23900(new Identifier("resourcepacks/programmer_art.zip"));
      if (var5 != null && var5.isFile()) {
         var4 = method_25057(var1, () -> method_25061(var5));
      }

      if (var4 == null && class_7665.field_38958) {
         File var6 = this.field_28114.method_23899("../resourcepacks/programmer_art");
         if (var6 != null && var6.isDirectory()) {
            var4 = method_25057(var1, () -> method_25059(var6));
         }
      }

      return var4;
   }

   @Nullable
   private static class_5522 method_25057(class_7953 var0, Supplier<class_8169> var1) {
      return class_5522.method_25028("programer_art", false, var1, var0, class_1154.field_6565, class_2541.field_12595);
   }

   private static class_4968 method_25059(File var0) {
      return new class_6643(var0);
   }

   private static class_8169 method_25061(File var0) {
      return new class_4587(var0);
   }
}
