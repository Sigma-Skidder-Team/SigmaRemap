// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6171 extends Class6159
{
    private static String[] field24929;
    
    private Class6171(final Class1847 class1847, final double n, final double n2, final double n3) {
        super(class1847, n, n2 - 0.125, n3);
        this.field24953 = 0.4f;
        this.field24954 = 0.4f;
        this.field24955 = 0.7f;
        this.method18440(0.01f, 0.01f);
        this.field24930 *= this.field24949.nextFloat() * 0.6f + 0.2f;
        this.field24951 = (int)(16.0 / (Math.random() * 0.8 + 0.2));
    }
    
    @Override
    public Class6451 method18418() {
        return Class6451.field25659;
    }
    
    @Override
    public void method18420() {
        this.field24933 = this.field24936;
        this.field24934 = this.field24937;
        this.field24935 = this.field24938;
        if (this.field24951-- > 0) {
            this.method18431(this.field24939, this.field24940, this.field24941);
            if (!this.field24932.method6702(new BlockPos(this.field24936, this.field24937, this.field24938)).method21793(Class7324.field28319)) {
                this.method18439();
            }
        }
        else {
            this.method18439();
        }
    }
}
