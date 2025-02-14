package mapped;

import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class972 extends Class971 {
   public Class972() {
      super(TileEntityType.field21427);
   }

   @Override
   public ITextComponent getDefaultName() {
      return new TranslationTextComponent("container.dropper");
   }
}
