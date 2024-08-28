package mapped;

import java.net.MalformedURLException;
import java.net.Socket;
import java.net.UnknownHostException;
import javax.net.ssl.SSLSocket;

public final class Class6604 extends Class6605 {
   private static String[] field29046;

   @Override
   public void method20014(Class9192 var1, String var2) {
      var1.method34434(var2);
   }

   @Override
   public void method20015(Class9192 var1, String var2, String var3) {
      var1.method34437(var2, var3);
   }

   @Override
   public void method20016(Class9260 var1, Class8530 var2) {
      var1.method34827(var2);
   }

   @Override
   public boolean method20017(Class9457 var1, Class7263 var2) {
      return var1.method36396(var2);
   }

   @Override
   public Class7263 method20018(Class9457 var1, Class6165 var2, Class5751 var3, Class7723 var4) {
      return var1.method36393(var2, var3, var4);
   }

   @Override
   public boolean method20019(Class6165 var1, Class6165 var2) {
      return var1.method19060(var2);
   }

   @Override
   public Socket method20020(Class9457 var1, Class6165 var2, Class5751 var3) {
      return var1.method36394(var2, var3);
   }

   @Override
   public void method20021(Class9457 var1, Class7263 var2) {
      var1.method36395(var2);
   }

   @Override
   public Class8743 method20022(Class9457 var1) {
      return var1.field43944;
   }

   @Override
   public int method20023(Class9279 var1) {
      return var1.field42686;
   }

   @Override
   public void method20024(Class8574 var1, SSLSocket var2, boolean var3) {
      var1.method30642(var2, var3);
   }

   @Override
   public Class7284 method20025(String var1) throws MalformedURLException, UnknownHostException {
      return Class7284.method22968(var1);
   }

   @Override
   public Class5751 method20026(Class2370 var1) {
      return ((Class2371)var1).method9551();
   }

   @Override
   public Class2370 method20027(Class2391 var1, Class8223 var2) {
      return new Class2371(var1, var2, true);
   }
}
