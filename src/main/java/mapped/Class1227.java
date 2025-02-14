package mapped;

import net.minecraft.client.gui.screen.BiomeGeneratorTypeScreens;
import net.minecraft.client.gui.screen.WorldOptionsScreen;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;

import java.util.Objects;
import java.util.Optional;

public class Class1227 extends Button {
   public final WorldOptionsScreen field6576;

   public Class1227(WorldOptionsScreen var1, int var2, int var3, int var4, int var5, ITextComponent var6, IPressable var7) {
      super(var2, var3, var4, var5, var6, var7);
      this.field6576 = var1;
   }

   @Override
   public ITextComponent method5745() {
      return super.method5745()
         .deepCopy()
         .appendString(" ")
         .append(WorldOptionsScreen.method5803(this.field6576).map(BiomeGeneratorTypeScreens::method18505).orElse(WorldOptionsScreen.method5802()));
   }

   @Override
   public IFormattableTextComponent method5634() {
      return !Objects.equals(WorldOptionsScreen.method5803(this.field6576), Optional.<BiomeGeneratorTypeScreens>of(BiomeGeneratorTypeScreens.field26028))
         ? super.method5634()
         : super.method5634().appendString(". ").append(WorldOptionsScreen.method5804());
   }
}
