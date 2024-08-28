package mapped;

public class Class6860 implements Class6861<Class314> {
   private static String[] field29786;
   private final ResourceLocation field29787;

   public Class6860(ResourceLocation var1) {
      this.field29787 = var1;
   }

   public void run(Class314 var1, Class8559<Class314> var2, long var3) {
      Class7268 var7 = var1.method1397();
      var7.method22829(this.field29787).ifPresent(var1x -> var7.method22825(var1x, var7.method22828()));
   }

   // $VF: synthetic method
   public static ResourceLocation method20908(Class6860 var0) {
      return var0.field29787;
   }
}
