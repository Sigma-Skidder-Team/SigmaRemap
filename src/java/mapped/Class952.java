package mapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

import javax.annotation.Nullable;

public class Class952 implements Class949 {
   public final Class941 field5349;
   public final Class941 field5350;
   public final Class920 field5351;
   public final Class6142 field5352;

   public Class952(Class6142 var1, Class941 var2, Class941 var3, Class920 var4) {
      this.field5352 = var1;
      this.field5349 = var2;
      this.field5350 = var3;
      this.field5351 = var4;
   }

   @Nullable
   @Override
   public Class5812 method3627(int var1, Class974 var2, PlayerEntity var3) {
      if (this.field5349.method3696(var3) && this.field5350.method3696(var3)) {
         this.field5349.method3743(var2.field5444);
         this.field5350.method3743(var2.field5444);
         return Class5813.method18163(var1, var2, this.field5351);
      } else {
         return null;
      }
   }

   @Override
   public ITextComponent method2954() {
      if (!this.field5349.method3381()) {
         return (ITextComponent)(!this.field5350.method3381() ? new TranslationTextComponent("container.chestDouble") : this.field5350.method2954());
      } else {
         return this.field5349.method2954();
      }
   }
}
