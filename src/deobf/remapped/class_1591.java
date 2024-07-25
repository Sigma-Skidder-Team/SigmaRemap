package remapped;

import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class class_1591 extends class_2160<MobEntity, class_672<MobEntity>> {
   private static final Map<EntityType<?>, Identifier> field_8307 = ImmutableMap.of(
      EntityType.field_34240,
      new Identifier("textures/entity/piglin/piglin.png"),
      EntityType.field_34234,
      new Identifier("textures/entity/piglin/zombified_piglin.png"),
      EntityType.field_34257,
      new Identifier("textures/entity/piglin/piglin_brute.png")
   );

   public class_1591(EntityRenderDispatcher var1, boolean var2) {
      super(var1, method_7145(var2), 0.5F, 1.0019531F, 1.0F, 1.0019531F);
      this.method_29100(new class_3035(this, new class_2344(0.5F), new class_2344(1.02F)));
   }

   private static class_672<MobEntity> method_7145(boolean var0) {
      class_672 var3 = new class_672(0.0F, 64, 64);
      if (var0) {
         var3.field_3733.field_8200 = false;
      }

      return var3;
   }

   @Override
   public Identifier method_10053(MobEntity var1) {
      Identifier var4 = field_8307.get(var1.getType());
      if (var4 != null) {
         return var4;
      } else {
         throw new IllegalArgumentException("I don't know what texture to use for " + var1.getType());
      }
   }

   public boolean method_7144(MobEntity var1) {
      return var1 instanceof class_6993 && ((class_6993)var1).method_31990();
   }
}
