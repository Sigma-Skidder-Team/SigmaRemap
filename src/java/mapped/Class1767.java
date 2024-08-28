package mapped;

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

public final class Class1767 implements Closeable {
   public static final ExecutorService field9554 = new ThreadPoolExecutor(
      0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue<Runnable>(), Class9474.method36542("OkHttp Http2Connection", true)
   );
   public final boolean field9555;
   public final Class7264 field9556;
   public final Map<Integer, Class9698> field9557 = new LinkedHashMap<Integer, Class9698>();
   public final String field9558;
   public int field9559;
   public int field9560;
   public boolean field9561;
   private final ExecutorService field9562;
   private Map<Integer, Class9224> field9563;
   public final Class8824 field9564;
   private int field9565;
   public long field9566 = 0L;
   public long field9567;
   public Class8702 field9568 = new Class8702();
   private static final int field9569 = 16777216;
   public final Class8702 field9570 = new Class8702();
   public boolean field9571 = false;
   public final Socket field9572;
   public final Class1786 field9573;
   public final Class1556 field9574;
   public final Set<Integer> field9575 = new LinkedHashSet<Integer>();
   public static final boolean field9576 = !Class1767.class.desiredAssertionStatus();

   public Class1767(Class9227 var1) {
      this.field9564 = var1.field42474;
      this.field9555 = var1.field42475;
      this.field9556 = var1.field42473;
      this.field9560 = !var1.field42475 ? 2 : 1;
      if (var1.field42475) {
         this.field9560 += 2;
      }

      this.field9565 = !var1.field42475 ? 2 : 1;
      if (var1.field42475) {
         this.field9568.method31376(7, 16777216);
      }

      this.field9558 = var1.field42470;
      this.field9562 = new ThreadPoolExecutor(
         0,
         1,
         60L,
         TimeUnit.SECONDS,
         new LinkedBlockingQueue<Runnable>(),
         Class9474.method36542(Class9474.method36559("OkHttp %s Push Observer", this.field9558), true)
      );
      this.field9570.method31376(7, 65535);
      this.field9570.method31376(5, 16384);
      this.field9567 = (long)this.field9570.method31385();
      this.field9572 = var1.field42469;
      this.field9573 = new Class1786(var1.field42472, this.field9555);
      this.field9574 = new Class1556(this, new Class1791(var1.field42471, this.field9555));
   }

   public Class2201 method7705() {
      return Class2201.field14388;
   }

   public synchronized int method7706() {
      return this.field9557.size();
   }

   public synchronized Class9698 method7707(int var1) {
      return this.field9557.get(var1);
   }

   public synchronized Class9698 method7708(int var1) {
      Class9698 var4 = this.field9557.remove(var1);
      this.notifyAll();
      return var4;
   }

   public synchronized int method7709() {
      return this.field9570.method31382(Integer.MAX_VALUE);
   }

   public Class9698 method7710(int var1, List<Class8350> var2, boolean var3) throws IOException {
      if (!this.field9555) {
         return this.method7712(var1, var2, var3);
      } else {
         throw new IllegalStateException("Client cannot push requests.");
      }
   }

   public Class9698 method7711(List<Class8350> var1, boolean var2) throws IOException {
      return this.method7712(0, var1, var2);
   }

   private Class9698 method7712(int var1, List<Class8350> var2, boolean var3) throws IOException {
      boolean var6 = !var3;
      boolean var7 = false;
      Class9698 var11;
      boolean var12;
      synchronized (this.field9573) {
         int var10;
         synchronized (this) {
            if (this.field9561) {
               throw new Class2458();
            }

            var10 = this.field9560;
            this.field9560 += 2;
            var11 = new Class9698(var10, this, var6, var7, var2);
            var12 = !var3 || this.field9567 == 0L || var11.field45330 == 0L;
            if (var11.method37977()) {
               this.field9557.put(var10, var11);
            }
         }

         if (var1 == 0) {
            this.field9573.method7771(var6, var10, var1, var2);
         } else {
            if (this.field9555) {
               throw new IllegalArgumentException("client streams shouldn't have associated stream IDs");
            }

            this.field9573.method7769(var1, var10, var2);
         }
      }

      if (var12) {
         this.field9573.method7770();
      }

      return var11;
   }

   public void method7713(int var1, boolean var2, List<Class8350> var3) throws IOException {
      this.field9573.method7772(var2, var1, var3);
   }

   public void method7714(int var1, boolean var2, Class1734 var3, long var4) throws IOException {
      if (var4 == 0L) {
         this.field9573.method7776(var2, var1, var3, 0);
      } else {
         while (var4 > 0L) {
            int var14;
            synchronized (this) {
               try {
                  while (this.field9567 <= 0L) {
                     if (!this.field9557.containsKey(var1)) {
                        throw new IOException("stream closed");
                     }

                     this.wait();
                  }
               } catch (InterruptedException var12) {
                  throw new InterruptedIOException();
               }

               int var10 = (int)Math.min(var4, this.field9567);
               var14 = Math.min(var10, this.field9573.method7775());
               this.field9567 -= (long)var14;
            }

            var4 -= (long)var14;
            this.field9573.method7776(var2 && var4 == 0L, var1, var3, var14);
         }
      }
   }

   public void method7715(long var1) {
      this.field9567 += var1;
      if (var1 > 0L) {
         this.notifyAll();
      }
   }

   public void method7716(int var1, Class2077 var2) {
      field9554.execute(new Class1563(this, "OkHttp %s stream %d", new Object[]{this.field9558, var1}, var1, var2));
   }

