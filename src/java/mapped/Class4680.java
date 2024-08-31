package mapped;

import java.util.List;
import java.util.function.Function;

import net.minecraft.resources.ResourcePackInfo;
import net.minecraft.util.text.ITextComponent;

public abstract class Class4680 implements Class4681 {
   private final ResourcePackInfo field22255;
   public final Class8719 field22256;

   public Class4680(Class8719 var1, ResourcePackInfo var2) {
      this.field22256 = var1;
      this.field22255 = var2;
   }

   public abstract List<ResourcePackInfo> method14672();

   public abstract List<ResourcePackInfo> method14673();

   @Override
   public ResourceLocation method14677() {
      return (ResourceLocation)Class8719.method31454(this.field22256).apply(this.field22255);
   }

   @Override
   public Class2064 method14678() {
      return this.field22255.getCompatibility();
   }

   @Override
   public ITextComponent method14679() {
      return this.field22255.method7946();
   }

   @Override
   public ITextComponent method14680() {
      return this.field22255.method7947();
   }

   @Override
   public IPackNameDecorator method14681() {
      return this.field22255.method7955();
   }

   @Override
   public boolean method14682() {
      return this.field22255.isOrderLocked();
   }

   @Override
   public boolean method14683() {
      return this.field22255.isAlwaysEnabled();
   }

   public void method14684() {
      this.method14672().remove(this.field22255);
      this.field22255.method7954().method8249(this.method14673(), this.field22255, Function.<ResourcePackInfo>identity(), true);
      Class8719.method31455(this.field22256).run();
   }

   public void method14685(int var1) {
      List var4 = this.method14672();
      int var5 = var4.indexOf(this.field22255);
      var4.remove(var5);
      var4.add(var5 + var1, this.field22255);
      Class8719.method31455(this.field22256).run();
   }

   @Override
   public boolean method14686() {
      List var3 = this.method14672();
      int var4 = var3.indexOf(this.field22255);
      return var4 > 0 && !((ResourcePackInfo)var3.get(var4 - 1)).isOrderLocked();
   }

   @Override
   public void method14687() {
      this.method14685(-1);
   }

   @Override
   public boolean method14688() {
      List var3 = this.method14672();
      int var4 = var3.indexOf(this.field22255);
      return var4 >= 0 && var4 < var3.size() - 1 && !((ResourcePackInfo)var3.get(var4 + 1)).isOrderLocked();
   }

   @Override
   public void method14689() {
      this.method14685(1);
   }
}
