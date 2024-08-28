package mapped;

public class Class7210 {
   public static final Class7210[] field30946 = new Class7210[64];
   public static final Class7210 field30947 = new Class7210(0, 0);
   public static final Class7210 field30948 = new Class7210(1, 8368696);
   public static final Class7210 field30949 = new Class7210(2, 16247203);
   public static final Class7210 field30950 = new Class7210(3, 13092807);
   public static final Class7210 field30951 = new Class7210(4, 16711680);
   public static final Class7210 field30952 = new Class7210(5, 10526975);
   public static final Class7210 field30953 = new Class7210(6, 10987431);
   public static final Class7210 field30954 = new Class7210(7, 31744);
   public static final Class7210 field30955 = new Class7210(8, 16777215);
   public static final Class7210 field30956 = new Class7210(9, 10791096);
   public static final Class7210 field30957 = new Class7210(10, 9923917);
   public static final Class7210 field30958 = new Class7210(11, 7368816);
   public static final Class7210 field30959 = new Class7210(12, 4210943);
   public static final Class7210 field30960 = new Class7210(13, 9402184);
   public static final Class7210 field30961 = new Class7210(14, 16776437);
   public static final Class7210 field30962 = new Class7210(15, 14188339);
   public static final Class7210 field30963 = new Class7210(16, 11685080);
   public static final Class7210 field30964 = new Class7210(17, 6724056);
   public static final Class7210 field30965 = new Class7210(18, 15066419);
   public static final Class7210 field30966 = new Class7210(19, 8375321);
   public static final Class7210 field30967 = new Class7210(20, 15892389);
   public static final Class7210 field30968 = new Class7210(21, 5000268);
   public static final Class7210 field30969 = new Class7210(22, 10066329);
   public static final Class7210 field30970 = new Class7210(23, 5013401);
   public static final Class7210 field30971 = new Class7210(24, 8339378);
   public static final Class7210 field30972 = new Class7210(25, 3361970);
   public static final Class7210 field30973 = new Class7210(26, 6704179);
   public static final Class7210 field30974 = new Class7210(27, 6717235);
   public static final Class7210 field30975 = new Class7210(28, 10040115);
   public static final Class7210 field30976 = new Class7210(29, 1644825);
   public static final Class7210 field30977 = new Class7210(30, 16445005);
   public static final Class7210 field30978 = new Class7210(31, 6085589);
   public static final Class7210 field30979 = new Class7210(32, 4882687);
   public static final Class7210 field30980 = new Class7210(33, 55610);
   public static final Class7210 field30981 = new Class7210(34, 8476209);
   public static final Class7210 field30982 = new Class7210(35, 7340544);
   public static final Class7210 field30983 = new Class7210(36, 13742497);
   public static final Class7210 field30984 = new Class7210(37, 10441252);
   public static final Class7210 field30985 = new Class7210(38, 9787244);
   public static final Class7210 field30986 = new Class7210(39, 7367818);
   public static final Class7210 field30987 = new Class7210(40, 12223780);
   public static final Class7210 field30988 = new Class7210(41, 6780213);
   public static final Class7210 field30989 = new Class7210(42, 10505550);
   public static final Class7210 field30990 = new Class7210(43, 3746083);
   public static final Class7210 field30991 = new Class7210(44, 8874850);
   public static final Class7210 field30992 = new Class7210(45, 5725276);
   public static final Class7210 field30993 = new Class7210(46, 8014168);
   public static final Class7210 field30994 = new Class7210(47, 4996700);
   public static final Class7210 field30995 = new Class7210(48, 4993571);
   public static final Class7210 field30996 = new Class7210(49, 5001770);
   public static final Class7210 field30997 = new Class7210(50, 9321518);
   public static final Class7210 field30998 = new Class7210(51, 2430480);
   public static final Class7210 field30999 = new Class7210(52, 12398641);
   public static final Class7210 field31000 = new Class7210(53, 9715553);
   public static final Class7210 field31001 = new Class7210(54, 6035741);
   public static final Class7210 field31002 = new Class7210(55, 1474182);
   public static final Class7210 field31003 = new Class7210(56, 3837580);
   public static final Class7210 field31004 = new Class7210(57, 5647422);
   public static final Class7210 field31005 = new Class7210(58, 1356933);
   public int field31006;
   public final int field31007;

   private Class7210(int var1, int var2) {
      if (var1 >= 0 && var1 <= 63) {
         this.field31007 = var1;
         this.field31006 = var2;
         field30946[var1] = this;
      } else {
         throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
      }
   }

   public int method22640(int var1) {
      short var4 = 220;
      if (var1 == 3) {
         var4 = 135;
      }

      if (var1 == 2) {
         var4 = 255;
      }

      if (var1 == 1) {
         var4 = 220;
      }

      if (var1 == 0) {
         var4 = 180;
      }

      int var5 = (this.field31006 >> 16 & 0xFF) * var4 / 255;
      int var6 = (this.field31006 >> 8 & 0xFF) * var4 / 255;
      int var7 = (this.field31006 & 0xFF) * var4 / 255;
      return 0xFF000000 | var7 << 16 | var6 << 8 | var5;
   }
}
