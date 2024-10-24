package mapped;

import net.minecraft.client.audio.Sound;

import java.util.List;
import javax.annotation.Nullable;

public class Class9304 {
   private static String[] field43194;
   private final List<Sound> field43195;
   private final boolean field43196;
   private final String field43197;

   public Class9304(List<Sound> var1, boolean var2, String var3) {
      this.field43195 = var1;
      this.field43196 = var2;
      this.field43197 = var3;
   }

   public List<Sound> method35113() {
      return this.field43195;
   }

   public boolean method35114() {
      return this.field43196;
   }

   @Nullable
   public String method35115() {
      return this.field43197;
   }
}
