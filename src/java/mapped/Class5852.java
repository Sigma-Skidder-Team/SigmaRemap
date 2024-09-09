package mapped;

import com.mojang.datafixers.util.Pair;
import net.minecraft.util.ResourceLocation;

public class Class5852 extends Slot {
   private static String[] field25604;
   public final PlayerContainer field25605;

   public Class5852(PlayerContainer var1, IInventory var2, int var3, int var4, int var5) {
      super(var2, var3, var4, var5);
      this.field25605 = var1;
   }

   @Override
   public Pair<ResourceLocation, ResourceLocation> method18271() {
      return Pair.of(PlayerContainer.field25539, PlayerContainer.field25544);
   }
}
