package mapped;

import java.util.function.Function;

public class Class3041<T1, T2> extends Class3032<T1, T2> {
   private static String[] field18193;
   public final Function field18194;
   public final Class3758 field18195;

   public Class3041(Class3758 var1, Class4750 var2, Function var3) {
      super(var2);
      this.field18195 = var1;
      this.field18194 = var3;
   }

   @Override
   public T2 method11402(Class8563 var1, T1 var2) throws Exception {
      return (T2)this.field18194.apply(var2);
   }
}
