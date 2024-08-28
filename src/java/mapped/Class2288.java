package mapped;

public enum Class2288 {
   field15206(0, 96000, new int[]{33, 512}, new int[]{31, 9}),
   field15207(1, 88200, new int[]{33, 512}, new int[]{31, 9}),
   field15208(2, 64000, new int[]{38, 664}, new int[]{34, 10}),
   field15209(3, 48000, new int[]{40, 672}, new int[]{40, 14}),
   field15210(4, 44100, new int[]{40, 672}, new int[]{42, 14}),
   field15211(5, 32000, new int[]{40, 672}, new int[]{51, 14}),
   field15212(6, 24000, new int[]{41, 652}, new int[]{46, 14}),
   field15213(7, 22050, new int[]{41, 652}, new int[]{46, 14}),
   field15214(8, 16000, new int[]{37, 664}, new int[]{42, 14}),
   field15215(9, 12000, new int[]{37, 664}, new int[]{42, 14}),
   field15216(10, 11025, new int[]{37, 664}, new int[]{42, 14}),
   field15217(11, 8000, new int[]{34, 664}, new int[]{39, 14}),
   field15218(-1, 0, new int[]{0, 0}, new int[]{0, 0});

   private final int field15219;
   private final int field15220;
   private final int[] field15221;
   private final int[] field15222;
   private static final Class2288[] field15223 = new Class2288[]{
      field15206,
      field15207,
      field15208,
      field15209,
      field15210,
      field15211,
      field15212,
      field15213,
      field15214,
      field15215,
      field15216,
      field15217,
      field15218
   };

   public static Class2288 method9030(int var0) {
      Class2288 var3;
      if (var0 >= 0 && var0 < 12) {
         var3 = values()[var0];
      } else {
         var3 = field15218;
      }

      return var3;
   }

   public static Class2288 method9031(int var0) {
      Class2288[] var3 = values();
      Class2288 var4 = null;

      for (int var5 = 0; var4 == null && var5 < 12; var5++) {
         if (var0 == var3[var5].field15220) {
            var4 = var3[var5];
         }
      }

      if (var4 == null) {
         var4 = field15218;
      }

      return var4;
   }

   private Class2288(int var3, int var4, int[] var5, int[] var6) {
      this.field15219 = var3;
      this.field15220 = var4;
      this.field15221 = var5;
      this.field15222 = var6;
   }

   public int method9032() {
      return this.field15219;
   }

   public int method9033() {
      return this.field15220;
   }

   public int method9034() {
      return this.field15221[0];
   }

   public int method9035() {
      return this.field15221[1];
   }

   public int method9036(boolean var1) {
      return this.field15222[!var1 ? 0 : 1];
   }

   @Override
   public String toString() {
      return Integer.toString(this.field15220);
   }
}
