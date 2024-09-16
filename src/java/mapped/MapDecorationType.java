package mapped;

import net.minecraft.util.math.MathHelper;

public enum MapDecorationType {
   field14516(false),
   field14517(true),
   field14518(false),
   field14519(false),
   field14520(true),
   field14521(true),
   field14522(false),
   field14523(false),
   field14524(true, 5393476),
   field14525(true, 3830373),
   field14526(true),
   field14527(true),
   field14528(true),
   field14529(true),
   field14530(true),
   field14531(true),
   field14532(true),
   field14533(true),
   field14534(true),
   field14535(true),
   field14536(true),
   field14537(true),
   field14538(true),
   field14539(true),
   field14540(true),
   field14541(true),
   field14542(true);

   private final byte field14543 = (byte)this.ordinal();
   private final boolean field14544;
   private final int field14545;
   private static final MapDecorationType[] field14546 = new MapDecorationType[]{
      field14516,
      field14517,
      field14518,
      field14519,
      field14520,
      field14521,
      field14522,
      field14523,
      field14524,
      field14525,
      field14526,
      field14527,
      field14528,
      field14529,
      field14530,
      field14531,
      field14532,
      field14533,
      field14534,
      field14535,
      field14536,
      field14537,
      field14538,
      field14539,
      field14540,
      field14541,
      field14542
   };

   private MapDecorationType(boolean var3) {
      this(var3, -1);
   }

   private MapDecorationType(boolean var3, int var4) {
      this.field14544 = var3;
      this.field14545 = var4;
   }

   public byte method8953() {
      return this.field14543;
   }

   public boolean method8954() {
      return this.field14544;
   }

   public boolean method8955() {
      return this.field14545 >= 0;
   }

   public int method8956() {
      return this.field14545;
   }

   public static MapDecorationType method8957(byte var0) {
      return values()[MathHelper.method37775(var0, 0, values().length - 1)];
   }
}
