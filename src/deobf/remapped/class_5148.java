package remapped;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import org.java_websocket.exceptions.InvalidDataException;

public abstract class class_5148 implements class_3106 {
   private boolean field_26504;
   private class_9252 field_26503;
   private ByteBuffer field_26505;
   private boolean field_26502;
   private boolean field_26501;
   private boolean field_26506;
   private boolean field_26500;

   public abstract void method_23572() throws InvalidDataException;

   public class_5148(class_9252 var1) {
      this.field_26503 = var1;
      this.field_26505 = class_7476.method_33998();
      this.field_26504 = true;
      this.field_26502 = false;
      this.field_26501 = false;
      this.field_26506 = false;
      this.field_26500 = false;
   }

   @Override
   public boolean method_14224() {
      return this.field_26501;
   }

   @Override
   public boolean method_14223() {
      return this.field_26506;
   }

   @Override
   public boolean method_14230() {
      return this.field_26500;
   }

   @Override
   public boolean method_14229() {
      return this.field_26504;
   }

   @Override
   public class_9252 method_14225() {
      return this.field_26503;
   }

   @Override
   public boolean method_14226() {
      return this.field_26502;
   }

   @Override
   public ByteBuffer method_14228() {
      return this.field_26505;
   }

   @Override
   public void method_14227(class_3106 var1) {
      ByteBuffer var4 = var1.method_14228();
      if (this.field_26505 != null) {
         ((Buffer)var4).mark();
         ((Buffer)this.field_26505).position(this.field_26505.limit());
         ((Buffer)this.field_26505).limit(this.field_26505.capacity());
         if (var4.remaining() <= this.field_26505.remaining()) {
            this.field_26505.put(var4);
         } else {
            ByteBuffer var5 = ByteBuffer.allocate(var4.remaining() + this.field_26505.capacity());
            ((Buffer)this.field_26505).flip();
            var5.put(this.field_26505);
            var5.put(var4);
            this.field_26505 = var5;
         }

         ((Buffer)this.field_26505).rewind();
         ((Buffer)var4).reset();
      } else {
         this.field_26505 = ByteBuffer.allocate(var4.remaining());
         ((Buffer)var4).mark();
         this.field_26505.put(var4);
         ((Buffer)var4).reset();
      }

      this.field_26504 = var1.method_14229();
   }

   @Override
   public String toString() {
      return "Framedata{ optcode:"
         + this.method_14225()
         + ", fin:"
         + this.method_14229()
         + ", rsv1:"
         + this.method_14224()
         + ", rsv2:"
         + this.method_14223()
         + ", rsv3:"
         + this.method_14230()
         + ", payloadlength:[pos:"
         + this.field_26505.position()
         + ", len:"
         + this.field_26505.remaining()
         + "], payload:"
         + (this.field_26505.remaining() <= 1000 ? new String(this.field_26505.array()) : "(too big to display)")
         + '}';
   }

   public void method_23565(ByteBuffer var1) {
      this.field_26505 = var1;
   }

   public void method_23569(boolean var1) {
      this.field_26504 = var1;
   }

   public void method_23566(boolean var1) {
      this.field_26501 = var1;
   }

   public void method_23573(boolean var1) {
      this.field_26506 = var1;
   }

   public void method_23571(boolean var1) {
      this.field_26500 = var1;
   }

   public void method_23570(boolean var1) {
      this.field_26502 = var1;
   }

   public static class_5148 method_23568(class_9252 var0) {
      if (var0 == null) {
         throw new IllegalArgumentException("Supplied opcode cannot be null");
      } else {
         switch (var0) {
            case field_47231:
               return new class_5047();
            case field_47230:
               return new class_6361();
            case field_47232:
               return new class_7109();
            case field_47225:
               return new class_4450();
            case field_47226:
               return new class_6273();
            case field_47229:
               return new class_659();
            default:
               throw new IllegalArgumentException("Supplied opcode is invalid");
         }
      }
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 != null && this.getClass() == var1.getClass()) {
            class_5148 var4 = (class_5148)var1;
            if (this.field_26504 != var4.field_26504) {
               return false;
            } else if (this.field_26502 != var4.field_26502) {
               return false;
            } else if (this.field_26501 != var4.field_26501) {
               return false;
            } else if (this.field_26506 != var4.field_26506) {
               return false;
            } else if (this.field_26500 != var4.field_26500) {
               return false;
            } else if (this.field_26503 == var4.field_26503) {
               return this.field_26505 == null ? var4.field_26505 == null : this.field_26505.equals(var4.field_26505);
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
      int var3 = !this.field_26504 ? 0 : 1;
      var3 = 31 * var3 + this.field_26503.hashCode();
      var3 = 31 * var3 + (this.field_26505 == null ? 0 : this.field_26505.hashCode());
      var3 = 31 * var3 + (!this.field_26502 ? 0 : 1);
      var3 = 31 * var3 + (!this.field_26501 ? 0 : 1);
      var3 = 31 * var3 + (!this.field_26506 ? 0 : 1);
      return 31 * var3 + (!this.field_26500 ? 0 : 1);
   }
}
