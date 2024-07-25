package remapped;

import com.google.common.base.MoreObjects;
import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.ITextComponent$class_40;

public class class_5902 {
   private final int field_29959;
   private final GameType field_29958;
   private final GameProfile field_29957;
   public ITextComponent field_29961;

   public class_5902(GameProfile var1, int var2, GameType var3, ITextComponent var4) {
      this.field_29957 = var1;
      this.field_29959 = var2;
      this.field_29958 = var3;
      this.field_29961 = var4;
   }

   public GameProfile method_27005() {
      return this.field_29957;
   }

   public int method_27002() {
      return this.field_29959;
   }

   public GameType method_27003() {
      return this.field_29958;
   }

   @Nullable
   public ITextComponent method_27001() {
      return this.field_29961;
   }

   @Override
   public String toString() {
      return MoreObjects.toStringHelper(this)
         .add("latency", this.field_29959)
         .add("gameMode", this.field_29958)
         .add("profile", this.field_29957)
         .add("displayName", this.field_29961 != null ? ITextComponent$class_40.toJson(this.field_29961) : null)
         .toString();
   }
}
