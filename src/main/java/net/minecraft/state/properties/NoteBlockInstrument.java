package net.minecraft.state.properties;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.material.Material;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

public enum NoteBlockInstrument implements IStringSerializable {
   HARP("harp", SoundEvents.BLOCK_NOTE_BLOCK_HARP),
   BASEDRUM("basedrum", SoundEvents.BLOCK_NOTE_BLOCK_BASEDRUM),
   SNARE("snare", SoundEvents.BLOCK_NOTE_BLOCK_SNARE),
   HAT("hat", SoundEvents.BLOCK_NOTE_BLOCK_HAT),
   BASS("bass", SoundEvents.BLOCK_NOTE_BLOCK_BASS),
   FLUTE("flute", SoundEvents.BLOCK_NOTE_BLOCK_FLUTE),
   BELL("bell", SoundEvents.BLOCK_NOTE_BLOCK_BELL),
   GUITAR("guitar", SoundEvents.BLOCK_NOTE_BLOCK_GUITAR),
   CHIME("chime", SoundEvents.BLOCK_NOTE_BLOCK_CHIME),
   XYLOPHONE("xylophone", SoundEvents.BLOCK_NOTE_BLOCK_XYLOPHONE),
   IRON_XYLOPHONE("iron_xylophone", SoundEvents.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE),
   COW_BELL("cow_bell", SoundEvents.BLOCK_NOTE_BLOCK_COW_BELL),
   DIDGERIDOO("didgeridoo", SoundEvents.BLOCK_NOTE_BLOCK_DIDGERIDOO),
   BIT("bit", SoundEvents.BLOCK_NOTE_BLOCK_BIT),
   BANJO("banjo", SoundEvents.BLOCK_NOTE_BLOCK_BANJO),
   PLING("pling", SoundEvents.BLOCK_NOTE_BLOCK_PLING);

   private final String name;
   private final SoundEvent sound;

   private NoteBlockInstrument(String name, SoundEvent sound) {
      this.name = name;
      this.sound = sound;
   }

   @Override
   public String getString() {
      return this.name;
   }

   public SoundEvent getSound() {
      return this.sound;
   }

   public static NoteBlockInstrument byState(BlockState state) {
      if (!state.isIn(Blocks.CLAY)) {
         if (state.isIn(Blocks.GOLD_BLOCK)) {
            return BELL;
         } else if (!state.isIn(BlockTags.WOOL)) {
            if (state.isIn(Blocks.PACKED_ICE)) {
               return CHIME;
            } else if (!state.isIn(Blocks.BONE_BLOCK)) {
               if (state.isIn(Blocks.IRON_BLOCK)) {
                  return IRON_XYLOPHONE;
               } else if (!state.isIn(Blocks.SOUL_SAND)) {
                  if (state.isIn(Blocks.PUMPKIN)) {
                     return DIDGERIDOO;
                  } else if (!state.isIn(Blocks.EMERALD_BLOCK)) {
                     if (state.isIn(Blocks.HAY_BLOCK)) {
                        return BANJO;
                     } else if (!state.isIn(Blocks.GLOWSTONE)) {
                        Material var3 = state.getMaterial();
                        if (var3 == Material.ROCK) {
                           return BASEDRUM;
                        } else if (var3 != Material.SAND) {
                           if (var3 == Material.GLASS) {
                              return HAT;
                           } else {
                              return var3 != Material.WOOD && var3 != Material.NETHER_WOOD ? HARP : BASS;
                           }
                        } else {
                           return SNARE;
                        }
                     } else {
                        return PLING;
                     }
                  } else {
                     return BIT;
                  }
               } else {
                  return COW_BELL;
               }
            } else {
               return XYLOPHONE;
            }
         } else {
            return GUITAR;
         }
      } else {
         return FLUTE;
      }
   }
}
