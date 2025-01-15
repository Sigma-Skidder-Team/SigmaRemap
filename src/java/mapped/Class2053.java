// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Function;

public enum Class2053
{
    field11712("this", (Class7915<T>)Class6683.field26362, (Function<? super T, Class41>)Class147.method718()), 
    field11713("killer", (Class7915<T>)Class6683.field26365, (Function<? super T, Class41>)Class147.method718()), 
    field11714("killer_player", (Class7915<T>)Class6683.field26363, (Function<? super T, Class41>)Class147.method718()), 
    field11715("block_entity", (Class7915<T>)Class6683.field26369, (Function<? super T, Class41>)Class147.method719());
    
    public final String field11716;
    public final Class7915<?> field11717;
    public final Function<Class7529, Class41> field11718;
    
    private <T> Class2053(final String field11716, final Class7915<T> field11717, final Function<? super T, Class41> function) {
        this.field11716 = field11716;
        this.field11717 = field11717;
        this.field11718 = (Function<Class7529, Class41>)(class7917 -> {
            class7917.method23579((Class7915<Object>)class7915);
            final Object o;
            return (o == null) ? null : function2.apply(o);
        });
    }
    
    public static Class2053 method8146(final String s) {
        for (final Class2053 class2053 : values()) {
            if (class2053.field11716.equals(s)) {
                return class2053;
            }
        }
        throw new IllegalArgumentException("Invalid tag source " + s);
    }
}
