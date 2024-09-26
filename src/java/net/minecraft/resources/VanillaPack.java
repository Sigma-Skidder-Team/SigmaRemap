package net.minecraft.resources;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import mapped.*;
import net.minecraft.client.util.Util;
import net.minecraft.resources.data.IMetadataSectionSerializer;
import net.minecraft.util.ResourceLocation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nullable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.*;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Stream;

import static net.minecraft.world.World.LOGGER;

public class VanillaPack implements IResourcePack {
   public static Path field1188;
   private static final Logger field1189 = LogManager.getLogger();
   public static Class<?> field1190;
   private static final Map<ResourcePackType, FileSystem> FILE_SYSTEMS_BY_PACK_TYPE = Util.make(Maps.newHashMap(), (p_lambda$static$0_0_) ->
   {
      synchronized (VanillaPack.class)
      {
         for (ResourcePackType resourcepacktype : ResourcePackType.values())
         {
            URL url = VanillaPack.class.getResource("/" + resourcepacktype.getDirectoryName() + "/.mcassetsroot");

            try
            {
               URI uri = url.toURI();

               if ("jar".equals(uri.getScheme()))
               {
                  FileSystem filesystem;

                  try
                  {
                     filesystem = FileSystems.getFileSystem(uri);
                  }
                  catch (FileSystemNotFoundException filesystemnotfoundexception)
                  {
                     filesystem = FileSystems.newFileSystem(uri, Collections.emptyMap());
                  }

                  p_lambda$static$0_0_.put(resourcepacktype, filesystem);
               }
            }
            catch (URISyntaxException | IOException ioexception)
            {
               LOGGER.error("Couldn't get a list of all vanilla resources", (Throwable)ioexception);
            }
         }
      }
   });
   public final Set<String> resourceNamespaces;
   private static final boolean field1193 = Util.getOSType() == OS.WINDOWS;
   private static final boolean field1194 = Reflector.field42864.method20245();

   public VanillaPack(String... resourceNamespacesIn)
   {
      this.resourceNamespaces = ImmutableSet.copyOf(resourceNamespacesIn);
   }

   @Override
   public InputStream getRootResourceStream(String var1) throws IOException {
      if (!var1.contains("/") && !var1.contains("\\")) {
         if (field1188 != null) {
            Path var4 = field1188.resolve(var1);
            if (Files.exists(var4)) {
               return Files.newInputStream(var4);
            }
         }

         return this.getInputStreamVanilla(var1);
      } else {
         throw new IllegalArgumentException("Root resources can only be filenames, not paths (no / allowed!)");
      }
   }

   @Override
   public InputStream getResourceStream(ResourcePackType var1, ResourceLocation var2) throws IOException {
      InputStream var5 = this.getInputStreamVanilla(var1, var2);
      if (var5 == null) {
         throw new FileNotFoundException(var2.getPath());
      } else {
         return var5;
      }
   }

   @Override
   public Collection<ResourceLocation> getAllResourceLocations(ResourcePackType var1, String var2, String var3, int var4, Predicate<String> var5) {
      HashSet var8 = Sets.newHashSet();
      if (field1188 != null) {
         try {
            method1242(var8, var4, var2, field1188.resolve(var1.getDirectoryName()), var3, var5);
         } catch (IOException var17) {
         }

         if (var1 == ResourcePackType.CLIENT_RESOURCES) {
            Enumeration var9 = null;

            try {
               var9 = field1190.getClassLoader().getResources(var1.getDirectoryName() + "/");
            } catch (IOException var16) {
            }

            while (var9 != null && var9.hasMoreElements()) {
               try {
                  URI var10 = ((URL)var9.nextElement()).toURI();
                  if ("file".equals(var10.getScheme())) {
                     method1242(var8, var4, var2, Paths.get(var10), var3, var5);
                  }
               } catch (IOException | URISyntaxException var15) {
               }
            }
         }
      }

      try {
         URL var18 = VanillaPack.class.getResource("/" + var1.getDirectoryName() + "/.mcassetsroot");
         if (var18 == null) {
            field1189.error("Couldn't find .mcassetsroot, cannot load vanilla resources");
            return var8;
         }

         URI var19 = var18.toURI();
         if ("file".equals(var19.getScheme())) {
            URL var11 = new URL(var18.toString().substring(0, var18.toString().length() - ".mcassetsroot".length()));
            Path var12 = Paths.get(var11.toURI());
            method1242(var8, var4, var2, var12, var3, var5);
         } else if ("jar".equals(var19.getScheme())) {
            Path var20 = FILE_SYSTEMS_BY_PACK_TYPE.get(var1).getPath("/" + var1.getDirectoryName());
            method1242(var8, var4, "minecraft", var20, var3, var5);
         } else {
            field1189.error("Unsupported scheme {} trying to list vanilla resources (NYI?)", var19);
         }
      } catch (NoSuchFileException | FileNotFoundException var13) {
      } catch (IOException | URISyntaxException var14) {
         field1189.error("Couldn't get a list of all vanilla resources", var14);
      }

      return var8;
   }

