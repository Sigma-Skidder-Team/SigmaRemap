package remapped;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public enum class_6070 implements class_9756 {
   field_31070(1, class_6548.field_33329),
   field_31055(2, class_6548.field_33337),
   field_31077(3, class_6548.field_33287),
   field_31072(10, class_6548.field_33338),
   field_31060(50, class_6548.field_33290),
   field_31074(51, class_6548.field_33347),
   field_31057(60, class_6548.field_33359),
   field_31064(61, class_6548.field_33286),
   field_31050(62, class_6548.field_33324),
   field_31079(63, class_6548.field_33343),
   field_31073(64, class_6548.field_33380),
   field_31052(65, class_6548.field_33284),
   field_31062(66, class_6548.field_33282),
   field_31054(67, class_6548.field_33371),
   field_31058(68, class_6548.field_33342),
   field_31067(70, class_6548.field_33353),
   field_31053(71, class_6548.field_33317),
   field_31056(72, class_6548.field_33384),
   field_31068(73, class_6548.field_33303),
   field_31051(75, class_6548.field_33300),
   field_31066(76, class_6548.field_33292),
   field_31048(77, class_6548.field_33320),
   field_31063(78, class_6548.field_33367),
   field_31069(79, class_6548.field_33327),
   field_31065(90, class_6548.field_33325),
   field_31049(91, class_6548.field_33358),
   field_31061(93, class_6548.field_33313);

   private static final Map<Integer, class_6070> field_31059 = new HashMap<Integer, class_6070>();
   private final int field_31076;
   private final class_6548 field_31071;

   private class_6070(int var3, class_6548 var4) {
      this.field_31076 = var3;
      this.field_31071 = var4;
   }

   public int 㨳聛ᙽ쟗㕠콵() {
      return this.field_31076;
   }

   public class_6548 method_27804() {
      return this.field_31071;
   }

   public static Optional<class_6070> method_27805(int var0) {
      return var0 != -1 ? Optional.<class_6070>ofNullable(field_31059.get(var0)) : Optional.<class_6070>empty();
   }

   public static Optional<class_6548> method_27803(int var0) {
      Optional var3 = method_27805(var0);
      return var3.isPresent() ? Optional.<class_6548>of(((class_6070)var3.get()).field_31071) : Optional.<class_6548>empty();
   }

   static {
      for (class_6070 var9 : values()) {
         field_31059.put(var9.field_31076, var9);
      }
   }
}
