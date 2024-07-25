package remapped;

import java.util.Arrays;
import java.util.Comparator;

public enum class_4615 {
   field_22434(0, "options.graphics.fast"),
   field_22437(1, "options.graphics.fancy"),
   field_22433(2, "options.graphics.fabulous");

   private static final class_4615[] field_22436 = Arrays.<class_4615>stream(values())
      .sorted(Comparator.comparingInt(class_4615::method_21386))
      .<class_4615>toArray(class_4615[]::new);
   private final int field_22431;
   private final String field_22432;

   private class_4615(int var3, String var4) {
      this.field_22431 = var3;
      this.field_22432 = var4;
   }

   public int method_21386() {
      return this.field_22431;
   }

   public String method_21387() {
      return this.field_22432;
   }

   public class_4615 method_21384() {
      return method_21385(this.method_21386() + 1);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public String toString() {
      switch (this) {
         case field_22434:
            return "fast";
         case field_22437:
            return "fancy";
         case field_22433:
            return "fabulous";
         default:
            throw new IllegalArgumentException();
      }
   }

   public static class_4615 method_21385(int var0) {
      return field_22436[MathHelper.normalizeAngle(var0, field_22436.length)];
   }
}
