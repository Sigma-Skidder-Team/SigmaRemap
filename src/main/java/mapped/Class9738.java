package mapped;

import java.util.Objects;
import org.jetbrains.annotations.Nullable;

public class Class9738 {
   private int field45472;
   private byte field45473;
   private short field45474;
   private Class72 field45475;

   public Class9738() {
   }

   public Class9738(int var1, byte var2, short var3, Class72 var4) {
      this.field45472 = var1;
      this.field45473 = var2;
      this.field45474 = var3;
      this.field45475 = var4;
   }

   public Class9738(Class9738 var1) {
      this(var1.method38161(), var1.method38163(), var1.method38165(), var1.method38167());
   }

   public int method38161() {
      return this.field45472;
   }

   public void method38162(int var1) {
      this.field45472 = var1;
   }

   public byte method38163() {
      return this.field45473;
   }

   public void method38164(byte var1) {
      this.field45473 = var1;
   }

   public short method38165() {
      return this.field45474;
   }

   public void method38166(short var1) {
      this.field45474 = var1;
   }

   @Nullable
   public Class72 method38167() {
      return this.field45475;
   }

   public void method38168(Class72 var1) {
      this.field45475 = var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 != null && this.getClass() == var1.getClass()) {
            Class9738 var4 = (Class9738)var1;
            if (this.field45472 != var4.field45472) {
               return false;
            } else if (this.field45473 != var4.field45473) {
               return false;
            } else {
               return this.field45474 == var4.field45474 ? Objects.equals(this.field45475, var4.field45475) : false;
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
      int var3 = this.field45472;
      var3 = 31 * var3 + this.field45473;
      var3 = 31 * var3 + this.field45474;
      return 31 * var3 + (this.field45475 == null ? 0 : this.field45475.hashCode());
   }

   @Override
   public String toString() {
      return "Item{identifier=" + this.field45472 + ", amount=" + this.field45473 + ", data=" + this.field45474 + ", tag=" + this.field45475 + '}';
   }
}
