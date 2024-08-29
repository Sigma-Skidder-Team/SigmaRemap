package mapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongArrayList;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class Class8418 {
   private static final Map<String, String> field36088 = Util.<Map<String, String>>make(Maps.newHashMap(), var0 -> {
      var0.put("Village", "Village");
      var0.put("Mineshaft", "Mineshaft");
      var0.put("Mansion", "Mansion");
      var0.put("Igloo", "Temple");
      var0.put("Desert_Pyramid", "Temple");
      var0.put("Jungle_Pyramid", "Temple");
      var0.put("Swamp_Hut", "Temple");
      var0.put("Stronghold", "Stronghold");
      var0.put("Monument", "Monument");
      var0.put("Fortress", "Fortress");
      var0.put("EndCity", "EndCity");
   });
   private static final Map<String, String> field36089 = Util.<Map<String, String>>make(Maps.newHashMap(), var0 -> {
      var0.put("Iglu", "Igloo");
      var0.put("TeDP", "Desert_Pyramid");
      var0.put("TeJP", "Jungle_Pyramid");
      var0.put("TeSH", "Swamp_Hut");
   });
   private final boolean field36090;
   private final Map<String, Long2ObjectMap<CompoundNBT>> field36091 = Maps.newHashMap();
   private final Map<String, Class7533> field36092 = Maps.newHashMap();
   private final List<String> field36093;
   private final List<String> field36094;

   public Class8418(Class8250 var1, List<String> var2, List<String> var3) {
      this.field36093 = var2;
      this.field36094 = var3;
      this.method29579(var1);
      boolean var6 = false;

      for (String var8 : this.field36094) {
         var6 |= this.field36091.get(var8) != null;
      }

      this.field36090 = var6;
   }

   public void method29574(long var1) {
      for (String var6 : this.field36093) {
         Class7533 var7 = this.field36092.get(var6);
         if (var7 != null && var7.method24621(var1)) {
            var7.method24622(var1);
            var7.method24605();
         }
      }
   }

   public CompoundNBT method29575(CompoundNBT var1) {
      CompoundNBT var4 = var1.getCompound("Level");
      Class7481 var5 = new Class7481(var4.method122("xPos"), var4.method122("zPos"));
      if (this.method29577(var5.field32174, var5.field32175)) {
         var1 = this.method29578(var1, var5);
      }

      CompoundNBT var6 = var4.getCompound("Structures");
      CompoundNBT var7 = var6.getCompound("References");

      for (String var9 : this.field36094) {
         Structure var10 = (Structure) Structure.field_236365_a_.get(var9.toLowerCase(Locale.ROOT));
         if (!var7.method119(var9, 12) && var10 != null) {
            byte var11 = 8;
            LongArrayList var12 = new LongArrayList();

            for (int var13 = var5.field32174 - 8; var13 <= var5.field32174 + 8; var13++) {
               for (int var14 = var5.field32175 - 8; var14 <= var5.field32175 + 8; var14++) {
                  if (this.method29576(var13, var14, var9)) {
                     var12.add(Class7481.method24353(var13, var14));
                  }
               }
            }

            var7.method114(var9, var12);
         }
      }

      var6.put("References", var7);
      var4.put("Structures", var6);
      var1.put("Level", var4);
      return var1;
   }

   private boolean method29576(int var1, int var2, String var3) {
      return !this.field36090
         ? false
         : this.field36091.get(var3) != null && this.field36092.get(field36088.get(var3)).method24620(Class7481.method24353(var1, var2));
   }

   private boolean method29577(int var1, int var2) {
      if (this.field36090) {
         for (String var6 : this.field36094) {
            if (this.field36091.get(var6) != null && this.field36092.get(field36088.get(var6)).method24621(Class7481.method24353(var1, var2))) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   private CompoundNBT method29578(CompoundNBT var1, Class7481 var2) {
      CompoundNBT var5 = var1.getCompound("Level");
      CompoundNBT var6 = var5.getCompound("Structures");
      CompoundNBT var7 = var6.getCompound("Starts");

      for (String var9 : this.field36094) {
         Long2ObjectMap var10 = this.field36091.get(var9);
         if (var10 != null) {
            long var11 = var2.method24352();
            if (this.field36092.get(field36088.get(var9)).method24621(var11)) {
               CompoundNBT var13 = (CompoundNBT)var10.get(var11);
               if (var13 != null) {
                  var7.put(var9, var13);
               }
            }
         }
      }

      var6.put("Starts", var7);
      var5.put("Structures", var6);
      var1.put("Level", var5);
      return var1;
   }

   private void method29579(Class8250 var1) {
      if (var1 != null) {
         Iterator var4 = this.field36093.iterator();

         while (true) {
            String var5;
            CompoundNBT var6;
            while (true) {
               if (!var4.hasNext()) {
                  return;
               }

               var5 = (String)var4.next();
               var6 = new CompoundNBT();

               try {
                  var6 = var1.method28771(var5, 1493).getCompound("data").getCompound("Features");
                  if (var6.method134()) {
                     continue;
                  }
               } catch (IOException var17) {
               }
               break;
            }

            for (String var8 : var6.method97()) {
               CompoundNBT var9 = var6.getCompound(var8);
               long var10 = Class7481.method24353(var9.method122("ChunkX"), var9.method122("ChunkZ"));
               ListNBT var12 = var9.method131("Children", 10);
               if (!var12.isEmpty()) {
                  String var13 = var12.method153(0).method126("id");
                  String var14 = field36089.get(var13);
                  if (var14 != null) {
                     var9.method109("id", var14);
                  }
               }

               String var22 = var9.method126("id");
               this.field36091.computeIfAbsent(var22, var0 -> new Long2ObjectOpenHashMap()).put(var10, var9);
            }

            String var18 = var5 + "_index";
            Class7533 var19 = var1.<Class7533>method28767(() -> new Class7533(var18), var18);
            if (!var19.method24623().isEmpty()) {
               this.field36092.put(var5, var19);
            } else {
               Class7533 var20 = new Class7533(var18);
               this.field36092.put(var5, var20);

               for (String var16 : var6.method97()) {
                  CompoundNBT var21 = var6.getCompound(var16);
                  var20.method24619(Class7481.method24353(var21.method122("ChunkX"), var21.method122("ChunkZ")));
               }

               var20.method24605();
            }
         }
      }
   }

   public static Class8418 method29580(RegistryKey<World> var0, Class8250 var1) {
      if (var0 != World.OVERWORLD) {
         if (var0 != World.THE_NETHER) {
            if (var0 != World.THE_END) {
               throw new RuntimeException(String.format("Unknown dimension type : %s", var0));
            } else {
               ImmutableList var5 = ImmutableList.of("EndCity");
               return new Class8418(var1, var5, var5);
            }
         } else {
            ImmutableList var4 = ImmutableList.of("Fortress");
            return new Class8418(var1, var4, var4);
         }
      } else {
         return new Class8418(
            var1,
            ImmutableList.of("Monument", "Stronghold", "Village", "Mineshaft", "Temple", "Mansion"),
            ImmutableList.of("Village", "Mineshaft", "Mansion", "Igloo", "Desert_Pyramid", "Jungle_Pyramid", "Swamp_Hut", "Stronghold", "Monument")
         );
      }
   }
}
