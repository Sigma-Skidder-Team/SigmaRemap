package remapped;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.FileSystem;
import java.nio.file.FileSystemNotFoundException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_599 implements class_8169 {
   public static Path field_3445;
   private static final Logger field_3446 = LogManager.getLogger();
   public static Class<?> field_3442;
   private static final Map<class_3168, FileSystem> field_3447 = Util.<Map<class_3168, FileSystem>>method_44659(Maps.newHashMap(), var0 -> {
      synchronized (class_599.class) {
         for (class_3168 var7 : class_3168.values()) {
            URL var8 = class_599.class.getResource("/" + var7.method_14619() + "/.mcassetsroot");

            try {
               URI var9 = var8.toURI();
               if ("jar".equals(var9.getScheme())) {
                  FileSystem var10;
                  try {
                     var10 = FileSystems.getFileSystem(var9);
                  } catch (FileSystemNotFoundException var13) {
                     var10 = FileSystems.newFileSystem(var9, Collections.emptyMap());
                  }

                  var0.put(var7, var10);
               }
            } catch (IOException | URISyntaxException var14) {
               field_3446.error("Couldn't get a list of all vanilla resources", var14);
            }
         }
      }
   });
   public final Set<String> field_3444;
   private static final boolean field_3441 = Util.getOperatingSystem() == OperatingSystem.WINDOWS;
   private static final boolean field_3443 = class_7860.field_40161.method_45472();

   public class_599(String... var1) {
      this.field_3444 = ImmutableSet.copyOf(var1);
   }

   public InputStream 㢸聛䬾뗴缰鼒(String var1) throws IOException {
      if (!var1.contains("/") && !var1.contains("\\")) {
         if (field_3445 != null) {
            Path var4 = field_3445.resolve(var1);
            if (Files.exists(var4)) {
               return Files.newInputStream(var4);
            }
         }

         return this.method_2811(var1);
      } else {
         throw new IllegalArgumentException("Root resources can only be filenames, not paths (no / allowed!)");
      }
   }

   public InputStream 䴂쬫ಽ䩉㐖쬫(class_3168 var1, Identifier var2) throws IOException {
      InputStream var5 = this.method_2812(var1, var2);
      if (var5 == null) {
         throw new FileNotFoundException(var2.method_21456());
      } else {
         return var5;
      }
   }

   public Collection<Identifier> ศ哝呓뎫顸瀳(class_3168 var1, String var2, String var3, int var4, Predicate<String> var5) {
      HashSet var8 = Sets.newHashSet();
      if (field_3445 != null) {
         try {
            method_2806(var8, var4, var2, field_3445.resolve(var1.method_14619()), var3, var5);
         } catch (IOException var17) {
         }

         if (var1 == class_3168.field_15844) {
            Enumeration var9 = null;

            try {
               var9 = field_3442.getClassLoader().getResources(var1.method_14619() + "/");
            } catch (IOException var16) {
            }

            while (var9 != null && var9.hasMoreElements()) {
               try {
                  URI var10 = ((URL)var9.nextElement()).toURI();
                  if ("file".equals(var10.getScheme())) {
                     method_2806(var8, var4, var2, Paths.get(var10), var3, var5);
                  }
               } catch (IOException | URISyntaxException var15) {
               }
            }
         }
      }

      try {
         URL var18 = class_599.class.getResource("/" + var1.method_14619() + "/.mcassetsroot");
         if (var18 == null) {
            field_3446.error("Couldn't find .mcassetsroot, cannot load vanilla resources");
            return var8;
         }

         URI var19 = var18.toURI();
         if ("file".equals(var19.getScheme())) {
            URL var11 = new URL(var18.toString().substring(0, var18.toString().length() - ".mcassetsroot".length()));
            Path var12 = Paths.get(var11.toURI());
            method_2806(var8, var4, var2, var12, var3, var5);
         } else if ("jar".equals(var19.getScheme())) {
            Path var20 = field_3447.get(var1).getPath("/" + var1.method_14619());
            method_2806(var8, var4, "minecraft", var20, var3, var5);
         } else {
            field_3446.error("Unsupported scheme {} trying to list vanilla resources (NYI?)", var19);
         }
      } catch (NoSuchFileException | FileNotFoundException var13) {
      } catch (IOException | URISyntaxException var14) {
         field_3446.error("Couldn't get a list of all vanilla resources", var14);
      }

      return var8;
   }

   private static void method_2806(Collection<Identifier> var0, int var1, String var2, Path var3, String var4, Predicate<String> var5) throws IOException {
      Path var8 = var3.resolve(var2);

      try (Stream var9 = Files.walk(var8.resolve(var4), var1)) {
         var9.filter(var1x -> !var1x.endsWith(".mcmeta") && Files.isRegularFile(var1x) && var5.test(var1x.getFileName().toString()))
            .<Identifier>map(var2x -> new Identifier(var2, var8.relativize(var2x).toString().replaceAll("\\\\", "/")))
            .forEach(var0::add);
      }
   }

   @Nullable
   public InputStream method_2812(class_3168 var1, Identifier var2) {
      String var5 = method_2808(var1, var2);
      InputStream var6 = class_8835.method_40637(var5);
      if (var6 != null) {
         return var6;
      } else {
         if (field_3445 != null) {
            Path var7 = field_3445.resolve(var1.method_14619() + "/" + var2.method_21461() + "/" + var2.method_21456());
            if (Files.exists(var7)) {
               try {
                  return Files.newInputStream(var7);
               } catch (IOException var10) {
               }
            }
         }

         try {
            URL var11 = class_599.class.getResource(var5);
            return method_2809(var5, var11) ? (field_3443 ? this.method_2807(var1, var5) : var11.openStream()) : null;
         } catch (IOException var9) {
            return class_599.class.getResourceAsStream(var5);
         }
      }
   }

   private static String method_2808(class_3168 var0, Identifier var1) {
      return "/" + var0.method_14619() + "/" + var1.method_21461() + "/" + var1.method_21456();
   }

   private static boolean method_2809(String var0, URL var1) throws IOException {
      return var1 != null && (var1.getProtocol().equals("jar") || method_2810(new File(var1.getFile()), var0));
   }

   @Nullable
   public InputStream method_2811(String var1) {
      return !field_3443 ? class_599.class.getResourceAsStream("/" + var1) : this.method_2807(class_3168.field_15843, "/" + var1);
   }

   public boolean 郝䡸㹔柿Ꮺ쟗(class_3168 var1, Identifier var2) {
      String var5 = method_2808(var1, var2);
      InputStream var6 = class_8835.method_40637(var5);
      if (var6 != null) {
         return true;
      } else {
         if (field_3445 != null) {
            Path var7 = field_3445.resolve(var1.method_14619() + "/" + var2.method_21461() + "/" + var2.method_21456());
            if (Files.exists(var7)) {
               return true;
            }
         }

         try {
            URL var9 = class_599.class.getResource(var5);
            return method_2809(var5, var9);
         } catch (IOException var8) {
            return false;
         }
      }
   }

   public Set<String> 쇽亟硙괠属室(class_3168 var1) {
      return this.field_3444;
   }

   @Nullable
   public <T> T 웨室殢ใ藸褕(class_6146<T> var1) throws IOException {
      try (InputStream var4 = this.㢸聛䬾뗴缰鼒("pack.mcmeta")) {
         return class_3736.<T>method_17307(var1, var4);
      } catch (FileNotFoundException | RuntimeException var18) {
         return null;
      }
   }

   public String 콵樽웎柿㥇竁() {
      return "Default";
   }

   @Override
   public void close() {
   }

   private static boolean method_2810(File var0, String var1) throws IOException {
      String var4 = var0.getPath();
      if (!var4.startsWith("file:")) {
         return class_4968.method_22826(var0, var1);
      } else {
         if (field_3441) {
            var4 = var4.replace("\\", "/");
         }

         return var4.endsWith(var1);
      }
   }

   private InputStream method_2807(class_3168 var1, String var2) {
      try {
         FileSystem var5 = field_3447.get(var1);
         return var5 != null ? Files.newInputStream(var5.getPath(var2)) : class_599.class.getResourceAsStream(var2);
      } catch (IOException var6) {
         return class_599.class.getResourceAsStream(var2);
      }
   }
}
