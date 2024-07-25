package remapped;

public class class_1513 {
   public static final class_1513[] field_8024 = new class_1513[64];
   public static final class_1513 field_8018 = new class_1513(0, 0);
   public static final class_1513 field_8047 = new class_1513(1, 8368696);
   public static final class_1513 field_8048 = new class_1513(2, 16247203);
   public static final class_1513 field_8041 = new class_1513(3, 13092807);
   public static final class_1513 field_8042 = new class_1513(4, 16711680);
   public static final class_1513 field_8055 = new class_1513(5, 10526975);
   public static final class_1513 field_8057 = new class_1513(6, 10987431);
   public static final class_1513 field_8033 = new class_1513(7, 31744);
   public static final class_1513 field_8012 = new class_1513(8, 16777215);
   public static final class_1513 field_8034 = new class_1513(9, 10791096);
   public static final class_1513 field_8032 = new class_1513(10, 9923917);
   public static final class_1513 field_8030 = new class_1513(11, 7368816);
   public static final class_1513 field_8028 = new class_1513(12, 4210943);
   public static final class_1513 field_8061 = new class_1513(13, 9402184);
   public static final class_1513 field_8029 = new class_1513(14, 16776437);
   public static final class_1513 field_8051 = new class_1513(15, 14188339);
   public static final class_1513 field_8011 = new class_1513(16, 11685080);
   public static final class_1513 field_8071 = new class_1513(17, 6724056);
   public static final class_1513 field_8013 = new class_1513(18, 15066419);
   public static final class_1513 field_8025 = new class_1513(19, 8375321);
   public static final class_1513 field_8026 = new class_1513(20, 15892389);
   public static final class_1513 field_8016 = new class_1513(21, 5000268);
   public static final class_1513 field_8058 = new class_1513(22, 10066329);
   public static final class_1513 field_8073 = new class_1513(23, 5013401);
   public static final class_1513 field_8020 = new class_1513(24, 8339378);
   public static final class_1513 field_8037 = new class_1513(25, 3361970);
   public static final class_1513 field_8070 = new class_1513(26, 6704179);
   public static final class_1513 field_8063 = new class_1513(27, 6717235);
   public static final class_1513 field_8017 = new class_1513(28, 10040115);
   public static final class_1513 field_8059 = new class_1513(29, 1644825);
   public static final class_1513 field_8064 = new class_1513(30, 16445005);
   public static final class_1513 field_8050 = new class_1513(31, 6085589);
   public static final class_1513 field_8066 = new class_1513(32, 4882687);
   public static final class_1513 field_8019 = new class_1513(33, 55610);
   public static final class_1513 field_8022 = new class_1513(34, 8476209);
   public static final class_1513 field_8040 = new class_1513(35, 7340544);
   public static final class_1513 field_8014 = new class_1513(36, 13742497);
   public static final class_1513 field_8053 = new class_1513(37, 10441252);
   public static final class_1513 field_8052 = new class_1513(38, 9787244);
   public static final class_1513 field_8054 = new class_1513(39, 7367818);
   public static final class_1513 field_8069 = new class_1513(40, 12223780);
   public static final class_1513 field_8038 = new class_1513(41, 6780213);
   public static final class_1513 field_8035 = new class_1513(42, 10505550);
   public static final class_1513 field_8072 = new class_1513(43, 3746083);
   public static final class_1513 field_8062 = new class_1513(44, 8874850);
   public static final class_1513 field_8046 = new class_1513(45, 5725276);
   public static final class_1513 field_8068 = new class_1513(46, 8014168);
   public static final class_1513 field_8043 = new class_1513(47, 4996700);
   public static final class_1513 field_8049 = new class_1513(48, 4993571);
   public static final class_1513 field_8015 = new class_1513(49, 5001770);
   public static final class_1513 field_8044 = new class_1513(50, 9321518);
   public static final class_1513 field_8056 = new class_1513(51, 2430480);
   public static final class_1513 field_8045 = new class_1513(52, 12398641);
   public static final class_1513 field_8031 = new class_1513(53, 9715553);
   public static final class_1513 field_8036 = new class_1513(54, 6035741);
   public static final class_1513 field_8023 = new class_1513(55, 1474182);
   public static final class_1513 field_8021 = new class_1513(56, 3837580);
   public static final class_1513 field_8065 = new class_1513(57, 5647422);
   public static final class_1513 field_8039 = new class_1513(58, 1356933);
   public int field_8060;
   public final int field_8027;

   private class_1513(int var1, int var2) {
      if (var1 >= 0 && var1 <= 63) {
         this.field_8027 = var1;
         this.field_8060 = var2;
         field_8024[var1] = this;
      } else {
         throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
      }
   }

   public int method_6926(int var1) {
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

      int var5 = (this.field_8060 >> 16 & 0xFF) * var4 / 255;
      int var6 = (this.field_8060 >> 8 & 0xFF) * var4 / 255;
      int var7 = (this.field_8060 & 0xFF) * var4 / 255;
      return 0xFF000000 | var7 << 16 | var6 << 8 | var5;
   }
}
