package remapped;

public class class_7549 extends MonsterEntity {
   private static String[] field_38498;

   public class_7549(EntityType<? extends class_7549> var1, World var2) {
      super(var1, var2);
   }

   @Override
   public float method_26425(class_7653 var1, class_6097 var2) {
      return 10.440001F;
   }

   public static MutableAttribute method_34356() {
      return MonsterEntity.func_234295_eP_()
         .createMutableAttribute(Attributes.MAX_HEALTH, 100.0)
         .createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.5)
         .createMutableAttribute(Attributes.ATTACK_DAMAGE, 50.0);
   }

   @Override
   public float method_21376(BlockPos var1, class_4924 var2) {
      return var2.method_22566(var1) - 0.5F;
   }
}
