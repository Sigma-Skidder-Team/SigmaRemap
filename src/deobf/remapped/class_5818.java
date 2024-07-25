package remapped;

public enum class_5818 {
   field_29449(0, 63, "`", 96, 1),
   field_29461(73, 63, "1", 49, 1),
   field_29481(145, 63, "2", 50, 1),
   field_29473(218, 63, "3", 51, 1),
   field_29453(290, 63, "4", 52, 1),
   field_29468(363, 63, "5", 53, 1),
   field_29479(436, 63, "6", 54, 1),
   field_29503(508, 63, "7", 55, 1),
   field_29485(580, 63, "8", 56, 1),
   field_29510(653, 63, "9", 57, 1),
   field_29454(726, 63, "0", 48, 1),
   field_29514(798, 63, "-", 45, 1),
   field_29502(870, 63, "=", 61, 1),
   field_29480(943, 117, "Back", 259, 1),
   field_29455(0, 99, "Tab", 258, 2),
   field_29478(108, 63, "Q", 81, 2),
   field_29447(181, 63, "W", 87, 2),
   field_29515(253, 63, "E", 69, 2),
   field_29497(325, 63, "R", 82, 2),
   field_29452(399, 63, "T", 84, 2),
   field_29500(471, 63, "Y", 89, 2),
   field_29472(543, 63, "U", 85, 2),
   field_29477(615, 63, "I", 73, 2),
   field_29487(689, 63, "O", 79, 2),
   field_29511(761, 63, "P", 80, 2),
   field_29465(833, 63, "[", 91, 2),
   field_29462(905, 63, "]", 93, 2),
   field_29460(978, 82, "\\", 92, 2),
   field_29506(0, 116, "Caps Lock", 280, 3),
   field_29498(127, 63, "A", 65, 3),
   field_29512(199, 63, "S", 83, 3),
   field_29501(271, 63, "D", 68, 3),
   field_29475(343, 63, "F", 70, 3),
   field_29507(417, 63, "G", 71, 3),
   field_29505(489, 63, "H", 72, 3),
   field_29470(561, 63, "J", 74, 3),
   field_29459(633, 63, "K", 75, 3),
   field_29482(707, 63, "L", 76, 3),
   field_29464(779, 63, ";", 59, 3),
   field_29476(851, 63, "'", 39, 3),
   field_29491(924, 136, "Return", 257, 3),
   field_29499(0, 153, "Shift", 340, 4),
   field_29483(164, 63, "Z", 90, 4),
   field_29456(236, 63, "X", 88, 4),
   field_29513(308, 63, "C", 67, 4),
   field_29495(381, 63, "V", 86, 4),
   field_29466(454, 63, "B", 66, 4),
   field_29494(526, 63, "N", 78, 4),
   field_29509(598, 63, "M", 77, 4),
   field_29492(671, 63, ",", 44, 4),
   field_29451(744, 63, ".", 46, 4),
   field_29448(816, 63, "/", 47, 4),
   field_29493(888, 172, "Shift", 344, 4),
   field_29474(0, 97, "Ctrl", 341, 5),
   field_29508(106, 63, "Meta", 343, 5),
   field_29458(178, 103, "Alt", 342, 5),
   field_29496(290, 427, "Space", 32, 5),
   field_29467(726, 97, "Alt Gr", 346, 5),
   field_29490(833, 63, "Meta", 347, 5),
   field_29450(905, 63, "Menu", 348, 5),
   field_29486(978, 82, "Ctrl", 345, 5);

   public int field_29489;
   public int field_29484 = 63;
   public String field_29488;
   public boolean field_29457;
   public int field_29504;
   public int field_29469;

   private class_5818(int var3, int var4, String var5, int var6, int var7) {
      this.field_29489 = var3;
      this.field_29484 = var4;
      this.field_29457 = true;
      this.field_29488 = var5;
      this.field_29469 = var6;
      this.field_29504 = var7;
   }

   private class_5818(int var3, int var4, String var5, int var6) {
      this.field_29489 = var3;
      this.field_29484 = var4;
      this.field_29457 = false;
   }

   public int method_26333() {
      return 74 * (this.field_29504 - 1);
   }

   public int method_26332() {
      return this.field_29489;
   }

   public int method_26334() {
      return this.field_29484;
   }

   public int method_26331() {
      return 63;
   }
}
