package remapped;

import java.net.MalformedURLException;
import java.net.Socket;
import java.net.UnknownHostException;
import javax.net.ssl.SSLSocket;

public final class class_783 extends class_1850 {
   private static String[] field_4209;

   @Override
   public void method_8186(class_7414 var1, String var2) {
      var1.method_33779(var2);
   }

   @Override
   public void method_8187(class_7414 var1, String var2, String var3) {
      var1.method_33780(var2, var3);
   }

   @Override
   public void method_8177(class_7725 var1, class_4957 var2) {
      var1.method_34940(var2);
   }

   @Override
   public boolean method_8180(class_8467 var1, class_1617 var2) {
      return var1.method_38943(var2);
   }

   @Override
   public class_1617 method_8190(class_8467 var1, class_497 var2, class_327 var3, class_2535 var4) {
      return var1.method_38944(var2, var3, var4);
   }

   @Override
   public boolean method_8179(class_497 var1, class_497 var2) {
      return var1.method_2478(var2);
   }

   @Override
   public Socket method_8175(class_8467 var1, class_497 var2, class_327 var3) {
      return var1.method_38939(var2, var3);
   }

   @Override
   public void method_8189(class_8467 var1, class_1617 var2) {
      var1.method_38942(var2);
   }

   @Override
   public class_5740 method_8183(class_8467 var1) {
      return var1.field_43278;
   }

   @Override
   public int method_8181(class_7775 var1) {
      return var1.field_39414;
   }

   @Override
   public void method_8178(class_5083 var1, SSLSocket var2, boolean var3) {
      var1.method_23363(var2, var3);
   }

   @Override
   public class_1672 method_8176(String var1) throws MalformedURLException, UnknownHostException {
      return class_1672.method_7469(var1);
   }

   @Override
   public class_327 method_8182(class_4365 var1) {
      return ((class_1987)var1).method_9166();
   }

   @Override
   public class_4365 method_8184(class_8075 var1, class_3918 var2) {
      return new class_1987(var1, var2, true);
   }
}
