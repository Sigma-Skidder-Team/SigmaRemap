package remapped;

public class class_4339 implements class_857 {
   public class_4339(class_3283 var1) {
      this.field_21086 = var1;
   }

   @Override
   public void method_3722(class_5051 var1) throws Exception {
      class_4675 var4 = var1.method_23255().<class_4675>method_6746(class_4675.class);
      short var5 = var1.<Short>method_23248(class_8039.field_41166, 0);
      if (var4.method_21623() != null && var4.method_21623().equals("minecraft:brewing_stand") && var5 >= 4) {
         var1.method_23257(class_8039.field_41166, 0, (short)(var5 + 1));
      }
   }
}
