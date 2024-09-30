package net.minecraft.world.lighting;

import it.unimi.dsi.fastutil.longs.*;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import net.minecraft.world.chunk.IChunkLightProvider;
import mapped.Class207;
import mapped.Class7449;
import net.minecraft.world.LightType;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.SectionPos;
import net.minecraft.world.chunk.NibbleArray;

import javax.annotation.Nullable;

public abstract class SectionLightStorage<M extends LightDataMap<M>> extends Class207 {
   public static final NibbleArray field768 = new NibbleArray();
   private static final Direction[] field769 = Direction.values();
   private final LightType field770;
   private final IChunkLightProvider field771;
   public final LongSet field772 = new LongOpenHashSet();
   public final LongSet field773 = new LongOpenHashSet();
   public final LongSet field774 = new LongOpenHashSet();
   public volatile M field775;
   public final M field776;
   public final LongSet field777 = new LongOpenHashSet();
   public final LongSet field778 = new LongOpenHashSet();
   public final Long2ObjectMap<NibbleArray> field779 = Long2ObjectMaps.synchronize(new Long2ObjectOpenHashMap<>());
   private final LongSet field780 = new LongOpenHashSet();
   private final LongSet field781 = new LongOpenHashSet();
   private final LongSet field782 = new LongOpenHashSet();
   public volatile boolean field783;

   public SectionLightStorage(LightType var1, IChunkLightProvider var2, M var3) {
      super(3, 16, 256);
      this.field770 = var1;
      this.field771 = var2;
      this.field776 = (M)var3;
      this.field775 = (M)var3.method24828();
      this.field775.method24835();
   }

   public boolean hasSection(long var1) {
      return this.method699(var1, true) != null;
   }

   @Nullable
   public NibbleArray method699(long var1, boolean var3) {
      return this.method700(!var3 ? this.field775 : this.field776, var1);
   }

   @Nullable
   public NibbleArray method700(M var1, long var2) {
      return var1.method24831(var2);
   }

   @Nullable
   public NibbleArray method701(long var1) {
      NibbleArray var5 = (NibbleArray)this.field779.get(var1);
      return var5 == null ? this.method699(var1, false) : var5;
   }

   public abstract int method702(long var1);

   public int method703(long var1) {
      long var5 = SectionPos.worldToSection(var1);
      NibbleArray var7 = this.method699(var5, true);
      return var7.get(
         SectionPos.mask(BlockPos.unpackX(var1)), SectionPos.mask(BlockPos.unpackY(var1)), SectionPos.mask(BlockPos.unpackZ(var1))
      );
   }

   public void setLight(long var1, int var3) {
      long var6 = SectionPos.worldToSection(var1);
      if (this.field777.add(var6)) {
         this.field776.method24829(var6);
      }

      NibbleArray var8 = this.method699(var6, true);
      var8.method20671(
         SectionPos.mask(BlockPos.unpackX(var1)),
         SectionPos.mask(BlockPos.unpackY(var1)),
         SectionPos.mask(BlockPos.unpackZ(var1)),
         var3
      );

      for (int var9 = -1; var9 <= 1; var9++) {
         for (int var10 = -1; var10 <= 1; var10++) {
            for (int var11 = -1; var11 <= 1; var11++) {
               this.field778.add(SectionPos.worldToSection(BlockPos.method8327(var1, var10, var11, var9)));
            }
         }
      }
   }

   @Override
   public int getLevel(long var1) {
      if (var1 != Long.MAX_VALUE) {
         if (this.field772.contains(var1)) {
            return 0;
         } else {
            return !this.field782.contains(var1) && this.field776.method24830(var1) ? 1 : 2;
         }
      } else {
         return 2;
      }
   }

   @Override
   public int method696(long var1) {
      if (this.field773.contains(var1)) {
         return 2;
      } else {
         return !this.field772.contains(var1) && !this.field774.contains(var1) ? 2 : 0;
      }
   }

