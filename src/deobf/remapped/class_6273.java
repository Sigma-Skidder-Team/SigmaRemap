package remapped;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import org.java_websocket.exceptions.InvalidDataException;

public class class_6273 extends class_9113 {
   public static final int field_32041 = 1000;
   public static final int field_32045 = 1001;
   public static final int field_32051 = 1002;
   public static final int field_32038 = 1003;
   public static final int field_32053 = 1005;
   public static final int field_32040 = 1006;
   public static final int field_32039 = 1007;
   public static final int field_32044 = 1008;
   public static final int field_32055 = 1009;
   public static final int field_32054 = 1010;
   public static final int field_32048 = 1011;
   public static final int field_32043 = 1012;
   public static final int field_32050 = 1013;
   public static final int field_32049 = 1014;
   public static final int field_32042 = 1015;
   public static final int field_32046 = -1;
   public static final int field_32056 = -2;
   public static final int field_32052 = -3;
   private int field_32047;
   private String field_32037;

   public class_6273() {
      super(class_9252.field_47226);
      this.method_28601("");
      this.method_28604(1000);
   }

   public void method_28604(int var1) {
      this.field_32047 = var1;
      if (var1 == 1015) {
         this.field_32047 = 1005;
         this.field_32037 = "";
      }

      this.method_28605();
   }

   public void method_28601(String var1) {
      if (var1 == null) {
         var1 = "";
      }

      this.field_32037 = var1;
      this.method_28605();
   }

   public int method_28602() {
      return this.field_32047;
   }

   public String method_28600() {
      return this.field_32037;
   }

   @Override
   public String toString() {
      return super.toString() + "code: " + this.field_32047;
   }

   @Override
   public void method_23572() throws InvalidDataException {
      super.method_23572();
      if (this.field_32047 == 1007 && this.field_32037.isEmpty()) {
         throw new class_9615(1007, "Received text is no valid utf8 string!");
      } else if (this.field_32047 == 1005 && 0 < this.field_32037.length()) {
         throw new class_9615(1002, "A close frame must have a closecode if it has a reason");
      } else if (this.field_32047 > 1015 && this.field_32047 < 3000) {
         throw new class_9615(1002, "Trying to send an illegal close code!");
      } else if (this.field_32047 == 1006
         || this.field_32047 == 1015
         || this.field_32047 == 1005
         || this.field_32047 > 4999
         || this.field_32047 < 1000
         || this.field_32047 == 1004) {
         throw new class_7703("closecode must not be sent over the wire: " + this.field_32047);
      }
   }

   @Override
   public void method_23565(ByteBuffer var1) {
      this.field_32047 = 1005;
      this.field_32037 = "";
      ((Buffer)var1).mark();
      if (var1.remaining() == 0) {
         this.field_32047 = 1000;
      } else if (var1.remaining() == 1) {
         this.field_32047 = 1002;
      } else {
         if (var1.remaining() >= 2) {
            ByteBuffer var4 = ByteBuffer.allocate(4);
            ((Buffer)var4).position(2);
            var4.putShort(var1.getShort());
            ((Buffer)var4).position(0);
            this.field_32047 = var4.getInt();
         }

         ((Buffer)var1).reset();

         try {
            int var6 = var1.position();
            this.method_28603(var1, var6);
         } catch (class_9615 var5) {
            this.field_32047 = 1007;
            this.field_32037 = null;
         }
      }
   }

   private void method_28603(ByteBuffer var1, int var2) throws InvalidDataException {
      try {
         ((Buffer)var1).position(var1.position() + 2);
         this.field_32037 = class_3687.method_17154(var1);
      } catch (IllegalArgumentException var9) {
         throw new class_9615(1007);
      } finally {
         ((Buffer)var1).position(var2);
      }
   }

   private void method_28605() {
      byte[] var3 = class_3687.method_17149(this.field_32037);
      ByteBuffer var4 = ByteBuffer.allocate(4);
      var4.putInt(this.field_32047);
      ((Buffer)var4).position(2);
      ByteBuffer var5 = ByteBuffer.allocate(2 + var3.length);
      var5.put(var4);
      var5.put(var3);
      ((Buffer)var5).rewind();
      super.method_23565(var5);
   }

   @Override
   public ByteBuffer method_14228() {
      return this.field_32047 != 1005 ? super.method_14228() : class_7476.method_33998();
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 == null || this.getClass() != var1.getClass()) {
            return false;
         } else if (super.equals(var1)) {
            class_6273 var4 = (class_6273)var1;
            if (this.field_32047 == var4.field_32047) {
               return this.field_32037 == null ? var4.field_32037 == null : this.field_32037.equals(var4.field_32037);
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
      var3 = 31 * var3 + this.field_32047;
      return 31 * var3 + (this.field_32037 == null ? 0 : this.field_32037.hashCode());
   }
}
