package mapped;

import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import net.minecraft.util.ResourceLocation;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.util.function.Predicate;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class Class311 extends Class308 {
   public static final Splitter field1201 = Splitter.on('/').omitEmptyStrings().limit(3);
   private ZipFile field1202;

   public Class311(File var1) {
      super(var1);
   }

   private ZipFile method1261() throws IOException {
      if (this.field1202 == null) {
         this.field1202 = new ZipFile(this.field1197);
      }

      return this.field1202;
   }

   @Override
   public InputStream method1254(String var1) throws IOException {
      ZipFile var4 = this.method1261();
      ZipEntry var5 = var4.getEntry(var1);
      if (var5 != null) {
         return var4.getInputStream(var5);
      } else {
         throw new Class2456(this.field1197, var1);
      }
   }

   @Override
   public boolean method1255(String var1) {
      try {
         return this.method1261().getEntry(var1) != null;
      } catch (IOException var5) {
         return false;
      }
   }

   @Override
   public Set<String> method1226(ResourcePackType var1) {
      ZipFile var4;
      try {
         var4 = this.method1261();
      } catch (IOException var11) {
         return Collections.<String>emptySet();
      }

      Enumeration var5 = var4.entries();
      HashSet var6 = Sets.newHashSet();

      while (var5.hasMoreElements()) {
         ZipEntry var7 = (ZipEntry)var5.nextElement();
         String var8 = var7.getName();
         if (var8.startsWith(var1.getDirectoryName() + "/")) {
            ArrayList var9 = Lists.newArrayList(field1201.split(var8));
            if (var9.size() > 1) {
               String var10 = (String)var9.get(1);
               if (var10.equals(var10.toLowerCase(Locale.ROOT))) {
                  var6.add(var10);
               } else {
                  this.method1256(var10);
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
      if (this.field1202 != null) {
         IOUtils.closeQuietly(this.field1202);
         this.field1202 = null;
      }
   }

   @Override
   public Collection<ResourceLocation> method1224(ResourcePackType var1, String var2, String var3, int var4, Predicate<String> var5) {
      ZipFile var8;
      try {
         var8 = this.method1261();
      } catch (IOException var17) {
         return Collections.<ResourceLocation>emptySet();
      }

      Enumeration var9 = var8.entries();
      ArrayList var10 = Lists.newArrayList();
      String var11 = var1.getDirectoryName() + "/" + var2 + "/";
      String var12 = var11 + var3 + "/";

      while (var9.hasMoreElements()) {
         ZipEntry var13 = (ZipEntry)var9.nextElement();
         if (!var13.isDirectory()) {
            String var14 = var13.getName();
            if (!var14.endsWith(".mcmeta") && var14.startsWith(var12)) {
               String var15 = var14.substring(var11.length());
               String[] var16 = var15.split("/");
               if (var16.length >= var4 + 1 && var5.test(var16[var16.length - 1])) {
                  var10.add(new ResourceLocation(var2, var15));
               }
            }
         }
      }

      return var10;
   }
}
