package remapped;

import java.util.Random;

public class class_8931 extends class_1002 {
   private class_8931() {
   }

   @Override
   public String method_4346(Random var1) {
      return "1x1_b" + (var1.nextInt(4) + 1);
   }

   @Override
   public String method_4347(Random var1) {
      return "1x1_as" + (var1.nextInt(4) + 1);
   }

   @Override
   public String method_4345(Random var1, boolean var2) {
      return !var2 ? "1x2_c" + (var1.nextInt(4) + 1) : "1x2_c_stairs";
   }

   @Override
   public String method_4350(Random var1, boolean var2) {
      return !var2 ? "1x2_d" + (var1.nextInt(5) + 1) : "1x2_d_stairs";
   }

   @Override
   public String method_4348(Random var1) {
      return "1x2_se" + (var1.nextInt(1) + 1);
   }

   @Override
   public String method_4344(Random var1) {
      return "2x2_b" + (var1.nextInt(5) + 1);
   }

   @Override
   public String method_4349(Random var1) {
      return "2x2_s1";
   }
}
