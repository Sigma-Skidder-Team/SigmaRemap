package remapped;

import java.math.BigInteger;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TimeZone;
import org.java_websocket.exceptions.IncompleteException;
import org.java_websocket.exceptions.InvalidDataException;
import org.java_websocket.exceptions.InvalidFrameException;
import org.java_websocket.exceptions.InvalidHandshakeException;
import org.java_websocket.exceptions.LimitExceededException;

public class class_6089 extends class_7212 {
   private static final String field_31163 = "Sec-WebSocket-Key";
   private static final String field_31156 = "Sec-WebSocket-Protocol";
   private static final String field_31161 = "Sec-WebSocket-Extensions";
   private static final String field_31148 = "Sec-WebSocket-Accept";
   private static final String field_31162 = "Upgrade";
   private static final String field_31152 = "Connection";
   private class_7159 field_31153 = new class_6668();
   private List<class_7159> field_31149;
   private class_5964 field_31155;
   private List<class_5964> field_31154;
   private class_3106 field_31158;
   private final List<ByteBuffer> field_31164;
   private ByteBuffer field_31150;
   private final Random field_31159 = new Random();
   private int field_31151;

   public class_6089() {
      this(Collections.<class_7159>emptyList());
   }

   public class_6089(class_7159 var1) {
      this(Collections.<class_7159>singletonList(var1));
   }

   public class_6089(List<class_7159> var1) {
      this(var1, Collections.<class_5964>singletonList(new class_7562("")));
   }

   public class_6089(List<class_7159> var1, List<class_5964> var2) {
      this(var1, var2, Integer.MAX_VALUE);
   }

   public class_6089(List<class_7159> var1, int var2) {
      this(var1, Collections.<class_5964>singletonList(new class_7562("")), var2);
   }

   public class_6089(List<class_7159> var1, List<class_5964> var2, int var3) {
      if (var1 != null && var2 != null && var3 >= 1) {
         this.field_31149 = new ArrayList<class_7159>(var1.size());
         this.field_31154 = new ArrayList<class_5964>(var2.size());
         boolean var6 = false;
         this.field_31164 = new ArrayList<ByteBuffer>();

         for (class_7159 var8 : var1) {
            if (var8.getClass().equals(class_6668.class)) {
               var6 = true;
            }
         }

         this.field_31149.addAll(var1);
         if (!var6) {
            this.field_31149.add(this.field_31149.size(), this.field_31153);
         }

         this.field_31154.addAll(var2);
         this.field_31151 = var3;
      } else {
         throw new IllegalArgumentException();
      }
   }

   @Override
   public class_2952 method_33026(class_9112 var1) throws InvalidHandshakeException {
      int var4 = this.method_33044(var1);
      if (var4 != 13) {
         return class_2952.field_14423;
      } else {
         class_2952 var5 = class_2952.field_14423;
         String var6 = var1.댠ኞ쇽蓳牰픓("Sec-WebSocket-Extensions");

         for (class_7159 var8 : this.field_31149) {
            if (var8.method_32855(var6)) {
               this.field_31153 = var8;
               var5 = class_2952.field_14425;
               break;
            }
         }

         class_2952 var9 = this.method_27895(var1.댠ኞ쇽蓳牰픓("Sec-WebSocket-Protocol"));
         return var9 == class_2952.field_14425 && var5 == class_2952.field_14425 ? class_2952.field_14425 : class_2952.field_14423;
      }
   }

   private class_2952 method_27895(String var1) {
      for (class_5964 var5 : this.field_31154) {
         if (var5.method_27239(var1)) {
            this.field_31155 = var5;
            return class_2952.field_14425;
         }
      }

      return class_2952.field_14423;
   }

