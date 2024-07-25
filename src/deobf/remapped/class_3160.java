package remapped;

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
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_3160 {
   private static final Logger field_15702 = LogManager.getLogger();
   private static final ThreadFactory field_15695 = new ThreadFactoryBuilder().setDaemon(true).build();
   private final ImmutableSet<class_5621<class_6486>> field_15700;
   private final boolean field_15703;
   private final class_3676 field_15697;
   private final Thread field_15692;
   private final DataFixer field_15707;
   private volatile boolean field_15699 = true;
   private volatile boolean field_15708;
   private volatile float field_15701;
   private volatile int field_15705;
   private volatile int field_15693;
   private volatile int field_15706;
   private final Object2FloatMap<class_5621<class_6486>> field_15698 = Object2FloatMaps.synchronize(
      new Object2FloatOpenCustomHashMap(class_9665.method_44698())
   );
   private volatile ITextComponent field_15704 = new TranslationTextComponent("optimizeWorld.stage.counting");
   private static final Pattern field_15691 = Pattern.compile("^r\\.(-?[0-9]+)\\.(-?[0-9]+)\\.mca$");
   private final class_4050 field_15694;

   public class_3160(class_3676 var1, DataFixer var2, ImmutableSet<class_5621<class_6486>> var3, boolean var4) {
      this.field_15700 = var3;
      this.field_15703 = var4;
      this.field_15707 = var2;
      this.field_15697 = var1;
      this.field_15694 = new class_4050(new File(this.field_15697.method_17068(class_6486.field_33048), "data"), var2);
      this.field_15692 = field_15695.newThread(this::method_14583);
      this.field_15692.setUncaughtExceptionHandler((var1x, var2x) -> {
         field_15702.error("Error upgrading world", var2x);
         this.field_15704 = new TranslationTextComponent("optimizeWorld.stage.failed");
         this.field_15708 = true;
      });
      this.field_15692.start();
   }

   public void method_14575() {
      this.field_15699 = false;

      try {
         this.field_15692.join();
      } catch (InterruptedException var4) {
      }
   }

   private void method_14583() {
      this.field_15705 = 0;
      Builder var3 = ImmutableMap.builder();
      UnmodifiableIterator var4 = this.field_15700.iterator();

      while (var4.hasNext()) {
         class_5621 var5 = (class_5621)var4.next();
         List var6 = this.method_14579(var5);
         var3.put(var5, var6.listIterator());
         this.field_15705 = this.field_15705 + var6.size();
      }

      if (this.field_15705 == 0) {
         this.field_15708 = true;
      } else {
         float var29 = (float)this.field_15705;
         ImmutableMap var30 = var3.build();
         Builder var31 = ImmutableMap.builder();
         UnmodifiableIterator var7 = this.field_15700.iterator();

         while (var7.hasNext()) {
            class_5621 var8 = (class_5621)var7.next();
            File var9 = this.field_15697.method_17068(var8);
            var31.put(var8, new class_4037(new File(var9, "region"), this.field_15707, true));
         }

         ImmutableMap var32 = var31.build();
         long var10 = class_9665.method_44650();
         this.field_15704 = new TranslationTextComponent("optimizeWorld.stage.upgrading");

         while (this.field_15699) {
            boolean var12 = false;
            float var13 = 0.0F;
            UnmodifiableIterator var14 = this.field_15700.iterator();

            while (var14.hasNext()) {
               class_5621 var15 = (class_5621)var14.next();
               ListIterator var16 = (ListIterator)var30.get(var15);
               class_4037 var17 = (class_4037)var32.get(var15);
               if (var16.hasNext()) {
                  class_2034 var18 = (class_2034)var16.next();
                  boolean var19 = false;

                  try {
                     class_5734 var20 = var17.method_18575(var18);
                     if (var20 != null) {
                        int var37 = class_4037.method_18574(var20);
                        class_5734 var22 = var17.method_18573(var15, () -> this.field_15694, var20);
                        class_5734 var23 = var22.method_25937("Level");
                        class_2034 var24 = new class_2034(var23.method_25947("xPos"), var23.method_25947("zPos"));
                        if (!var24.equals(var18)) {
                           field_15702.warn("Chunk {} has invalid position {}", var18, var24);
                        }

                        boolean var25 = var37 < class_7665.method_34674().getWorldVersion();
                        if (this.field_15703) {
                           var25 = var25 || var23.method_25938("Heightmaps");
                           var23.method_25959("Heightmaps");
                           var25 = var25 || var23.method_25938("isLightOn");
                           var23.method_25959("isLightOn");
                        }

                        if (var25) {
                           var17.method_18571(var18, var22);
                           var19 = true;
                        }
                     }
                  } catch (class_3297 var27) {
                     Throwable var21 = var27.getCause();
                     if (!(var21 instanceof IOException)) {
                        throw var27;
                     }

                     field_15702.error("Error upgrading chunk {}", var18, var21);
                  } catch (IOException var28) {
                     field_15702.error("Error upgrading chunk {}", var18, var28);
                  }

                  if (var19) {
                     this.field_15693++;
                  } else {
                     this.field_15706++;
                  }

                  var12 = true;
               }

               float var36 = (float)var16.nextIndex() / var29;
               this.field_15698.put(var15, var36);
               var13 += var36;
            }

            this.field_15701 = var13;
            if (!var12) {
               this.field_15699 = false;
            }
         }

         this.field_15704 = new TranslationTextComponent("optimizeWorld.stage.finished");
         UnmodifiableIterator var34 = var32.values().iterator();

         while (var34.hasNext()) {
            class_4037 var35 = (class_4037)var34.next();

            try {
               var35.close();
            } catch (IOException var26) {
               field_15702.error("Error upgrading chunk", var26);
            }
         }

         this.field_15694.method_18705();
         var10 = class_9665.method_44650() - var10;
         field_15702.info("World optimizaton finished after {} ms", var10);
         this.field_15708 = true;
      }
   }

   private List<class_2034> method_14579(class_5621<class_6486> var1) {
      File var4 = this.field_15697.method_17068(var1);
      File var5 = new File(var4, "region");
      File[] var6 = var5.listFiles((var0, var1x) -> var1x.endsWith(".mca"));
      if (var6 == null) {
         return ImmutableList.of();
      } else {
         ArrayList var7 = Lists.newArrayList();

         for (File var11 : var6) {
            Matcher var12 = field_15691.matcher(var11.getName());
            if (var12.matches()) {
               int var13 = Integer.parseInt(var12.group(1)) << 5;
               int var14 = Integer.parseInt(var12.group(2)) << 5;

               try (class_1209 var15 = new class_1209(var11, var5, true)) {
                  for (int var17 = 0; var17 < 32; var17++) {
                     for (int var18 = 0; var18 < 32; var18++) {
                        class_2034 var19 = new class_2034(var17 + var13, var18 + var14);
                        if (var15.method_5346(var19)) {
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

   public boolean method_14582() {
      return this.field_15708;
   }

   public ImmutableSet<class_5621<class_6486>> method_14573() {
      return this.field_15700;
   }

   public float method_14577(class_5621<class_6486> var1) {
      return this.field_15698.getFloat(var1);
   }

   public float method_14572() {
      return this.field_15701;
   }

   public int method_14576() {
      return this.field_15705;
   }

   public int method_14580() {
      return this.field_15693;
   }

   public int method_14574() {
      return this.field_15706;
   }

   public ITextComponent method_14581() {
      return this.field_15704;
   }
}
