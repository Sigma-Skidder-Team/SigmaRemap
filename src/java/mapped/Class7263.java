package mapped;

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

public final class Class7263 extends Class7264 implements Class7266 {
   private static final String field31153 = "throw with null exception";
   private final Class9457 field31154;
   private final Class7723 field31155;
   private Socket field31156;
   private Socket field31157;
   private Class6027 field31158;
   private Class2201 field31159;
   private Class1767 field31160;
   private Class1735 field31161;
   private Class1733 field31162;
   public boolean field31163;
   public int field31164;
   public int field31165 = 1;
   public final List<Reference<Class5751>> field31166 = new ArrayList<Reference<Class5751>>();
   public long field31167 = Long.MAX_VALUE;

   public Class7263(Class9457 var1, Class7723 var2) {
      this.field31154 = var1;
      this.field31155 = var2;
   }

   public static Class7263 method22800(Class9457 var0, Class7723 var1, Socket var2, long var3) {
      Class7263 var7 = new Class7263(var0, var1);
      var7.field31157 = var2;
      var7.field31167 = var3;
      return var7;
   }

   public void method22801(int var1, int var2, int var3, boolean var4) {
      if (this.field31159 != null) {
         throw new IllegalStateException("already connected");
      } else {
         Class2503 var7 = null;
         List var8 = this.field31155.method25539().method19054();
         Class8349 var9 = new Class8349(var8);
         if (this.field31155.method25539().method19057() == null) {
            if (!var8.contains(Class8574.field38548)) {
               throw new Class2503(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }

            String var10 = this.field31155.method25539().method19049().method22942();
            if (!Class7596.method24879().method24876(var10)) {
               throw new Class2503(new UnknownServiceException("CLEARTEXT communication to " + var10 + " not permitted by network security policy"));
            }
         }

         while (true) {
            try {
               if (this.field31155.method25542()) {
                  this.method22802(var1, var2, var3);
               } else {
                  this.method22803(var1, var2);
               }

               this.method22804(var9);
               break;
            } catch (IOException var13) {
               Class9474.method36536(this.field31157);
               Class9474.method36536(this.field31156);
               this.field31157 = null;
               this.field31156 = null;
               this.field31161 = null;
               this.field31162 = null;
               this.field31158 = null;
               this.field31159 = null;
               this.field31160 = null;
               if (var7 == null) {
                  var7 = new Class2503(var13);
               } else {
                  var7.method10485(var13);
               }

               if (!var4 || !var9.method29261(var13)) {
                  throw var7;
               }
            }
         }

         if (this.field31160 != null) {
            synchronized (this.field31154) {
               this.field31165 = this.field31160.method7709();
            }
         }
      }
   }

   private void method22802(int var1, int var2, int var3) throws IOException {
      Class8223 var6 = this.method22807();
      Class7284 var7 = var6.method28612();
      int var8 = 0;

      byte var9;
      for (var9 = 21; ++var8 <= var9; this.field31161 = null) {
         this.method22803(var1, var2);
         var6 = this.method22806(var2, var3, var6, var7);
         if (var6 == null) {
            return;
         }

         Class9474.method36536(this.field31156);
         this.field31156 = null;
         this.field31162 = null;
      }

      throw new ProtocolException("Too many tunnel connections attempted: " + var9);
   }

   private void method22803(int var1, int var2) throws IOException {
      Proxy var5 = this.field31155.method25540();
      Class6165 var6 = this.field31155.method25539();
      this.field31156 = var5.type() != Type.DIRECT && var5.type() != Type.HTTP ? new Socket(var5) : var6.method19051().createSocket();
      this.field31156.setSoTimeout(var2);

      try {
         Class7596.method24879().method24869(this.field31156, this.field31155.method25541(), var1);
      } catch (ConnectException var9) {
         ConnectException var8 = new ConnectException("Failed to connect to " + this.field31155.method25541());
         var8.initCause(var9);
         throw var8;
      }

      try {
         this.field31161 = Class7001.method21696(Class7001.method21709(this.field31156));
         this.field31162 = Class7001.method21697(Class7001.method21700(this.field31156));
      } catch (NullPointerException var10) {
         if ("throw with null exception".equals(var10.getMessage())) {
            throw new IOException(var10);
         }
      }
   }

   private void method22804(Class8349 var1) throws IOException {
      if (this.field31155.method25539().method19057() != null) {
         this.method22805(var1);
         if (this.field31159 == Class2201.field14388) {
            this.field31157.setSoTimeout(0);
            this.field31160 = new Class9227(true)
               .method34707(this.field31157, this.field31155.method25539().method19049().method22942(), this.field31161, this.field31162)
               .method34708(this)
               .method34710();
            this.field31160.method7725();
         }
      } else {
         this.field31159 = Class2201.field14386;
         this.field31157 = this.field31156;
      }
   }

   private void method22805(Class8349 var1) throws IOException {
      Class6165 var4 = this.field31155.method25539();
      SSLSocketFactory var5 = var4.method19057();
      boolean var6 = false;
      SSLSocket var7 = null;

      try {
         var7 = (SSLSocket)var5.createSocket(this.field31156, var4.method19049().method22942(), var4.method19049().method22943(), true);
         Class8574 var8 = var1.method29260(var7);
         if (var8.method30641()) {
            Class7596.method24879().method24871(var7, var4.method19049().method22942(), var4.method19053());
         }

         var7.startHandshake();
         Class6027 var9 = Class6027.method18657(var7.getSession());
         if (!var4.method19058().verify(var4.method19049().method22942(), var7.getSession())) {
            X509Certificate var16 = (X509Certificate)var9.method18661().get(0);
            throw new SSLPeerUnverifiedException(
               "Hostname "
                  + var4.method19049().method22942()
                  + " not verified:\n    certificate: "
                  + Class8388.method29389(var16)
                  + "\n    DN: "
                  + var16.getSubjectDN().getName()
                  + "\n    subjectAltNames: "
                  + Class9005.method33270(var16)
            );
         }

         var4.method19059().method29385(var4.method19049().method22942(), var9.method18661());
         String var10 = var8.method30641() ? Class7596.method24879().method24872(var7) : null;
         this.field31157 = var7;
         this.field31161 = Class7001.method21696(Class7001.method21709(this.field31157));
         this.field31162 = Class7001.method21697(Class7001.method21700(this.field31157));
         this.field31158 = var9;
         this.field31159 = var10 != null ? Class2201.method8918(var10) : Class2201.field14386;
         var6 = true;
      } catch (AssertionError var14) {
         if (Class9474.method36547(var14)) {
            throw new IOException(var14);
         }

         throw var14;
      } finally {
         if (var7 != null) {
            Class7596.method24879().method24881(var7);
         }

         if (!var6) {
            Class9474.method36536(var7);
         }
      }
   }

   private Class8223 method22806(int var1, int var2, Class8223 var3, Class7284 var4) throws IOException {
      String var7 = "CONNECT " + Class9474.method36545(var4, true) + " HTTP/1.1";

      label35:
      while (true) {
         Class7933 var8 = new Class7933(null, null, this.field31161, this.field31162);
         this.field31161.method7541().method15209((long)var1, TimeUnit.MILLISECONDS);
         this.field31162.method7541().method15209((long)var2, TimeUnit.MILLISECONDS);
         var8.method26676(var3.method28614(), var7);
         var8.method26668();
         Class1797 var9 = var8.method26669(false).method34977(var3).method34994();
         long var10 = Class8394.method29441(var9);
         if (var10 == -1L) {
            var10 = 0L;
         }

         Class1737 var12 = var8.method26680(var10);
         Class9474.method36539(var12, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
         var12.close();
         switch (var9.method7846()) {
            case 200:
               if (this.field31161.method7559().method7583() && this.field31162.method7559().method7583()) {
                  return null;
               }

               throw new IOException("TLS tunnel buffered too many bytes!");
            case 407:
               var3 = this.field31155.method25539().method19052().method28096(this.field31155, var9);
               if (var3 == null) {
                  throw new IOException("Failed to authenticate with proxy");
               }

               if ("close".equalsIgnoreCase(var9.method7851("Connection"))) {
                  break label35;
               }
               break;
            default:
               throw new IOException("Unexpected response code for CONNECT: " + var9.method7846());
         }
      }

      return var3;
   }

   private Class8223 method22807() {
      return new Class7677()
         .method25235(this.field31155.method25539().method19049())
         .method25238("Host", Class9474.method36545(this.field31155.method25539().method19049(), true))
         .method25238("Proxy-Connection", "Keep-Alive")
         .method25238("ChatCommandExecutor-Agent", Class9669.method37724())
         .method25252();
   }

   public boolean method22808(Class6165 var1, Class7723 var2) {
      if (this.field31166.size() < this.field31165 && !this.field31163) {
         if (!Class6605.field29047.method20019(this.field31155.method25539(), var1)) {
            return false;
         } else if (var1.method19049().method22942().equals(this.method22812().method25539().method19049().method22942())) {
            return true;
         } else if (this.field31160 == null) {
            return false;
         } else if (var2 == null) {
            return false;
         } else if (var2.method25540().type() != Type.DIRECT) {
            return false;
         } else if (this.field31155.method25540().type() != Type.DIRECT) {
            return false;
         } else if (!this.field31155.method25541().equals(var2.method25541())) {
            return false;
         } else if (var2.method25539().method19058() != Class9005.field41167) {
            return false;
         } else if (!this.method22809(var1.method19049())) {
            return false;
         } else {
            try {
               var1.method19059().method29385(var1.method19049().method22942(), this.method22818().method18661());
               return true;
            } catch (SSLPeerUnverifiedException var6) {
               return false;
            }
         }
      } else {
         return false;
      }
   }

   public boolean method22809(Class7284 var1) {
      if (var1.method22943() == this.field31155.method25539().method19049().method22943()) {
         return var1.method22942().equals(this.field31155.method25539().method19049().method22942())
            ? true
            : this.field31158 != null && Class9005.field41167.verify(var1.method22942(), (X509Certificate)this.field31158.method18661().get(0));
      } else {
         return false;
      }
   }

   public Class7932 method22810(Class2391 var1, Class5751 var2) throws SocketException {
      if (this.field31160 == null) {
         this.field31157.setSoTimeout(var1.method9803());
         this.field31161.method7541().method15209((long)var1.method9803(), TimeUnit.MILLISECONDS);
         this.field31162.method7541().method15209((long)var1.method9804(), TimeUnit.MILLISECONDS);
         return new Class7933(var1, var2, this.field31161, this.field31162);
      } else {
         return new Class7931(var1, var2, this.field31160);
      }
   }

   public Class1803 method22811(Class5751 var1) {
      return new Class1804(this, true, this.field31161, this.field31162, var1);
   }

   @Override
   public Class7723 method22812() {
      return this.field31155;
   }

   public void method22813() {
      Class9474.method36536(this.field31156);
   }

   @Override
   public Socket method22814() {
      return this.field31157;
   }

   public boolean method22815(boolean var1) {
      if (this.field31157.isClosed() || this.field31157.isInputShutdown() || this.field31157.isOutputShutdown()) {
         return false;
      } else if (this.field31160 != null) {
         return !this.field31160.method7728();
      } else {
         if (var1) {
            try {
               int var4 = this.field31157.getSoTimeout();

               boolean var5;
               try {
                  this.field31157.setSoTimeout(1);
                  if (!this.field31161.method7583()) {
                     return true;
                  }

                  var5 = false;
               } finally {
                  this.field31157.setSoTimeout(var4);
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
   public void method22816(Class9698 var1) throws IOException {
      var1.method37988(Class2077.field13531);
   }

   @Override
   public void method22817(Class1767 var1) {
      synchronized (this.field31154) {
         this.field31165 = var1.method7709();
      }
   }

   @Override
   public Class6027 method22818() {
      return this.field31158;
   }

   public boolean method22819() {
      return this.field31160 != null;
   }

   @Override
   public Class2201 method22820() {
      return this.field31159;
   }

   @Override
   public String toString() {
      return "Connection{"
         + this.field31155.method25539().method19049().method22942()
         + ":"
         + this.field31155.method25539().method19049().method22943()
         + ", proxy="
         + this.field31155.method25540()
         + " hostAddress="
         + this.field31155.method25541()
         + " cipherSuite="
         + (this.field31158 == null ? "none" : this.field31158.method18660())
         + " protocol="
         + this.field31159
         + '}';
   }
}
