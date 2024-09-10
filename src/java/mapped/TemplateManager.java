package mapped;

import com.google.common.collect.Maps;
import com.mojang.datafixers.DataFixer;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.util.Map;
import javax.annotation.Nullable;

import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.CompressedStreamTools;
import net.minecraft.util.ResourceLocation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TemplateManager {
   private static final Logger field39441 = LogManager.getLogger();
   private final Map<ResourceLocation, Class8969> field39442 = Maps.newHashMap();
   private final DataFixer field39443;
   private IResourceManager field39444;
   private final Path field39445;

   public TemplateManager(IResourceManager var1, SaveFormat.LevelSave var2, DataFixer var3) {
      this.field39444 = var1;
      this.field39443 = var3;
      this.field39445 = var2.resolveFilePath(FolderName.field23351).normalize();
   }

   public Class8969 method31603(ResourceLocation var1) {
      Class8969 var4 = this.method31604(var1);
      if (var4 == null) {
         var4 = new Class8969();
         this.field39442.put(var1, var4);
      }

      return var4;
   }

   @Nullable
   public Class8969 method31604(ResourceLocation var1) {
      return this.field39442.computeIfAbsent(var1, var1x -> {
         Class8969 var4 = this.method31607(var1x);
         return var4 == null ? this.method31606(var1x) : var4;
      });
   }

   public void onResourceManagerReload(IResourceManager var1) {
      this.field39444 = var1;
      this.field39442.clear();
   }

   @Nullable
   private Class8969 method31606(ResourceLocation var1) {
      ResourceLocation var4 = new ResourceLocation(var1.getNamespace(), "structures/" + var1.getPath() + ".nbt");

      try (Class1783 var5 = this.field39444.method580(var4)) {
         return this.method31608(var5.method7763());
      } catch (FileNotFoundException var20) {
         return null;
      } catch (Throwable var21) {
         field39441.error("Couldn't load structure {}: {}", var1, var21.toString());
         return null;
      }
   }

   @Nullable
   private Class8969 method31607(ResourceLocation var1) {
      if (!this.field39445.toFile().isDirectory()) {
         return null;
      } else {
         Path var4 = this.method31612(var1, ".nbt");

         try (FileInputStream var5 = new FileInputStream(var4.toFile())) {
            return this.method31608(var5);
         } catch (FileNotFoundException var20) {
            return null;
         } catch (IOException var21) {
            field39441.error("Couldn't load structure from {}", var4, var21);
            return null;
         }
      }
   }

   private Class8969 method31608(InputStream var1) throws IOException {
      CompoundNBT var4 = CompressedStreamTools.readCompressed(var1);
      return this.method31609(var4);
   }

   public Class8969 method31609(CompoundNBT var1) {
      if (!var1.contains("DataVersion", 99)) {
         var1.putInt("DataVersion", 500);
      }

      Class8969 var4 = new Class8969();
      var4.method32913(Class8354.method29289(this.field39443, Class2108.field13753, var1, var1.getInt("DataVersion")));
      return var4;
   }

   public boolean method31610(ResourceLocation var1) {
      Class8969 var4 = this.field39442.get(var1);
      if (var4 == null) {
         return false;
      } else {
         Path var5 = this.method31612(var1, ".nbt");
         Path var6 = var5.getParent();
         if (var6 == null) {
            return false;
         } else {
            try {
               Files.createDirectories(Files.exists(var6) ? var6.toRealPath() : var6);
            } catch (IOException var22) {
               field39441.error("Failed to create parent directory: {}", var6);
               return false;
            }

            CompoundNBT var7 = var4.method32912(new CompoundNBT());

            try (FileOutputStream var8 = new FileOutputStream(var5.toFile())) {
               CompressedStreamTools.writeCompressed(var7, var8);
               return true;
            } catch (Throwable var24) {
               return false;
            }
         }
      }
   }

   public Path method31611(ResourceLocation var1, String var2) {
      try {
         Path var5 = this.field39445.resolve(var1.getNamespace());
         Path var6 = var5.resolve("structures");
         return Class8950.method32698(var6, var1.getPath(), var2);
      } catch (InvalidPathException var7) {
         throw new Class2496("Invalid resource path: " + var1, var7);
      }
   }

   private Path method31612(ResourceLocation var1, String var2) {
      if (!var1.getPath().contains("//")) {
         Path var5 = this.method31611(var1, var2);
         if (var5.startsWith(this.field39445) && Class8950.method32696(var5) && Class8950.method32697(var5)) {
            return var5;
         } else {
            throw new Class2496("Invalid resource path: " + var5);
         }
      } else {
         throw new Class2496("Invalid resource path: " + var1);
      }
   }

   public void method31613(ResourceLocation var1) {
      this.field39442.remove(var1);
   }
}
