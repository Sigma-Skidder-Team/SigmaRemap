package remapped;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.URI;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSocketFactory;
import org.java_websocket.exceptions.InvalidHandshakeException;

public abstract class class_4833 extends class_7369 implements Runnable, class_4809 {
   public URI field_24124 = null;
   private class_5913 field_24128 = null;
   private Socket field_24117 = null;
   private SocketFactory field_24129 = null;
   private OutputStream field_24125;
   private Proxy field_24123 = Proxy.NO_PROXY;
   private Thread field_24122;
   private Thread field_24121;
   private class_7212 field_24126;
   private Map<String, String> field_24127;
   private CountDownLatch field_24118 = new CountDownLatch(1);
   private CountDownLatch field_24120 = new CountDownLatch(1);
   private int field_24119 = 0;

   public class_4833(URI var1) {
      this(var1, new class_6089());
   }

   public class_4833(URI var1, class_7212 var2) {
      this(var1, var2, null, 0);
   }

   public class_4833(URI var1, Map<String, String> var2) {
      this(var1, new class_6089(), var2);
   }

   public class_4833(URI var1, class_7212 var2, Map<String, String> var3) {
      this(var1, var2, var3, 0);
   }

   public class_4833(URI var1, class_7212 var2, Map<String, String> var3, int var4) {
      if (var1 != null) {
         if (var2 != null) {
            this.field_24124 = var1;
            this.field_24126 = var2;
            if (var3 != null) {
               this.field_24127 = new TreeMap<String, String>(String.CASE_INSENSITIVE_ORDER);
               this.field_24127.putAll(var3);
            }

            this.field_24119 = var4;
            this.method_33564(false);
            this.method_33562(false);
            this.field_24128 = new class_5913(this, var2);
         } else {
            throw new IllegalArgumentException("null as draft is permitted for `WebSocketServer` only!");
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   public URI method_22233() {
      return this.field_24124;
   }

   @Override
   public class_7212 method_22174() {
      return this.field_24126;
   }

   public Socket method_22237() {
      return this.field_24117;
   }

   public void method_22243(String var1, String var2) {
      if (this.field_24127 == null) {
         this.field_24127 = new TreeMap<String, String>(String.CASE_INSENSITIVE_ORDER);
      }

      this.field_24127.put(var1, var2);
   }

   public String method_22240(String var1) {
      return this.field_24127 != null ? this.field_24127.remove(var1) : null;
   }

   public void method_22241() {
      this.field_24127 = null;
   }

   public void method_22253() {
      this.method_22226();
      this.method_22238();
   }

   public boolean method_22252() throws InterruptedException {
      this.method_22226();
      return this.method_22234();
   }

   private void method_22226() {
      Thread var3 = Thread.currentThread();
      if (var3 != this.field_24122 && var3 != this.field_24121) {
         try {
            this.method_22231();
            if (this.field_24122 != null) {
               this.field_24122.interrupt();
               this.field_24122 = null;
            }

            if (this.field_24121 != null) {
               this.field_24121.interrupt();
               this.field_24121 = null;
            }

            this.field_24126.method_33041();
            if (this.field_24117 != null) {
               this.field_24117.close();
               this.field_24117 = null;
            }
         } catch (Exception var5) {
            this.method_22224(var5);
            this.field_24128.method_22173(1006, var5.getMessage());
            return;
         }

         this.field_24118 = new CountDownLatch(1);
         this.field_24120 = new CountDownLatch(1);
         this.field_24128 = new class_5913(this, this.field_24126);
      } else {
         throw new IllegalStateException(
            "You cannot initialize a reconnect out of the websocket thread. Use reconnect in another thread to insure a successful cleanup."
         );
      }
   }

   public void method_22238() {
      if (this.field_24121 == null) {
         this.field_24121 = new Thread(this);
         this.field_24121.setName("WebSocketConnectReadThread-" + this.field_24121.getId());
         this.field_24121.start();
      } else {
         throw new IllegalStateException("WebSocketClient objects are not reuseable");
      }
   }

   public boolean method_22234() throws InterruptedException {
      this.method_22238();
      this.field_24118.await();
      return this.field_24128.method_22165();
   }

   public boolean method_22235(long var1, TimeUnit var3) throws InterruptedException {
      this.method_22238();
      return this.field_24118.await(var1, var3) && this.field_24128.method_22165();
   }

   @Override
   public void method_22153() {
      if (this.field_24122 != null) {
         this.field_24128.method_22154(1000);
      }
   }

   public void method_22231() throws InterruptedException {
      this.method_22153();
      this.field_24120.await();
   }

   @Override
   public void method_22168(String var1) {
      this.field_24128.method_22168(var1);
   }

   @Override
   public void method_22170(byte[] var1) {
      this.field_24128.method_22170(var1);
   }

   @Override
   public <T> T method_22157() {
      return this.field_24128.<T>method_22157();
   }

   @Override
   public <T> void method_22164(T var1) {
      this.field_24128.method_22164(var1);
   }

   @Override
   public Collection<class_4809> method_33573() {
      return Collections.<class_4809>singletonList(this.field_24128);
   }

   @Override
   public void method_22160() {
      this.field_24128.method_22160();
   }

   @Override
   public void run() {
      InputStream var6;
      try {
         boolean var3 = false;
         if (this.field_24129 != null) {
            this.field_24117 = this.field_24129.createSocket();
         } else if (this.field_24117 == null) {
            this.field_24117 = new Socket(this.field_24123);
            var3 = true;
         } else if (this.field_24117.isClosed()) {
            throw new IOException();
         }

         this.field_24117.setTcpNoDelay(this.method_33569());
         this.field_24117.setReuseAddress(this.method_33563());
         if (!this.field_24117.isBound()) {
            this.field_24117.connect(new InetSocketAddress(this.field_24124.getHost(), this.method_22236()), this.field_24119);
         }

         if (var3 && "wss".equals(this.field_24124.getScheme())) {
            SSLContext var4 = SSLContext.getInstance("TLSv1.2");
            var4.init(null, null, null);
            SSLSocketFactory var5 = var4.getSocketFactory();
            this.field_24117 = var5.createSocket(this.field_24117, this.field_24124.getHost(), this.method_22236(), true);
         }

         var6 = this.field_24117.getInputStream();
         this.field_24125 = this.field_24117.getOutputStream();
         this.method_22251();
      } catch (UnknownHostException var9) {
         return;
      } catch (Exception var10) {
         this.method_2696(this.field_24128, var10);
         this.field_24128.method_22173(-1, var10.getMessage());
         return;
      }

      this.field_24122 = new Thread(new class_8578(this, this));
      this.field_24122.start();
      byte[] var11 = new byte[16384];

      try {
         int var12;
         while (!this.method_22158() && !this.method_22161() && (var12 = var6.read(var11)) != -1) {
            this.field_24128.method_27039(ByteBuffer.wrap(var11, 0, var12));
         }

         this.field_24128.method_27024();
      } catch (IOException var7) {
         this.method_22244(var7);
      } catch (RuntimeException var8) {
         this.method_22224(var8);
         this.field_24128.method_22173(1006, var8.getMessage());
      }

      this.field_24121 = null;
   }

   private int method_22236() {
      int var3 = this.field_24124.getPort();
      if (var3 != -1) {
         return var3;
      } else {
         String var4 = this.field_24124.getScheme();
         if (!"wss".equals(var4)) {
            if (!"ws".equals(var4)) {
               throw new IllegalArgumentException("unknown scheme: " + var4);
            } else {
               return 80;
            }
         } else {
            return 443;
         }
      }
   }

   private void method_22251() throws InvalidHandshakeException {
      String var3 = this.field_24124.getRawPath();
      String var4 = this.field_24124.getRawQuery();
      String var5;
      if (var3 != null && var3.length() != 0) {
         var5 = var3;
      } else {
         var5 = "/";
      }

      if (var4 != null) {
         var5 = var5 + '?' + var4;
      }

      int var6 = this.method_22236();
      String var7 = this.field_24124.getHost() + (var6 != 80 && var6 != 443 ? ":" + var6 : "");
      class_9627 var8 = new class_9627();
      var8.method_24243(var5);
      var8.綋浣哝卫柿待("Host", var7);
      if (this.field_24127 != null) {
         for (Entry var10 : this.field_24127.entrySet()) {
            var8.綋浣哝卫柿待((String)var10.getKey(), (String)var10.getValue());
         }
      }

      this.field_24128.method_27044(var8);
   }

   @Override
   public class_7161 method_22159() {
      return this.field_24128.method_22159();
   }

   @Override
   public final void method_2693(class_4809 var1, String var2) {
      this.method_22249(var2);
   }

   @Override
   public final void method_2694(class_4809 var1, ByteBuffer var2) {
      this.method_22250(var2);
   }

   @Override
   public final void method_2682(class_4809 var1, class_6113 var2) {
      this.method_33566();
      this.method_22228((class_6999)var2);
      this.field_24118.countDown();
   }

   @Override
   public final void method_2683(class_4809 var1, int var2, String var3, boolean var4) {
      this.method_33561();
      if (this.field_24122 != null) {
         this.field_24122.interrupt();
      }

      this.method_22245(var2, var3, var4);
      this.field_24118.countDown();
      this.field_24120.countDown();
   }

   @Override
   public final void method_2696(class_4809 var1, Exception var2) {
      this.method_22224(var2);
   }

   @Override
   public final void method_2685(class_4809 var1) {
   }

   @Override
   public void method_2686(class_4809 var1, int var2, String var3) {
      this.method_22254(var2, var3);
   }

   @Override
   public void method_2688(class_4809 var1, int var2, String var3, boolean var4) {
      this.method_22239(var2, var3, var4);
   }

   public void method_22254(int var1, String var2) {
   }

   public void method_22239(int var1, String var2, boolean var3) {
   }

   public class_4809 method_22227() {
      return this.field_24128;
   }

   @Override
   public InetSocketAddress method_2689(class_4809 var1) {
      return this.field_24117 == null ? null : (InetSocketAddress)this.field_24117.getLocalSocketAddress();
   }

   @Override
   public InetSocketAddress method_2695(class_4809 var1) {
      return this.field_24117 == null ? null : (InetSocketAddress)this.field_24117.getRemoteSocketAddress();
   }

   public abstract void method_22228(class_6999 var1);

   public abstract void method_22249(String var1);

   public abstract void method_22245(int var1, String var2, boolean var3);

   public abstract void method_22224(Exception var1);

   public void method_22250(ByteBuffer var1) {
   }

   public void method_22229(Proxy var1) {
      if (var1 != null) {
         this.field_24123 = var1;
      } else {
         throw new IllegalArgumentException();
      }
   }

   @Deprecated
   public void method_22248(Socket var1) {
      if (this.field_24117 == null) {
         this.field_24117 = var1;
      } else {
         throw new IllegalStateException("socket has already been set");
      }
   }

   public void method_22232(SocketFactory var1) {
      this.field_24129 = var1;
   }

   @Override
   public void method_22172(class_9252 var1, ByteBuffer var2, boolean var3) {
      this.field_24128.method_22172(var1, var2, var3);
   }

   @Override
   public boolean method_22165() {
      return this.field_24128.method_22165();
   }

   @Override
   public boolean method_22166() {
      return this.field_24128.method_22166();
   }

   @Override
   public boolean method_22161() {
      return this.field_24128.method_22161();
   }

   @Override
   public boolean method_22158() {
      return this.field_24128.method_22158();
   }

   @Override
   public boolean method_22167() {
      return this.field_24128.method_22167();
   }

   @Override
   public void method_22154(int var1) {
      this.field_24128.method_22154(var1);
   }

   @Override
   public void method_22155(int var1, String var2) {
      this.field_24128.method_22155(var1, var2);
   }

   @Override
   public void method_22173(int var1, String var2) {
      this.field_24128.method_22173(var1, var2);
   }

   @Override
   public void method_22169(ByteBuffer var1) {
      this.field_24128.method_22169(var1);
   }

   @Override
   public void method_22163(class_3106 var1) {
      this.field_24128.method_22163(var1);
   }

   @Override
   public void method_22162(Collection<class_3106> var1) {
      this.field_24128.method_22162(var1);
   }

   @Override
   public InetSocketAddress method_22171() {
      return this.field_24128.method_22171();
   }

   @Override
   public InetSocketAddress method_22175() {
      return this.field_24128.method_22175();
   }

   @Override
   public String method_22156() {
      return this.field_24124.getPath();
   }

   private void method_22244(IOException var1) {
      if (var1 instanceof SSLException) {
         this.method_22224(var1);
      }

      this.field_24128.method_27024();
   }
}
