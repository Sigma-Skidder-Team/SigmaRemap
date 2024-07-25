package remapped;

public class class_326 extends class_7164<class_5542, class_6980<class_5542>> {
   private static final class_4639 field_1215 = new class_4639("textures/entity/fox/fox.png");
   private static final class_4639 field_1217 = new class_4639("textures/entity/fox/fox_sleep.png");
   private static final class_4639 field_1214 = new class_4639("textures/entity/fox/snow_fox.png");
   private static final class_4639 field_1213 = new class_4639("textures/entity/fox/snow_fox_sleep.png");

   public class_326(class_6122 var1) {
      super(var1, new class_6980<class_5542>(), 0.4F);
      this.method_29100(new class_9634(this));
   }

   public void method_1511(class_5542 var1, class_7966 var2, float var3, float var4, float var5) {
      super.method_29099(var1, var2, var3, var4, var5);
      if (var1.method_25188() || var1.method_25212()) {
         float var8 = -class_9299.method_42795(var5, var1.field_41762, var1.field_41755);
         var2.method_36060(class_2426.field_12080.method_11074(var8));
      }
   }

   public class_4639 method_1512(class_5542 var1) {
      if (var1.method_25199() != class_2715.field_13271) {
         return !var1.method_26507() ? field_1214 : field_1213;
      } else {
         return !var1.method_26507() ? field_1215 : field_1217;
      }
   }
}
