package remapped;

import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public enum class_8862 implements class_4530 {
   field_45312("none"),
   field_45310("taiga"),
   field_45298("extreme_hills"),
   field_45300("jungle"),
   field_45303("mesa"),
   field_45293("plains"),
   field_45313("savanna"),
   field_45304("icy"),
   field_45302("the_end"),
   field_45308("beach"),
   field_45307("forest"),
   field_45309("ocean"),
   field_45294("desert"),
   field_45297("river"),
   field_45306("swamp"),
   field_45296("mushroom"),
   field_45305("nether");

   public static final Codec<class_8862> field_45301 = class_4530.<class_8862>method_21048(class_8862::values, class_8862::method_40752);
   private static final Map<String, class_8862> field_45311 = Arrays.<class_8862>stream(values())
      .collect(Collectors.toMap(class_8862::method_40750, var0 -> (class_8862)var0));
   private final String field_45295;

   private class_8862(String var3) {
      this.field_45295 = var3;
   }

   public String method_40750() {
      return this.field_45295;
   }

   public static class_8862 method_40752(String var0) {
      return field_45311.get(var0);
   }

   @Override
   public String method_21049() {
      return this.field_45295;
   }
}
