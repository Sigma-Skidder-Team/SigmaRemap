package mapped;



import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectionKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Class346 implements Class345 {
   public static final int field1518 = 80;
   public static final int field1519 = 443;
   public static final int field1520 = 16384;
   public final BlockingQueue<ByteBuffer> field1521;
   public final BlockingQueue<ByteBuffer> field1522;
   private final Class343 field1523;
   private SelectionKey field1524;
   private ByteChannel field1525;
   private Class359 field1526;
   private boolean field1527 = false;
   private volatile Class2211 field1528 = Class2211.field14457;
   private List<Class8844> field1529;
   private Class8844 field1530 = null;
   private Class2026 field1531;
   private ByteBuffer field1532 = ByteBuffer.allocate(0);
   private Class7294 field1533 = null;
   private String field1534 = null;
   private Integer field1535 = null;
   private Boolean field1536 = null;
   private String field1537 = null;
   private long field1538 = System.nanoTime();
   private final Object field1539 = new Object();
   private Class6456 field1540;
   private Object field1541;
   public static final boolean field1542 = !Class346.class.desiredAssertionStatus();

   public Class346(Class343 var1, List<Class8844> var2) {
      this(var1, (Class8844)null);
      this.field1531 = Class2026.field13154;
      if (var2 != null && !var2.isEmpty()) {
         this.field1529 = var2;
      } else {
         this.field1529 = new ArrayList<Class8844>();
         this.field1529.add(new Class8843());
      }
   }

   public Class346(Class343 var1, Class8844 var2) {
      if (var1 != null && (var2 != null || this.field1531 != Class2026.field13154)) {
         this.field1521 = new LinkedBlockingQueue<ByteBuffer>();
         this.field1522 = new LinkedBlockingQueue<ByteBuffer>();
         this.field1523 = var1;
         this.field1531 = Class2026.field13153;
         if (var2 != null) {
            this.field1530 = var2.method32042();
         }
      } else {
         throw new IllegalArgumentException("parameters must not be null");
      }
   }

   public void method1787(ByteBuffer var1) {
      if (!field1542 && !var1.hasRemaining()) {
         throw new AssertionError();
      } else {
         if (this.field1528 == Class2211.field14457) {
            if (this.method1788(var1) && !this.method1770() && !this.method1769()) {
               if (!field1542 && this.field1532.hasRemaining() == var1.hasRemaining() && var1.hasRemaining()) {
                  throw new AssertionError();
               }

               if (!var1.hasRemaining()) {
                  if (this.field1532.hasRemaining()) {
                     this.method1789(this.field1532);
                  }
               } else {
                  this.method1789(var1);
               }
            }
         } else if (this.field1528 == Class2211.field14458) {
            this.method1789(var1);
         }
      }
   }

   private boolean method1788(ByteBuffer var1) {
      ByteBuffer var4;
      if (this.field1532.capacity() == 0) {
         var4 = var1;
      } else {
         if (this.field1532.remaining() < var1.remaining()) {
            ByteBuffer var5 = ByteBuffer.allocate(this.field1532.capacity() + var1.remaining());
            ((Buffer)this.field1532).flip();
            var5.put(this.field1532);
            this.field1532 = var5;
         }

         this.field1532.put(var1);
         ((Buffer)this.field1532).flip();
         var4 = this.field1532;
      }

      ((Buffer)var4).mark();

      try {
         try {
            if (this.field1531 == Class2026.field13154) {
               if (this.field1530 != null) {
                  Class7295 var24 = this.field1530.method32085(var4);
                  if (!(var24 instanceof Class7294)) {
                     this.method1797(1002, "wrong http function", false);
                     return false;
                  }

                  Class7294 var27 = (Class7294)var24;
                  Class2265 var21 = this.field1530.method32032(var27);
                  if (var21 == Class2265.field14725) {
                     this.method1804(var27);
                     return true;
                  }

                  this.method1773(1002, "the handshake did finally not match");
                  return false;
               }

               for (Class8844 var25 : this.field1529) {
                  var25 = var25.method32042();

                  try {
                     var25.method32088(this.field1531);
                     ((Buffer)var4).reset();
                     Class7295 var8 = var25.method32085(var4);
                     if (!(var8 instanceof Class7294)) {
                        this.method1790(new Class2429(1002, "wrong http function"));
                        return false;
                     }

                     Class7294 var9 = (Class7294)var8;
                     Class2265 var20 = var25.method32032(var9);
                     if (var20 == Class2265.field14725) {
                        this.field1537 = var9.method23063();

                        Class7297 var10;
                        try {
                           var10 = this.field1523.method1728(this, var25, var9);
                        } catch (Class2429 var14) {
                           this.method1790(var14);
                           return false;
                        } catch (RuntimeException var15) {
                           this.field1523.method1687(this, var15);
                           this.method1791(var15);
                           return false;
                        }

                        this.method1803(var25.method32082(var25.method32041(var9, var10)));
                        this.field1530 = var25;
                        this.method1804(var9);
                        return true;
                     }
                  } catch (Class2431 var16) {
                  }
               }

               if (this.field1530 == null) {
                  this.method1790(new Class2429(1002, "no draft matches"));
               }

               return false;
            }

            if (this.field1531 == Class2026.field13153) {
               this.field1530.method32088(this.field1531);
               Class7295 var22 = this.field1530.method32085(var4);
               if (!(var22 instanceof Class7296)) {
                  this.method1797(1002, "wrong http function", false);
                  return false;
               }

               Class7296 var7 = (Class7296)var22;
               Class2265 var19 = this.field1530.method32034(this.field1533, var7);
               if (var19 == Class2265.field14725) {
                  try {
                     this.field1523.method1729(this, this.field1533, var7);
                  } catch (Class2429 var12) {
                     this.method1797(var12.method10416(), var12.getMessage(), false);
                     return false;
                  } catch (RuntimeException var13) {
                     this.field1523.method1687(this, var13);
                     this.method1797(-1, var13.getMessage(), false);
                     return false;
                  }

                  this.method1804(var7);
                  return true;
               }

               this.method1773(1002, "draft " + this.field1530 + " refuses handshake");
            }
         } catch (Class2431 var17) {
            this.method1799(var17);
         }
      } catch (Class2474 var18) {
         if (this.field1532.capacity() == 0) {
            ((Buffer)var4).reset();
            int var6 = var18.method10471();
            if (var6 == 0) {
               var6 = var4.capacity() + 16;
            } else if (!field1542 && var18.method10471() < var4.remaining()) {
               throw new AssertionError();
            }

            this.field1532 = ByteBuffer.allocate(var6);
            this.field1532.put(var1);
         } else {
            ((Buffer)this.field1532).position(this.field1532.limit());
            ((Buffer)this.field1532).limit(this.field1532.capacity());
         }
      }

      return false;
   }

   private void method1789(ByteBuffer var1) {
      try {
         for (Class6454 var6 : this.field1530.method32051(var1)) {
            this.field1530.method32060(this, var6);
         }
      } catch (Class2432 var7) {
         if (var7.method10417() == Integer.MAX_VALUE) {
            this.field1523.method1687(this, var7);
         }

         this.method1799(var7);
      } catch (Class2429 var8) {
         this.field1523.method1687(this, var8);
         this.method1799(var8);
      }
   }

   private void method1790(Class2429 var1) {
      this.method1802(this.method1792(404));
      this.method1797(var1.method10416(), var1.getMessage(), false);
   }

   private void method1791(RuntimeException var1) {
      this.method1802(this.method1792(500));
      this.method1797(-1, var1.getMessage(), false);
   }

   private ByteBuffer method1792(int var1) {
      String var4;
      switch (var1) {
         case 404:
            var4 = "404 WebSocket Upgrade Failure";
            break;
         case 500:
         default:
            var4 = "500 Internal Server Error";
      }

      return ByteBuffer.wrap(
         Class8134.method28194(
            "HTTP/1.1 "
               + var4
               + "\r\nContent-Type: text/html\nServer: TooTallNate Java-WebSocket\r\nContent-Length: "
               + (48 + var4.length())
               + "\r\n\r\n<html><head></head><body><h1>"
               + var4
               + "</h1></body></html>"
         )
      );
   }

   public synchronized void method1793(int var1, String var2, boolean var3) {
      if (this.field1528 != Class2211.field14459 && this.field1528 != Class2211.field14460) {
         if (this.field1528 == Class2211.field14458) {
            if (var1 == 1006) {
               if (!field1542 && var3) {
                  throw new AssertionError();
               }

               this.field1528 = Class2211.field14459;
               this.method1797(var1, var2, false);
               return;
            }

            if (this.field1530.method32071() != Class1905.field11191) {
               try {
                  if (!var3) {
                     try {
                        this.field1523.method1689(this, var1, var2);
                     } catch (RuntimeException var7) {
                        this.field1523.method1687(this, var7);
                     }
                  }

                  if (this.method1767()) {
                     Class6458 var6 = new Class6458();
                     var6.method19628(var2);
                     var6.method19627(var1);
                     var6.method19611();
                     this.method1776(var6);
                  }
               } catch (Class2429 var8) {
                  this.field1523.method1687(this, var8);
                  this.method1797(1006, "generated frame is invalid", false);
               }
            }

            this.method1797(var1, var2, var3);
         } else if (var1 == -3) {
            if (!field1542 && !var3) {
               throw new AssertionError();
            }

            this.method1797(-3, var2, true);
         } else if (var1 == 1002) {
            this.method1797(var1, var2, var3);
         } else {
            this.method1797(-1, var2, false);
         }

         this.field1528 = Class2211.field14459;
         this.field1532 = null;
      }
   }

   @Override
   public void method1773(int var1, String var2) {
      this.method1793(var1, var2, false);
   }

   public synchronized void method1794(int var1, String var2, boolean var3) {
      if (this.field1528 != Class2211.field14460) {
         if (this.field1528 == Class2211.field14458 && var1 == 1006) {
            this.field1528 = Class2211.field14459;
         }

         if (this.field1524 != null) {
            this.field1524.cancel();
         }

         if (this.field1525 != null) {
            try {
               this.field1525.close();
            } catch (IOException var8) {
               if (!var8.getMessage().equals("Broken pipe")) {
                  this.field1523.method1687(this, var8);
               }
            }
         }

         try {
            this.field1523.method1684(this, var1, var2, var3);
         } catch (RuntimeException var7) {
            this.field1523.method1687(this, var7);
         }

         if (this.field1530 != null) {
            this.field1530.method32054();
         }

         this.field1533 = null;
         this.field1528 = Class2211.field14460;
      }
   }

   public void method1795(int var1, boolean var2) {
      this.method1794(var1, "", var2);
   }

   public void method1796() {
      if (this.field1536 != null) {
         this.method1794(this.field1535, this.field1534, this.field1536);
      } else {
         throw new IllegalStateException("this method must be used in conjunction with flushAndClose");
      }
   }

   @Override
   public void method1774(int var1, String var2) {
      this.method1794(var1, var2, false);
   }

   public synchronized void method1797(int var1, String var2, boolean var3) {
      if (!this.field1527) {
         this.field1535 = var1;
         this.field1534 = var2;
         this.field1536 = var3;
         this.field1527 = true;
         this.field1523.method1688(this);

         try {
            this.field1523.method1690(this, var1, var2, var3);
         } catch (RuntimeException var7) {
            this.field1523.method1687(this, var7);
         }

         if (this.field1530 != null) {
            this.field1530.method32054();
         }

         this.field1533 = null;
      }
   }

   public void method1798() {
      if (this.field1528 != Class2211.field14457) {
         if (!this.field1527) {
            if (this.field1530.method32071() != Class1905.field11191) {
               if (this.field1530.method32071() != Class1905.field11192) {
                  this.method1795(1006, true);
               } else if (this.field1531 != Class2026.field13154) {
                  this.method1795(1000, true);
               } else {
                  this.method1795(1006, true);
               }
            } else {
               this.method1795(1000, true);
            }
         } else {
            this.method1794(this.field1535, this.field1534, this.field1536);
         }
      } else {
         this.method1795(-1, true);
      }
   }

   @Override
   public void method1772(int var1) {
      this.method1793(var1, "", false);
   }

   public void method1799(Class2429 var1) {
      this.method1793(var1.method10416(), var1.getMessage(), false);
   }

   @Override
   public void method1747(String var1) {
      if (var1 != null) {
         this.method1800(this.field1530.method32053(var1, this.field1531 == Class2026.field13153));
      } else {
         throw new IllegalArgumentException("Cannot send 'null' data to a WebSocketImpl.");
      }
   }

   @Override
   public void method1775(ByteBuffer var1) {
      if (var1 != null) {
         this.method1800(this.field1530.method32052(var1, this.field1531 == Class2026.field13153));
      } else {
         throw new IllegalArgumentException("Cannot send 'null' data to a WebSocketImpl.");
      }
   }

   @Override
   public void method1748(byte[] var1) {
      this.method1775(ByteBuffer.wrap(var1));
   }

   private void method1800(Collection<Class6454> var1) {
      if (!this.method1767()) {
         throw new Class2498();
      } else if (var1 == null) {
         throw new IllegalArgumentException();
      } else {
         ArrayList var4 = new ArrayList();

         for (Class6454 var6 : var1) {
            var4.add(this.field1530.method32043(var6));
         }

         this.method1803(var4);
      }
   }

   @Override
   public void method1766(Class2325 var1, ByteBuffer var2, boolean var3) {
      this.method1800(this.field1530.method32080(var1, var2, var3));
   }

   @Override
   public void method1777(Collection<Class6454> var1) {
      this.method1800(var1);
   }

   @Override
   public void method1776(Class6454 var1) {
      this.method1800(Collections.<Class6454>singletonList(var1));
   }

   @Override
   public void method1751() {
      if (this.field1540 == null) {
         this.field1540 = new Class6456();
      }

      this.method1776(this.field1540);
   }

   @Override
   public boolean method1771() {
      return !this.field1521.isEmpty();
   }

   public void method1801(Class7293 var1) throws Class2431 {
      this.field1533 = this.field1530.method32040(var1);
      this.field1537 = var1.method23063();
      if (!field1542 && this.field1537 == null) {
         throw new AssertionError();
      } else {
         try {
            this.field1523.method1730(this, this.field1533);
         } catch (Class2429 var5) {
            throw new Class2431("Handshake data rejected by client.");
         } catch (RuntimeException var6) {
            this.field1523.method1687(this, var6);
            throw new Class2431("rejected because of " + var6);
         }

         this.method1803(this.field1530.method32082(this.field1533));
      }
   }

   private void method1802(ByteBuffer var1) {
      this.field1521.add(var1);
      this.field1523.method1688(this);
   }

   private void method1803(List<ByteBuffer> var1) {
      synchronized (this.field1539) {
         for (ByteBuffer var6 : var1) {
            this.method1802(var6);
         }
      }
   }

   private void method1804(Class7295 var1) {
      this.field1528 = Class2211.field14458;

      try {
         this.field1523.method1683(this, var1);
      } catch (RuntimeException var5) {
         this.field1523.method1687(this, var5);
      }
   }

   @Override
   public boolean method1767() {
      return this.field1528 == Class2211.field14458;
   }

   @Override
   public boolean method1770() {
      return this.field1528 == Class2211.field14459;
   }

   @Override
   public boolean method1768() {
      return this.field1527;
   }

   @Override
   public boolean method1769() {
      return this.field1528 == Class2211.field14460;
   }

   @Override
   public Class2211 method1754() {
      return this.field1528;
   }

   public void method1805(SelectionKey var1) {
      this.field1524 = var1;
   }

   public SelectionKey method1806() {
      return this.field1524;
   }

   @Override
   public String toString() {
      return super.toString();
   }

   @Override
   public InetSocketAddress method1779() {
      return this.field1523.method1698(this);
   }

   @Override
   public InetSocketAddress method1778() {
      return this.field1523.method1697(this);
   }

   @Override
   public Class8844 method1734() {
      return this.field1530;
   }

   @Override
   public void method1745() {
      this.method1772(1000);
   }

   @Override
   public String method1780() {
      return this.field1537;
   }

   public long method1807() {
      return this.field1538;
   }

   public void method1808() {
      this.field1538 = System.nanoTime();
   }

   public Class343 method1809() {
      return this.field1523;
   }

   @Override
   public <T> T method1749() {
      return (T)this.field1541;
   }

   @Override
   public <T> void method1750(T var1) {
      this.field1541 = var1;
   }

   public ByteChannel method1810() {
      return this.field1525;
   }

   public void method1811(ByteChannel var1) {
      this.field1525 = var1;
   }

   public Class359 method1812() {
      return this.field1526;
   }

   public void method1813(Class359 var1) {
      this.field1526 = var1;
   }
}
