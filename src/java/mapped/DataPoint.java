package mapped;

public final class DataPoint implements Comparable<DataPoint> {
   private static String[] field13081;
   public final double relTime;
   public final double field13083;
   public final long field13084;
   public final String name;

   public DataPoint(String var1, double var2, double var4, long var6) {
      this.name = var1;
      this.relTime = var2;
      this.field13083 = var4;
      this.field13084 = var6;
   }

   public int compareTo(DataPoint var1) {
      if (!(var1.relTime < this.relTime)) {
         return !(var1.relTime > this.relTime) ? var1.name.compareTo(this.name) : 1;
      } else {
         return -1;
      }
   }

   public int getTextColor() {
      return (this.name.hashCode() & 11184810) + 4473924;
   }
}
