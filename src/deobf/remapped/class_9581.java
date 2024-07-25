package remapped;

public class class_9581 implements class_857 {
   private static String[] field_48725;

   public class_9581(class_5501 var1) {
      this.field_48726 = var1;
   }

   @Override
   public void method_3722(class_5051 var1) throws Exception {
      class_4787 var4 = var1.method_23255().<class_4787>method_6746(class_4787.class);
      class_6545 var5 = var1.<class_6545>method_23261(new class_9278(var4));

      for (class_3929 var9 : var5.method_29869()) {
         if (var9 != null) {
            for (int var10 = 0; var10 < var9.method_18193(); var10++) {
               var9.method_18167(var10, this.field_48726.field_27999.method_19008().method_28217(var9.method_18168(var10)));
            }
         }
      }
   }
}
