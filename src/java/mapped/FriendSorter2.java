package mapped;

import com.mentalfrostbyte.Client;
import net.minecraft.entity.Entity;

import java.util.Comparator;

public class FriendSorter2 implements Comparator<TimedEntity> {
    public final InteractAutoBlock interactAB;

   public FriendSorter2(InteractAutoBlock interactAB) {
      this.interactAB = interactAB;
   }

   public int compare(TimedEntity sortingEntity1, TimedEntity sortingEntity2) {
      Entity entity1 = sortingEntity1.getEntity();
      Entity entity2 = sortingEntity2.getEntity();
      boolean friended1 = Client.getInstance().getFriendManager().isFriend(entity1);
      boolean friended2 = Client.getInstance().getFriendManager().isFriend(entity2);
      if (friended1 && !friended2) {
         return -1;
      } else {
         return friended1 && friended2 ? 0 : 1;
      }
   }
}