   @Override
   public class_2952 method_33023(class_9112 var1, class_6999 var2) throws InvalidHandshakeException {
      if (!this.method_33028(var2)) {
         return class_2952.field_14423;
      } else if (var1.퉧䎰뵯蒕娍ኞ("Sec-WebSocket-Key") && var2.퉧䎰뵯蒕娍ኞ("Sec-WebSocket-Accept")) {
         String var5 = var2.댠ኞ쇽蓳牰픓("Sec-WebSocket-Accept");
         String var6 = var1.댠ኞ쇽蓳牰픓("Sec-WebSocket-Key");
         var6 = this.method_27889(var6);
         if (!var6.equals(var5)) {
            return class_2952.field_14423;
         } else {
            class_2952 var7 = class_2952.field_14423;
            String var8 = var2.댠ኞ쇽蓳牰픓("Sec-WebSocket-Extensions");

            for (class_7159 var10 : this.field_31149) {
               if (var10.method_32851(var8)) {
                  this.field_31153 = var10;
                  var7 = class_2952.field_14425;
                  break;
               }
            }

            class_2952 var12 = this.method_27895(var2.댠ኞ쇽蓳牰픓("Sec-WebSocket-Protocol"));
            return var12 == class_2952.field_14425 && var7 == class_2952.field_14425 ? class_2952.field_14425 : class_2952.field_14423;
         }
      } else {
         return class_2952.field_14423;
      }
   }

   public class_7159 method_27901() {
      return this.field_31153;
   }

   public List<class_7159> method_27894() {
      return this.field_31149;
   }

   public class_5964 method_27886() {
      return this.field_31155;
   }

   public int method_27875() {
      return this.field_31151;
   }

   public List<class_5964> method_27880() {
      return this.field_31154;
   }

   @Override
   public class_5312 method_33024(class_5312 var1) {
      var1.綋浣哝卫柿待("Upgrade", "websocket");
      var1.綋浣哝卫柿待("Connection", "Upgrade");
      byte[] var4 = new byte[16];
      this.field_31159.nextBytes(var4);
      var1.綋浣哝卫柿待("Sec-WebSocket-Key", class_7827.method_35442(var4));
      var1.綋浣哝卫柿待("Sec-WebSocket-Version", "13");
      StringBuilder var5 = new StringBuilder();

      for (class_7159 var7 : this.field_31149) {
         if (var7.method_32858() != null && var7.method_32858().length() != 0) {
            if (var5.length() > 0) {
               var5.append(", ");
            }

            var5.append(var7.method_32858());
         }
      }

      if (var5.length() != 0) {
         var1.綋浣哝卫柿待("Sec-WebSocket-Extensions", var5.toString());
      }

      StringBuilder var9 = new StringBuilder();

      for (class_5964 var8 : this.field_31154) {
         if (var8.method_27241().length() != 0) {
            if (var9.length() > 0) {
               var9.append(", ");
            }

            var9.append(var8.method_27241());
         }
      }

      if (var9.length() != 0) {
         var1.綋浣哝卫柿待("Sec-WebSocket-Protocol", var9.toString());
      }

      return var1;
   }

   @Override
   public class_1699 method_33031(class_9112 var1, class_9710 var2) throws InvalidHandshakeException {
      var2.綋浣哝卫柿待("Upgrade", "websocket");
      var2.綋浣哝卫柿待("Connection", var1.댠ኞ쇽蓳牰픓("Connection"));
      String var5 = var1.댠ኞ쇽蓳牰픓("Sec-WebSocket-Key");
      if (var5 != null) {
         var2.綋浣哝卫柿待("Sec-WebSocket-Accept", this.method_27889(var5));
         if (this.method_27901().method_32854().length() != 0) {
            var2.綋浣哝卫柿待("Sec-WebSocket-Extensions", this.method_27901().method_32854());
         }

         if (this.method_27886() != null && this.method_27886().method_27241().length() != 0) {
            var2.綋浣哝卫柿待("Sec-WebSocket-Protocol", this.method_27886().method_27241());
         }

         var2.method_44850("Web Socket Protocol Handshake");
         var2.綋浣哝卫柿待("Server", "TooTallNate Java-WebSocket");
         var2.綋浣哝卫柿待("Date", this.method_27900());
         return var2;
      } else {
         throw new class_542("missing Sec-WebSocket-Key");
      }
   }

   @Override
   public class_7212 method_33032() {
      ArrayList var3 = new ArrayList();

      for (class_7159 var5 : this.method_27894()) {
         var3.add(var5.method_32856());
      }

      ArrayList var7 = new ArrayList();

      for (class_5964 var6 : this.method_27880()) {
         var7.add(var6.method_27240());
      }

      return new class_6089(var3, var7, this.field_31151);
   }

   @Override
   public ByteBuffer method_33042(class_3106 var1) {
      this.method_27901().method_32850(var1);
      return this.method_27887(var1);
   }

