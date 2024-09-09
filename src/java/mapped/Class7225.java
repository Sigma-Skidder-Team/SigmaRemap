package mapped;

import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;
import java.util.Collection;
import java.util.List;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.AbstractGui;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class7225 implements Class7226, Class7222 {
   private static final Ordering<Class6589> field31060 = Ordering.from(
      (var0, var1) -> ComparisonChain.start().compare(var0.method19966().getId(), var1.method19966().getId()).result()
   );
   private static final ITextComponent field31061 = new TranslationTextComponent("spectatorMenu.teleport");
   private static final ITextComponent field31062 = new TranslationTextComponent("spectatorMenu.teleport.prompt");
   private final List<Class7222> field31063 = Lists.newArrayList();

   public Class7225() {
      this(field31060.sortedCopy(Minecraft.getInstance().getConnection().method15790()));
   }

   public Class7225(Collection<Class6589> var1) {
      for (Class6589 var5 : field31060.sortedCopy(var1)) {
         if (var5.method19967() != GameType.SPECTATOR) {
            this.field31063.add(new Class7229(var5.method19966()));
         }
      }
   }

   @Override
   public List<Class7222> method22701() {
      return this.field31063;
   }

   @Override
   public ITextComponent method22702() {
      return field31062;
   }

   @Override
   public void method22697(Class8036 var1) {
      var1.method27574(this);
   }

   @Override
   public ITextComponent method22698() {
      return field31061;
   }

   @Override
   public void method22699(MatrixStack var1, float var2, int var3) {
      Minecraft.getInstance().getTextureManager().bindTexture(Class1195.field6470);
      AbstractGui.method5699(var1, 0, 0, 0.0F, 0.0F, 16, 16, 256, 256);
   }

   @Override
   public boolean method22700() {
      return !this.field31063.isEmpty();
   }
}
