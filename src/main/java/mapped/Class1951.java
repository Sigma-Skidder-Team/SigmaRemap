// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1951 implements Comparable<Class1951>
{
    private static String[] field10626;
    private final Class1934 field10627;
    
    public Class1951(final Class1934 field10627) {
        this.field10627 = field10627;
    }
    
    public int method7932() {
        return this.field10627.method7813().method585();
    }
    
    public String method7933() {
        return this.field10627.method7808();
    }
    
    public boolean method7934() {
        return this.field10627.method7815();
    }
    
    public boolean method7935() {
        return this.field10627.method7814();
    }
    
    public boolean method7936() {
        return this.field10627.method7811();
    }
    
    public String method7937() {
        return this.field10627.method7809();
    }
    
    public long method7938() {
        return this.field10627.method7812();
    }
    
    public int compareTo(final Class1934 class1934) {
        return this.field10627.compareTo(class1934);
    }
    
    public long method7939() {
        return this.field10627.method7810();
    }
    
    @Override
    public int compareTo(final Class1951 class1951) {
        if (this.field10627.method7812() >= class1951.method7938()) {
            return (this.field10627.method7812() <= class1951.method7938()) ? this.field10627.method7808().compareTo(class1951.method7933()) : -1;
        }
        return 1;
    }
}
