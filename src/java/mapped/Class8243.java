// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class8243
{
    private static String[] field33850;
    private final int field33851;
    private final int field33852;
    private final int field33853;
    private final int field33854;
    private final int field33855;
    private final int field33856;
    private int field33857;
    private int field33858;
    private int field33859;
    private boolean field33860;
    
    public Class8243(final int field33851, final int field33852, final int field33853, final int field33854, final int field33855, final int field33856) {
        this.field33851 = field33851;
        this.field33852 = field33852;
        this.field33853 = field33853;
        this.field33854 = field33854;
        this.field33855 = field33855;
        this.field33856 = field33856;
    }
    
    public boolean method27301() {
        if (this.field33860) {
            if (this.field33857 == this.field33854) {
                if (this.field33858 == this.field33855) {
                    if (this.field33859 == this.field33856) {
                        return false;
                    }
                }
            }
            if (this.field33857 >= this.field33854) {
                if (this.field33858 >= this.field33855) {
                    if (this.field33859 < this.field33856) {
                        this.field33857 = this.field33851;
                        this.field33858 = this.field33852;
                        ++this.field33859;
                    }
                }
                else {
                    this.field33857 = this.field33851;
                    ++this.field33858;
                }
            }
            else {
                ++this.field33857;
            }
            return true;
        }
        this.field33857 = this.field33851;
        this.field33858 = this.field33852;
        this.field33859 = this.field33853;
        return this.field33860 = true;
    }
    
    public int method27302() {
        return this.field33857;
    }
    
    public int method27303() {
        return this.field33858;
    }
    
    public int method27304() {
        return this.field33859;
    }
    
    public int method27305() {
        int n = 0;
        if (this.field33857 == this.field33851 || this.field33857 == this.field33854) {
            ++n;
        }
        if (this.field33858 == this.field33852 || this.field33858 == this.field33855) {
            ++n;
        }
        if (this.field33859 == this.field33853 || this.field33859 == this.field33856) {
            ++n;
        }
        return n;
    }
}
