package remapped;

import java.util.Random;

public class class_2980 extends class_1002 {
   private class_2980() {
   }

   @Override
   public String method_4346(Random var1) {
      return "1x1_a" + (var1.nextInt(5) + 1);
   }

   @Override
   public String method_4347(Random var1) {
      return "1x1_as" + (var1.nextInt(4) + 1);
   }

   @Override
   public String method_4345(Random var1, boolean var2) {
      return "1x2_a" + (var1.nextInt(9) + 1);
   }

   @Override
   public String method_4350(Random var1, boolean var2) {
      return "1x2_b" + (var1.nextInt(5) + 1);
   }

   @Override
   public String method_4348(Random var1) {
      return "1x2_s" + (var1.nextInt(2) + 1);
   }

   @Override
   public String method_4344(Random var1) {
      return "2x2_a" + (var1.nextInt(4) + 1);
   }

   @Override
   public String method_4349(Random var1) {
      return "2x2_s1";
   }
}
