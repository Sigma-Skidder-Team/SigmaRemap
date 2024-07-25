package remapped;

public abstract class class_1793<T extends class_2811, M extends class_7939<T>> extends class_2160<T, M> {
   private static final Identifier field_9161 = new Identifier("textures/entity/zombie/zombie.png");

   public class_1793(EntityRenderDispatcher var1, M var2, M var3, M var4) {
      super(var1, (M)var2, 0.5F);
      this.method_29100(new class_3035<T, M, class_7939>(this, var3, var4));
   }

   public Identifier method_7987(class_2811 var1) {
      return field_9161;
   }

   public boolean method_7986(T var1) {
      return var1.method_12797();
   }
}
