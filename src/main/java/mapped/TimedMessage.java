package mapped;

public class TimedMessage {
   private final long expirationTime;
   private final String message;

   public TimedMessage(String message, long durationMillis) {
      this.message = message;
      this.expirationTime = System.currentTimeMillis() + durationMillis;
   }

   public boolean hasExpired() {
      return this.getRemainingTime() < 0L;
   }

   public long getRemainingTime() {
      return this.expirationTime - System.currentTimeMillis();
   }

   public String getMessage() {
      return this.message;
   }
}
