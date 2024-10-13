package mapped;

import javax.net.SocketFactory;
import javax.net.ssl.*;
import java.net.Proxy;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Class2391 implements Cloneable, Class2393, Class2392 {
   public static final List<Class2201> field16284 = Class9474.<Class2201>method36541(Class2201.field14388, Class2201.field14386);
   public static final List<Class8574> field16285 = Class9474.<Class8574>method36541(Class8574.field38546, Class8574.field38548);
   public final Class7281 field16286;
   public final Proxy field16287;
   public final List<Class2201> field16288;
   public final List<Class8574> field16289;
   public final List<Class6172> field16290;
   public final List<Class6172> field16291;
   public final Class8774 field16292;
   public final ProxySelector field16293;
   public final Class9520 field16294;
   public final Class1715 field16295;
   public final Class8530 field16296;
   public final SocketFactory field16297;
   public final HostnameVerifier field16300;
   public final Class8110 field16302;
   public final Class8110 field16303;
   public final Class9457 field16304;
   public final Class7004 field16305;
   public final boolean field16306;
   public final boolean field16307;
   public final boolean field16308;
   public final int field16309;
   public final int field16310;
   public final int field16311;
   public final int field16312;

   public Class2391() {
      this(new Class9260());
   }

   public Class2391(Class9260 var1) {
      this.field16286 = var1.field42568;
      this.field16287 = var1.field42569;
      this.field16288 = var1.field42570;
      this.field16289 = var1.field42571;
      this.field16290 = Class9474.<Class6172>method36540(var1.field42572);
      this.field16291 = Class9474.<Class6172>method36540(var1.field42573);
      this.field16292 = var1.field42574;
      this.field16293 = var1.field42575;
      this.field16294 = var1.field42576;
      this.field16295 = var1.field42577;
      this.field16296 = var1.field42578;
      this.field16297 = var1.field42579;
      boolean var4 = false;

      for (Class8574 var6 : this.field16289) {
         var4 = var4 || var6.method30638();
      }

      this.field16300 = var1.field42582;
      this.field16302 = var1.field42584;
      this.field16303 = var1.field42585;
      this.field16304 = var1.field42586;
      this.field16305 = var1.field42587;
      this.field16306 = var1.field42588;
      this.field16307 = var1.field42589;
      this.field16308 = var1.field42590;
      this.field16309 = var1.field42591;
      this.field16310 = var1.field42592;
      this.field16311 = var1.field42593;
      this.field16312 = var1.field42594;
   }

   private X509TrustManager method9800() {
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

   public int method9802() {
      return this.field16309;
   }

   public int method9803() {
      return this.field16310;
   }

   public int method9804() {
      return this.field16311;
   }

   public int method9805() {
      return this.field16312;
   }

   public Proxy method9806() {
      return this.field16287;
   }

   public ProxySelector method9807() {
      return this.field16293;
   }

   public Class9520 method9808() {
      return this.field16294;
   }

   public Class1715 method9809() {
      return this.field16295;
   }

   public Class8530 method9810() {
      return this.field16295 == null ? this.field16296 : this.field16295.field9367;
   }

   public Class7004 method9811() {
      return this.field16305;
   }

   public SocketFactory method9812() {
      return this.field16297;
   }

   public Class8110 method9816() {
      return this.field16303;
   }

   public Class8110 method9817() {
      return this.field16302;
   }

   public Class9457 method9818() {
      return this.field16304;
   }

   public boolean method9819() {
      return this.field16306;
   }

   public boolean method9820() {
      return this.field16307;
   }

   public boolean method9821() {
      return this.field16308;
   }

   public Class7281 method9822() {
      return this.field16286;
   }

   public List<Class2201> method9823() {
      return this.field16288;
   }

   public List<Class8574> method9824() {
      return this.field16289;
   }

   public List<Class6172> method9825() {
      return this.field16290;
   }

   public List<Class6172> method9826() {
      return this.field16291;
   }

   public Class8774 method9827() {
      return this.field16292;
   }

   @Override
   public Class2370 method9828(Class8223 var1) {
      return new Class2371(this, var1, false);
   }

   @Override
   public Class8213 method9829(Class8223 var1, Class8681 var2) {
      Class8212 var5 = new Class8212(var1, var2, new Random());
      var5.method28541(this);
      return var5;
   }

   public Class9260 method9830() {
      return new Class9260(this);
   }

   static {
      Class6605.field29047 = new Class6604();
   }
}
