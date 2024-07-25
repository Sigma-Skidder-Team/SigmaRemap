package remapped;

import java.io.Serializable;

public abstract class class_361 implements Serializable, Cloneable {
   public static final long field_1399 = -8226727741811898211L;
   public byte field_1396;
   public byte field_1400;
   public byte field_1398;
   public byte field_1397;

   public class_361(byte var1, byte var2, byte var3, byte var4) {
      this.field_1396 = var1;
      this.field_1400 = var2;
      this.field_1398 = var3;
      this.field_1397 = var4;
   }

   public class_361(byte[] var1) {
      this.field_1396 = var1[0];
      this.field_1400 = var1[1];
      this.field_1398 = var1[2];
      this.field_1397 = var1[3];
   }

   public class_361(class_361 var1) {
      this.field_1396 = var1.field_1396;
      this.field_1400 = var1.field_1400;
      this.field_1398 = var1.field_1398;
      this.field_1397 = var1.field_1397;
   }

   public class_361() {
      this.field_1396 = 0;
      this.field_1400 = 0;
      this.field_1398 = 0;
      this.field_1397 = 0;
   }

   @Override
   public String toString() {
      return "(" + (this.field_1396 & 0xFF) + ", " + (this.field_1400 & 0xFF) + ", " + (this.field_1398 & 0xFF) + ", " + (this.field_1397 & 0xFF) + ")";
   }

   public final void method_1808(byte[] var1) {
      var1[0] = this.field_1396;
      var1[1] = this.field_1400;
      var1[2] = this.field_1398;
      var1[3] = this.field_1397;
   }

   public final void method_1807(class_361 var1) {
      var1.field_1396 = this.field_1396;
      var1.field_1400 = this.field_1400;
      var1.field_1398 = this.field_1398;
      var1.field_1397 = this.field_1397;
   }

   public final void method_1798(class_361 var1) {
      this.field_1396 = var1.field_1396;
      this.field_1400 = var1.field_1400;
      this.field_1398 = var1.field_1398;
      this.field_1397 = var1.field_1397;
   }

   public final void method_1799(byte[] var1) {
      this.field_1396 = var1[0];
      this.field_1400 = var1[1];
      this.field_1398 = var1[2];
      this.field_1397 = var1[3];
   }

   public boolean equals(class_361 var1) {
      try {
         return this.field_1396 == var1.field_1396
            && this.field_1400 == var1.field_1400
            && this.field_1398 == var1.field_1398
            && this.field_1397 == var1.field_1397;
      } catch (NullPointerException var5) {
         return false;
      }
   }

   @Override
   public boolean equals(Object var1) {
      try {
         class_361 var4 = (class_361)var1;
         return this.field_1396 == var4.field_1396
            && this.field_1400 == var4.field_1400
            && this.field_1398 == var4.field_1398
            && this.field_1397 == var4.field_1397;
      } catch (NullPointerException var5) {
         return false;
      } catch (ClassCastException var6) {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return (this.field_1396 & 0xFF) << 0 | (this.field_1400 & 0xFF) << 8 | (this.field_1398 & 0xFF) << 16 | (this.field_1397 & 0xFF) << 24;
   }

   @Override
   public Object clone() {
      try {
         return super.clone();
      } catch (CloneNotSupportedException var4) {
         throw new InternalError();
      }
   }

   public final byte method_1797() {
      return this.field_1396;
   }

   public final void method_1803(byte var1) {
      this.field_1396 = var1;
   }

   public final byte method_1804() {
      return this.field_1400;
   }

   public final void method_1801(byte var1) {
      this.field_1400 = var1;
   }

   public final byte method_1802() {
      return this.field_1398;
   }

   public final void method_1805(byte var1) {
      this.field_1398 = var1;
   }

   public final byte method_1806() {
      return this.field_1397;
   }

   public final void method_1800(byte var1) {
      this.field_1397 = var1;
   }
}
