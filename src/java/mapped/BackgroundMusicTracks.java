package mapped;

import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

public class BackgroundMusicTracks {
   private static String[] field33270;
   public static final BackgroundMusicSelector MAIN_MENU_MUSIC = new BackgroundMusicSelector(SoundEvents.field26794, 20, 600, true);
   public static final BackgroundMusicSelector CREATIVE_MODE_MUSIC = new BackgroundMusicSelector(SoundEvents.field26776, 12000, 24000, false);
   public static final BackgroundMusicSelector CREDITS_MUSIC = new BackgroundMusicSelector(SoundEvents.field26777, 0, 0, true);
   public static final BackgroundMusicSelector DRAGON_FIGHT_MUSIC = new BackgroundMusicSelector(SoundEvents.field26791, 0, 0, true);
   public static final BackgroundMusicSelector END_MUSIC = new BackgroundMusicSelector(SoundEvents.field26792, 6000, 24000, true);
   public static final BackgroundMusicSelector UNDER_WATER_MUSIC = method25672(SoundEvents.field26800);
   public static final BackgroundMusicSelector WORLD_MUSIC = method25672(SoundEvents.field26793);

   public static BackgroundMusicSelector method25672(SoundEvent var0) {
      return new BackgroundMusicSelector(var0, 12000, 24000, false);
   }
}
