package remapped;

import io.socket.utf8.UTF8Exception;
import java.util.Map;

public abstract class class_2291 extends class_4167 {
   public static final String field_11430 = "open";
   public static final String field_11445 = "close";
   public static final String field_11447 = "packet";
   public static final String field_11441 = "drain";
   public static final String field_11437 = "error";
   public static final String field_11440 = "requestHeaders";
   public static final String field_11442 = "responseHeaders";
   public boolean field_11436;
   public String field_11434;
   public Map<String, String> field_11448;
   public boolean field_11433;
   public boolean field_11444;
   public int field_11432;
   public String field_11443;
   public String field_11431;
   public String field_11446;
   public class_1144 field_11449;
   public class_8029 field_11435;
   public class_3323 field_11439;
   public class_2839 field_11438;

   public class_2291(class_3198 var1) {
      this.field_11443 = var1.field_15975;
      this.field_11431 = var1.field_15974;
      this.field_11432 = var1.field_15982;
      this.field_11433 = var1.field_15978;
      this.field_11448 = var1.field_15971;
      this.field_11446 = var1.field_15976;
      this.field_11444 = var1.field_15973;
      this.field_11449 = var1.field_15972;
      this.field_11439 = var1.field_15977;
      this.field_11438 = var1.field_15979;
   }

   public class_2291 method_10546(String var1, Exception var2) {
      class_5773 var5 = new class_5773(var1, var2);
      this.method_19325("error", new Object[]{var5});
      return this;
   }

   public class_2291 method_10548() {
      class_8482.method_39073(new class_8971(this));
      return this;
   }

   public class_2291 method_10547() {
      class_8482.method_39073(new class_4909(this));
      return this;
   }

   public void method_10541(class_8970[] var1) {
      class_8482.method_39073(new class_4143(this, var1));
   }

   public void method_10551() {
      this.field_11435 = class_8029.field_41101;
      this.field_11436 = true;
      this.method_19325("open", new Object[0]);
   }

   public void method_10544(String var1) {
      this.method_10550(class_8887.method_40913(var1));
   }

   public void method_10545(byte[] var1) {
      this.method_10550(class_8887.method_40915(var1));
   }

   public void method_10550(class_8970 var1) {
      this.method_19325("packet", new Object[]{var1});
   }

   public void method_10552() {
      this.field_11435 = class_8029.field_41098;
      this.method_19325("close", new Object[0]);
   }

   public abstract void method_10543(class_8970[] var1) throws UTF8Exception;

   public abstract void method_10542();

   public abstract void method_10549();
}
