package net.minecraft.realms.action;

import com.mojang.realmsclient.exception.RealmsServiceException;
import com.mojang.realmsclient.client.RealmsClient;
import mapped.Class789;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.util.text.TranslationTextComponent;

public class CreateWorldRealmsAction extends Class789 {
   private final String field4142;
   private final String field4143;
   private final long field4144;
   private final Screen field4145;

   public CreateWorldRealmsAction(long var1, String var3, String var4, Screen var5) {
      this.field4144 = var1;
      this.field4142 = var3;
      this.field4143 = var4;
      this.field4145 = var5;
   }

   @Override
   public void run() {
      this.method1908(new TranslationTextComponent("mco.create.world.wait"));
      RealmsClient var3 = RealmsClient.method14543();

      try {
         var3.method14551(this.field4144, this.field4142, this.field4143);
         method1905(this.field4145);
      } catch (RealmsServiceException var5) {
         field4133.error("Couldn't create world");
         this.method1918(var5.toString());
      } catch (Exception var6) {
         field4133.error("Could not create world");
         this.method1918(var6.getLocalizedMessage());
      }
   }
}
