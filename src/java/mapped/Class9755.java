package mapped;

import net.minecraft.world.Difficulty;

import javax.annotation.concurrent.Immutable;

@Immutable
public class Class9755 {
   private static String[] field45532;
   private final Difficulty field45533;
   private final float field45534;

   public Class9755(Difficulty var1, long var2, long var4, float var6) {
      this.field45533 = var1;
      this.field45534 = this.method38331(var1, var2, var4, var6);
   }

   public Difficulty method38327() {
      return this.field45533;
   }

   public float method38328() {
      return this.field45534;
   }

   public boolean method38329(float var1) {
      return this.field45534 > var1;
   }

   public float method38330() {
      if (!(this.field45534 < 2.0F)) {
         return !(this.field45534 > 4.0F) ? (this.field45534 - 2.0F) / 2.0F : 1.0F;
      } else {
         return 0.0F;
      }
   }

   private float method38331(Difficulty var1, long var2, long var4, float var6) {
      if (var1 != Difficulty.field14351) {
         boolean var9 = var1 == Difficulty.field14354;
         float var10 = 0.75F;
         float var11 = MathHelper.clamp(((float)var2 + -72000.0F) / 1440000.0F, 0.0F, 1.0F) * 0.25F;
         var10 += var11;
         float var12 = 0.0F;
         var12 += MathHelper.clamp((float)var4 / 3600000.0F, 0.0F, 1.0F) * (!var9 ? 0.75F : 1.0F);
         var12 += MathHelper.clamp(var6 * 0.25F, 0.0F, var11);
         if (var1 == Difficulty.field14352) {
            var12 *= 0.5F;
         }

         var10 += var12;
         return (float)var1.getId() * var10;
      } else {
         return 0.0F;
      }
   }
}
