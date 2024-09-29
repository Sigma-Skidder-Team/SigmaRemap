package mapped;

import net.minecraft.util.math.MathHelper;

public enum MapDecorationType {
   PLAYER(false),
   FRAME(true),
   RED_MARKER(false),
   BLUE_MARKER(false),
   TARGET_X(true),
   TARGET_POINT(true),
   PLAYER_OFF_MAP(false),
   PLAYER_OFF_LIMITS(false),
   MANSION(true, 5393476),
   MONUMENT(true, 3830373),
   BANNER_WHITE(true),
   BANNER_ORANGE(true),
   BANNER_MAGENTA(true),
   BANNER_LIGHT_BLUE(true),
   BANNER_YELLOW(true),
   BANNER_LIME(true),
   BANNER_PINK(true),
   BANNER_GRAY(true),
   BANNER_LIGHT_GRAY(true),
   BANNER_CYAN(true),
   BANNER_PURPLE(true),
   BANNER_BLUE(true),
   BANNER_BROWN(true),
   BANNER_GREEN(true),
   BANNER_RED(true),
   BANNER_BLACK(true),
   RED_X(true);

   private final byte icon = (byte)this.ordinal();
   private final boolean renderedOnFrame;
   private final int mapColor;

   private MapDecorationType(boolean renderedOnFrame) {
      this(renderedOnFrame, -1);
   }

   private MapDecorationType(boolean renderedOnFrame, int mapColor) {
      this.renderedOnFrame = renderedOnFrame;
      this.mapColor = mapColor;
   }

   public byte getIcon() {
      return this.icon;
   }

   public boolean isRenderedOnFrame() {
      return this.renderedOnFrame;
   }

   public boolean hasMapColor() {
      return this.mapColor >= 0;
   }

   public int getMapColor() {
      return this.mapColor;
   }

   public static MapDecorationType byIcon(byte var0) {
      return values()[MathHelper.clamp(var0, 0, values().length - 1)];
   }
}
