package mapped;

import com.google.common.base.CharMatcher;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import org.apache.commons.io.filefilter.DirectoryFileFilter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nullable;
import java.io.*;
import java.util.*;
import java.util.function.Predicate;

public class Class309 extends Class308 {
   private static final Logger field1198 = LogManager.getLogger();
   private static final boolean field1199 = Util.getOSType() == OS.WINDOWS;
   private static final CharMatcher field1200 = CharMatcher.is('\\');

   public Class309(File var1) {
      super(var1);
   }

   public static boolean method1258(File var0, String var1) throws IOException {
      String var4 = var0.getCanonicalPath();
      if (field1199) {
         var4 = field1200.replaceFrom(var4, '/');
      }

      return var4.endsWith(var1);
   }

   @Override
   public InputStream method1254(String var1) throws IOException {
      File var4 = this.method1259(var1);
      if (var4 != null) {
         return new FileInputStream(var4);
      } else {
         throw new Class2456(this.field1197, var1);
      }
   }

   @Override
   public boolean method1255(String var1) {
      return this.method1259(var1) != null;
   }

   @Nullable
   private File method1259(String var1) {
      try {
         File var4 = new File(this.field1197, var1);
         if (var4.isFile() && method1258(var4, var1)) {
            return var4;
         }
      } catch (IOException var5) {
      }

      return null;
   }

   @Override
   public Set<String> method1226(Class1946 var1) {
      Set<String> var4 = Sets.newHashSet();
      File var5 = new File(this.field1197, var1.method8205());
      File[] var6 = var5.listFiles((FileFilter) DirectoryFileFilter.DIRECTORY);
      if (var6 != null) {
         for (File var10 : var6) {
            String var11 = method1253(var5, var10);
            if (!var11.equals(var11.toLowerCase(Locale.ROOT))) {
               this.method1256(var11);
            } else {
               var4.add(var11.substring(0, var11.length() - 1));
            }
         }
      }

      return var4;
   }

   @Override
   public void close() {
   }

   @Override
   public Collection<ResourceLocation> method1224(Class1946 var1, String var2, String var3, int var4, Predicate<String> var5) {
      File var8 = new File(this.field1197, var1.method8205());
      ArrayList var9 = Lists.newArrayList();
      this.method1260(new File(new File(var8, var2), var3), var4, var2, var9, var3 + "/", var5);
      return var9;
   }

   private void method1260(File var1, int var2, String var3, List<ResourceLocation> var4, String var5, Predicate<String> var6) {
      File[] var9 = var1.listFiles();
      if (var9 != null) {
         for (File var13 : var9) {
            if (var13.isDirectory()) {
               if (var2 > 0) {
                  this.method1260(var13, var2 - 1, var3, var4, var5 + var13.getName() + "/", var6);
               }
            } else if (!var13.getName().endsWith(".mcmeta") && var6.test(var13.getName())) {
               try {
                  var4.add(new ResourceLocation(var3, var5 + var13.getName()));
               } catch (Class2496 var15) {
                  field1198.error(var15.getMessage());
               }
            }
         }
      }
   }
}
