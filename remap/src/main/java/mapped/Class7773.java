// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class7773
{
    private static String[] field31827;
    private static final int field31828 = 327670;
    private final byte[] field31829;
    private final Class1746 field31830;
    private long field31831;
    private long field31832;
    private boolean field31833;
    
    public Class7773(final Class1746 field31830) {
        this.field31830 = field31830;
        this.field31829 = new byte[327670];
        this.field31831 = 0L;
        this.field31832 = 0L;
        this.field31833 = true;
    }
    
    public void method24888() {
        this.field31833 = false;
    }
    
    public boolean method24889() {
        return this.field31833;
    }
    
    public int method24890() {
        return (int)(this.field31832 - this.field31831);
    }
    
    public int method24891() {
        return 327670 - this.method24890();
    }
    
    private int method24892() {
        return (int)(this.field31831 % 327670L);
    }
    
    private int method24893() {
        return (int)(this.field31832 % 327670L);
    }
    
    public int method24894(final byte[] array) {
        return this.method24895(array, 0, array.length);
    }
    
    public int method24895(final byte[] array, int n, int min) {
        if (!this.method24889()) {
            if (this.method24890() <= 0) {
                return -1;
            }
            min = Math.min(min, this.method24890());
        }
        synchronized (this) {
            if (this.field31830 != null && this.method24890() < min) {
                this.field31830.method6177();
            }
            int i;
            min = (i = Math.min(this.method24890(), min));
            while (i > 0) {
                while (this.method24890() == 0) {
                    try {
                        this.wait();
                    }
                    catch (final InterruptedException ex) {}
                }
                int min2;
                for (int j = Math.min(this.method24890(), i); j > 0; j -= min2, i -= min2) {
                    min2 = Math.min(j, 327670 - this.method24892());
                    System.arraycopy(this.field31829, this.method24892(), array, n, min2);
                    this.field31831 += min2;
                    n += min2;
                }
                this.notifyAll();
            }
            return min;
        }
    }
    
    public int method24896(final byte[] array) {
        return this.method24897(array, 0, array.length);
    }
    
    public int method24897(final byte[] array, int n, final int n2) {
        synchronized (this) {
            int i = n2;
            while (i > 0) {
                while (this.method24891() == 0) {
                    try {
                        this.wait();
                    }
                    catch (final InterruptedException ex) {}
                }
                int min;
                for (int j = Math.min(this.method24891(), i); j > 0; j -= min, i -= min) {
                    min = Math.min(j, 327670 - this.method24893());
                    System.arraycopy(array, n, this.field31829, this.method24893(), min);
                    this.field31832 += min;
                    n += min;
                }
                this.notifyAll();
            }
            return n2;
        }
    }
}
