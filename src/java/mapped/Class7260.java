package mapped;

import com.mentalfrostbyte.jello.unmapped.Class4305;

public class Class7260 implements Class7261 {
   private static String[] field31148;
   public int field31149;

   public Class7260(int var1) {
      this.field31149 = var1;
   }

   @Override
   public void method22796(Class4305 var1) {
      if (var1.method13241().size() > 0) {
         int var4 = 0;
         int var5 = 0;
         int var6 = 0;

         for (int var7 = 0; var7 < var1.method13241().size(); var7++) {
            Class4305 var8 = var1.method13241().get(var7);
            if (var4 + var8.method13267() + this.field31149 > var1.method13267()) {
               var4 = 0;
               var5 += var6;
            }

            var8.method13266(var5);
            var8.method13264(var4);
            var4 += var8.method13267() + this.field31149;
            var6 = Math.max(var8.method13269(), var6);
         }
      }
   }
}
