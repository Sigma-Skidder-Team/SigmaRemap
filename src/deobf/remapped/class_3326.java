package remapped;

import java.util.List;

public class class_3326 implements class_857 {
   private static String[] field_16421;

   public class_3326(class_6506 var1) {
      this.field_16420 = var1;
   }

   @Override
   public void method_3722(class_5051 var1) throws Exception {
      class_4787 var4 = var1.method_23255().<class_4787>method_6746(class_4787.class);
      class_2615 var5 = new class_2615(var4);
      class_6545 var6 = var1.<class_6545>method_23261(var5);
      List var7 = var6.method_29862();

      for (int var8 = 0; var8 < var6.method_29869().length; var8++) {
         class_3929 var9 = var6.method_29869()[var8];
         if (var9 != null) {
            for (int var10 = 0; var10 < 16; var10++) {
               for (int var11 = 0; var11 < 16; var11++) {
                  for (int var12 = 0; var12 < 16; var12++) {
                     int var13 = var9.method_18180(var12, var10, var11);
                     if (class_8877.method_40846(var13)) {
                        var7.add(class_8877.method_40847(var12 + (var6.method_29858() << 4), var10 + (var8 << 4), var11 + (var6.method_29860() << 4), var13));
                     }
                  }
               }
            }
         }
      }

      var1.method_23236(class_8039.field_41177, var6.method_29862().<class_5531>toArray(new class_5531[0]));
   }
}