   public void method7717(int var1, Class2077 var2) throws IOException {
      this.field9573.method7774(var1, var2);
   }

   public void method7718(int var1, long var2) {
      field9554.execute(new Class1560(this, "OkHttp Window Update %s stream %d", new Object[]{this.field9558, var1}, var1, var2));
   }

   public Class9224 method7719() throws IOException {
      Class9224 var3 = new Class9224();
      int var5;
      synchronized (this) {
         if (this.field9561) {
            throw new Class2458();
         }

         var5 = this.field9565;
         this.field9565 += 2;
         if (this.field9563 == null) {
            this.field9563 = new LinkedHashMap<Integer, Class9224>();
         }

         this.field9563.put(var5, var3);
      }

      this.method7721(false, var5, 1330343787, var3);
      return var3;
   }

   public void method7720(boolean var1, int var2, int var3, Class9224 var4) {
      field9554.execute(new Class1566(this, "OkHttp %s ping %08x%08x", new Object[]{this.field9558, var2, var3}, var1, var2, var3, var4));
   }

   public void method7721(boolean var1, int var2, int var3, Class9224 var4) throws IOException {
      synchronized (this.field9573) {
         if (var4 != null) {
            var4.method34699();
         }

         this.field9573.method7779(var1, var2, var3);
      }
   }

   public synchronized Class9224 method7722(int var1) {
      return this.field9563 == null ? null : this.field9563.remove(var1);
   }

   public void method7723() throws IOException {
      this.field9573.method7770();
   }

   public void method7724(Class2077 var1) throws IOException {
      synchronized (this.field9573) {
         int var6;
         synchronized (this) {
            if (this.field9561) {
               return;
            }

            this.field9561 = true;
            var6 = this.field9559;
         }

         this.field9573.method7780(var6, var1, Class9474.field44015);
      }
   }

   @Override
   public void close() throws IOException {
      this.close(Class2077.field13527, Class2077.field13532);
   }

   public void close(Class2077 var1, Class2077 var2) throws IOException {
      if (!field9576 && Thread.holdsLock(this)) {
         throw new AssertionError();
      } else {
         IOException var5 = null;

         try {
            this.method7724(var1);
         } catch (IOException var14) {
            var5 = var14;
         }

         Class9698[] var6 = null;
         Class9224[] var7 = null;
         synchronized (this) {
            if (!this.field9557.isEmpty()) {
               var6 = this.field9557.values().<Class9698>toArray(new Class9698[this.field9557.size()]);
               this.field9557.clear();
            }

            if (this.field9563 != null) {
               var7 = this.field9563.values().<Class9224>toArray(new Class9224[this.field9563.size()]);
               this.field9563 = null;
            }
         }

         if (var6 != null) {
            for (Class9698 var11 : var6) {
               try {
                  var11.method37988(var2);
               } catch (IOException var16) {
                  if (var5 != null) {
                     var5 = var16;
                  }
               }
            }
         }

         if (var7 != null) {
            for (Class9224 var21 : var7) {
               var21.method34701();
            }
         }

         try {
            this.field9573.close();
         } catch (IOException var15) {
            if (var5 == null) {
               var5 = var15;
            }
         }

         try {
            this.field9572.close();
         } catch (IOException var13) {
            var5 = var13;
         }

         if (var5 != null) {
            throw var5;
         }
      }
   }

   public void method7725() throws IOException {
      this.method7726(true);
   }

   public void method7726(boolean var1) throws IOException {
      if (var1) {
         this.field9573.method7767();
         this.field9573.method7778(this.field9568);
         int var4 = this.field9568.method31385();
         if (var4 != 65535) {
            this.field9573.method7781(0, (long)(var4 - 65535));
         }
      }

      new Thread(this.field9574).start();
   }

   public void method7727(Class8702 var1) throws IOException {
      synchronized (this.field9573) {
         synchronized (this) {
            if (this.field9561) {
               throw new Class2458();
            }

            this.field9568.method31386(var1);
            this.field9573.method7778(var1);
         }
      }
   }

   public synchronized boolean method7728() {
      return this.field9561;
   }

   public boolean method7729(int var1) {
      return var1 != 0;
   }

   public void method7730(int var1, List<Class8350> var2) {
      synchronized (this) {
         if (this.field9575.contains(var1)) {
            this.method7716(var1, Class2077.field13528);
            return;
         }

         this.field9575.add(var1);
      }

      this.field9562.execute(new Class1562(this, "OkHttp %s Push Request[%s]", new Object[]{this.field9558, var1}, var1, var2));
   }

   public void method7731(int var1, List<Class8350> var2, boolean var3) {
      this.field9562.execute(new Class1564(this, "OkHttp %s Push Headers[%s]", new Object[]{this.field9558, var1}, var1, var2, var3));
   }

   public void method7732(int var1, Class1735 var2, int var3, boolean var4) throws IOException {
      Class1734 var7 = new Class1734();
      var2.method7584((long)var3);
      var2.method7633(var7, (long)var3);
      if (var7.method7582() == (long)var3) {
         this.field9562.execute(new Class1561(this, "OkHttp %s Push Data[%s]", new Object[]{this.field9558, var1}, var1, var7, var3, var4));
      } else {
         throw new IOException(var7.method7582() + " != " + var3);
      }
   }

   public void method7733(int var1, Class2077 var2) {
      this.field9562.execute(new Class1559(this, "OkHttp %s Push Reset[%s]", new Object[]{this.field9558, var1}, var1, var2));
   }
}
