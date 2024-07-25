package remapped;

public class class_4262 extends class_6090<class_581> {
   public static final Identifier field_20656 = new Identifier("textures/entity/projectiles/arrow.png");
   public static final Identifier field_20655 = new Identifier("textures/entity/projectiles/tipped_arrow.png");

   public class_4262(EntityRenderDispatcher var1) {
      super(var1);
   }

   public Identifier method_19854(class_581 var1) {
      return var1.method_2750() <= 0 ? field_20656 : field_20655;
   }
}
