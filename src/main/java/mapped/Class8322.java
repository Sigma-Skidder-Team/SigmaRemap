// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class8322
{
    private Long field34186;
    private Long field34187;
    private Long field34188;
    
    public Class8322 method27702(final Class222 class222) {
        return new Class8322(this.field34186 + class222.method852(), this.field34187 + class222.method853(), this.field34188 + class222.method854());
    }
    
    public Class8322 method27703(final Class222 class222) {
        this.field34186 += (Long)class222.method852();
        this.field34187 += (Long)class222.method853();
        this.field34188 += (Long)class222.method854();
        return this;
    }
    
    public Class8322(final Long field34186, final Long field34187, final Long field34188) {
        this.field34186 = field34186;
        this.field34187 = field34187;
        this.field34188 = field34188;
    }
    
    public Long method27704() {
        return this.field34186;
    }
    
    public Long method27705() {
        return this.field34187;
    }
    
    public Long method27706() {
        return this.field34188;
    }
    
    @Override
    public String toString() {
        return "Position(x=" + this.method27704() + ", y=" + this.method27705() + ", z=" + this.method27706() + ")";
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Class8322)) {
            return false;
        }
        final Class8322 class8322 = (Class8322)o;
        if (class8322.method27707(this)) {
            final Long method27704 = this.method27704();
            final Long method27705 = class8322.method27704();
            if (method27704 != null) {
                if (!method27704.equals(method27705)) {
                    return false;
                }
            }
            else if (method27705 != null) {
                return false;
            }
            final Long method27706 = this.method27705();
            final Long method27707 = class8322.method27705();
            if (method27706 != null) {
                if (!method27706.equals(method27707)) {
                    return false;
                }
            }
            else if (method27707 != null) {
                return false;
            }
            final Long method27708 = this.method27706();
            final Long method27709 = class8322.method27706();
            if (method27708 != null) {
                if (!method27708.equals(method27709)) {
                    return false;
                }
            }
            else if (method27709 != null) {
                return false;
            }
            return true;
        }
        return false;
    }
    
    public boolean method27707(final Object o) {
        return o instanceof Class8322;
    }
    
    @Override
    public int hashCode() {
        final int n = 1;
        final Long method27704 = this.method27704();
        final int n2 = n * 59 + ((method27704 != null) ? method27704.hashCode() : 43);
        final Long method27705 = this.method27705();
        final int n3 = n2 * 59 + ((method27705 != null) ? method27705.hashCode() : 43);
        final Long method27706 = this.method27706();
        return n3 * 59 + ((method27706 != null) ? method27706.hashCode() : 43);
    }
}
