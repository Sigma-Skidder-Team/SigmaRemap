package mapped;

import javax.annotation.Nullable;

public abstract class Class3241 extends Block implements Class3245 {
   public Class3241(Class7929 var1) {
      super(var1);
   }

   @Override
   public Class1855 method11526(Class7380 var1) {
      return Class1855.field9885;
   }

   @Override
   public boolean method11647(Class7380 var1, Class1655 var2, BlockPos var3, int var4, int var5) {
      super.method11647(var1, var2, var3, var4, var5);
      Class944 var8 = var2.method6759(var3);
      return var8 != null ? var8.method3751(var4, var5) : false;
   }

   @Nullable
   @Override
   public Class949 method11528(Class7380 var1, Class1655 var2, BlockPos var3) {
      Class944 var6 = var2.method6759(var3);
      return !(var6 instanceof Class949) ? null : (Class949)var6;
   }
}
