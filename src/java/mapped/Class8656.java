package mapped;

import java.util.Objects;

public class Class8656 {
   private int field39023;
   private Class1949 field39024;
   private Object field39025;

   public Class8656(int var1, Class1949 var2, Object var3) {
      this.field39023 = var1;
      this.field39024 = var2;
      this.field39025 = var3;
   }

   public int method31148() {
      return this.field39023;
   }

   public void method31149(int var1) {
      this.field39023 = var1;
   }

   public Class1949 method31150() {
      return this.field39024;
   }

   public void method31151(Class1949 var1) {
      this.field39024 = var1;
   }

   public Object method31152() {
      return this.field39025;
   }

   public <T> T method31153() {
      return (T)this.field39025;
   }

   public void method31154(Object var1) {
      this.field39025 = var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 != null && this.getClass() == var1.getClass()) {
            Class8656 var4 = (Class8656)var1;
            if (this.field39023 != var4.field39023) {
               return false;
            } else {
               return Objects.equals(this.field39024, var4.field39024) ? Objects.equals(this.field39025, var4.field39025) : false;
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
      int var3 = this.field39023;
      var3 = 31 * var3 + (this.field39024 == null ? 0 : this.field39024.hashCode());
      return 31 * var3 + (this.field39025 == null ? 0 : this.field39025.hashCode());
   }

   @Override
   public String toString() {
      return "Metadata{id=" + this.field39023 + ", metaType=" + this.field39024 + ", value=" + this.field39025 + '}';
   }
}
