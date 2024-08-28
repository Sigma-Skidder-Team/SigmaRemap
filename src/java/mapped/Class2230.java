package mapped;

import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import it.unimi.dsi.fastutil.objects.ObjectSet;

import java.util.List;

public enum Class2230 implements Class2234 {
   field14618(
      Blocks.field36895,
      Blocks.field36588,
      Blocks.field36945,
      Blocks.field36946,
      Blocks.field36947,
      Blocks.field36948,
      Blocks.field36949,
      Blocks.field36950,
      Blocks.field36951,
      Blocks.field36952,
      Blocks.field36953,
      Blocks.field36954,
      Blocks.field36955,
      Blocks.field36956,
      Blocks.field36957,
      Blocks.field36958,
      Blocks.field36959,
      Blocks.field36960,
      Blocks.field36713,
      Blocks.field36714,
      Blocks.field36715,
      Blocks.field36652,
      Blocks.GRAVEL,
      Blocks.SAND,
      Blocks.RED_SAND,
      Blocks.field36542,
      Blocks.field36543,
      Blocks.field36544,
      Blocks.field36545,
      Blocks.field36546,
      Blocks.field36547,
      Blocks.field36552,
      Blocks.field36553,
      Blocks.field36554,
      Blocks.field36555,
      Blocks.field36556,
      Blocks.field36557
   ) {
      @Override
      public Class7380 method8970(Class7380 var1, Direction var2, Class7380 var3, Class1660 var4, BlockPos var5, BlockPos var6) {
         return var1;
      }
   },
   field14619() {
      @Override
      public Class7380 method8970(Class7380 var1, Direction var2, Class7380 var3, Class1660 var4, BlockPos var5, BlockPos var6) {
         return var1.method23439(var2, var4.method6738(var6), var4, var5, var6);
      }
   },
   field14620(Blocks.field36534, Blocks.field36716) {
      @Override
      public Class7380 method8970(Class7380 var1, Direction var2, Class7380 var3, Class1660 var4, BlockPos var5, BlockPos var6) {
         if (var3.method23448(var1.method23383())
                 && var2.method544().method324()
                 && var1.method23463(Class3348.field18866) == Class111.field379
                 && var3.method23463(Class3348.field18866) == Class111.field379) {

            Direction var9 = var1.method23463(Class3348.field18865);
            if (var2.method544() != var9.method544() && var9 == var3.method23463(Class3348.field18865)) {
               Class111 var10 = var2 != var9.method537() ? Class111.field381 : Class111.field380;
               var4.method6725(var6, var3.method23465(Class3348.field18866, var10.method308()), 18);
               if (var9 == Direction.NORTH || var9 == Direction.EAST
               ) {
                  Class944 var11 = var4.method6759(var5);
                  Class944 var12 = var4.method6759(var6);
                  if (var11 instanceof Class941 && var12 instanceof Class941) {
                     Class941.method3764((Class941)var11, (Class941)var12);
                  }
               }

               return var1.method23465(Class3348.field18866, var10);
            }
         }

         return var1;
      }
   },
   field14621(true, Blocks.field36450, Blocks.field36448, Blocks.field36451, Blocks.field36449, Blocks.field36446, Blocks.field36447) {
      private final ThreadLocal<List<ObjectSet<BlockPos>>> field14625 = ThreadLocal.withInitial(() -> Lists.newArrayListWithCapacity(7));
      @Override
      public Class7380 method8970(Class7380 var1, Direction var2, Class7380 var3, Class1660 var4, BlockPos var5, BlockPos var6) {
         Class7380 var9 = var1.method23439(var2, var4.method6738(var6), var4, var5, var6);
         if (var1 != var9) {
            int var10 = var9.method23463(Class8820.field39747);
            List<ObjectSet<BlockPos>> var11 = this.field14625.get();
            if (var11.isEmpty()) {
               for(int var12 = 0; var12 < 7; ++var12) {
                  var11.add(new ObjectOpenHashSet<>());
               }
            }

            var11.get(var10).add(var5.method8353());
         }

         return var1;
      }

      @Override
      public void method8971(Class1660 var1) {
         Mutable var4 = new Mutable();
         List<ObjectSet<BlockPos>> var5 = this.field14625.get();

         for(int var6 = 2; var6 < var5.size(); ++var6) {
            int var7 = var6 - 1;
            ObjectSet<BlockPos> var8 = var5.get(var7);
            ObjectSet<BlockPos> var9 = var5.get(var6);

             for (BlockPos var11 : var8) {
                 Class7380 var12 = var1.method6738(var11);
                 if (var12.method23463(Class8820.field39747) >= var7) {
                     var1.method6725(var11, var12.method23465(Class8820.field39747, Integer.valueOf(var7)), 18);
                     if (var6 != 7) {
                         for (Direction var16 : field14623) {
                             var4.method8377(var11, var16);
                             Class7380 var17 = var1.method6738(var4);
                             if (var17.method23462(Class8820.field39747) && var12.method23463(Class8820.field39747) > var6) {
                                 var9.add(var4.method8353());
                             }
                         }
                     }
                 }
             }
         }

         var5.clear();
      }
   },
   field14622(Blocks.field36635, Blocks.field36634) {
      @Override
      public Class7380 method8970(Class7380 var1, Direction var2, Class7380 var3, Class1660 var4, BlockPos var5, BlockPos var6) {
         if (var1.method23463(Class3486.field19347) == 7) {
            Class3462 var9 = ((Class3486)var1.method23383()).method12185();
            if (var3.method23448(var9)) {
               return var9.method12147().method11579().method23465(Class3198.field18484, var2);
            }
         }

         return var1;
      }
   };

   public static final Direction[] field14623 = Direction.values();
   private static final Class2230[] field14624 = new Class2230[]{field14618, field14619, field14620, field14621, field14622};

   private Class2230(Block... var3) {
      this(false, var3);
   }

   private Class2230(boolean var3, Block... var4) {
      for (Block var10 : var4) {
         Class8922.method32610().put(var10, this);
      }

      if (var3) {
         Class8922.method32611().add(this);
      }
   }
}
