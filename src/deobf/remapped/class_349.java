package remapped;

import com.google.common.collect.Lists;
import java.util.List;

public class class_349 implements class_5481<class_349>, class_3042<class_349> {
   private final List<class_3765> field_1375 = Lists.newArrayList();
   private final List<class_7279> field_1373 = Lists.newArrayList();
   private final List<class_2913> field_1372 = Lists.newArrayList();
   private class_3254 field_1370 = new class_7986(1.0F);
   private class_7986 field_1371 = new class_7986(0.0F, 0.0F);

   public class_349 method_1777(class_3254 var1) {
      this.field_1370 = var1;
      return this;
   }

   public class_349 method_1776() {
      return this;
   }

   public class_349 method_1773(class_3516<?> var1) {
      this.field_1375.add(var1.method_16194());
      return this;
   }

   public class_349 method_1774(class_5704 var1) {
      this.field_1373.add(var1.method_25791());
      return this;
   }

   public class_349 method_1779(class_1925 var1) {
      this.field_1372.add(var1.method_8947());
      return this;
   }

   public class_6282 method_1775() {
      if (this.field_1370 != null) {
         return new class_6282(
            this.field_1375.<class_3765>toArray(new class_3765[0]),
            this.field_1373.<class_7279>toArray(new class_7279[0]),
            this.field_1372.<class_2913>toArray(new class_2913[0]),
            this.field_1370,
            this.field_1371,
            null
         );
      } else {
         throw new IllegalArgumentException("Rolls not set");
      }
   }
}
