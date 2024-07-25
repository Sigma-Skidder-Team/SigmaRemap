package remapped;

import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public enum class_4565 implements class_4530 {
   field_22247("monster", 70, false, false, 128),
   field_22239("creature", 10, true, true, 128),
   field_22240("ambient", 15, true, false, 128),
   field_22250("water_creature", 5, true, false, 128),
   field_22248("water_ambient", 20, true, false, 64),
   field_22251("misc", -1, true, true, 128);

   public static final Codec<class_4565> field_22246 = class_4530.<class_4565>method_21048(class_4565::values, class_4565::method_21198);
   private static final Map<String, class_4565> field_22244 = Arrays.<class_4565>stream(values())
      .collect(Collectors.toMap(class_4565::method_21202, var0 -> (class_4565)var0));
   private final int field_22242;
   private final boolean field_22241;
   private final boolean field_22245;
   private final String field_22249;
   private final int field_22238 = 32;
   private final int field_22237;

   private class_4565(String var3, int var4, boolean var5, boolean var6, int var7) {
      this.field_22249 = var3;
      this.field_22242 = var4;
      this.field_22241 = var5;
      this.field_22245 = var6;
      this.field_22237 = var7;
   }

   public String method_21202() {
      return this.field_22249;
   }

   @Override
   public String method_21049() {
      return this.field_22249;
   }

   public static class_4565 method_21198(String var0) {
      return field_22244.get(var0);
   }

   public int method_21201() {
      return this.field_22242;
   }

   public boolean method_21203() {
      return this.field_22241;
   }

   public boolean method_21199() {
      return this.field_22245;
   }

   public int method_21200() {
      return this.field_22237;
   }

   public int method_21196() {
      return 32;
   }
}
