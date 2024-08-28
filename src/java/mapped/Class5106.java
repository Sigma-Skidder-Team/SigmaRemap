package mapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class5106 implements Class5105 {
   private static final ITextComponent field23205 = new StringTextComponent("Ignoring status request");
   private final MinecraftServer field23206;
   private final NetworkManager field23207;

   public Class5106(MinecraftServer var1, NetworkManager var2) {
      this.field23206 = var1;
      this.field23207 = var2;
   }

   @Override
   public void method15595(Class5575 var1) {
      switch (Class9334.field43314[var1.method17508().ordinal()]) {
         case 1:
            this.field23207.method30690(Class1858.field9904);
            if (var1.method17509() != SharedConstants.method34773().getProtocolVersion()) {
               TranslationTextComponent var4;
               if (var1.method17509() < 754) {
                  var4 = new TranslationTextComponent("multiplayer.disconnect.outdated_client", SharedConstants.method34773().getName());
               } else {
                  var4 = new TranslationTextComponent("multiplayer.disconnect.incompatible", SharedConstants.method34773().getName());
               }

               this.field23207.method30693(new Class5490(var4));
               this.field23207.method30701(var4);
            } else {
               this.field23207.method30692(new Class5109(this.field23206, this.field23207));
            }
            break;
         case 2:
            if (this.field23206.method1381()) {
               this.field23207.method30690(Class1858.field9903);
               this.field23207.method30692(new Class5115(this.field23206, this.field23207));
            } else {
               this.field23207.method30701(field23205);
            }
            break;
         default:
            throw new UnsupportedOperationException("Invalid intention " + var1.method17508());
      }
   }

   @Override
   public void method15588(ITextComponent var1) {
   }

   @Override
   public NetworkManager method15589() {
      return this.field23207;
   }
}
