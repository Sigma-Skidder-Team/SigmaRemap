package remapped;

import com.google.common.collect.AbstractIterator;

public final class class_7662 extends AbstractIterator<class_1331> {
   private static String[] field_38941;
   private final class_2921 field_38934;
   private int field_38942;

   public class_7662(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.field_38937 = var1;
      this.field_38935 = var2;
      this.field_38938 = var3;
      this.field_38936 = var4;
      this.field_38939 = var5;
      this.field_38940 = var6;
      this.field_38934 = new class_2921();
   }

   public class_1331 computeNext() {
      if (this.field_38942 != this.field_38937) {
         int var3 = this.field_38942 % this.field_38935;
         int var4 = this.field_38942 / this.field_38935;
         int var5 = var4 % this.field_38938;
         int var6 = var4 / this.field_38938;
         this.field_38942++;
         return this.field_38934.method_13362(this.field_38936 + var3, this.field_38939 + var5, this.field_38940 + var6);
      } else {
         return (class_1331)this.endOfData();
      }
   }
}
