package remapped;

import com.google.common.collect.ImmutableMap;

public class class_5488 extends class_5920<MobEntity> {
   private static String[] field_27972;
   private final int field_27971;

   public class_5488(int var1) {
      super(
         ImmutableMap.of(
            class_6044.field_30874, class_561.field_3319, class_6044.field_30884, class_561.field_3320, class_6044.field_30865, class_561.field_3318
         )
      );
      this.field_27971 = var1;
   }

   public boolean method_24948(class_6331 var1, MobEntity var2) {
      LivingEntity var5 = this.method_24949(var2);
      return !this.method_24950(var2) && class_1225.method_5449(var2, var5) && class_1225.method_5457(var2, var5);
   }

   private boolean method_24950(MobEntity var1) {
      return var1.method_26564(var1x -> var1x instanceof class_551 && var1.method_26878((class_551)var1x));
   }

   public void method_24947(class_6331 var1, MobEntity var2, long var3) {
      LivingEntity var7 = this.method_24949(var2);
      class_1225.method_5444(var2, var7);
      var2.method_26597(Hand.MAIN_HAND);
      var2.method_26442(var7);
      var2.method_26525().method_5107(class_6044.field_30865, true, (long)this.field_27971);
   }

   private LivingEntity method_24949(MobEntity var1) {
      return var1.method_26525().<LivingEntity>method_5138(class_6044.field_30884).get();
   }
}
