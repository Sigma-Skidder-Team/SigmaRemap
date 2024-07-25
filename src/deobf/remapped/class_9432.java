package remapped;

public class class_9432 extends class_3056 {
   public class_9432() {
      super(class_6629.field_34272, "cave_spider", 0.7F);
   }

   @Override
   public class_8599 method_12293(class_9873 var1, float var2) {
      EntityRenderDispatcher var5 = MinecraftClient.getInstance().method_8587();
      class_3722 var6 = new class_3722(var5);
      var6.field_32487 = (class_1207<T>)var1;
      var6.field_36492 = var2;
      return (class_8599)var6;
   }
}
