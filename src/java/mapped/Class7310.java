package mapped;

import org.jetbrains.annotations.Nullable;

public class Class7310 {
   private final Class6355 field31335;
   private final Class7981 field31336;
   private final int field31337 = 8;

   public Class7310(Class6355 var1, Class7981 var2) {
      this.field31335 = var1;
      this.field31336 = var2;
   }

   public void method23096(Class1913 var1) {
      this.field31335.method19360(var1, new Class3824(this));
   }

   @Nullable
   public Class7981 method23097(Class2165 var1) {
      switch (Class6588.field29002[var1.ordinal()]) {
         case 1:
            return this.field31335.method19376().method18535() != null ? var1x -> this.field31335.method19376().method18529(var1x) : null;
         case 2:
            return this.field31335.method19376().method18533() != null ? var1x -> this.field31335.method19376().method18530(var1x) : null;
         case 3:
            return this.field31336;
         default:
            throw new IllegalArgumentException("Unknown registry type in statistics packet: " + var1);
      }
   }

   @Nullable
   public Class2165 method23098(int var1) {
      switch (var1) {
         case 0:
            return Class2165.field14215;
         case 1:
         case 2:
         case 3:
         case 4:
         case 5:
            return Class2165.field14216;
         case 6:
         case 7:
            return Class2165.field14218;
         default:
            return null;
      }
   }

   // $VF: synthetic method
   public static Class6355 method23101(Class7310 var0) {
      return var0.field31335;
   }
}
