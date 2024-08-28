package mapped;

import java.nio.Buffer;
import java.nio.ByteBuffer;


public abstract class Class6453 implements Class6454 {
   private boolean field28365;
   private Class2325 field28366;
   private ByteBuffer field28367;
   private boolean field28368;
   private boolean field28369;
   private boolean field28370;
   private boolean field28371;

   public abstract void method19611() throws Class2429;

   public Class6453(Class2325 var1) {
      this.field28366 = var1;
      this.field28367 = Class9209.method34509();
      this.field28365 = true;
      this.field28368 = false;
      this.field28369 = false;
      this.field28370 = false;
      this.field28371 = false;
   }

   @Override
   public boolean method19612() {
      return this.field28369;
   }

   @Override
   public boolean method19613() {
      return this.field28370;
   }

   @Override
   public boolean method19614() {
      return this.field28371;
   }

   @Override
   public boolean method19615() {
      return this.field28365;
   }

   @Override
   public Class2325 method19616() {
      return this.field28366;
   }

   @Override
   public boolean method19617() {
      return this.field28368;
   }

   @Override
   public ByteBuffer method19618() {
      return this.field28367;
   }

   @Override
   public void method19619(Class6454 var1) {
      ByteBuffer var4 = var1.method19618();
      if (this.field28367 != null) {
         ((Buffer)var4).mark();
         ((Buffer)this.field28367).position(this.field28367.limit());
         ((Buffer)this.field28367).limit(this.field28367.capacity());
         if (var4.remaining() <= this.field28367.remaining()) {
            this.field28367.put(var4);
         } else {
            ByteBuffer var5 = ByteBuffer.allocate(var4.remaining() + this.field28367.capacity());
            ((Buffer)this.field28367).flip();
            var5.put(this.field28367);
            var5.put(var4);
            this.field28367 = var5;
         }

         ((Buffer)this.field28367).rewind();
         ((Buffer)var4).reset();
      } else {
         this.field28367 = ByteBuffer.allocate(var4.remaining());
         ((Buffer)var4).mark();
         this.field28367.put(var4);
         ((Buffer)var4).reset();
      }

      this.field28365 = var1.method19615();
   }

   @Override
   public String toString() {
      return "Framedata{ optcode:"
         + this.method19616()
         + ", fin:"
         + this.method19615()
         + ", rsv1:"
         + this.method19612()
         + ", rsv2:"
         + this.method19613()
         + ", rsv3:"
         + this.method19614()
         + ", payloadlength:[pos:"
         + this.field28367.position()
         + ", len:"
         + this.field28367.remaining()
         + "], payload:"
         + (this.field28367.remaining() <= 1000 ? new String(this.field28367.array()) : "(too big to display)")
         + '}';
   }

   public void method19620(ByteBuffer var1) {
      this.field28367 = var1;
   }

   public void method19621(boolean var1) {
      this.field28365 = var1;
   }

   public void method19622(boolean var1) {
      this.field28369 = var1;
   }

   public void method19623(boolean var1) {
      this.field28370 = var1;
   }

   public void method19624(boolean var1) {
      this.field28371 = var1;
   }

   public void method19625(boolean var1) {
      this.field28368 = var1;
   }

   public static Class6453 method19626(Class2325 var0) {
      if (var0 == null) {
         throw new IllegalArgumentException("Supplied opcode cannot be null");
      } else {
         switch (Class9089.field41603[var0.ordinal()]) {
            case 1:
               return new Class6456();
            case 2:
               return new Class6457();
            case 3:
               return new Class6459();
            case 4:
               return new Class6460();
            case 5:
               return new Class6458();
            case 6:
               return new Class6451();
            default:
               throw new IllegalArgumentException("Supplied opcode is invalid");
         }
      }
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 != null && this.getClass() == var1.getClass()) {
            Class6453 var4 = (Class6453)var1;
            if (this.field28365 != var4.field28365) {
               return false;
            } else if (this.field28368 != var4.field28368) {
               return false;
            } else if (this.field28369 != var4.field28369) {
               return false;
            } else if (this.field28370 != var4.field28370) {
               return false;
            } else if (this.field28371 != var4.field28371) {
               return false;
            } else if (this.field28366 == var4.field28366) {
               return this.field28367 == null ? var4.field28367 == null : this.field28367.equals(var4.field28367);
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
      int var3 = !this.field28365 ? 0 : 1;
      var3 = 31 * var3 + this.field28366.hashCode();
      var3 = 31 * var3 + (this.field28367 == null ? 0 : this.field28367.hashCode());
      var3 = 31 * var3 + (!this.field28368 ? 0 : 1);
      var3 = 31 * var3 + (!this.field28369 ? 0 : 1);
      var3 = 31 * var3 + (!this.field28370 ? 0 : 1);
      return 31 * var3 + (!this.field28371 ? 0 : 1);
   }
}
