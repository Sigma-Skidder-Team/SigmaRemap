package mapped;

import com.google.common.collect.ImmutableSet;

import java.util.Set;

public abstract class Class4213 extends Class4178 {
   public static final Class7380 field20528 = Blocks.field36767.method11579();
   public static final Class7380 field20529 = Blocks.field36768.method11579();
   public static final Class7380 field20530 = Blocks.field36769.method11579();
   public static final Class7380 field20531 = field20529;
   public static final Class7380 field20532 = Blocks.field36776.method11579();
   public static final Class7380 field20533 = Blocks.WATER.method11579();
   public static final Set<Block> field20534 = ImmutableSet.<Block>builder()
      .add(Blocks.ICE)
      .add(Blocks.PACKED_ICE)
      .add(Blocks.field37006)
      .add(field20533.method23383())
      .build();
   public static final int field20535 = method13004(2, 0, 0);
   public static final int field20536 = method13004(2, 2, 0);
   public static final int field20537 = method13004(0, 1, 0);
   public static final int field20538 = method13004(4, 1, 0);
   public Class9312 field20539;

   public static final int method13004(int var0, int var1, int var2) {
      return var1 * 25 + var2 * 5 + var0;
   }

   public Class4213(Class7792 var1, int var2) {
      super(var1, var2);
   }

   public Class4213(Class7792 var1, Direction var2, Class9764 var3) {
      super(var1, 1);
      this.method12939(var2);
      this.field20444 = var3;
   }

   public Class4213(Class7792 var1, int var2, Direction var3, Class9312 var4, int var5, int var6, int var7) {
      super(var1, var2);
      this.method12939(var3);
      this.field20539 = var4;
      int var10 = Class9312.method35192(var4);
      int var11 = var10 % 5;
      int var12 = var10 / 5 % 5;
      int var13 = var10 / 25;
      if (var3 != Direction.NORTH && var3 != Direction.SOUTH) {
         this.field20444 = new Class9764(0, 0, 0, var7 * 8 - 1, var6 * 4 - 1, var5 * 8 - 1);
      } else {
         this.field20444 = new Class9764(0, 0, 0, var5 * 8 - 1, var6 * 4 - 1, var7 * 8 - 1);
      }

      switch (Class9033.field41332[var3.ordinal()]) {
         case 1:
            this.field20444.method38393(var11 * 8, var13 * 4, -(var12 + var7) * 8 + 1);
            break;
         case 2:
            this.field20444.method38393(var11 * 8, var13 * 4, var12 * 8);
            break;
         case 3:
            this.field20444.method38393(-(var12 + var7) * 8 + 1, var13 * 4, var11 * 8);
            break;
         default:
            this.field20444.method38393(var12 * 8, var13 * 4, var11 * 8);
      }
   }

   public Class4213(Class7792 var1, Class39 var2) {
      super(var1, var2);
   }

   @Override
   public void method12897(Class39 var1) {
   }

   public void method13005(Class1658 var1, Class9764 var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      for (int var11 = var4; var11 <= var7; var11++) {
         for (int var12 = var3; var12 <= var6; var12++) {
            for (int var13 = var5; var13 <= var8; var13++) {
               Class7380 var14 = this.method12924(var1, var12, var11, var13, var2);
               if (!field20534.contains(var14.method23383())) {
                  if (this.method12921(var11) >= var1.method6776() && var14 != field20533) {
                     this.method12923(var1, Blocks.AIR.method11579(), var12, var11, var13, var2);
                  } else {
                     this.method12923(var1, field20533, var12, var11, var13, var2);
                  }
               }
            }
         }
      }
   }

   public void method13006(Class1658 var1, Class9764 var2, int var3, int var4, boolean var5) {
      if (!var5) {
         this.method12927(var1, var2, var3 + 0, 0, var4 + 0, var3 + 8 - 1, 0, var4 + 8 - 1, field20528, field20528, false);
      } else {
         this.method12927(var1, var2, var3 + 0, 0, var4 + 0, var3 + 2, 0, var4 + 8 - 1, field20528, field20528, false);
         this.method12927(var1, var2, var3 + 5, 0, var4 + 0, var3 + 8 - 1, 0, var4 + 8 - 1, field20528, field20528, false);
         this.method12927(var1, var2, var3 + 3, 0, var4 + 0, var3 + 4, 0, var4 + 2, field20528, field20528, false);
         this.method12927(var1, var2, var3 + 3, 0, var4 + 5, var3 + 4, 0, var4 + 8 - 1, field20528, field20528, false);
         this.method12927(var1, var2, var3 + 3, 0, var4 + 2, var3 + 4, 0, var4 + 2, field20529, field20529, false);
         this.method12927(var1, var2, var3 + 3, 0, var4 + 5, var3 + 4, 0, var4 + 5, field20529, field20529, false);
         this.method12927(var1, var2, var3 + 2, 0, var4 + 3, var3 + 2, 0, var4 + 4, field20529, field20529, false);
         this.method12927(var1, var2, var3 + 5, 0, var4 + 3, var3 + 5, 0, var4 + 4, field20529, field20529, false);
      }
   }

   public void method13007(Class1658 var1, Class9764 var2, int var3, int var4, int var5, int var6, int var7, int var8, Class7380 var9) {
      for (int var12 = var4; var12 <= var7; var12++) {
         for (int var13 = var3; var13 <= var6; var13++) {
            for (int var14 = var5; var14 <= var8; var14++) {
               if (this.method12924(var1, var13, var12, var14, var2) == field20533) {
                  this.method12923(var1, var9, var13, var12, var14, var2);
               }
            }
         }
      }
   }

   public boolean method13008(Class9764 var1, int var2, int var3, int var4, int var5) {
      int var8 = this.method12920(var2, var3);
      int var9 = this.method12922(var2, var3);
      int var10 = this.method12920(var4, var5);
      int var11 = this.method12922(var4, var5);
      return var1.method38391(Math.min(var8, var10), Math.min(var9, var11), Math.max(var8, var10), Math.max(var9, var11));
   }

   public boolean method13009(Class1658 var1, Class9764 var2, int var3, int var4, int var5) {
      int var8 = this.method12920(var3, var5);
      int var9 = this.method12921(var4);
      int var10 = this.method12922(var3, var5);
      if (!var2.method38396(new BlockPos(var8, var9, var10))) {
         return false;
      } else {
         Class1106 var11 = Class8992.field41022.method33215(var1.method6970());
         var11.method3041(var11.method3075());
         var11.method3273((double)var8 + 0.5, (double)var9, (double)var10 + 0.5, 0.0F, 0.0F);
         var11.method4276(var1, var1.method6807(var11.method3432()), Class2202.field14394, (Class5093)null, (Class39)null);
         var1.method6995(var11);
         return true;
      }
   }
}
