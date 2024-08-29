package mapped;

public class BackgroundMusicTracks {
   private static String[] field33270;
   public static final BackgroundMusicSelector MAIN_MENU_MUSIC = new BackgroundMusicSelector(Class6067.field26794, 20, 600, true);
   public static final BackgroundMusicSelector CREATIVE_MODE_MUSIC = new BackgroundMusicSelector(Class6067.field26776, 12000, 24000, false);
   public static final BackgroundMusicSelector CREDITS_MUSIC = new BackgroundMusicSelector(Class6067.field26777, 0, 0, true);
   public static final BackgroundMusicSelector DRAGON_FIGHT_MUSIC = new BackgroundMusicSelector(Class6067.field26791, 0, 0, true);
   public static final BackgroundMusicSelector END_MUSIC = new BackgroundMusicSelector(Class6067.field26792, 6000, 24000, true);
   public static final BackgroundMusicSelector UNDER_WATER_MUSIC = method25672(Class6067.field26800);
   public static final BackgroundMusicSelector WORLD_MUSIC = method25672(Class6067.field26793);

   public static BackgroundMusicSelector method25672(Class9455 var0) {
      return new BackgroundMusicSelector(var0, 12000, 24000, false);
   }
}
