package remapped;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public final class class_5745 implements class_6112 {
   @Override
   public class_5322 method_28081(File var1) throws FileNotFoundException {
      return class_1259.method_5665(var1);
   }

   @Override
   public class_4131 method_28079(File var1) throws FileNotFoundException {
      try {
         return class_1259.method_5659(var1);
      } catch (FileNotFoundException var5) {
         var1.getParentFile().mkdirs();
         return class_1259.method_5659(var1);
      }
   }

   @Override
   public class_4131 method_28077(File var1) throws FileNotFoundException {
      try {
         return class_1259.method_5672(var1);
      } catch (FileNotFoundException var5) {
         var1.getParentFile().mkdirs();
         return class_1259.method_5672(var1);
      }
   }

   @Override
   public void method_28078(File var1) throws IOException {
      if (!var1.delete() && var1.exists()) {
         throw new IOException("failed to delete " + var1);
      }
   }

   @Override
   public boolean method_28075(File var1) {
      return var1.exists();
   }

   @Override
   public long method_28076(File var1) {
      return var1.length();
   }

   @Override
   public void method_28080(File var1, File var2) throws IOException {
      this.method_28078(var2);
      if (!var1.renameTo(var2)) {
         throw new IOException("failed to rename " + var1 + " to " + var2);
      }
   }

   @Override
   public void method_28074(File var1) throws IOException {
      File[] var4 = var1.listFiles();
      if (var4 != null) {
         for (File var8 : var4) {
            if (var8.isDirectory()) {
               this.method_28074(var8);
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
