package remapped;

public class class_4262 extends class_6090<class_581> {
   public static final class_4639 field_20656 = new class_4639("textures/entity/projectiles/arrow.png");
   public static final class_4639 field_20655 = new class_4639("textures/entity/projectiles/tipped_arrow.png");

   public class_4262(class_6122 var1) {
      super(var1);
   }

   public class_4639 method_19854(class_581 var1) {
      return var1.method_2750() <= 0 ? field_20656 : field_20655;
   }
}
