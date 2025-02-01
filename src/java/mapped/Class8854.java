package mapped;

import com.mentalfrostbyte.jello.util.MultiUtilities;

import java.awt.*;

public class Class8854 {
    private float field40025;
    public float field40027;
    public float field40028;
    public float field40029;
    private float field40032;
    private final RandomIntGenerator random = new RandomIntGenerator();
    public float field40036;
    public Color field40037 = new Color(1.0F, 1.0F, 1.0F, 0.5F);

    public Class8854(float var1, float var2) {
        this.field40027 = this.field40025 = var1;
        this.field40028 = var2;
        this.field40029 = (float) this.random.nextInt(1, 3) + this.random.nextFloat();
        this.method32234();
    }

    private void method32234() {
        float field40034 = 1.0F;
        this.field40032 = this.random.nextFloat() % field40034;
        this.field40036 = this.random.nextFloat() / 2.0F;
        if (this.random.nextBoolean()) {
            this.field40036 *= -1.0F;
        }
    }

    public void method32235(float var1) {
        RenderUtil.method11438(
                this.field40027 * 2.0F, this.field40028 * 2.0F, this.field40029 * 2.0F, MultiUtilities.applyAlpha(this.field40037.getRGB(), var1 * 0.7F)
        );
    }

    public void method32236(AnimationManager var1) {
        this.field40027 = this.field40027 + var1.method38062() + this.field40036;
        this.field40025 = this.field40025 + var1.method38062() + this.field40036;
        this.field40028 = this.field40028 + this.field40032;
    }
}
