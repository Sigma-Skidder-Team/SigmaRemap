package remapped;

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
import org.java_websocket.exceptions.InvalidHandshakeException;

public class class_5913 implements class_4809 {
   public static final int field_30000 = 80;
   public static final int field_30001 = 443;
   public static final int field_30010 = 16384;
   public final BlockingQueue<ByteBuffer> field_30007;
   public final BlockingQueue<ByteBuffer> field_30013;
   private final class_563 field_29998;
   private SelectionKey field_29992;
   private ByteChannel field_29993;
   private class_2788 field_29997;
   private boolean field_30003 = false;
   private volatile class_7161 field_30011 = class_7161.field_36866;
   private List<class_7212> field_30009;
   private class_7212 field_30004 = null;
   private class_5282 field_30005;
   private ByteBuffer field_30015 = ByteBuffer.allocate(0);
   private class_9112 field_29990 = null;
   private String field_29995 = null;
   private Integer field_30008 = null;
   private Boolean field_29994 = null;
   private String field_30014 = null;
   private long field_29999 = System.nanoTime();
   private final Object field_30002 = new Object();
   private class_5047 field_29991;
   private Object field_30006;

   public class_5913(class_563 var1, List<class_7212> var2) {
      this(var1, (class_7212)null);
      this.field_30005 = class_5282.field_27019;
      if (var2 != null && !var2.isEmpty()) {
         this.field_30009 = var2;
      } else {
         this.field_30009 = new ArrayList<class_7212>();
         this.field_30009.add(new class_6089());
      }
   }

   public class_5913(class_563 var1, class_7212 var2) {
      if (var1 != null && (var2 != null || this.field_30005 != class_5282.field_27019)) {
         this.field_30007 = new LinkedBlockingQueue<ByteBuffer>();
         this.field_30013 = new LinkedBlockingQueue<ByteBuffer>();
         this.field_29998 = var1;
         this.field_30005 = class_5282.field_27022;
         if (var2 != null) {
            this.field_30004 = var2.method_33032();
         }
      } else {
         throw new IllegalArgumentException("parameters must not be null");
      }
   }

   public void method_27039(ByteBuffer var1) {
      assert var1.hasRemaining();

      if (this.field_30011 == class_7161.field_36866) {
         if (this.method_27040(var1) && !this.method_22158() && !this.method_22161()) {
            assert this.field_30015.hasRemaining() != var1.hasRemaining() || !var1.hasRemaining();

            if (!var1.hasRemaining()) {
               if (this.field_30015.hasRemaining()) {
                  this.method_27045(this.field_30015);
               }
            } else {
               this.method_27045(var1);
            }
         }
      } else if (this.field_30011 == class_7161.field_36865) {
         this.method_27045(var1);
      }
   }

