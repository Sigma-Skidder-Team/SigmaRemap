package remapped;

import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import java.net.Proxy.Type;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

public final class class_1617 extends class_8906 implements class_4667 {
   private static final String field_8403 = "throw with null exception";
   private final class_8467 field_8400;
   private final class_2535 field_8392;
   private Socket field_8402;
   private Socket field_8401;
   private class_442 field_8405;
   private class_7976 field_8397;
   private class_2695 field_8406;
   private class_8067 field_8394;
   private class_3947 field_8398;
   public boolean field_8399;
   public int field_8393;
   public int field_8407 = 1;
   public final List<Reference<class_327>> field_8404 = new ArrayList<Reference<class_327>>();
   public long field_8395 = Long.MAX_VALUE;

   public class_1617(class_8467 var1, class_2535 var2) {
      this.field_8400 = var1;
      this.field_8392 = var2;
   }

   public static class_1617 method_7207(class_8467 var0, class_2535 var1, Socket var2, long var3) {
      class_1617 var7 = new class_1617(var0, var1);
      var7.field_8401 = var2;
      var7.field_8395 = var3;
      return var7;
   }

   public void method_7210(int var1, int var2, int var3, boolean var4) {
      if (this.field_8397 != null) {
         throw new IllegalStateException("already connected");
      } else {
         class_8380 var7 = null;
         List var8 = this.field_8392.method_11559().method_2483();
         class_4328 var9 = new class_4328(var8);
         if (this.field_8392.method_11559().method_2474() == null) {
            if (!var8.contains(class_5083.field_26246)) {
               throw new class_8380(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }

            String var10 = this.field_8392.method_11559().method_2484().method_7449();
            if (!class_3307.method_15163().method_15161(var10)) {
               throw new class_8380(new UnknownServiceException("CLEARTEXT communication to " + var10 + " not permitted by network security policy"));
            }
         }

         while (true) {
            try {
               if (this.field_8392.method_11562()) {
                  this.method_7216(var1, var2, var3);
               } else {
                  this.method_7204(var1, var2);
               }

               this.method_7217(var9);
               break;
            } catch (IOException var13) {
               class_8515.method_39202(this.field_8401);
               class_8515.method_39202(this.field_8402);
               this.field_8401 = null;
               this.field_8402 = null;
               this.field_8394 = null;
               this.field_8398 = null;
               this.field_8405 = null;
               this.field_8397 = null;
               this.field_8406 = null;
               if (var7 == null) {
                  var7 = new class_8380(var13);
               } else {
                  var7.method_38627(var13);
               }

               if (!var4 || !var9.method_20148(var13)) {
                  throw var7;
               }
            }
         }

         if (this.field_8406 != null) {
            synchronized (this.field_8400) {
               this.field_8407 = this.field_8406.method_12141();
            }
         }
      }
   }

   private void method_7216(int var1, int var2, int var3) throws IOException {
      class_3918 var6 = this.method_7211();
      class_1672 var7 = var6.method_18136();
      int var8 = 0;

      byte var9;
      for (var9 = 21; ++var8 <= var9; this.field_8394 = null) {
         this.method_7204(var1, var2);
         var6 = this.method_7205(var2, var3, var6, var7);
         if (var6 == null) {
            return;
         }

         class_8515.method_39202(this.field_8402);
         this.field_8402 = null;
         this.field_8398 = null;
      }

      throw new ProtocolException("Too many tunnel connections attempted: " + var9);
   }

   private void method_7204(int var1, int var2) throws IOException {
      Proxy var5 = this.field_8392.method_11561();
      class_497 var6 = this.field_8392.method_11559();
      this.field_8402 = var5.type() != Type.DIRECT && var5.type() != Type.HTTP ? new Socket(var5) : var6.method_2479().createSocket();
      this.field_8402.setSoTimeout(var2);

      try {
         class_3307.method_15163().method_15164(this.field_8402, this.field_8392.method_11560(), var1);
      } catch (ConnectException var9) {
         ConnectException var8 = new ConnectException("Failed to connect to " + this.field_8392.method_11560());
         var8.initCause(var9);
         throw var8;
      }

      try {
         this.field_8394 = class_1259.method_5671(class_1259.method_5668(this.field_8402));
         this.field_8398 = class_1259.method_5670(class_1259.method_5662(this.field_8402));
      } catch (NullPointerException var10) {
         if ("throw with null exception".equals(var10.getMessage())) {
            throw new IOException(var10);
         }
      }
   }

   private void method_7217(class_4328 var1) throws IOException {
      if (this.field_8392.method_11559().method_2474() != null) {
         this.method_7206(var1);
         if (this.field_8397 == class_7976.field_40849) {
            this.field_8401.setSoTimeout(0);
            this.field_8406 = new class_7552(true)
               .method_34364(this.field_8401, this.field_8392.method_11559().method_2484().method_7449(), this.field_8394, this.field_8398)
               .method_34365(this)
               .method_34361();
            this.field_8406.method_12138();
         }
      } else {
         this.field_8397 = class_7976.field_40847;
         this.field_8401 = this.field_8402;
      }
   }

   private void method_7206(class_4328 var1) throws IOException {
      class_497 var4 = this.field_8392.method_11559();
      SSLSocketFactory var5 = var4.method_2474();
      boolean var6 = false;
      SSLSocket var7 = null;

      try {
         var7 = (SSLSocket)var5.createSocket(this.field_8402, var4.method_2484().method_7449(), var4.method_2484().method_7472(), true);
         class_5083 var8 = var1.method_20149(var7);
         if (var8.method_23366()) {
            class_3307.method_15163().method_15166(var7, var4.method_2484().method_7449(), var4.method_2482());
         }

         var7.startHandshake();
         class_442 var9 = class_442.method_2139(var7.getSession());
         if (!var4.method_2480().verify(var4.method_2484().method_7449(), var7.getSession())) {
            X509Certificate var16 = (X509Certificate)var9.method_2145().get(0);
            throw new SSLPeerUnverifiedException(
               "Hostname "
                  + var4.method_2484().method_7449()
                  + " not verified:\n    certificate: "
                  + class_4446.method_20614(var16)
                  + "\n    DN: "
                  + var16.getSubjectDN().getName()
                  + "\n    subjectAltNames: "
                  + class_6667.method_30598(var16)
            );
         }

         var4.method_2473().method_20617(var4.method_2484().method_7449(), var9.method_2145());
         String var10 = var8.method_23366() ? class_3307.method_15163().method_15174(var7) : null;
         this.field_8401 = var7;
         this.field_8394 = class_1259.method_5671(class_1259.method_5668(this.field_8401));
         this.field_8398 = class_1259.method_5670(class_1259.method_5662(this.field_8401));
         this.field_8405 = var9;
         this.field_8397 = var10 != null ? class_7976.method_36139(var10) : class_7976.field_40847;
         var6 = true;
      } catch (AssertionError var14) {
         if (class_8515.method_39213(var14)) {
            throw new IOException(var14);
         }

         throw var14;
      } finally {
         if (var7 != null) {
            class_3307.method_15163().method_15168(var7);
         }

         if (!var6) {
            class_8515.method_39202(var7);
         }
      }
   }

   private class_3918 method_7205(int var1, int var2, class_3918 var3, class_1672 var4) throws IOException {
      String var7 = "CONNECT " + class_8515.method_39215(var4, true) + " HTTP/1.1";

      label35:
      while (true) {
         class_9485 var8 = new class_9485(null, null, this.field_8394, this.field_8398);
         this.field_8394.method_19192().method_1070((long)var1, TimeUnit.MILLISECONDS);
         this.field_8398.method_19192().method_1070((long)var2, TimeUnit.MILLISECONDS);
         var8.method_43818(var3.method_18138(), var7);
         var8.method_43064();
         class_7839 var9 = var8.method_43068(false).method_35283(var3).method_35268();
         long var10 = class_4464.method_20718(var9);
         if (var10 == -1L) {
            var10 = 0L;
         }

         class_5322 var12 = var8.method_43819(var10);
         class_8515.method_39194(var12, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
         var12.close();
         switch (var9.method_35490()) {
            case 200:
               if (this.field_8394.method_18234().method_36605() && this.field_8398.method_18234().method_36605()) {
                  return null;
               }

               throw new IOException("TLS tunnel buffered too many bytes!");
            case 407:
               var3 = this.field_8392.method_11559().method_2475().method_39627(this.field_8392, var9);
               if (var3 == null) {
                  throw new IOException("Failed to authenticate with proxy");
               }

               if ("close".equalsIgnoreCase(var9.method_35472("Connection"))) {
                  break label35;
               }
               break;
            default:
               throw new IOException("Unexpected response code for CONNECT: " + var9.method_35490());
         }
      }

      return var3;
   }

   private class_3918 method_7211() {
      return new class_2415()
         .method_11007(this.field_8392.method_11559().method_2484())
         .method_11009("Host", class_8515.method_39215(this.field_8392.method_11559().method_2484(), true))
         .method_11009("Proxy-Connection", "Keep-Alive")
         .method_11009("User-Agent", class_9254.method_42641())
         .method_11013();
   }

   public boolean method_7209(class_497 var1, class_2535 var2) {
      if (this.field_8404.size() < this.field_8407 && !this.field_8399) {
         if (!class_1850.field_9389.method_8179(this.field_8392.method_11559(), var1)) {
            return false;
         } else if (var1.method_2484().method_7449().equals(this.method_21597().method_11559().method_2484().method_7449())) {
            return true;
         } else if (this.field_8406 == null) {
            return false;
         } else if (var2 == null) {
            return false;
         } else if (var2.method_11561().type() != Type.DIRECT) {
            return false;
         } else if (this.field_8392.method_11561().type() != Type.DIRECT) {
            return false;
         } else if (!this.field_8392.method_11560().equals(var2.method_11560())) {
            return false;
         } else if (var2.method_11559().method_2480() != class_6667.field_34474) {
            return false;
         } else if (!this.method_7212(var1.method_2484())) {
            return false;
         } else {
            try {
               var1.method_2473().method_20617(var1.method_2484().method_7449(), this.method_21596().method_2145());
               return true;
            } catch (SSLPeerUnverifiedException var6) {
               return false;
            }
         }
      } else {
         return false;
      }
   }

   public boolean method_7212(class_1672 var1) {
      if (var1.method_7472() == this.field_8392.method_11559().method_2484().method_7472()) {
         return var1.method_7449().equals(this.field_8392.method_11559().method_2484().method_7449())
            ? true
            : this.field_8405 != null && class_6667.field_34474.verify(var1.method_7449(), (X509Certificate)this.field_8405.method_2145().get(0));
      } else {
         return false;
      }
   }

   public class_9328 method_7208(class_8075 var1, class_327 var2) throws SocketException {
      if (this.field_8406 == null) {
         this.field_8401.setSoTimeout(var1.method_36671());
         this.field_8394.method_19192().method_1070((long)var1.method_36671(), TimeUnit.MILLISECONDS);
         this.field_8398.method_19192().method_1070((long)var1.method_36657(), TimeUnit.MILLISECONDS);
         return new class_9485(var1, var2, this.field_8394, this.field_8398);
      } else {
         return new class_3076(var1, var2, this.field_8406);
      }
   }

   public class_7201 method_7203(class_327 var1) {
      return new class_2126(this, true, this.field_8394, this.field_8398, var1);
   }

   @Override
   public class_2535 method_21597() {
      return this.field_8392;
   }

   public void method_7215() {
      class_8515.method_39202(this.field_8402);
   }

   @Override
   public Socket method_21599() {
      return this.field_8401;
   }

   public boolean method_7213(boolean var1) {
      if (this.field_8401.isClosed() || this.field_8401.isInputShutdown() || this.field_8401.isOutputShutdown()) {
         return false;
      } else if (this.field_8406 != null) {
         return !this.field_8406.method_12116();
      } else {
         if (var1) {
            try {
               int var4 = this.field_8401.getSoTimeout();

               boolean var5;
               try {
                  this.field_8401.setSoTimeout(1);
                  if (!this.field_8394.method_36605()) {
                     return true;
                  }

                  var5 = false;
               } finally {
                  this.field_8401.setSoTimeout(var4);
               }

               return var5;
            } catch (SocketTimeoutException var11) {
            } catch (IOException var12) {
               return false;
            }
         }

         return true;
      }
   }

   @Override
   public void method_40965(class_9388 var1) throws IOException {
      var1.method_43415(class_1692.field_8761);
   }

   @Override
   public void method_40967(class_2695 var1) {
      synchronized (this.field_8400) {
         this.field_8407 = var1.method_12141();
      }
   }

   @Override
   public class_442 method_21596() {
      return this.field_8405;
   }

   public boolean method_7214() {
      return this.field_8406 != null;
   }

   @Override
   public class_7976 method_21598() {
      return this.field_8397;
   }

   @Override
   public String toString() {
      return "Connection{"
         + this.field_8392.method_11559().method_2484().method_7449()
         + ":"
         + this.field_8392.method_11559().method_2484().method_7472()
         + ", proxy="
         + this.field_8392.method_11561()
         + " hostAddress="
         + this.field_8392.method_11560()
         + " cipherSuite="
         + (this.field_8405 == null ? "none" : this.field_8405.method_2141())
         + " protocol="
         + this.field_8397
         + '}';
   }
}
