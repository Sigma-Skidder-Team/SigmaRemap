package club.minnced.discord.rpc;

import com.sun.jna.Library;
import com.sun.jna.Native;

public interface DiscordRPC extends Library {
   DiscordRPC INSTANCE = Native.<DiscordRPC>loadLibrary("discord-rpc", DiscordRPC.class);
   int DISCORD_REPLY_NO = 0;
   int DISCORD_REPLY_YES = 1;
   int DISCORD_REPLY_IGNORE = 2;

   void Discord_Initialize(String var1, DiscordEventHandlers var2, boolean var3, String var4);

   void Discord_Shutdown();

   void Discord_RunCallbacks();

   void Discord_UpdateConnection();

   void Discord_UpdatePresence(DiscordRichPresence var1);

   void Discord_ClearPresence();

   void Discord_Respond(String var1, int var2);

   void Discord_UpdateHandlers(DiscordEventHandlers var1);

   void Discord_Register(String var1, String var2);

   void Discord_RegisterSteamGame(String var1, String var2);
}
