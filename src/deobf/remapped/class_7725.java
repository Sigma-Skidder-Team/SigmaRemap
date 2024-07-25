package remapped;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

public final class class_7725 {
   public class_1666 field_39184;
   public Proxy field_39179;
   public List<class_7976> field_39176;
   public List<class_5083> field_39168;
   public final List<class_9833> field_39172 = new ArrayList<class_9833>();
   public final List<class_9833> field_39171 = new ArrayList<class_9833>();
   public class_5843 field_39178;
   public ProxySelector field_39185;
   public class_9207 field_39162;
   public class_8555 field_39174;
   public class_4957 field_39177;
   public SocketFactory field_39170;
   public SSLSocketFactory field_39186;
   public class_8290 field_39163;
   public HostnameVerifier field_39187;
   public class_4446 field_39183;
   public class_8631 field_39181;
   public class_8631 field_39165;
   public class_8467 field_39173;
   public class_7251 field_39166;
   public boolean field_39161;
   public boolean field_39169;
   public boolean field_39180;
   public int field_39182;
   public int field_39175;
   public int field_39167;
   public int field_39164;

   public class_7725() {
      this.field_39184 = new class_1666();
      this.field_39176 = class_8075.field_41334;
      this.field_39168 = class_8075.field_41322;
      this.field_39178 = class_213.method_909(class_213.field_713);
      this.field_39185 = ProxySelector.getDefault();
      this.field_39162 = class_9207.field_47101;
      this.field_39170 = SocketFactory.getDefault();
      this.field_39187 = class_6667.field_34474;
      this.field_39183 = class_4446.field_21675;
      this.field_39181 = class_8631.field_44270;
      this.field_39165 = class_8631.field_44270;
      this.field_39173 = new class_8467();
      this.field_39166 = class_7251.field_37162;
      this.field_39161 = true;
      this.field_39169 = true;
      this.field_39180 = true;
      this.field_39182 = 10000;
      this.field_39175 = 10000;
      this.field_39167 = 10000;
      this.field_39164 = 0;
   }

   public class_7725(class_8075 var1) {
      this.field_39184 = var1.field_41336;
      this.field_39179 = var1.field_41311;
      this.field_39176 = var1.field_41310;
      this.field_39168 = var1.field_41312;
      this.field_39172.addAll(var1.field_41319);
      this.field_39171.addAll(var1.field_41323);
      this.field_39178 = var1.field_41327;
      this.field_39185 = var1.field_41315;
      this.field_39162 = var1.field_41330;
      this.field_39177 = var1.field_41316;
      this.field_39174 = var1.field_41333;
      this.field_39170 = var1.field_41318;
      this.field_39186 = var1.field_41325;
      this.field_39163 = var1.field_41321;
      this.field_39187 = var1.field_41320;
      this.field_39183 = var1.field_41328;
      this.field_39181 = var1.field_41326;
      this.field_39165 = var1.field_41308;
      this.field_39173 = var1.field_41324;
      this.field_39166 = var1.field_41331;
      this.field_39161 = var1.field_41317;
      this.field_39169 = var1.field_41335;
      this.field_39180 = var1.field_41307;
      this.field_39182 = var1.field_41332;
      this.field_39175 = var1.field_41329;
      this.field_39167 = var1.field_41309;
      this.field_39164 = var1.field_41314;
   }

   public class_7725 method_34950(long var1, TimeUnit var3) {
      this.field_39182 = method_34938("timeout", var1, var3);
      return this;
   }

   public class_7725 method_34958(long var1, TimeUnit var3) {
      this.field_39175 = method_34938("timeout", var1, var3);
      return this;
   }

   public class_7725 method_34954(long var1, TimeUnit var3) {
      this.field_39167 = method_34938("timeout", var1, var3);
      return this;
   }

   public class_7725 method_34941(long var1, TimeUnit var3) {
      this.field_39164 = method_34938("interval", var1, var3);
      return this;
   }

   private static int method_34938(String var0, long var1, TimeUnit var3) {
      if (var1 >= 0L) {
         if (var3 != null) {
            long var6 = var3.toMillis(var1);
            if (var6 <= 2147483647L) {
               if (var6 == 0L && var1 > 0L) {
                  throw new IllegalArgumentException(var0 + " too small.");
               } else {
                  return (int)var6;
               }
            } else {
               throw new IllegalArgumentException(var0 + " too large.");
            }
         } else {
            throw new NullPointerException("unit == null");
         }
      } else {
         throw new IllegalArgumentException(var0 + " < 0");
      }
   }

   public class_7725 method_34937(Proxy var1) {
      this.field_39179 = var1;
      return this;
   }

   public class_7725 method_34951(ProxySelector var1) {
      this.field_39185 = var1;
      return this;
   }

   public class_7725 method_34943(class_9207 var1) {
      if (var1 != null) {
         this.field_39162 = var1;
         return this;
      } else {
         throw new NullPointerException("cookieJar == null");
      }
   }

