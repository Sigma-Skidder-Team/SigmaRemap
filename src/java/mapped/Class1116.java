package mapped;

import com.mojang.authlib.GameProfile;
import net.minecraft.util.text.ITextComponent;

import java.util.UUID;

public class Class1116 extends AbstractClientPlayerEntity {
   public Class1116(Class1656 var1, GameProfile var2) {
      super(var1, var2);
      this.field5051 = 1.0F;
      this.field5052 = true;
   }

   @Override
   public boolean method3291(double var1) {
      double var5 = this.method3389().method19675() * 10.0;
      if (Double.isNaN(var5)) {
         var5 = 1.0;
      }

      var5 = var5 * 64.0 * method3377();
      return var1 < var5 * var5;
   }

   @Override
   public boolean method2741(Class8654 var1, float var2) {
      return true;
   }

   @Override
   public void tick() {
      super.tick();
      this.method3108(this, false);
   }

   @Override
   public void method2871() {
      if (this.field4985 > 0) {
         double var4 = this.getPosX() + (this.field4986 - this.getPosX()) / (double)this.field4985;
         double var6 = this.getPosY() + (this.field4987 - this.getPosY()) / (double)this.field4985;
         double var8 = this.getPosZ() + (this.field4988 - this.getPosZ()) / (double)this.field4985;
         this.field5031 = (float)((double)this.field5031 + MathHelper.method37793(this.field4989 - (double)this.field5031) / (double)this.field4985);
         this.field5032 = (float)((double)this.field5032 + (this.field4990 - (double)this.field5032) / (double)this.field4985);
         this.field4985--;
         this.method3215(var4, var6, var8);
         this.method3214(this.field5031, this.field5032);
      }

      if (this.field4992 > 0) {
         this.field4967 = (float)((double)this.field4967 + MathHelper.method37793(this.field4991 - (double)this.field4967) / (double)this.field4992);
         this.field4992--;
      }

      this.field4908 = this.field4909;
      this.method3084();
      float var3;
      if (this.field5036 && !this.method3044()) {
         var3 = Math.min(0.1F, MathHelper.method37766(method3234(this.method3433())));
      } else {
         var3 = 0.0F;
      }

      if (!this.field5036 && !this.method3044()) {
         float var11 = (float)Math.atan(-this.method3433().field18049 * 0.2F) * 15.0F;
      } else {
         float var10 = 0.0F;
      }

      this.field4909 = this.field4909 + (var3 - this.field4909) * 0.4F;
      this.field5024.method6820().method22503("push");
      this.method3126();
      this.field5024.method6820().method22505();
   }

   @Override
   public void method2857() {
   }

   @Override
   public void method1328(ITextComponent var1, UUID var2) {
      Minecraft var5 = Minecraft.getInstance();
      if (!var5.method1511(var2)) {
         var5.field1298.method5989().method5930(var1);
      }
   }
}
