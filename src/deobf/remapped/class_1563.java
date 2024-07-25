package remapped;

public class class_1563 implements class_857 {
   public class_1563(class_8639 var1) {
      this.field_8235 = var1;
   }

   @Override
   public void method_3722(class_5051 var1) throws Exception {
      class_4787 var4 = var1.method_23255().<class_4787>method_6746(class_4787.class);
      class_2376 var5 = new class_2376(var4);
      class_6545 var6 = var1.<class_6545>method_23261(var5);

      for (int var7 = 0; var7 < var6.method_29869().length; var7++) {
         class_3929 var8 = var6.method_29869()[var7];
         if (var8 != null) {
            for (int var9 = 0; var9 < 16; var9++) {
               for (int var10 = 0; var10 < 16; var10++) {
                  for (int var11 = 0; var11 < 16; var11++) {
                     int var12 = var8.method_18180(var11, var9, var10);
                     if (var12 == 26) {
                        class_5531 var13 = new class_5531("");
                        var13.<class_5232>method_25122(new class_5232("color", 14));
                        var13.<class_5232>method_25122(new class_5232("x", var11 + (var6.method_29858() << 4)));
                        var13.<class_5232>method_25122(new class_5232("y", var9 + (var7 << 4)));
                        var13.<class_5232>method_25122(new class_5232("z", var10 + (var6.method_29860() << 4)));
                        var13.<class_887>method_25122(new class_887("id", "minecraft:bed"));
                        var6.method_29862().add(var13);
                     }
                  }
               }
            }
         }
      }
   }
}
