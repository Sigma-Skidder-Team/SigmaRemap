package remapped;

import java.io.Serializable;

public abstract class class_8605 implements Serializable, Cloneable {
   public static final long field_44067 = -483782685323607044L;
   public byte field_44069;
   public byte field_44066;
   public byte field_44068;

   public class_8605(byte var1, byte var2, byte var3) {
      this.field_44069 = var1;
      this.field_44066 = var2;
      this.field_44068 = var3;
   }

   public class_8605(byte[] var1) {
      this.field_44069 = var1[0];
      this.field_44066 = var1[1];
      this.field_44068 = var1[2];
   }

   public class_8605(class_8605 var1) {
      this.field_44069 = var1.field_44069;
      this.field_44066 = var1.field_44066;
      this.field_44068 = var1.field_44068;
   }

   public class_8605() {
      this.field_44069 = 0;
      this.field_44066 = 0;
      this.field_44068 = 0;
   }

   @Override
   public String toString() {
      return "(" + (this.field_44069 & 0xFF) + ", " + (this.field_44066 & 0xFF) + ", " + (this.field_44068 & 0xFF) + ")";
   }

   public final void method_39556(byte[] var1) {
      var1[0] = this.field_44069;
      var1[1] = this.field_44066;
      var1[2] = this.field_44068;
   }

   public final void method_39555(class_8605 var1) {
      var1.field_44069 = this.field_44069;
      var1.field_44066 = this.field_44066;
      var1.field_44068 = this.field_44068;
   }

   public final void method_39559(class_8605 var1) {
      this.field_44069 = var1.field_44069;
      this.field_44066 = var1.field_44066;
      this.field_44068 = var1.field_44068;
   }

   public final void method_39560(byte[] var1) {
      this.field_44069 = var1[0];
      this.field_44066 = var1[1];
      this.field_44068 = var1[2];
   }

   public boolean equals(class_8605 var1) {
      try {
         return this.field_44069 == var1.field_44069 && this.field_44066 == var1.field_44066 && this.field_44068 == var1.field_44068;
      } catch (NullPointerException var5) {
         return false;
      }
   }

   @Override
   public boolean equals(Object var1) {
      try {
         class_8605 var4 = (class_8605)var1;
         return this.field_44069 == var4.field_44069 && this.field_44066 == var4.field_44066 && this.field_44068 == var4.field_44068;
      } catch (NullPointerException var5) {
         return false;
      } catch (ClassCastException var6) {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return (this.field_44069 & 0xFF) << 0 | (this.field_44066 & 0xFF) << 8 | (this.field_44068 & 0xFF) << 16;
   }

   @Override
   public Object clone() {
      try {
         return super.clone();
      } catch (CloneNotSupportedException var4) {
         throw new InternalError();
      }
   }

   public final byte method_39558() {
      return this.field_44069;
   }

   public final void method_39563(byte var1) {
      this.field_44069 = var1;
   }

   public final byte method_39561() {
      return this.field_44066;
   }

   public final void method_39562(byte var1) {
      this.field_44066 = var1;
   }

   public final byte method_39553() {
      return this.field_44068;
   }

   public final void method_39557(byte var1) {
      this.field_44068 = var1;
   }
}
