package mapped;

import com.google.common.collect.Maps;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.ListNBT;
import net.minecraft.network.DebugPacketSender;
import net.minecraft.network.play.server.SEntityStatusPacket;
import net.minecraft.stats.Stats;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.GameRules;
import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.storage.WorldSavedData;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class Class7531 extends WorldSavedData {
   private final Map<Integer, Class7699> field32332 = Maps.newHashMap();
   private final ServerWorld field32333;
   private int field32334;
   private int field32335;

   public Class7531(ServerWorld var1) {
      super(method24615(var1.getDimensionType()));
      this.field32333 = var1;
      this.field32334 = 1;
      this.markDirty();
   }

   public Class7699 method24610(int var1) {
      return this.field32332.get(var1);
   }

   public void method24611() {
      this.field32335++;
      Iterator var3 = this.field32332.values().iterator();

      while (var3.hasNext()) {
         Class7699 var4 = (Class7699)var3.next();
         if (this.field32333.getGameRules().getBoolean(GameRules.field24246)) {
            var4.method25402();
         }

         if (!var4.method25391()) {
            var4.method25403();
         } else {
            var3.remove();
            this.markDirty();
         }
      }

      if (this.field32335 % 200 == 0) {
         this.markDirty();
      }

      DebugPacketSender.method23621(this.field32333, this.field32332.values());
   }

   public static boolean method24612(Class1026 var0, Class7699 var1) {
      return var0 != null && var1 != null && var1.method25394() != null
         ? var0.isAlive() && var0.method4547() && var0.method3021() <= 2400 && var0.world.getDimensionType() == var1.method25394().getDimensionType()
         : false;
   }

   @Nullable
   public Class7699 method24613(ServerPlayerEntity var1) {
      if (var1.isSpectator()) {
         return null;
      } else if (this.field32333.getGameRules().getBoolean(GameRules.field24246)) {
         return null;
      } else {
         DimensionType var4 = var1.world.getDimensionType();
         if (!var4.isHasRaids()) {
            return null;
         } else {
            BlockPos var5 = var1.getPosition();
            List<Class9343> var6 = this.field32333.method6951().method6666(Class4913.field22748, var5, 64, Class2093.field13636).collect(Collectors.toList());
            int var7 = 0;
            Vector3d var8 = Vector3d.ZERO;

            for (Class9343 var10 : var6) {
               BlockPos var11 = var10.method35355();
               var8 = var8.add((double)var11.getX(), (double)var11.getY(), (double)var11.getZ());
               var7++;
            }

            BlockPos var13;
            if (var7 <= 0) {
               var13 = var5;
            } else {
               var8 = var8.scale(1.0 / (double)var7);
               var13 = new BlockPos(var8);
            }

            Class7699 var14 = this.method24614(var1.getServerWorld(), var13);
            boolean var15 = false;
            if (var14.method25395()) {
               if (var14.method25400() >= var14.method25399()) {
                  var1.removeEffects(Effects.BAD_OMEN);
                  var1.connection.sendPacket(new SEntityStatusPacket(var1, (byte)43));
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
               var1.connection.sendPacket(new SEntityStatusPacket(var1, (byte)43));
               if (!var14.method25390()) {
                  var1.method2911(Stats.field40173);
                  CriteriaTriggers.field44499.method15062(var1);
               }
            }

            this.markDirty();
            return var14;
         }
      }
   }

   private Class7699 method24614(ServerWorld var1, BlockPos var2) {
      Class7699 var5 = var1.method6957(var2);
      return var5 == null ? new Class7699(this.method24616(), var1, var2) : var5;
   }

   @Override
   public void read(CompoundNBT compoundNBT) {
      this.field32334 = compoundNBT.getInt("NextAvailableID");
      this.field32335 = compoundNBT.getInt("Tick");
      ListNBT var4 = compoundNBT.getList("Raids", 10);

      for (int var5 = 0; var5 < var4.size(); var5++) {
         CompoundNBT var6 = var4.getCompound(var5);
         Class7699 var7 = new Class7699(this.field32333, var6);
         this.field32332.put(var7.method25430(), var7);
      }
   }

   @Override
   public CompoundNBT write(CompoundNBT compoundNBT) {
      compoundNBT.putInt("NextAvailableID", this.field32334);
      compoundNBT.putInt("Tick", this.field32335);
      ListNBT var4 = new ListNBT();

      for (Class7699 var6 : this.field32332.values()) {
         CompoundNBT var7 = new CompoundNBT();
         var6.method25434(var7);
         var4.add(var7);
      }

      compoundNBT.put("Raids", var4);
      return compoundNBT;
   }

   public static String method24615(DimensionType var0) {
      return "raids" + var0.getSuffix();
   }

   private int method24616() {
      return ++this.field32334;
   }

   @Nullable
   public Class7699 method24617(BlockPos var1, int var2) {
      Class7699 var5 = null;
      double var6 = (double)var2;

      for (Class7699 var9 : this.field32332.values()) {
         double var10 = var9.method25428().distanceSq(var1);
         if (var9.method25433() && var10 < var6) {
            var5 = var9;
            var6 = var10;
         }
      }

      return var5;
   }
}
