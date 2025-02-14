package mapped;

import net.minecraft.entity.Entity;

public class TimedEntity {
   private Entity entity;
   private ExpirationTimer expirationTimer;

   public TimedEntity(Entity entity) {
      this.entity = entity;
      this.expirationTimer = null;
   }

   public TimedEntity(Entity entity, ExpirationTimer timer) {
      this.entity = entity;
      this.expirationTimer = timer;
   }

   public Entity getEntity() {
      return this.entity;
   }

   public boolean isExpired() {
      return this.expirationTimer != null && this.expirationTimer.hasExpired();
   }

   public ExpirationTimer getTimer() {
      return this.expirationTimer;
   }

   @Override
   public boolean equals(Object obj) {
      if (obj != this) {
         return obj instanceof TimedEntity ? ((TimedEntity)obj).getEntity() == this.getEntity() : false;
      } else {
         return true;
      }
   }
}
