// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class8338
{
    private static String[] field34233;
    private float field34234;
    private final Class2315 field34235;
    private final Class6057 field34236;
    private long field34237;
    private boolean field34238;
    private float field34239;
    
    public Class8338() {
        this.field34235 = new Class2315();
        this.field34236 = new Class6057(this);
        this.field34238 = false;
        this.field34239 = -1.0f;
        this.field34236.method18021();
        this.field34237 = this.field34235.nextInt(8000, 10000);
        this.field34234 = this.field34235.nextFloat();
    }
    
    public void method27790() {
        if (this.field34236.method18024() > this.field34237) {
            this.field34237 = this.field34235.nextInt(8000, 10000);
            this.field34238 = true;
            this.field34239 = this.field34235.nextFloat() + 0.75f;
            if (this.field34235.nextBoolean()) {
                this.field34239 *= -1.0f;
            }
            this.field34236.method18023();
        }
        if (this.field34238) {
            if (this.field34239 != -1.0f) {
                if (this.field34236.method18024() % 10L == 0L) {
                    if (this.field34239 <= this.field34234) {
                        this.field34234 -= 0.02f;
                        if (this.field34239 > this.field34234) {
                            this.field34234 = this.field34239;
                            this.field34238 = false;
                            this.field34239 = -1.0f;
                        }
                    }
                    else {
                        this.field34234 += 0.02f;
                        if (this.field34239 < this.field34234) {
                            this.field34234 = this.field34239;
                            this.field34238 = false;
                            this.field34239 = -1.0f;
                        }
                    }
                }
            }
        }
    }
    
    public float method27791() {
        return this.field34234;
    }
}
