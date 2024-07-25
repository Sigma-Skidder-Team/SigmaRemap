package remapped;

import com.google.common.base.CharMatcher;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.apache.commons.io.filefilter.DirectoryFileFilter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_4968 extends class_3736 {
   private static final Logger field_25724 = LogManager.getLogger();
   private static final boolean field_25723 = Util.getOperatingSystem() == OperatingSystem.WINDOWS;
   private static final CharMatcher field_25726 = CharMatcher.is('\\');

   public class_4968(File var1) {
      super(var1);
   }

   public static boolean method_22826(File var0, String var1) throws IOException {
      String var4 = var0.getCanonicalPath();
      if (field_25723) {
         var4 = field_25726.replaceFrom(var4, '/');
      }

      return var4.endsWith(var1);
   }

   @Override
   public InputStream method_17304(String var1) throws IOException {
      File var4 = this.method_22825(var1);
      if (var4 != null) {
         return new FileInputStream(var4);
      } else {
         throw new class_394(this.field_18260, var1);
      }
   }

   @Override
   public boolean method_17308(String var1) {
      return this.method_22825(var1) != null;
   }

   @Nullable
   private File method_22825(String var1) {
      try {
         File var4 = new File(this.field_18260, var1);
         if (var4.isFile() && method_22826(var4, var1)) {
            return var4;
         }
      } catch (IOException var5) {
      }

      return null;
   }

   public Set<String> 쇽亟硙괠属室(class_3168 var1) {
      HashSet var4 = Sets.newHashSet();
      File var5 = new File(this.field_18260, var1.method_14619());
      File[] var6 = var5.listFiles(DirectoryFileFilter.DIRECTORY);
      if (var6 != null) {
         for (File var10 : var6) {
            String var11 = method_17309(var5, var10);
            if (!var11.equals(var11.toLowerCase(Locale.ROOT))) {
               this.method_17306(var11);
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

   public Collection<class_4639> ศ哝呓뎫顸瀳(class_3168 var1, String var2, String var3, int var4, Predicate<String> var5) {
      File var8 = new File(this.field_18260, var1.method_14619());
      ArrayList var9 = Lists.newArrayList();
      this.method_22827(new File(new File(var8, var2), var3), var4, var2, var9, var3 + "/", var5);
      return var9;
   }

   private void method_22827(File var1, int var2, String var3, List<class_4639> var4, String var5, Predicate<String> var6) {
      File[] var9 = var1.listFiles();
      if (var9 != null) {
         for (File var13 : var9) {
            if (var13.isDirectory()) {
               if (var2 > 0) {
                  this.method_22827(var13, var2 - 1, var3, var4, var5 + var13.getName() + "/", var6);
               }
            } else if (!var13.getName().endsWith(".mcmeta") && var6.test(var13.getName())) {
               try {
                  var4.add(new class_4639(var3, var5 + var13.getName()));
               } catch (class_7485 var15) {
                  field_25724.error(var15.getMessage());
               }
            }
         }
      }
   }
}
