package mapped;

import java.io.Serializable;

public class Class2425 implements Serializable {
   private static String[] field16435;
   private int field16436;
   private int field16437;
   public final Class2423 field16438;

   public Class2425(Class2423 var1, int var2, int var3) {
      this.field16438 = var1;
      this.field16436 = var2;
      this.field16437 = var3;
   }

   public int method10387() {
      return this.field16436;
   }

   public int method10388() {
      return this.field16437;
   }

   @Override
   public int hashCode() {
      return this.field16436 * this.field16437;
   }

   @Override
   public boolean equals(Object var1) {
      if (!(var1 instanceof Class2425)) {
         return false;
      } else {
         Class2425 var4 = (Class2425)var1;
         return var4.field16436 == this.field16436 && var4.field16437 == this.field16437;
      }
   }

   // $VF: synthetic method
   public static int method10389(Class2425 var0) {
      return var0.field16436;
   }

   // $VF: synthetic method
   public static int method10390(Class2425 var0) {
      return var0.field16437;
   }
}
