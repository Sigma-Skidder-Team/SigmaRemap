package remapped;

public class class_8196 implements class_857 {
   public class_8196(class_6808 var1) {
      this.field_41946 = var1;
   }

   @Override
   public void method_3722(class_5051 var1) throws Exception {
      short var4 = var1.<Short>method_23248(class_8039.field_41175, 0);
      short var5 = var1.<Short>method_23248(class_8039.field_41166, 0);
      short var6 = var1.<Short>method_23248(class_8039.field_41166, 1);
      class_4675 var7 = var1.method_23255().<class_4675>method_6746(class_4675.class);
      if (var7.method_21623() != null && var7.method_21623().equalsIgnoreCase("minecraft:enchanting_table") && var5 > 3 && var5 < 7) {
         short var8 = (short)(var6 >> 8);
         short var9 = (short)(var6 & 255);
         var1.method_23260(var1.method_23250(), new class_8769(this, var4, var5, var9)).method_23233(class_6890.class);
         var1.method_23257(class_8039.field_41166, 0, (short)(var5 + 3));
         var1.method_23257(class_8039.field_41166, 1, var8);
      }
   }
}