   public void method_34940(class_4957 var1) {
      this.field_39177 = var1;
      this.field_39174 = null;
   }

   public class_7725 method_34961(class_8555 var1) {
      this.field_39174 = var1;
      this.field_39177 = null;
      return this;
   }

   public class_7725 method_34959(class_7251 var1) {
      if (var1 != null) {
         this.field_39166 = var1;
         return this;
      } else {
         throw new NullPointerException("dns == null");
      }
   }

   public class_7725 method_34946(SocketFactory var1) {
      if (var1 != null) {
         this.field_39170 = var1;
         return this;
      } else {
         throw new NullPointerException("socketFactory == null");
      }
   }

   /** @deprecated */
   public class_7725 method_34956(SSLSocketFactory var1) {
      if (var1 != null) {
         X509TrustManager var4 = class_3307.method_15163().method_15169(var1);
         if (var4 != null) {
            this.field_39186 = var1;
            this.field_39163 = class_8290.method_38248(var4);
            return this;
         } else {
            throw new IllegalStateException("Unable to extract the trust manager on " + class_3307.method_15163() + ", sslSocketFactory is " + var1.getClass());
         }
      } else {
         throw new NullPointerException("sslSocketFactory == null");
      }
   }

   public class_7725 method_34957(SSLSocketFactory var1, X509TrustManager var2) {
      if (var1 != null) {
         if (var2 != null) {
            this.field_39186 = var1;
            this.field_39163 = class_8290.method_38248(var2);
            return this;
         } else {
            throw new NullPointerException("trustManager == null");
         }
      } else {
         throw new NullPointerException("sslSocketFactory == null");
      }
   }

   public class_7725 method_34960(HostnameVerifier var1) {
      if (var1 != null) {
         this.field_39187 = var1;
         return this;
      } else {
         throw new NullPointerException("hostnameVerifier == null");
      }
   }

   public class_7725 method_34944(class_4446 var1) {
      if (var1 != null) {
         this.field_39183 = var1;
         return this;
      } else {
         throw new NullPointerException("certificatePinner == null");
      }
   }

   public class_7725 method_34942(class_8631 var1) {
      if (var1 != null) {
         this.field_39165 = var1;
         return this;
      } else {
         throw new NullPointerException("authenticator == null");
      }
   }

   public class_7725 method_34953(class_8631 var1) {
      if (var1 != null) {
         this.field_39181 = var1;
         return this;
      } else {
         throw new NullPointerException("proxyAuthenticator == null");
      }
   }

   public class_7725 method_34935(class_8467 var1) {
      if (var1 != null) {
         this.field_39173 = var1;
         return this;
      } else {
         throw new NullPointerException("connectionPool == null");
      }
   }

   public class_7725 method_34936(boolean var1) {
      this.field_39161 = var1;
      return this;
   }

   public class_7725 method_34945(boolean var1) {
      this.field_39169 = var1;
      return this;
   }

   public class_7725 method_34947(boolean var1) {
      this.field_39180 = var1;
      return this;
   }

   public class_7725 method_34934(class_1666 var1) {
      if (var1 != null) {
         this.field_39184 = var1;
         return this;
      } else {
         throw new IllegalArgumentException("dispatcher == null");
      }
   }

   public class_7725 method_34930(List<class_7976> var1) {
      ArrayList var3 = new ArrayList(var1);
      if (var3.contains(class_7976.field_40847)) {
         if (!var3.contains(class_7976.field_40848)) {
            if (!var3.contains(null)) {
               var3.remove(class_7976.field_40850);
               this.field_39176 = Collections.<class_7976>unmodifiableList(var3);
               return this;
            } else {
               throw new IllegalArgumentException("protocols must not contain null");
            }
         } else {
            throw new IllegalArgumentException("protocols must not contain http/1.0: " + var3);
         }
      } else {
         throw new IllegalArgumentException("protocols doesn't contain http/1.1: " + var3);
      }
   }

   public class_7725 method_34931(List<class_5083> var1) {
      this.field_39168 = class_8515.<class_5083>method_39210(var1);
      return this;
   }

   public List<class_9833> method_34932() {
      return this.field_39172;
   }

   public class_7725 method_34952(class_9833 var1) {
      this.field_39172.add(var1);
      return this;
   }

   public List<class_9833> method_34948() {
      return this.field_39171;
   }

   public class_7725 method_34949(class_9833 var1) {
      this.field_39171.add(var1);
      return this;
   }

   public class_7725 method_34939(class_213 var1) {
      if (var1 != null) {
         this.field_39178 = class_213.method_909(var1);
         return this;
      } else {
         throw new NullPointerException("eventListener == null");
      }
   }

   public class_7725 method_34933(class_5843 var1) {
      if (var1 != null) {
         this.field_39178 = var1;
         return this;
      } else {
         throw new NullPointerException("eventListenerFactory == null");
      }
   }

   public class_8075 method_34955() {
      return new class_8075(this);
   }
}
