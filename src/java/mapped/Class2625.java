package mapped;

import java.util.EnumSet;

public class Class2625 extends Class2595 {
   private static String[] field16921;
   private final Class2595 field16922;
   private final int field16923;
   private boolean field16924;

   public Class2625(int var1, Class2595 var2) {
      this.field16923 = var1;
      this.field16922 = var2;
   }

   public boolean method10829(Class2625 var1) {
      return this.method10808() && var1.method10831() < this.method10831();
   }

   @Override
   public boolean method10803() {
      return this.field16922.method10803();
   }

   @Override
   public boolean method10806() {
      return this.field16922.method10806();
   }

   @Override
   public boolean method10808() {
      return this.field16922.method10808();
   }

   @Override
   public void method10804() {
      if (!this.field16924) {
         this.field16924 = true;
         this.field16922.method10804();
      }
   }

   @Override
   public void method10807() {
      if (this.field16924) {
         this.field16924 = false;
         this.field16922.method10807();
      }
   }

   @Override
   public void method10805() {
      this.field16922.method10805();
   }

   @Override
   public void method10809(EnumSet<Class2240> var1) {
      this.field16922.method10809(var1);
   }

   @Override
   public EnumSet<Class2240> method10810() {
      return this.field16922.method10810();
   }

   public boolean method10830() {
      return this.field16924;
   }

   public int method10831() {
      return this.field16923;
   }

   public Class2595 method10832() {
      return this.field16922;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return var1 != null && this.getClass() == var1.getClass() ? this.field16922.equals(((Class2625)var1).field16922) : false;
      }
   }

   @Override
   public int hashCode() {
      return this.field16922.hashCode();
   }
}
