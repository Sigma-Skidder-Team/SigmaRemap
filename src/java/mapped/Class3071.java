package mapped;

public class Class3071 implements Class2982 {
   public final Class3877 field18239;

   public Class3071(Class3877 var1) {
      this.field18239 = var1;
   }

   @Override
   public void method11398(Class8563 var1) throws Exception {
      int var4 = var1.<Integer>method30555(BruhMotha.field22544, 0);

      for (int var5 = 0; var5 < (var4 != 0 ? 1 : 2); var5++) {
         int[] var6 = var1.<int[]>method30559(BruhMotha.field22546);
         String[] var7 = new String[var6.length];

         for (int var8 = 0; var8 < var6.length; var8++) {
            var7[var8] = "viaversion:legacy/" + var6[var8];
         }

         var1.method30560(BruhMotha.field22540, var7);
      }
   }
}
