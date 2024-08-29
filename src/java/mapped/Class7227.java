package mapped;

import com.google.common.collect.Lists;
import java.util.List;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.AbstractGui;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class7227 implements Class7226, Class7222 {
   private static final ITextComponent field31064 = new TranslationTextComponent("spectatorMenu.team_teleport");
   private static final ITextComponent field31065 = new TranslationTextComponent("spectatorMenu.team_teleport.prompt");
   private final List<Class7222> field31066 = Lists.newArrayList();

   public Class7227() {
      Minecraft var3 = Minecraft.getInstance();

      for (Class8218 var5 : var3.world.method6805().method20997()) {
         this.field31066.add(new Class7224(this, var5));
      }
   }

   @Override
   public List<Class7222> method22701() {
      return this.field31066;
   }

   @Override
   public ITextComponent method22702() {
      return field31065;
   }

   @Override
   public void method22697(Class8036 var1) {
      var1.method27574(this);
   }

   @Override
   public ITextComponent method22698() {
      return field31064;
   }

   @Override
   public void method22699(MatrixStack var1, float var2, int var3) {
      Minecraft.getInstance().getTextureManager().bindTexture(Class1195.field6470);
      AbstractGui.method5699(var1, 0, 0, 16.0F, 0.0F, 16, 16, 256, 256);
   }

   @Override
   public boolean method22700() {
      for (Class7222 var4 : this.field31066) {
         if (var4.method22700()) {
            return true;
         }
      }

      return false;
   }
}
