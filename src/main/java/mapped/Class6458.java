package mapped;

import java.nio.Buffer;
import java.nio.ByteBuffer;


public class Class6458 extends Class6455 {
   public static final int field28374 = 1000;
   public static final int field28375 = 1001;
   public static final int field28376 = 1002;
   public static final int field28377 = 1003;
   public static final int field28378 = 1005;
   public static final int field28379 = 1006;
   public static final int field28380 = 1007;
   public static final int field28381 = 1008;
   public static final int field28382 = 1009;
   public static final int field28383 = 1010;
   public static final int field28384 = 1011;
   public static final int field28385 = 1012;
   public static final int field28386 = 1013;
   public static final int field28387 = 1014;
   public static final int field28388 = 1015;
   public static final int field28389 = -1;
   public static final int field28390 = -2;
   public static final int field28391 = -3;
   private int field28392;
   private String field28393;

   public Class6458() {
      super(Class2325.field15915);
      this.method19628("");
      this.method19627(1000);
   }

   public void method19627(int var1) {
      this.field28392 = var1;
      if (var1 == 1015) {
         this.field28392 = 1005;
         this.field28393 = "";
      }

      this.method19632();
   }

   public void method19628(String var1) {
      if (var1 == null) {
         var1 = "";
      }

      this.field28393 = var1;
      this.method19632();
   }

   public int method19629() {
      return this.field28392;
   }

   public String method19630() {
      return this.field28393;
   }

   @Override
   public String toString() {
      return super.toString() + "code: " + this.field28392;
   }

   @Override
   public void method19611() throws Class2429 {
      super.method19611();
      if (this.field28392 == 1007 && this.field28393.isEmpty()) {
         throw new Class2429(1007, "Received text is no valid utf8 string!");
      } else if (this.field28392 == 1005 && 0 < this.field28393.length()) {
         throw new Class2429(1002, "A close frame must have a closecode if it has a reason");
      } else if (this.field28392 > 1015 && this.field28392 < 3000) {
         throw new Class2429(1002, "Trying to send an illegal close code!");
      } else if (this.field28392 == 1006
         || this.field28392 == 1015
         || this.field28392 == 1005
         || this.field28392 > 4999
         || this.field28392 < 1000
         || this.field28392 == 1004) {
         throw new Class2430("closecode must not be sent over the wire: " + this.field28392);
      }
   }

   @Override
   public void method19620(ByteBuffer var1) {
      this.field28392 = 1005;
      this.field28393 = "";
      ((Buffer)var1).mark();
      if (var1.remaining() == 0) {
         this.field28392 = 1000;
      } else if (var1.remaining() == 1) {
         this.field28392 = 1002;
      } else {
         if (var1.remaining() >= 2) {
            ByteBuffer var4 = ByteBuffer.allocate(4);
            ((Buffer)var4).position(2);
            var4.putShort(var1.getShort());
            ((Buffer)var4).position(0);
            this.field28392 = var4.getInt();
         }

         ((Buffer)var1).reset();

         try {
            int var6 = var1.position();
            this.method19631(var1, var6);
         } catch (Class2429 var5) {
            this.field28392 = 1007;
            this.field28393 = null;
         }
      }
   }

   private void method19631(ByteBuffer var1, int var2) throws Class2429 {
      try {
         ((Buffer)var1).position(var1.position() + 2);
         this.field28393 = Class8134.method28198(var1);
      } catch (IllegalArgumentException var9) {
         throw new Class2429(1007);
      } finally {
         ((Buffer)var1).position(var2);
      }
   }

   private void method19632() {
      byte[] var3 = Class8134.method28193(this.field28393);
      ByteBuffer var4 = ByteBuffer.allocate(4);
      var4.putInt(this.field28392);
      ((Buffer)var4).position(2);
      ByteBuffer var5 = ByteBuffer.allocate(2 + var3.length);
      var5.put(var4);
      var5.put(var3);
      ((Buffer)var5).rewind();
      super.method19620(var5);
   }

   @Override
   public ByteBuffer method19618() {
      return this.field28392 != 1005 ? super.method19618() : Class9209.method34509();
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 == null || this.getClass() != var1.getClass()) {
            return false;
         } else if (super.equals(var1)) {
            Class6458 var4 = (Class6458)var1;
            if (this.field28392 == var4.field28392) {
               return this.field28393 == null ? var4.field28393 == null : this.field28393.equals(var4.field28393);
            } else {
               return false;
            }
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      int var3 = super.hashCode();
      var3 = 31 * var3 + this.field28392;
      return 31 * var3 + (this.field28393 == null ? 0 : this.field28393.hashCode());
   }
}
