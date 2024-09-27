package mapped;

public final class Class3812 extends Class3758 {
   private static String[] field20009;
   public final Class4662 field20010;

   public Class3812(Class4662 var1) {
      this.field20010 = var1;
   }

   @Override
   public void method12725() {
      this.method12733(var1 -> {
         int var4 = var1.<Integer>method30561(BruhMotha.field22544);
         int var5 = 0;

         for (int var6 = 0; var6 < var4; var6++) {
            String var7 = var1.<String>method30559(BruhMotha.field22539);
            String var8 = var1.<String>method30559(BruhMotha.field22539);
            if (!Class8770.method31638().contains(var8)) {
               var1.method30560(BruhMotha.field22539, var8);
               var1.method30560(BruhMotha.field22539, var7);
               field20010.method14630(var1, var8);
            } else {
               var5++;
            }
         }

         var1.method30558(BruhMotha.field22544, 0, var4 - var5);
      });
   }
}
