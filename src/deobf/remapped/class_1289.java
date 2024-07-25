package remapped;

import java.net.URI;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Timer;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class class_1289 extends class_4167 {
   private static final Logger field_7100 = Logger.getLogger(class_1289.class.getName());
   public static final String field_7102 = "open";
   public static final String field_7088 = "close";
   public static final String field_7083 = "packet";
   public static final String field_7090 = "error";
   public static final String field_7077 = "connect_error";
   public static final String field_7075 = "connect_timeout";
   public static final String field_7078 = "reconnect";
   public static final String field_7081 = "reconnect_error";
   public static final String field_7099 = "reconnect_failed";
   public static final String field_7096 = "reconnect_attempt";
   public static final String field_7103 = "reconnecting";
   public static final String field_7080 = "ping";
   public static final String field_7066 = "pong";
   public static final String field_7079 = "transport";
   public static class_3323 field_7104;
   public static class_2839 field_7082;
   public class_8916 field_7086;
   private boolean field_7071;
   private boolean field_7093;
   private boolean field_7068;
   private boolean field_7097;
   private int field_7094;
   private long field_7095;
   private long field_7092;
   private double field_7073;
   private class_8185 field_7076;
   private long field_7084;
   private Set<class_3484> field_7091 = new HashSet<class_3484>();
   private Date field_7089;
   private URI field_7067;
   private List<class_3872> field_7085;
   private Queue<class_7381> field_7069;
   private class_9456 field_7070;
   public class_1144 field_7072;
   private class_5289 field_7074;
   private class_9009 field_7098;
   public ConcurrentHashMap<String, class_3484> field_7101;

   public class_1289() {
      this(null, null);
   }

   public class_1289(URI var1) {
      this(var1, null);
   }

   public class_1289(class_9456 var1) {
      this(null, var1);
   }

   public class_1289(URI var1, class_9456 var2) {
      if (var2 == null) {
         var2 = new class_9456();
      }

      if (var2.field_15975 == null) {
         var2.field_15975 = "/socket.io";
      }

      if (var2.field_15977 == null) {
         var2.field_15977 = field_7104;
      }

      if (var2.field_15979 == null) {
         var2.field_15979 = field_7082;
      }

      this.field_7070 = var2;
      this.field_7101 = new ConcurrentHashMap<String, class_3484>();
      this.field_7069 = new LinkedList<class_7381>();
      this.method_5792(var2.field_48250);
      this.method_5783(var2.field_48247 == 0 ? Integer.MAX_VALUE : var2.field_48247);
      this.method_5788(var2.field_48251 == 0L ? 1000L : var2.field_48251);
      this.method_5800(var2.field_48245 == 0L ? 5000L : var2.field_48245);
      this.method_5749(var2.field_48248 == 0.0 ? 0.5 : var2.field_48248);
      this.field_7076 = new class_8185().method_37508(this.method_5787()).method_37505(this.method_5799()).method_37509(this.method_5748());
      this.method_5753(var2.field_48249);
      this.field_7086 = class_8916.field_45715;
      this.field_7067 = var1;
      this.field_7097 = false;
      this.field_7085 = new ArrayList<class_3872>();
      this.field_7074 = (class_5289)(var2.field_48246 == null ? new class_4794() : var2.field_48246);
      this.field_7098 = (class_9009)(var2.field_48253 == null ? new class_5547() : var2.field_48253);
   }

   private void method_5762(String var1, Object... var2) {
      this.method_19325(var1, var2);

      for (class_3484 var6 : this.field_7101.values()) {
         var6.method_19325(var1, var2);
      }
   }

   private void method_5756() {
      for (Entry var4 : this.field_7101.entrySet()) {
         String var5 = (String)var4.getKey();
         class_3484 var6 = (class_3484)var4.getValue();
         var6.field_17080 = this.method_5777(var5);
      }
   }

   private String method_5777(String var1) {
      return (!"/".equals(var1) ? var1 + "#" : "") + this.field_7072.method_5043();
   }

   public boolean method_5791() {
      return this.field_7071;
   }

   public class_1289 method_5792(boolean var1) {
      this.field_7071 = var1;
      return this;
   }

   public int method_5782() {
      return this.field_7094;
   }

   public class_1289 method_5783(int var1) {
      this.field_7094 = var1;
      return this;
   }

   public final long method_5787() {
      return this.field_7095;
   }

   public class_1289 method_5788(long var1) {
      this.field_7095 = var1;
      if (this.field_7076 != null) {
         this.field_7076.method_37508(var1);
      }

      return this;
   }

   public final double method_5748() {
      return this.field_7073;
   }

   public class_1289 method_5749(double var1) {
      this.field_7073 = var1;
      if (this.field_7076 != null) {
         this.field_7076.method_37509(var1);
      }

      return this;
   }

   public final long method_5799() {
      return this.field_7092;
   }

   public class_1289 method_5800(long var1) {
      this.field_7092 = var1;
      if (this.field_7076 != null) {
         this.field_7076.method_37505(var1);
      }

      return this;
   }

   public long method_5752() {
      return this.field_7084;
   }

   public class_1289 method_5753(long var1) {
      this.field_7084 = var1;
      return this;
   }

   private void method_5763() {
      if (!this.field_7068 && this.field_7071 && this.field_7076.method_37504() == 0) {
         this.method_5773();
      }
   }

   public class_1289 method_5744() {
      return this.method_5745(null);
   }

   public class_1289 method_5745(class_6973 var1) {
      class_8482.method_39073(new class_1761(this, var1));
      return this;
   }

   private void method_5755() {
      field_7100.fine("open");
      this.method_5795();
      this.field_7086 = class_8916.field_45719;
      this.method_19325("open", new Object[0]);
      class_1144 var3 = this.field_7072;
      this.field_7069.add(class_2998.method_13702(var3, "data", new class_1106(this)));
      this.field_7069.add(class_2998.method_13702(var3, "ping", new class_6312(this)));
      this.field_7069.add(class_2998.method_13702(var3, "pong", new class_7089(this)));
      this.field_7069.add(class_2998.method_13702(var3, "error", new class_2657(this)));
      this.field_7069.add(class_2998.method_13702(var3, "close", new class_6184(this)));
      this.field_7098.method_41334(new class_3728(this));
   }

   private void method_5786() {
      this.field_7089 = new Date();
      this.method_5762("ping");
   }

   private void method_5750() {
      this.method_5762("pong", null == this.field_7089 ? 0L : new Date().getTime() - this.field_7089.getTime());
   }

   private void method_5778(String var1) {
      this.field_7098.method_41336(var1);
   }

   private void method_5779(byte[] var1) {
      this.field_7098.method_41337(var1);
   }

   private void method_5797(class_3872 var1) {
      this.method_19325("packet", new Object[]{var1});
   }

   private void method_5781(Exception var1) {
      field_7100.log(Level.FINE, "error", (Throwable)var1);
      this.method_5762("error", var1);
   }

   public class_3484 method_5794(String var1, class_9456 var2) {
      class_3484 var5 = this.field_7101.get(var1);
      if (var5 == null) {
         var5 = new class_3484(this, var1, var2);
         class_3484 var6 = this.field_7101.putIfAbsent(var1, var5);
         if (var6 == null) {
            var5.method_19329("connecting", new class_4151(this, this, var5));
            var5.method_19329("connect", new class_1825(this, var5, this, var1));
         } else {
            var5 = var6;
         }
      }

      return var5;
   }

   public class_3484 method_5793(String var1) {
      return this.method_5794(var1, null);
   }

   public void method_5798(class_3484 var1) {
      this.field_7091.remove(var1);
      if (this.field_7091.isEmpty()) {
         this.method_5796();
      }
   }

   public void method_5776(class_3872 var1) {
      if (field_7100.isLoggable(Level.FINE)) {
         field_7100.fine(String.format("writing packet %s", var1));
      }

      if (var1.field_18860 != null && !var1.field_18860.isEmpty() && var1.field_18858 == 0) {
         var1.field_18859 = var1.field_18859 + "?" + var1.field_18860;
      }

      if (this.field_7097) {
         this.field_7085.add(var1);
      } else {
         this.field_7097 = true;
         this.field_7074.method_24131(var1, new class_3109(this, this));
      }
   }

   private void method_5780() {
      if (!this.field_7085.isEmpty() && !this.field_7097) {
         class_3872 var3 = this.field_7085.remove(0);
         this.method_5776(var3);
      }
   }

   private void method_5795() {
      field_7100.fine("cleanup");

      class_7381 var3;
      while ((var3 = this.field_7069.poll()) != null) {
         var3.method_33626();
      }

      this.field_7098.method_41334(null);
      this.field_7085.clear();
      this.field_7097 = false;
      this.field_7089 = null;
      this.field_7098.method_41335();
   }

   public void method_5796() {
      field_7100.fine("disconnect");
      this.field_7093 = true;
      this.field_7068 = false;
      if (this.field_7086 != class_8916.field_45719) {
         this.method_5795();
      }

      this.field_7076.method_37506();
      this.field_7086 = class_8916.field_45715;
      if (this.field_7072 != null) {
         this.field_7072.method_5053();
      }
   }

   private void method_5742(String var1) {
      field_7100.fine("onclose");
      this.method_5795();
      this.field_7076.method_37506();
      this.field_7086 = class_8916.field_45715;
      this.method_19325("close", new Object[]{var1});
      if (this.field_7071 && !this.field_7093) {
         this.method_5773();
      }
   }

   private void method_5773() {
      if (!this.field_7068 && !this.field_7093) {
         if (this.field_7076.method_37504() < this.field_7094) {
            long var4 = this.field_7076.method_37510();
            field_7100.fine(String.format("will wait %dms before reconnect attempt", var4));
            this.field_7068 = true;
            Timer var6 = new Timer();
            var6.schedule(new class_5172(this, this), var4);
            this.field_7069.add(new class_4053(this, var6));
         } else {
            field_7100.fine("reconnect failed");
            this.field_7076.method_37506();
            this.method_5762("reconnect_failed");
            this.field_7068 = false;
         }
      }
   }

   private void method_5770() {
      int var3 = this.field_7076.method_37504();
      this.field_7068 = false;
      this.field_7076.method_37506();
      this.method_5756();
      this.method_5762("reconnect", var3);
   }
}
