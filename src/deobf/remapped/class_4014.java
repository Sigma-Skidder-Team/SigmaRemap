package remapped;

import com.mojang.authlib.GameProfile;
import java.io.IOException;
import java.util.UUID;

public class class_4014 implements Packet<class_7515> {
   private static String[] field_19489;
   private GameProfile field_19490;

   public class_4014() {
   }

   public class_4014(GameProfile var1) {
      this.field_19490 = var1;
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_19490 = new GameProfile((UUID)null, var1.method_37784(16));
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37760(this.field_19490.getName());
   }

   public void method_18496(class_7515 var1) {
      var1.method_34255(this);
   }

   public GameProfile method_18495() {
      return this.field_19490;
   }
}
