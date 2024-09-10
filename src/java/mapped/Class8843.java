package mapped;


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

public class Class8843 extends Class8844 {
   private static final String field39944 = "Sec-WebSocket-Key";
   private static final String field39945 = "Sec-WebSocket-Protocol";
   private static final String field39946 = "Sec-WebSocket-Extensions";
   private static final String field39947 = "Sec-WebSocket-Accept";
   private static final String field39948 = "Upgrade";
   private static final String field39949 = "Connection";
   private Class7614 field39950 = new Class7613();
   private List<Class7614> field39951;
   private Class8800 field39952;
   private List<Class8800> field39953;
   private Class6454 field39954;
   private final List<ByteBuffer> field39955;
   private ByteBuffer field39956;
   private final Random field39957 = new Random();
   private int field39958;
   public static final boolean field39959 = !Class8843.class.desiredAssertionStatus();

   public Class8843() {
      this(Collections.<Class7614>emptyList());
   }

   public Class8843(Class7614 var1) {
      this(Collections.<Class7614>singletonList(var1));
   }

   public Class8843(List<Class7614> var1) {
      this(var1, Collections.<Class8800>singletonList(new Class8801("")));
   }

   public Class8843(List<Class7614> var1, List<Class8800> var2) {
      this(var1, var2, Integer.MAX_VALUE);
   }

   public Class8843(List<Class7614> var1, int var2) {
      this(var1, Collections.<Class8800>singletonList(new Class8801("")), var2);
   }

   public Class8843(List<Class7614> var1, List<Class8800> var2, int var3) {
      if (var1 != null && var2 != null && var3 >= 1) {
         this.field39951 = new ArrayList<Class7614>(var1.size());
         this.field39953 = new ArrayList<Class8800>(var2.size());
         boolean var6 = false;
         this.field39955 = new ArrayList<ByteBuffer>();

         for (Class7614 var8 : var1) {
            if (var8.getClass().equals(Class7613.class)) {
               var6 = true;
            }
         }

         this.field39951.addAll(var1);
         if (!var6) {
            this.field39951.add(this.field39951.size(), this.field39950);
         }

         this.field39953.addAll(var2);
         this.field39958 = var3;
      } else {
         throw new IllegalArgumentException();
      }
   }

   @Override
   public Class2265 method32032(Class7294 var1) throws Class2431 {
      int var4 = this.method32087(var1);
      if (var4 != 13) {
         return Class2265.field14726;
      } else {
         Class2265 var5 = Class2265.field14726;
         String var6 = var1.method23065("Sec-WebSocket-Extensions");

         for (Class7614 var8 : this.field39951) {
            if (var8.method24935(var6)) {
               this.field39950 = var8;
               var5 = Class2265.field14725;
               break;
            }
         }

         Class2265 var9 = this.method32033(var1.method23065("Sec-WebSocket-Protocol"));
         return var9 == Class2265.field14725 && var5 == Class2265.field14725 ? Class2265.field14725 : Class2265.field14726;
      }
   }

   private Class2265 method32033(String var1) {
      for (Class8800 var5 : this.field39953) {
         if (var5.method31776(var1)) {
            this.field39952 = var5;
            return Class2265.field14725;
         }
      }

      return Class2265.field14726;
   }

   @Override
   public Class2265 method32034(Class7294 var1, Class7296 var2) throws Class2431 {
      if (!this.method32079(var2)) {
         return Class2265.field14726;
      } else if (var1.method23066("Sec-WebSocket-Key") && var2.method23066("Sec-WebSocket-Accept")) {
         String var5 = var2.method23065("Sec-WebSocket-Accept");
         String var6 = var1.method23065("Sec-WebSocket-Key");
         var6 = this.method32056(var6);
         if (!var6.equals(var5)) {
            return Class2265.field14726;
         } else {
            Class2265 var7 = Class2265.field14726;
            String var8 = var2.method23065("Sec-WebSocket-Extensions");

            for (Class7614 var10 : this.field39951) {
               if (var10.method24936(var8)) {
                  this.field39950 = var10;
                  var7 = Class2265.field14725;
                  break;
               }
            }

            Class2265 var12 = this.method32033(var2.method23065("Sec-WebSocket-Protocol"));
            return var12 == Class2265.field14725 && var7 == Class2265.field14725 ? Class2265.field14725 : Class2265.field14726;
         }
      } else {
         return Class2265.field14726;
      }
   }

