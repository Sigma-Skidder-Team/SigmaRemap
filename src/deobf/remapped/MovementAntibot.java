package remapped;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class MovementAntibot extends class_5676 {
   public List<Integer> field_8306 = new CopyOnWriteArrayList<Integer>();
   public HashMap<Entity, Integer> field_8305 = new HashMap<Entity, Integer>();
   public HashMap<Entity, ArrayList<Integer>> field_8302 = new HashMap<Entity, ArrayList<Integer>>();
   public int field_8303 = 30;

   public MovementAntibot() {
      super("Movement", "Detects bots based on movement patterns", class_2608.field_12884);
   }

   @Override
   public boolean method_7183(Entity var1) {
      return this.field_8305.getOrDefault(var1, 0) < this.field_8303;
   }

   @EventListen
   private void method_7143(PlayerTickEvent var1) {
      if (field_28769.thePlayer.field_41697 < 10) {
         this.field_8305.clear();
      }

      for (PlayerEntity var5 : class_314.method_1435()) {
         if (var5 != field_28769.thePlayer) {
            if (var5 == null
               || !class_314.method_1413(var5, 0.01F)
               || var5.method_37109()
               || !(var5.method_37175(field_28769.thePlayer) > 5.0F)
                  && (var5.getPosX() != var5.field_41754 || var5.getPosZ() != var5.field_41724 || var5.method_37309() != var5.field_41713)) {
               if (this.field_8305.getOrDefault(var5, 0) < this.field_8303) {
                  this.field_8305.put(var5, 0);
               }
            } else {
               this.field_8305.put(var5, this.field_8305.getOrDefault(var5, 0) + 1);
            }
         }
      }
   }

   @EventListen
   private void method_7140(PacketEvent var1) {
      if (field_28769.thePlayer != null && this.field_8305 != null) {
         if (field_28769.thePlayer.field_41697 < 10) {
            this.field_8305.clear();
         }

         if (var1.method_557() instanceof class_8650) {
            class_8650 var4 = (class_8650)var1.method_557();
            if (!(var4.method_2564(field_28769.theWorld) instanceof PlayerEntity)) {
               return;
            }

            Entity var5 = var4.method_2564(field_28769.theWorld);
            boolean var6 = class_314.method_1413(var5, 0.5F);
            short var7 = var4.field_3213;
            if (!this.field_8302.containsKey(var5)) {
               this.field_8302.put(var5, new ArrayList<Integer>());
            }

            ArrayList var8 = this.field_8302.get(var5);
            if (var6) {
               if (var8.size() > 0) {
                  int var9 = this.method_7139(var8);
                  int var10 = this.method_7138(var8);
                  if (var10 > 0 && var10 < 1300 && var9 < 3500 && var9 > 2900) {
                     this.field_8305.put(var5, this.field_8305.getOrDefault(var5, 0) + this.field_8303);
                  }
               }

               var8.clear();
               this.field_8302.put(var5, var8);
            }

            if (var8.size() > 0 && (Integer)var8.get(var8.size() - 1) < 0 && var7 > 0) {
               var8.clear();
            }

            if (this.method_7139(var8) > 3600) {
               var8.clear();
            }

            if ((var8.size() == 0 || !var6) && var7 != 0) {
               var8.add(Integer.valueOf(var7));
            }

            this.field_8302.put(var5, var8);
         }
      }
   }

   public int method_7139(ArrayList<Integer> var1) {
      int var4 = 0;

      for (int var6 : var1) {
         var4 += var6 <= 0 ? 0 : var6;
      }

      return var4;
   }

   public int method_7138(ArrayList<Integer> var1) {
      int var4 = 0;

      for (int var6 : var1) {
         var4 += var6;
      }

      return var4;
   }

   public boolean method_7141(Entity var1) {
      if (!field_28769.theWorld.method_28262(var1.method_37075()).method_8302()) {
         Box var4 = new Box(
            var1.boundingBox.field_19941,
            var1.boundingBox.field_19937 - 0.5,
            var1.boundingBox.field_19938,
            var1.boundingBox.field_19940,
            var1.boundingBox.field_19939,
            var1.boundingBox.field_19942
         );

         for (BlockPos var6 : method_7142(var1)) {
            class_4190 var7 = field_28769.theWorld.method_28262(var6).method_8334(field_28769.theWorld, var6);
            if (!var7.method_19485() && var4.method_18909(var7.method_19483().method_18919(var6))) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   public static List<BlockPos> method_7142(Entity var0) {
      ArrayList var3 = new ArrayList();
      byte var4 = 1;

      for (float var5 = (float)(-var4); var5 <= (float)var4; var5++) {
         for (float var6 = (float)(-var4); var6 <= (float)var4; var6++) {
            BlockPos var7 = new BlockPos(var0.getPosX() + (double)var5, var0.method_37309() - 1.0, var0.getPosZ() + (double)var6);
            var3.add(var7);
         }
      }

      return var3;
   }

   @Override
   public boolean method_7182(Entity var1) {
      return this.field_8305.getOrDefault(var1, 0) >= this.field_8303;
   }
}
