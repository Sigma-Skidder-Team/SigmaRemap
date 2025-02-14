package mapped;

public final class Class9221<T extends Class7465<T>> {
   private final String field42449;
   private final Class2155 field42450;

   public Class9221(String var1, Class2155 var2) {
      this.field42449 = var1;
      this.field42450 = var2;
   }

   @Override
   public String toString() {
      return this.field42449;
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 ? true : var1 instanceof Class9221 && ((Class9221)var1).field42449.equals(this.field42449);
   }

   @Override
   public int hashCode() {
      return this.field42449.hashCode();
   }

   public String method34672() {
      return this.field42449;
   }

   public String method34673() {
      return "gamerule." + this.field42449;
   }

   public Class2155 method34674() {
      return this.field42450;
   }

   // $VF: synthetic method
   public static String method34675(Class9221 var0) {
      return var0.field42449;
   }
}
