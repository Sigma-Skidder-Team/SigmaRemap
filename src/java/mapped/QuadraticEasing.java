package mapped;

public class QuadraticEasing {

    public static float easeInQuad(float progress, float start, float change, float duration) {
        float ratio;
        return change * (ratio = progress / duration) * ratio + start;
    }

    public static float easeOutQuad(float progress, float start, float change, float duration) {
        float ratio;
        return -change * (ratio = progress / duration) * (ratio - 2.0F) + start;
    }

    public static float easeInOutQuad(float progress, float start, float change, float duration) {
        float ratio;
        return !((ratio = progress / (duration / 2.0F)) < 1.0F)
                ? -change / 2.0F * (--ratio * (ratio - 2.0F) - 1.0F) + start
                : change / 2.0F * ratio * ratio + start;
    }
}
