package remapped;

import java.util.logging.Level;
import java.util.logging.Logger;

public class class_5831 extends class_6586 {
   private static final Logger field_29591 = Logger.getLogger(class_5831.class.getName());
   private static boolean field_29589 = field_29591.isLoggable(Level.FINE);

   public class_5831(class_3198 var1) {
      super(var1);
   }

   public class_3624 method_26395() {
      return this.method_26396(null);
   }

   public class_3624 method_26396(class_8321 var1) {
      if (var1 == null) {
         var1 = new class_8321();
      }

      var1.field_42623 = this.method_30089();
      var1.field_42619 = this.field_11438;
      class_3624 var4 = new class_3624(var1);
      var4.method_19329("requestHeaders", new class_7546(this, this)).method_19329("responseHeaders", new class_1055(this, this));
      return var4;
   }

   @Override
   public void method_30092(byte[] var1, Runnable var2) {
      this.method_26392(var1, var2);
   }

   @Override
   public void method_30091(String var1, Runnable var2) {
      this.method_26392(var1, var2);
   }

   private void method_26392(Object var1, Runnable var2) {
      class_8321 var5 = new class_8321();
      var5.field_42621 = "POST";
      var5.field_42620 = var1;
      class_3624 var6 = this.method_26396(var5);
      var6.method_19329("success", new class_8681(this, var2));
      var6.method_19329("error", new class_9351(this, this));
      var6.method_16885();
   }

   @Override
   public void method_30087() {
      field_29591.fine("xhr poll");
      class_3624 var3 = this.method_26395();
      var3.method_19329("data", new class_4882(this, this));
      var3.method_19329("error", new class_5349(this, this));
      var3.method_16885();
   }
}
