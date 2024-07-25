package remapped;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.logging.Level;
import java.util.logging.Logger;

public class class_3484 extends class_4167 {
   private static final Logger field_17084 = Logger.getLogger(class_3484.class.getName());
   public static final String field_17087 = "connect";
   public static final String field_17103 = "connecting";
   public static final String field_17082 = "disconnect";
   public static final String field_17081 = "error";
   public static final String field_17101 = "message";
   public static final String field_17098 = "connect_error";
   public static final String field_17089 = "connect_timeout";
   public static final String field_17093 = "reconnect";
   public static final String field_17083 = "reconnect_error";
   public static final String field_17092 = "reconnect_failed";
   public static final String field_17085 = "reconnect_attempt";
   public static final String field_17096 = "reconnecting";
   public static final String field_17091 = "ping";
   public static final String field_17079 = "pong";
   public static Map<String, Integer> field_17095 = new class_8024();
   public String field_17080;
   private volatile boolean field_17099;
   private int field_17077;
   private String field_17100;
   private class_1289 field_17088;
   private String field_17078;
   private Map<Integer, class_9240> field_17090 = new HashMap<Integer, class_9240>();
   private Queue<class_7381> field_17094;
   private final Queue<List<Object>> field_17086 = new LinkedList<List<Object>>();
   private final Queue<class_3872<class_1336>> field_17102 = new LinkedList<class_3872<class_1336>>();

   public class_3484(class_1289 var1, String var2, class_9456 var3) {
      this.field_17088 = var1;
      this.field_17100 = var2;
      if (var3 != null) {
         this.field_17078 = var3.field_30043;
      }
   }

   private void method_16016() {
      if (this.field_17094 == null) {
         class_1289 var3 = this.field_17088;
         this.field_17094 = new class_1757(this, var3);
      }
   }

   public class_3484 method_16021() {
      class_8482.method_39073(new class_1674(this));
      return this;
   }

   public class_3484 method_15999() {
      return this.method_16021();
   }

   public class_3484 method_16005(Object... var1) {
      class_8482.method_39073(new class_8789(this, var1));
      return this;
   }

   @Override
   public class_4167 method_19325(String var1, Object... var2) {
      class_8482.method_39073(new class_3127(this, var1, var2));
      return this;
   }

   public class_4167 method_16001(String var1, Object[] var2, class_9240 var3) {
      class_8482.method_39073(new class_521(this, var1, var2, var3));
      return this;
   }

   private void method_16010(class_3872 var1) {
      var1.field_18859 = this.field_17100;
      this.field_17088.method_5776(var1);
   }

   private void method_15986() {
      field_17084.fine("transport is open - connecting");
      if (!"/".equals(this.field_17100)) {
         if (this.field_17078 != null && !this.field_17078.isEmpty()) {
            class_3872 var3 = new class_3872(0);
            var3.field_18860 = this.field_17078;
            this.method_16010(var3);
         } else {
            this.method_16010(new class_3872(0));
         }
      }
   }

   private void method_15990(String var1) {
      if (field_17084.isLoggable(Level.FINE)) {
         field_17084.fine(String.format("close (%s)", var1));
      }

      this.field_17099 = false;
      this.field_17080 = null;
      this.method_19325("disconnect", var1);
   }

   private void method_16014(class_3872<?> var1) {
      if (this.field_17100.equals(var1.field_18859)) {
         switch (var1.field_18858) {
            case 0:
               this.method_16018();
               break;
            case 1:
               this.method_16009();
               break;
            case 2:
               this.method_16002(var1);
               break;
            case 3:
               this.method_15987(var1);
               break;
            case 4:
               this.method_19325("error", var1.field_18855);
               break;
            case 5:
               this.method_16002(var1);
               break;
            case 6:
               this.method_15987(var1);
         }
      }
   }

   private void method_16002(class_3872<class_1336> var1) {
      ArrayList var4 = new ArrayList<Object>(Arrays.asList(method_15998((class_1336)var1.field_18855)));
      if (field_17084.isLoggable(Level.FINE)) {
         field_17084.fine(String.format("emitting event %s", var4));
      }

      if (var1.field_18861 >= 0) {
         field_17084.fine("attaching ack callback to event");
         var4.add(this.method_16012(var1.field_18861));
      }

      if (!this.field_17099) {
         this.field_17086.add(var4);
      } else {
         if (var4.isEmpty()) {
            return;
         }

         String var5 = var4.remove(0).toString();
         super.method_19325(var5, var4.toArray());
      }
   }

   private class_9240 method_16012(int var1) {
      boolean[] var5 = new boolean[]{false};
      return new class_1644(this, var5, var1, this);
   }

   private void method_15987(class_3872<class_1336> var1) {
      class_9240 var4 = this.field_17090.remove(var1.field_18861);
      if (var4 == null) {
         if (field_17084.isLoggable(Level.FINE)) {
            field_17084.fine(String.format("bad ack %s", var1.field_18861));
         }
      } else {
         if (field_17084.isLoggable(Level.FINE)) {
            field_17084.fine(String.format("calling ack %s with %s", var1.field_18861, var1.field_18855));
         }

         var4.method_42606(method_15998((class_1336)var1.field_18855));
      }
   }

   private void method_16018() {
      this.field_17099 = true;
      this.method_19325("connect");
      this.method_15989();
   }

   private void method_15989() {
      List var3;
      while ((var3 = this.field_17086.poll()) != null) {
         String var4 = (String)var3.get(0);
         super.method_19325(var4, var3.toArray());
      }

      this.field_17086.clear();

      class_3872 var5;
      while ((var5 = this.field_17102.poll()) != null) {
         this.method_16010(var5);
      }

      this.field_17102.clear();
   }

   private void method_16009() {
      if (field_17084.isLoggable(Level.FINE)) {
         field_17084.fine(String.format("server disconnect (%s)", this.field_17100));
      }

      this.method_16011();
      this.method_15990("io server disconnect");
   }

   private void method_16011() {
      if (this.field_17094 != null) {
         for (class_7381 var4 : this.field_17094) {
            var4.method_33626();
         }

         this.field_17094 = null;
      }

      this.field_17088.method_5798(this);
   }

   public class_3484 method_15993() {
      class_8482.method_39073(new class_4684(this));
      return this;
   }

   public class_3484 method_15992() {
      return this.method_15993();
   }

   public class_1289 method_15996() {
      return this.field_17088;
   }

   public boolean method_16015() {
      return this.field_17099;
   }

   public String method_16003() {
      return this.field_17080;
   }

   private static Object[] method_15998(class_1336 var0) {
      int var3 = var0.method_6142();
      Object[] var4 = new Object[var3];

      for (int var5 = 0; var5 < var3; var5++) {
         Object var6;
         try {
            var6 = var0.method_6130(var5);
         } catch (class_7584 var8) {
            field_17084.log(Level.WARNING, "An error occured while retrieving data from JSONArray", (Throwable)var8);
            var6 = null;
         }

         var4[var5] = JSONObjectImpl.field_7112.equals(var6) ? null : var6;
      }

      return var4;
   }
}
