package remapped;

public class class_1749 extends class_9153 {
   private static String[] field_9006;

   public class_1749(MinecraftClient var1, ClientPlayNetHandler var2) {
      super(var1, var2);
   }

   @Override
   public ClientPlayerEntity method_42131(ClientWorld var1, StatisticsManager var2, ClientRecipeBook var3) {
      return new class_1604(this.field_46835, var1, this.field_46837, var2, var3, false, false);
   }

   @Override
   public ClientPlayerEntity method_42130(ClientWorld var1, StatisticsManager var2, ClientRecipeBook var3, boolean var4, boolean var5) {
      return new class_1604(this.field_46835, var1, this.field_46837, var2, var3, var4, var5);
   }
}
