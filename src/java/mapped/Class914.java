package mapped;

import net.minecraft.command.CommandSource;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.server.ServerWorld;

import java.util.UUID;

public class Class914 implements ICommandSource {
   private static final StringTextComponent field5204 = new StringTextComponent("Rcon");
   private final StringBuffer field5205 = new StringBuffer();
   private final MinecraftServer field5206;

   public Class914(MinecraftServer var1) {
      this.field5206 = var1;
   }

   public void resetLog() {
      this.field5205.setLength(0);
   }

   public String getLogContents() {
      return this.field5205.toString();
   }

   public CommandSource getCommandSource() {
      ServerWorld var3 = this.field5206.getServerWorld();
      return new CommandSource(this, Vector3d.copy(var3.getSpawnPoint()), Vector2f.ZERO, var3, 4, "Rcon", field5204, this.field5206, (Entity)null);
   }

   @Override
   public void sendMessage(ITextComponent var1, UUID var2) {
      this.field5205.append(var1.getString());
   }

   @Override
   public boolean method1405() {
      return true;
   }

   @Override
   public boolean method1406() {
      return true;
   }

   @Override
   public boolean method3425() {
      return this.field5206.method1290();
   }
}