   public Class7614 method32035() {
      return this.field39950;
   }

   public List<Class7614> method32036() {
      return this.field39951;
   }

   public Class8800 method32037() {
      return this.field39952;
   }

   public int method32038() {
      return this.field39958;
   }

   public List<Class8800> method32039() {
      return this.field39953;
   }

   @Override
   public Class7293 method32040(Class7293 var1) {
      var1.method23061("Upgrade", "websocket");
      var1.method23061("Connection", "Upgrade");
      byte[] var4 = new byte[16];
      this.field39957.nextBytes(var4);
      var1.method23061("Sec-WebSocket-Key", Class9290.method35021(var4));
      var1.method23061("Sec-WebSocket-Version", "13");
      StringBuilder var5 = new StringBuilder();

      for (Class7614 var7 : this.field39951) {
         if (var7.method24937() != null && var7.method24937().length() != 0) {
            if (var5.length() > 0) {
               var5.append(", ");
            }

            var5.append(var7.method24937());
         }
      }

      if (var5.length() != 0) {
         var1.method23061("Sec-WebSocket-Extensions", var5.toString());
      }

      StringBuilder var9 = new StringBuilder();

      for (Class8800 var8 : this.field39953) {
         if (var8.method31777().length() != 0) {
            if (var9.length() > 0) {
               var9.append(", ");
            }

            var9.append(var8.method31777());
         }
      }

      if (var9.length() != 0) {
         var1.method23061("Sec-WebSocket-Protocol", var9.toString());
      }

      return var1;
   }

   @Override
   public Class7292 method32041(Class7294 var1, Class7297 var2) throws Class2431 {
      var2.method23061("Upgrade", "websocket");
      var2.method23061("Connection", var1.method23065("Connection"));
      String var5 = var1.method23065("Sec-WebSocket-Key");
      if (var5 != null) {
         var2.method23061("Sec-WebSocket-Accept", this.method32056(var5));
         if (this.method32035().method24938().length() != 0) {
            var2.method23061("Sec-WebSocket-Extensions", this.method32035().method24938());
         }

         if (this.method32037() != null && this.method32037().method31777().length() != 0) {
            var2.method23061("Sec-WebSocket-Protocol", this.method32037().method31777());
         }

         var2.method23071("Web Socket Protocol Handshake");
         var2.method23061("Server", "TooTallNate Java-WebSocket");
         var2.method23061("Date", this.method32055());
         return var2;
      } else {
         throw new Class2431("missing Sec-WebSocket-Key");
      }
   }

   @Override
   public Class8844 method32042() {
      ArrayList var3 = new ArrayList();

      for (Class7614 var5 : this.method32036()) {
         var3.add(var5.method24939());
      }

      ArrayList var7 = new ArrayList();

      for (Class8800 var6 : this.method32039()) {
         var7.add(var6.method31778());
      }

      return new Class8843(var3, var7, this.field39958);
   }

   @Override
   public ByteBuffer method32043(Class6454 var1) {
      this.method32035().method24934(var1);
      return this.method32044(var1);
   }