   private ByteBuffer method_27887(class_3106 var1) {
      ByteBuffer var4 = var1.method_14228();
      boolean var5 = this.field_37041 == class_5282.field_27022;
      int var6 = this.method_27876(var4);
      ByteBuffer var7 = ByteBuffer.allocate(1 + (var6 <= 1 ? var6 : var6 + 1) + (!var5 ? 0 : 4) + var4.remaining());
      byte var8 = this.method_27877(var1.method_14225());
      byte var9 = (byte)(!var1.method_14229() ? 0 : -128);
      var9 = (byte)(var9 | var8);
      var7.put(var9);
      byte[] var10 = this.method_27888((long)var4.remaining(), var6);

      assert var10.length == var6;

      if (var6 != 1) {
         if (var6 != 2) {
            if (var6 != 8) {
               throw new IllegalStateException("Size representation not supported/specified");
            }

            var7.put((byte)(127 | this.method_27898(var5)));
            var7.put(var10);
         } else {
            var7.put((byte)(126 | this.method_27898(var5)));
            var7.put(var10);
         }
      } else {
         var7.put((byte)(var10[0] | this.method_27898(var5)));
      }

      if (!var5) {
         var7.put(var4);
         ((Buffer)var4).flip();
      } else {
         ByteBuffer var11 = ByteBuffer.allocate(4);
         var11.putInt(this.field_31159.nextInt());
         var7.put(var11.array());

         for (int var12 = 0; var4.hasRemaining(); var12++) {
            var7.put((byte)(var4.get() ^ var11.get(var12 % 4)));
         }
      }

      assert var7.remaining() == 0 : var7.remaining();

      ((Buffer)var7).flip();
      return var7;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   private class_3106 method_27896(ByteBuffer var1) throws IncompleteException, InvalidDataException {
      int var2 = -1590484692;
      if (var1 != null) {
         int var4 = var1.remaining();
         int var5 = 2;
         this.method_27885(var4, var5);
         byte var6 = var1.get();
         boolean var7 = var6 >> 8 != 0;
         boolean var8 = false;
         boolean var9 = false;
         boolean var10 = false;
         byte var11 = var1.get();
         boolean var12 = (var11 & -128) != 0;
         int var13 = (byte)(var11 & 127);
         class_9252 var14 = this.method_27884((byte)(var6 & 15));
         if (var13 < 0) {
            if ((var2 & 2) == 0) {
               class_5763 var15 = this.method_27881(var1, var14, var13, var4, var5);
               var13 = class_5763.method_26064(var15);
               var5 = class_5763.method_26061(var15);
            }
         } else if (var13 > 125 && (var2 & 2) == 0) {
            class_5763 var20 = this.method_27881(var1, var14, var13, var4, var5);
            var13 = class_5763.method_26064(var20);
            var5 = class_5763.method_26061(var20);
         }

         while ((var2 & 131072) == 0) {
            if ((var2 & 2) == 0) {
               class_5763 var21 = this.method_27881(var1, var14, var13, var4, var5);
               var13 = class_5763.method_26064(var21);
               var5 = class_5763.method_26061(var21);
            }
         }

         this.method_27897((long)var13);
         var5 += !var12 ? 0 : 4;
         var5 += var13;
         this.method_27885(var4, var5);
         ByteBuffer var22 = ByteBuffer.allocate(this.method_33043(var13));
         if (!var12) {
            var22.put(var1.array(), var1.position(), var22.limit());
            ((Buffer)var1).position(var1.position() + var22.limit());
         } else {
            byte[] var16 = new byte[4];
            var1.get(var16);

            for (int var17 = 0; var17 < var13; var17++) {
               var22.put((byte)(var1.get() ^ var16[var17 % 4]));
            }
         }

         class_5148 var23 = class_5148.method_23568(var14);
         var23.method_23569(var7);
         var23.method_23566(var8);
         var23.method_23573(var9);
         var23.method_23571(var10);
         ((Buffer)var22).flip();
         var23.method_23565(var22);
         this.method_27901().method_32852(var23);
         this.method_27901().method_32857(var23);
         var23.method_23572();
         return var23;
      } else {
         throw new IllegalArgumentException();
      }
   }

   private class_5763 method_27881(ByteBuffer var1, class_9252 var2, int var3, int var4, int var5) throws InvalidFrameException, IncompleteException, LimitExceededException {
      if (var2 != class_9252.field_47231 && var2 != class_9252.field_47230 && var2 != class_9252.field_47226) {
         int var8;
         int var9;
         if (var3 != 126) {
            var9 = var5 + 8;
            this.method_27885(var4, var9);
            byte[] var10 = new byte[8];

            for (int var11 = 0; var11 < 8; var11++) {
               var10[var11] = var1.get();
            }

            long var12 = new BigInteger(var10).longValue();
            this.method_27897(var12);
            var8 = (int)var12;
         } else {
            var9 = var5 + 2;
            this.method_27885(var4, var9);
            byte[] var14 = new byte[]{0, var1.get(), var1.get()};
            var8 = new BigInteger(var14).intValue();
         }

         return new class_5763(this, var8, var9);
      } else {
         throw new class_7703("more than 125 octets");
      }
   }

   private void method_27897(long var1) throws LimitExceededException {
      if (var1 <= 2147483647L) {
         if (var1 <= (long)this.field_31151) {
            if (var1 < 0L) {
               throw new class_1351("Payloadsize is to little...");
            }
         } else {
            throw new class_1351("Payload limit reached.", this.field_31151);
         }
      } else {
         throw new class_1351("Payloadsize is to big...");
      }
   }

   private void method_27885(int var1, int var2) throws IncompleteException {
      if (var1 < var2) {
         throw new class_3103(var2);
      }
   }

   private byte method_27898(boolean var1) {
      return (byte)(!var1 ? 0 : -128);
   }

   private int method_27876(ByteBuffer var1) {
      if (var1.remaining() > 125) {
         return var1.remaining() > 65535 ? 8 : 2;
      } else {
         return 1;
      }
   }

   @Override
   public List<class_3106> method_33036(ByteBuffer var1) throws InvalidDataException {
      while (true) {
         LinkedList var4 = new LinkedList();
         if (this.field_31150 != null) {
            try {
               ((Buffer)var1).mark();
               int var5 = var1.remaining();
               int var10 = this.field_31150.remaining();
               if (var10 > var5) {
                  this.field_31150.put(var1.array(), var1.position(), var5);
                  ((Buffer)var1).position(var1.position() + var5);
                  return Collections.<class_3106>emptyList();
               }

               this.field_31150.put(var1.array(), var1.position(), var10);
               ((Buffer)var1).position(var1.position() + var10);
               class_3106 var7 = this.method_27896((ByteBuffer)((Buffer)this.field_31150.duplicate()).position(0));
               var4.add(var7);
               this.field_31150 = null;
            } catch (class_3103 var8) {
               ByteBuffer var6 = ByteBuffer.allocate(this.method_33043(var8.method_14221()));

               assert var6.limit() > this.field_31150.limit();

               ((Buffer)this.field_31150).rewind();
               var6.put(this.field_31150);
               this.field_31150 = var6;
               continue;
            }
         }

         while (var1.hasRemaining()) {
            ((Buffer)var1).mark();

            try {
               class_3106 var12 = this.method_27896(var1);
               var4.add(var12);
            } catch (class_3103 var9) {
               ((Buffer)var1).reset();
               int var11 = var9.method_14221();
               this.field_31150 = ByteBuffer.allocate(this.method_33043(var11));
               this.field_31150.put(var1);
               break;
            }
         }

         return var4;
      }
   }

   @Override
   public List<class_3106> method_33030(ByteBuffer var1, boolean var2) {
      class_4450 var5 = new class_4450();
      var5.method_23565(var1);
      var5.method_23570(var2);

      try {
         var5.method_23572();
      } catch (class_9615 var7) {
         throw new class_1457(var7);
      }

      return Collections.<class_3106>singletonList(var5);
   }

   @Override
   public List<class_3106> method_33029(String var1, boolean var2) {
      class_7109 var5 = new class_7109();
      var5.method_23565(ByteBuffer.wrap(class_3687.method_17149(var1)));
      var5.method_23570(var2);

      try {
         var5.method_23572();
      } catch (class_9615 var7) {
         throw new class_1457(var7);
      }

      return Collections.<class_3106>singletonList(var5);
   }

   @Override
   public void method_33041() {
      this.field_31150 = null;
      if (this.field_31153 != null) {
         this.field_31153.method_32853();
      }

      this.field_31153 = new class_6668();
      this.field_31155 = null;
   }

   private String method_27900() {
      Calendar var3 = Calendar.getInstance();
      SimpleDateFormat var4 = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US);
      var4.setTimeZone(TimeZone.getTimeZone("GMT"));
      return var4.format(var3.getTime());
   }

