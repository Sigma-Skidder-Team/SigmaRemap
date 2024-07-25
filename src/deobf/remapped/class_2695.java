package remapped;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class class_2695 implements Closeable {
   public static final ExecutorService field_13193 = new ThreadPoolExecutor(
      0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue<Runnable>(), class_8515.method_39209("OkHttp Http2Connection", true)
   );
   public final boolean field_13208;
   public final class_8906 field_13185;
   public final Map<Integer, class_9388> field_13192 = new LinkedHashMap<Integer, class_9388>();
   public final String field_13202;
   public int field_13207;
   public int field_13200;
   public boolean field_13204;
   private final ExecutorService field_13199;
   private Map<Integer, class_7533> field_13197;
   public final class_6034 field_13195;
   private int field_13186;
   public long field_13206 = 0L;
   public long field_13187;
   public class_5605 field_13205 = new class_5605();
   private static final int field_13189 = 16777216;
   public final class_5605 field_13190 = new class_5605();
   public boolean field_13198 = false;
   public final Socket field_13188;
   public final class_6984 field_13203;
   public final class_961 field_13191;
   public final Set<Integer> field_13194 = new LinkedHashSet<Integer>();

   public class_2695(class_7552 var1) {
      this.field_13195 = var1.field_38503;
      this.field_13208 = var1.field_38504;
      this.field_13185 = var1.field_38508;
      this.field_13200 = !var1.field_38504 ? 2 : 1;
      if (var1.field_38504) {
         this.field_13200 += 2;
      }

      this.field_13186 = !var1.field_38504 ? 2 : 1;
      if (var1.field_38504) {
         this.field_13205.method_25455(7, 16777216);
      }

      this.field_13202 = var1.field_38509;
      this.field_13199 = new ThreadPoolExecutor(
         0,
         1,
         60L,
         TimeUnit.SECONDS,
         new LinkedBlockingQueue<Runnable>(),
         class_8515.method_39209(class_8515.method_39218("OkHttp %s Push Observer", this.field_13202), true)
      );
      this.field_13190.method_25455(7, 65535);
      this.field_13190.method_25455(5, 16384);
      this.field_13187 = (long)this.field_13190.method_25452();
      this.field_13188 = var1.field_38507;
      this.field_13203 = new class_6984(var1.field_38502, this.field_13208);
      this.field_13191 = new class_961(this, new class_5487(var1.field_38505, this.field_13208));
   }

   public class_7976 method_12118() {
      return class_7976.field_40849;
   }

   public synchronized int method_12125() {
      return this.field_13192.size();
   }

   public synchronized class_9388 method_12123(int var1) {
      return this.field_13192.get(var1);
   }

   public synchronized class_9388 method_12136(int var1) {
      class_9388 var4 = this.field_13192.remove(var1);
      this.notifyAll();
      return var4;
   }

   public synchronized int method_12141() {
      return this.field_13190.method_25447(Integer.MAX_VALUE);
   }

   public class_9388 method_12120(int var1, List<class_4331> var2, boolean var3) throws IOException {
      if (!this.field_13208) {
         return this.method_12112(var1, var2, var3);
      } else {
         throw new IllegalStateException("Client cannot push requests.");
      }
   }

   public class_9388 method_12113(List<class_4331> var1, boolean var2) throws IOException {
      return this.method_12112(0, var1, var2);
   }

   private class_9388 method_12112(int var1, List<class_4331> var2, boolean var3) throws IOException {
      boolean var6 = !var3;
      boolean var7 = false;
      class_9388 var11;
      boolean var12;
      synchronized (this.field_13203) {
         int var10;
         synchronized (this) {
            if (this.field_13204) {
               throw new class_5765();
            }

            var10 = this.field_13200;
            this.field_13200 += 2;
            var11 = new class_9388(var10, this, var6, var7, var2);
            var12 = !var3 || this.field_13187 == 0L || var11.field_47982 == 0L;
            if (var11.method_43414()) {
               this.field_13192.put(var10, var11);
            }
         }

         if (var1 == 0) {
            this.field_13203.method_31940(var6, var10, var1, var2);
         } else {
            if (this.field_13208) {
               throw new IllegalArgumentException("client streams shouldn't have associated stream IDs");
            }

            this.field_13203.method_31951(var1, var10, var2);
         }
      }

      if (var12) {
         this.field_13203.method_31950();
      }

      return var11;
   }

   public void method_12133(int var1, boolean var2, List<class_4331> var3) throws IOException {
      this.field_13203.method_31953(var2, var1, var3);
   }

   public void method_12132(int var1, boolean var2, class_7059 var3, long var4) throws IOException {
      if (var4 == 0L) {
         this.field_13203.method_31952(var2, var1, var3, 0);
      } else {
         while (var4 > 0L) {
            int var14;
            synchronized (this) {
               try {
                  while (this.field_13187 <= 0L) {
                     if (!this.field_13192.containsKey(var1)) {
                        throw new IOException("stream closed");
                     }

                     this.wait();
                  }
               } catch (InterruptedException var12) {
                  throw new InterruptedIOException();
               }

               int var10 = (int)Math.min(var4, this.field_13187);
               var14 = Math.min(var10, this.field_13203.method_31948());
               this.field_13187 -= (long)var14;
            }

            var4 -= (long)var14;
            this.field_13203.method_31952(var2 && var4 == 0L, var1, var3, var14);
         }
      }
   }

   public void method_12134(long var1) {
      this.field_13187 += var1;
      if (var1 > 0L) {
         this.notifyAll();
      }
   }

   public void method_12129(int var1, class_1692 var2) {
      field_13193.execute(new class_1503(this, "OkHttp %s stream %d", new Object[]{this.field_13202, var1}, var1, var2));
   }

   public void method_12130(int var1, class_1692 var2) throws IOException {
      this.field_13203.method_31949(var1, var2);
   }

   public void method_12115(int var1, long var2) {
      field_13193.execute(new class_5102(this, "OkHttp Window Update %s stream %d", new Object[]{this.field_13202, var1}, var1, var2));
   }

   public class_7533 method_12119() throws IOException {
      class_7533 var3 = new class_7533();
      int var5;
      synchronized (this) {
         if (this.field_13204) {
            throw new class_5765();
         }

         var5 = this.field_13186;
         this.field_13186 += 2;
         if (this.field_13197 == null) {
            this.field_13197 = new LinkedHashMap<Integer, class_7533>();
         }

         this.field_13197.put(var5, var3);
      }

      this.method_12126(false, var5, 1330343787, var3);
      return var3;
   }

   public void method_12135(boolean var1, int var2, int var3, class_7533 var4) {
      field_13193.execute(new class_9377(this, "OkHttp %s ping %08x%08x", new Object[]{this.field_13202, var2, var3}, var1, var2, var3, var4));
   }

   public void method_12126(boolean var1, int var2, int var3, class_7533 var4) throws IOException {
      synchronized (this.field_13203) {
         if (var4 != null) {
            var4.method_34318();
         }

         this.field_13203.method_31955(var1, var2, var3);
      }
   }

   public synchronized class_7533 method_12122(int var1) {
      return this.field_13197 == null ? null : this.field_13197.remove(var1);
   }

   public void method_12127() throws IOException {
      this.field_13203.method_31950();
   }

   public void method_12117(class_1692 var1) throws IOException {
      synchronized (this.field_13203) {
         int var6;
         synchronized (this) {
            if (this.field_13204) {
               return;
            }

            this.field_13204 = true;
            var6 = this.field_13207;
         }

         this.field_13203.method_31947(var6, var1, class_8515.field_43585);
      }
   }

   @Override
   public void close() throws IOException {
      this.close(class_1692.field_8759, class_1692.field_8762);
   }

   public void close(class_1692 var1, class_1692 var2) throws IOException {
      assert !Thread.holdsLock(this);

      IOException var5 = null;

      try {
         this.method_12117(var1);
      } catch (IOException var14) {
         var5 = var14;
      }

      class_9388[] var6 = null;
      class_7533[] var7 = null;
      synchronized (this) {
         if (!this.field_13192.isEmpty()) {
            var6 = this.field_13192.values().<class_9388>toArray(new class_9388[this.field_13192.size()]);
            this.field_13192.clear();
         }

         if (this.field_13197 != null) {
            var7 = this.field_13197.values().<class_7533>toArray(new class_7533[this.field_13197.size()]);
            this.field_13197 = null;
         }
      }

      if (var6 != null) {
         for (class_9388 var11 : var6) {
            try {
               var11.method_43415(var2);
            } catch (IOException var16) {
               if (var5 != null) {
                  var5 = var16;
               }
            }
         }
      }

      if (var7 != null) {
         for (class_7533 var21 : var7) {
            var21.method_34323();
         }
      }

      try {
         this.field_13203.close();
      } catch (IOException var15) {
         if (var5 == null) {
            var5 = var15;
         }
      }

      try {
         this.field_13188.close();
      } catch (IOException var13) {
         var5 = var13;
      }

      if (var5 != null) {
         throw var5;
      }
   }

   public void method_12138() throws IOException {
      this.method_12139(true);
   }

   public void method_12139(boolean var1) throws IOException {
      if (var1) {
         this.field_13203.method_31939();
         this.field_13203.method_31958(this.field_13205);
         int var4 = this.field_13205.method_25452();
         if (var4 != 65535) {
            this.field_13203.method_31956(0, (long)(var4 - 65535));
         }
      }

      new Thread(this.field_13191).start();
   }

   public void method_12121(class_5605 var1) throws IOException {
      synchronized (this.field_13203) {
         synchronized (this) {
            if (this.field_13204) {
               throw new class_5765();
            }

            this.field_13205.method_25456(var1);
            this.field_13203.method_31958(var1);
         }
      }
   }

   public synchronized boolean method_12116() {
      return this.field_13204;
   }

   public boolean method_12114(int var1) {
      return var1 != 0;
   }

   public void method_12140(int var1, List<class_4331> var2) {
      synchronized (this) {
         if (this.field_13194.contains(var1)) {
            this.method_12129(var1, class_1692.field_8760);
            return;
         }

         this.field_13194.add(var1);
      }

      this.field_13199.execute(new class_906(this, "OkHttp %s Push Request[%s]", new Object[]{this.field_13202, var1}, var1, var2));
   }

   public void method_12137(int var1, List<class_4331> var2, boolean var3) {
      this.field_13199.execute(new class_2220(this, "OkHttp %s Push Headers[%s]", new Object[]{this.field_13202, var1}, var1, var2, var3));
   }

   public void method_12131(int var1, class_8067 var2, int var3, boolean var4) throws IOException {
      class_7059 var7 = new class_7059();
      var2.method_36608((long)var3);
      var2.method_24273(var7, (long)var3);
      if (var7.method_32468() == (long)var3) {
         this.field_13199.execute(new class_1412(this, "OkHttp %s Push Data[%s]", new Object[]{this.field_13202, var1}, var1, var7, var3, var4));
      } else {
         throw new IOException(var7.method_32468() + " != " + var3);
      }
   }

   public void method_12128(int var1, class_1692 var2) {
      this.field_13199.execute(new class_7652(this, "OkHttp %s Push Reset[%s]", new Object[]{this.field_13202, var1}, var1, var2));
   }
}
