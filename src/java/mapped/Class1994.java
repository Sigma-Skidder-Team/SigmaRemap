package mapped;

public class Class1994 implements Comparable<Class1994> {
   private static String[] field13009;
   private final Class2169 field13010;
   private final long field13011;
   private final long field13012;
   private final double field13013;
   private byte[] field13014;

   public Class1994(Class2169 var1, long var2, long var4, double var6) {
      this.field13010 = var1;
      this.field13011 = var2;
      this.field13012 = var4;
      this.field13013 = var6;
   }

   public Class2169 method8277() {
      return this.field13010;
   }

   public long method8278() {
      return this.field13011;
   }

   public long method8279() {
      return this.field13012;
   }

   public double method8280() {
      return this.field13013;
   }

   public int compareTo(Class1994 var1) {
      double var4 = this.field13013 - var1.field13013;
      return !(var4 < 0.0) ? (!(var4 > 0.0) ? 0 : 1) : -1;
   }

   public void method8281(byte[] var1) {
      this.field13014 = var1;
   }

   public byte[] method8282() {
      return this.field13014;
   }
}
