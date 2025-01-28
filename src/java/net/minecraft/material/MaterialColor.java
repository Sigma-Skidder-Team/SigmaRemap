package net.minecraft.material;

public class MaterialColor {
   public static final MaterialColor[] field30946 = new MaterialColor[64];
   public static final MaterialColor AIR = new MaterialColor(0, 0);
   public static final MaterialColor field30948 = new MaterialColor(1, 8368696);
   public static final MaterialColor field30949 = new MaterialColor(2, 16247203);
   public static final MaterialColor WOOL = new MaterialColor(3, 13092807);
   public static final MaterialColor field30951 = new MaterialColor(4, 16711680);
   public static final MaterialColor field30952 = new MaterialColor(5, 10526975);
   public static final MaterialColor IRON = new MaterialColor(6, 10987431);
   public static final MaterialColor FOLIAGE = new MaterialColor(7, 31744);
   public static final MaterialColor SNOW = new MaterialColor(8, 16777215);
   public static final MaterialColor field30956 = new MaterialColor(9, 10791096);
   public static final MaterialColor GRANITE = new MaterialColor(10, 9923917);
   public static final MaterialColor STONE = new MaterialColor(11, 7368816);
   public static final MaterialColor field30959 = new MaterialColor(12, 4210943);
   public static final MaterialColor OAK_PLANK = new MaterialColor(13, 9402184);
   public static final MaterialColor DIORITE = new MaterialColor(14, 16776437);
   public static final MaterialColor field30962 = new MaterialColor(15, 14188339);
   public static final MaterialColor field30963 = new MaterialColor(16, 11685080);
   public static final MaterialColor field30964 = new MaterialColor(17, 6724056);
   public static final MaterialColor field30965 = new MaterialColor(18, 15066419);
   public static final MaterialColor field30966 = new MaterialColor(19, 8375321);
   public static final MaterialColor field30967 = new MaterialColor(20, 15892389);
   public static final MaterialColor field30968 = new MaterialColor(21, 5000268);
   public static final MaterialColor field30969 = new MaterialColor(22, 10066329);
   public static final MaterialColor field30970 = new MaterialColor(23, 5013401);
   public static final MaterialColor field30971 = new MaterialColor(24, 8339378);
   public static final MaterialColor field30972 = new MaterialColor(25, 3361970);
   public static final MaterialColor field30973 = new MaterialColor(26, 6704179);
   public static final MaterialColor field30974 = new MaterialColor(27, 6717235);
   public static final MaterialColor field30975 = new MaterialColor(28, 10040115);
   public static final MaterialColor field30976 = new MaterialColor(29, 1644825);
   public static final MaterialColor field30977 = new MaterialColor(30, 16445005);
   public static final MaterialColor field30978 = new MaterialColor(31, 6085589);
   public static final MaterialColor field30979 = new MaterialColor(32, 4882687);
   public static final MaterialColor field30980 = new MaterialColor(33, 55610);
   public static final MaterialColor PODZOL = new MaterialColor(34, 8476209);
   public static final MaterialColor field30982 = new MaterialColor(35, 7340544);
   public static final MaterialColor field30983 = new MaterialColor(36, 13742497);
   public static final MaterialColor field30984 = new MaterialColor(37, 10441252);
   public static final MaterialColor field30985 = new MaterialColor(38, 9787244);
   public static final MaterialColor field30986 = new MaterialColor(39, 7367818);
   public static final MaterialColor field30987 = new MaterialColor(40, 12223780);
   public static final MaterialColor field30988 = new MaterialColor(41, 6780213);
   public static final MaterialColor field30989 = new MaterialColor(42, 10505550);
   public static final MaterialColor field30990 = new MaterialColor(43, 3746083);
   public static final MaterialColor field30991 = new MaterialColor(44, 8874850);
   public static final MaterialColor field30992 = new MaterialColor(45, 5725276);
   public static final MaterialColor field30993 = new MaterialColor(46, 8014168);
   public static final MaterialColor field30994 = new MaterialColor(47, 4996700);
   public static final MaterialColor field30995 = new MaterialColor(48, 4993571);
   public static final MaterialColor field30996 = new MaterialColor(49, 5001770);
   public static final MaterialColor field30997 = new MaterialColor(50, 9321518);
   public static final MaterialColor field30998 = new MaterialColor(51, 2430480);
   public static final MaterialColor field30999 = new MaterialColor(52, 12398641);
   public static final MaterialColor field31000 = new MaterialColor(53, 9715553);
   public static final MaterialColor field31001 = new MaterialColor(54, 6035741);
   public static final MaterialColor field31002 = new MaterialColor(55, 1474182);
   public static final MaterialColor field31003 = new MaterialColor(56, 3837580);
   public static final MaterialColor field31004 = new MaterialColor(57, 5647422);
   public static final MaterialColor field31005 = new MaterialColor(58, 1356933);
   public int field31006;
   public final int field31007;

   private MaterialColor(int var1, int var2) {
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
