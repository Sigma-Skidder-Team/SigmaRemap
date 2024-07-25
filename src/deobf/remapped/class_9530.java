package remapped;

import java.util.Objects;
import org.jetbrains.annotations.Nullable;

public class class_9530 {
   private int field_48504;
   private byte field_48506;
   private short field_48508;
   private class_5531 field_48507;

   public class_9530() {
   }

   public class_9530(int var1, byte var2, short var3, class_5531 var4) {
      this.field_48504 = var1;
      this.field_48506 = var2;
      this.field_48508 = var3;
      this.field_48507 = var4;
   }

   public class_9530(class_9530 var1) {
      this(var1.method_43963(), var1.method_43967(), var1.method_43962(), var1.method_43959());
   }

   public int method_43963() {
      return this.field_48504;
   }

   public void method_43965(int var1) {
      this.field_48504 = var1;
   }

   public byte method_43967() {
      return this.field_48506;
   }

   public void method_43961(byte var1) {
      this.field_48506 = var1;
   }

   public short method_43962() {
      return this.field_48508;
   }

   public void method_43966(short var1) {
      this.field_48508 = var1;
   }

   @Nullable
   public class_5531 method_43959() {
      return this.field_48507;
   }

   public void method_43960(class_5531 var1) {
      this.field_48507 = var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 != null && this.getClass() == var1.getClass()) {
            class_9530 var4 = (class_9530)var1;
            if (this.field_48504 != var4.field_48504) {
               return false;
            } else if (this.field_48506 != var4.field_48506) {
               return false;
            } else {
               return this.field_48508 == var4.field_48508 ? Objects.equals(this.field_48507, var4.field_48507) : false;
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
      int var3 = this.field_48504;
      var3 = 31 * var3 + this.field_48506;
      var3 = 31 * var3 + this.field_48508;
      return 31 * var3 + (this.field_48507 == null ? 0 : this.field_48507.hashCode());
   }

   @Override
   public String toString() {
      return "Item{identifier=" + this.field_48504 + ", amount=" + this.field_48506 + ", data=" + this.field_48508 + ", tag=" + this.field_48507 + '}';
   }
}
