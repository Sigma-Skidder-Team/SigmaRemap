package remapped;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public enum class_54 implements class_9756 {
   field_11(1, class_4630.field_22534),
   field_28(2, class_4630.field_22561),
   field_29(3, class_4630.field_22627),
   field_30(10, class_4630.field_22514),
   field_15(50, class_4630.field_22616),
   field_6(51, class_4630.field_22513),
   field_14(60, class_4630.field_22615),
   field_9(61, class_4630.field_22529),
   field_23(62, class_4630.field_22635),
   field_19(63, class_4630.field_22571),
   field_24(64, class_4630.field_22518),
   field_22(65, class_4630.field_22567),
   field_32(66, class_4630.field_22582),
   field_12(67, class_4630.field_22579),
   field_33(68, class_4630.field_22539),
   field_8(70, class_4630.field_22605),
   field_13(71, class_4630.field_22552),
   field_20(72, class_4630.field_22574),
   field_17(73, class_4630.field_22606),
   field_4(75, class_4630.field_22592),
   field_5(76, class_4630.field_22570),
   field_21(77, class_4630.field_22588),
   field_16(78, class_4630.field_22559),
   field_27(79, class_4630.field_22550),
   field_18(90, class_4630.field_22618),
   field_25(91, class_4630.field_22547),
   field_10(93, class_4630.field_22521),
   field_7(94, class_4630.field_22586);

   private static final Map<Integer, class_54> field_31 = new HashMap<Integer, class_54>();
   private final int field_34;
   private final class_4630 field_26;

   private class_54(int var3, class_4630 var4) {
      this.field_34 = var3;
      this.field_26 = var4;
   }

   public int 㨳聛ᙽ쟗㕠콵() {
      return this.field_34;
   }

   public class_4630 method_10() {
      return this.field_26;
   }

   public static Optional<class_54> method_8(int var0) {
      return var0 != -1 ? Optional.<class_54>ofNullable(field_31.get(var0)) : Optional.<class_54>empty();
   }

   public static Optional<class_4630> method_7(int var0) {
      Optional var3 = method_8(var0);
      return var3.isPresent() ? Optional.<class_4630>of(((class_54)var3.get()).field_26) : Optional.<class_4630>empty();
   }

   public static Optional<class_54> method_9(class_4630 var0) {
      for (class_54 var6 : values()) {
         if (var6.field_26 == var0) {
            return Optional.<class_54>of(var6);
         }
      }

      return Optional.<class_54>empty();
   }

   static {
      for (class_54 var9 : values()) {
         field_31.put(var9.field_34, var9);
      }
   }
}
