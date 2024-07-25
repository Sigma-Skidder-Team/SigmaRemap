package remapped;

import java.util.EnumSet;

public class class_3556 extends class_3599 {
   private static String[] field_17431;
   private final class_3599 field_17433;
   private final int field_17434;
   private boolean field_17432;

   public class_3556(int var1, class_3599 var2) {
      this.field_17434 = var1;
      this.field_17433 = var2;
   }

   public boolean method_16535(class_3556 var1) {
      return this.method_16801() && var1.method_16538() < this.method_16538();
   }

   @Override
   public boolean method_16795() {
      return this.field_17433.method_16795();
   }

   @Override
   public boolean method_16799() {
      return this.field_17433.method_16799();
   }

   @Override
   public boolean method_16801() {
      return this.field_17433.method_16801();
   }

   @Override
   public void method_16796() {
      if (!this.field_17432) {
         this.field_17432 = true;
         this.field_17433.method_16796();
      }
   }

   @Override
   public void method_16793() {
      if (this.field_17432) {
         this.field_17432 = false;
         this.field_17433.method_16793();
      }
   }

   @Override
   public void method_16794() {
      this.field_17433.method_16794();
   }

   @Override
   public void method_16800(EnumSet<class_1891> var1) {
      this.field_17433.method_16800(var1);
   }

   @Override
   public EnumSet<class_1891> method_16797() {
      return this.field_17433.method_16797();
   }

   public boolean method_16536() {
      return this.field_17432;
   }

   public int method_16538() {
      return this.field_17434;
   }

   public class_3599 method_16537() {
      return this.field_17433;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return var1 != null && this.getClass() == var1.getClass() ? this.field_17433.equals(((class_3556)var1).field_17433) : false;
      }
   }

   @Override
   public int hashCode() {
      return this.field_17433.hashCode();
   }
}
