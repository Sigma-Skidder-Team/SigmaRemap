package mapped;

import net.minecraft.client.audio.ISoundEventAccessor;
import net.minecraft.client.audio.Sound;
import net.minecraft.util.ResourceLocation;

public class Class6645 implements ISoundEventAccessor<Sound> {
   private static String[] field29207;
   public final ResourceLocation field29208;
   public final Sound field29209;
   public final Class8657 field29210;

   public Class6645(Class8657 var1, ResourceLocation var2, Sound var3) {
      this.field29210 = var1;
      this.field29208 = var2;
      this.field29209 = var3;
   }

   @Override
   public int method20287() {
      Class6648 var3 = (Class6648)Class8657.method31158(this.field29210).get(this.field29208);
      return var3 != null ? var3.method20287() : 0;
   }

   public Sound method20290() {
      Class6648 var3 = (Class6648)Class8657.method31158(this.field29210).get(this.field29208);
      if (var3 == null) {
         return SoundHandler.field1051;
      } else {
         Sound var4 = var3.method20290();
         return new Sound(
            var4.method20291().toString(),
            var4.method20293() * this.field29209.method20293(),
            var4.method20294() * this.field29209.method20294(),
            this.field29209.method20287(),
            Sound.Type.field14506,
            var4.method20296() || this.field29209.method20296(),
            var4.method20297(),
            var4.method20298()
         );
      }
   }

   @Override
   public void method20289(Class4386 var1) {
      Class6648 var4 = (Class6648)Class8657.method31158(this.field29210).get(this.field29208);
      if (var4 != null) {
         var4.method20289(var1);
      }
   }
}
