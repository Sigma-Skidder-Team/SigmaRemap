package remapped;

import io.socket.utf8.UTF8Exception;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.logging.Logger;

public class class_1161 extends class_2291 {
   public static final String field_6587 = "websocket";
   private static final Logger field_6588 = Logger.getLogger(class_5831.class.getName());
   private class_6752 field_6585;

   public class_1161(class_3198 var1) {
      super(var1);
      this.field_11434 = "websocket";
   }

   @Override
   public void method_10542() {
      TreeMap var3 = new TreeMap(String.CASE_INSENSITIVE_ORDER);
      this.method_19325("requestHeaders", new Object[]{var3});
      Object var5 = this.field_11439 == null ? new class_8075() : this.field_11439;
      class_2415 var6 = new class_2415().method_11005(this.method_5174());

      for (Entry var8 : var3.entrySet()) {
         for (String var10 : (List)var8.getValue()) {
            var6.method_11020((String)var8.getKey(), var10);
         }
      }

      class_3918 var11 = var6.method_11013();
      this.field_6585 = ((class_3323)var5).method_15276(var11, new class_5516(this, this));
   }

   @Override
   public void method_10543(class_8970[] var1) throws UTF8Exception {
      class_1161 var4 = this;
      this.field_11436 = false;
      class_5250 var5 = new class_5250(this, this);
      int[] var6 = new int[]{var1.length};

      for (class_8970 var10 : var1) {
         if (this.field_11435 != class_8029.field_41097 && this.field_11435 != class_8029.field_41101) {
            break;
         }

         class_8887.method_40911(var10, new class_8904(this, var4, var6, var5));
      }
   }

   @Override
   public void method_10549() {
      if (this.field_6585 != null) {
         this.field_6585.method_30956(1000, "");
         this.field_6585 = null;
      }
   }

   public String method_5174() {
      Object var3 = this.field_11448;
      if (var3 == null) {
         var3 = new HashMap();
      }

      String var4 = !this.field_11433 ? "ws" : "wss";
      String var5 = "";
      if (this.field_11432 > 0 && ("wss".equals(var4) && this.field_11432 != 443 || "ws".equals(var4) && this.field_11432 != 80)) {
         var5 = ":" + this.field_11432;
      }

      if (this.field_11444) {
         var3.put(this.field_11446, class_6987.method_31967());
      }

      String var6 = class_7718.method_34911((Map<String, String>)var3);
      if (var6.length() > 0) {
         var6 = "?" + var6;
      }

      boolean var7 = this.field_11431.contains(":");
      return var4 + "://" + (!var7 ? this.field_11431 : "[" + this.field_11431 + "]") + var5 + this.field_11443 + var6;
   }
}
