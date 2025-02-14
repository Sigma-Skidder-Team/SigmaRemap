package mapped;

public class AnimationManager {
   private float currentValue;
   private final RandomIntGenerator random = new RandomIntGenerator();
   private final Timer fieldTimer = new Timer(this);
   private long nextInterval;
   private boolean isAnimating = false;
   private float targetValue = -1.0F;

   public AnimationManager() {
      this.fieldTimer.method32437();
      this.nextInterval = (long)this.random.nextInt(8000, 10000);
      this.currentValue = this.random.nextFloat();
   }

   public void method38061() {
      if (this.fieldTimer.method32440() > this.nextInterval) {
         this.nextInterval = (long)this.random.nextInt(8000, 10000);
         this.isAnimating = true;
         this.targetValue = this.random.nextFloat() + 0.75F;
         boolean var3 = this.random.nextBoolean();
         if (var3) {
            this.targetValue *= -1.0F;
         }

         this.fieldTimer.method32439();
      }

      if (this.isAnimating && this.targetValue != -1.0F && this.fieldTimer.method32440() % 10L == 0L) {
         if (!(this.targetValue > this.currentValue)) {
            this.currentValue -= 0.02F;
            if (this.targetValue > this.currentValue) {
               this.currentValue = this.targetValue;
               this.isAnimating = false;
               this.targetValue = -1.0F;
            }
         } else {
            this.currentValue += 0.02F;
            if (this.targetValue < this.currentValue) {
               this.currentValue = this.targetValue;
               this.isAnimating = false;
               this.targetValue = -1.0F;
            }
         }
      }
   }

   public float method38062() {
      return this.currentValue;
   }
}
