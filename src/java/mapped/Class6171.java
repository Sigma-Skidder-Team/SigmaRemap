package mapped;

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

public final class Class6171 implements Class6172 {
   private static final int field27603 = 20;
   private final Class2391 field27604;
   private final boolean field27605;
   private Class5751 field27606;
   private Object field27607;
   private volatile boolean field27608;

   public Class6171(Class2391 var1, boolean var2) {
      this.field27604 = var1;
      this.field27605 = var2;
   }

   public void method19070() {
      this.field27608 = true;
      Class5751 var3 = this.field27606;
      if (var3 != null) {
         var3.method17936();
      }
   }

   public boolean method19071() {
      return this.field27608;
   }

   public void method19072(Object var1) {
      this.field27607 = var1;
   }

   public Class5751 method19073() {
      return this.field27606;
   }

   @Override
   public Class1797 method19074(Class8165 var1) throws IOException {
      Class8223 var4 = var1.method28408();
      this.field27606 = new Class5751(this.field27604.method9818(), this.method19075(var4.method28612()), this.field27607);
      int var5 = 0;
      Class1797 var6 = null;

      while (!this.field27608) {
         Class1797 var7 = null;
         boolean var8 = true;

         try {
            var7 = ((Class8164)var1).method28410(var4, this.field27606, null, null);
            var8 = false;
         } catch (Class2503 var15) {
            if (!this.method19076(var15.method10484(), false, var4)) {
               throw var15.method10484();
            }

            var8 = false;
            continue;
         } catch (IOException var16) {
            boolean var10 = !(var16 instanceof Class2458);
            if (!this.method19076(var16, var10, var4)) {
               throw var16;
            }

            var8 = false;
            continue;
         } finally {
            if (var8) {
               this.field27606.method17937(null);
               this.field27606.method17933();
            }
         }

         if (var6 != null) {
            var7 = var7.method7856().method34990(var6.method7856().method34986(null).method34994()).method34994();
         }

         Class8223 var9 = this.method19078(var7);
         if (var9 == null) {
            if (!this.field27605) {
               this.field27606.method17933();
            }

            return var7;
         }

         Class9474.method36535(var7.method7855());
         if (++var5 > 20) {
            this.field27606.method17933();
            throw new ProtocolException("Too many follow-up requests: " + var5);
         }

         if (var9.method28617() instanceof Class7032) {
            this.field27606.method17933();
            throw new HttpRetryException("Cannot retry streamed HTTP body", var7.method7846());
         }

         if (!this.method19079(var7, var9.method28612())) {
            this.field27606.method17933();
            this.field27606 = new Class5751(this.field27604.method9818(), this.method19075(var9.method28612()), this.field27607);
         } else if (this.field27606.method17930() != null) {
            throw new IllegalStateException("Closing the body of " + var7 + " didn't close its backing stream. Bad interceptor?");
         }

         var4 = var9;
         var6 = var7;
      }

      this.field27606.method17933();
      throw new IOException("Canceled");
   }

   private Class6165 method19075(Class7284 var1) {
      if (var1.method22937()) {

      }

      return new Class6165(
         var1.method22942(),
         var1.method22943(),
         this.field27604.method9811(),
         this.field27604.method9812(),
         this.field27604.method9817(),
         this.field27604.method9806(),
         this.field27604.method9823(),
         this.field27604.method9824(),
         this.field27604.method9807()
      );
   }

   private boolean method19076(IOException var1, boolean var2, Class8223 var3) {
      this.field27606.method17937(var1);
      if (this.field27604.method9821()) {
         if (var2 && var3.method28617() instanceof Class7032) {
            return false;
         } else {
            return this.method19077(var1, var2) ? this.field27606.method17941() : false;
         }
      } else {
         return false;
      }
   }

   private boolean method19077(IOException var1, boolean var2) {
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

   private Class8223 method19078(Class1797 var1) throws IOException {
      if (var1 == null) {
         throw new IllegalStateException();
      } else {
         Class7263 var4 = this.field27606.method17932();
         Class7723 var5 = var4 != null ? var4.method22812() : null;
         int var6 = var1.method7846();
         String var7 = var1.method7844().method28613();
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
               if (!this.field27604.method9820()) {
                  return null;
               } else {
                  String var9 = var1.method7851("Location");
                  if (var9 == null) {
                     return null;
                  } else {
                     Class7284 var10 = var1.method7844().method28612().method22963(var9);
                     if (var10 == null) {
                        return null;
                     } else {
                        boolean var11 = var10.method22936().equals(var1.method7844().method28612().method22936());
                        if (!var11 && !this.field27604.method9819()) {
                           return null;
                        }

                        Class7677 var12 = var1.method7844().method28619();
                        if (Class8059.method27668(var7)) {
                           boolean var13 = Class8059.method27669(var7);
                           if (Class8059.method27670(var7)) {
                              var12.method25250("GET", null);
                           } else {
                              Class4864 var14 = var13 ? var1.method7844().method28617() : null;
                              var12.method25250(var7, var14);
                           }

                           if (!var13) {
                              var12.method25240("Transfer-Encoding");
                              var12.method25240("Content-Length");
                              var12.method25240("Content-Type");
                           }
                        }

                        if (!this.method19079(var1, var10)) {
                           var12.method25240("Authorization");
                        }

                        return var12.method25235(var10).method25252();
                     }
                  }
               }
            case 401:
               return this.field27604.method9816().method28096(var5, var1);
            case 407:
               Proxy var8 = var5 != null ? var5.method25540() : this.field27604.method9806();
               if (var8.type() != Type.HTTP) {
                  throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
               }

               return this.field27604.method9817().method28096(var5, var1);
            case 408:
               if (var1.method7844().method28617() instanceof Class7032) {
                  return null;
               }

               return var1.method7844();
            default:
               return null;
         }
      }
   }

   private boolean method19079(Class1797 var1, Class7284 var2) {
      Class7284 var5 = var1.method7844().method28612();
      return var5.method22942().equals(var2.method22942()) && var5.method22943() == var2.method22943() && var5.method22936().equals(var2.method22936());
   }
}
