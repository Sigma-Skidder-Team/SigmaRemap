package remapped;

import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class class_4724 extends class_5837 {
   private static String[] field_22907;
   private final List<class_1090> field_22908;

   private class_4724(class_7279[] var1, List<class_1090> var2) {
      super(var1);
      this.field_22908 = ImmutableList.copyOf(var2);
   }

   @Override
   public class_1404 method_13321() {
      return class_5116.field_26387;
   }

   @Override
   public class_6098 method_26627(class_6098 var1, class_2792 var2) {
      Random var5 = var2.method_12693();

      for (class_1090 var7 : this.field_22908) {
         UUID var8 = class_1090.method_4779(var7);
         if (var8 == null) {
            var8 = UUID.randomUUID();
         }

         class_6943 var9 = class_9665.<class_6943>method_44697(class_1090.method_4772(var7), var5);
         var1.method_27962(
            class_1090.method_4780(var7),
            new class_9343(var8, class_1090.method_4776(var7), (double)class_1090.method_4778(var7).method_36244(var5), class_1090.method_4773(var7)),
            var9
         );
      }

      return var1;
   }
}
