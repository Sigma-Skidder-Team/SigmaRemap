package mapped;

import net.minecraft.world.GameRules;

import java.util.List;

public class Class7568 implements Class7567 {
   public final List field32500;
   public final GameRules field32501;
   public final MinecraftServer field32502;

   public Class7568(MinecraftServer var1, List var2, GameRules var3) {
      this.field32502 = var1;
      this.field32500 = var2;
      this.field32501 = var3;
   }

   @Override
   public <T extends Class7465<T>> void method24776(Class9221<T> var1, Class7989<T> var2) {
      this.field32500.add(String.format("%s=%s\n", var1.method34672(), this.field32501.get(var1).toString()));
   }
}
