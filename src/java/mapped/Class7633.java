package mapped;

import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectOpenHashMap;
import java.util.EnumMap;
import java.util.Map;
import java.util.Map.Entry;

public abstract class Class7633 extends Class7631 {
   public static final Class8551 field32712 = Class8820.field39690;
   public static final Class8554 field32713 = Class8820.field39753;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<Class8570>> field32714 = ThreadLocal.<Object2ByteLinkedOpenHashMap<Class8570>>withInitial(
      () -> {
         Class2361 var2 = new Class2361(200);
         var2.defaultReturnValue((byte)127);
         return var2;
      }
   );
   private final Map<Class7379, Class6408> field32715 = Maps.newIdentityHashMap();

   @Override
   public void method25046(Class7558<Class7631, Class7379> var1) {
      var1.method24737(field32712);
   }

   @Override
   public Vector3d method25056(Class1665 var1, BlockPos var2, Class7379 var3) {
      double var6 = 0.0;
      double var8 = 0.0;
      Mutable var10 = new Mutable();

      for (Direction var12 : Class76.field161) {
         var10.method8377(var2, var12);
         Class7379 var13 = var1.method6739(var10);
         if (this.method25069(var13)) {
            float var14 = var13.method23476();
            float var15 = 0.0F;
            if (var14 != 0.0F) {
               if (var14 > 0.0F) {
                  var15 = var3.method23476() - var14;
               }
            } else if (!var1.method6738(var10).method23384().method31087()) {
               BlockPos var16 = var10.method8313();
               Class7379 var17 = var1.method6739(var16);
               if (this.method25069(var17)) {
                  var14 = var17.method23476();
                  if (var14 > 0.0F) {
                     var15 = var3.method23476() - (var14 - 0.8888889F);
                  }
               }
            }

            if (var15 != 0.0F) {
               var6 += (double)((float)var12.method539() * var15);
               var8 += (double)((float)var12.method541() * var15);
            }
         }
      }

      Vector3d var18 = new Vector3d(var6, 0.0, var8);
      if (var3.<Boolean>method23463(field32712)) {
         for (Direction var20 : Class76.field161) {
            var10.method8377(var2, var20);
            if (this.method25070(var1, var10, var20) || this.method25070(var1, var10.method8311(), var20)) {
               var18 = var18.method11333().method11339(0.0, -6.0, 0.0);
               break;
            }
         }
      }

      return var18.method11333();
   }

   private boolean method25069(Class7379 var1) {
      return var1.method23474() || var1.method23472().method25066(this);
   }

