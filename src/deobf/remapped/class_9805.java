package remapped;

public class class_9805 extends class_2160<class_9355, class_819<class_9355>> {
   private static final class_4639 field_49711 = new class_4639("textures/entity/zombie_villager/zombie_villager.png");

   public class_9805(class_6122 var1, class_550 var2) {
      super(var1, new class_819<class_9355>(0.0F, false), 0.5F);
      this.method_29100(new class_3035<class_9355, class_819<class_9355>, class_819>(this, new class_819(0.5F, true), new class_819(1.0F, true)));
      this.method_29100(new class_3295<class_9355, class_819<class_9355>>(this, var2, "zombie_villager"));
   }

   public class_4639 method_45220(class_9355 var1) {
      return field_49711;
   }

   public boolean method_45219(class_9355 var1) {
      return var1.method_43208();
   }
}