   private String method_27889(String var1) {
      String var4 = var1.trim();
      String var5 = var4 + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";

      MessageDigest var6;
      try {
         var6 = MessageDigest.getInstance("SHA1");
      } catch (NoSuchAlgorithmException var8) {
         throw new IllegalStateException(var8);
      }

      return class_7827.method_35442(var6.digest(var5.getBytes()));
   }

   private byte[] method_27888(long var1, int var3) {
      byte[] var6 = new byte[var3];
      int var7 = 8 * var3 - 8;

      for (int var8 = 0; var8 < var3; var8++) {
         var6[var8] = (byte)((int)(var1 >>> var7 - 8 * var8));
      }

      return var6;
   }

   private byte method_27877(class_9252 var1) {
      if (var1 != class_9252.field_47229) {
         if (var1 != class_9252.field_47232) {
            if (var1 != class_9252.field_47225) {
               if (var1 != class_9252.field_47226) {
                  if (var1 != class_9252.field_47231) {
                     if (var1 != class_9252.field_47230) {
                        throw new IllegalArgumentException("Don't know how to handle " + var1.toString());
                     } else {
                        return 10;
                     }
                  } else {
                     return 9;
                  }
               } else {
                  return 8;
               }
            } else {
               return 2;
            }
         } else {
            return 1;
         }
      } else {
         return 0;
      }
   }

