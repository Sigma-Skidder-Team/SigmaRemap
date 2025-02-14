package mapped;

import java.util.Locale;

public enum Class1964 {
   field12798(0, 0),
   field12799(0, 1),
   field12800(0, 2),
   field12801(0, 3),
   field12802(0, 4),
   field12803(0, 5),
   field12804(1, 0),
   field12805(1, 1),
   field12806(1, 2),
   field12807(1, 3),
   field12808(1, 4),
   field12809(1, 5);

   private final int field12810;
   private final int field12811;
   private static final Class1964[] field12812 = values();
   private static final Class1964[] field12813 = new Class1964[]{
      field12798, field12799, field12800, field12801, field12802, field12803, field12804, field12805, field12806, field12807, field12808, field12809
   };

   private Class1964(int var3, int var4) {
      this.field12810 = var3;
      this.field12811 = var4;
   }

   public int method8237() {
      return this.field12810;
   }

   public int method8238() {
      return this.field12811;
   }

   public static String method8239(int var0, int var1) {
      return field12812[var1 + 6 * var0].method8240();
   }

   public String method8240() {
      return this.name().toLowerCase(Locale.ROOT);
   }
}
