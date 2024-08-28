package mapped;

import com.google.gson.JsonElement;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.function.Function;
import javax.annotation.Nullable;

public class Class8841 extends Class8839<Float> {
   private static String[] field39939;
   public static final Class8841 field39940 = new Class8841((Float)null, (Float)null);
   private final Double field39941;
   private final Double field39942;

   private static Class8841 method32020(StringReader var0, Float var1, Float var2) throws CommandSyntaxException {
      if (var1 != null && var2 != null && var1 > var2) {
         throw field39932.createWithContext(var0);
      } else {
         return new Class8841(var1, var2);
      }
   }

   @Nullable
   private static Double method32021(Float var0) {
      return var0 != null ? var0.doubleValue() * var0.doubleValue() : null;
   }

   private Class8841(Float var1, Float var2) {
      super(var1, var2);
      this.field39941 = method32021(var1);
      this.field39942 = method32021(var2);
   }

   public static Class8841 method32022(float var0) {
      return new Class8841(var0, (Float)null);
   }

   public boolean method32023(float var1) {
      return this.field39933 != null && this.field39933 > var1 ? false : this.field39934 == null || !(this.field39934 < var1);
   }

   public boolean method32024(double var1) {
      return this.field39941 != null && this.field39941 > var1 ? false : this.field39942 == null || !(this.field39942 < var1);
   }

   public static Class8841 method32025(JsonElement var0) {
      return method32006(var0, field39940, Class8963::method32770, Class8841::new);
   }

   public static Class8841 method32026(StringReader var0) throws CommandSyntaxException {
      return method32027(var0, var0x -> var0x);
   }

   public static Class8841 method32027(StringReader var0, Function<Float, Float> var1) throws CommandSyntaxException {
      return method32007(var0, Class8841::method32020, Float::parseFloat, CommandSyntaxException.BUILT_IN_EXCEPTIONS::readerInvalidFloat, var1);
   }
}
