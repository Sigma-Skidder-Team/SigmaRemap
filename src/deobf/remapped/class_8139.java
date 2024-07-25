package remapped;

public abstract class class_8139<T extends Entity, M extends class_6521<T>> extends class_4171<T, M> {
   public class_8139(class_2514<T, M> var1) {
      super(var1);
   }

   @Override
   public void method_19344(class_7966 var1, class_2565 var2, int var3, T var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      class_7907 var13 = var2.method_11645(this.method_37036());
      if (Config.method_14424()) {
         class_6588.method_30278();
      }

      Config.method_14387().field_20923 = true;
      this.method_19347().method_45499(var1, var13, 15728640, class_5367.field_27381, 1.0F, 1.0F, 1.0F, 1.0F);
      Config.method_14387().field_20923 = false;
      if (Config.method_14424()) {
         class_6588.method_30249();
      }
   }

   public abstract RenderLayer method_37036();
}
