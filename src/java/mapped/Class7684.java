package mapped;

import java.util.function.IntSupplier;
import java.util.function.LongSupplier;

public class Class7684 {
   private static String[] field32911;
   private final LongSupplier field32912;
   private final IntSupplier field32913;
   private Class7166 field32914 = Class7167.field30819;

   public Class7684(LongSupplier var1, IntSupplier var2) {
      this.field32912 = var1;
      this.field32913 = var2;
   }

   public boolean method25291() {
      return this.field32914 != Class7167.field30819;
   }

   public void method25292() {
      this.field32914 = Class7167.field30819;
   }

   public void method25293() {
      this.field32914 = new Class7168(this.field32912, this.field32913, true);
   }

   public Class7165 method25294() {
      return this.field32914;
   }

   public Class7740 method25295() {
      return this.field32914.method22511();
   }
}
