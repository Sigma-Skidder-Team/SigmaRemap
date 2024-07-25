package remapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public enum class_1296 {
   field_7144(new class_6098(class_4897.field_24830)),
   field_7129(new class_6098(class_4783.field_23422)),
   field_7140(new class_6098(class_4897.field_24791)),
   field_7131(new class_6098(class_4897.field_24420), new class_6098(class_4897.field_25057)),
   field_7128(new class_6098(class_4897.field_24938), new class_6098(class_4897.field_24753)),
   field_7126(new class_6098(class_4897.field_24830)),
   field_7130(new class_6098(class_4897.field_25297)),
   field_7120(new class_6098(class_4783.field_23644)),
   field_7121(new class_6098(class_4897.field_24938), new class_6098(class_4897.field_24997)),
   field_7119(new class_6098(class_4897.field_24830)),
   field_7136(new class_6098(class_4783.field_23515)),
   field_7139(new class_6098(class_4897.field_24346), new class_6098(class_4897.field_25088)),
   field_7141(new class_6098(class_4897.field_24830)),
   field_7132(new class_6098(class_4897.field_25297)),
   field_7125(new class_6098(class_4897.field_25209)),
   field_7124(new class_6098(class_4897.field_24956)),
   field_7122(new class_6098(class_4897.field_25297)),
   field_7138(new class_6098(class_4897.field_24360));

   public static final List<class_1296> field_7134 = ImmutableList.of(field_7141, field_7132);
   public static final List<class_1296> field_7137 = ImmutableList.of(field_7119, field_7136, field_7139);
   public static final List<class_1296> field_7123 = ImmutableList.of(field_7126, field_7130, field_7120, field_7121);
   public static final List<class_1296> field_7133 = ImmutableList.of(field_7144, field_7131, field_7129, field_7128, field_7140);
   public static final Map<class_1296, List<class_1296>> field_7135 = ImmutableMap.of(
      field_7144,
      ImmutableList.of(field_7131, field_7129, field_7128, field_7140),
      field_7126,
      ImmutableList.of(field_7130, field_7120, field_7121),
      field_7119,
      ImmutableList.of(field_7136, field_7139),
      field_7141,
      ImmutableList.of(field_7132)
   );
   private final List<class_6098> field_7127;

   private class_1296(class_6098... var3) {
      this.field_7127 = ImmutableList.copyOf(var3);
   }

   public static List<class_1296> method_5873(class_4269 var0) {
      switch (var0) {
         case field_20684:
            return field_7133;
         case field_20685:
            return field_7123;
         case field_20681:
            return field_7137;
         case field_20680:
            return field_7134;
         default:
            return ImmutableList.of();
      }
   }

   public List<class_6098> method_5872() {
      return this.field_7127;
   }
}
