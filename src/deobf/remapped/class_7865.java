package remapped;

import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Supplier;

public class class_7865<FC extends class_6157, F extends class_5390<FC>> {
   private static String[] field_40270;
   public static final Codec<class_7865<?, ?>> field_40269 = class_8669.field_44457.dispatch(var0 -> var0.field_40267, class_5390::method_24542);
   public static final Codec<Supplier<class_7865<?, ?>>> field_40272 = class_6833.<Supplier<class_7865<?, ?>>>method_31333(class_8669.field_44385, field_40269);
   public static final Codec<List<Supplier<class_7865<?, ?>>>> field_40268 = class_6833.<class_7865<?, ?>>method_31334(class_8669.field_44385, field_40269);
   public final F field_40267;
   public final FC field_40271;

   public class_7865(F var1, FC var2) {
      this.field_40267 = (F)var1;
      this.field_40271 = (FC)var2;
   }

   public class_3200<?> method_35604(
      class_6322 var1, class_6541 var2, class_3498 var3, class_5799 var4, long var5, class_2034 var7, class_6325 var8, int var9, class_4757 var10
   ) {
      return this.field_40267.method_24554(var1, var2, var3, var4, var5, var7, var8, var9, new class_8679(), var10, this.field_40271);
   }
}
