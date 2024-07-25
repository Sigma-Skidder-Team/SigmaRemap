package remapped;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public enum class_96 implements class_9756 {
   field_212(1, class_5813.field_29421),
   field_222(2, class_5813.field_29414),
   field_198(3, class_5813.field_29363),
   field_214(10, class_5813.field_29416),
   field_205(50, class_5813.field_29431),
   field_224(51, class_5813.field_29430),
   field_199(60, class_5813.field_29357),
   field_209(61, class_5813.field_29438),
   field_204(62, class_5813.field_29365),
   field_195(63, class_5813.field_29370),
   field_207(64, class_5813.field_29422),
   field_219(65, class_5813.field_29420),
   field_216(66, class_5813.field_29395),
   field_206(67, class_5813.field_29364),
   field_215(70, class_5813.field_29408),
   field_211(71, class_5813.field_29384),
   field_217(72, class_5813.field_29393),
   field_220(73, class_5813.field_29375),
   field_202(75, class_5813.field_29387),
   field_197(76, class_5813.field_29369),
   field_208(77, class_5813.field_29373),
   field_203(78, class_5813.field_29362),
   field_196(90, class_5813.field_29380),
   field_201(91, class_5813.field_29432),
   field_200(93, class_5813.field_29371);

   private static final Map<Integer, class_96> field_210 = new HashMap<Integer, class_96>();
   private final int field_218;
   private final class_5813 field_223;

   private class_96(int var3, class_5813 var4) {
      this.field_218 = var3;
      this.field_223 = var4;
   }

   public int 㨳聛ᙽ쟗㕠콵() {
      return this.field_218;
   }

   public class_5813 method_282() {
      return this.field_223;
   }

   public static Optional<class_96> method_281(int var0) {
      return var0 != -1 ? Optional.<class_96>ofNullable(field_210.get(var0)) : Optional.<class_96>empty();
   }

   public static Optional<class_5813> method_283(int var0) {
      Optional var3 = method_281(var0);
      return var3.isPresent() ? Optional.<class_5813>of(((class_96)var3.get()).field_223) : Optional.<class_5813>empty();
   }

   static {
      for (class_96 var9 : values()) {
         field_210.put(var9.field_218, var9);
      }
   }
}
