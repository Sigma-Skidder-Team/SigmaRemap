package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.unmapped.Class4305;
import com.mentalfrostbyte.jello.unmapped.Class4307;

import java.util.Date;

public class Class4315 extends Class4307 {
   private static Minecraft field21033 = Minecraft.getInstance();
   private Texture field21034;
   public Date field21035;
   public Class4251 field21036;
   public boolean field21037 = false;
   public boolean field21038;
   public int field21039;
   public boolean field21040;
   public Class4276 field21041;
   private boolean field21042;
   private boolean field21043;

   public Class4315() {
      super("KeybindManager");
      this.field21035 = new Date();
      int var3 = Math.max(300, Math.min(850, Minecraft.getInstance().mainWindow.method8043() - 40));
      int var4 = Math.max(200, Math.min(550, Minecraft.getInstance().mainWindow.method8044() - 80));
      this.method13230(this.field21036 = new Class4251(this, "mapView", (this.field20897 - var3) / 2, (this.field20898 - var4) / 2, var3, var4));
      this.field21036.field20614.method13080((var2, var3x, var4x, var5) -> this.method13222(new Class774(this, this, var3x, var4x, var5)));
      this.field21036.field20614.method13082(var1 -> this.method13390());
      Class5628.method17739();
   }

   private void method13389(Class4276 var1) {
      var1.method13131((var1x, var2, var3, var4) -> {
         this.field21036.field20615.method13519(var2, var3, var4);
         Client.getInstance().getWaypointsManager().method29990(new Class8351(var2, var3.getX(), var3.getZ(), var4));
         this.method13390();
      });
   }

   private void method13390() {
      Class4315 var3 = this;

      for (Class4305 var5 : this.method13241()) {
         if (var5 instanceof Class4276) {
            Class4276 var6 = (Class4276)var5;
            this.method13222(new Class605(this, var3, var5));
         }
      }
   }

   @Override
   public void method13028(int var1, int var2) {
      super.method13028(var1, var2);
      this.method13300(false);
   }

   @Override
   public int method13313() {
      return 60;
   }

   @Override
   public void method13065(int var1) {
      super.method13065(var1);
      if (var1 == 256) {
         Class5628.method17742();
         field21033.displayGuiScreen(null);
      }
   }

   @Override
   public void method13027(float var1) {
      var1 = (float)Math.min(200L, new Date().getTime() - this.field21035.getTime()) / 200.0F;
      float var4 = Class9747.method38214(var1, 0.0F, 1.0F, 1.0F);
      this.method13279(0.8F + var4 * 0.2F, 0.8F + var4 * 0.2F);
      float var5 = 0.25F * var1;
      Class3192.method11426(
         (float)this.field20895,
         (float)this.field20896,
         (float)(this.field20895 + this.field20897),
         (float)(this.field20896 + this.field20898),
         Class5628.method17688(ClientColors.DEEP_TEAL.getColor, var5)
      );
      super.method13224();
      super.method13027(var1);
   }

   // $VF: synthetic method
   public static void method13394(Class4315 var0, Class4276 var1) {
      var0.method13389(var1);
   }
}
