package remapped;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class class_1639 implements class_8591 {
   public File field_8525;

   public class_1639(String var1, File var2) {
      this.field_8525 = var2;
   }

   @Override
   public void method_39508() {
   }

   @Override
   public InputStream method_39505(String var1) {
      try {
         String var4 = class_8251.method_37819(var1, "/", "/");
         File var5 = new File(this.field_8525, var4);
         return !var5.exists() ? null : new BufferedInputStream(new FileInputStream(var5));
      } catch (Exception var6) {
         return null;
      }
   }

   @Override
   public boolean method_39506(String var1) {
      File var4 = new File(this.field_8525, var1.substring(1));
      return var4.exists() ? var4.isDirectory() : false;
   }

   @Override
   public String method_39507() {
      return this.field_8525.getName();
   }
}
