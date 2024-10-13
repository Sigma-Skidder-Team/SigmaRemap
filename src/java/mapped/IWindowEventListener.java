package mapped;

import totalcross.json.JSONException;

public interface IWindowEventListener {
   void setGameFocused(boolean var1);

   void updateWindowSize() throws JSONException;

   void ignoreFirstMove();
}
