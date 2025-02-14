package mapped;



import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSocketFactory;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.*;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public abstract class Class344 extends Class341 implements Runnable, Class345 {
   public URI field1505 = null;
   private Class346 field1506 = null;
   private Socket field1507 = null;
   private SocketFactory field1508 = null;
   private OutputStream field1509;
   private Proxy field1510 = Proxy.NO_PROXY;
   private Thread field1511;
   private Thread field1512;
   private Class8844 field1513;
   private Map<String, String> field1514;
   private CountDownLatch field1515 = new CountDownLatch(1);
   private CountDownLatch field1516 = new CountDownLatch(1);
   private int field1517 = 0;

   public Class344(URI var1) {
      this(var1, new Class8843());
   }

   public Class344(URI var1, Class8844 var2) {
      this(var1, var2, null, 0);
   }

   public Class344(URI var1, Map<String, String> var2) {
      this(var1, new Class8843(), var2);
   }

   public Class344(URI var1, Class8844 var2, Map<String, String> var3) {
      this(var1, var2, var3, 0);
   }

   public Class344(URI var1, Class8844 var2, Map<String, String> var3, int var4) {
      if (var1 != null) {
         if (var2 != null) {
            this.field1505 = var1;
            this.field1513 = var2;
            if (var3 != null) {
               this.field1514 = new TreeMap<String, String>(String.CASE_INSENSITIVE_ORDER);
               this.field1514.putAll(var3);
            }

            this.field1517 = var4;
            this.method1723(false);
            this.method1725(false);
            this.field1506 = new Class346(this, var2);
         } else {
            throw new IllegalArgumentException("null as draft is permitted for `WebSocketServer` only!");
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   public URI method1733() {
      return this.field1505;
   }

   @Override
   public Class8844 method1734() {
      return this.field1513;
   }

   public Socket method1735() {
      return this.field1507;
   }

   public void method1736(String var1, String var2) {
      if (this.field1514 == null) {
         this.field1514 = new TreeMap<String, String>(String.CASE_INSENSITIVE_ORDER);
      }

      this.field1514.put(var1, var2);
   }

   public String method1737(String var1) {
      return this.field1514 != null ? this.field1514.remove(var1) : null;
   }

   public void method1738() {
      this.field1514 = null;
   }

   public void method1739() {
      this.method1741();
      this.method1742();
   }

   public boolean method1740() throws InterruptedException {
      this.method1741();
      return this.method1743();
   }

   private void method1741() {
      Thread var3 = Thread.currentThread();
      if (var3 != this.field1511 && var3 != this.field1512) {
         try {
            this.method1746();
            if (this.field1511 != null) {
               this.field1511.interrupt();
               this.field1511 = null;
            }

            if (this.field1512 != null) {
               this.field1512.interrupt();
               this.field1512 = null;
            }

            this.field1513.method32054();
            if (this.field1507 != null) {
               this.field1507.close();
               this.field1507 = null;
            }
         } catch (Exception var5) {
            this.method1761(var5);
            this.field1506.method1774(1006, var5.getMessage());
            return;
         }

         this.field1515 = new CountDownLatch(1);
         this.field1516 = new CountDownLatch(1);
         this.field1506 = new Class346(this, this.field1513);
      } else {
         throw new IllegalStateException(
            "You cannot initialize a reconnect out of the websocket thread. Use reconnect in another thread to insure a successful cleanup."
         );
      }
   }

   public void method1742() {
      if (this.field1512 == null) {
         this.field1512 = new Thread(this);
         this.field1512.setName("WebSocketConnectReadThread-" + this.field1512.getId());
         this.field1512.start();
      } else {
         throw new IllegalStateException("WebSocketClient objects are not reuseable");
      }
   }

   public boolean method1743() throws InterruptedException {
      this.method1742();
      this.field1515.await();
      return this.field1506.method1767();
   }

   public boolean method1744(long var1, TimeUnit var3) throws InterruptedException {
      this.method1742();
      return this.field1515.await(var1, var3) && this.field1506.method1767();
   }

   @Override
   public void method1745() {
      if (this.field1511 != null) {
         this.field1506.method1772(1000);
      }
   }

   public void method1746() throws InterruptedException {
      this.method1745();
      this.field1516.await();
   }

   @Override
   public void method1747(String var1) {
      this.field1506.method1747(var1);
   }

   @Override
   public void method1748(byte[] var1) {
      this.field1506.method1748(var1);
   }

   @Override
   public <T> T method1749() {
      return this.field1506.<T>method1749();
   }

   @Override
   public <T> void method1750(T var1) {
      this.field1506.method1750(var1);
   }

   @Override
   public Collection<Class345> method1662() {
      return Collections.<Class345>singletonList(this.field1506);
   }

   @Override
   public void method1751() {
      this.field1506.method1751();
   }

   @Override
   public void run() {
      InputStream var6;
      try {
         boolean var3 = false;
         if (this.field1508 != null) {
            this.field1507 = this.field1508.createSocket();
         } else if (this.field1507 == null) {
            this.field1507 = new Socket(this.field1510);
            var3 = true;
         } else if (this.field1507.isClosed()) {
            throw new IOException();
         }

         this.field1507.setTcpNoDelay(this.method1722());
         this.field1507.setReuseAddress(this.method1724());
         if (!this.field1507.isBound()) {
            this.field1507.connect(new InetSocketAddress(this.field1505.getHost(), this.method1752()), this.field1517);
         }

         if (var3 && "wss".equals(this.field1505.getScheme())) {
            SSLContext var4 = SSLContext.getInstance("TLSv1.2");
            var4.init(null, null, null);
            SSLSocketFactory var5 = var4.getSocketFactory();
            this.field1507 = var5.createSocket(this.field1507, this.field1505.getHost(), this.method1752(), true);
         }

         var6 = this.field1507.getInputStream();
         this.field1509 = this.field1507.getOutputStream();
         this.method1753();
      } catch (UnknownHostException var9) {
         return;
      } catch (Exception var10) {
         this.method1687(this.field1506, var10);
         this.field1506.method1774(-1, var10.getMessage());
         return;
      }

      this.field1511 = new Thread(new Class1466(this, this));
      this.field1511.start();
      byte[] var11 = new byte[16384];

      try {
         int var12;
         while (!this.method1770() && !this.method1769() && (var12 = var6.read(var11)) != -1) {
            this.field1506.method1787(ByteBuffer.wrap(var11, 0, var12));
         }

         this.field1506.method1798();
      } catch (IOException var7) {
         this.method1781(var7);
      } catch (RuntimeException var8) {
         this.method1761(var8);
         this.field1506.method1774(1006, var8.getMessage());
      }

      this.field1512 = null;
   }

   private int method1752() {
      int var3 = this.field1505.getPort();
      if (var3 != -1) {
         return var3;
      } else {
         String var4 = this.field1505.getScheme();
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

   private void method1753() throws Class2431 {
      String var3 = this.field1505.getRawPath();
      String var4 = this.field1505.getRawQuery();
      String var5;
      if (var3 != null && var3.length() != 0) {
         var5 = var3;
      } else {
         var5 = "/";
      }

      if (var4 != null) {
         var5 = var5 + '?' + var4;
      }

      int var6 = this.method1752();
      String var7 = this.field1505.getHost() + (var6 != 80 && var6 != 443 ? ":" + var6 : "");
      Class7300 var8 = new Class7300();
      var8.method23062(var5);
      var8.method23061("Host", var7);
      if (this.field1514 != null) {
         for (Entry var10 : this.field1514.entrySet()) {
            var8.method23061((String)var10.getKey(), (String)var10.getValue());
         }
      }

      this.field1506.method1801(var8);
   }

   @Override
   public Class2211 method1754() {
      return this.field1506.method1754();
   }

   @Override
   public final void method1681(Class345 var1, String var2) {
      this.handleIncomingAction(var2);
   }

   @Override
   public final void method1682(Class345 var1, ByteBuffer var2) {
      this.method1762(var2);
   }

   @Override
   public final void method1683(Class345 var1, Class7295 var2) {
      this.method1718();
      this.method1758((Class7296)var2);
      this.field1515.countDown();
   }

   @Override
   public final void method1684(Class345 var1, int var2, String var3, boolean var4) {
      this.method1717();
      if (this.field1511 != null) {
         this.field1511.interrupt();
      }

      this.method1760(var2, var3, var4);
      this.field1515.countDown();
      this.field1516.countDown();
   }

   @Override
   public final void method1687(Class345 var1, Exception var2) {
      this.method1761(var2);
   }

   @Override
   public final void method1688(Class345 var1) {
   }

   @Override
   public void method1689(Class345 var1, int var2, String var3) {
      this.method1755(var2, var3);
   }

   @Override
   public void method1690(Class345 var1, int var2, String var3, boolean var4) {
      this.method1756(var2, var3, var4);
   }

   public void method1755(int var1, String var2) {
   }

   public void method1756(int var1, String var2, boolean var3) {
   }

   public Class345 method1757() {
      return this.field1506;
   }

   @Override
   public InetSocketAddress method1697(Class345 var1) {
      return this.field1507 == null ? null : (InetSocketAddress)this.field1507.getLocalSocketAddress();
   }

   @Override
   public InetSocketAddress method1698(Class345 var1) {
      return this.field1507 == null ? null : (InetSocketAddress)this.field1507.getRemoteSocketAddress();
   }

   public abstract void method1758(Class7296 var1);

   public abstract void handleIncomingAction(String var1);

   public abstract void method1760(int var1, String var2, boolean var3);

   public abstract void method1761(Exception var1);

   public void method1762(ByteBuffer var1) {
   }

   public void method1763(Proxy var1) {
      if (var1 != null) {
         this.field1510 = var1;
      } else {
         throw new IllegalArgumentException();
      }
   }

   @Deprecated
   public void method1764(Socket var1) {
      if (this.field1507 == null) {
         this.field1507 = var1;
      } else {
         throw new IllegalStateException("socket has already been set");
      }
   }

   public void method1765(SocketFactory var1) {
      this.field1508 = var1;
   }

   @Override
   public void method1766(Class2325 var1, ByteBuffer var2, boolean var3) {
      this.field1506.method1766(var1, var2, var3);
   }

   @Override
   public boolean method1767() {
      return this.field1506.method1767();
   }

   @Override
   public boolean method1768() {
      return this.field1506.method1768();
   }

   @Override
   public boolean method1769() {
      return this.field1506.method1769();
   }

   @Override
   public boolean method1770() {
      return this.field1506.method1770();
   }

   @Override
   public boolean method1771() {
      return this.field1506.method1771();
   }

   @Override
   public void method1772(int var1) {
      this.field1506.method1772(var1);
   }

   @Override
   public void method1773(int var1, String var2) {
      this.field1506.method1773(var1, var2);
   }

   @Override
   public void method1774(int var1, String var2) {
      this.field1506.method1774(var1, var2);
   }

   @Override
   public void method1775(ByteBuffer var1) {
      this.field1506.method1775(var1);
   }

   @Override
   public void method1776(Class6454 var1) {
      this.field1506.method1776(var1);
   }

   @Override
   public void method1777(Collection<Class6454> var1) {
      this.field1506.method1777(var1);
   }

   @Override
   public InetSocketAddress method1778() {
      return this.field1506.method1778();
   }

   @Override
   public InetSocketAddress method1779() {
      return this.field1506.method1779();
   }

   @Override
   public String method1780() {
      return this.field1505.getPath();
   }

   private void method1781(IOException var1) {
      if (var1 instanceof SSLException) {
         this.method1761(var1);
      }

      this.field1506.method1798();
   }

   // $VF: synthetic method
   public static void method1782(Class344 var0, IOException var1) {
      var0.method1781(var1);
   }

   // $VF: synthetic method
   public static Thread method1783(Class344 var0, Thread var1) {
      return var0.field1511 = var1;
   }

   // $VF: synthetic method
   public static Class346 method1784(Class344 var0) {
      return var0.field1506;
   }

   // $VF: synthetic method
   public static OutputStream method1785(Class344 var0) {
      return var0.field1509;
   }

   // $VF: synthetic method
   public static Socket method1786(Class344 var0) {
      return var0.field1507;
   }
}
