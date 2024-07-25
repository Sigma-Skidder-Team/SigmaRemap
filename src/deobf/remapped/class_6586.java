package remapped;

import io.socket.utf8.UTF8Exception;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class class_6586 extends class_2291 {
   private static final Logger field_33583 = Logger.getLogger(class_6586.class.getName());
   public static final String field_33582 = "polling";
   public static final String field_33580 = "poll";
   public static final String field_33581 = "pollComplete";
   private boolean field_33579;

   public class_6586(class_3198 var1) {
      super(var1);
      this.field_11434 = "polling";
   }

   @Override
   public void method_10542() {
      this.method_30094();
   }

   public void method_30090(Runnable var1) {
      class_8482.method_39073(new class_4144(this, var1));
   }

   private void method_30094() {
      field_33583.fine("polling");
      this.field_33579 = true;
      this.method_30087();
      this.method_19325("poll", new Object[0]);
   }

   @Override
   public void method_10544(String var1) {
      this.method_30093(var1);
   }

   @Override
   public void method_10545(byte[] var1) {
      this.method_30093(var1);
   }

   private void method_30093(Object var1) {
      if (field_33583.isLoggable(Level.FINE)) {
         field_33583.fine(String.format("polling got data %s", var1));
      }

      class_8320 var5 = new class_8320(this, this);
      if (!(var1 instanceof String)) {
         if (var1 instanceof byte[]) {
            class_8887.method_40909((byte[])var1, var5);
         }
      } else {
         class_8887.method_40908((String)var1, var5);
      }

      if (this.field_11435 != class_8029.field_41098) {
         this.field_33579 = false;
         this.method_19325("pollComplete", new Object[0]);
         if (this.field_11435 != class_8029.field_41101) {
            if (field_33583.isLoggable(Level.FINE)) {
               field_33583.fine(String.format("ignoring poll - transport state '%s'", this.field_11435));
            }
         } else {
            this.method_30094();
         }
      }
   }

   @Override
   public void method_10549() {
      class_6425 var4 = new class_6425(this, this);
      if (this.field_11435 != class_8029.field_41101) {
         field_33583.fine("transport not open - deferring close");
         this.method_19331("open", var4);
      } else {
         field_33583.fine("transport open - closing");
         var4.method_28452();
      }
   }

   @Override
   public void method_10543(class_8970[] var1) throws UTF8Exception {
      this.field_11436 = false;
      class_9580 var5 = new class_9580(this, this);
      class_8887.method_40907(var1, new class_4674(this, this, var5));
   }

   public String method_30089() {
      Object var3 = this.field_11448;
      if (var3 == null) {
         var3 = new HashMap();
      }

      String var4 = !this.field_11433 ? "http" : "https";
      String var5 = "";
      if (this.field_11444) {
         var3.put(this.field_11446, class_6987.method_31967());
      }

      String var6 = class_7718.method_34911((Map<String, String>)var3);
      if (this.field_11432 > 0 && ("https".equals(var4) && this.field_11432 != 443 || "http".equals(var4) && this.field_11432 != 80)) {
         var5 = ":" + this.field_11432;
      }

      if (var6.length() > 0) {
         var6 = "?" + var6;
      }

      boolean var7 = this.field_11431.contains(":");
      return var4 + "://" + (!var7 ? this.field_11431 : "[" + this.field_11431 + "]") + var5 + this.field_11443 + var6;
   }

   public abstract void method_30092(byte[] var1, Runnable var2);

   public abstract void method_30091(String var1, Runnable var2);

   public abstract void method_30087();
}
