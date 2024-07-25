package remapped;

import java.util.Objects;

public final class class_2837<T> implements Comparable<class_2837<?>> {
   private final class_5032<T> field_13899;
   private final int field_13896;
   private final T field_13897;
   private long field_13895;

   public class_2837(class_5032<T> var1, int var2, T var3) {
      this.field_13899 = var1;
      this.field_13896 = var2;
      this.field_13897 = (T)var3;
   }

   public int compareTo(class_2837<?> var1) {
      int var4 = Integer.compare(this.field_13896, var1.field_13896);
      if (var4 == 0) {
         int var5 = Integer.compare(System.identityHashCode(this.field_13899), System.identityHashCode(var1.field_13899));
         return var5 == 0 ? this.field_13899.method_23201().compare(this.field_13897, var1.field_13897) : var5;
      } else {
         return var4;
      }
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (!(var1 instanceof class_2837)) {
            return false;
         } else {
            class_2837 var4 = (class_2837)var1;
            return this.field_13896 == var4.field_13896
               && Objects.equals(this.field_13899, var4.field_13899)
               && Objects.equals(this.field_13897, var4.field_13897);
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.field_13899, this.field_13896, this.field_13897);
   }

   @Override
   public String toString() {
      return "Ticket[" + this.field_13899 + " " + this.field_13896 + " (" + this.field_13897 + ")] at " + this.field_13895;
   }

   public class_5032<T> method_12898() {
      return this.field_13899;
   }

   public int method_12895() {
      return this.field_13896;
   }

   public void method_12897(long var1) {
      this.field_13895 = var1;
   }

   public boolean method_12899(long var1) {
      long var5 = this.field_13899.method_23199();
      return var5 != 0L && var1 - this.field_13895 > var5;
   }
}
