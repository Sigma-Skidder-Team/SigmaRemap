package mapped;

import org.apache.commons.io.IOUtils;

import java.awt.*;
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

   public void openURL(URL url) {
      try {
         // Use Runtime to execute the default browser command
         String os = System.getProperty("os.name").toLowerCase();
         String command;

         if (os.contains("win")) {
            // Windows command to open the default browser
            command = "rundll32 url.dll,FileProtocolHandler " + url.toString();
         } else if (os.contains("mac")) {
            // macOS command to open the default browser
            command = "open " + url.toString();
         } else if (os.contains("nix") || os.contains("nux")) {
            // Unix/Linux command to open the default browser
            command = "xdg-open " + url.toString();
         } else {
            throw new UnsupportedOperationException("Unsupported operating system: " + os);
         }

         // Execute the command
         Process process = Runtime.getRuntime().exec(command);
         process.waitFor();  // Wait for the process to complete
      } catch (Exception e) {
         // Log any exceptions that occur
         Util.method38542().error("Couldn't open URL '{}'", url, e);
         Util.method38543(e);
      }
   }

   public void openURI(URI var1) {
      try {
         this.openURL(var1.toURL());
      } catch (MalformedURLException var5) {
         Util.method38542().error("Couldn't open uri '{}'", var1, var5);
      }
   }

   public void openFile(File var1) {
      try {
         this.openURL(var1.toURI().toURL());
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
         this.openURL(new URI(var1).toURL());
      } catch (URISyntaxException | MalformedURLException | IllegalArgumentException var5) {
         Util.method38542().error("Couldn't open uri '{}'", var1, var5);
      }
   }
}