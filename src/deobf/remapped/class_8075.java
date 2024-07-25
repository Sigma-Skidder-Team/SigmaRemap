package remapped;

import java.net.Proxy;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

public class class_8075 implements Cloneable, class_2839, class_3323 {
   public static final List<class_7976> field_41334 = class_8515.<class_7976>method_39211(class_7976.field_40849, class_7976.field_40847);
   public static final List<class_5083> field_41322 = class_8515.<class_5083>method_39211(class_5083.field_26244, class_5083.field_26246);
   public final class_1666 field_41336;
   public final Proxy field_41311;
   public final List<class_7976> field_41310;
   public final List<class_5083> field_41312;
   public final List<class_9833> field_41319;
   public final List<class_9833> field_41323;
   public final class_5843 field_41327;
   public final ProxySelector field_41315;
   public final class_9207 field_41330;
   public final class_8555 field_41333;
   public final class_4957 field_41316;
   public final SocketFactory field_41318;
   public final SSLSocketFactory field_41325;
   public final class_8290 field_41321;
   public final HostnameVerifier field_41320;
   public final class_4446 field_41328;
   public final class_8631 field_41326;
   public final class_8631 field_41308;
   public final class_8467 field_41324;
   public final class_7251 field_41331;
   public final boolean field_41317;
   public final boolean field_41335;
   public final boolean field_41307;
   public final int field_41332;
   public final int field_41329;
   public final int field_41309;
   public final int field_41314;

   public class_8075() {
      this(new class_7725());
   }

   public class_8075(class_7725 var1) {
      this.field_41336 = var1.field_39184;
      this.field_41311 = var1.field_39179;
      this.field_41310 = var1.field_39176;
      this.field_41312 = var1.field_39168;
      this.field_41319 = class_8515.<class_9833>method_39210(var1.field_39172);
      this.field_41323 = class_8515.<class_9833>method_39210(var1.field_39171);
      this.field_41327 = var1.field_39178;
      this.field_41315 = var1.field_39185;
      this.field_41330 = var1.field_39162;
      this.field_41333 = var1.field_39174;
      this.field_41316 = var1.field_39177;
      this.field_41318 = var1.field_39170;
      boolean var4 = false;

      for (class_5083 var6 : this.field_41312) {
         var4 = var4 || var6.method_23364();
      }

      if (var1.field_39186 == null && var4) {
         X509TrustManager var7 = this.method_36673();
         this.field_41325 = this.method_36662(var7);
         this.field_41321 = class_8290.method_38248(var7);
      } else {
         this.field_41325 = var1.field_39186;
         this.field_41321 = var1.field_39163;
      }

      this.field_41320 = var1.field_39187;
      this.field_41328 = var1.field_39183.method_20619(this.field_41321);
      this.field_41326 = var1.field_39181;
      this.field_41308 = var1.field_39165;
      this.field_41324 = var1.field_39173;
      this.field_41331 = var1.field_39166;
      this.field_41317 = var1.field_39161;
      this.field_41335 = var1.field_39169;
      this.field_41307 = var1.field_39180;
      this.field_41332 = var1.field_39182;
      this.field_41329 = var1.field_39175;
      this.field_41309 = var1.field_39167;
      this.field_41314 = var1.field_39164;
   }

   private X509TrustManager method_36673() {
      try {
         TrustManagerFactory var3 = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
         var3.init((KeyStore)null);
         TrustManager[] var4 = var3.getTrustManagers();
         if (var4.length == 1 && var4[0] instanceof X509TrustManager) {
            return (X509TrustManager)var4[0];
         } else {
            throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString((Object[])var4));
         }
      } catch (GeneralSecurityException var5) {
         throw new AssertionError();
      }
   }

   private SSLSocketFactory method_36662(X509TrustManager var1) {
      try {
         SSLContext var4 = SSLContext.getInstance("TLS");
         var4.init(null, new TrustManager[]{var1}, null);
         return var4.getSocketFactory();
      } catch (GeneralSecurityException var5) {
         throw new AssertionError();
      }
   }

   public int method_36652() {
      return this.field_41332;
   }

   public int method_36671() {
      return this.field_41329;
   }

   public int method_36657() {
      return this.field_41309;
   }

   public int method_36658() {
      return this.field_41314;
   }

   public Proxy method_36666() {
      return this.field_41311;
   }

   public ProxySelector method_36654() {
      return this.field_41315;
   }

   public class_9207 method_36661() {
      return this.field_41330;
   }

   public class_8555 method_36674() {
      return this.field_41333;
   }

   public class_4957 method_36653() {
      return this.field_41333 == null ? this.field_41316 : this.field_41333.field_43770;
   }

   public class_7251 method_36672() {
      return this.field_41331;
   }

   public SocketFactory method_36680() {
      return this.field_41318;
   }

   public SSLSocketFactory method_36681() {
      return this.field_41325;
   }

   public HostnameVerifier method_36656() {
      return this.field_41320;
   }

   public class_4446 method_36659() {
      return this.field_41328;
   }

   public class_8631 method_36679() {
      return this.field_41308;
   }

   public class_8631 method_36670() {
      return this.field_41326;
   }

   public class_8467 method_36665() {
      return this.field_41324;
   }

   public boolean method_36675() {
      return this.field_41317;
   }

   public boolean method_36669() {
      return this.field_41335;
   }

   public boolean method_36668() {
      return this.field_41307;
   }

   public class_1666 method_36655() {
      return this.field_41336;
   }

   public List<class_7976> method_36676() {
      return this.field_41310;
   }

   public List<class_5083> method_36660() {
      return this.field_41312;
   }

   public List<class_9833> method_36677() {
      return this.field_41319;
   }

   public List<class_9833> method_36663() {
      return this.field_41323;
   }

   public class_5843 method_36667() {
      return this.field_41327;
   }

   @Override
   public class_4365 method_12900(class_3918 var1) {
      return new class_1987(this, var1, false);
   }

   @Override
   public class_6752 method_15276(class_3918 var1, class_7270 var2) {
      class_4046 var5 = new class_4046(var1, var2, new Random());
      var5.method_18631(this);
      return var5;
   }

   public class_7725 method_36664() {
      return new class_7725(this);
   }

   static {
      class_1850.field_9389 = new class_783();
   }
}
