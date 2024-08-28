package mapped;

public enum Class2121 {
   field13822(0, 0.4920635F),
   field13823(1, 0.52380955F),
   field13824(2, 0.5555556F),
   field13825(3, 0.5873016F),
   field13826(4, 0.61904764F),
   field13827(5, 0.6666667F),
   field13828(6, 0.6984127F),
   field13829(7, 0.74603176F),
   field13830(8, 0.7936508F),
   field13831(9, 0.82539684F),
   field13832(10, 0.8888889F),
   field13833(11, 0.93650794F),
   field13834(12, 1.0F),
   field13835(13, 1.0476191F),
   field13836(14, 1.1111112F),
   field13837(15, 1.1746032F),
   field13838(16, 1.2539682F),
   field13839(17, 1.3333334F),
   field13840(18, 1.4126984F),
   field13841(19, 1.4920635F),
   field13842(20, 1.5873016F),
   field13843(21, 1.6666666F),
   field13844(22, 1.7777778F),
   field13845(23, 1.8730159F),
   field13846(24, 2.0F);

   public int field13847;
   public float field13848;
   private static final Class2121[] field13849 = new Class2121[]{
      field13822,
      field13823,
      field13824,
      field13825,
      field13826,
      field13827,
      field13828,
      field13829,
      field13830,
      field13831,
      field13832,
      field13833,
      field13834,
      field13835,
      field13836,
      field13837,
      field13838,
      field13839,
      field13840,
      field13841,
      field13842,
      field13843,
      field13844,
      field13845,
      field13846
   };

   private Class2121(int var3, float var4) {
      this.field13847 = var3;
      this.field13848 = var4;
   }

   public static float method8806(int var0) {
      for (Class2121 var6 : values()) {
         if (var6.field13847 == var0) {
            return var6.field13848;
         }
      }

      return 0.0F;
   }

   public static float method8807(float var0) {
      Class2121[] var3 = values();
      int var4 = var3.length;
      int var5 = 0;
      int var6 = 0;

      for (float var7 = Math.abs(var3[0].field13848 - var0); var5 < var4; var5++) {
         Class2121 var8 = var3[var5];
         float var9 = Math.abs(var8.field13848 - var0);
         if (var9 < var7) {
            var6 = var5;
            var7 = var9;
         }
      }

      return (float)var3[var6].field13847;
   }
}
