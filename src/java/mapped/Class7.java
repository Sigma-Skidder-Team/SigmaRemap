package mapped;

import java.io.Serializable;

public abstract class Class7 implements Serializable, Cloneable {
   public static final long field12 = -483782685323607044L;
   public byte field13;
   public byte field14;
   public byte field15;

   public Class7(byte var1, byte var2, byte var3) {
      this.field13 = var1;
      this.field14 = var2;
      this.field15 = var3;
   }

   public Class7(byte[] var1) {
      this.field13 = var1[0];
      this.field14 = var1[1];
      this.field15 = var1[2];
   }

   public Class7(Class7 var1) {
      this.field13 = var1.field13;
      this.field14 = var1.field14;
      this.field15 = var1.field15;
   }

   public Class7() {
      this.field13 = 0;
      this.field14 = 0;
      this.field15 = 0;
   }

   @Override
   public String toString() {
      return "(" + (this.field13 & 0xFF) + ", " + (this.field14 & 0xFF) + ", " + (this.field15 & 0xFF) + ")";
   }

   public final void method44(byte[] var1) {
      var1[0] = this.field13;
      var1[1] = this.field14;
      var1[2] = this.field15;
   }

   public final void method45(Class7 var1) {
      var1.field13 = this.field13;
      var1.field14 = this.field14;
      var1.field15 = this.field15;
   }

   public final void method46(Class7 var1) {
      this.field13 = var1.field13;
      this.field14 = var1.field14;
      this.field15 = var1.field15;
   }

   public final void method47(byte[] var1) {
      this.field13 = var1[0];
      this.field14 = var1[1];
      this.field15 = var1[2];
   }

   public boolean equals(Class7 var1) {
      try {
         return this.field13 == var1.field13 && this.field14 == var1.field14 && this.field15 == var1.field15;
      } catch (NullPointerException var5) {
         return false;
      }
   }

   @Override
   public boolean equals(Object var1) {
      try {
         Class7 var4 = (Class7)var1;
         return this.field13 == var4.field13 && this.field14 == var4.field14 && this.field15 == var4.field15;
      } catch (NullPointerException var5) {
         return false;
      } catch (ClassCastException var6) {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return (this.field13 & 0xFF) << 0 | (this.field14 & 0xFF) << 8 | (this.field15 & 0xFF) << 16;
   }

   @Override
   public Object clone() {
      try {
         return super.clone();
      } catch (CloneNotSupportedException var4) {
         throw new InternalError();
      }
   }

   public final byte method48() {
      return this.field13;
   }

   public final void method49(byte var1) {
      this.field13 = var1;
   }

   public final byte method50() {
      return this.field14;
   }

   public final void method51(byte var1) {
      this.field14 = var1;
   }

   public final byte method52() {
      return this.field15;
   }

   public final void method53(byte var1) {
      this.field15 = var1;
   }
}
