package remapped;

import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;

public final class class_8853 {
   public static final class_8853 field_45269 = method_40720("desert");
   public static final class_8853 field_45262 = method_40720("jungle");
   public static final class_8853 field_45268 = method_40720("plains");
   public static final class_8853 field_45265 = method_40720("savanna");
   public static final class_8853 field_45270 = method_40720("snow");
   public static final class_8853 field_45264 = method_40720("swamp");
   public static final class_8853 field_45267 = method_40720("taiga");
   private final String field_45266;
   private static final Map<class_5621<class_6325>, class_8853> field_45261 = Util.<Map<class_5621<class_6325>, class_8853>>method_44659(
      Maps.newHashMap(), var0 -> {
         var0.put(class_8606.field_44110, field_45269);
         var0.put(class_8606.field_44124, field_45269);
         var0.put(class_8606.field_44094, field_45269);
         var0.put(class_8606.field_44101, field_45269);
         var0.put(class_8606.field_44098, field_45269);
         var0.put(class_8606.field_44128, field_45269);
         var0.put(class_8606.field_44121, field_45269);
         var0.put(class_8606.field_44099, field_45269);
         var0.put(class_8606.field_44127, field_45269);
         var0.put(class_8606.field_44132, field_45262);
         var0.put(class_8606.field_44148, field_45262);
         var0.put(class_8606.field_44078, field_45262);
         var0.put(class_8606.field_44080, field_45262);
         var0.put(class_8606.field_44114, field_45262);
         var0.put(class_8606.field_44106, field_45262);
         var0.put(class_8606.field_44140, field_45262);
         var0.put(class_8606.field_44095, field_45265);
         var0.put(class_8606.field_44081, field_45265);
         var0.put(class_8606.field_44077, field_45265);
         var0.put(class_8606.field_44141, field_45265);
         var0.put(class_8606.field_44115, field_45270);
         var0.put(class_8606.field_44137, field_45270);
         var0.put(class_8606.field_44082, field_45270);
         var0.put(class_8606.field_44143, field_45270);
         var0.put(class_8606.field_44097, field_45270);
         var0.put(class_8606.field_44070, field_45270);
         var0.put(class_8606.field_44119, field_45270);
         var0.put(class_8606.field_44083, field_45270);
         var0.put(class_8606.field_44125, field_45270);
         var0.put(class_8606.field_44142, field_45270);
         var0.put(class_8606.field_44089, field_45264);
         var0.put(class_8606.field_44147, field_45264);
         var0.put(class_8606.field_44117, field_45267);
         var0.put(class_8606.field_44134, field_45267);
         var0.put(class_8606.field_44093, field_45267);
         var0.put(class_8606.field_44145, field_45267);
         var0.put(class_8606.field_44120, field_45267);
         var0.put(class_8606.field_44075, field_45267);
         var0.put(class_8606.field_44123, field_45267);
         var0.put(class_8606.field_44074, field_45267);
         var0.put(class_8606.field_44138, field_45267);
         var0.put(class_8606.field_44133, field_45267);
         var0.put(class_8606.field_44102, field_45267);
         var0.put(class_8606.field_44100, field_45267);
      }
   );

   private class_8853(String var1) {
      this.field_45266 = var1;
   }

   @Override
   public String toString() {
      return this.field_45266;
   }

   private static class_8853 method_40720(String var0) {
      return class_8669.<class_8853, class_8853>method_39792(class_8669.field_44375, new Identifier(var0), new class_8853(var0));
   }

   public static class_8853 method_40719(Optional<class_5621<class_6325>> var0) {
      return var0.<class_8853>flatMap(var0x -> Optional.ofNullable(field_45261.get(var0x))).orElse(field_45268);
   }
}
