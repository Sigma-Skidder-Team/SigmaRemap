package mapped;

import java.util.Random;

public class Class6024 extends Class6025 {
   public Class6024() {
       super();
   }

   @Override
   public String method18650(Random var1) {
      return "1x1_b" + (var1.nextInt(4) + 1);
   }

   @Override
   public String method18651(Random var1) {
      return "1x1_as" + (var1.nextInt(4) + 1);
   }

   @Override
   public String method18652(Random var1, boolean var2) {
      return !var2 ? "1x2_c" + (var1.nextInt(4) + 1) : "1x2_c_stairs";
   }

   @Override
   public String method18653(Random var1, boolean var2) {
      return !var2 ? "1x2_d" + (var1.nextInt(5) + 1) : "1x2_d_stairs";
   }

   @Override
   public String method18654(Random var1) {
      return "1x2_se" + (var1.nextInt(1) + 1);
   }

   @Override
   public String method18655(Random var1) {
      return "2x2_b" + (var1.nextInt(5) + 1);
   }

   @Override
   public String method18656(Random var1) {
      return "2x2_s1";
   }
}
