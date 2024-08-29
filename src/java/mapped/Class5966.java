package mapped;

import java.util.function.Function;
import net.minecraft.util.text.ITextComponent;

public class Class5966 {
   private static String[] field26005;
   public final Item field26006;
   public final ITextComponent field26007;
   public final Function<Registry<Biome>, Class9733> field26008;

   public Class5966(Item var1, ITextComponent var2, Function<Registry<Biome>, Class9733> var3) {
      this.field26006 = var1;
      this.field26007 = var2;
      this.field26008 = var3;
   }

   public ITextComponent method18492() {
      return this.field26007;
   }
}
