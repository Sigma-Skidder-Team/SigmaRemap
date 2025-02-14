package mapped;

import java.util.OptionalInt;

public class ScreenSize {
   private static String[] field45779;
   public final int field45780;
   public final int field45781;
   public final OptionalInt fullscreenWidth;
   public final OptionalInt fullscreenHeight;
   public final boolean fullscreen;

   public ScreenSize(int var1, int var2, OptionalInt var3, OptionalInt var4, boolean var5) {
      this.field45780 = var1;
      this.field45781 = var2;
      this.fullscreenWidth = var3;
      this.fullscreenHeight = var4;
      this.fullscreen = var5;
   }
}
