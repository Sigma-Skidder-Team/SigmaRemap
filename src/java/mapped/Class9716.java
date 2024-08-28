package mapped;

import com.google.common.collect.ImmutableList;
import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.impl.Class4424;
import it.unimi.dsi.fastutil.longs.Long2ByteLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap;
import java.util.Collection;
import java.util.List;

public class Class9716 {
   private static String[] field45400;
   private static final ThreadLocal<Class6696> field45401 = ThreadLocal.<Class6696>withInitial(
      () -> new Class6696((Class7380)null, (Class7380)null, (Direction)null, null)
   );
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<Class6696>> field45402 = ThreadLocal.<Object2ByteLinkedOpenHashMap<Class6696>>withInitial(
      () -> {
         Class9 var2 = new Class9(200);
         var2.defaultReturnValue((byte)127);
         return var2;
      }
   );

   public static boolean method38063(Class7380 var0, Class1665 var1, BlockPos var2, Direction var3, Class8391 var4) {
      Class4424 var7 = new Class4424(var0);
      Client.getInstance().getEventManager().call(var7);
      if (!var7.method13971()) {
         if (!var7.isCancelled()) {
            BlockPos var8 = var2.method8349(var3);
            Class7380 var9 = var1.method6738(var8);
            if (!var9.method23495()) {
               if (!var0.method23411(var9, var3)) {
                  return !var9.method23410() ? true : method38064(var0, var1, var2, var3, var4, var9, var8);
               } else {
                  return false;
               }
            } else {
               return false;
            }
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   public static boolean method38064(Class7380 var0, Class1665 var1, BlockPos var2, Direction var3, Class8391 var4, Class7380 var5, BlockPos var6) {
      long var9 = (long)var0.method23493() << 36 | (long)var5.method23493() << 4 | (long)var3.ordinal();
      Long2ByteLinkedOpenHashMap var11 = var4.method29439();
      byte var12 = var11.getAndMoveToFirst(var9);
      if (var12 == 0) {
         Class6408 var13 = var0.method23388(var1, var2, var3);
         Class6408 var14 = var5.method23388(var1, var6, var3.method536());
         boolean var15 = Class8022.method27435(var13, var14, Class9477.field44041);
         if (var11.size() > 400) {
            var11.removeLastByte();
         }

         var11.putAndMoveToFirst(var9, (byte)(!var15 ? -1 : 1));
         return var15;
      } else {
         return var12 > 0;
      }
   }

   public static int method38065(Block var0) {
      return Class2348.field16072.method9171(var0);
   }

   public static Block method38066(ResourceLocation var0) {
      return Class2348.field16072.method9193(var0) ? Class2348.field16072.method9184(var0) : null;
   }

   public static int method38067(Class7380 var0) {
      Block var3 = var0.method23383();
      Class9348 var4 = var3.method11577();
      ImmutableList var5 = var4.method35392();
      return var5.indexOf(var0);
   }

   public static int method38068(Block var0) {
      Class9348 var3 = var0.method11577();
      ImmutableList var4 = var3.method35392();
      return var4.size();
   }

   public static Class7380 method38069(Block var0, int var1) {
      Class9348 var4 = var0.method11577();
      ImmutableList var5 = var4.method35392();
      return var1 >= 0 && var1 < var5.size() ? (Class7380)var5.get(var1) : null;
   }

   public static List<Class7380> method38070(Block var0) {
      Class9348 var3 = var0.method11577();
      return var3.method35392();
   }

   public static boolean method38071(Class7380 var0, Class1665 var1, BlockPos var2) {
      return var0.method23496();
   }

   public static Collection<Class8550<?>> method38072(Class7380 var0) {
      return var0.method23461();
   }
}
