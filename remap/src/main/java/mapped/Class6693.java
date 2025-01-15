// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.jello.commands.CommandException;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public abstract class Class6693
{
    public static final Class869 field26420;
    private final String field26421;
    private final String field26422;
    private final String[] field26423;
    private List<String> field26424;
    
    public Class6693(final String field26421, final String field26422, final String... field26423) {
        this.field26424 = new ArrayList<String>();
        this.field26421 = field26421;
        this.field26422 = field26422;
        this.field26423 = field26423;
    }
    
    public String method20347() {
        return this.field26421;
    }
    
    public String method20348() {
        return this.field26422;
    }
    
    public String method20349() {
        String string = "";
        final Iterator<String> iterator = this.field26424.iterator();
        while (iterator.hasNext()) {
            string = string + "[" + iterator.next() + "] ";
        }
        return string;
    }
    
    public String[] method20350() {
        return this.field26423;
    }
    
    public void method20351(final String... array) {
        for (int length = array.length, i = 0; i < length; ++i) {
            this.field26424.add(array[i]);
        }
    }
    
    public abstract void run(final String p0, final Class8025[] p1, final Class6428 p2) throws CommandException;
    
    static {
        field26420 = Class869.method5277();
    }
}
