package mapped;

import net.minecraft.util.Rotation;

public enum Class2089 {
   field13614(Class178.field565),
   field13615(Class178.field592),
   field13616(Class178.field590);

   private final Class178 field13617;
   private static final Class2089[] field13618 = new Class2089[]{field13614, field13615, field13616};

   private Class2089(Class178 var3) {
      this.field13617 = var3;
   }

   public int method8748(int var1, int var2) {
      int var5 = var2 / 2;
      int var6 = var1 > var5 ? var1 - var2 : var1;
      switch (Class8449.field36255[this.ordinal()]) {
         case 1:
            return (var2 - var6) % var2;
         case 2:
            return (var5 - var6 + var2) % var2;
         default:
            return var1;
      }
   }

   public Rotation method8749(net.minecraft.util.Direction var1) {
      Direction var4 = var1.getAxis();
      return this == field13615 && var4 == Direction.Z || this == field13616 && var4 == Direction.X ? Rotation.field187 : Rotation.field185;
   }

   public net.minecraft.util.Direction method8750(net.minecraft.util.Direction var1) {
      if (this == field13616 && var1.getAxis() == Direction.X) {
         return var1.method536();
      } else {
         return this == field13615 && var1.getAxis() == Direction.Z ? var1.method536() : var1;
      }
   }

   public Class178 method8751() {
      return this.field13617;
   }
}
