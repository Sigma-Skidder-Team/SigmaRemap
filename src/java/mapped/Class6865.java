package mapped;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.network.PacketBuffer;

@Deprecated
public interface Class6865<T extends Class7436> {
   T method20913(Class7434<T> var1, StringReader var2) throws CommandSyntaxException;

   T method20912(Class7434<T> var1, PacketBuffer var2);
}
