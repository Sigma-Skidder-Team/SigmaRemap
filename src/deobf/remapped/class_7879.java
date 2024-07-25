package remapped;

public class class_7879 extends class_694 {
   public class_7879() {
      super(class_6629.field_34209, "spawner_minecart", 0.5F);
   }

   @Override
   public class_8599 method_12293(class_9873 var1, float var2) {
      EntityRenderDispatcher var5 = MinecraftClient.getInstance().method_8587();
      class_6906 var6 = new class_6906(var5);
      if (class_7860.field_40053.method_7978()) {
         class_7860.method_35561(var6, class_7860.field_40053, var1);
         var6.field_36492 = var2;
         return (class_8599)var6;
      } else {
         Config.method_14317("Field not found: RenderMinecart.modelMinecart");
         return null;
      }
   }
}
