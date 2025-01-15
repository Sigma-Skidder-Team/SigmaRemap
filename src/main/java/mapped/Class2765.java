// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class2765 extends Class2437
{
    private static String[] field14970;
    public final /* synthetic */ Class2999 field14971;
    
    public Class2765(final Class2999 field14971) {
        this.field14971 = field14971;
    }
    
    @Override
    public void method9788(final Class8699 class8699) throws Exception {
        class8699.method29823(Class5260.field22294, false);
        class8699.method29823(Class5260.field22326, null);
        if (!class8699.method29840()) {
            if (Class8563.method28792().method23305() > 0) {
                final Class6654 class8700 = class8699.method29841().method18207(Class6654.class);
                class8699.method29839();
                class8700.method20235(System.currentTimeMillis() + Class8563.method28792().method23305() * 50);
                class8700.method20234(class8699.method29818(Class5260.field22308, 0));
            }
        }
    }
}
