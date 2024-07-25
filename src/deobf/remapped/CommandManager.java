package remapped;

import java.util.ArrayList;
import java.util.List;

public class CommandManager {
   public List<Command> commandList = new ArrayList<Command>();
   public static final String commandChatActivator = ".";
   public static final String commandPrefix = "§f[§6Sigma§f]§7";
   private boolean usePrefix = true;
   private static List<Runnable> field_25600 = new ArrayList<Runnable>();

   public void method_22654() {
      SigmaMainClass.getInstance().getEventManager().subscribe(this);
      this.addCommand(new VClipCommand());
      this.addCommand(new HClipCommand());
      this.addCommand(new SelfDamageCommand());
      this.addCommand(new ClearChatCommand());
      this.addCommand(new EntityDesyncCommand());
      this.addCommand(new ShulkerPeekCommand());
      this.addCommand(new InsultCommand());
      this.addCommand(new BindCommand());
      this.addCommand(new HelpCommand());
      this.addCommand(new FriendCommand());
      this.addCommand(new EnemyCommand());
      this.addCommand(new ToggleCommand());
      this.addCommand(new ConfigCommand());
      this.addCommand(new PanicCommand());
      this.addCommand(new HighDPICommand());
      this.addCommand(new KillPotionCommand());
      this.addCommand(new EnchantCommand());
      this.addCommand(new TeleportCommand());
   }

   public Command getCommandByName(String command) {
      for (Command command1 : this.commandList) {
         if (command1.method_17258().equals(command)) {
            return command1;
         }
      }

      for (Command var11 : this.commandList) {
         for (String var9 : var11.method_17254()) {
            if (var9.equals(command)) {
               return var11;
            }
         }
      }

      return null;
   }

   public List<Command> getCommandList() {
      return this.commandList;
   }

   private void addCommand(Command var1) {
      this.commandList.add(var1);
   }

   public void invalidCommandUsage(String var1) {
      class_314.method_1443(this.getCommandPrefix() + " Invalid command \"" + "." + var1 + "\"");
      class_314.method_1443(this.getCommandPrefix() + " Use \"" + "." + "help\" for a list of commands.");
   }

   public String getCommandPrefix() {
      if (this.usePrefix) {
         this.usePrefix = false;
         return "§f[§6Sigma§f]§7";
      } else {
         String var3 = "";

         for (int var4 = 0; var4 < 8; var4++) {
            var3 = var3 + " ";
         }

         return var3 + "§7";
      }
   }

   public void usePrefix() {
      this.usePrefix = true;
   }

   public static void method_22657(Runnable var0) {
      field_25600.add(var0);
   }
}
