package mapped;

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

public final class Class8212 implements Class8213, Class8211 {
   private static final List<Class2201> field35261 = Collections.<Class2201>singletonList(Class2201.field14386);
   private static final long field35262 = 16777216L;
   private static final long field35263 = 60000L;
   private final Class8223 field35264;
   public final Class8681 field35265;
   private final Random field35266;
   private final String field35267;
   private Class2370 field35268;
   private final Runnable field35269;
   private Class9303 field35270;
   private Class7034 field35271;
   private ScheduledExecutorService field35272;
   private Class1803 field35273;
   private final ArrayDeque<Class2003> field35274 = new ArrayDeque<Class2003>();
   private final ArrayDeque<Object> field35275 = new ArrayDeque<Object>();
   private long field35276;
   private boolean field35277;
   private ScheduledFuture<?> field35278;
   private int field35279 = -1;
   private String field35280;
   private boolean field35281;
   public int field35282;
   public int field35283;
   public static final boolean field35284 = !Class8212.class.desiredAssertionStatus();

   public Class8212(Class8223 var1, Class8681 var2, Random var3) {
      if ("GET".equals(var1.method28613())) {
         this.field35264 = var1;
         this.field35265 = var2;
         this.field35266 = var3;
         byte[] var6 = new byte[16];
         var3.nextBytes(var6);
         this.field35267 = Class2003.method8430(var6).method8437();
         this.field35269 = new Class1411(this);
      } else {
         throw new IllegalArgumentException("Request must be GET: " + var1.method28613());
      }
   }

   @Override
   public Class8223 method28538() {
      return this.field35264;
   }

   @Override
   public synchronized long method28539() {
      return this.field35276;
   }

   @Override
   public void method28540() {
      this.field35268.method9547();
   }

   public void method28541(Class2391 var1) {
      var1 = var1.method9830().method34842(field35261).method34850();
      int var4 = var1.method9805();
      Class8223 var5 = this.field35264
         .method28619()
         .method25238("Upgrade", "websocket")
         .method25238("Connection", "Upgrade")
         .method25238("Sec-WebSocket-Key", this.field35267)
         .method25238("Sec-WebSocket-Version", "13")
         .method25252();
      this.field35268 = Class6605.field29047.method20027(var1, var5);
      this.field35268.method9546(new Class4233(this, var5, var4));
   }

