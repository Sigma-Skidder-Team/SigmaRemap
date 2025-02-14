package mapped;

import it.unimi.dsi.fastutil.ints.Int2IntMap;
import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;

public class Class9409 {
   private static String[] field43666;
   private static final Int2IntMap field43667 = new Int2IntOpenHashMap(83, 1.0F);

   private static void method36041(int var0, int var1) {
      field43667.put(var0, var1);
   }

   public static int method36042(int var0) {
      return field43667.getOrDefault(var0, var0);
   }

   static {
      field43667.defaultReturnValue(-1);
      method36041(1, 32);
      method36041(2, 22);
      method36041(3, 0);
      method36041(4, 15);
      method36041(5, 84);
      method36041(6, 71);
      method36041(7, 74);
      method36041(8, 35);
      method36041(9, 49);
      method36041(10, 2);
      method36041(11, 67);
      method36041(12, 34);
      method36041(13, 65);
      method36041(14, 75);
      method36041(15, 23);
      method36041(16, 77);
      method36041(17, 76);
      method36041(18, 33);
      method36041(19, 85);
      method36041(20, 55);
      method36041(21, 24);
      method36041(22, 25);
      method36041(23, 30);
      method36041(24, 68);
      method36041(25, 60);
      method36041(26, 13);
      method36041(27, 89);
      method36041(28, 63);
      method36041(29, 88);
      method36041(30, 1);
      method36041(31, 11);
      method36041(32, 46);
      method36041(33, 20);
      method36041(34, 21);
      method36041(35, 78);
      method36041(36, 81);
      method36041(37, 31);
      method36041(40, 41);
      method36041(41, 5);
      method36041(42, 39);
      method36041(43, 40);
      method36041(44, 42);
      method36041(45, 45);
      method36041(46, 43);
      method36041(47, 44);
      method36041(50, 10);
      method36041(51, 62);
      method36041(52, 69);
      method36041(53, 27);
      method36041(54, 87);
      method36041(55, 64);
      method36041(56, 26);
      method36041(57, 53);
      method36041(58, 18);
      method36041(59, 6);
      method36041(60, 61);
      method36041(61, 4);
      method36041(62, 38);
      method36041(63, 17);
      method36041(64, 83);
      method36041(65, 3);
      method36041(66, 82);
      method36041(67, 19);
      method36041(68, 28);
      method36041(69, 59);
      method36041(200, 16);
      method36041(90, 51);
      method36041(91, 58);
      method36041(92, 9);
      method36041(93, 7);
      method36041(94, 70);
      method36041(95, 86);
      method36041(96, 47);
      method36041(97, 66);
      method36041(98, 48);
      method36041(99, 80);
      method36041(100, 29);
      method36041(101, 56);
      method36041(102, 54);
      method36041(103, 36);
      method36041(104, 37);
      method36041(105, 50);
      method36041(120, 79);
   }
}
