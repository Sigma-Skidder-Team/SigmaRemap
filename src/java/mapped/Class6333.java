package mapped;

import net.minecraft.client.audio.ITickableSound;
import net.minecraft.client.audio.LocatableSound;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;

public abstract class Class6333 extends LocatableSound implements ITickableSound {
   private boolean field27845;

   public Class6333(SoundEvent var1, SoundCategory var2) {
      super(var1, var2);
   }

   @Override
   public boolean method19270() {
      return this.field27845;
   }

   public final void method19271() {
      this.field27845 = true;
      this.repeat = false;
   }
}
