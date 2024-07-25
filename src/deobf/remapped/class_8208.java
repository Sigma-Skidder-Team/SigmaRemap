package remapped;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import org.apache.commons.io.IOUtils;

public enum class_8208 {
   field_41988,
   field_41986,
   field_41987,
   field_41983,
   field_41985;

   private class_8208() {
   }

   public void method_37577(URL var1) {
      try {
         Process var4 = AccessController.<Process>doPrivileged((PrivilegedExceptionAction<Process>)(() -> Runtime.getRuntime().exec(this.method_37580(var1))));

         for (String var6 : IOUtils.readLines(var4.getErrorStream())) {
            class_9665.method_44663().error(var6);
         }

         var4.getInputStream().close();
         var4.getErrorStream().close();
         var4.getOutputStream().close();
      } catch (IOException | PrivilegedActionException var7) {
         class_9665.method_44663().error("Couldn't open url '{}'", var1, var7);
         class_9665.method_44702(var7);
      }
   }

   public void method_37582(URI var1) {
      try {
         this.method_37577(var1.toURL());
      } catch (MalformedURLException var5) {
         class_9665.method_44663().error("Couldn't open uri '{}'", var1, var5);
      }
   }

   public void method_37578(File var1) {
      try {
         this.method_37577(var1.toURI().toURL());
      } catch (MalformedURLException var5) {
         class_9665.method_44663().error("Couldn't open file '{}'", var1, var5);
      }
   }

   public String[] method_37580(URL var1) {
      String var4 = var1.toString();
      if ("file".equals(var1.getProtocol())) {
         var4 = var4.replace("file:", "file://");
      }

      return new String[]{"xdg-open", var4};
   }

   public void method_37581(String var1) {
      try {
         this.method_37577(new URI(var1).toURL());
      } catch (URISyntaxException | MalformedURLException | IllegalArgumentException var5) {
         class_9665.method_44663().error("Couldn't open uri '{}'", var1, var5);
      }
   }
}
