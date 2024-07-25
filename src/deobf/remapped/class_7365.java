package remapped;

import com.google.common.collect.Lists;
import java.util.List;

public class class_7365 {
   private static String[] field_37629;
   private int field_37633;
   private final List<Identifier> field_37631 = Lists.newArrayList();
   private final List<Identifier> field_37632 = Lists.newArrayList();
   private Identifier field_37630;

   public static class_7365 method_33541(int var0) {
      return new class_7365().method_33539(var0);
   }

   public class_7365 method_33539(int var1) {
      this.field_37633 += var1;
      return this;
   }

   public static class_7365 method_33536(Identifier var0) {
      return new class_7365().method_33538(var0);
   }

   public class_7365 method_33538(Identifier var1) {
      this.field_37632.add(var1);
      return this;
   }

   public class_5123 method_33540() {
      return new class_5123(
         this.field_37633,
         this.field_37631.<Identifier>toArray(new Identifier[0]),
         this.field_37632.<Identifier>toArray(new Identifier[0]),
         this.field_37630 != null ? new class_7181(this.field_37630) : class_7181.field_36927
      );
   }
}
