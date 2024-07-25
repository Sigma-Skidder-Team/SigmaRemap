package remapped;

public enum class_1269 {
   field_7000(0, 0.4920635F),
   field_6997(1, 0.52380955F),
   field_6989(2, 0.5555556F),
   field_6986(3, 0.5873016F),
   field_6987(4, 0.61904764F),
   field_6994(5, 0.6666667F),
   field_6996(6, 0.6984127F),
   field_7001(7, 0.74603176F),
   field_6995(8, 0.7936508F),
   field_6979(9, 0.82539684F),
   field_6999(10, 0.8888889F),
   field_6978(11, 0.93650794F),
   field_6992(12, 1.0F),
   field_6982(13, 1.0476191F),
   field_6974(14, 1.1111112F),
   field_6998(15, 1.1746032F),
   field_6980(16, 1.2539682F),
   field_6977(17, 1.3333334F),
   field_6983(18, 1.4126984F),
   field_6975(19, 1.4920635F),
   field_6988(20, 1.5873016F),
   field_6985(21, 1.6666666F),
   field_6981(22, 1.7777778F),
   field_6984(23, 1.8730159F),
   field_7002(24, 2.0F);

   public int field_6976;
   public float field_6991;

   private class_1269(int var3, float var4) {
      this.field_6976 = var3;
      this.field_6991 = var4;
   }

   public static float method_5702(int var0) {
      for (class_1269 var6 : values()) {
         if (var6.field_6976 == var0) {
            return var6.field_6991;
         }
      }

      return 0.0F;
   }

   public static float method_5703(float var0) {
      class_1269[] var3 = values();
      int var4 = var3.length;
      int var5 = 0;
      int var6 = 0;

      for (float var7 = Math.abs(var3[0].field_6991 - var0); var5 < var4; var5++) {
         class_1269 var8 = var3[var5];
         float var9 = Math.abs(var8.field_6991 - var0);
         if (var9 < var7) {
            var6 = var5;
            var7 = var9;
         }
      }

      return (float)var3[var6].field_6976;
   }
}
