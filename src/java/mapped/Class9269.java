package mapped;

import com.mojang.serialization.Codec;

public class Class9269<P extends Class6166> {
   public static final Class9269<Class6168> field42638 = method34905("simple_block_placer", Class6168.field27596);
   public static final Class9269<Class6169> field42639 = method34905("double_plant_placer", Class6169.field27599);
   public static final Class9269<Class6167> field42640 = method34905("column_placer", Class6167.field27592);
   private final Codec<P> field42641;

   private static <P extends Class6166> Class9269<P> method34905(String var0, Codec<P> var1) {
      return Class2348.<Class9269<P>>method9194(Class2348.field16130, var0, new Class9269<P>(var1));
   }

   private Class9269(Codec<P> var1) {
      this.field42641 = var1;
   }

   public Codec<P> method34906() {
      return this.field42641;
   }
}
