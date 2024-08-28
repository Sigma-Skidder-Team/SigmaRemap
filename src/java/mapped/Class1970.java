package mapped;

public enum Class1970 implements Class1971 {
   field12839;

   private static final Class1970[] field12840 = new Class1970[]{field12839};

   @Override
   public int method8251(Class6661 var1, int var2, int var3) {
      Class8718 var6 = var1.method20313();
      double var7 = var6.method31444((double)var2 / 8.0, (double)var3 / 8.0, 0.0, 0.0, 0.0);
      if (!(var7 > 0.4)) {
         if (!(var7 > 0.2)) {
            if (!(var7 < -0.4)) {
               return !(var7 < -0.2) ? 0 : 46;
            } else {
               return 10;
            }
         } else {
            return 45;
         }
      } else {
         return 44;
      }
   }
}
