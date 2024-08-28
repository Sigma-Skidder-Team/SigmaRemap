package mapped;

import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class Class7531 extends Class7530 {
   private final Map<Integer, Class7699> field32332 = Maps.newHashMap();
   private final ServerWorld field32333;
   private int field32334;
   private int field32335;

   public Class7531(ServerWorld var1) {
      super(method24615(var1.method6812()));
      this.field32333 = var1;
      this.field32334 = 1;
      this.method24605();
   }

   public Class7699 method24610(int var1) {
      return this.field32332.get(var1);
   }

   public void method24611() {
      this.field32335++;
      Iterator var3 = this.field32332.values().iterator();

      while (var3.hasNext()) {
         Class7699 var4 = (Class7699)var3.next();
         if (this.field32333.method6789().method17135(Class5462.field24246)) {
            var4.method25402();
         }

         if (!var4.method25391()) {
            var4.method25403();
         } else {
            var3.remove();
            this.method24605();
         }
      }

      if (this.field32335 % 200 == 0) {
         this.method24605();
      }

      Class7393.method23621(this.field32333, this.field32332.values());
   }

   public static boolean method24612(Class1026 var0, Class7699 var1) {
      return var0 != null && var1 != null && var1.method25394() != null
         ? var0.method3066() && var0.method4547() && var0.method3021() <= 2400 && var0.field5024.method6812() == var1.method25394().method6812()
         : false;
   }

   @Nullable
   public Class7699 method24613(Class878 var1) {
      if (var1.method2800()) {
         return null;
      } else if (this.field32333.method6789().method17135(Class5462.field24246)) {
         return null;
      } else {
         Class9535 var4 = var1.field5024.method6812();
         if (!var4.method36883()) {
            return null;
         } else {
            BlockPos var5 = var1.method3432();
            List<Class9343> var6 = this.field32333.method6951().method6666(Class4913.field22748, var5, 64, Class2093.field13636).collect(Collectors.toList());
            int var7 = 0;
            Vector3d var8 = Vector3d.field18047;

            for (Class9343 var10 : var6) {
               BlockPos var11 = var10.method35355();
               var8 = var8.method11339((double)var11.method8304(), (double)var11.getY(), (double)var11.method8306());
               var7++;
            }

            BlockPos var13;
            if (var7 <= 0) {
               var13 = var5;
            } else {
               var8 = var8.method11344(1.0 / (double)var7);
               var13 = new BlockPos(var8);
            }

            Class7699 var14 = this.method24614(var1.getServerWorld(), var13);
            boolean var15 = false;
            if (var14.method25395()) {
               if (var14.method25400() >= var14.method25399()) {
                  var1.method3040(Class8254.field35497);
                  var1.field4855.sendPacket(new Class5464(var1, (byte)43));
               } else {
                  var15 = true;
               }
            } else {
               if (!this.field32332.containsKey(var14.method25430())) {
                  this.field32332.put(var14.method25430(), var14);
               }

               var15 = true;
            }

            if (var15) {
               var14.method25401(var1);
               var1.field4855.sendPacket(new Class5464(var1, (byte)43));
               if (!var14.method25390()) {
                  var1.method2911(Class8876.field40173);
                  Class9551.field44499.method15062(var1);
               }
            }

            this.method24605();
            return var14;
         }
      }
   }

   private Class7699 method24614(ServerWorld var1, BlockPos var2) {
      Class7699 var5 = var1.method6957(var2);
      return var5 == null ? new Class7699(this.method24616(), var1, var2) : var5;
   }

   @Override
   public void method24591(Class39 var1) {
      this.field32334 = var1.method122("NextAvailableID");
      this.field32335 = var1.method122("Tick");
      Class41 var4 = var1.method131("Raids", 10);

      for (int var5 = 0; var5 < var4.size(); var5++) {
         Class39 var6 = var4.method153(var5);
         Class7699 var7 = new Class7699(this.field32333, var6);
         this.field32332.put(var7.method25430(), var7);
      }
   }

   @Override
   public Class39 method24592(Class39 var1) {
      var1.method102("NextAvailableID", this.field32334);
      var1.method102("Tick", this.field32335);
      Class41 var4 = new Class41();

      for (Class7699 var6 : this.field32332.values()) {
         Class39 var7 = new Class39();
         var6.method25434(var7);
         var4.add(var7);
      }

      var1.method99("Raids", var4);
      return var1;
   }

   public static String method24615(Class9535 var0) {
      return "raids" + var0.method36873();
   }

   private int method24616() {
      return ++this.field32334;
   }

   @Nullable
   public Class7699 method24617(BlockPos var1, int var2) {
      Class7699 var5 = null;
      double var6 = (double)var2;

      for (Class7699 var9 : this.field32332.values()) {
         double var10 = var9.method25428().method8318(var1);
         if (var9.method25433() && var10 < var6) {
            var5 = var9;
            var6 = var10;
         }
      }

      return var5;
   }
}
