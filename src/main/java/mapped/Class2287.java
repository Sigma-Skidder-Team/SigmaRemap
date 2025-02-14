package mapped;

public enum Class2287 {
   field15138(0, 63, "`", 96, 1),
   field15139(73, 63, "1", 49, 1),
   field15140(145, 63, "2", 50, 1),
   field15141(218, 63, "3", 51, 1),
   field15142(290, 63, "4", 52, 1),
   field15143(363, 63, "5", 53, 1),
   field15144(436, 63, "6", 54, 1),
   field15145(508, 63, "7", 55, 1),
   field15146(580, 63, "8", 56, 1),
   field15147(653, 63, "9", 57, 1),
   field15148(726, 63, "0", 48, 1),
   field15149(798, 63, "-", 45, 1),
   field15150(870, 63, "=", 61, 1),
   field15151(943, 117, "Back", 259, 1),
   field15152(0, 99, "Tab", 258, 2),
   field15153(108, 63, "Q", 81, 2),
   field15154(181, 63, "W", 87, 2),
   field15155(253, 63, "E", 69, 2),
   field15156(325, 63, "R", 82, 2),
   field15157(399, 63, "T", 84, 2),
   field15158(471, 63, "Y", 89, 2),
   field15159(543, 63, "U", 85, 2),
   field15160(615, 63, "I", 73, 2),
   field15161(689, 63, "O", 79, 2),
   field15162(761, 63, "P", 80, 2),
   field15163(833, 63, "[", 91, 2),
   field15164(905, 63, "]", 93, 2),
   field15165(978, 82, "\\", 92, 2),
   field15166(0, 116, "Caps Lock", 280, 3),
   field15167(127, 63, "A", 65, 3),
   field15168(199, 63, "S", 83, 3),
   field15169(271, 63, "D", 68, 3),
   field15170(343, 63, "F", 70, 3),
   field15171(417, 63, "G", 71, 3),
   field15172(489, 63, "H", 72, 3),
   field15173(561, 63, "J", 74, 3),
   field15174(633, 63, "K", 75, 3),
   field15175(707, 63, "L", 76, 3),
   field15176(779, 63, ";", 59, 3),
   field15177(851, 63, "'", 39, 3),
   field15178(924, 136, "Return", 257, 3),
   field15179(0, 153, "Shift", 340, 4),
   field15180(164, 63, "Z", 90, 4),
   field15181(236, 63, "X", 88, 4),
   field15182(308, 63, "C", 67, 4),
   field15183(381, 63, "V", 86, 4),
   field15184(454, 63, "B", 66, 4),
   field15185(526, 63, "N", 78, 4),
   field15186(598, 63, "M", 77, 4),
   field15187(671, 63, ",", 44, 4),
   field15188(744, 63, ".", 46, 4),
   field15189(816, 63, "/", 47, 4),
   field15190(888, 172, "Shift", 344, 4),
   field15191(0, 97, "Ctrl", 341, 5),
   field15192(106, 63, "Meta", 343, 5),
   field15193(178, 103, "Alt", 342, 5),
   field15194(290, 427, "Space", 32, 5),
   field15195(726, 97, "Alt Gr", 346, 5),
   field15196(833, 63, "Meta", 347, 5),
   field15197(905, 63, "Menu", 348, 5),
   field15198(978, 82, "Ctrl", 345, 5);

   public int field15199;
   public int field15200 = 63;
   public String field15201;
   public boolean field15202;
   public int field15203;
   public int field15204;
   private static final Class2287[] field15205 = new Class2287[]{
      field15138,
      field15139,
      field15140,
      field15141,
      field15142,
      field15143,
      field15144,
      field15145,
      field15146,
      field15147,
      field15148,
      field15149,
      field15150,
      field15151,
      field15152,
      field15153,
      field15154,
      field15155,
      field15156,
      field15157,
      field15158,
      field15159,
      field15160,
      field15161,
      field15162,
      field15163,
      field15164,
      field15165,
      field15166,
      field15167,
      field15168,
      field15169,
      field15170,
      field15171,
      field15172,
      field15173,
      field15174,
      field15175,
      field15176,
      field15177,
      field15178,
      field15179,
      field15180,
      field15181,
      field15182,
      field15183,
      field15184,
      field15185,
      field15186,
      field15187,
      field15188,
      field15189,
      field15190,
      field15191,
      field15192,
      field15193,
      field15194,
      field15195,
      field15196,
      field15197,
      field15198
   };

   private Class2287(int var3, int var4, String var5, int var6, int var7) {
      this.field15199 = var3;
      this.field15200 = var4;
      this.field15202 = true;
      this.field15201 = var5;
      this.field15204 = var6;
      this.field15203 = var7;
   }

   private Class2287(int var3, int var4, String var5, int var6) {
      this.field15199 = var3;
      this.field15200 = var4;
      this.field15202 = false;
   }

   public int method9026() {
      return 74 * (this.field15203 - 1);
   }

   public int method9027() {
      return this.field15199;
   }

   public int method9028() {
      return this.field15200;
   }

   public int method9029() {
      return 63;
   }
}
