package net.minecraft.entity.projectile;

public enum AbstractArrowEntityPickupStatus {
   DISALLOWED,
   ALLOWED,
   field14333;

   private static final AbstractArrowEntityPickupStatus[] field14334 = new AbstractArrowEntityPickupStatus[]{DISALLOWED, ALLOWED, field14333};

   public static AbstractArrowEntityPickupStatus method8902(int var0) {
      if (var0 < 0 || var0 > values().length) {
         var0 = 0;
      }

      return values()[var0];
   }
}
