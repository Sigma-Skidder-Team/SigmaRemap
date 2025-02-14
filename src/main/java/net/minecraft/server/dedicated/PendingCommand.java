package net.minecraft.server.dedicated;

import net.minecraft.command.CommandSource;

public class PendingCommand {
   private static String[] field43315;
   public final String field43316;
   public final CommandSource field43317;

   public PendingCommand(String var1, CommandSource var2) {
      this.field43316 = var1;
      this.field43317 = var2;
   }
}
