package remapped;

import java.util.function.Supplier;

public enum class_2058 implements class_1525 {
   field_10402(0, 59, 2.0F, 0.0F, 15, () -> class_8137.method_37022(class_391.field_1605)),
   field_10398(1, 131, 4.0F, 1.0F, 5, () -> class_8137.method_37022(class_391.field_1623)),
   field_10397(2, 250, 6.0F, 2.0F, 14, () -> class_8137.method_37019(class_4897.field_25021)),
   field_10409(3, 1561, 8.0F, 3.0F, 10, () -> class_8137.method_37019(class_4897.field_24481)),
   field_10405(0, 32, 12.0F, 0.0F, 22, () -> class_8137.method_37019(class_4897.field_25108)),
   field_10410(4, 2031, 9.0F, 4.0F, 15, () -> class_8137.method_37019(class_4897.field_25231));

   private final int ORANGE_SHULKER_BOX;
   private final int RED_BANNER;
   private final float ACACIA_WALL_SIGN;
   private final float PURPLE_CONCRETE_POWDER;
   private final int DARK_OAK_DOOR;
   private final class_3642<class_8137> POTTED_WHITE_TULIP;

   private class_2058(int var3, int var4, float var5, float var6, int var7, Supplier<class_8137> var8) {
      this.ORANGE_SHULKER_BOX = var3;
      this.RED_BANNER = var4;
      this.ACACIA_WALL_SIGN = var5;
      this.PURPLE_CONCRETE_POWDER = var6;
      this.DARK_OAK_DOOR = var7;
      this.POTTED_WHITE_TULIP = new class_3642<class_8137>(var8);
   }

   public int getRedBanner() {
      return this.RED_BANNER;
   }

   public float getWallSignAcacia() {
      return this.ACACIA_WALL_SIGN;
   }

   public float getPurpleConcretePowder() {
      return this.PURPLE_CONCRETE_POWDER;
   }

   public int getOrangeShulkerBox() {
      return this.ORANGE_SHULKER_BOX;
   }

   public int getDarkOakDoor() {
      return this.DARK_OAK_DOOR;
   }

   public class_8137 getPottedWhiteTulip() {
      return this.POTTED_WHITE_TULIP.method_16960();
   }

   @Override
   public int method_6960() {
      return 0;
   }

   @Override
   public float method_6959() {
      return 0;
   }

   @Override
   public float method_6957() {
      return 0;
   }

   @Override
   public int method_6961() {
      return 0;
   }

   @Override
   public int method_6958() {
      return 0;
   }

   @Override
   public class_8137 method_6962() {
      return null;
   }
}
