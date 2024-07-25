package remapped;

import com.google.gson.JsonElement;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.function.Function;
import javax.annotation.Nullable;

public class class_6115 extends class_6083<Float> {
   private static String[] field_31263;
   public static final class_6115 field_31261 = new class_6115((Float)null, (Float)null);
   private final Double field_31260;
   private final Double field_31262;

   private static class_6115 method_28089(StringReader var0, Float var1, Float var2) throws CommandSyntaxException {
      if (var1 != null && var2 != null && var1 > var2) {
         throw field_31130.createWithContext(var0);
      } else {
         return new class_6115(var1, var2);
      }
   }

   @Nullable
   private static Double method_28090(Float var0) {
      return var0 != null ? var0.doubleValue() * var0.doubleValue() : null;
   }

   private class_6115(Float var1, Float var2) {
      super(var1, var2);
      this.field_31260 = method_28090(var1);
      this.field_31262 = method_28090(var2);
   }

   public static class_6115 method_28094(float var0) {
      return new class_6115(var0, (Float)null);
   }

   public boolean method_28088(float var1) {
      return this.field_31129 != null && this.field_31129 > var1 ? false : this.field_31128 == null || !(this.field_31128 < var1);
   }

   public boolean method_28087(double var1) {
      return this.field_31260 != null && this.field_31260 > var1 ? false : this.field_31262 == null || !(this.field_31262 < var1);
   }

   public static class_6115 method_28093(JsonElement var0) {
      return method_27857(var0, field_31261, class_6539::method_29773, class_6115::new);
   }

   public static class_6115 method_28091(StringReader var0) throws CommandSyntaxException {
      return method_28092(var0, var0x -> var0x);
   }

   public static class_6115 method_28092(StringReader var0, Function<Float, Float> var1) throws CommandSyntaxException {
      return method_27856(var0, class_6115::method_28089, Float::parseFloat, CommandSyntaxException.BUILT_IN_EXCEPTIONS::readerInvalidFloat, var1);
   }
}
