package net.minecraft.util.text;

public enum ChatType {
   CHAT((byte)0, false),
   SYSTEM((byte)1, true),
   GAME_INFO((byte)2, true);

   private final byte id;
   private final boolean field_218691_e;
   private static final ChatType[] $VALUES = new ChatType[]{CHAT, SYSTEM, GAME_INFO};

   private ChatType(byte p_i50783_3_, boolean p_i50783_4_) {
      this.id = p_i50783_3_;
      this.field_218691_e = p_i50783_4_;
   }

   public byte getId() {
      return this.id;
   }

   public static ChatType byId(byte idIn) {
      for (ChatType var6 : values()) {
         if (idIn == var6.id) {
            return var6;
         }
      }

      return CHAT;
   }

   public boolean getInterrupts() {
      return this.field_218691_e;
   }
}
