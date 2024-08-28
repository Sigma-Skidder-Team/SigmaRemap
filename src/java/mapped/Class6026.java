package mapped;

import java.util.Random;

public class Class6026 extends Class6025 {
   public Class6026() {
   }

   @Override
   public String method18650(Random var1) {
      return "1x1_a" + (var1.nextInt(5) + 1);
   }

   @Override
   public String method18651(Random var1) {
      return "1x1_as" + (var1.nextInt(4) + 1);
   }

   @Override
   public String method18652(Random var1, boolean var2) {
      return "1x2_a" + (var1.nextInt(9) + 1);
   }

   @Override
   public String method18653(Random var1, boolean var2) {
      return "1x2_b" + (var1.nextInt(5) + 1);
   }

   @Override
   public String method18654(Random var1) {
      return "1x2_s" + (var1.nextInt(2) + 1);
   }

   @Override
   public String method18655(Random var1) {
      return "2x2_a" + (var1.nextInt(4) + 1);
   }

   @Override
   public String method18656(Random var1) {
      return "2x2_s1";
   }
}
