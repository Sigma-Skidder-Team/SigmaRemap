package net.minecraft.world;

public enum LightType {
   SKY(15),
   BLOCK(0);

   public final int field12883;
   private static final LightType[] field12884 = new LightType[]{SKY, BLOCK};

   private LightType(int var3) {
      this.field12883 = var3;
   }
}
