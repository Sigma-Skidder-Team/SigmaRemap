package remapped;

import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.function.Predicate;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.apache.commons.io.IOUtils;

public class class_2140 extends class_3736 {
   public static final Splitter field_10725 = Splitter.on('/').omitEmptyStrings().limit(3);
   private ZipFile field_10724;

   public class_2140(File var1) {
      super(var1);
   }

   private ZipFile method_9999() throws IOException {
      if (this.field_10724 == null) {
         this.field_10724 = new ZipFile(this.field_18260);
      }

      return this.field_10724;
   }

   @Override
   public InputStream method_17304(String var1) throws IOException {
      ZipFile var4 = this.method_9999();
      ZipEntry var5 = var4.getEntry(var1);
      if (var5 != null) {
         return var4.getInputStream(var5);
      } else {
         throw new class_394(this.field_18260, var1);
      }
   }

   @Override
   public boolean method_17308(String var1) {
      try {
         return this.method_9999().getEntry(var1) != null;
      } catch (IOException var5) {
         return false;
      }
   }

   public Set<String> 쇽亟硙괠属室(class_3168 var1) {
      ZipFile var4;
      try {
         var4 = this.method_9999();
      } catch (IOException var11) {
         return Collections.<String>emptySet();
      }

      Enumeration var5 = var4.entries();
      HashSet var6 = Sets.newHashSet();

      while (var5.hasMoreElements()) {
         ZipEntry var7 = (ZipEntry)var5.nextElement();
         String var8 = var7.getName();
         if (var8.startsWith(var1.method_14619() + "/")) {
            ArrayList var9 = Lists.newArrayList(field_10725.split(var8));
            if (var9.size() > 1) {
               String var10 = (String)var9.get(1);
               if (var10.equals(var10.toLowerCase(Locale.ROOT))) {
                  var6.add(var10);
               } else {
                  this.method_17306(var10);
               }
            }
         }
      }

      return var6;
   }

   @Override
   public void finalize() throws Throwable {
      this.close();
      super.finalize();
   }

   @Override
   public void close() {
      if (this.field_10724 != null) {
         IOUtils.closeQuietly(this.field_10724);
         this.field_10724 = null;
      }
   }

   public Collection<Identifier> ศ哝呓뎫顸瀳(class_3168 var1, String var2, String var3, int var4, Predicate<String> var5) {
      ZipFile var8;
      try {
         var8 = this.method_9999();
      } catch (IOException var17) {
         return Collections.<Identifier>emptySet();
      }

      Enumeration var9 = var8.entries();
      ArrayList var10 = Lists.newArrayList();
      String var11 = var1.method_14619() + "/" + var2 + "/";
      String var12 = var11 + var3 + "/";

      while (var9.hasMoreElements()) {
         ZipEntry var13 = (ZipEntry)var9.nextElement();
         if (!var13.isDirectory()) {
            String var14 = var13.getName();
            if (!var14.endsWith(".mcmeta") && var14.startsWith(var12)) {
               String var15 = var14.substring(var11.length());
               String[] var16 = var15.split("/");
               if (var16.length >= var4 + 1 && var5.test(var16[var16.length - 1])) {
                  var10.add(new Identifier(var2, var15));
               }
            }
         }
      }

      return var10;
   }
}
