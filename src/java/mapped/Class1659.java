package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.world.IWorld;
import net.minecraft.world.server.ServerWorld;

public interface Class1659 extends IWorld {
   ServerWorld method6970();

   default void method6995(Entity var1) {
      var1.method3412().forEach(this::addEntity);
   }
}
