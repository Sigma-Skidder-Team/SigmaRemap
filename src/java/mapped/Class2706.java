// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class2706 extends Class2466
{
    public final /* synthetic */ Class2973 field14868;
    
    public Class2706(final Class2973 field14868) {
        this.field14868 = field14868;
    }
    
    @Override
    public void method9802(final Class8699 class8699) throws Exception {
        final byte byteValue = class8699.method29818(Class5260.field22289, 0);
        if (byteValue == 0 || byteValue == 2) {
            class8699.method29824(Class5260.field22308);
            class8699.method29824(Class5260.field22308);
            class8699.method29824(Class5260.field22308);
            class8699.method29824(Class5260.field22289);
            class8699.method29824(Class5260.field22308);
            class8699.method29823(Class5260.field22308, Class8563.method28792().method23263() ? "never" : "");
            class8699.method29824(Class5260.field22289);
        }
        Label_0202: {
            if (byteValue != 0) {
                if (byteValue != 3) {
                    if (byteValue != 4) {
                        break Label_0202;
                    }
                }
            }
            final String[] array = class8699.method29824(Class5260.field22309);
            final Class6634 class8700 = class8699.method29841().method18207(Class6634.class);
            final String method20209 = class8699.method29841().method18207(Class6651.class).method20209();
            final String s = class8699.method29818(Class5260.field22308, 0);
            for (final String s2 : array) {
                if (class8700.method20109()) {
                    if (s2.equalsIgnoreCase(method20209)) {
                        if (byteValue != 4) {
                            class8700.method20095(false, true);
                            class8700.method20120(s);
                        }
                        else {
                            class8699.method29831(Class5224.class, true, true);
                            class8699.method29839();
                            class8700.method20095(true, true);
                            class8700.method20120("viaversion");
                        }
                    }
                }
            }
        }
        if (byteValue == 1) {
            final Class6634 class8701 = class8699.method29841().method18207(Class6634.class);
            final String s3 = class8699.method29818(Class5260.field22308, 0);
            if (class8701.method20109()) {
                if (s3.equals(class8701.method20114())) {
                    class8699.method29831(Class5224.class, true, true);
                    class8699.method29839();
                    class8701.method20095(true, true);
                    class8701.method20120("viaversion");
                }
            }
        }
    }
}
