package mapped;

public class ExpirationTimer {
    private long expirationTime;

   public ExpirationTimer(long duration) {
      this.expirationTime = System.currentTimeMillis() + duration;
   }

   public boolean hasExpired() {
      return this.expirationTime - System.currentTimeMillis() < 0L;
   }
}