   @Override
   public void setLevel(long var1, int var3) {
      int var6 = this.getLevel(var1);
      if (var6 != 0 && var3 == 0) {
         this.field772.add(var1);
         this.field774.remove(var1);
      }

      if (var6 == 0 && var3 != 0) {
         this.field772.remove(var1);
         this.field773.remove(var1);
      }

      if (var6 >= 2 && var3 != 2) {
         if (!this.field782.contains(var1)) {
            this.field776.setArray(var1, this.method705(var1));
            this.field777.add(var1);
            this.method710(var1);

            for (int var7 = -1; var7 <= 1; var7++) {
               for (int var8 = -1; var8 <= 1; var8++) {
                  for (int var9 = -1; var9 <= 1; var9++) {
                     this.field778.add(SectionPos.worldToSection(BlockPos.method8327(var1, var8, var9, var7)));
                  }
               }
            }
         } else {
            this.field782.remove(var1);
         }
      }

      if (var6 != 2 && var3 >= 2) {
         this.field782.add(var1);
      }

      this.field783 = !this.field782.isEmpty();
   }

   public NibbleArray method705(long var1) {
      NibbleArray var5 = this.field779.get(var1);
      return var5 == null ? new NibbleArray() : var5;
   }

   public void method706(LightEngine<?, ?> var1, long var2) {
      if (var1.method677() >= 8192) {
         int var6 = SectionPos.method8406(SectionPos.method8407(var2));
         int var7 = SectionPos.method8406(SectionPos.method8408(var2));
         int var8 = SectionPos.method8406(SectionPos.method8409(var2));

         for (int var9 = 0; var9 < 16; var9++) {
            for (int var10 = 0; var10 < 16; var10++) {
               for (int var11 = 0; var11 < 16; var11++) {
                  long var12 = BlockPos.pack(var6 + var9, var7 + var10, var8 + var11);
                  var1.method668(var12);
               }
            }
         }
      } else {
         var1.method669(var2x -> SectionPos.worldToSection(var2x) == var2);
      }
   }

   public boolean hasSectionsToUpdate() {
      return this.field783;
   }

   public void updateSections(LightEngine<M, ?> var1, boolean var2, boolean var3) {
      if (this.hasSectionsToUpdate() || !this.field779.isEmpty()) {
         LongIterator var6 = this.field782.iterator();

         while (var6.hasNext()) {
            long var7 = (Long)var6.next();
            this.method706(var1, var7);
            NibbleArray var9 = (NibbleArray)this.field779.remove(var7);
            NibbleArray var10 = this.field776.method24832(var7);
            if (this.field781.contains(SectionPos.toSectionColumnPos(var7))) {
               if (var9 == null) {
                  if (var10 != null) {
                     this.field779.put(var7, var10);
                  }
               } else {
                  this.field779.put(var7, var9);
               }
            }
         }

         this.field776.method24834();
         var6 = this.field782.iterator();

         while (var6.hasNext()) {
            long var19 = (Long)var6.next();
            this.method711(var19);
         }

         this.field782.clear();
         this.field783 = false;

          for (Entry<NibbleArray> var11 : this.field779.long2ObjectEntrySet()) {
              long var12 = var11.getLongKey();
              if (this.hasSection(var12)) {
                  NibbleArray var22 = var11.getValue();
                  if (this.field776.method24831(var12) != var22) {
                      this.method706(var1, var12);
                      this.field776.setArray(var12, var22);
                      this.field777.add(var12);
                  }
              }
          }

         this.field776.method24834();
         if (var3) {
            var6 = this.field780.iterator();

            while (var6.hasNext()) {
               long var21 = (Long)var6.next();
               this.method709(var1, var21);
            }
         } else {
            var6 = this.field779.keySet().iterator();

            while (var6.hasNext()) {
               long var20 = (Long)var6.next();
               this.method709(var1, var20);
            }
         }

         this.field780.clear();
         ObjectIterator var18 = this.field779.long2ObjectEntrySet().iterator();

         while (var18.hasNext()) {
            Entry var23 = (Entry)var18.next();
            long var24 = var23.getLongKey();
            if (this.hasSection(var24)) {
               var18.remove();
            }
         }
      }
   }

