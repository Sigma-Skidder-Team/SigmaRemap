package remapped;

import com.mojang.authlib.Agent;
import com.mojang.authlib.exceptions.AuthenticationException;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import com.mojang.authlib.yggdrasil.YggdrasilUserAuthentication;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.Proxy;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.xml.bind.DatatypeConverter;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.Base64OutputStream;
import org.apache.commons.io.output.ByteArrayOutputStream;

public class class_7309 {
   private String field_37379 = "Unknown name";
   private String field_37371 = "steve";
   private String field_37381;
   private String field_37373;
   private ArrayList<class_5933> field_37370 = new ArrayList<class_5933>();
   private long field_37378;
   private long field_37376;
   private int field_37375;
   private BufferedImage field_37369;
   private BufferedImage field_37374;
   private class_8343 field_37382;
   private Thread field_37372;
   private static Date field_37380 = new Date();

   public static class_1210 method_33347(String var0, String var1) throws AuthenticationException {
      return method_33348(new class_7309(var0, var1));
   }

   public static class_1210 method_33348(class_7309 var0) throws AuthenticationException {
      if (!var0.method_33338()) {
         String var3 = "-";
         YggdrasilAuthenticationService var4 = new YggdrasilAuthenticationService(Proxy.NO_PROXY, var3);
         YggdrasilUserAuthentication var5 = new YggdrasilUserAuthentication(var4, var3, Agent.MINECRAFT);
         var5.setUsername(var0.method_33344());
         var5.setPassword(var0.method_33341());
         var5.logIn();
         var0.method_33320();
         return new class_1210(
            var5.getSelectedProfile().getName(), var5.getSelectedProfile().getId().toString(), var5.getAuthenticatedToken(), var0.method_33343().name()
         );
      } else {
         return new class_1210(var0.method_33344(), "", "", "mojang");
      }
   }

   public class_7309(String var1, String var2, ArrayList<class_5933> var3, String var4) {
      this.field_37381 = var1;
      this.field_37373 = var2;
      this.field_37376 = System.currentTimeMillis();
      this.field_37378 = 0L;
      this.field_37375 = 0;
      if (var3 != null) {
         this.field_37370 = var3;
      }

      if (var4 != null) {
         this.field_37379 = var4;
      }
   }

   public class_7309(String var1, String var2, ArrayList<class_5933> var3) {
      this(var1, var2, var3, null);
   }

   public class_7309(String var1, String var2) {
      this(var1, var2, null, null);
   }

   public class_7309(class_1293 var1) {
      if (var1.method_5850("email")) {
         this.field_37381 = var1.method_5861("email");
      }

      if (var1.method_5850("password")) {
         this.field_37373 = method_33339(var1.method_5861("password"));
      }

      if (var1.method_5850("bans")) {
         for (Object var5 : var1.method_5849("bans")) {
            this.field_37370.add(new class_5933((class_1293)var5));
         }
      }

      if (var1.method_5850("knownName")) {
         this.field_37379 = var1.method_5861("knownName");
      }

      if (var1.method_5850("knownUUID")) {
         this.field_37371 = var1.method_5861("knownUUID");
      }

      if (var1.method_5850("dateAdded")) {
         this.field_37376 = var1.method_5840("dateAdded");
      } else {
         this.field_37376 = System.currentTimeMillis();
      }

      if (var1.method_5850("lastUsed")) {
         this.field_37378 = var1.method_5840("lastUsed");
      }

      if (var1.method_5850("useCount")) {
         this.field_37375 = var1.method_5813("useCount");
      }

      if (var1.method_5850("skin")) {
         byte[] var7 = DatatypeConverter.parseBase64Binary(var1.method_5861("skin"));

         try {
            this.field_37369 = ImageIO.read(new ByteArrayInputStream(var7));
         } catch (IOException var6) {
            var6.printStackTrace();
         }
      }
   }

   public void method_33320() {
      this.field_37375++;
   }

   public ArrayList<class_5933> method_33342() {
      return this.field_37370;
   }

   public String method_33344() {
      return this.field_37381;
   }

   public String method_33321() {
      return this.field_37379;
   }

   public String method_33328() {
      return !this.field_37379.equals("Unknown name") ? this.field_37379 : this.field_37381;
   }

   public String method_33322() {
      return this.field_37371;
   }

   public String method_33341() {
      return this.field_37373;
   }

   public void method_33327(String var1) {
      this.field_37373 = var1;
   }

   public void method_33326(String var1) {
      this.field_37381 = var1;
   }

   public void method_33331(class_5933 var1) {
      this.method_33324(var1.method_27126());
      this.field_37370.add(var1);
   }

   public void method_33324(String var1) {
      Iterator var4 = this.field_37370.iterator();

      while (var4.hasNext()) {
         if (((class_5933)var4.next()).method_27126().equals(var1)) {
            var4.remove();
         }
      }
   }

   public void method_33337(String var1) {
      this.field_37379 = var1;
      this.field_37372 = null;
   }

   public void method_33330(String var1) {
      this.field_37371 = var1;
   }

