package remapped;

import java.io.IOException;
import java.util.ArrayList;

public final class class_1987 implements class_4365 {
   public final class_8075 field_10062;
   public final class_507 field_10066;
   public final class_213 field_10060;
   public final class_3918 field_10061;
   public final boolean field_10064;
   private boolean field_10063;

   public class_1987(class_8075 var1, class_3918 var2, boolean var3) {
      class_5843 var6 = var1.method_36667();
      this.field_10062 = var1;
      this.field_10061 = var2;
      this.field_10064 = var3;
      this.field_10066 = new class_507(var1, var3);
      this.field_10060 = var6.method_26650(this);
   }

   @Override
   public class_3918 method_20243() {
      return this.field_10061;
   }

   @Override
   public class_7839 method_20241() throws IOException {
      synchronized (this) {
         if (this.field_10063) {
            throw new IllegalStateException("Already Executed");
         }

         this.field_10063 = true;
      }

      this.method_9167();

      class_7839 var4;
      try {
         this.field_10062.method_36655().method_7422(this);
         class_7839 var3 = this.method_9165();
         if (var3 == null) {
            throw new IOException("Canceled");
         }

         var4 = var3;
      } finally {
         this.field_10062.method_36655().method_7427(this);
      }

      return var4;
   }

   private void method_9167() {
      Object var3 = class_3307.method_15163().method_15176("response.body().close()");
      this.field_10066.method_2507(var3);
   }

   @Override
   public void method_20242(class_120 var1) {
      synchronized (this) {
         if (this.field_10063) {
            throw new IllegalStateException("Already Executed");
         }

         this.field_10063 = true;
      }

      this.method_9167();
      this.field_10062.method_36655().method_7431(new class_9722(this, var1));
   }

   @Override
   public void method_20244() {
      this.field_10066.method_2509();
   }

   @Override
   public synchronized boolean method_20240() {
      return this.field_10063;
   }

   @Override
   public boolean method_20245() {
      return this.field_10066.method_2508();
   }

   public class_1987 clone() {
      return new class_1987(this.field_10062, this.field_10061, this.field_10064);
   }

   public class_327 method_9166() {
      return this.field_10066.method_2515();
   }

   public String method_9162() {
      return (!this.method_20245() ? "" : "canceled ") + (!this.field_10064 ? "call" : "web socket") + " to " + this.method_9163();
   }

   public String method_9163() {
      return this.field_10061.method_18136().method_7482();
   }

   public class_7839 method_9165() throws IOException {
      ArrayList var3 = new ArrayList();
      var3.addAll(this.field_10062.method_36677());
      var3.add(this.field_10066);
      var3.add(new class_4553(this.field_10062.method_36661()));
      var3.add(new class_740(this.field_10062.method_36653()));
      var3.add(new class_4778(this.field_10062));
      if (!this.field_10064) {
         var3.addAll(this.field_10062.method_36663());
      }

      var3.add(new class_6102(this.field_10064));
      class_3805 var4 = new class_3805(var3, null, null, null, 0, this.field_10061);
      return var4.method_36514(this.field_10061);
   }
}