   private boolean method_27040(ByteBuffer var1) {
      ByteBuffer var4;
      if (this.field_30015.capacity() == 0) {
         var4 = var1;
      } else {
         if (this.field_30015.remaining() < var1.remaining()) {
            ByteBuffer var5 = ByteBuffer.allocate(this.field_30015.capacity() + var1.remaining());
            ((Buffer)this.field_30015).flip();
            var5.put(this.field_30015);
            this.field_30015 = var5;
         }

         this.field_30015.put(var1);
         ((Buffer)this.field_30015).flip();
         var4 = this.field_30015;
      }

      ((Buffer)var4).mark();

      try {
         try {
            if (this.field_30005 == class_5282.field_27019) {
               if (this.field_30004 != null) {
                  class_6113 var24 = this.field_30004.method_33022(var4);
                  if (!(var24 instanceof class_9112)) {
                     this.method_27025(1002, "wrong http function", false);
                     return false;
                  }

                  class_9112 var27 = (class_9112)var24;
                  class_2952 var21 = this.field_30004.method_33026(var27);
                  if (var21 == class_2952.field_14425) {
                     this.method_27034(var27);
                     return true;
                  }

                  this.method_22155(1002, "the handshake did finally not match");
                  return false;
               }

               for (class_7212 var25 : this.field_30009) {
                  var25 = var25.method_33032();

                  try {
                     var25.method_33017(this.field_30005);
                     ((Buffer)var4).reset();
                     class_6113 var8 = var25.method_33022(var4);
                     if (!(var8 instanceof class_9112)) {
                        this.method_27035(new class_9615(1002, "wrong http function"));
                        return false;
                     }

                     class_9112 var9 = (class_9112)var8;
                     class_2952 var20 = var25.method_33026(var9);
                     if (var20 == class_2952.field_14425) {
                        this.field_30014 = var9.method_41962();

                        class_9710 var10;
                        try {
                           var10 = this.field_29998.method_2690(this, var25, var9);
                        } catch (class_9615 var14) {
                           this.method_27035(var14);
                           return false;
                        } catch (RuntimeException var15) {
                           this.field_29998.method_2696(this, var15);
                           this.method_27027(var15);
                           return false;
                        }

                        this.method_27029(var25.method_33018(var25.method_33031(var9, var10)));
                        this.field_30004 = var25;
                        this.method_27034(var9);
                        return true;
                     }
                  } catch (class_542 var16) {
                  }
               }

               if (this.field_30004 == null) {
                  this.method_27035(new class_9615(1002, "no draft matches"));
               }

               return false;
            }

            if (this.field_30005 == class_5282.field_27022) {
               this.field_30004.method_33017(this.field_30005);
               class_6113 var22 = this.field_30004.method_33022(var4);
               if (!(var22 instanceof class_6999)) {
                  this.method_27025(1002, "wrong http function", false);
                  return false;
               }

               class_6999 var7 = (class_6999)var22;
               class_2952 var19 = this.field_30004.method_33023(this.field_29990, var7);
               if (var19 == class_2952.field_14425) {
                  try {
                     this.field_29998.method_2691(this, this.field_29990, var7);
                  } catch (class_9615 var12) {
                     this.method_27025(var12.method_44383(), var12.getMessage(), false);
                     return false;
                  } catch (RuntimeException var13) {
                     this.field_29998.method_2696(this, var13);
                     this.method_27025(-1, var13.getMessage(), false);
                     return false;
                  }

                  this.method_27034(var7);
                  return true;
               }

               this.method_22155(1002, "draft " + this.field_30004 + " refuses handshake");
            }
         } catch (class_542 var17) {
            this.method_27021(var17);
         }
      } catch (class_8038 var18) {
         if (this.field_30015.capacity() == 0) {
            ((Buffer)var4).reset();
            int var6 = var18.method_36490();
            if (var6 == 0) {
               var6 = var4.capacity() + 16;
            } else {
               assert var18.method_36490() >= var4.remaining();
            }

            this.field_30015 = ByteBuffer.allocate(var6);
            this.field_30015.put(var1);
         } else {
            ((Buffer)this.field_30015).position(this.field_30015.limit());
            ((Buffer)this.field_30015).limit(this.field_30015.capacity());
         }
      }

      return false;
   }

   private void method_27045(ByteBuffer var1) {
      try {
         for (class_3106 var6 : this.field_30004.method_33036(var1)) {
            this.field_30004.method_33034(this, var6);
         }
      } catch (class_1351 var7) {
         if (var7.method_6239() == Integer.MAX_VALUE) {
            this.field_29998.method_2696(this, var7);
         }

         this.method_27021(var7);
      } catch (class_9615 var8) {
         this.field_29998.method_2696(this, var8);
         this.method_27021(var8);
      }
   }

   private void method_27035(class_9615 var1) {
      this.method_27028(this.method_27030(404));
      this.method_27025(var1.method_44383(), var1.getMessage(), false);
   }

   private void method_27027(RuntimeException var1) {
      this.method_27028(this.method_27030(500));
      this.method_27025(-1, var1.getMessage(), false);
   }