   public boolean method25070(Class1665 var1, BlockPos var2, Direction var3) {
      Class7380 var6 = var1.method6738(var2);
      Class7379 var7 = var1.method6739(var2);
      if (!var7.method23472().method25066(this)) {
         if (var3 != Direction.field673) {
            return var6.method23384() != Class8649.field38964 ? var6.method23454(var1, var2, var3) : false;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   public void method25071(Class1660 var1, BlockPos var2, Class7379 var3) {
      if (!var3.method23474()) {
         Class7380 var6 = var1.method6738(var2);
         BlockPos var7 = var2.method8313();
         Class7380 var8 = var1.method6738(var7);
         Class7379 var9 = this.method25073(var1, var7, var8);
         if (!this.method25091(var1, var2, var6, Direction.field672, var7, var8, var1.method6739(var7), var9.method23472())) {
            if (var3.method23473() || !this.method25084(var1, var9.method23472(), var2, var6, var7, var8)) {
               this.method25072(var1, var2, var3, var6);
            }
         } else {
            this.method25080(var1, var7, var8, Direction.field672, var9);
            if (this.method25088(var1, var2) >= 3) {
               this.method25072(var1, var2, var3, var6);
            }
         }
      }
   }

   private void method25072(Class1660 var1, BlockPos var2, Class7379 var3, Class7380 var4) {
      int var7 = var3.method23477() - this.method25092(var1);
      if (var3.<Boolean>method23463(field32712)) {
         var7 = 7;
      }

      if (var7 > 0) {
         Map<Direction, Class7379> var8 = this.method25089(var1, var2, var4);

         for (Entry<Direction, Class7379> var10 : var8.entrySet()) {
            Direction var11 = var10.getKey();
            Class7379 var12 = var10.getValue();
            BlockPos var13 = var2.method8349(var11);
            Class7380 var14 = var1.method6738(var13);
            if (this.method25091(var1, var2, var4, var11, var13, var14, var1.method6739(var13), var12.method23472())) {
               this.method25080(var1, var13, var14, var11, var12);
            }
         }
      }
   }

   public Class7379 method25073(Class1662 var1, BlockPos var2, Class7380 var3) {
      int var6 = 0;
      int var7 = 0;

      for (Direction var9 : Class76.field161) {
         BlockPos var10 = var2.method8349(var9);
         Class7380 var11 = var1.method6738(var10);
         Class7379 var12 = var11.method23449();
         if (var12.method23472().method25066(this) && this.method25074(var9, var1, var2, var3, var10, var11)) {
            if (var12.method23473()) {
               var7++;
            }

            var6 = Math.max(var6, var12.method23477());
         }
      }

      if (this.method25079() && var7 >= 2) {
         Class7380 var13 = var1.method6738(var2.method8313());
         Class7379 var15 = var13.method23449();
         if (var13.method23384().method31086() || this.method25086(var15)) {
            return this.method25078(false);
         }
      }

      BlockPos var14 = var2.method8311();
      Class7380 var16 = var1.method6738(var14);
      Class7379 var17 = var16.method23449();
      if (!var17.method23474() && var17.method23472().method25066(this) && this.method25074(Direction.field673, var1, var2, var3, var14, var16)) {
         return this.method25076(8, true);
      } else {
         int var18 = var6 - this.method25092(var1);
         return var18 > 0 ? this.method25076(var18, false) : Class9479.field44064.method25049();
      }
   }

   private boolean method25074(Direction var1, Class1665 var2, BlockPos var3, Class7380 var4, BlockPos var5, Class7380 var6) {
      Object2ByteLinkedOpenHashMap var9;
      if (!var4.method23383().method11582() && !var6.method23383().method11582()) {
         var9 = field32714.get();
      } else {
         var9 = null;
      }

      Class8570 var10;
      if (var9 == null) {
         var10 = null;
      } else {
         var10 = new Class8570(var4, var6, var1);
         byte var11 = var9.getAndMoveToFirst(var10);
         if (var11 != 127) {
            return var11 != 0;
         }
      }

      Class6408 var14 = var4.method23414(var2, var3);
      Class6408 var12 = var6.method23414(var2, var5);
      boolean var13 = !Class8022.method27443(var14, var12, var1);
      if (var9 != null) {
         if (var9.size() == 200) {
            var9.removeLastByte();
         }

         var9.putAndMoveToFirst(var10, (byte)(!var13 ? 0 : 1));
      }

      return var13;
   }

   public abstract Class7631 method25075();

   public Class7379 method25076(int var1, boolean var2) {
      return this.method25075().method25049().method23465(field32713, Integer.valueOf(var1)).method23465(field32712, Boolean.valueOf(var2));
   }

   public abstract Class7631 method25077();

   public Class7379 method25078(boolean var1) {
      return this.method25077().method25049().method23465(field32712, Boolean.valueOf(var1));
   }

   public abstract boolean method25079();

   public void method25080(Class1660 var1, BlockPos var2, Class7380 var3, Direction var4, Class7379 var5) {
      if (!(var3.method23383() instanceof Class3449)) {
         if (!var3.method23393()) {
            this.method25081(var1, var2, var3);
         }

         var1.method6725(var2, var5.method23484(), 3);
      } else {
         ((Class3449)var3.method23383()).method11532(var1, var2, var3, var5);
      }
   }

   public abstract void method25081(Class1660 var1, BlockPos var2, Class7380 var3);

   private static short method25082(BlockPos var0, BlockPos var1) {
      int var4 = var1.method8304() - var0.method8304();
      int var5 = var1.method8306() - var0.method8306();
      return (short)((var4 + 128 & 0xFF) << 8 | var5 + 128 & 0xFF);
   }

   public int method25083(
      Class1662 var1,
      BlockPos var2,
      int var3,
      Direction var4,
      Class7380 var5,
      BlockPos var6,
      Short2ObjectMap<Pair<Class7380, Class7379>> var7,
      Short2BooleanMap var8
   ) {
      int var11 = 1000;

      for (Direction var13 : Class76.field161) {
         if (var13 != var4) {
            BlockPos var14 = var2.method8349(var13);
            short var15 = method25082(var6, var14);
            Pair var16 = (Pair)var7.computeIfAbsent(var15, var2x -> {
               Class7380 var5x = var1.method6738(var14);
               return Pair.of(var5x, var5x.method23449());
            });
            Class7380 var17 = (Class7380)var16.getFirst();
            Class7379 var18 = (Class7379)var16.getSecond();
            if (this.method25085(var1, this.method25075(), var2, var5, var13, var14, var17, var18)) {
               boolean var19 = var8.computeIfAbsent(var15, var4x -> {
                  BlockPos var7x = var14.method8313();
                  Class7380 var8x = var1.method6738(var7x);
                  return this.method25084(var1, this.method25075(), var14, var17, var7x, var8x);
               });
               if (var19) {
                  return var3;
               }

               if (var3 < this.method25087(var1)) {
                  int var20 = this.method25083(var1, var14, var3 + 1, var13.method536(), var17, var6, var7, var8);
                  if (var20 < var11) {
                     var11 = var20;
                  }
               }
            }
         }
      }

      return var11;
   }

   private boolean method25084(Class1665 var1, Class7631 var2, BlockPos var3, Class7380 var4, BlockPos var5, Class7380 var6) {
      if (this.method25074(Direction.field672, var1, var3, var4, var5, var6)) {
         return !var6.method23449().method23472().method25066(this) ? this.method25090(var1, var5, var6, var2) : true;
      } else {
         return false;
      }
   }

   private boolean method25085(Class1665 var1, Class7631 var2, BlockPos var3, Class7380 var4, Direction var5, BlockPos var6, Class7380 var7, Class7379 var8) {
      return !this.method25086(var8) && this.method25074(var5, var1, var3, var4, var6, var7) && this.method25090(var1, var6, var7, var2);
   }

   private boolean method25086(Class7379 var1) {
      return var1.method23472().method25066(this) && var1.method23473();
   }

   public abstract int method25087(Class1662 var1);

   private int method25088(Class1662 var1, BlockPos var2) {
      int var5 = 0;

      for (Direction var7 : Class76.field161) {
         BlockPos var8 = var2.method8349(var7);
         Class7379 var9 = var1.method6739(var8);
         if (this.method25086(var9)) {
            var5++;
         }
      }

      return var5;
   }

   public Map<Direction, Class7379> method25089(Class1662 var1, BlockPos var2, Class7380 var3) {
      int var6 = 1000;
      EnumMap var7 = Maps.newEnumMap(Direction.class);
      Short2ObjectOpenHashMap var8 = new Short2ObjectOpenHashMap();
      Short2BooleanOpenHashMap var9 = new Short2BooleanOpenHashMap();

      for (Direction var11 : Class76.field161) {
         BlockPos var12 = var2.method8349(var11);
         short var13 = method25082(var2, var12);
         Pair var14 = (Pair)var8.computeIfAbsent(var13, var2x -> {
            Class7380 var5 = var1.method6738(var12);
            return Pair.of(var5, var5.method23449());
         });
         Class7380 var15 = (Class7380)var14.getFirst();
         Class7379 var16 = (Class7379)var14.getSecond();
         Class7379 var17 = this.method25073(var1, var12, var15);
         if (this.method25085(var1, var17.method23472(), var2, var3, var11, var12, var15, var16)) {
            BlockPos var18 = var12.method8313();
            boolean var19 = var9.computeIfAbsent(var13, var5 -> {
               Class7380 var8x = var1.method6738(var18);
               return this.method25084(var1, this.method25075(), var12, var15, var18, var8x);
            });
            int var20;
            if (!var19) {
               var20 = this.method25083(var1, var12, 1, var11.method536(), var15, var2, var8, var9);
            } else {
               var20 = 0;
            }

            if (var20 < var6) {
               var7.clear();
            }

            if (var20 <= var6) {
               var7.put(var11, var17);
               var6 = var20;
            }
         }
      }

      return var7;
   }

   private boolean method25090(Class1665 var1, BlockPos var2, Class7380 var3, Class7631 var4) {
      Block var7 = var3.method23383();
      if (!(var7 instanceof Class3449)) {
         if (!(var7 instanceof Class3461)
            && !var7.method11540(Class7645.field32790)
            && var7 != Blocks.LADDER
            && var7 != Blocks.SUGAR_CANE
            && var7 != Blocks.field37013) {
            Class8649 var8 = var3.method23384();
            return var8 != Class8649.field38934 && var8 != Class8649.field38933 && var8 != Class8649.field38937 && var8 != Class8649.field38940
               ? !var8.method31087()
               : false;
         } else {
            return false;
         }
      } else {
         return ((Class3449)var7).method11531(var1, var2, var3, var4);
      }
   }

   public boolean method25091(Class1665 var1, BlockPos var2, Class7380 var3, Direction var4, BlockPos var5, Class7380 var6, Class7379 var7, Class7631 var8) {
      return var7.method23488(var1, var5, var8, var4) && this.method25074(var4, var1, var2, var3, var5, var6) && this.method25090(var1, var5, var6, var8);
   }

   public abstract int method25092(Class1662 var1);

   public int method25093(Class1655 var1, BlockPos var2, Class7379 var3, Class7379 var4) {
      return this.method25057(var1);
   }

   @Override
   public void method25052(Class1655 var1, BlockPos var2, Class7379 var3) {
      if (!var3.method23473()) {
         Class7379 var6 = this.method25073(var1, var2, var1.method6738(var2));
         int var7 = this.method25093(var1, var2, var3, var6);
         if (!var6.method23474()) {
            if (!var6.equals(var3)) {
               var3 = var6;
               Class7380 var8 = var6.method23484();
               var1.method6725(var2, var8, 2);
               var1.method6861().method20726(var2, var6.method23472(), var7);
               var1.method6733(var2, var8.method23383());
            }
         } else {
            var3 = var6;
            var1.method6725(var2, Blocks.AIR.method11579(), 3);
         }
      }

      this.method25071(var1, var2, var3);
   }

   public static int method25094(Class7379 var0) {
      return !var0.method23473() ? 8 - Math.min(var0.method23477(), 8) + (!var0.<Boolean>method23463(field32712) ? 0 : 8) : 0;
   }

   private static boolean method25095(Class7379 var0, Class1665 var1, BlockPos var2) {
      return var0.method23472().method25066(var1.method6739(var2.method8311()).method23472());
   }

   @Override
   public float method25061(Class7379 var1, Class1665 var2, BlockPos var3) {
      return !method25095(var1, var2, var3) ? var1.method23476() : 1.0F;
   }

   @Override
   public float method25062(Class7379 var1) {
      return (float)var1.method23477() / 9.0F;
   }

   @Override
   public Class6408 method25068(Class7379 var1, Class1665 var2, BlockPos var3) {
      return var1.method23477() == 9 && method25095(var1, var2, var3)
         ? Class8022.method27426()
         : this.field32715.computeIfAbsent(var1, var2x -> Class8022.method27427(0.0, 0.0, 0.0, 1.0, (double)var2x.method23475(var2, var3), 1.0));
   }
}
