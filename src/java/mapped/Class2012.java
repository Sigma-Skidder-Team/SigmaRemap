package mapped;

public final class Class2012 implements Comparable<Class2012> {
   private static String[] field13081;
   public final double field13082;
   public final double field13083;
   public final long field13084;
   public final String field13085;

   public Class2012(String var1, double var2, double var4, long var6) {
      this.field13085 = var1;
      this.field13082 = var2;
      this.field13083 = var4;
      this.field13084 = var6;
   }

   public int compareTo(Class2012 var1) {
      if (!(var1.field13082 < this.field13082)) {
         return !(var1.field13082 > this.field13082) ? var1.field13085.compareTo(this.field13085) : 1;
      } else {
         return -1;
      }
   }

   public int method8536() {
      return (this.field13085.hashCode() & 11184810) + 4473924;
   }
}
