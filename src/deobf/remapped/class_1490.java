package remapped;

import com.mojang.authlib.GameProfile;
import java.io.IOException;
import java.util.UUID;

public class class_1490 implements class_6310<class_8886> {
   private static String[] field_7941;
   private GameProfile field_7942;

   public class_1490() {
   }

   public class_1490(GameProfile var1) {
      this.field_7942 = var1;
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      int[] var4 = new int[4];

      for (int var5 = 0; var5 < var4.length; var5++) {
         var4[var5] = var1.readInt();
      }

      UUID var7 = class_5753.method_26038(var4);
      String var6 = var1.method_37784(16);
      this.field_7942 = new GameProfile(var7, var6);
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      for (int var7 : class_5753.method_26037(this.field_7942.getId())) {
         var1.writeInt(var7);
      }

      var1.method_37760(this.field_7942.getName());
   }

   public void method_6885(class_8886 var1) {
      var1.method_40901(this);
   }

   public GameProfile method_6883() {
      return this.field_7942;
   }
}
