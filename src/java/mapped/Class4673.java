package mapped;

import com.google.common.base.Joiner;
import net.optifine.Config;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Enumeration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class Class4673 implements Class4671 {
   public File field22241;
   public ZipFile field22242;
   public String field22243;

   public Class4673(String var1, File var2) {
      this.field22241 = var2;
      this.field22242 = null;
      this.field22243 = "";
   }

   @Override
   public void method14638() {
      if (this.field22242 != null) {
         try {
            this.field22242.close();
         } catch (Exception var4) {
         }

         this.field22242 = null;
      }
   }

   @Override
   public InputStream method14639(String var1) {
      try {
         if (this.field22242 == null) {
            this.field22242 = new ZipFile(this.field22241);
            this.field22243 = this.method14643(this.field22242);
         }

         String var4 = Class9402.method35762(var1, "/");
         if (var4.contains("..")) {
            var4 = this.method14642(var4);
         }

         ZipEntry var5 = this.field22242.getEntry(this.field22243 + var4);
         return var5 == null ? null : this.field22242.getInputStream(var5);
      } catch (Exception var6) {
         return null;
      }
   }

   private String method14642(String var1) {
      ArrayDeque var4 = new ArrayDeque();
      String[] var5 = Config.method26903(var1, "/");

      for (int var6 = 0; var6 < var5.length; var6++) {
         String var7 = var5[var6];
         if (!var7.equals("..")) {
            var4.add(var7);
         } else {
            if (var4.isEmpty()) {
               return "";
            }

            var4.removeLast();
         }
      }

      return Joiner.on('/').join(var4);
   }

   private String method14643(ZipFile var1) {
      ZipEntry var4 = var1.getEntry("shaders/");
      if (var4 != null && var4.isDirectory()) {
         return "";
      } else {
         Pattern var5 = Pattern.compile("([^/]+/)shaders/");
         Enumeration var6 = var1.entries();

         while (var6.hasMoreElements()) {
            ZipEntry var7 = (ZipEntry)var6.nextElement();
            String var8 = var7.getName();
            Matcher var9 = var5.matcher(var8);
            if (var9.matches()) {
               String var10 = var9.group(1);
               if (var10 != null) {
                  if (!var10.equals("shaders/")) {
                     return var10;
                  }

                  return "";
               }
            }
         }

         return "";
      }
   }

   @Override
   public boolean method14640(String var1) {
      try {
         if (this.field22242 == null) {
            this.field22242 = new ZipFile(this.field22241);
            this.field22243 = this.method14643(this.field22242);
         }

         String var4 = Class9402.method35762(var1, "/");
         ZipEntry var5 = this.field22242.getEntry(this.field22243 + var4);
         return var5 != null;
      } catch (IOException var6) {
         return false;
      }
   }

   @Override
   public String method14641() {
      return this.field22241.getName();
   }
}