   private ByteBuffer method_27030(int var1) {
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
         class_3687.method_17152(
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

   public synchronized void method_27020(int var1, String var2, boolean var3) {
      if (this.field_30011 != class_7161.field_36867 && this.field_30011 != class_7161.field_36869) {
         if (this.field_30011 == class_7161.field_36865) {
            if (var1 == 1006) {
               assert !var3;

               this.field_30011 = class_7161.field_36867;
               this.method_27025(var1, var2, false);
               return;
            }

            if (this.field_30004.method_33025() != class_3555.field_17429) {
               try {
                  if (!var3) {
                     try {
                        this.field_29998.method_2686(this, var1, var2);
                     } catch (RuntimeException var7) {
                        this.field_29998.method_2696(this, var7);
                     }
                  }

                  if (this.method_22165()) {
                     class_6273 var6 = new class_6273();
                     var6.method_28601(var2);
                     var6.method_28604(var1);
                     var6.method_23572();
                     this.method_22163(var6);
                  }
               } catch (class_9615 var8) {
                  this.field_29998.method_2696(this, var8);
                  this.method_27025(1006, "generated frame is invalid", false);
               }
            }

            this.method_27025(var1, var2, var3);
         } else if (var1 == -3) {
            assert var3;

            this.method_27025(-3, var2, true);
         } else if (var1 == 1002) {
            this.method_27025(var1, var2, var3);
         } else {
            this.method_27025(-1, var2, false);
         }

         this.field_30011 = class_7161.field_36867;
         this.field_30015 = null;
      }
   }

   @Override
   public void method_22155(int var1, String var2) {
      this.method_27020(var1, var2, false);
   }

   public synchronized void method_27042(int var1, String var2, boolean var3) {
      if (this.field_30011 != class_7161.field_36869) {
         if (this.field_30011 == class_7161.field_36865 && var1 == 1006) {
            this.field_30011 = class_7161.field_36867;
         }

         if (this.field_29992 != null) {
            this.field_29992.cancel();
         }

         if (this.field_29993 != null) {
            try {
               this.field_29993.close();
            } catch (IOException var8) {
               if (!var8.getMessage().equals("Broken pipe")) {
                  this.field_29998.method_2696(this, var8);
               }
            }
         }

         try {
            this.field_29998.method_2683(this, var1, var2, var3);
         } catch (RuntimeException var7) {
            this.field_29998.method_2696(this, var7);
         }

         if (this.field_30004 != null) {
            this.field_30004.method_33041();
         }

         this.field_29990 = null;
         this.field_30011 = class_7161.field_36869;
      }
   }

   public void method_27043(int var1, boolean var2) {
      this.method_27042(var1, "", var2);
   }

   public void method_27041() {
      if (this.field_29994 != null) {
         this.method_27042(this.field_30008, this.field_29995, this.field_29994);
      } else {
         throw new IllegalStateException("this method must be used in conjunction with flushAndClose");
      }
   }

   @Override
   public void method_22173(int var1, String var2) {
      this.method_27042(var1, var2, false);
   }

   public synchronized void method_27025(int var1, String var2, boolean var3) {
      if (!this.field_30003) {
         this.field_30008 = var1;
         this.field_29995 = var2;
         this.field_29994 = var3;
         this.field_30003 = true;
         this.field_29998.method_2685(this);

         try {
            this.field_29998.method_2688(this, var1, var2, var3);
         } catch (RuntimeException var7) {
            this.field_29998.method_2696(this, var7);
         }

         if (this.field_30004 != null) {
            this.field_30004.method_33041();
         }

         this.field_29990 = null;
      }
   }

   public void method_27024() {
      if (this.field_30011 != class_7161.field_36866) {
         if (!this.field_30003) {
            if (this.field_30004.method_33025() != class_3555.field_17429) {
               if (this.field_30004.method_33025() != class_3555.field_17428) {
                  this.method_27043(1006, true);
               } else if (this.field_30005 != class_5282.field_27019) {
                  this.method_27043(1000, true);
               } else {
                  this.method_27043(1006, true);
               }
            } else {
               this.method_27043(1000, true);
            }
         } else {
            this.method_27042(this.field_30008, this.field_29995, this.field_29994);
         }
      } else {
         this.method_27043(-1, true);
      }
   }

   @Override
   public void method_22154(int var1) {
      this.method_27020(var1, "", false);
   }

   public void method_27021(class_9615 var1) {
      this.method_27020(var1.method_44383(), var1.getMessage(), false);
   }

   @Override
   public void method_22168(String var1) {
      if (var1 != null) {
         this.method_27038(this.field_30004.method_33029(var1, this.field_30005 == class_5282.field_27022));
      } else {
         throw new IllegalArgumentException("Cannot send 'null' data to a WebSocketImpl.");
      }
   }

   @Override
   public void method_22169(ByteBuffer var1) {
      if (var1 != null) {
         this.method_27038(this.field_30004.method_33030(var1, this.field_30005 == class_5282.field_27022));
      } else {
         throw new IllegalArgumentException("Cannot send 'null' data to a WebSocketImpl.");
      }
   }

   @Override
   public void method_22170(byte[] var1) {
      this.method_22169(ByteBuffer.wrap(var1));
   }

   private void method_27038(Collection<class_3106> var1) {
      if (!this.method_22165()) {
         throw new class_3701();
      } else if (var1 == null) {
         throw new IllegalArgumentException();
      } else {
         ArrayList var4 = new ArrayList();

         for (class_3106 var6 : var1) {
            var4.add(this.field_30004.method_33042(var6));
         }

         this.method_27029(var4);
      }
   }

   @Override
   public void method_22172(class_9252 var1, ByteBuffer var2, boolean var3) {
      this.method_27038(this.field_30004.method_33039(var1, var2, var3));
   }

   @Override
   public void method_22162(Collection<class_3106> var1) {
      this.method_27038(var1);
   }

   @Override
   public void method_22163(class_3106 var1) {
      this.method_27038(Collections.<class_3106>singletonList(var1));
   }

   @Override
   public void method_22160() {
      if (this.field_29991 == null) {
         this.field_29991 = new class_5047();
      }

      this.method_22163(this.field_29991);
   }

   @Override
   public boolean method_22167() {
      return !this.field_30007.isEmpty();
   }

   public void method_27044(class_5312 var1) throws InvalidHandshakeException {
      this.field_29990 = this.field_30004.method_33024(var1);
      this.field_30014 = var1.method_41962();

      assert this.field_30014 != null;

      try {
         this.field_29998.method_2692(this, this.field_29990);
      } catch (class_9615 var5) {
         throw new class_542("Handshake data rejected by client.");
      } catch (RuntimeException var6) {
         this.field_29998.method_2696(this, var6);
         throw new class_542("rejected because of " + var6);
      }

      this.method_27029(this.field_30004.method_33018(this.field_29990));
   }

   private void method_27028(ByteBuffer var1) {
      this.field_30007.add(var1);
      this.field_29998.method_2685(this);
   }

   private void method_27029(List<ByteBuffer> var1) {
      synchronized (this.field_30002) {
         for (ByteBuffer var6 : var1) {
            this.method_27028(var6);
         }
      }
   }

   private void method_27034(class_6113 var1) {
      this.field_30011 = class_7161.field_36865;

      try {
         this.field_29998.method_2682(this, var1);
      } catch (RuntimeException var5) {
         this.field_29998.method_2696(this, var5);
      }
   }

   @Override
   public boolean method_22165() {
      return this.field_30011 == class_7161.field_36865;
   }

   @Override
   public boolean method_22158() {
      return this.field_30011 == class_7161.field_36867;
   }

   @Override
   public boolean method_22166() {
      return this.field_30003;
   }

   @Override
   public boolean method_22161() {
      return this.field_30011 == class_7161.field_36869;
   }

   @Override
   public class_7161 method_22159() {
      return this.field_30011;
   }

   public void method_27046(SelectionKey var1) {
      this.field_29992 = var1;
   }

   public SelectionKey method_27026() {
      return this.field_29992;
   }

   @Override
   public String toString() {
      return super.toString();
   }

   @Override
   public InetSocketAddress method_22175() {
      return this.field_29998.method_2695(this);
   }

   @Override
   public InetSocketAddress method_22171() {
      return this.field_29998.method_2689(this);
   }

   @Override
   public class_7212 method_22174() {
      return this.field_30004;
   }

   @Override
   public void method_22153() {
      this.method_22154(1000);
   }

   @Override
   public String method_22156() {
      return this.field_30014;
   }

   public long method_27032() {
      return this.field_29999;
   }

   public void method_27036() {
      this.field_29999 = System.nanoTime();
   }

   public class_563 method_27022() {
      return this.field_29998;
   }

   @Override
   public <T> T method_22157() {
      return (T)this.field_30006;
   }

   @Override
   public <T> void method_22164(T var1) {
      this.field_30006 = var1;
   }

   public ByteChannel method_27037() {
      return this.field_29993;
   }

   public void method_27033(ByteChannel var1) {
      this.field_29993 = var1;
   }

   public class_2788 method_27047() {
      return this.field_29997;
   }

   public void method_27023(class_2788 var1) {
      this.field_29997 = var1;
   }
}
