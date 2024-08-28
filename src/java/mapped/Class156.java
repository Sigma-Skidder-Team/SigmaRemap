package mapped;

public class Class156 implements Class122 {
   private static String[] field509;
   private final Long field510;
   private final Class6872 field511;

   public Class156(Long var1, Class6872 var2) {
      this.field510 = var1;
      this.field511 = var2;
   }

   @Override
   public Class7130 method354() {
      return Class8582.field38610;
   }

   public boolean test(Class7812 var1) {
      ServerWorld var4 = var1.method26090();
      long var5 = var4.method6784();
      if (this.field510 != null) {
         var5 %= this.field510;
      }

      return this.field511.method20925((int)var5);
   }

   // $VF: synthetic method
   public static Long method473(Class156 var0) {
      return var0.field510;
   }

   // $VF: synthetic method
   public static Class6872 method474(Class156 var0) {
      return var0.field511;
   }
}
