package mapped;

import com.mentalfrostbyte.jello.module.impl.combat.BowAimbot;
import net.minecraft.entity.Entity;

import java.util.Comparator;

public class Class3610 implements Comparator<Entity> {
   private static String[] field19577;
   public final BowAimbot field19578;

   public Class3610(BowAimbot var1) {
      this.field19578 = var1;
   }

   public int compare(Entity var1, Entity var2) {
      return !(BowAimbot.method16572().player.method3275(var1) > BowAimbot.method16573().player.method3275(var2)) ? -1 : 1;
   }
}
