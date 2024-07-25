package remapped;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.HttpRetryException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.net.Proxy.Type;
import java.security.cert.CertificateException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;

public final class class_507 implements class_9833 {
   private static final int field_3137 = 20;
   private final class_8075 field_3135;
   private final boolean field_3131;
   private class_327 field_3136;
   private Object field_3133;
   private volatile boolean field_3134;

   public class_507(class_8075 var1, boolean var2) {
      this.field_3135 = var1;
      this.field_3131 = var2;
   }

   public void method_2509() {
      this.field_3134 = true;
      class_327 var3 = this.field_3136;
      if (var3 != null) {
         var3.method_1516();
      }
   }

   public boolean method_2508() {
      return this.field_3134;
   }

   public void method_2507(Object var1) {
      this.field_3133 = var1;
   }

   public class_327 method_2515() {
      return this.field_3136;
   }

   @Override
   public class_7839 method_45321(class_8047 var1) throws IOException {
      class_3918 var4 = var1.method_36516();
      this.field_3136 = new class_327(this.field_3135.method_36665(), this.method_2514(var4.method_18136()), this.field_3133);
      int var5 = 0;
      class_7839 var6 = null;

      while (!this.field_3134) {
         class_7839 var7 = null;
         boolean var8 = true;

         try {
            var7 = ((class_3805)var1).method_17719(var4, this.field_3136, null, null);
            var8 = false;
         } catch (class_8380 var15) {
            if (!this.method_2510(var15.method_38626(), false, var4)) {
               throw var15.method_38626();
            }

            var8 = false;
            continue;
         } catch (IOException var16) {
            boolean var10 = !(var16 instanceof class_5765);
            if (!this.method_2510(var16, var10, var4)) {
               throw var16;
            }

            var8 = false;
            continue;
         } finally {
            if (var8) {
               this.field_3136.method_1525(null);
               this.field_3136.method_1528();
            }
         }

         if (var6 != null) {
            var7 = var7.method_35485().method_35277(var6.method_35485().method_35282(null).method_35268()).method_35268();
         }

         class_3918 var9 = this.method_2513(var7);
         if (var9 == null) {
            if (!this.field_3131) {
               this.field_3136.method_1528();
            }

            return var7;
         }

         class_8515.method_39200(var7.method_35481());
         if (++var5 > 20) {
            this.field_3136.method_1528();
            throw new ProtocolException("Too many follow-up requests: " + var5);
         }

         if (var9.method_18133() instanceof class_1305) {
            this.field_3136.method_1528();
            throw new HttpRetryException("Cannot retry streamed HTTP body", var7.method_35490());
         }

         if (!this.method_2506(var7, var9.method_18136())) {
            this.field_3136.method_1528();
            this.field_3136 = new class_327(this.field_3135.method_36665(), this.method_2514(var9.method_18136()), this.field_3133);
         } else if (this.field_3136.method_1521() != null) {
            throw new IllegalStateException("Closing the body of " + var7 + " didn't close its backing stream. Bad interceptor?");
         }

         var4 = var9;
         var6 = var7;
      }

      this.field_3136.method_1528();
      throw new IOException("Canceled");
   }

   private class_497 method_2514(class_1672 var1) {
      SSLSocketFactory var4 = null;
      HostnameVerifier var5 = null;
      class_4446 var6 = null;
      if (var1.method_7485()) {
         var4 = this.field_3135.method_36681();
         var5 = this.field_3135.method_36656();
         var6 = this.field_3135.method_36659();
      }

      return new class_497(
         var1.method_7449(),
         var1.method_7472(),
         this.field_3135.method_36672(),
         this.field_3135.method_36680(),
         var4,
         var5,
         var6,
         this.field_3135.method_36670(),
         this.field_3135.method_36666(),
         this.field_3135.method_36676(),
         this.field_3135.method_36660(),
         this.field_3135.method_36654()
      );
   }

   private boolean method_2510(IOException var1, boolean var2, class_3918 var3) {
      this.field_3136.method_1525(var1);
      if (this.field_3135.method_36668()) {
         if (var2 && var3.method_18133() instanceof class_1305) {
            return false;
         } else {
            return this.method_2511(var1, var2) ? this.field_3136.method_1519() : false;
         }
      } else {
         return false;
      }
   }

   private boolean method_2511(IOException var1, boolean var2) {
      if (!(var1 instanceof ProtocolException)) {
         if (!(var1 instanceof InterruptedIOException)) {
            return var1 instanceof SSLHandshakeException && var1.getCause() instanceof CertificateException
               ? false
               : !(var1 instanceof SSLPeerUnverifiedException);
         } else {
            return var1 instanceof SocketTimeoutException && !var2;
         }
      } else {
         return false;
      }
   }

   private class_3918 method_2513(class_7839 var1) throws IOException {
      if (var1 == null) {
         throw new IllegalStateException();
      } else {
         class_1617 var4 = this.field_3136.method_1522();
         class_2535 var5 = var4 != null ? var4.method_21597() : null;
         int var6 = var1.method_35490();
         String var7 = var1.method_35474().method_18137();
         switch (var6) {
            case 307:
            case 308:
               if (!var7.equals("GET") && !var7.equals("HEAD")) {
                  return null;
               }
            case 300:
            case 301:
            case 302:
            case 303:
               if (!this.field_3135.method_36669()) {
                  return null;
               } else {
                  String var9 = var1.method_35472("Location");
                  if (var9 == null) {
                     return null;
                  } else {
                     class_1672 var10 = var1.method_35474().method_18136().method_7465(var9);
                     if (var10 == null) {
                        return null;
                     } else {
                        boolean var11 = var10.method_7488().equals(var1.method_35474().method_18136().method_7488());
                        if (!var11 && !this.field_3135.method_36675()) {
                           return null;
                        }

                        class_2415 var12 = var1.method_35474().method_18140();
                        if (class_3493.method_16060(var7)) {
                           boolean var13 = class_3493.method_16062(var7);
                           if (class_3493.method_16065(var7)) {
                              var12.method_11008("GET", null);
                           } else {
                              class_9001 var14 = var13 ? var1.method_35474().method_18133() : null;
                              var12.method_11008(var7, var14);
                           }

                           if (!var13) {
                              var12.method_11003("Transfer-Encoding");
                              var12.method_11003("Content-Length");
                              var12.method_11003("Content-Type");
                           }
                        }

                        if (!this.method_2506(var1, var10)) {
                           var12.method_11003("Authorization");
                        }

                        return var12.method_11007(var10).method_11013();
                     }
                  }
               }
            case 401:
               return this.field_3135.method_36679().method_39627(var5, var1);
            case 407:
               Proxy var8 = var5 != null ? var5.method_11561() : this.field_3135.method_36666();
               if (var8.type() != Type.HTTP) {
                  throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
               }

               return this.field_3135.method_36670().method_39627(var5, var1);
            case 408:
               if (var1.method_35474().method_18133() instanceof class_1305) {
                  return null;
               }

               return var1.method_35474();
            default:
               return null;
         }
      }
   }

   private boolean method_2506(class_7839 var1, class_1672 var2) {
      class_1672 var5 = var1.method_35474().method_18136();
      return var5.method_7449().equals(var2.method_7449()) && var5.method_7472() == var2.method_7472() && var5.method_7488().equals(var2.method_7488());
   }
}