   public void method28542(Class1797 var1) throws ProtocolException {
      if (var1.method7846() == 101) {
         String var4 = var1.method7851("Connection");
         if ("Upgrade".equalsIgnoreCase(var4)) {
            String var5 = var1.method7851("Upgrade");
            if ("websocket".equalsIgnoreCase(var5)) {
               String var6 = var1.method7851("Sec-WebSocket-Accept");
               String var7 = Class2003.method8433(this.field35267 + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").method8439().method8437();
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
         throw new ProtocolException("Expected HTTP 101 response but was '" + var1.method7846() + " " + var1.method7848() + "'");
      }
   }

   public void method28543(String var1, long var2, Class1803 var4) throws IOException {
      synchronized (this) {
         this.field35273 = var4;
         this.field35271 = new Class7034(var4.field9713, var4.field9715, this.field35266);
         this.field35272 = new ScheduledThreadPoolExecutor(1, Class9474.method36542(var1, false));
         if (var2 != 0L) {
            this.field35272.scheduleAtFixedRate(new Class686(this), var2, var2, TimeUnit.MILLISECONDS);
         }

         if (!this.field35275.isEmpty()) {
            this.method28556();
         }
      }

      this.field35270 = new Class9303(var4.field9713, var4.field9714, this);
   }

   public void method28544() throws IOException {
      while (this.field35279 == -1) {
         this.field35270.method35107();
      }
   }

   public boolean method28545() throws IOException {
      try {
         this.field35270.method35107();
         return this.field35279 == -1;
      } catch (Exception var4) {
         this.method28559(var4, null);
         return false;
      }
   }

   public void method28546(int var1, TimeUnit var2) throws InterruptedException {
      this.field35272.awaitTermination((long)var1, var2);
   }

   public void method28547() throws InterruptedException {
      if (this.field35278 != null) {
         this.field35278.cancel(false);
      }

      this.field35272.shutdown();
      this.field35272.awaitTermination(10L, TimeUnit.SECONDS);
   }

   public synchronized int method28548() {
      return this.field35282;
   }

   public synchronized int method28549() {
      return this.field35283;
   }

   @Override
   public void method28533(String var1) throws IOException {
      this.field35265.method31225(this, var1);
   }

   @Override
   public void method28534(Class2003 var1) throws IOException {
      this.field35265.method31226(this, var1);
   }

   @Override
   public synchronized void method28535(Class2003 var1) {
      if (!this.field35281 && (!this.field35277 || !this.field35275.isEmpty())) {
         this.field35274.add(var1);
         this.method28556();
         this.field35282++;
      }
   }

   @Override
   public synchronized void method28536(Class2003 var1) {
      this.field35283++;
   }

   @Override
   public void method28537(int var1, String var2) {
      if (var1 == -1) {
         throw new IllegalArgumentException();
      } else {
         Class1803 var5 = null;
         synchronized (this) {
            if (this.field35279 != -1) {
               throw new IllegalStateException("already closed");
            }

            this.field35279 = var1;
            this.field35280 = var2;
            if (this.field35277 && this.field35275.isEmpty()) {
               var5 = this.field35273;
               this.field35273 = null;
               if (this.field35278 != null) {
                  this.field35278.cancel(false);
               }

               this.field35272.shutdown();
            }
         }

         try {
            this.field35265.method31229(this, var1, var2);
            if (var5 != null) {
               this.field35265.method31227(this, var1, var2);
            }
         } finally {
            Class9474.method36535(var5);
         }
      }
   }

   @Override
   public boolean method28550(String var1) {
      if (var1 != null) {
         return this.method28552(Class2003.method8433(var1), 1);
      } else {
         throw new NullPointerException("text == null");
      }
   }

   @Override
   public boolean method28551(Class2003 var1) {
      if (var1 != null) {
         return this.method28552(var1, 2);
      } else {
         throw new NullPointerException("bytes == null");
      }
   }

   private synchronized boolean method28552(Class2003 var1, int var2) {
      if (!this.field35281 && !this.field35277) {
         if (this.field35276 + (long)var1.method8458() <= 16777216L) {
            this.field35276 = this.field35276 + (long)var1.method8458();
            this.field35275.add(new Class8328(var2, var1));
            this.method28556();
            return true;
         } else {
            this.method28554(1001, null);
            return false;
         }
      } else {
         return false;
      }
   }

   public synchronized boolean method28553(Class2003 var1) {
      if (!this.field35281 && (!this.field35277 || !this.field35275.isEmpty())) {
         this.field35274.add(var1);
         this.method28556();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean method28554(int var1, String var2) {
      return this.method28555(var1, var2, 60000L);
   }

   public synchronized boolean method28555(int var1, String var2, long var3) {
      Class9677.method37753(var1);
      Class2003 var7 = null;
      if (var2 != null) {
         var7 = Class2003.method8433(var2);
         if ((long)var7.method8458() > 123L) {
            throw new IllegalArgumentException("reason.size() > 123: " + var2);
         }
      }

      if (!this.field35281 && !this.field35277) {
         this.field35277 = true;
         this.field35275.add(new Class5959(var1, var7, var3));
         this.method28556();
         return true;
      } else {
         return false;
      }
   }

   private void method28556() {
      if (!field35284 && !Thread.holdsLock(this)) {
         throw new AssertionError();
      } else {
         if (this.field35272 != null) {
            this.field35272.execute(this.field35269);
         }
      }
   }

   public boolean method28557() throws IOException {
      Object var3 = null;
      int var4 = -1;
      String var5 = null;
      Class1803 var6 = null;
      Class7034 var8;
      Class2003 var9;
      synchronized (this) {
         if (this.field35281) {
            return false;
         }

         var8 = this.field35271;
         var9 = this.field35274.poll();
         if (var9 == null) {
            var3 = this.field35275.poll();
            if (var3 instanceof Class5959) {
               var4 = this.field35279;
               var5 = this.field35280;
               if (var4 != -1) {
                  var6 = this.field35273;
                  this.field35273 = null;
                  this.field35272.shutdown();
               } else {
                  this.field35278 = this.field35272.schedule(new Class518(this), ((Class5959)var3).field25986, TimeUnit.MILLISECONDS);
               }
            } else if (var3 == null) {
               return false;
            }
         }
      }

      boolean var21;
      try {
         if (var9 != null) {
            var8.method21830(var9);
         } else if (var3 instanceof Class8328) {
            Class2003 var7 = ((Class8328)var3).field35790;
            Class1733 var10 = Class7001.method21697(var8.method21833(((Class8328)var3).field35789, (long)var7.method8458()));
            var10.method7560(var7);
            var10.close();
            synchronized (this) {
               this.field35276 = this.field35276 - (long)var7.method8458();
            }
         } else {
            if (!(var3 instanceof Class5959)) {
               throw new AssertionError();
            }

            Class5959 var20 = (Class5959)var3;
            var8.method21831(var20.field25984, var20.field25985);
            if (var6 != null) {
               this.field35265.method31227(this, var4, var5);
            }
         }

         var21 = true;
      } finally {
         Class9474.method36535(var6);
      }

      return var21;
   }

   public void method28558() {
      Class7034 var4;
      synchronized (this) {
         if (this.field35281) {
            return;
         }

         var4 = this.field35271;
      }

      try {
         var4.method21829(Class2003.field13051);
      } catch (IOException var6) {
         this.method28559(var6, null);
      }
   }

   public void method28559(Exception var1, Class1797 var2) {
      Class1803 var6;
      synchronized (this) {
         if (this.field35281) {
            return;
         }

         this.field35281 = true;
         var6 = this.field35273;
         this.field35273 = null;
         if (this.field35278 != null) {
            this.field35278.cancel(false);
         }

         if (this.field35272 != null) {
            this.field35272.shutdown();
         }
      }

      try {
         this.field35265.method31228(this, var1, var2);
      } finally {
         Class9474.method36535(var6);
      }
   }
}
