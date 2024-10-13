package mapped;

import net.minecraft.util.math.MathHelper;

public class Class8093 extends Class8092 {
   private static String[] field34819;
   private final int field34820;

   public Class8093(MobEntity var1, int var2) {
      super(var1);
      this.field34820 = var2;
   }

   @Override
   public void method28037() {
      if (!this.field34815) {
         if (this.field34812.method4230().method21664()) {
            this.field34812.rotationPitch = this.method28049(this.field34812.rotationPitch, 0.0F, 5.0F);
         }

         this.field34812.rotationYawHead = this.method28049(this.field34812.rotationYawHead, this.field34812.renderYawOffset, this.field34813);
      } else {
         this.field34815 = false;
         this.field34812.rotationYawHead = this.method28049(this.field34812.rotationYawHead, this.method28048() + 20.0F, this.field34813);
         this.field34812.rotationPitch = this.method28049(this.field34812.rotationPitch, this.method28047() + 10.0F, this.field34814);
      }

      float var3 = MathHelper.wrapDegrees(this.field34812.rotationYawHead - this.field34812.renderYawOffset);
      if (!(var3 < (float)(-this.field34820))) {
         if (var3 > (float)this.field34820) {
            this.field34812.renderYawOffset += 4.0F;
         }
      } else {
         this.field34812.renderYawOffset -= 4.0F;
      }
   }
}
