package mapped;

import net.minecraft.util.ResourceLocation;

import java.util.List;
import java.util.function.Function;

public class Class7611<T> implements Class7610<T> {
   private ITag<T> field32656;
   public final ResourceLocation field32657;

   public Class7611(ResourceLocation var1) {
      this.field32657 = var1;
   }

   @Override
   public ResourceLocation getName() {
      return this.field32657;
   }

   private ITag<T> method24930() {
      if (this.field32656 != null) {
         return this.field32656;
      } else {
         throw new IllegalStateException("Tag " + this.field32657 + " used before it was bound");
      }
   }

   public void method24931(Function<ResourceLocation, ITag<T>> var1) {
      this.field32656 = (ITag<T>)var1.apply(this.field32657);
   }

   @Override
   public boolean method24917(T var1) {
      return this.field32656 != null ? this.method24930().method24917((T)var1) : false;
   }

   @Override
   public List<T> method24918() {
      return this.method24930().method24918();
   }
}
