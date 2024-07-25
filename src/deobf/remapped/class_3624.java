package remapped;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class class_3624 extends class_4167 {
   public static final String field_17678 = "success";
   public static final String field_17684 = "data";
   public static final String field_17674 = "error";
   public static final String field_17687 = "requestHeaders";
   public static final String field_17673 = "responseHeaders";
   private static final String field_17683 = "application/octet-stream";
   private static final String field_17680 = "text/plain;charset=UTF-8";
   private static final class_1972 field_17677 = class_1972.method_9069(field_17675[4]);
   private static final class_1972 field_17681 = class_1972.method_9069(field_17675[5]);
   private String field_17686;
   private String field_17672;
   private Object field_17679;
   private class_2839 field_17682;
   private class_7839 field_17685;
   private class_4365 field_17676;

   public class_3624(class_8321 var1) {
      this.field_17686 = var1.field_42621 == null ? "GET" : var1.field_42621;
      this.field_17672 = var1.field_42623;
      this.field_17679 = var1.field_42620;
      this.field_17682 = (class_2839)(var1.field_42619 == null ? new class_8075() : var1.field_42619);
   }

   public void method_16885() {
      if (class_5831.method_26394()) {
         class_5831.method_26390().fine(String.format("xhr open %s: %s", this.field_17686, this.field_17672));
      }

      TreeMap var4 = new TreeMap(String.CASE_INSENSITIVE_ORDER);
      if ("POST".equals(this.field_17686)) {
         if (!(this.field_17679 instanceof byte[])) {
            var4.put("Content-type", new LinkedList<String>(Collections.singletonList("text/plain;charset=UTF-8")));
         } else {
            var4.put("Content-type", new LinkedList<String>(Collections.singletonList("application/octet-stream")));
         }
      }

      var4.put("Accept", new LinkedList<String>(Collections.singletonList("*/*")));
      this.method_16882(var4);
      if (class_5831.method_26394()) {
         class_5831.method_26390()
            .fine(
               String.format(
                  "sending xhr with url %s | data %s",
                  this.field_17672,
                  !(this.field_17679 instanceof byte[]) ? this.field_17679 : Arrays.toString((byte[])this.field_17679)
               )
            );
      }

      class_2415 var5 = new class_2415();

      for (Entry var7 : var4.entrySet()) {
         for (String var9 : (List)var7.getValue()) {
            var5.method_11020((String)var7.getKey(), var9);
         }
      }

      class_9001 var10 = null;
      if (!(this.field_17679 instanceof byte[])) {
         if (this.field_17679 instanceof String) {
            var10 = class_9001.method_41292(field_17681, (String)this.field_17679);
         }
      } else {
         var10 = class_9001.method_41294(field_17677, (byte[])this.field_17679);
      }

      class_3918 var11 = var5.method_11007(class_1672.method_7484(this.field_17672)).method_11008(this.field_17686, var10).method_11013();
      this.field_17676 = this.field_17682.method_12900(var11);
      this.field_17676.method_20242(new class_505(this, this));
   }

   private void method_16884() {
      this.method_19325("success", new Object[0]);
   }

   private void method_16879(String var1) {
      this.method_19325("data", new Object[]{var1});
      this.method_16884();
   }

   private void method_16880(byte[] var1) {
      this.method_19325("data", new Object[]{var1});
      this.method_16884();
   }

   private void method_16888(Exception var1) {
      this.method_19325("error", new Object[]{var1});
   }

   private void method_16882(Map<String, List<String>> var1) {
      this.method_19325("requestHeaders", new Object[]{var1});
   }

   private void method_16886(Map<String, List<String>> var1) {
      this.method_19325("responseHeaders", new Object[]{var1});
   }

   private void method_16890() {
      class_8856 var3 = this.field_17685.method_35481();
      String var4 = var3.method_40738().toString();

      try {
         if ("application/octet-stream".equalsIgnoreCase(var4)) {
            this.method_16880(var3.method_40734());
         } else {
            this.method_16879(var3.method_40737());
         }
      } catch (IOException var6) {
         this.method_16888(var6);
      }
   }
}
