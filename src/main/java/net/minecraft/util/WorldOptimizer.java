package net.minecraft.util;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableMap.Builder;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.mojang.datafixers.DataFixer;
import it.unimi.dsi.fastutil.objects.Object2FloatMap;
import it.unimi.dsi.fastutil.objects.Object2FloatMaps;
import it.unimi.dsi.fastutil.objects.Object2FloatOpenCustomHashMap;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import mapped.*;
import net.minecraft.crash.ReportedException;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraft.world.storage.DimensionSavedDataManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class WorldOptimizer {
   private static final Logger field34206 = LogManager.getLogger();
   private static final ThreadFactory field34207 = new ThreadFactoryBuilder().setDaemon(true).build();
   private final ImmutableSet<RegistryKey<World>> field34208;
   private final boolean field34209;
   private final SaveFormat.LevelSave field34210;
   private final Thread thread;
   private final DataFixer field34212;
   private volatile boolean field34213 = true;
   private volatile boolean field34214;
   private volatile float field34215;
   private volatile int done;
   private volatile int field34217;
   private volatile int field34218;
   private final Object2FloatMap<RegistryKey<World>> field34219 = Object2FloatMaps.synchronize(new Object2FloatOpenCustomHashMap(Util.identityHashStrategy()));
   private volatile ITextComponent field34220 = new TranslationTextComponent("optimizeWorld.stage.counting");
   private static final Pattern field34221 = Pattern.compile("^r\\.(-?[0-9]+)\\.(-?[0-9]+)\\.mca$");
   private final DimensionSavedDataManager field34222;

   public WorldOptimizer(SaveFormat.LevelSave var1, DataFixer var2, ImmutableSet<RegistryKey<World>> var3, boolean var4) {
      this.field34208 = var3;
      this.field34209 = var4;
      this.field34212 = var2;
      this.field34210 = var1;
      this.field34222 = new DimensionSavedDataManager(new File(this.field34210.method7992(World.OVERWORLD), "data"), var2);
      this.thread = field34207.newThread(this::optimize);
      this.thread.setUncaughtExceptionHandler((var1x, var2x) -> {
         field34206.error("Error upgrading world", var2x);
         this.field34220 = new TranslationTextComponent("optimizeWorld.stage.failed");
         this.field34214 = true;
      });
      this.thread.start();
   }

   public void cancel() {
      this.field34213 = false;

      try {
         this.thread.join();
      } catch (InterruptedException var4) {
      }
   }

   private void optimize() {
      this.done = 0;
      Builder var3 = ImmutableMap.builder();
      UnmodifiableIterator var4 = this.field34208.iterator();

      while (var4.hasNext()) {
         RegistryKey var5 = (RegistryKey)var4.next();
         List var6 = this.method27061(var5);
         var3.put(var5, var6.listIterator());
         this.done = this.done + var6.size();
      }

      if (this.done == 0) {
         this.field34214 = true;
      } else {
         float var29 = (float)this.done;
         ImmutableMap var30 = var3.build();
         Builder var31 = ImmutableMap.builder();
         UnmodifiableIterator var7 = this.field34208.iterator();

         while (var7.hasNext()) {
            RegistryKey var8 = (RegistryKey)var7.next();
            File var9 = this.field34210.method7992(var8);
            var31.put(var8, new Class1648(new File(var9, "region"), this.field34212, true));
         }

         ImmutableMap var32 = var31.build();
         long var10 = Util.milliTime();
         this.field34220 = new TranslationTextComponent("optimizeWorld.stage.upgrading");

         while (this.field34213) {
            boolean var12 = false;
            float var13 = 0.0F;
            UnmodifiableIterator var14 = this.field34208.iterator();

            while (var14.hasNext()) {
               RegistryKey var15 = (RegistryKey)var14.next();
               ListIterator var16 = (ListIterator)var30.get(var15);
               Class1648 var17 = (Class1648)var32.get(var15);
               if (var16.hasNext()) {
                  ChunkPos var18 = (ChunkPos)var16.next();
                  boolean var19 = false;

                  try {
                     CompoundNBT var20 = var17.method6531(var18);
                     if (var20 != null) {
                        int var37 = Class1648.method6530(var20);
                        CompoundNBT var22 = var17.method6529(var15, () -> this.field34222, var20);
                        CompoundNBT var23 = var22.getCompound("Level");
                        ChunkPos var24 = new ChunkPos(var23.getInt("xPos"), var23.getInt("zPos"));
                        if (!var24.equals(var18)) {
                           field34206.warn("Chunk {} has invalid position {}", var18, var24);
                        }

                        boolean var25 = var37 < SharedConstants.getVersion().getWorldVersion();
                        if (this.field34209) {
                           var25 = var25 || var23.contains("Heightmaps");
                           var23.remove("Heightmaps");
                           var25 = var25 || var23.contains("isLightOn");
                           var23.remove("isLightOn");
                        }

                        if (var25) {
                           var17.method6532(var18, var22);
                           var19 = true;
                        }
                     }
                  } catch (ReportedException var27) {
                     Throwable var21 = var27.getCause();
                     if (!(var21 instanceof IOException)) {
                        throw var27;
                     }

                     field34206.error("Error upgrading chunk {}", var18, var21);
                  } catch (IOException var28) {
                     field34206.error("Error upgrading chunk {}", var18, var28);
                  }

                  if (var19) {
                     this.field34217++;
                  } else {
                     this.field34218++;
                  }

                  var12 = true;
               }

               float var36 = (float)var16.nextIndex() / var29;
               this.field34219.put(var15, var36);
               var13 += var36;
            }

            this.field34215 = var13;
            if (!var12) {
               this.field34213 = false;
            }
         }

         this.field34220 = new TranslationTextComponent("optimizeWorld.stage.finished");
         UnmodifiableIterator var34 = var32.values().iterator();

         while (var34.hasNext()) {
            Class1648 var35 = (Class1648)var34.next();

            try {
               var35.close();
            } catch (IOException var26) {
               field34206.error("Error upgrading chunk", var26);
            }
         }

         this.field34222.method28773();
         var10 = Util.milliTime() - var10;
         field34206.info("World optimizaton finished after {} ms", var10);
         this.field34214 = true;
      }
   }

   private List<ChunkPos> method27061(RegistryKey<World> var1) {
      File var4 = this.field34210.method7992(var1);
      File var5 = new File(var4, "region");
      File[] var6 = var5.listFiles((var0, var1x) -> var1x.endsWith(".mca"));
      if (var6 == null) {
         return ImmutableList.of();
      } else {
         ArrayList var7 = Lists.newArrayList();

         for (File var11 : var6) {
            Matcher var12 = field34221.matcher(var11.getName());
            if (var12.matches()) {
               int var13 = Integer.parseInt(var12.group(1)) << 5;
               int var14 = Integer.parseInt(var12.group(2)) << 5;

               try (RegionFile var15 = new RegionFile(var11, var5, true)) {
                  for (int var17 = 0; var17 < 32; var17++) {
                     for (int var18 = 0; var18 < 32; var18++) {
                        ChunkPos var19 = new ChunkPos(var17 + var13, var18 + var14);
                        if (var15.method7257(var19)) {
                           var7.add(var19);
                        }
                     }
                  }
               } catch (Throwable var30) {
               }
            }
         }

         return var7;
      }
   }

   public boolean isFinished() {
      return this.field34214;
   }

   public ImmutableSet<RegistryKey<World>> func_233533_c_() {
      return this.field34208;
   }

   public float func_233531_a_(RegistryKey<World> var1) {
      return this.field34219.getFloat(var1);
   }

   public float getTotalProgress() {
      return this.field34215;
   }

   public int getTotalChunks() {
      return this.done;
   }

   public int getConverted() {
      return this.field34217;
   }

   public int getSkipped() {
      return this.field34218;
   }

   public ITextComponent getStatusText() {
      return this.field34220;
   }
}
