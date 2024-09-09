package mapped;

import com.google.common.base.MoreObjects;
import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.ITextComponent$Serializer;

public class Class8790 {
   private final int field39527;
   private final GameType field39528;
   private final GameProfile field39529;
   public ITextComponent field39530;

   public Class8790(GameProfile var1, int var2, GameType var3, ITextComponent var4) {
      this.field39529 = var1;
      this.field39527 = var2;
      this.field39528 = var3;
      this.field39530 = var4;
   }

   public GameProfile method31726() {
      return this.field39529;
   }

   public int method31727() {
      return this.field39527;
   }

   public GameType method31728() {
      return this.field39528;
   }

   @Nullable
   public ITextComponent method31729() {
      return this.field39530;
   }

   @Override
   public String toString() {
      return MoreObjects.toStringHelper(this)
         .add("latency", this.field39527)
         .add("gameMode", this.field39528)
         .add("profile", this.field39529)
         .add("displayName", this.field39530 != null ? ITextComponent$Serializer.toJson(this.field39530) : null)
         .toString();
   }
}
