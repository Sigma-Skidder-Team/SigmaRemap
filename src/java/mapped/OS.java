package mapped;

import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;

public enum OS {
   LINUX,
   SOLARIS,
   WINDOWS,
   OSX,
   UNKNOWN;

   private static final OS[] field11208 = new OS[]{LINUX, SOLARIS, WINDOWS, OSX, UNKNOWN};

   private OS() {
   }

   public void method8177(URL var1) {
      try {
         Process var4 = AccessController.<Process>doPrivileged((PrivilegedExceptionAction<Process>)(() -> Runtime.getRuntime().exec(this.method8180(var1))));

         for (String var6 : IOUtils.readLines(var4.getErrorStream())) {
            Util.method38542().error(var6);
         }

         var4.getInputStream().close();
         var4.getErrorStream().close();
         var4.getOutputStream().close();
      } catch (IOException | PrivilegedActionException var7) {
         Util.method38542().error("Couldn't open url '{}'", var1, var7);
         Util.method38543(var7);
      }
   }

   public void method8178(URI var1) {
      try {
         this.method8177(var1.toURL());
      } catch (MalformedURLException var5) {
         Util.method38542().error("Couldn't open uri '{}'", var1, var5);
      }
   }

   public void method8179(File var1) {
      try {
         this.method8177(var1.toURI().toURL());
      } catch (MalformedURLException var5) {
         Util.method38542().error("Couldn't open file '{}'", var1, var5);
      }
   }

   public String[] method8180(URL var1) {
      String var4 = var1.toString();
      if ("file".equals(var1.getProtocol())) {
         var4 = var4.replace("file:", "file://");
      }

      return new String[]{"xdg-open", var4};
   }

   public void method8181(String var1) {
      try {
         this.method8177(new URI(var1).toURL());
      } catch (URISyntaxException | MalformedURLException | IllegalArgumentException var5) {
         Util.method38542().error("Couldn't open uri '{}'", var1, var5);
      }
   }
}
