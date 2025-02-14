package mapped;

import com.mojang.serialization.Codec;

public class Class2967 extends Structure<Class4700> {
   private static String[] field18080;
   private final int field18081;
   private final boolean field18082;
   private final boolean field18083;

   public Class2967(Codec<Class4700> var1, int var2, boolean var3, boolean var4) {
      super(var1);
      this.field18081 = var2;
      this.field18082 = var3;
      this.field18083 = var4;
   }

   @Override
   public Class7072<Class4700> method11359() {
      return (var1, var2, var3, var4, var5, var6) -> new Class5456(this, var2, var3, var4, var5, var6);
   }

   // $VF: synthetic method
   public static int method11379(Class2967 var0) {
      return var0.field18081;
   }

   // $VF: synthetic method
   public static boolean method11380(Class2967 var0) {
      return var0.field18082;
   }

   // $VF: synthetic method
   public static boolean method11381(Class2967 var0) {
      return var0.field18083;
   }
}
