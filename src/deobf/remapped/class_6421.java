package remapped;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public enum class_6421 implements class_9756 {
   field_32796(1, class_5935.field_30192),
   field_32800(2, class_5935.field_30169),
   field_32801(3, class_5935.field_30218),
   field_32803(10, class_5935.field_30185),
   field_32806(50, class_5935.field_30204),
   field_32794(51, class_5935.field_30250),
   field_32791(60, class_5935.field_30200),
   field_32795(61, class_5935.field_30251),
   field_32802(62, class_5935.field_30228),
   field_32797(63, class_5935.field_30249),
   field_32807(64, class_5935.field_30177),
   field_32792(65, class_5935.field_30224),
   field_32804(66, class_5935.field_30186),
   field_32790(67, class_5935.field_30209),
   field_32793(68, class_5935.field_30231),
   field_32789(70, class_5935.field_30256),
   field_32816(71, class_5935.field_30211),
   field_32811(72, class_5935.field_30178),
   field_32799(73, class_5935.field_30176),
   field_32815(75, class_5935.field_30184),
   field_32805(76, class_5935.field_30191),
   field_32810(77, class_5935.field_30214),
   field_32809(78, class_5935.field_30170),
   field_32798(79, class_5935.field_30220),
   field_32788(90, class_5935.field_30240),
   field_32808(91, class_5935.field_30260),
   field_32787(93, class_5935.field_30201);

   private static final Map<Integer, class_6421> field_32814 = new HashMap<Integer, class_6421>();
   private final int field_32786;
   private final class_5935 field_32812;

   private class_6421(int var3, class_5935 var4) {
      this.field_32786 = var3;
      this.field_32812 = var4;
   }

   public int 㨳聛ᙽ쟗㕠콵() {
      return this.field_32786;
   }

   public class_5935 method_29346() {
      return this.field_32812;
   }

   public static Optional<class_6421> method_29347(int var0) {
      return var0 != -1 ? Optional.<class_6421>ofNullable(field_32814.get(var0)) : Optional.<class_6421>empty();
   }

   public static Optional<class_5935> method_29345(int var0) {
      Optional var3 = method_29347(var0);
      return var3.isPresent() ? Optional.<class_5935>of(((class_6421)var3.get()).field_32812) : Optional.<class_5935>empty();
   }

   static {
      for (class_6421 var9 : values()) {
         field_32814.put(var9.field_32786, var9);
      }
   }
}
