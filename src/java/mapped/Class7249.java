package mapped;

import com.mentalfrostbyte.jello.Client;
import net.minecraft.client.Minecraft;

import java.util.List;
import java.util.UUID;

public abstract class Class7249 implements Class7251 {
   public static final Minecraft field31119 = Minecraft.getInstance();
   private boolean field31120 = true;
   public String field31121;
   public String field31122;
   public Class2124 field31123;

   public Class7249(String var1, String var2, Class2124 var3) {
      this.field31121 = var1;
      this.field31122 = var2;
      this.field31123 = var3;
      Client.getInstance().getEventManager().register(this);
   }

   public String method22759() {
      return this.field31121;
   }

   public String method22760() {
      return this.field31122;
   }

   public void method22761() {
   }

   public void method22762() {
   }

   public void method22763(boolean var1) {
      this.field31120 = var1;
      if (!var1) {
         this.method22762();
      } else {
         this.method22761();
      }
   }

   public boolean method22764() {
      return this.field31120;
   }

   public List<AbstractClientPlayerEntity> method22765() {
      return field31119.world.method6870();
   }

   public List<AbstractClientPlayerEntity> method22766() {
      return field31119.world.method6870();
   }

   public PlayerEntity method22767(String var1) {
      for (PlayerEntity var5 : this.method22766()) {
         if (var5.getName().equals(var1)) {
            return var5;
         }
      }

      return null;
   }

   public PlayerEntity method22768(UUID var1) {
      for (PlayerEntity var5 : this.method22766()) {
         if (var5.getUniqueID().equals(var1)) {
            return var5;
         }
      }

      return null;
   }
}
