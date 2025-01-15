// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class7287 implements Class7284
{
    private static String[] field28234;
    public final /* synthetic */ Class7284 field28235;
    
    public Class7287(final Class7284 field28235) {
        this.field28235 = field28235;
    }
    
    @Override
    public void method22343(final Object o) {
        if (!(o instanceof String)) {
            final String value = String.valueOf(((byte[])o).length);
            final byte[] array = new byte[value.length() + 2];
            array[0] = 1;
            for (int i = 0; i < value.length(); ++i) {
                array[i + 1] = (byte)Character.getNumericValue(value.charAt(i));
            }
            array[array.length - 1] = -1;
            this.field28235.method22343(Class7839.method25324(new byte[][] { array, (byte[])o }));
            return;
        }
        final String value2 = String.valueOf(((String)o).length());
        final byte[] array2 = new byte[value2.length() + 2];
        array2[0] = 0;
        for (int j = 0; j < value2.length(); ++j) {
            array2[j + 1] = (byte)Character.getNumericValue(value2.charAt(j));
        }
        array2[array2.length - 1] = -1;
        this.field28235.method22343(Class7839.method25324(new byte[][] { array2, Class8128.method26788((String)o) }));
    }
}