   private ByteBuffer method32044(Class6454 var1) {
      ByteBuffer var4 = var1.method19618();
      boolean var5 = this.field39960 == Class2026.field13153;
      int var6 = this.method32050(var4);
      ByteBuffer var7 = ByteBuffer.allocate(1 + (var6 <= 1 ? var6 : var6 + 1) + (!var5 ? 0 : 4) + var4.remaining());
      byte var8 = this.method32058(var1.method19616());
      byte var9 = (byte)(!var1.method19615() ? 0 : -128);
      var9 = (byte)(var9 | var8);
      var7.put(var9);
      byte[] var10 = this.method32057((long)var4.remaining(), var6);
      if (!field39959 && var10.length != var6) {
         throw new AssertionError();
      } else {
         if (var6 != 1) {
            if (var6 != 2) {
               if (var6 != 8) {
                  throw new IllegalStateException("Size representation not supported/specified");
               }

               var7.put((byte)(127 | this.method32049(var5)));
               var7.put(var10);
            } else {
               var7.put((byte)(126 | this.method32049(var5)));
               var7.put(var10);
            }
         } else {
            var7.put((byte)(var10[0] | this.method32049(var5)));
         }

         if (!var5) {
            var7.put(var4);
            ((Buffer)var4).flip();
         } else {
            ByteBuffer var11 = ByteBuffer.allocate(4);
            var11.putInt(this.field39957.nextInt());
            var7.put(var11.array());

            for (int var12 = 0; var4.hasRemaining(); var12++) {
               var7.put((byte)(var4.get() ^ var11.get(var12 % 4)));
            }
         }

         if (!field39959 && var7.remaining() != 0) {
            throw new AssertionError(var7.remaining());
         } else {
            ((Buffer)var7).flip();
            return var7;
         }
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   private Class6454 method32045(ByteBuffer var1) throws Class2429, Class2466, Class2446 {
      int var2 = -1590484692;
      if (var1 != null) {
         int var4 = var1.remaining();
         int var5 = 2;
         this.method32048(var4, var5);
         byte var6 = var1.get();
         boolean var7 = var6 >> 8 != 0;
         boolean var8 = false;
         boolean var9 = false;
         boolean var10 = false;
         byte var11 = var1.get();
         boolean var12 = (var11 & -128) != 0;
         int var13 = (byte)(var11 & 127);
         Class2325 var14 = this.method32059((byte)(var6 & 15));
         if (var13 < 0) {
            if ((var2 & 2) == 0) {
               Class8752 var15 = this.method32046(var1, var14, var13, var4, var5);
               var13 = Class8752.method31577(var15);
               var5 = Class8752.method31578(var15);
            }
         } else if (var13 > 125 && (var2 & 2) == 0) {
            Class8752 var20 = this.method32046(var1, var14, var13, var4, var5);
            var13 = Class8752.method31577(var20);
            var5 = Class8752.method31578(var20);
         }

         while ((var2 & 131072) == 0) {
            if ((var2 & 2) == 0) {
               Class8752 var21 = this.method32046(var1, var14, var13, var4, var5);
               var13 = Class8752.method31577(var21);
               var5 = Class8752.method31578(var21);
            }
         }

         this.method32047((long)var13);
         var5 += !var12 ? 0 : 4;
         var5 += var13;
         this.method32048(var4, var5);
         ByteBuffer var22 = ByteBuffer.allocate(this.method32086(var13));
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

         Class6453 var23 = Class6453.method19626(var14);
         var23.method19621(var7);
         var23.method19622(var8);
         var23.method19623(var9);
         var23.method19624(var10);
         ((Buffer)var22).flip();
         var23.method19620(var22);
         this.method32035().method24932(var23);
         this.method32035().method24933(var23);
         var23.method19611();
         return var23;
      } else {
         throw new IllegalArgumentException();
      }
   }

   private Class8752 method32046(ByteBuffer var1, Class2325 var2, int var3, int var4, int var5) throws Class2430, Class2432, Class2446 {
      if (var2 != Class2325.field15913 && var2 != Class2325.field15914 && var2 != Class2325.field15915) {
         int var8;
         int var9;
         if (var3 != 126) {
            var9 = var5 + 8;
            this.method32048(var4, var9);
            byte[] var10 = new byte[8];

            for (int var11 = 0; var11 < 8; var11++) {
               var10[var11] = var1.get();
            }

            long var12 = new BigInteger(var10).longValue();
            this.method32047(var12);
            var8 = (int)var12;
         } else {
            var9 = var5 + 2;
            this.method32048(var4, var9);
            byte[] var14 = new byte[]{0, var1.get(), var1.get()};
            var8 = new BigInteger(var14).intValue();
         }

         return new Class8752(this, var8, var9);
      } else {
         throw new Class2430("more than 125 octets");
      }
   }

   private void method32047(long var1) throws Class2432 {
      if (var1 <= 2147483647L) {
         if (var1 <= (long)this.field39958) {
            if (var1 < 0L) {
               throw new Class2432("Payloadsize is to little...");
            }
         } else {
            throw new Class2432("Payload limit reached.", this.field39958);
         }
      } else {
         throw new Class2432("Payloadsize is to big...");
      }
   }

   private void method32048(int var1, int var2) throws Class2446 {
      if (var1 < var2) {
         throw new Class2446(var2);
      }
   }

   private byte method32049(boolean var1) {
      return (byte)(!var1 ? 0 : -128);
   }

   private int method32050(ByteBuffer var1) {
      if (var1.remaining() > 125) {
         return var1.remaining() > 65535 ? 8 : 2;
      } else {
         return 1;
      }
   }

   @Override
   public List<Class6454> method32051(ByteBuffer var1) throws Class2429 {
      while (true) {
         LinkedList var4 = new LinkedList();
         if (this.field39956 != null) {
            try {
               ((Buffer)var1).mark();
               int var5 = var1.remaining();
               int var10 = this.field39956.remaining();
               if (var10 > var5) {
                  this.field39956.put(var1.array(), var1.position(), var5);
                  ((Buffer)var1).position(var1.position() + var5);
                  return Collections.<Class6454>emptyList();
               }

               this.field39956.put(var1.array(), var1.position(), var10);
               ((Buffer)var1).position(var1.position() + var10);
               Class6454 var7 = this.method32045((ByteBuffer)((Buffer)this.field39956.duplicate()).position(0));
               var4.add(var7);
               this.field39956 = null;
            } catch (Class2446 var8) {
               ByteBuffer var6 = ByteBuffer.allocate(this.method32086(var8.method10457()));
               if (!field39959 && var6.limit() <= this.field39956.limit()) {
                  throw new AssertionError();
               }

               ((Buffer)this.field39956).rewind();
               var6.put(this.field39956);
               this.field39956 = var6;
               continue;
            }
         }

         while (var1.hasRemaining()) {
            ((Buffer)var1).mark();

            try {
               Class6454 var12 = this.method32045(var1);
               var4.add(var12);
            } catch (Class2446 var9) {
               ((Buffer)var1).reset();
               int var11 = var9.method10457();
               this.field39956 = ByteBuffer.allocate(this.method32086(var11));
               this.field39956.put(var1);
               break;
            }
         }

         return var4;
      }
   }

   @Override
   public List<Class6454> method32052(ByteBuffer var1, boolean var2) {
      Class6460 var5 = new Class6460();
      var5.method19620(var1);
      var5.method19625(var2);

      try {
         var5.method19611();
      } catch (Class2429 var7) {
         throw new Class2504(var7);
      }

      return Collections.<Class6454>singletonList(var5);
   }

   @Override
   public List<Class6454> method32053(String var1, boolean var2) {
      Class6459 var5 = new Class6459();
      var5.method19620(ByteBuffer.wrap(Class8134.method28193(var1)));
      var5.method19625(var2);

      try {
         var5.method19611();
      } catch (Class2429 var7) {
         throw new Class2504(var7);
      }

      return Collections.<Class6454>singletonList(var5);
   }

   @Override
   public void method32054() {
      this.field39956 = null;
      if (this.field39950 != null) {
         this.field39950.method24940();
      }

      this.field39950 = new Class7613();
      this.field39952 = null;
   }

   private String method32055() {
      Calendar var3 = Calendar.getInstance();
      SimpleDateFormat var4 = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US);
      var4.setTimeZone(TimeZone.getTimeZone("GMT"));
      return var4.format(var3.getTime());
   }

   private String method32056(String var1) {
      String var4 = var1.trim();
      String var5 = var4 + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";

      MessageDigest var6;
      try {
         var6 = MessageDigest.getInstance("SHA1");
      } catch (NoSuchAlgorithmException var8) {
         throw new IllegalStateException(var8);
      }

      return Class9290.method35021(var6.digest(var5.getBytes()));
   }

   private byte[] method32057(long var1, int var3) {
      byte[] var6 = new byte[var3];
      int var7 = 8 * var3 - 8;

      for (int var8 = 0; var8 < var3; var8++) {
         var6[var8] = (byte)((int)(var1 >>> var7 - 8 * var8));
      }

      return var6;
   }

   private byte method32058(Class2325 var1) {
      if (var1 != Class2325.field15910) {
         if (var1 != Class2325.field15911) {
            if (var1 != Class2325.field15912) {
               if (var1 != Class2325.field15915) {
                  if (var1 != Class2325.field15913) {
                     if (var1 != Class2325.field15914) {
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

   private Class2325 method32059(byte var1) throws Class2430 {
      switch (var1) {
         case 0:
            return Class2325.field15910;
         case 1:
            return Class2325.field15911;
         case 2:
            return Class2325.field15912;
         case 3:
         case 4:
         case 5:
         case 6:
         case 7:
         default:
            throw new Class2430("Unknown opcode " + (short)var1);
         case 8:
            return Class2325.field15915;
         case 9:
            return Class2325.field15913;
         case 10:
            return Class2325.field15914;
      }
   }

   @Override
   public void method32060(Class346 var1, Class6454 var2) throws Class2429 {
      Class2325 var5 = var2.method19616();
      if (var5 != Class2325.field15915) {
         if (var5 != Class2325.field15913) {
            if (var5 != Class2325.field15914) {
               if (var2.method19615() && var5 != Class2325.field15910) {
                  if (this.field39954 != null) {
                     throw new Class2429(1002, "Continuous frame sequence not completed.");
                  }

                  if (var5 != Class2325.field15911) {
                     if (var5 != Class2325.field15912) {
                        throw new Class2429(1002, "non control or continious frame expected");
                     }

                     this.method32062(var1, var2);
                  } else {
                     this.method32064(var1, var2);
                  }
               } else {
                  this.method32061(var1, var2, var5);
               }
            } else {
               var1.method1808();
               var1.method1809().method1732(var1, var2);
            }
         } else {
            var1.method1809().method1731(var1, var2);
         }
      } else {
         this.method32067(var1, var2);
      }
   }

   private void method32061(Class346 var1, Class6454 var2, Class2325 var3) throws Class2429 {
      if (var3 == Class2325.field15910) {
         if (!var2.method19615()) {
            if (this.field39954 == null) {
               throw new Class2429(1002, "Continuous frame sequence was not started.");
            }
         } else {
            this.method32065(var1, var2);
         }
      } else {
         this.method32066(var2);
      }

      if (var3 == Class2325.field15911 && !Class8134.method28200(var2.method19618())) {
         throw new Class2429(1007);
      } else {
         if (var3 == Class2325.field15910 && this.field39954 != null) {
            this.method32069(var2.method19618());
         }
      }
   }

   private void method32062(Class346 var1, Class6454 var2) {
      try {
         var1.method1809().method1682(var1, var2.method19618());
      } catch (RuntimeException var6) {
         this.method32063(var1, var6);
      }
   }

   private void method32063(Class346 var1, RuntimeException var2) {
      var1.method1809().method1687(var1, var2);
   }

   private void method32064(Class346 var1, Class6454 var2) throws Class2429 {
      try {
         var1.method1809().method1681(var1, Class8134.method28198(var2.method19618()));
      } catch (RuntimeException var6) {
         this.method32063(var1, var6);
      }
   }

   private void method32065(Class346 var1, Class6454 var2) throws Class2429 {
      if (this.field39954 == null) {
         throw new Class2429(1002, "Continuous frame sequence was not started.");
      } else {
         this.method32069(var2.method19618());
         this.method32070();
         if (this.field39954.method19616() == Class2325.field15911) {
            ((Class6453)this.field39954).method19620(this.method32072());
            ((Class6453)this.field39954).method19611();

            try {
               var1.method1809().method1681(var1, Class8134.method28198(this.field39954.method19618()));
            } catch (RuntimeException var7) {
               this.method32063(var1, var7);
            }
         } else if (this.field39954.method19616() == Class2325.field15912) {
            ((Class6453)this.field39954).method19620(this.method32072());
            ((Class6453)this.field39954).method19611();

            try {
               var1.method1809().method1682(var1, this.field39954.method19618());
            } catch (RuntimeException var6) {
               this.method32063(var1, var6);
            }
         }

         this.field39954 = null;
         this.method32068();
      }
   }

   private void method32066(Class6454 var1) throws Class2429 {
      if (this.field39954 == null) {
         this.field39954 = var1;
         this.method32069(var1.method19618());
         this.method32070();
      } else {
         throw new Class2429(1002, "Previous continuous frame sequence not completed.");
      }
   }

   private void method32067(Class346 var1, Class6454 var2) {
      int var5 = 1005;
      String var6 = "";
      if (var2 instanceof Class6458) {
         Class6458 var7 = (Class6458)var2;
         var5 = var7.method19629();
         var6 = var7.method19630();
      }

      if (var1.method1754() != Class2211.field14459) {
         if (this.method32071() != Class1905.field11193) {
            var1.method1797(var5, var6, false);
         } else {
            var1.method1793(var5, var6, true);
         }
      } else {
         var1.method1794(var5, var6, true);
      }
   }

   private void method32068() {
      synchronized (this.field39955) {
         this.field39955.clear();
      }
   }

   private void method32069(ByteBuffer var1) {
      synchronized (this.field39955) {
         this.field39955.add(var1);
      }
   }

   private void method32070() throws Class2432 {
      long var3 = this.method32073();
      if (var3 > (long)this.field39958) {
         this.method32068();
         throw new Class2432(this.field39958);
      }
   }

   @Override
   public Class1905 method32071() {
      return Class1905.field11193;
   }

   @Override
   public String toString() {
      String var3 = super.toString();
      if (this.method32035() != null) {
         var3 = var3 + " extension: " + this.method32035().toString();
      }

      if (this.method32037() != null) {
         var3 = var3 + " protocol: " + this.method32037().toString();
      }

      return var3 + " max frame size: " + this.field39958;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         Class8843 var4 = (Class8843)var1;
         if (this.field39958 != var4.method32038()) {
            return false;
         } else if (this.field39950 == null ? var4.method32035() == null : this.field39950.equals(var4.method32035())) {
            return this.field39952 == null ? var4.method32037() == null : this.field39952.equals(var4.method32037());
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      int var3 = this.field39950 == null ? 0 : this.field39950.hashCode();
      var3 = 31 * var3 + (this.field39952 == null ? 0 : this.field39952.hashCode());
      return 31 * var3 + (this.field39958 ^ this.field39958 >>> 32);
   }

   private ByteBuffer method32072() throws Class2432 {
      long var3 = 0L;
      ByteBuffer var8;
      synchronized (this.field39955) {
         for (ByteBuffer var7 : this.field39955) {
            var3 += (long)var7.limit();
         }

         this.method32070();
         var8 = ByteBuffer.allocate((int)var3);

         for (ByteBuffer var12 : this.field39955) {
            var8.put(var12);
         }
      }

      ((Buffer)var8).flip();
      return var8;
   }

   private long method32073() {
      long var3 = 0L;
      synchronized (this.field39955) {
         for (ByteBuffer var7 : this.field39955) {
            var3 += (long)var7.limit();
         }

         return var3;
      }
   }
}
