package net.minecraft.state.properties;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.material.Material;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

public enum NoteBlockInstrument implements IStringSerializable {
   field347("harp", SoundEvents.field26854),
   field348("basedrum", SoundEvents.field26848),
   field349("snare", SoundEvents.field26857),
   field350("hat", SoundEvents.field26855),
   field351("bass", SoundEvents.field26849),
   field352("flute", SoundEvents.field26852),
   field353("bell", SoundEvents.field26850),
   field354("guitar", SoundEvents.field26853),
   field355("chime", SoundEvents.field26851),
   field356("xylophone", SoundEvents.field26858),
   field357("iron_xylophone", SoundEvents.field26859),
   field358("cow_bell", SoundEvents.field26860),
   field359("didgeridoo", SoundEvents.field26861),
   field360("bit", SoundEvents.field26862),
   field361("banjo", SoundEvents.field26863),
   field362("pling", SoundEvents.field26856);

   private final String field363;
   private final SoundEvent field364;
   private static final NoteBlockInstrument[] field365 = new NoteBlockInstrument[]{
      field347,
      field348,
      field349,
      field350,
      field351,
      field352,
      field353,
      field354,
      field355,
      field356,
      field357,
      field358,
      field359,
      field360,
      field361,
      field362
   };

   private NoteBlockInstrument(String var3, SoundEvent var4) {
      this.field363 = var3;
      this.field364 = var4;
   }

   @Override
   public String getString() {
      return this.field363;
   }

   public SoundEvent method299() {
      return this.field364;
   }

   public static NoteBlockInstrument method300(BlockState var0) {
      if (!var0.isIn(Blocks.CLAY)) {
         if (var0.isIn(Blocks.GOLD_BLOCK)) {
            return field353;
         } else if (!var0.isIn(BlockTags.field32734)) {
            if (var0.isIn(Blocks.PACKED_ICE)) {
               return field355;
            } else if (!var0.isIn(Blocks.field36893)) {
               if (var0.isIn(Blocks.IRON_BLOCK)) {
                  return field357;
               } else if (!var0.isIn(Blocks.SOUL_SAND)) {
                  if (var0.isIn(Blocks.PUMPKIN)) {
                     return field359;
                  } else if (!var0.isIn(Blocks.EMERALD_BLOCK)) {
                     if (var0.isIn(Blocks.field36777)) {
                        return field361;
                     } else if (!var0.isIn(Blocks.GLOWSTONE)) {
                        Material var3 = var0.getMaterial();
                        if (var3 == Material.STONE) {
                           return field348;
                        } else if (var3 != Material.field38953) {
                           if (var3 == Material.field38963) {
                              return field350;
                           } else {
                              return var3 != Material.PLANKS && var3 != Material.field38957 ? field347 : field351;
                           }
                        } else {
                           return field349;
                        }
                     } else {
                        return field362;
                     }
                  } else {
                     return field360;
                  }
               } else {
                  return field358;
               }
            } else {
               return field356;
            }
         } else {
            return field354;
         }
      } else {
         return field352;
      }
   }
}
