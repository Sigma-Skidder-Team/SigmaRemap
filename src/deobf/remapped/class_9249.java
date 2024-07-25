package remapped;

import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public enum class_9249 implements class_4530, Predicate<class_240> {
   field_47215("x"),
   field_47216("y"),
   field_47219("z");

   private static final class_9249[] field_47218 = values();
   public static final Codec<class_9249> field_47222 = class_4530.<class_9249>method_21048(class_9249::values, class_9249::method_42625);
   private static final Map<String, class_9249> field_47217 = Arrays.<class_9249>stream(field_47218)
      .collect(Collectors.toMap(class_9249::method_42633, var0 -> (class_9249)var0));
   private final String field_47220;

   private class_9249(String var3) {
      this.field_47220 = var3;
   }

   @Nullable
   public static class_9249 method_42625(String var0) {
      return field_47217.get(var0.toLowerCase(Locale.ROOT));
   }

   public String method_42633() {
      return this.field_47220;
   }

   public boolean method_42626() {
      return this == field_47216;
   }

   public boolean method_42629() {
      return this == field_47215 || this == field_47219;
   }

   @Override
   public String toString() {
      return this.field_47220;
   }

   public static class_9249 method_42627(Random var0) {
      return class_9665.<class_9249>method_44697(field_47218, var0);
   }

   public boolean test(class_240 var1) {
      return var1 != null && var1.method_1029() == this;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public class_9594 method_42628() {
      switch (this) {
         case field_47215:
         case field_47219:
            return class_9594.field_48893;
         case field_47216:
            return class_9594.field_48896;
         default:
            throw new Error("Someone's been tampering with the universe!");
      }
   }

   @Override
   public String method_21049() {
      return this.field_47220;
   }

   public abstract int method_42631(int var1, int var2, int var3);

   public abstract double method_42630(double var1, double var3, double var5);
}
