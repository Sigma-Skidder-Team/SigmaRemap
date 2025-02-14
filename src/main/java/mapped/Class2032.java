package mapped;

import net.minecraft.util.Direction;

public enum Class2032 {
   field13190(Direction.UP, 0, -1),
   field13191(Direction.DOWN, 0, 1),
   field13192(Direction.EAST, -1, 0),
   field13193(Direction.WEST, 1, 0);

   private final Direction field13194;
   private final int field13195;
   private final int field13196;
   private static final Class2032[] field13197 = new Class2032[]{field13190, field13191, field13192, field13193};

   private Class2032(Direction var3, int var4, int var5) {
      this.field13194 = var3;
      this.field13195 = var4;
      this.field13196 = var5;
   }

   public Direction method8667() {
      return this.field13194;
   }

   public int method8668() {
      return this.field13195;
   }

   public int method8669() {
      return this.field13196;
   }

   private boolean method8670() {
      return this == field13191 || this == field13190;
   }

   // $VF: synthetic method
   public static boolean method8671(Class2032 var0) {
      return var0.method8670();
   }
}