   private static void method1242(Collection<ResourceLocation> var0, int var1, String var2, Path var3, String var4, Predicate<String> var5) throws IOException {
      Path var8 = var3.resolve(var2);

      try (Stream<Path> var9 = Files.walk(var8.resolve(var4), var1)) {
         var9.filter(var1x -> !var1x.endsWith(".mcmeta") && Files.isRegularFile(var1x) && var5.test(var1x.getFileName().toString()))
            .map(var2x -> new ResourceLocation(var2, var8.relativize(var2x).toString().replaceAll("\\\\", "/")))
            .forEach(var0::add);
      }
   }

   @Nullable
   public InputStream getInputStreamVanilla(ResourcePackType var1, ResourceLocation var2) {
      String var5 = method1244(var1, var2);
      InputStream var6 = Class9561.method37043(var5);
      if (var6 != null) {
         return var6;
      } else {
         if (field1188 != null) {
            Path var7 = field1188.resolve(var1.getDirectoryName() + "/" + var2.getNamespace() + "/" + var2.getPath());
            if (Files.exists(var7)) {
               try {
                  return Files.newInputStream(var7);
               } catch (IOException var10) {
               }
            }
         }

         try {
            URL var11 = VanillaPack.class.getResource(var5);
            return method1245(var5, var11) ? (field1194 ? this.method1248(var1, var5) : var11.openStream()) : null;
         } catch (IOException var9) {
            return VanillaPack.class.getResourceAsStream(var5);
         }
      }
   }

   private static String method1244(ResourcePackType var0, ResourceLocation var1) {
      return "/" + var0.getDirectoryName() + "/" + var1.getNamespace() + "/" + var1.getPath();
   }

   private static boolean method1245(String var0, URL var1) throws IOException {
      return var1 != null && (var1.getProtocol().equals("jar") || method1247(new File(var1.getFile()), var0));
   }

   @Nullable
   public InputStream getInputStreamVanilla(String var1) {
      return !field1194 ? VanillaPack.class.getResourceAsStream("/" + var1) : this.method1248(ResourcePackType.SERVER_DATA, "/" + var1);
   }

   @Override
   public boolean resourceExists(ResourcePackType var1, ResourceLocation var2) {
      String var5 = method1244(var1, var2);
      InputStream var6 = Class9561.method37043(var5);
      if (var6 != null) {
         return true;
      } else {
         if (field1188 != null) {
            Path var7 = field1188.resolve(var1.getDirectoryName() + "/" + var2.getNamespace() + "/" + var2.getPath());
            if (Files.exists(var7)) {
               return true;
            }
         }

         try {
            URL var9 = VanillaPack.class.getResource(var5);
            return method1245(var5, var9);
         } catch (IOException var8) {
            return false;
         }
      }
   }

   @Override
   public Set<String> getResourceNamespaces(ResourcePackType var1) {
      return this.resourceNamespaces;
   }

   @Nullable
   @Override
   public <T> T getMetadata(IMetadataSectionSerializer<T> var1) throws IOException {
      try (InputStream var4 = this.getRootResourceStream("pack.mcmeta")) {
         return ResourcePack.<T>method1257(var1, var4);
      } catch (FileNotFoundException | RuntimeException var18) {
         return null;
      }
   }

   @Override
   public String getName() {
      return "Default";
   }

   @Override
   public void close() {
   }

   private static boolean method1247(File var0, String var1) throws IOException {
      String var4 = var0.getPath();
      if (!var4.startsWith("file:")) {
         return Class309.method1258(var0, var1);
      } else {
         if (field1193) {
            var4 = var4.replace("\\", "/");
         }

         return var4.endsWith(var1);
      }
   }

   private InputStream method1248(ResourcePackType var1, String var2) {
      try {
         FileSystem var5 = FILE_SYSTEMS_BY_PACK_TYPE.get(var1);
         return var5 != null ? Files.newInputStream(var5.getPath(var2)) : VanillaPack.class.getResourceAsStream(var2);
      } catch (IOException var6) {
         return VanillaPack.class.getResourceAsStream(var2);
      }
   }
}
