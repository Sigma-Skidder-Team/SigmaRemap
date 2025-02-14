package mapped;

import java.io.Serializable;

public abstract class Class2406 implements Serializable, Cloneable {
   public static final long field16370 = -8226727741811898211L;
   public byte field16371;
   public byte field16372;
   public byte field16373;
   public byte field16374;

   public Class2406(byte var1, byte var2, byte var3, byte var4) {
      this.field16371 = var1;
      this.field16372 = var2;
      this.field16373 = var3;
      this.field16374 = var4;
   }

   public Class2406(byte[] var1) {
      this.field16371 = var1[0];
      this.field16372 = var1[1];
      this.field16373 = var1[2];
      this.field16374 = var1[3];
   }

   public Class2406(Class2406 var1) {
      this.field16371 = var1.field16371;
      this.field16372 = var1.field16372;
      this.field16373 = var1.field16373;
      this.field16374 = var1.field16374;
   }

   public Class2406() {
      this.field16371 = 0;
      this.field16372 = 0;
      this.field16373 = 0;
      this.field16374 = 0;
   }

   @Override
   public String toString() {
      return "(" + (this.field16371 & 0xFF) + ", " + (this.field16372 & 0xFF) + ", " + (this.field16373 & 0xFF) + ", " + (this.field16374 & 0xFF) + ")";
   }

   public final void method10109(byte[] var1) {
      var1[0] = this.field16371;
      var1[1] = this.field16372;
      var1[2] = this.field16373;
      var1[3] = this.field16374;
   }

   public final void method10110(Class2406 var1) {
      var1.field16371 = this.field16371;
      var1.field16372 = this.field16372;
      var1.field16373 = this.field16373;
      var1.field16374 = this.field16374;
   }

   public final void method10111(Class2406 var1) {
      this.field16371 = var1.field16371;
      this.field16372 = var1.field16372;
      this.field16373 = var1.field16373;
      this.field16374 = var1.field16374;
   }

   public final void method10112(byte[] var1) {
      this.field16371 = var1[0];
      this.field16372 = var1[1];
      this.field16373 = var1[2];
      this.field16374 = var1[3];
   }

   public boolean equals(Class2406 var1) {
      try {
         return this.field16371 == var1.field16371
            && this.field16372 == var1.field16372
            && this.field16373 == var1.field16373
            && this.field16374 == var1.field16374;
      } catch (NullPointerException var5) {
         return false;
      }
   }

   @Override
   public boolean equals(Object var1) {
      try {
         Class2406 var4 = (Class2406)var1;
         return this.field16371 == var4.field16371
            && this.field16372 == var4.field16372
            && this.field16373 == var4.field16373
            && this.field16374 == var4.field16374;
      } catch (NullPointerException var5) {
         return false;
      } catch (ClassCastException var6) {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return (this.field16371 & 0xFF) << 0 | (this.field16372 & 0xFF) << 8 | (this.field16373 & 0xFF) << 16 | (this.field16374 & 0xFF) << 24;
   }

   @Override
   public Object clone() {
      try {
         return super.clone();
      } catch (CloneNotSupportedException var4) {
         throw new InternalError();
      }
   }

   public final byte method10113() {
      return this.field16371;
   }

   public final void method10114(byte var1) {
      this.field16371 = var1;
   }

   public final byte method10115() {
      return this.field16372;
   }

   public final void method10116(byte var1) {
      this.field16372 = var1;
   }

   public final byte method10117() {
      return this.field16373;
   }

   public final void method10118(byte var1) {
      this.field16373 = var1;
   }

   public final byte method10119() {
      return this.field16374;
   }

   public final void method10120(byte var1) {
      this.field16374 = var1;
   }
}
