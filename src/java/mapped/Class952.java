package mapped;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.ChestContainer;
import net.minecraft.inventory.container.Container;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

import javax.annotation.Nullable;

public class Class952 implements Class949 {
   public final ChestTileEntity field5349;
   public final ChestTileEntity field5350;
   public final IInventory field5351;
   public final Class6142 field5352;

   public Class952(Class6142 var1, ChestTileEntity var2, ChestTileEntity var3, IInventory var4) {
      this.field5352 = var1;
      this.field5349 = var2;
      this.field5350 = var3;
      this.field5351 = var4;
   }

   @Nullable
   @Override
   public Container method3627(int var1, PlayerInventory var2, PlayerEntity var3) {
      if (this.field5349.method3696(var3) && this.field5350.method3696(var3)) {
         this.field5349.method3743(var2.field5444);
         this.field5350.method3743(var2.field5444);
         return ChestContainer.method18163(var1, var2, this.field5351);
      } else {
         return null;
      }
   }

   @Override
   public ITextComponent getDefaultName2() {
      if (!this.field5349.method3381()) {
         return (ITextComponent)(!this.field5350.method3381() ? new TranslationTextComponent("container.chestDouble") : this.field5350.getDisplayName());
      } else {
         return this.field5349.getDisplayName();
      }
   }
}