   private class_9252 method_27884(byte var1) throws InvalidFrameException {
      switch (var1) {
         case 0:
            return class_9252.field_47229;
         case 1:
            return class_9252.field_47232;
         case 2:
            return class_9252.field_47225;
         case 3:
         case 4:
         case 5:
         case 6:
         case 7:
         default:
            throw new class_7703("Unknown opcode " + (short)var1);
         case 8:
            return class_9252.field_47226;
         case 9:
            return class_9252.field_47231;
         case 10:
            return class_9252.field_47230;
      }
   }

   @Override
   public void method_33034(class_5913 var1, class_3106 var2) throws InvalidDataException {
      class_9252 var5 = var2.method_14225();
      if (var5 != class_9252.field_47226) {
         if (var5 != class_9252.field_47231) {
            if (var5 != class_9252.field_47230) {
               if (var2.method_14229() && var5 != class_9252.field_47229) {
                  if (this.field_31158 != null) {
                     throw new class_9615(1002, "Continuous frame sequence not completed.");
                  }

                  if (var5 != class_9252.field_47232) {
                     if (var5 != class_9252.field_47225) {
                        throw new class_9615(1002, "non control or continious frame expected");
                     }

                     this.method_27902(var1, var2);
                  } else {
                     this.method_27890(var1, var2);
                  }
               } else {
                  this.method_27892(var1, var2, var5);
               }
            } else {
               var1.method_27036();
               var1.method_27022().method_2687(var1, var2);
            }
         } else {
            var1.method_27022().method_2684(var1, var2);
         }
      } else {
         this.method_27874(var1, var2);
      }
   }

   private void method_27892(class_5913 var1, class_3106 var2, class_9252 var3) throws InvalidDataException {
      if (var3 == class_9252.field_47229) {
         if (!var2.method_14229()) {
            if (this.field_31158 == null) {
               throw new class_9615(1002, "Continuous frame sequence was not started.");
            }
         } else {
            this.method_27893(var1, var2);
         }
      } else {
         this.method_27883(var2);
      }

      if (var3 == class_9252.field_47232 && !class_3687.method_17150(var2.method_14228())) {
         throw new class_9615(1007);
      } else {
         if (var3 == class_9252.field_47229 && this.field_31158 != null) {
            this.method_27891(var2.method_14228());
         }
      }
   }

   private void method_27902(class_5913 var1, class_3106 var2) {
      try {
         var1.method_27022().method_2694(var1, var2.method_14228());
      } catch (RuntimeException var6) {
         this.method_27882(var1, var6);
      }
   }

   private void method_27882(class_5913 var1, RuntimeException var2) {
      var1.method_27022().method_2696(var1, var2);
   }

   private void method_27890(class_5913 var1, class_3106 var2) throws InvalidDataException {
      try {
         var1.method_27022().method_2693(var1, class_3687.method_17154(var2.method_14228()));
      } catch (RuntimeException var6) {
         this.method_27882(var1, var6);
      }
   }