   private void method709(LightEngine<M, ?> var1, long var2) {
      if (this.hasSection(var2)) {
         int var6 = SectionPos.method8406(SectionPos.method8407(var2));
         int var7 = SectionPos.method8406(SectionPos.method8408(var2));
         int var8 = SectionPos.method8406(SectionPos.method8409(var2));

         for (Direction var12 : field769) {
            long var13 = SectionPos.method8394(var2, var12);
            if (!this.field779.containsKey(var13) && this.hasSection(var13)) {
               for (int var15 = 0; var15 < 16; var15++) {
                  for (int var16 = 0; var16 < 16; var16++) {
                     long var17;
                     long var19;
                     switch (Class7449.field32049[var12.ordinal()]) {
                        case 1:
                           var17 = BlockPos.pack(var6 + var16, var7, var8 + var15);
                           var19 = BlockPos.pack(var6 + var16, var7 - 1, var8 + var15);
                           break;
                        case 2:
                           var17 = BlockPos.pack(var6 + var16, var7 + 16 - 1, var8 + var15);
                           var19 = BlockPos.pack(var6 + var16, var7 + 16, var8 + var15);
                           break;
                        case 3:
                           var17 = BlockPos.pack(var6 + var15, var7 + var16, var8);
                           var19 = BlockPos.pack(var6 + var15, var7 + var16, var8 - 1);
                           break;
                        case 4:
                           var17 = BlockPos.pack(var6 + var15, var7 + var16, var8 + 16 - 1);
                           var19 = BlockPos.pack(var6 + var15, var7 + var16, var8 + 16);
                           break;
                        case 5:
                           var17 = BlockPos.pack(var6, var7 + var15, var8 + var16);
                           var19 = BlockPos.pack(var6 - 1, var7 + var15, var8 + var16);
                           break;
                        default:
                           var17 = BlockPos.pack(var6 + 16 - 1, var7 + var15, var8 + var16);
                           var19 = BlockPos.pack(var6 + 16, var7 + var15, var8 + var16);
                     }

                     var1.method672(var17, var19, var1.getEdgeLevel(var17, var19, var1.getLevel(var17)), false);
                     var1.method672(var19, var17, var1.getEdgeLevel(var19, var17, var1.getLevel(var19)), false);
                  }
               }
            }
         }
      }
   }

   public void method710(long var1) {
   }

   public void method711(long var1) {
   }

   public void setColumnEnabled(long var1, boolean var3) {
   }

   public void retainChunkData(long var1, boolean var3) {
      if (!var3) {
         this.field781.remove(var1);
      } else {
         this.field781.add(var1);
      }
   }

   public void method714(long var1, NibbleArray var3, boolean var4) {
      if (var3 == null) {
         this.field779.remove(var1);
      } else {
         this.field779.put(var1, var3);
         if (!var4) {
            this.field780.add(var1);
         }
      }
   }

   public void updateSectionStatus(long var1, boolean var3) {
      boolean var6 = this.field772.contains(var1);
      if (!var6 && !var3) {
         this.field774.add(var1);
         this.method672(Long.MAX_VALUE, var1, 0, true);
      }

      if (var6 && var3) {
         this.field773.add(var1);
         this.method672(Long.MAX_VALUE, var1, 2, false);
      }
   }

   public void processAllLevelUpdates() {
      if (this.needsUpdate()) {
         this.processUpdates(Integer.MAX_VALUE);
      }
   }

   public void updateAndNotify() {
      if (!this.field777.isEmpty()) {
         LightDataMap var3 = this.field776.method24828();
         var3.method24835();
         this.field775 = (M)var3;
         this.field777.clear();
      }

      if (!this.field778.isEmpty()) {
         LongIterator var6 = this.field778.iterator();

         while (var6.hasNext()) {
            long var4 = var6.nextLong();
            this.field771.method7373(this.field770, SectionPos.method8393(var4));
         }

         this.field778.clear();
      }
   }
}
