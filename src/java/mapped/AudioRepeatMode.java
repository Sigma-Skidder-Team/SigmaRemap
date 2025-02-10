package mapped;

public enum AudioRepeatMode {
   NO_REPEAT(0),
   REPEAT(1),
   LOOP_CURRENT(2);

   public int field719;
   private static final AudioRepeatMode[] field720 = new AudioRepeatMode[]{NO_REPEAT, REPEAT, LOOP_CURRENT};

   private AudioRepeatMode(int var3) {
      this.field719 = var3;
   }

   public AudioRepeatMode method577() {
      for (AudioRepeatMode var6 : values()) {
         if (var6.field719 == this.field719 + 1) {
            return var6;
         }
      }

      return NO_REPEAT;
   }

   public static AudioRepeatMode method578(int var0) {
      for (AudioRepeatMode var6 : values()) {
         if (var6.field719 == var0) {
            return var6;
         }
      }

      return REPEAT;
   }
}