   public class_8343 method_33340() {
      if (this.field_37382 == null && this.field_37369 != null) {
         try {
            this.field_37382 = class_6568.method_30015("skin", this.field_37369.getSubimage(8, 8, 8, 8));
         } catch (IOException var4) {
            var4.printStackTrace();
         }
      }

      return this.field_37382 != null ? this.field_37382 : class_2209.field_10986;
   }

   @Override
   public void finalize() throws Throwable {
      try {
         if (this.field_37382 != null) {
            SigmaMainClass.method_3328().method_3329(this.field_37382);
         }
      } finally {
         super.finalize();
      }
   }

   public BufferedImage method_33345() {
      if (this.field_37374 == null && this.field_37369 != null) {
         Rectangle var3 = new Rectangle(64, 64);
         this.field_37374 = new BufferedImage((int)var3.getWidth(), (int)var3.getHeight(), 3);
         Graphics2D var4 = this.field_37374.createGraphics();
         var4.drawImage(this.field_37369, 0, 0, null);
         if (this.field_37369.getHeight() == 32) {
            BufferedImage var5 = this.field_37369.getSubimage(0, 16, 16, 16);
            BufferedImage var6 = this.field_37369.getSubimage(40, 16, 16, 16);
            var4.drawImage(var5, 16, 48, null);
            var4.drawImage(var6, 32, 48, null);
         }

         var4.dispose();
      }

      return this.field_37374;
   }

   public void method_33334() {
      new Date();
      if (!this.method_33322().contains("steve") && this.field_37372 == null) {
         this.field_37372 = new Thread(() -> {
            try {
               this.field_37369 = ImageIO.read(new URL(class_314.method_1411(this.method_33322().replaceAll("-", ""))));
            } catch (Exception var4) {
               var4.printStackTrace();
            }
         });
         this.field_37372.start();
      }
   }

   public class_9075 method_33343() {
      return !this.field_37381.contains("@") ? class_9075.field_46454 : class_9075.field_46455;
   }

   public class_1210 method_33346() throws AuthenticationException {
      if (!this.method_33338()) {
         String var3 = "-";
         YggdrasilAuthenticationService var4 = new YggdrasilAuthenticationService(Proxy.NO_PROXY, var3);
         YggdrasilUserAuthentication var5 = new YggdrasilUserAuthentication(var4, var3, Agent.MINECRAFT);
         var5.setUsername(this.method_33344());
         var5.setPassword(this.method_33341());
         var5.logIn();
         this.method_33337(var5.getSelectedProfile().getName());
         this.method_33330(var5.getSelectedProfile().getId().toString());
         this.method_33334();
         this.field_37378 = System.currentTimeMillis();
         return new class_1210(
            var5.getSelectedProfile().getName(),
            var5.getSelectedProfile().getId().toString().replaceAll("-", ""),
            var5.getAuthenticatedToken(),
            this.method_33343().name()
         );
      } else {
         this.method_33337(this.method_33344());
         return new class_1210(this.method_33344(), "", "", "mojang");
      }
   }

   public class_1293 method_33323() {
      class_1293 var3 = new class_1293();
      var3.method_5820("bans", this.method_33325());
      var3.method_5820("email", this.field_37381);
      var3.method_5820("password", method_33329(this.field_37373));
      var3.method_5820("knownName", this.field_37379);
      var3.method_5820("knownUUID", this.field_37371);
      var3.method_5818("useCount", this.field_37375);
      var3.method_5819("lastUsed", this.field_37378);
      var3.method_5819("dateAdded", this.field_37376);
      if (this.field_37369 != null) {
         ByteArrayOutputStream var4 = new ByteArrayOutputStream();
         Base64OutputStream var5 = new Base64OutputStream(var4);
         String var6 = "";

         try {
            ImageIO.write(this.field_37369, "png", var5);
            var6 = var4.toString("UTF-8");
         } catch (IOException var8) {
            var8.printStackTrace();
         }

         var3.method_5820("skin", var6);
      }

      return var3;
   }

   public class_1336 method_33325() {
      class_1336 var3 = new class_1336();

      for (class_5933 var5 : this.field_37370) {
         var3.method_6159(var5.method_27124());
      }

      return var3;
   }

   public static String method_33329(String var0) {
      byte[] var3 = Base64.encodeBase64(var0.getBytes());
      return new String(var3, Charset.forName("UTF-8"));
   }

   public static String method_33339(String var0) {
      byte[] var3 = Base64.decodeBase64(var0.getBytes());
      return new String(var3, Charset.forName("UTF-8"));
   }

   public int method_33332() {
      return this.field_37375;
   }

   public long method_33335() {
      return this.field_37378;
   }

   public long method_33336() {
      return this.field_37376;
   }

   public class_5933 method_33349(String var1) {
      for (class_5933 var5 : this.method_33342()) {
         if (var5.method_27126().equals(var1)) {
            return var5;
         }
      }

      return null;
   }

   public boolean method_33338() {
      Pattern var3 = Pattern.compile("[a-zA-Z0-9_]{2,16}");
      boolean var4 = var3.matcher(this.method_33344()).matches();
      return var4 && this.method_33341().length() == 0;
   }
}
