package mapped;

import java.util.Objects;

public final class Class2005<T> implements Comparable<Class2005<?>> {
   private final Class8561<T> field13057;
   private final int field13058;
   private final T field13059;
   private long field13060;

   public Class2005(Class8561<T> var1, int var2, T var3) {
      this.field13057 = var1;
      this.field13058 = var2;
      this.field13059 = (T)var3;
   }

   public int compareTo(Class2005<?> var1) {
      int var4 = Integer.compare(this.field13058, var1.field13058);
      if (var4 == 0) {
         int var5 = Integer.compare(System.identityHashCode(this.field13057), System.identityHashCode(var1.field13057));
         return var5 == 0 ? this.field13057.method30546().compare(this.field13059, (T) var1.field13059) : var5;
      } else {
         return var4;
      }
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (!(var1 instanceof Class2005)) {
            return false;
         } else {
            Class2005 var4 = (Class2005)var1;
            return this.field13058 == var4.field13058 && Objects.equals(this.field13057, var4.field13057) && Objects.equals(this.field13059, var4.field13059);
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.field13057, this.field13058, this.field13059);
   }

   @Override
   public String toString() {
      return "Ticket[" + this.field13057 + " " + this.field13058 + " (" + this.field13059 + ")] at " + this.field13060;
   }

   public Class8561<T> method8484() {
      return this.field13057;
   }

   public int method8485() {
      return this.field13058;
   }

   public void method8486(long var1) {
      this.field13060 = var1;
   }

   public boolean method8487(long var1) {
      long var5 = this.field13057.method30547();
      return var5 != 0L && var1 - this.field13060 > var5;
   }
}
