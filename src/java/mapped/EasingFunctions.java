package mapped;

public class EasingFunctions {

   public static float easeInBack(float progress, float start, float change, float duration) {
      float s = 1.70158F;
      float ratio;
      return change * (ratio = progress / duration) * ratio * ((s + 1.0F) * ratio - s) + start;
   }

   public static float easeInCustomBack(float progress, float start, float change, float duration, float overshoot) {
      float ratio;
      return change * (ratio = progress / duration) * ratio * ((overshoot + 1.0F) * ratio - overshoot) + start;
   }

   public static float easeOutBack(float progress, float start, float change, float duration) {
      float s = 1.70158F;
      float ratio;
      return change * ((ratio = progress / duration - 1.0F) * ratio * ((s + 1.0F) * ratio + s) + 1.0F) + start;
   }

   public static float easeOutCustomBack(float progress, float start, float change, float duration, float overshoot) {
      float ratio;
      return change * ((ratio = progress / duration - 1.0F) * ratio * ((overshoot + 1.0F) * ratio + overshoot) + 1.0F) + start;
   }

   public static float easeInOutBack(float progress, float start, float change, float duration) {
      float s = 1.70158F;
      float ratio;
      float s2;
      return !((ratio = progress / (duration / 2.0F)) < 1.0F)
              ? change / 2.0F * ((s2 = ratio - 2.0F) * s2 * (((s * 1.525F) + 1.0F) * s2 + s * 1.525F) + 2.0F) + start
              : change / 2.0F * ratio * ratio * (((s * 1.525F) + 1.0F) * ratio - s * 1.525F) + start;
   }

   public static float easeInOutCustomBack(float progress, float start, float change, float duration, float overshoot) {
      float ratio;
      float s2;
      float overshoot2;
      return !((ratio = progress / (duration / 2.0F)) < 1.0F)
              ? change / 2.0F * ((s2 = ratio - 2.0F) * s2 * (((overshoot * 1.525F) + 1.0F) * s2 + overshoot * 1.525F) + 2.0F) + start
              : change / 2.0F * ratio * ratio * (((overshoot * 1.525F) + 1.0F) * ratio - overshoot * 1.525F) + start;
   }
}
