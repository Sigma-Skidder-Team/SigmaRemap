package mapped;

import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Supplier;

public class Class9300<FC extends Class4698, F extends Class2961<FC>> {
   public static final Codec<Class9300<?, ?>> field43171 = Class2348.field16114.dispatch(var0 -> var0.field43174, Class2961::method11367);
   public static final Codec<Supplier<Class9300<?, ?>>> field43172 = Class9054.method33671(Class2348.field16103, field43171);
   public static final Codec<List<Supplier<Class9300<?, ?>>>> field43173 = Class9054.<Class9300<?, ?>>method33672(Class2348.field16103, field43171);
   public final F field43174;
   public final FC field43175;

   public Class9300(F var1, FC var2) {
      this.field43174 = (F)var1;
      this.field43175 = (FC)var2;
   }

   public Class5444<?> method35098(
      Class8904 var1, Class5646 var2, Class1685 var3, Class8761 var4, long var5, Class7481 var7, Class8907 var8, int var9, Class8483 var10
   ) {
      return this.field43174.method11372(var1, var2, var3, var4, var5, var7, var8, var9, new Class2420(), var10, this.field43175);
   }
}
