package remapped;

public class class_7553 implements Comparable<class_7553> {
   private static String[] field_38514;
   private final class_4923 field_38512;
   private final long field_38510;
   private final long field_38511;
   private final double field_38513;
   private byte[] field_38515;

   public class_7553(class_4923 var1, long var2, long var4, double var6) {
      this.field_38512 = var1;
      this.field_38510 = var2;
      this.field_38511 = var4;
      this.field_38513 = var6;
   }

   public class_4923 method_34367() {
      return this.field_38512;
   }

   public long method_34373() {
      return this.field_38510;
   }

   public long method_34370() {
      return this.field_38511;
   }

   public double method_34371() {
      return this.field_38513;
   }

   public int compareTo(class_7553 var1) {
      double var4 = this.field_38513 - var1.field_38513;
      return !(var4 < 0.0) ? (!(var4 > 0.0) ? 0 : 1) : -1;
   }

   public void method_34369(byte[] var1) {
      this.field_38515 = var1;
   }

   public byte[] method_34368() {
      return this.field_38515;
   }
}
