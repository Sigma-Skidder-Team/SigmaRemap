// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import totalcross.json.JSONObject;

import java.util.Date;
import java.util.TreeMap;

public class MessageHistory {
    public TreeMap<Date, String> messages = new TreeMap<>();

    public MessageHistory() {
        System.out.println("new");
    }

    public void addMessage(Long timestamp, final String message) {
        while (this.messages.containsKey(new Date(timestamp))) {
            ++timestamp;
        }
        this.messages.put(new Date(timestamp), message);
    }

    public JSONObject toJson() {
        return new JSONObject(this.messages);
    }
}
