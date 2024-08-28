package mapped;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class Class4672 implements Class4671 {
   public File field22240;

   public Class4672(String var1, File var2) {
      this.field22240 = var2;
   }

   @Override
   public void method14638() {
   }

   @Override
   public InputStream method14639(String var1) {
      try {
         String var4 = Class9402.method35772(var1, "/", "/");
         File var5 = new File(this.field22240, var4);
         return !var5.exists() ? null : new BufferedInputStream(new FileInputStream(var5));
      } catch (Exception var6) {
         return null;
      }
   }

   @Override
   public boolean method14640(String var1) {
      File var4 = new File(this.field22240, var1.substring(1));
      return var4.exists() ? var4.isDirectory() : false;
   }

   @Override
   public String method14641() {
      return this.field22240.getName();
   }
}
