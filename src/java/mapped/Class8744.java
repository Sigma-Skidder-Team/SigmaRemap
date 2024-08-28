package mapped;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public final class Class8744 implements Class8745 {
   @Override
   public Class1737 method31547(File var1) throws FileNotFoundException {
      return Class7001.method21703(var1);
   }

   @Override
   public Class1716 method31548(File var1) throws FileNotFoundException {
      try {
         return Class7001.method21705(var1);
      } catch (FileNotFoundException var5) {
         var1.getParentFile().mkdirs();
         return Class7001.method21705(var1);
      }
   }

   @Override
   public Class1716 method31549(File var1) throws FileNotFoundException {
      try {
         return Class7001.method21706(var1);
      } catch (FileNotFoundException var5) {
         var1.getParentFile().mkdirs();
         return Class7001.method21706(var1);
      }
   }

   @Override
   public void method31550(File var1) throws IOException {
      if (!var1.delete() && var1.exists()) {
         throw new IOException("failed to delete " + var1);
      }
   }

   @Override
   public boolean method31551(File var1) {
      return var1.exists();
   }

   @Override
   public long method31552(File var1) {
      return var1.length();
   }

   @Override
   public void method31553(File var1, File var2) throws IOException {
      this.method31550(var2);
      if (!var1.renameTo(var2)) {
         throw new IOException("failed to rename " + var1 + " to " + var2);
      }
   }

   @Override
   public void method31554(File var1) throws IOException {
      File[] var4 = var1.listFiles();
      if (var4 != null) {
         for (File var8 : var4) {
            if (var8.isDirectory()) {
               this.method31554(var8);
            }

            if (!var8.delete()) {
               throw new IOException("failed to delete " + var8);
            }
         }
      } else {
         throw new IOException("not a readable directory: " + var1);
      }
   }
}
