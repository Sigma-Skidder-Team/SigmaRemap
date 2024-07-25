package remapped;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class class_4046 implements class_6752, class_3889 {
   private static final List<class_7976> field_19630 = Collections.<class_7976>singletonList(class_7976.field_40847);
   private static final long field_19637 = 16777216L;
   private static final long field_19632 = 60000L;
   private final class_3918 field_19642;
   public final class_7270 field_19653;
   private final Random field_19650;
   private final String field_19634;
   private class_4365 field_19641;
   private final Runnable field_19643;
   private class_7871 field_19646;
   private class_1308 field_19651;
   private ScheduledExecutorService field_19633;
   private class_7201 field_19631;
   private final ArrayDeque<class_9091> field_19644 = new ArrayDeque<class_9091>();
   private final ArrayDeque<Object> field_19648 = new ArrayDeque<Object>();
   private long field_19647;
   private boolean field_19652;
   private ScheduledFuture<?> field_19635;
   private int field_19638 = -1;
   private String field_19640;
   private boolean field_19639;
   public int field_19636;
   public int field_19645;

   public class_4046(class_3918 var1, class_7270 var2, Random var3) {
      if ("GET".equals(var1.method_18137())) {
         this.field_19642 = var1;
         this.field_19653 = var2;
         this.field_19650 = var3;
         byte[] var6 = new byte[16];
         var3.nextBytes(var6);
         this.field_19634 = class_9091.method_41910(var6).method_41880();
         this.field_19643 = new class_5429(this);
      } else {
         throw new IllegalArgumentException("Request must be GET: " + var1.method_18137());
      }
   }

   @Override
   public class_3918 method_30951() {
      return this.field_19642;
   }

   @Override
   public synchronized long method_30952() {
      return this.field_19647;
   }

   @Override
   public void method_30955() {
      this.field_19641.method_20244();
   }

   public void method_18631(class_8075 var1) {
      var1 = var1.method_36664().method_34930(field_19630).method_34955();
      int var4 = var1.method_36658();
      class_3918 var5 = this.field_19642
         .method_18140()
         .method_11009("Upgrade", "websocket")
         .method_11009("Connection", "Upgrade")
         .method_11009("Sec-WebSocket-Key", this.field_19634)
         .method_11009("Sec-WebSocket-Version", "13")
         .method_11013();
      this.field_19641 = class_1850.field_9389.method_8184(var1, var5);
      this.field_19641.method_20242(new class_7286(this, var5, var4));
   }

   public void method_18616(class_7839 var1) throws ProtocolException {
      if (var1.method_35490() == 101) {
         String var4 = var1.method_35472("Connection");
         if ("Upgrade".equalsIgnoreCase(var4)) {
            String var5 = var1.method_35472("Upgrade");
            if ("websocket".equalsIgnoreCase(var5)) {
               String var6 = var1.method_35472("Sec-WebSocket-Accept");
               String var7 = class_9091.method_41889(this.field_19634 + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").method_41896().method_41880();
               if (!var7.equals(var6)) {
                  throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + var7 + "' but was '" + var6 + "'");
               }
            } else {
               throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + var5 + "'");
            }
         } else {
            throw new ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + var4 + "'");
         }
      } else {
         throw new ProtocolException("Expected HTTP 101 response but was '" + var1.method_35490() + " " + var1.method_35476() + "'");
      }
   }

   public void method_18617(String var1, long var2, class_7201 var4) throws IOException {
      synchronized (this) {
         this.field_19631 = var4;
         this.field_19651 = new class_1308(var4.field_37012, var4.field_37011, this.field_19650);
         this.field_19633 = new ScheduledThreadPoolExecutor(1, class_8515.method_39209(var1, false));
         if (var2 != 0L) {
            this.field_19633.scheduleAtFixedRate(new class_4010(this), var2, var2, TimeUnit.MILLISECONDS);
         }

         if (!this.field_19648.isEmpty()) {
            this.method_18618();
         }
      }

      this.field_19646 = new class_7871(var4.field_37012, var4.field_37013, this);
   }

   public void method_18630() throws IOException {
      while (this.field_19638 == -1) {
         this.field_19646.method_35621();
      }
   }

   public boolean method_18624() throws IOException {
      try {
         this.field_19646.method_35621();
         return this.field_19638 == -1;
      } catch (Exception var4) {
         this.method_18619(var4, null);
         return false;
      }
   }

   public void method_18625(int var1, TimeUnit var2) throws InterruptedException {
      this.field_19633.awaitTermination((long)var1, var2);
   }

   public void method_18623() throws InterruptedException {
      if (this.field_19635 != null) {
         this.field_19635.cancel(false);
      }

      this.field_19633.shutdown();
      this.field_19633.awaitTermination(10L, TimeUnit.SECONDS);
   }

   public synchronized int method_18615() {
      return this.field_19636;
   }

   public synchronized int method_18628() {
      return this.field_19645;
   }

   @Override
   public void method_17999(String var1) throws IOException {
      this.field_19653.method_33221(this, var1);
   }

   @Override
   public void method_18000(class_9091 var1) throws IOException {
      this.field_19653.method_33222(this, var1);
   }

   @Override
   public synchronized void method_17998(class_9091 var1) {
      if (!this.field_19639 && (!this.field_19652 || !this.field_19648.isEmpty())) {
         this.field_19644.add(var1);
         this.method_18618();
         this.field_19636++;
      }
   }

   @Override
   public synchronized void method_18001(class_9091 var1) {
      this.field_19645++;
   }

   @Override
   public void method_17997(int var1, String var2) {
      if (var1 == -1) {
         throw new IllegalArgumentException();
      } else {
         class_7201 var5 = null;
         synchronized (this) {
            if (this.field_19638 != -1) {
               throw new IllegalStateException("already closed");
            }

            this.field_19638 = var1;
            this.field_19640 = var2;
            if (this.field_19652 && this.field_19648.isEmpty()) {
               var5 = this.field_19631;
               this.field_19631 = null;
               if (this.field_19635 != null) {
                  this.field_19635.cancel(false);
               }

               this.field_19633.shutdown();
            }
         }

         try {
            this.field_19653.method_33219(this, var1, var2);
            if (var5 != null) {
               this.field_19653.method_33223(this, var1, var2);
            }
         } finally {
            class_8515.method_39200(var5);
         }
      }
   }

   @Override
   public boolean method_30953(String var1) {
      if (var1 != null) {
         return this.method_18622(class_9091.method_41889(var1), 1);
      } else {
         throw new NullPointerException("text == null");
      }
   }

   @Override
   public boolean method_30954(class_9091 var1) {
      if (var1 != null) {
         return this.method_18622(var1, 2);
      } else {
         throw new NullPointerException("bytes == null");
      }
   }

   private synchronized boolean method_18622(class_9091 var1, int var2) {
      if (!this.field_19639 && !this.field_19652) {
         if (this.field_19647 + (long)var1.method_41902() <= 16777216L) {
            this.field_19647 = this.field_19647 + (long)var1.method_41902();
            this.field_19648.add(new class_4291(var2, var1));
            this.method_18618();
            return true;
         } else {
            this.method_30956(1001, null);
            return false;
         }
      } else {
         return false;
      }
   }

   public synchronized boolean method_18629(class_9091 var1) {
      if (!this.field_19639 && (!this.field_19652 || !this.field_19648.isEmpty())) {
         this.field_19644.add(var1);
         this.method_18618();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean method_30956(int var1, String var2) {
      return this.method_18627(var1, var2, 60000L);
   }

   public synchronized boolean method_18627(int var1, String var2, long var3) {
      class_9294.method_42768(var1);
      class_9091 var7 = null;
      if (var2 != null) {
         var7 = class_9091.method_41889(var2);
         if ((long)var7.method_41902() > 123L) {
            throw new IllegalArgumentException("reason.size() > 123: " + var2);
         }
      }

      if (!this.field_19639 && !this.field_19652) {
         this.field_19652 = true;
         this.field_19648.add(new class_374(var1, var7, var3));
         this.method_18618();
         return true;
      } else {
         return false;
      }
   }

   private void method_18618() {
      assert Thread.holdsLock(this);

      if (this.field_19633 != null) {
         this.field_19633.execute(this.field_19643);
      }
   }

   public boolean method_18620() throws IOException {
      Object var3 = null;
      int var4 = -1;
      String var5 = null;
      class_7201 var6 = null;
      class_1308 var8;
      class_9091 var9;
      synchronized (this) {
         if (this.field_19639) {
            return false;
         }

         var8 = this.field_19651;
         var9 = this.field_19644.poll();
         if (var9 == null) {
            var3 = this.field_19648.poll();
            if (var3 instanceof class_374) {
               var4 = this.field_19638;
               var5 = this.field_19640;
               if (var4 != -1) {
                  var6 = this.field_19631;
                  this.field_19631 = null;
                  this.field_19633.shutdown();
               } else {
                  this.field_19635 = this.field_19633.schedule(new class_5231(this), ((class_374)var3).field_1523, TimeUnit.MILLISECONDS);
               }
            } else if (var3 == null) {
               return false;
            }
         }
      }

      boolean var21;
      try {
         if (var9 != null) {
            var8.method_5959(var9);
         } else if (var3 instanceof class_4291) {
            class_9091 var7 = ((class_4291)var3).field_20819;
            class_3947 var10 = class_1259.method_5670(var8.method_5957(((class_4291)var3).field_20818, (long)var7.method_41902()));
            var10.method_18247(var7);
            var10.close();
            synchronized (this) {
               this.field_19647 = this.field_19647 - (long)var7.method_41902();
            }
         } else {
            if (!(var3 instanceof class_374)) {
               throw new AssertionError();
            }

            class_374 var20 = (class_374)var3;
            var8.method_5956(var20.field_1522, var20.field_1521);
            if (var6 != null) {
               this.field_19653.method_33223(this, var4, var5);
            }
         }

         var21 = true;
      } finally {
         class_8515.method_39200(var6);
      }

      return var21;
   }

   public void method_18621() {
      class_1308 var4;
      synchronized (this) {
         if (this.field_19639) {
            return;
         }

         var4 = this.field_19651;
      }

      try {
         var4.method_5958(class_9091.field_46557);
      } catch (IOException var6) {
         this.method_18619(var6, null);
      }
   }

   public void method_18619(Exception var1, class_7839 var2) {
      class_7201 var6;
      synchronized (this) {
         if (this.field_19639) {
            return;
         }

         this.field_19639 = true;
         var6 = this.field_19631;
         this.field_19631 = null;
         if (this.field_19635 != null) {
            this.field_19635.cancel(false);
         }

         if (this.field_19633 != null) {
            this.field_19633.shutdown();
         }
      }

      try {
         this.field_19653.method_33218(this, var1, var2);
      } finally {
         class_8515.method_39200(var6);
      }
   }
}
