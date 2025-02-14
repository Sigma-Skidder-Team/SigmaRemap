package mapped;

import java.util.Optional;

import net.minecraft.network.PacketBuffer;
import net.minecraft.util.text.ITextComponent;

public final class Class6484 implements Class6466<Optional<ITextComponent>> {
   private static String[] field28431;

   public void method19646(PacketBuffer var1, Optional<ITextComponent> var2) {
      if (!var2.isPresent()) {
         var1.writeBoolean(false);
      } else {
         var1.writeBoolean(true);
         var1.writeTextComponent((ITextComponent)var2.get());
      }
   }

   public Optional<ITextComponent> method19645(PacketBuffer var1) {
      return !var1.readBoolean() ? Optional.<ITextComponent>empty() : Optional.<ITextComponent>of(var1.readTextComponent());
   }

   public Optional<ITextComponent> method19644(Optional<ITextComponent> var1) {
      return var1;
   }
}