   private void method_27893(class_5913 var1, class_3106 var2) throws InvalidDataException {
      if (this.field_31158 == null) {
         throw new class_9615(1002, "Continuous frame sequence was not started.");
      } else {
         this.method_27891(var2.method_14228());
         this.method_27873();
         if (this.field_31158.method_14225() == class_9252.field_47232) {
            ((class_5148)this.field_31158).method_23565(this.method_27899());
            ((class_5148)this.field_31158).method_23572();

            try {
               var1.method_27022().method_2693(var1, class_3687.method_17154(this.field_31158.method_14228()));
            } catch (RuntimeException var7) {
               this.method_27882(var1, var7);
            }
         } else if (this.field_31158.method_14225() == class_9252.field_47225) {
            ((class_5148)this.field_31158).method_23565(this.method_27899());
            ((class_5148)this.field_31158).method_23572();

            try {
               var1.method_27022().method_2694(var1, this.field_31158.method_14228());
            } catch (RuntimeException var6) {
               this.method_27882(var1, var6);
            }
         }

         this.field_31158 = null;
         this.method_27879();
      }
   }

   private void method_27883(class_3106 var1) throws InvalidDataException {
      if (this.field_31158 == null) {
         this.field_31158 = var1;
         this.method_27891(var1.method_14228());
         this.method_27873();
      } else {
         throw new class_9615(1002, "Previous continuous frame sequence not completed.");
      }
   }

   private void method_27874(class_5913 var1, class_3106 var2) {
      int var5 = 1005;
      String var6 = "";
      if (var2 instanceof class_6273) {
         class_6273 var7 = (class_6273)var2;
         var5 = var7.method_28602();
         var6 = var7.method_28600();
      }

      if (var1.method_22159() != class_7161.field_36867) {
         if (this.method_33025() != class_3555.field_17430) {
            var1.method_27025(var5, var6, false);
         } else {
            var1.method_27020(var5, var6, true);
         }
      } else {
         var1.method_27042(var5, var6, true);
      }
   }

   private void method_27879() {
      synchronized (this.field_31164) {
         this.field_31164.clear();
      }
   }

   private void method_27891(ByteBuffer var1) {
      synchronized (this.field_31164) {
         this.field_31164.add(var1);
      }
   }

   private void method_27873() throws LimitExceededException {
      long var3 = this.method_27878();
      if (var3 > (long)this.field_31151) {
         this.method_27879();
         throw new class_1351(this.field_31151);
      }
   }

   @Override
   public class_3555 method_33025() {
      return class_3555.field_17430;
   }

   @Override
   public String toString() {
      String var3 = super.toString();
      if (this.method_27901() != null) {
         var3 = var3 + " extension: " + this.method_27901().toString();
      }

      if (this.method_27886() != null) {
         var3 = var3 + " protocol: " + this.method_27886().toString();
      }

      return var3 + " max frame size: " + this.field_31151;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         class_6089 var4 = (class_6089)var1;
         if (this.field_31151 != var4.method_27875()) {
            return false;
         } else if (this.field_31153 == null ? var4.method_27901() == null : this.field_31153.equals(var4.method_27901())) {
            return this.field_31155 == null ? var4.method_27886() == null : this.field_31155.equals(var4.method_27886());
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      int var3 = this.field_31153 == null ? 0 : this.field_31153.hashCode();
      var3 = 31 * var3 + (this.field_31155 == null ? 0 : this.field_31155.hashCode());
      return 31 * var3 + (this.field_31151 ^ this.field_31151 >>> 32);
   }

   private ByteBuffer method_27899() throws LimitExceededException {
      long var3 = 0L;
      ByteBuffer var8;
      synchronized (this.field_31164) {
         for (ByteBuffer var7 : this.field_31164) {
            var3 += (long)var7.limit();
         }

         this.method_27873();
         var8 = ByteBuffer.allocate((int)var3);

         for (ByteBuffer var12 : this.field_31164) {
            var8.put(var12);
         }
      }

      ((Buffer)var8).flip();
      return var8;
   }

   private long method_27878() {
      long var3 = 0L;
      synchronized (this.field_31164) {
         for (ByteBuffer var7 : this.field_31164) {
            var3 += (long)var7.limit();
         }

         return var3;
      }
   }
}
